package net.codingme.boot.controller;

import net.codingme.boot.domain.Book;
import net.codingme.boot.domain.Resource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;
import java.util.Date;

/**
 * <p>
 * 测试thymeleaf的控制类
 *
 * @Author niujinpeng
 * @Date 2018/8/26 16:09
 */
@RequestMapping(value = "/th")
@Controller
public class ThymeleafController {

    @Autowired
    private Resource resource;

    @GetMapping(value = "/index")
    public String ftlIndex(Model model) {
        model.addAttribute("resource", resource);
        return "thymeleaf/index";
    }

    @GetMapping(value = "/book")
    public String ftlBook(Model model){
        Book book = new Book();
        book.setName("红楼梦");
        book.setAuthor("罗贯中");
        book.setPrice(10.0F);
        book.setCreateTime(new Date());
        book.setDescription("<font color='green'>这是一本好书</font>");

        Book book2 = new Book("西游记", "吴承恩", 10.00f, new Date());
        ArrayList<Book> bookList = new ArrayList<>();
        bookList.add(book);
        bookList.add(book2);

        model.addAttribute("book",book);
        model.addAttribute("bookList",bookList);

        return "thymeleaf/book";
    }

    /**
     * book会默认放回ModelAndView返回
     * @param book
     * @return
     */
    @PostMapping(value = "/postform")
    public String postForm(Book book){
        return "thymeleaf/book";
    }


    @GetMapping(value = "/post")
    public String ftlPost(Model model) {
        return "thymeleaf/post/post";
    }
}
