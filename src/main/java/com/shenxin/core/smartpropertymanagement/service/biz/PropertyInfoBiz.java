package com.shenxin.core.smartpropertymanagement.service.biz;

import com.shenxin.core.smartpropertymanagement.persist.entity.CompanyInfo;
import com.shenxin.core.smartpropertymanagement.persist.entity.CompanyInfoExample;
import com.shenxin.core.smartpropertymanagement.persist.entity.PropertyInfo;
import com.shenxin.core.smartpropertymanagement.persist.mapper.CompanyInfoMapper;
import com.shenxin.core.smartpropertymanagement.service.impl.PropertyInfoServiceImpl;
import com.shenxin.core.smartpropertymanagement.util.UserUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.util.List;

/**
 * Created by lijinzhu on 2018/6/27.
 */
@Service
public class PropertyInfoBiz {

    @Autowired
    CompanyInfoMapper companyInfoMapper;

    @Autowired
    PropertyInfoServiceImpl service;

    public CompanyInfo getCompanyInfo(String companyInfoId){
        CompanyInfoExample example = new CompanyInfoExample();
        example.createCriteria().andIdEqualTo(new BigDecimal(companyInfoId));
        List<CompanyInfo> infoLit = companyInfoMapper.selectByExample(example);
        if(!infoLit.isEmpty() && infoLit.size() > 0){
            return infoLit.get(0);
        }
        return null;
    }

    public List<PropertyInfo> getPropertyByCompanyId(BigDecimal id){
        PropertyInfo propertyInfo = new PropertyInfo();
        if(UserUtil.isNotRoot()){
            propertyInfo.setCompanyId(id);
        }
        return service.search(propertyInfo);
    }

}
