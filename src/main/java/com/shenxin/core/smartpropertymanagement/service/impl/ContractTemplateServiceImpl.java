package com.shenxin.core.smartpropertymanagement.service.impl;

import com.shenxin.core.smartpropertymanagement.domain.em.IdType;
import com.shenxin.core.smartpropertymanagement.persist.entity.ContractTemplateDAO;
import com.shenxin.core.smartpropertymanagement.persist.entity.ContractTemplateDAOExample;
import com.shenxin.core.smartpropertymanagement.persist.mapper.ContractTemplateDAOMapper;
import com.shenxin.core.smartpropertymanagement.service.IBaseService;
import com.shenxin.core.smartpropertymanagement.service.IdGenerateService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @Author: wangzhenyu
 * @Description: 研发部
 * @Date: 2018/8/9
 * @Version: V1.0
 */
@Service
public class ContractTemplateServiceImpl extends IBaseService<ContractTemplateDAO, ContractTemplateDAOExample, ContractTemplateDAOMapper> {

    @Autowired
    public ContractTemplateServiceImpl(ContractTemplateDAOMapper mapper, IdGenerateService idGenerateService) {
        super(mapper,idGenerateService, IdType.CONTRACT_TEMPLATE);
    }
}
