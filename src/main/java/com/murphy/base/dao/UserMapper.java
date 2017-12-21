package com.murphy.base.dao;

import com.murphy.base.model.User;
import org.apache.ibatis.annotations.Insert;

import java.util.List;

public interface UserMapper {
    @Insert({
        "insert into MUP_SYS_USER (ID, LOGONNAME, ",
        "DEPT, PASSWORD, ",
        "NAME, GRADE, SERIALNUMBER, ",
        "PHONE, EMAIL, MOBILEPHONE, ",
        "LEAD, POSITION, ",
        "OTHERDEPT, ACTIVATION, ",
        "CREATE_USER, CREATE_DATE, ",
        "UPDATE_USER, UPDATE_DATE, ",
        "JOBPOSITION, PHOTO, ",
        "ISSTATION, RECEICESTATE, ",
        "AREA_ID)",
        "values (#{id,jdbcType=VARCHAR}, #{logonname,jdbcType=VARCHAR}, ",
        "#{dept,jdbcType=VARCHAR}, #{password,jdbcType=VARCHAR}, ",
        "#{name,jdbcType=VARCHAR}, #{grade,jdbcType=VARCHAR}, #{serialnumber,jdbcType=VARCHAR}, ",
        "#{phone,jdbcType=VARCHAR}, #{email,jdbcType=VARCHAR}, #{mobilephone,jdbcType=VARCHAR}, ",
        "#{lead,jdbcType=VARCHAR}, #{position,jdbcType=VARCHAR}, ",
        "#{otherdept,jdbcType=VARCHAR}, #{activation,jdbcType=VARCHAR}, ",
        "#{createUser,jdbcType=VARCHAR}, #{createDate,jdbcType=TIMESTAMP}, ",
        "#{updateUser,jdbcType=VARCHAR}, #{updateDate,jdbcType=TIMESTAMP}, ",
        "#{jobposition,jdbcType=VARCHAR}, #{photo,jdbcType=VARCHAR}, ",
        "#{isstation,jdbcType=VARCHAR}, #{receicestate,jdbcType=VARCHAR}, ",
        "#{areaId,jdbcType=VARCHAR})"
    })
    int insert(User record);

    int insertSelective(User record);

    List<User> queryUserList(User record);

    User queryUserByLoginName(String loginname);
}