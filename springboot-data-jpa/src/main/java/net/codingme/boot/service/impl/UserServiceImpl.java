package net.codingme.boot.service.impl;

import net.codingme.boot.domain.User;
import net.codingme.boot.domain.repository.UserRepository;
import net.codingme.boot.enums.ResponseEnum;
import net.codingme.boot.exception.BaseException;
import net.codingme.boot.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

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

    @Autowired
    private UserRepository userRepository;

    @Override
    public void create(User user) throws Exception {
        userRepository.save(user);
    }

    @Override
    public List<User> findAll() throws Exception {
        return userRepository.findAll();
    }

    @Override
    public User login(User user) throws Exception {
        String username = user.getUsername();
        String password = user.getPassword();
        User loginUser = userRepository.findByUsernameAndPassword(username, password);
        if (loginUser == null) {
            throw new BaseException(ResponseEnum.LOGIN_FIELD);
        }
        return user;
    }
}
