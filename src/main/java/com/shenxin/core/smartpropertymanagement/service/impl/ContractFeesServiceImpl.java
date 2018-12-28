package com.shenxin.core.smartpropertymanagement.service.impl;

import com.shenxin.core.smartpropertymanagement.domain.em.IdType;
import com.shenxin.core.smartpropertymanagement.persist.entity.ContractFeesDAO;
import com.shenxin.core.smartpropertymanagement.persist.entity.ContractFeesDAOExample;
import com.shenxin.core.smartpropertymanagement.persist.entity.ContractFeesInfoExample;
import com.shenxin.core.smartpropertymanagement.persist.mapper.ContractFeesDAOMapper;
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
public class ContractFeesServiceImpl extends IBaseService<ContractFeesDAO, ContractFeesDAOExample, ContractFeesDAOMapper> {

    @Autowired
    public ContractFeesServiceImpl(ContractFeesDAOMapper mapper, IdGenerateService idGenerateService) {
        super(mapper,idGenerateService, IdType.DEFAULT);
    }

    // 通过映射的方法,添加默认排序.需要自定义排序,需要重写改方法
    @Override
    protected void addOrderClause(ContractFeesDAOExample ex){
        ex.setOrderByClause("RECEIVABLE_DATE asc");
    }
}
