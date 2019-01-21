package net.codingme.boot.service;

import net.codingme.boot.domain.Book;

import java.util.List;

/**
 * <p>
 *
 * @Author niujinpeng
 * @Date 2019/1/2114:11
 */
public interface BookService {
    
    List<Book> selectAll() throws Exception;

    Book selectByPrimaryKey(Integer id) throws Exception;
}
