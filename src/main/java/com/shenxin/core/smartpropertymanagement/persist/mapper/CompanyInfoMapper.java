package com.shenxin.core.smartpropertymanagement.persist.mapper;

import java.math.BigDecimal;
import java.util.List;

import com.shenxin.core.smartpropertymanagement.persist.BaseMapper;
import com.shenxin.core.smartpropertymanagement.persist.entity.CompanyAttachInfo;
import com.shenxin.core.smartpropertymanagement.persist.entity.CompanyInfo;
import com.shenxin.core.smartpropertymanagement.persist.entity.CompanyInfoExample;
import org.apache.ibatis.annotations.Param;

public interface CompanyInfoMapper extends BaseMapper<CompanyInfo,CompanyInfoExample>{
    int countByExample(CompanyInfoExample example);

    int deleteByExample(CompanyInfoExample example);

    int deleteByPrimaryKey(BigDecimal id);

    int insert(CompanyInfo record);

    int insertSelective(CompanyInfo record);

    List<CompanyInfo> selectByExample(CompanyInfoExample example);

    CompanyInfo selectByPrimaryKey(BigDecimal id);

    int updateByExampleSelective(@Param("record") CompanyInfo record, @Param("example") CompanyInfoExample example);

    int updateByExample(@Param("record") CompanyInfo record, @Param("example") CompanyInfoExample example);

    int updateByPrimaryKeySelective(CompanyInfo record);

    int updateByPrimaryKey(CompanyInfo record);

    int insertIntoCompanyAttach(CompanyAttachInfo companyAttachInfo);

    int selectCompanyCount();
}