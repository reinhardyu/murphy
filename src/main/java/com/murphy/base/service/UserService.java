package com.murphy.base.service;

import com.murphy.base.model.User;

/**
 * @author 杨成雨
 * @create 2017-12-17 12:18
 */
public interface UserService {

    public User getUserByLoginName(String loginName);

}
