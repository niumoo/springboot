package net.codingme.boot.controller;

import net.codingme.boot.domain.Book;
import net.codingme.boot.domain.Resource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * <p>
 * Freemarker的控制类
 *
 * @Author niujinpeng
 * @Date 2018/8/26 16:09
 */
@RequestMapping(value = "/ftl")
@Controller
public class FreemakerController {

    @Autowired
    private Resource resource;

    @GetMapping(value = "/index")
    public String ftlIndex(Model model) {
        model.addAttribute("resource", resource);
        return "freemarker/index";
    }

    @GetMapping(value = "/post")
    public String ftlPost(Model model) {
        return "freemarker/post/post";
    }
}
