package net.codingme.boot.service.impl;

import net.codingme.boot.service.UserService;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 测试server bean的加载方式
 * 1.使用@Service 注解声明
 * 2.使用XML配置通过@ImportResource 引入
 * 3.使用@Configuration 结合@Bean 的方式添加到容器
 *
 * @Service 添加到容器中
 * @Author niujinpeng
 * @Date 2018/12/27 15:59
 */

@Service
public class UserServiceImpl implements UserService {


}
