package net.codingme.starter.controller;

import net.codingme.starter.HelloService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * <p>
 *
 * @Author niujinpeng
 * @Date 2019/10/30 8:31
 */
@RestController
public class HelloController {

    @Autowired
    HelloService helloService;

    @GetMapping("/hello")
    public String sayHello(String name) {
        return helloService.sayHello(name);
    }
}
