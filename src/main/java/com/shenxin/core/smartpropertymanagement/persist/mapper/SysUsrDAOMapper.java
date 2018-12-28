package com.shenxin.core.smartpropertymanagement.persist.mapper;

import com.shenxin.core.smartpropertymanagement.persist.BaseMapper;
import com.shenxin.core.smartpropertymanagement.persist.entity.SysUsrDAO;
import com.shenxin.core.smartpropertymanagement.persist.entity.SysUsrDAOExample;

import java.math.BigDecimal;

public interface SysUsrDAOMapper  extends BaseMapper<SysUsrDAO,SysUsrDAOExample> {
    int insertSelective(SysUsrDAO sysUsrDAO);

    int resetPasswords(SysUsrDAO sysUsrDAO);

    int frozenAccount(BigDecimal userId);

    int unfreezeAccount(BigDecimal userId);
}