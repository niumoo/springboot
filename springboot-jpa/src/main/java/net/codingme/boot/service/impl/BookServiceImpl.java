package net.codingme.boot.service.impl;

import net.codingme.boot.domain.Book;
import net.codingme.boot.enums.ResultEnum;
import net.codingme.boot.exception.BaseException;
import net.codingme.boot.domain.repository.BookRepository;
import net.codingme.boot.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

/**
 * <p>
 * Book业务层实现
 *
 * @Author niujinpeng
 * @Date 2018/8/23 23:20
 */
@Service
public class BookServiceImpl implements BookService {

    @Autowired
    private BookRepository bookRepository;

    @Override
    public Page<Book> findAll(Pageable pageable) {
        Page<Book> pages = bookRepository.findAll(pageable);
        return pages;
    }

    @Override
    public Book insert(Book book) {
        return bookRepository.save(book);
    }

    @Override
    public Book update(Book book) {
        return bookRepository.save(book);
    }

    @Override
    @Transactional
    public Book delete(Integer id) {
        Book book = bookRepository.findById(id).get();
        if (true) {
            throw new BaseException(ResultEnum.BOOK_DEL_IS_NULL);
        }
        bookRepository.delete(book);
        return book;
    }

    @Override
    public Book findById(Integer id) {
        return bookRepository.findById(id).get();
    }

    @Override
    public List<Book> findByAuthor(String author) {
        return bookRepository.findByAuthor(author);
    }
}
