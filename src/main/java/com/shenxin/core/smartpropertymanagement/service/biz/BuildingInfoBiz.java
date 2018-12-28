package com.shenxin.core.smartpropertymanagement.service.biz;

import com.shenxin.core.smartpropertymanagement.persist.entity.BuildingInfo;
import com.shenxin.core.smartpropertymanagement.persist.entity.CompanyInfo;
import com.shenxin.core.smartpropertymanagement.persist.entity.CompanyInfoExample;
import com.shenxin.core.smartpropertymanagement.persist.entity.PropertyInfo;
import com.shenxin.core.smartpropertymanagement.persist.mapper.BuildingInfoMapper;
import com.shenxin.core.smartpropertymanagement.persist.mapper.CompanyInfoMapper;
import com.shenxin.core.smartpropertymanagement.service.impl.BuildingInfoServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.util.List;

/**
 * @author Lancelot cailuyuan
 * @create 2018-07-09 23:04
 * @description
 */
@Service
public class BuildingInfoBiz {
    @Autowired
    CompanyInfoMapper companyInfoMapper;
    @Autowired
    BuildingInfoMapper buildingInfoMapper;
    @Autowired
    BuildingInfoServiceImpl service;

    public CompanyInfo getCompanyInfo(String companyInfoId){
        CompanyInfoExample example = new CompanyInfoExample();
        example.createCriteria().andIdEqualTo(new BigDecimal(companyInfoId));
        List<CompanyInfo> infoLit = companyInfoMapper.selectByExample(example);
        if(!infoLit.isEmpty() && infoLit.size() > 0){
            return infoLit.get(0);
        }
        return null;
    }

    public List<PropertyInfo> selectPropertyByCompanyId(BigDecimal companyId){
        List<PropertyInfo> list = buildingInfoMapper.selectPropertyByCompanyId(companyId);
        return list;
    }

    public List<BuildingInfo> selectBuilding(BigDecimal propertyId){
        List<BuildingInfo> list =  buildingInfoMapper.selectBuilding(propertyId);
        return list;
    }

    public String selectPropertyName(BigDecimal propertyId){
        String propertyName = buildingInfoMapper.selectPropertyName(propertyId);
        return propertyName;
    }

    public List<BuildingInfo> searchByPropertyId(BigDecimal id){
        BuildingInfo buildingInfo = new BuildingInfo();
        buildingInfo.setPropertyId(id);
        return service.search(buildingInfo);
    }
}
