package com.shenxin.core.smartpropertymanagement.service.impl;

import com.shenxin.core.smartpropertymanagement.domain.em.IdType;
import com.shenxin.core.smartpropertymanagement.persist.entity.ContractAttachDAO;
import com.shenxin.core.smartpropertymanagement.persist.entity.ContractAttachDAOExample;
import com.shenxin.core.smartpropertymanagement.persist.mapper.ContractAttachDAOMapper;
import com.shenxin.core.smartpropertymanagement.service.IBaseService;
import com.shenxin.core.smartpropertymanagement.service.IdGenerateService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @Author: gaobaozong
 * @Description: 合同附件
 * @Date: Created in 2018/7/23 - 17:05
 * @Version: V1.0
 */
@Service
public class ContractAttachServiceImpl extends IBaseService<ContractAttachDAO, ContractAttachDAOExample, ContractAttachDAOMapper> {
    @Autowired
    public ContractAttachServiceImpl(ContractAttachDAOMapper mapper, IdGenerateService idGenerate) {
        super(mapper, idGenerate, IdType.DEFAULT);
    }
}
