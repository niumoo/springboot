package com.wdbyte.service.impl;

import java.util.List;

import com.wdbyte.domain.Book;
import com.wdbyte.mapper.primary.BookMapper;
import com.wdbyte.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author niujinpeng
 * @website: https://www.wdbyte.com
 * @date 2020/12/19
 */
@Service
public class BookServiceImpl implements BookService {

    @Autowired
    private BookMapper bookMapper;

    @Override
    public List<Book> selectAll() {
        return bookMapper.selectAll();
    }
}
