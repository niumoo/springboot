package net.codingme.boot.service.impl;

import net.codingme.boot.domain.Book;
import net.codingme.boot.domain.mapper.BookMapper;
import net.codingme.boot.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * <p>
 *
 * @Author niujinpeng
 * @Date 2019/1/21 14:12
 */
@Service
public class BookServiceImpl implements BookService {
    @Autowired
    private BookMapper bookMapper;

    @Override
    public List<Book> selectAll() throws Exception {
        List<Book> books = bookMapper.selectAll();
        return books;
    }

    @Override
    public Book selectByPrimaryKey(Integer id) throws Exception {
        Book book = bookMapper.selectByPrimaryKey(id);
        return book;
    }
}
