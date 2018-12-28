package com.shenxin.core.smartpropertymanagement.persist.mapper;

import com.shenxin.core.smartpropertymanagement.persist.entity.RLSysUsrRoleDAO;
import com.shenxin.core.smartpropertymanagement.persist.entity.RLSysUsrRoleDAOExample;

import java.math.BigDecimal;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface RLSysUsrRoleDAOMapper {
    int countByExample(RLSysUsrRoleDAOExample example);

    int deleteByExample(RLSysUsrRoleDAOExample example);

    int insert(RLSysUsrRoleDAO record);

    int insertSelective(RLSysUsrRoleDAO record);

    List<RLSysUsrRoleDAO> selectByExample(RLSysUsrRoleDAOExample example);

    int updateByExampleSelective(@Param("record") RLSysUsrRoleDAO record, @Param("example") RLSysUsrRoleDAOExample example);

    int updateByExample(@Param("record") RLSysUsrRoleDAO record, @Param("example") RLSysUsrRoleDAOExample example);

    int deleteUserRole(BigDecimal userId);
}