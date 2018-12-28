package com.shenxin.core.smartpropertymanagement.service.impl;

import com.shenxin.core.smartpropertymanagement.domain.em.IdType;
import com.shenxin.core.smartpropertymanagement.persist.entity.BuildingInfo;
import com.shenxin.core.smartpropertymanagement.persist.entity.BuildingInfoExample;
import com.shenxin.core.smartpropertymanagement.persist.mapper.BuildingInfoMapper;
import com.shenxin.core.smartpropertymanagement.service.IBaseService;
import com.shenxin.core.smartpropertymanagement.service.IdGenerateService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author Lancelot cailuyuan
 * @create 2018-07-09 19:57
 * @description
 */
@Slf4j
@Service
public class BuildingInfoServiceImpl extends IBaseService<BuildingInfo,BuildingInfoExample,BuildingInfoMapper>{
    @Autowired
    public BuildingInfoServiceImpl(BuildingInfoMapper mapper, IdGenerateService idGenerate) {
        super(mapper, idGenerate, IdType.BUILDING);
    }
}
