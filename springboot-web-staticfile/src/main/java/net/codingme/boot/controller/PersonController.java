package net.codingme.boot.controller;

import net.codingme.boot.domain.Person;
import net.codingme.boot.domain.Response;
import net.codingme.boot.utils.ResponseUtill;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.Date;

/**
 * <p>
 *
 * @Author niujinpeng
 * @Date 2018/12/19 17:17
 */
@RestController
public class PersonController {

    @GetMapping(value = "/person")
    public Response getPerson() {
        Person person = new Person("Darcy", 24, new Date(), Arrays.asList("java", "golang"));
        return ResponseUtill.success(person);
    }

}
