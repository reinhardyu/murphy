package com.murphy.base.service.impl;

import com.murphy.base.dao.MenuMapper;
import com.murphy.base.model.Menu;
import com.murphy.base.service.MenuService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by 31259 on 2017/12/20.
 */
@Service
public class MenuServiceImpl implements MenuService {

    @Autowired
    private MenuMapper menuMapper;

    @Override
    public int insert(Menu record) {
        return menuMapper.insert(record);
    }

    @Override
    public int insertSelective(Menu record) {
        return menuMapper.insertSelective(record);
    }

    @Override
    public List<Menu> getMenuList(Menu menu) {
        return menuMapper.getMenuList(menu);
    }

    @Override
    public List<Menu> getMenuListByType(String type) {
        return menuMapper.getMenuListByType(type);
    }
}
