package com.murphy.base.dao;

import com.murphy.base.model.UserRole;
import org.apache.ibatis.annotations.Insert;

public interface UserRoleMapper {
    @Insert({
        "insert into MUP_SYS_USER_ROLE (ID, ROLE_ID, ",
        "CREATE_USER, CREATE_DATE, ",
        "UPDATE_USER, UPDATE_DATE, ",
        "USER_ID)",
        "values (#{id,jdbcType=VARCHAR}, #{roleId,jdbcType=VARCHAR}, ",
        "#{createUser,jdbcType=VARCHAR}, #{createDate,jdbcType=TIMESTAMP}, ",
        "#{updateUser,jdbcType=VARCHAR}, #{updateDate,jdbcType=TIMESTAMP}, ",
        "#{userId,jdbcType=VARCHAR})"
    })
    int insert(UserRole record);

    int insertSelective(UserRole record);
}