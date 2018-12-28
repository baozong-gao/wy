package com.shenxin.core.smartpropertymanagement.service.impl;

import com.shenxin.core.smartpropertymanagement.domain.em.IdType;
import com.shenxin.core.smartpropertymanagement.persist.entity.CompanyInfo;
import com.shenxin.core.smartpropertymanagement.persist.entity.CompanyInfoExample;
import com.shenxin.core.smartpropertymanagement.persist.mapper.CompanyInfoMapper;
import com.shenxin.core.smartpropertymanagement.service.IBaseService;
import com.shenxin.core.smartpropertymanagement.service.IdGenerateService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;

/**
 * @author Lancelot cailuyuan
 * @create 2018-06-26 11:04
 * @description
 */
@Slf4j
@Service("companyInfoService")
public class CompanyInfoServiceImpl extends IBaseService<CompanyInfo,CompanyInfoExample,CompanyInfoMapper>{

    @Autowired
    public CompanyInfoServiceImpl(CompanyInfoMapper mapper, IdGenerateService idGenerate) {
        super(mapper, idGenerate, IdType.COMPANY);
    }

}
