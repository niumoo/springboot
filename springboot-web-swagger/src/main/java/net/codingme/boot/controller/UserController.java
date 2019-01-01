package net.codingme.boot.controller;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import lombok.extern.slf4j.Slf4j;
import net.codingme.boot.domain.Response;
import net.codingme.boot.domain.User;
import net.codingme.boot.enums.ResponseEnum;
import net.codingme.boot.service.UserService;
import net.codingme.boot.utils.ResponseUtill;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import java.util.List;

/**
 * <p>
 *
 * @Author niujinpeng
 * @Date 2018/12/19 17:17
 */

@Slf4j
@Controller
@Api(value = "用户操作接口",tags = "用户操作接口")
public class UserController {

    @Autowired
    private UserService userService;

    @ApiOperation(value = "新增用户信息")
    @PostMapping(value = "/user/create")
    @ResponseBody
    public Response create(@ApiParam @Valid User user, BindingResult bindingResult) throws Exception {
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
    @ApiOperation(value = "获取用户列表")
    public Response findAll() throws Exception {
        List<User> userList = userService.findAll();
        return ResponseUtill.success(userList);
    }


    /**
     * 登录
     * @param username
     * @param password
     * @return
     * @throws Exception
     */
    @ResponseBody
    @RequestMapping(value = "/user/login", method = {RequestMethod.POST})
    @ApiOperation(value = "用户登录")
    public Response login(@ApiParam(value = "用户名称",required = true) String username,
                          @ApiParam(value = "用户密码",required = true) String password) throws Exception {
        User login = userService.login(username,password);
        return ResponseUtill.success(login);

    }

}
