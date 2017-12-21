package com.murphy.base.dao;

import com.murphy.base.model.Dept;
import org.apache.ibatis.annotations.Insert;

public interface DeptMapper {
    @Insert({
        "insert into MUP_SYS_DEPT (ID, NAME, ",
        "PARENT_ID, CREATE_USER, ",
        "CREATE_DATE, UPDATE_USER, ",
        "UPDATE_DATE, CODE, ",
        "DESCRIPTION, EVALUATEFLAG, ",
        "DEPTLEADER, PHONE, ",
        "FAX, ISDELETE, TEAM, ",
        "ORDERNUM, HANDPHONE, ",
        "ISSENDMSG)",
        "values (#{id,jdbcType=VARCHAR}, #{name,jdbcType=VARCHAR}, ",
        "#{parentId,jdbcType=VARCHAR}, #{createUser,jdbcType=VARCHAR}, ",
        "#{createDate,jdbcType=TIMESTAMP}, #{updateUser,jdbcType=VARCHAR}, ",
        "#{updateDate,jdbcType=TIMESTAMP}, #{code,jdbcType=VARCHAR}, ",
        "#{description,jdbcType=VARCHAR}, #{evaluateflag,jdbcType=DECIMAL}, ",
        "#{deptleader,jdbcType=VARCHAR}, #{phone,jdbcType=VARCHAR}, ",
        "#{fax,jdbcType=VARCHAR}, #{isdelete,jdbcType=DECIMAL}, #{team,jdbcType=VARCHAR}, ",
        "#{ordernum,jdbcType=DECIMAL}, #{handphone,jdbcType=VARCHAR}, ",
        "#{issendmsg,jdbcType=VARCHAR})"
    })
    int insert(Dept record);

    int insertSelective(Dept record);
}