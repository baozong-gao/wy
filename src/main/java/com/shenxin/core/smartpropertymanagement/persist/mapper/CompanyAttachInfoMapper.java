package com.shenxin.core.smartpropertymanagement.persist.mapper;

import java.math.BigDecimal;
import java.util.List;

import com.shenxin.core.smartpropertymanagement.persist.BaseMapper;
import com.shenxin.core.smartpropertymanagement.persist.entity.CompanyAttachInfo;
import com.shenxin.core.smartpropertymanagement.persist.entity.CompanyAttachInfoExample;
import org.apache.ibatis.annotations.Param;

public interface CompanyAttachInfoMapper extends BaseMapper<CompanyAttachInfo,CompanyAttachInfoExample> {
    int countByExample(CompanyAttachInfoExample example);

    int deleteByExample(CompanyAttachInfoExample example);

    int deleteByPrimaryKey(BigDecimal id);

    int insert(CompanyAttachInfo record);

    int insertSelective(CompanyAttachInfo record);

    List<CompanyAttachInfo> selectByExampleWithBLOBs(CompanyAttachInfoExample example);

    List<CompanyAttachInfo> selectByExample(CompanyAttachInfoExample example);

    CompanyAttachInfo selectByPrimaryKey(BigDecimal id);

    int updateByExampleSelective(@Param("record") CompanyAttachInfo record, @Param("example") CompanyAttachInfoExample example);

    int updateByExampleWithBLOBs(@Param("record") CompanyAttachInfo record, @Param("example") CompanyAttachInfoExample example);

    int updateByExample(@Param("record") CompanyAttachInfo record, @Param("example") CompanyAttachInfoExample example);

    int updateByPrimaryKeySelective(CompanyAttachInfo record);

    int updateByPrimaryKeyWithBLOBs(CompanyAttachInfo record);

    int updateByPrimaryKey(CompanyAttachInfo record);

    List<CompanyAttachInfo> selectAttachByCompanyId(BigDecimal companyId);

    List selectCompanyById(String companyId);

    List selectCompanyAttachByCompanyId(String companyId);
}