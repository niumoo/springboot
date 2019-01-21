package net.codingme.boot.service;


import net.codingme.boot.domain.User;

import java.util.List;

/**
 * <p>
 *
 * @Author niujinpeng
 * @Date 2018/12/7 0:05
 */

public interface UserService {

    void create(User user) throws Exception;

    List<User> findAll() throws Exception;

    User login(String username, String password) throws Exception;

}
