package com.shenxin.core.smartpropertymanagement.service.impl;

import com.shenxin.core.smartpropertymanagement.domain.em.IdType;
import com.shenxin.core.smartpropertymanagement.persist.entity.ContractFeesInfo;
import com.shenxin.core.smartpropertymanagement.persist.entity.ContractFeesInfoExample;
import com.shenxin.core.smartpropertymanagement.persist.mapper.ContractFeesInfoMapper;
import com.shenxin.core.smartpropertymanagement.service.IBaseService;
import com.shenxin.core.smartpropertymanagement.service.IdGenerateService;
import org.springframework.stereotype.Service;

/**
 * @author Lancelot cailuyuan
 * @create 2018-07-19 19:42
 * @description
 */
@Service
public class ContractFeesInfoServiceImpl extends IBaseService<ContractFeesInfo,ContractFeesInfoExample,ContractFeesInfoMapper>{
    public ContractFeesInfoServiceImpl(ContractFeesInfoMapper mapper, IdGenerateService idGenerate) {
        super(mapper, idGenerate, IdType.CONTRACTFEES);
    }

    // 通过映射的方法,添加默认排序.需要自定义排序,需要重写改方法
    @Override
    protected void addOrderClause(ContractFeesInfoExample ex){
        ex.setOrderByClause("RECEIVABLE_DATE asc");
    }
}
