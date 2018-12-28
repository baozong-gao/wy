package com.shenxin.core.smartpropertymanagement.service.impl;

import com.shenxin.core.smartpropertymanagement.domain.em.IdType;
import com.shenxin.core.smartpropertymanagement.persist.entity.ContractFeeCategoryDAO;
import com.shenxin.core.smartpropertymanagement.persist.entity.ContractFeeCategoryDAOExample;
import com.shenxin.core.smartpropertymanagement.persist.mapper.ContractFeeCategoryDAOMapper;
import com.shenxin.core.smartpropertymanagement.service.IBaseService;
import com.shenxin.core.smartpropertymanagement.service.IdGenerateService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @Author: gaobaozong
 * @Description: 费用
 * @Date: Created in 2018/7/24 - 13:57
 * @Version: V1.0
 */
@Service
public class ContractFeeCategoryServiceImpl extends IBaseService<ContractFeeCategoryDAO, ContractFeeCategoryDAOExample, ContractFeeCategoryDAOMapper> {
    @Autowired
    public ContractFeeCategoryServiceImpl(ContractFeeCategoryDAOMapper mapper, IdGenerateService idGenerateService) {
        super(mapper, idGenerateService, IdType.CONTRACT_FEE_CATEGORY);
    }
}
