package net.codingme.boot.controller;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import lombok.extern.slf4j.Slf4j;
import net.codingme.boot.domain.Response;
import net.codingme.boot.domain.User;
import net.codingme.boot.enums.ResponseEnum;
import net.codingme.boot.utils.ResponseUtill;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import java.util.ArrayList;
import java.util.List;

/**
 * <p>
 * 用户操作
 *
 * @Author niujinpeng
 * @Date 2019/11/19 23:17
 */

@Slf4j
@RestController(value = "/v1")
@Api(value = "用户操作 API(v1)", tags = "用户操作接口")
public class UserController {

    @ApiOperation(value = "新增用户")
    @PostMapping(value = "/user")
    public Response create(@Valid User user, BindingResult bindingResult) throws Exception {
        if (bindingResult.hasErrors()) {
            String message = bindingResult.getFieldError().getDefaultMessage();
            log.info(message);
            return ResponseUtill.error(ResponseEnum.ERROR.getCode(), message);
        } else {
            // 新增用户信息 do something
            return ResponseUtill.success("用户[" + user.getUsername() + "]信息已新增");
        }
    }

    @ApiOperation(value = "删除用户")
    @DeleteMapping(value = "/user/{username}")
    public Response delete(@PathVariable("username")
                           @ApiParam(value = "用户名", required = true) String name) throws Exception {
        // 删除用户信息 do something
        return ResponseUtill.success("用户[" + name + "]信息已删除");
    }

    @ApiOperation(value = "修改用户")
    @PutMapping(value = "/user")
    public Response update(@Valid User user, BindingResult bindingResult) throws Exception {
        if (bindingResult.hasErrors()) {
            String message = bindingResult.getFieldError().getDefaultMessage();
            log.info(message);
            return ResponseUtill.error(ResponseEnum.ERROR.getCode(), message);
        } else {
            String username = user.getUsername();
            return ResponseUtill.success("用户[" + username + "]信息已修改");
        }
    }

    @ApiOperation(value = "获取单个用户信息", tags = "用户查询")
    @GetMapping(value = "/user/{username}")
    public Response get(@PathVariable("username")
                        @NotNull(message = "用户名称不能为空")
                        @ApiParam(value = "用户名", required = true) String username) throws Exception {
        // 查询用户信息 do something
        User user = new User();
        user.setId(10000);
        user.setUsername(username);
        user.setAge(99);
        user.setSkills("cnp");
        return ResponseUtill.success(user);
    }

    @ApiOperation(value = "获取用户列表", tags = "用户查询")
    @GetMapping(value = "/user")
    public Response selectAll() throws Exception {
        // 查询用户信息列表 do something
        User user = new User();
        user.setId(10000);
        user.setUsername("未读代码");
        user.setAge(99);
        user.setSkills("cnp");
        List<User> userList = new ArrayList<>();
        userList.add(user);
        return ResponseUtill.success(userList);
    }

}
