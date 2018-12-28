package com.shenxin.core.smartpropertymanagement.service.impl;

import com.shenxin.core.smartpropertymanagement.domain.em.IdType;
import com.shenxin.core.smartpropertymanagement.persist.entity.ContractInfo;
import com.shenxin.core.smartpropertymanagement.persist.entity.ContractInfoExample;
import com.shenxin.core.smartpropertymanagement.persist.mapper.ContractInfoMapper;
import com.shenxin.core.smartpropertymanagement.service.IBaseService;
import com.shenxin.core.smartpropertymanagement.service.IdGenerateService;
import org.springframework.stereotype.Service;

/**
 * @author Lancelot cailuyuan
 * @create 2018-07-30 11:02
 * @description 居民住宅合同
 */
@Service
public class ContractResidenceServiceImpl extends IBaseService<ContractInfo,ContractInfoExample,ContractInfoMapper>{
    public ContractResidenceServiceImpl(ContractInfoMapper mapper, IdGenerateService idGenerate) {
        super(mapper, idGenerate, IdType.CONTRACTINFO);
    }
}
