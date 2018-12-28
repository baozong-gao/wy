package com.shenxin.core.smartpropertymanagement.persist.mapper;

import com.shenxin.core.smartpropertymanagement.persist.BaseMapper;
import com.shenxin.core.smartpropertymanagement.persist.entity.ClientAccountInfo;
import com.shenxin.core.smartpropertymanagement.persist.entity.ClientInfo;
import com.shenxin.core.smartpropertymanagement.persist.entity.ClientInfoExample;
import java.math.BigDecimal;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ClientInfoMapper extends BaseMapper<ClientInfo,ClientInfoExample>{
    int countByExample(ClientInfoExample example);

    int deleteByExample(ClientInfoExample example);

    int deleteByPrimaryKey(BigDecimal id);

    int insert(ClientInfo record);

    int insertSelective(ClientInfo record);

    List<ClientInfo> selectByExample(ClientInfoExample example);

    ClientInfo selectByPrimaryKey(BigDecimal id);

    int updateByExampleSelective(@Param("record") ClientInfo record, @Param("example") ClientInfoExample example);

    int updateByExample(@Param("record") ClientInfo record, @Param("example") ClientInfoExample example);

    int updateByPrimaryKeySelective(ClientInfo record);

    int updateByPrimaryKey(ClientInfo record);

    int insertClient(ClientInfo clientInfo);

    int insertClinentAccount(ClientAccountInfo clientAccountInfo);

    int insertClientPrivate(ClientInfo clientInfo);

    int insertClinentAccountPrivate(ClientAccountInfo clientAccountInfo);

    ClientAccountInfo selectClientAccount(BigDecimal clientId);

    int updateClientAccountInfo(ClientAccountInfo clientAccountInfo);
}