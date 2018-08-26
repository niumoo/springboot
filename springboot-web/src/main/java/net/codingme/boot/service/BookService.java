package net.codingme.boot.service;

import net.codingme.boot.domain.Book;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;

import java.util.List;

/**
 * <p>
 * Book 业务接口
 *
 * @Author niujinpeng
 * @Date 2018/8/23 23:17
 */
public interface BookService {

    /**
     * 获取所有Book
     */
    public Page<Book> findAll(Pageable pageable);

    /**
     * 新增书籍
     */
    public Book insert(Book book);

    /**
     * 更新书籍
     */
    public Book update(Book book);

    /**
     * 删除书籍
     */
    public Book delete(Integer id);

    /**
     * 获取书籍-ID
     */
    public Book findById(Integer id);

    /**
     * 获取书籍-作者
     */
    public List<Book> findByAuthor(String author);

}

