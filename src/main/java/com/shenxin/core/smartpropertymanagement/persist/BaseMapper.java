package com.shenxin.core.smartpropertymanagement.persist;

import org.apache.ibatis.annotations.Param;

import java.math.BigDecimal;
import java.util.List;

/**
 * @Author: gaobaozong
 * @Description: 基础mapper类
 * @Date: Created in 2018/6/13 - 11:18
 * @Version: V1.0
 */
public interface BaseMapper<D,E> {

    int countByExample(E example);

    int deleteByExample(E example);

    int deleteByPrimaryKey(BigDecimal id);

    int insert(D record);

    int insertSelective(D record);

    List<D> selectByExample(E example);

    D selectByPrimaryKey(BigDecimal id);

    int updateByExampleSelective(@Param("record") D record, @Param("example") E example);

    int updateByExample(@Param("record") D record, @Param("example") E example);

    int updateByPrimaryKeySelective(D record);

    int updateByPrimaryKey(D record);
}
