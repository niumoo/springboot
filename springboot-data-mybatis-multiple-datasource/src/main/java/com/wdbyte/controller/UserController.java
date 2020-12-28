package com.wdbyte.controller;

import java.util.List;

import com.wdbyte.domain.Response;
import com.wdbyte.domain.User;
import com.wdbyte.service.UserService;
import com.wdbyte.utils.ResponseUtill;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * <p>
 *
 * @Author niujinpeng
 * @Date 2018/12/19 17:17
 */
@RestController
public class UserController {

    @Autowired
    private UserService userService;

    @ResponseBody
    @GetMapping(value = "/users")
    public Response selectAll() {
        List<User> userList = userService.selectAll();
        return ResponseUtill.success(userList);
    }
}
