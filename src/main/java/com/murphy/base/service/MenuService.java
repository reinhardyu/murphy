package com.murphy.base.service;

import com.murphy.base.model.Menu;

import java.util.List;

/**
 * Created by 31259 on 2017/12/20.
 */
public interface MenuService {
    int insert(Menu record);

    int insertSelective(Menu record);

    List<Menu> getMenuList(Menu menu);

    List<Menu> getMenuListByType(String type);
}
