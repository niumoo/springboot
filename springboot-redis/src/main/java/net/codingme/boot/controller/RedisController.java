package net.codingme.boot.controller;

import net.codingme.boot.domain.Result;
import net.codingme.boot.utils.RedisOperator;
import net.codingme.boot.utils.ResultUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * <p>
 * Redis测试
 *
 * @Author niujinpeng
 * @Date 2018/9/1 17:32
 */
@RestController
@RequestMapping(value = "/redis")
public class RedisController {

    @Autowired
    private StringRedisTemplate strRedis;

    @Autowired
    private RedisOperator redisOperator;

    @RequestMapping(value = "/test")
    public Result test() {
        strRedis.opsForValue().set("spring-cache", "spring boot");
        String value = strRedis.opsForValue().get("spring-cache");
        return ResultUtil.success(value);
    }

    /**
     * 使用redis工具类简化操作
     * @return
     */
    @RequestMapping(value = "/test2")
    public Result test2() {
        redisOperator.set("spring-cache2", "spring boot2");
        String value = redisOperator.get("spring-cache2");
        return ResultUtil.success(value);
    }
}
