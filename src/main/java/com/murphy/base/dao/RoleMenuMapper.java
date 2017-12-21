package com.murphy.base.dao;

import com.murphy.base.model.RoleMenu;
import org.apache.ibatis.annotations.Insert;

public interface RoleMenuMapper {
    @Insert({
        "insert into MUP_SYS_ROLE_MENU (ID, ROLE_ID, ",
        "AUTHORITY_ID)",
        "values (#{id,jdbcType=VARCHAR}, #{roleId,jdbcType=VARCHAR}, ",
        "#{authorityId,jdbcType=VARCHAR})"
    })
    int insert(RoleMenu record);

    int insertSelective(RoleMenu record);
}