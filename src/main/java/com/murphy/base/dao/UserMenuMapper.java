package com.murphy.base.dao;

import com.murphy.base.model.UserMenu;
import org.apache.ibatis.annotations.Insert;

public interface UserMenuMapper {
    @Insert({
        "insert into MUP_SYS_USER_MENU (ID, USER_ID, ",
        "AUTHORITY_ID)",
        "values (#{id,jdbcType=VARCHAR}, #{userId,jdbcType=VARCHAR}, ",
        "#{authorityId,jdbcType=VARCHAR})"
    })
    int insert(UserMenu record);

    int insertSelective(UserMenu record);
}