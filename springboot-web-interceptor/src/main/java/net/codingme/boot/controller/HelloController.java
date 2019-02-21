package net.codingme.boot.controller;

import lombok.extern.slf4j.Slf4j;
import net.codingme.boot.domain.Response;
import net.codingme.boot.utils.ResponseUtill;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * <p>
 * 测试控制器
 *
 * @Author niujinpeng
 * @Date 2018/12/4 14:41
 */
@Slf4j
@RestController
public class HelloController {

    @Value("${bootapp.description}")
    private String description;

    @RequestMapping("/")
    public String index() {
        return "Greetings from Spring Boot!" + description;
    }

    @RequestMapping(value = "/er")
    @ResponseBody
    public Response error(Integer num) throws Exception {
        num = num / num;
        return ResponseUtill.success(num);
    }

}
