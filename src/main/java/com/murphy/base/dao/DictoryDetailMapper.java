package com.murphy.base.dao;

import com.murphy.base.model.DictoryDetail;
import org.apache.ibatis.annotations.Insert;

public interface DictoryDetailMapper {
    @Insert({
        "insert into MUP_SYS_DICTORYDETAIL (ID, TYPEID, ",
        "DICTNAME, DICTTYPE, ",
        "DICTLEVEL, DICTORDER, ",
        "DICTMEMO, ISEGC)",
        "values (#{id,jdbcType=VARCHAR}, #{typeid,jdbcType=VARCHAR}, ",
        "#{dictname,jdbcType=VARCHAR}, #{dicttype,jdbcType=VARCHAR}, ",
        "#{dictlevel,jdbcType=VARCHAR}, #{dictorder,jdbcType=VARCHAR}, ",
        "#{dictmemo,jdbcType=VARCHAR}, #{isegc,jdbcType=VARCHAR})"
    })
    int insert(DictoryDetail record);

    int insertSelective(DictoryDetail record);
}