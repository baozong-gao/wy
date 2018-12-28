package com.shenxin.core.smartpropertymanagement.service.impl;

import com.shenxin.core.smartpropertymanagement.domain.em.IdType;
import com.shenxin.core.smartpropertymanagement.persist.entity.ContractRoomLiver;
import com.shenxin.core.smartpropertymanagement.persist.entity.ContractRoomLiverExample;
import com.shenxin.core.smartpropertymanagement.persist.mapper.ContractRoomLiverMapper;
import com.shenxin.core.smartpropertymanagement.service.IBaseService;
import com.shenxin.core.smartpropertymanagement.service.IdGenerateService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @Author: gaobaozong
 * @Description: 帐单计划
 * @Date: Created in 2018/7/24 - 10:08
 * @Version: V1.0
 */
@Service
public class ContractRoomLiverServiceImpl extends IBaseService<ContractRoomLiver, ContractRoomLiverExample, ContractRoomLiverMapper> {

    @Autowired
    public ContractRoomLiverServiceImpl(ContractRoomLiverMapper mapper, IdGenerateService idGenerateService) {
        super(mapper,idGenerateService, IdType.DEFAULT);
    }
}
