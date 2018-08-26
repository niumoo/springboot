package net.codingme.boot;

import net.codingme.boot.domain.Book;
import net.codingme.boot.service.BookService;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * Service层单元测试
 * @Author DarcyNiu
 * @date 2018/4/7 23:28
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class BookServiceTest {

    @Autowired
    private BookService bookService;

    @Test
    public void testFindById() throws Exception {
        Book book = bookService.findById(1);
        System.out.println(book.toString());
    }
}