package com.murphy.base.dao.impl;

import com.murphy.base.dao.MenuMapper;
import com.murphy.base.model.Menu;
import com.murphy.utils.AbstractBaseDao;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @author 杨成雨
 * @create 2017-12-20 17:45
 */
@Repository
public class MenuMapperImpl extends AbstractBaseDao implements MenuMapper{
    @Override
    public int insert(Menu record) {
        return getSqlSession().insert("com.murphy.base.dao.MenuMapper.insertSelective",record);
    }

    @Override
    public int insertSelective(Menu record) {
        return 0;
    }

    @Override
    public List<Menu> getMenuList(Menu menu) {
        return getSqlSession().selectList("com.murphy.base.dao.MenuMapper.getMenuList",menu);
    }

    @Override
    public List<Menu> getMenuListByType(String type) {
        return getSqlSession().selectList("com.murphy.base.dao.MenuMapper.getMenuListByType",type);
    }
}
