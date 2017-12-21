package com.murphy.base.service.impl;

import com.murphy.base.dao.UserMapper;
import com.murphy.base.model.User;
import com.murphy.base.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author 杨成雨
 * @create 2017-12-17 12:20
 */
@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserMapper userMapper;

    @Override
    public User getUserByLoginName(String loginName) {
        return userMapper.queryUserByLoginName(loginName);
    }
}
