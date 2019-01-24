package net.codingme.boot.controller;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import net.codingme.boot.domain.Book;
import net.codingme.boot.domain.Response;
import net.codingme.boot.service.BookService;
import net.codingme.boot.utils.ResponseUtill;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * <p>
 *
 * @Author niujinpeng
 * @Date 2019/1/21 14:16
 */
@RestController
@RequestMapping("/book")
@Api(value = "Mybatis 书籍操作接口", tags = "Mybatis 书籍操作接口")
public class BookController {

    @Autowired
    private BookService bookService;

    @GetMapping(value = "/list")
    @ApiOperation(value = "查询所有书籍信息")
    public Response selectAll() throws Exception {
        List<Book> books = bookService.selectAll();
        return ResponseUtill.success(books);
    }

    @GetMapping(value = "/author")
    @ApiOperation(value = "根据作者查询书籍信息")
    public Response selectByAuthor(String author) throws Exception {
        List<Book> books = bookService.selectByAuthor(author);
        return ResponseUtill.success(books);
    }

}
