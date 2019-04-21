package net.codingme.https.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * <p>
 * Https 接口控制类
 *
 * @Author niujinpeng
 * @Date 2019/4/20 22:59
 */
@RestController
public class HttpsController {

    @GetMapping(value = "/hello")
    public String hello() {
        return "Hello HTTPS";
    }

}
