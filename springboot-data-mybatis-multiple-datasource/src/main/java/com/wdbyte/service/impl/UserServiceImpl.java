package com.wdbyte.service.impl;

import java.util.List;

import com.wdbyte.domain.User;
import com.wdbyte.mapper.datasource2.UserMapper;
import com.wdbyte.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author niujinpeng
 * @website: https://www.wdbyte.com
 * @date 2020/12/19
 */
@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserMapper userMapper;

    @Override
    public List<User> selectAll() {
        return userMapper.selectAll();
    }
}
