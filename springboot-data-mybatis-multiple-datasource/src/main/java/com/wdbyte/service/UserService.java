package com.wdbyte.service;

import java.util.List;

import com.wdbyte.domain.User;

/**
 * @author niujinpeng
 * @website: https://www.wdbyte.com
 * @date 2020/12/19
 */
public interface UserService {

    List<User> selectAll();
}
