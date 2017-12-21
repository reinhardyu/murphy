package com.murphy.base.dao;

import com.murphy.base.model.Role;
import org.apache.ibatis.annotations.Insert;

public interface RoleMapper {
    @Insert({
        "insert into MUP_SYS_ROLE (ID, NAME, ",
        "CREATE_USER, CREATE_DATE, ",
        "UPDATE_USER, UPDATE_DATE, ",
        "DESCRIPTION)",
        "values (#{id,jdbcType=VARCHAR}, #{name,jdbcType=VARCHAR}, ",
        "#{createUser,jdbcType=VARCHAR}, #{createDate,jdbcType=TIMESTAMP}, ",
        "#{updateUser,jdbcType=VARCHAR}, #{updateDate,jdbcType=TIMESTAMP}, ",
        "#{description,jdbcType=VARCHAR})"
    })
    int insert(Role record);

    int insertSelective(Role record);
}