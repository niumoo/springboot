package net.codingme.boot.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * <p>
 *
 * @Author niujinpeng
 * @Date 2018/8/23 22:31
 */

@RestController
public class IndexController {
    
    @RequestMapping("/springboot")
    public String springboot() {
        return "Hello Spring boot!";
    }

}
