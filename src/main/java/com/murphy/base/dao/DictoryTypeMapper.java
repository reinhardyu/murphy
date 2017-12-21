package com.murphy.base.dao;

import com.murphy.base.model.DictoryType;
import org.apache.ibatis.annotations.Insert;

public interface DictoryTypeMapper {
    @Insert({
        "insert into MUP_SYS_DICTORYTYPE (ID, DICTNAME, ",
        "DICTCODE)",
        "values (#{id,jdbcType=VARCHAR}, #{dictname,jdbcType=VARCHAR}, ",
        "#{dictcode,jdbcType=VARCHAR})"
    })
    int insert(DictoryType record);

    int insertSelective(DictoryType record);
}