package com.shenxin.core.smartpropertymanagement.service.impl;

import com.shenxin.core.smartpropertymanagement.domain.em.IdType;
import com.shenxin.core.smartpropertymanagement.persist.entity.PropertyInfo;
import com.shenxin.core.smartpropertymanagement.persist.entity.PropertyInfoExample;
import com.shenxin.core.smartpropertymanagement.persist.mapper.PropertyInfoMapper;
import com.shenxin.core.smartpropertymanagement.service.IBaseService;
import com.shenxin.core.smartpropertymanagement.service.IdGenerateService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by lijinzhu on 2018/6/14.
 */
@Slf4j
@Service("propertyInfoService")
public class PropertyInfoServiceImpl extends IBaseService<PropertyInfo,PropertyInfoExample,PropertyInfoMapper> {


    @Autowired
    public PropertyInfoServiceImpl(PropertyInfoMapper mapper, IdGenerateService idGenerateService){
        super(mapper, idGenerateService, IdType.DEFAULT);
    }

}
