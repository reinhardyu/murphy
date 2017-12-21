package com.murphy.test;

import com.murphy.base.dao.MenuMapper;
import com.murphy.base.dao.UserMapper;
import com.murphy.base.model.Menu;
import com.murphy.base.model.User;
import com.murphy.utils.Base64Encoder;
import com.murphy.utils.MD5;
import org.junit.Test;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * ${DESCRIPTION}
 *
 * @author 杨成雨
 * @create 2017-08-07 10:15
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations ={"/springMVC.xml"})
public class Test1 {

    @Autowired
    private UserMapper userMapper;

    @Test
    public void nine() {
        User user = new User();
        user.setPhone("123");
        user.setLoginname("admin");
        user.setPassword(MD5.createPassword("1"));
        int i = userMapper.insertSelective(user);
        System.out.println(i);
    }
    @Test
    public void getUser(){
        User user = userMapper.queryUserByLoginName("admin");
        System.out.println(user.getPassword());
    }
    @Test
    public void decode(){
        System.out.println(Base64Encoder.decodeToString("123"));
    }
    @Test
    public void md5(){
        System.out.println(MD5.createPassword("1"));
        System.out.println(Base64Encoder.decodeToString("1"));
    }

    @Autowired
    private MenuMapper menuMapper;

    @Test
    public void menu(){
        Menu menu = new Menu();
        menu.setName("菜单管理");
        menu.setHrefUrl("/menu/list");
        menu.setType("menu");
        menu.setParentId("A0FF248124674DFA8C64990435C8C72D");
        menu.setOrdernum(1);
        int i = menuMapper.insert(menu);
        System.out.println(i);
    }






}
