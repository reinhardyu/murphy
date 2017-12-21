package com.murphy.base.dao;

import com.murphy.base.model.Menu;
import org.apache.ibatis.annotations.Insert;

import java.util.List;

public interface MenuMapper {
    @Insert({
        "insert into MUP_SYS_MENU (ID, NAME, ",
        "TYPE, HREF_URL, PARENT_ID, ",
        "CREATE_USER, CREATE_DATE, ",
        "UPDATE_USER, UPDATE_DATE, ",
        "REMARK, SHOWNUM, ",
        "ORDERNUM, ALIAS_NAME)",
        "values (#{id,jdbcType=VARCHAR}, #{name,jdbcType=VARCHAR}, ",
        "#{type,jdbcType=VARCHAR}, #{hrefUrl,jdbcType=VARCHAR}, #{parentId,jdbcType=VARCHAR}, ",
        "#{createUser,jdbcType=VARCHAR}, #{createDate,jdbcType=TIMESTAMP}, ",
        "#{updateUser,jdbcType=VARCHAR}, #{updateDate,jdbcType=TIMESTAMP}, ",
        "#{remark,jdbcType=VARCHAR}, #{shownum,jdbcType=VARCHAR}, ",
        "#{ordernum,jdbcType=DECIMAL}, #{aliasName,jdbcType=VARCHAR})"
    })
    int insert(Menu record);

    int insertSelective(Menu record);

    List<Menu> getMenuList(Menu menu);

    List<Menu> getMenuListByType(String type);
}