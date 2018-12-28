package com.shenxin.core.smartpropertymanagement.service.impl;

import com.shenxin.core.smartpropertymanagement.domain.em.IdType;
import com.shenxin.core.smartpropertymanagement.persist.entity.ContractFeeAccountingLogDAO;
import com.shenxin.core.smartpropertymanagement.persist.entity.ContractFeeAccountingLogDAOExample;
import com.shenxin.core.smartpropertymanagement.persist.mapper.ContractFeeAccountingLogDAOMapper;
import com.shenxin.core.smartpropertymanagement.service.IBaseService;
import com.shenxin.core.smartpropertymanagement.service.IdGenerateService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

/**
 * @author Lancelot cailuyuan
 * @create 2018-08-28 14:49
 * @description
 */
@Service
@Slf4j
public class ContractFeeAccountingLogServiceImpl extends IBaseService<ContractFeeAccountingLogDAO,ContractFeeAccountingLogDAOExample,ContractFeeAccountingLogDAOMapper>{
    public ContractFeeAccountingLogServiceImpl(ContractFeeAccountingLogDAOMapper mapper, IdGenerateService idGenerate) {
        super(mapper, idGenerate, IdType.CONTRACT_FEE_ACCOUNTING_LOG);
    }
}
