package com.wdbyte.controller;

import java.util.List;

import com.wdbyte.domain.Book;
import com.wdbyte.service.BookService;
import com.wdbyte.domain.Response;
import com.wdbyte.utils.ResponseUtill;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * <p>
 *
 * @Author niujinpeng
 * @Date 2019/1/21 14:16
 */
@RestController
public class BookController {

    @Autowired
    private BookService bookService;

    @GetMapping(value = "/books")
    public Response selectAll() throws Exception {
        List<Book> books = bookService.selectAll();
        return ResponseUtill.success(books);
    }
}
