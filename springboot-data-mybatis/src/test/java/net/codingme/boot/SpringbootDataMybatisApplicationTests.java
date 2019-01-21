package net.codingme.boot;

import com.alibaba.fastjson.JSON;
import net.codingme.boot.domain.Book;
import net.codingme.boot.service.BookService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.sql.DataSource;
import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
public class SpringbootDataMybatisApplicationTests {

    @Autowired
    private DataSource dataSource;

    @Autowired
    private BookService bookService;

    @Test
    public void contextLoads() {
        System.out.println(dataSource.getClass());
    }

    @Test
    public void testBook() throws Exception {
        List<Book> books = bookService.selectAll();
        System.out.println(JSON.toJSONString(books));
    }

}

