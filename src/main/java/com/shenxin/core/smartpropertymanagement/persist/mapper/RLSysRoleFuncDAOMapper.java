package com.shenxin.core.smartpropertymanagement.persist.mapper;

import com.shenxin.core.smartpropertymanagement.persist.entity.RLSysRoleFuncDAO;
import com.shenxin.core.smartpropertymanagement.persist.entity.RLSysRoleFuncDAOExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface RLSysRoleFuncDAOMapper{
    int countByExample(RLSysRoleFuncDAOExample example);

    int deleteByExample(RLSysRoleFuncDAOExample example);

    int insert(RLSysRoleFuncDAO record);

    int insertSelective(RLSysRoleFuncDAO record);

    List<RLSysRoleFuncDAO> selectByExample(RLSysRoleFuncDAOExample example);

    int updateByExampleSelective(@Param("record") RLSysRoleFuncDAO record, @Param("example") RLSysRoleFuncDAOExample example);

    int updateByExample(@Param("record") RLSysRoleFuncDAO record, @Param("example") RLSysRoleFuncDAOExample example);
}