package com.murphy.base.dao.impl;

import com.murphy.base.dao.UserMapper;
import com.murphy.base.model.User;
import com.murphy.utils.AbstractBaseDao;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @author 杨成雨
 * @create 2017-12-15 18:48
 */
@Repository
public class UserMapperImpl extends AbstractBaseDao implements UserMapper {

    @Override
    public int insert(User record) {
        return getSqlSession().insert("UserMapper_.insertSelective",record);
    }

    @Override
    public int insertSelective(User record) {
        return getSqlSession().insert("UserMapper_.insertSelective",record);
    }

    @Override
    public List<User> queryUserList(User record) {
        return getSqlSession().selectList("UserMapper_.getUserList",record);
    }

    @Override
    public User queryUserByLoginName(String loginname) {
        return getSqlSession().selectOne("UserMapper_.getUserByLoginName",loginname);
    }
}
