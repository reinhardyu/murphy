package com.murphy.base.dao;

import com.murphy.base.model.DeptMenu;
import org.apache.ibatis.annotations.Insert;

public interface DeptMenuMapper {
    @Insert({
        "insert into MUP_SYS_DEPT_MENU (DEPT_ID, AUTHORITY_ID)",
        "values (#{deptId,jdbcType=VARCHAR}, #{authorityId,jdbcType=VARCHAR})"
    })
    int insert(DeptMenu record);

    int insertSelective(DeptMenu record);
}