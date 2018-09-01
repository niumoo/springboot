package net.codingme.boot.controller;

import lombok.extern.slf4j.Slf4j;
import net.codingme.boot.domain.Book;
import net.codingme.boot.domain.Result;
import net.codingme.boot.service.BookService;
import net.codingme.boot.utils.ResultUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;
import java.util.List;

/**
 * <p>
 * Mybatis
 * Book的控制器实现
 *
 * @Author niujinpeng
 * @Date 2018/9/1 9:41
 */
@Slf4j
@RestController
@RequestMapping(value = "/book")
public class BookController {

    @Autowired
    private BookService bookService;

    @RequestMapping(value = "/save")
    public Result saveBook() throws Exception {
        Book book = new Book();
        book.setName("笑傲江湖" + System.currentTimeMillis());
        book.setAuthor("金庸" + System.currentTimeMillis());
        book.setPrice(30.00F);
        book.setCreateTime(new Date());
        book.setDescription("是作家金庸创作的一部长篇武侠小说" + System.currentTimeMillis());
        bookService.saveBook(book);
        return ResultUtil.success("save success");
    }

    /**
     * 事务的测试
     *
     * @return
     * @throws Exception
     */
    @RequestMapping(value = "/savet")
    public Result saveUserTransactional() throws Exception {
        Book book = new Book();
        book.setName("笑傲江湖" + System.currentTimeMillis());
        book.setAuthor("金庸" + System.currentTimeMillis());
        book.setPrice(30.00F);
        book.setCreateTime(new Date());
        book.setDescription("是作家金庸创作的一部长篇武侠小说" + System.currentTimeMillis());
        bookService.saveUserTransactional(book);
        return ResultUtil.success("save success");
    }

    @RequestMapping(value = "/update")
    public Result updateBook() throws Exception {
        Book book = new Book();
        book.setId(7);
        book.setName("三国演义" + System.currentTimeMillis());
        book.setAuthor("罗贯中" + System.currentTimeMillis());
        book.setPrice(20.00F);
        book.setCreateTime(new Date());
        book.setDescription("是罗贯中创作的一部小说" + System.currentTimeMillis());
        bookService.updateBook(book);
        return ResultUtil.success("update success");
    }

    @RequestMapping(value = "/page")
    public Result selectByPage(@RequestParam(defaultValue = "0", name = "page") Integer page) {
        Book book = new Book();
        Integer pageSize = 5;
        List<Book> books = bookService.queryBookListPaged(book, page, pageSize);
        return ResultUtil.success(books);
    }

    /**
     * 自定义查询-根据ID查询book信息
     *
     * @param id
     * @return
     */
    @RequestMapping(value = "/id")
    public Result selectBookById(Integer id) {
        List<Book> books = bookService.selectBookById(id);
        return ResultUtil.success(books);
    }

}
