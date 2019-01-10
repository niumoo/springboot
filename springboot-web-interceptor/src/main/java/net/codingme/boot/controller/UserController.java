package net.codingme.boot.controller;

import net.codingme.boot.domain.Response;
import net.codingme.boot.domain.User;
import net.codingme.boot.utils.ResponseUtill;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;

/**
 * <p>
 *
 * @Author niujinpeng
 * @Date 2018/12/19 17:17
 */

@Controller
public class UserController {

    @GetMapping(value = "/user")
    @ResponseBody
    public Response getUser() {
        User user = new User("Darcy", "password", 24, new Date(), Arrays.asList("java", "golang"));
        return ResponseUtill.success(user);
    }


    /**
     * 登录
     *
     * @param username
     * @param password
     * @param model
     * @return
     */
    @RequestMapping(value = "/user/login", method = {RequestMethod.POST, RequestMethod.GET})
    public String login(String username, String password, Model model) {
        if (!StringUtils.isEmpty(username) && username.equals(password)) {
            model.addAttribute("username", username);
            return "main";
        }
        model.addAttribute("tips", "你的用户名或者密码有误");
        return "login";
    }

    /**
     * 获取ID为1的用户信息
     *
     * @return
     */
    @GetMapping(value = "/user/1")
    public String getUserById(Model model) {
        User user1 = new User("Darcy", "password", 24, new Date(), Arrays.asList("Java", "GoLang"));
        User user2 = new User("Chris", "password", 22, new Date(), Arrays.asList("Java", "Web"));
        ArrayList<User> userList = new ArrayList<>();
        userList.add(user1);
        userList.add(user2);
        model.addAttribute("userList", userList);
        model.addAttribute("user", user1);
        return "user";
    }


}
