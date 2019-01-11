package net.codingme.boot.controller;

import javafx.scene.chart.ValueAxis;
import lombok.extern.slf4j.Slf4j;
import net.codingme.boot.domain.Response;
import net.codingme.boot.domain.User;
import net.codingme.boot.domain.repository.UserRepository;
import net.codingme.boot.enums.ResponseEnum;
import net.codingme.boot.service.UserService;
import net.codingme.boot.utils.ResponseUtill;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Required;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.util.StringUtils;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * <p>
 *
 * @Author niujinpeng
 * @Date 2018/12/19 17:17
 */

@Slf4j
@Controller
public class UserController {

    @Autowired
    private UserService userService;

    @PostMapping(value = "/user/create")
    @ResponseBody
    public Response create(@Valid User user, BindingResult bindingResult) throws Exception {
        if (bindingResult.hasErrors()) {
            String message = bindingResult.getFieldError().getDefaultMessage();
            log.info(message);
            return ResponseUtill.error(ResponseEnum.ERROR, message);
        } else {
            userService.create(user);
            return ResponseUtill.success();
        }
    }

    @ResponseBody
    @GetMapping(value = "/user/list")
    public Response findAll() throws Exception {
        List<User> userList = userService.findAll();
        return ResponseUtill.success(userList);
    }

    /**
     * 登录
     *
     * @param user
     * @param bindingResult
     * @return
     */
    @ResponseBody
    @RequestMapping(value = "/user/login", method = {RequestMethod.POST, RequestMethod.GET})
    public Response login(@Valid User user, BindingResult bindingResult) throws Exception {
        if (bindingResult.hasErrors()) {
            String message = bindingResult.getFieldError().getDefaultMessage();
            return ResponseUtill.error(ResponseEnum.ERROR, message);
        }
        User login = userService.login(user);
        return ResponseUtill.success(user);

    }

}
