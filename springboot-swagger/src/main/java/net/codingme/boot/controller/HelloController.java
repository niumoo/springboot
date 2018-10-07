package net.codingme.boot.controller;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.*;

/**
 * <p>
 *
 * @Author niujinpeng
 * @Date 2018/8/23 22:31
 */

@Api(value = "HelloController", description = "spring测试接口")
@RequestMapping(value = "/spring")
@RestController
public class HelloController {


    /**
     * 取请求路径中的值
     *
     * @param name
     * @return
     */
    @ApiOperation(value = "获取姓名",notes = "获取姓名接口")
    @RequestMapping(value = "/name/{name}", method = RequestMethod.GET)
    public String showName(@PathVariable("name") String name) {
        return "name:" + name;
    }

    /**
     * required = false 不是必要参数
     * defaultValue 默认值
     *
     * @param version
     * @return
     */
    @ApiOperation(value = "获取版本",notes = "获取版本接口")
    @GetMapping(value = "/version")
    public String getName(@RequestParam(value = "version", required = false, defaultValue = "2.0") String version) {
        return "version:" + version;
    }


}
