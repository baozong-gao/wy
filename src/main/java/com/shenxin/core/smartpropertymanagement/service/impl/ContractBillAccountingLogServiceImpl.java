package com.shenxin.core.smartpropertymanagement.service.impl;


import com.shenxin.core.smartpropertymanagement.domain.em.IdType;
import com.shenxin.core.smartpropertymanagement.persist.entity.ContractBillAccountingLogDAO;
import com.shenxin.core.smartpropertymanagement.persist.entity.ContractBillAccountingLogDAOExample;
import com.shenxin.core.smartpropertymanagement.persist.mapper.ContractBillAccountingLogDAOMapper;
import com.shenxin.core.smartpropertymanagement.service.IBaseService;
import com.shenxin.core.smartpropertymanagement.service.IdGenerateService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;

/**
 * @author Lancelot cailuyuan
 * @create 2018-08-29 14:28
 * @description
 */
@Service
@Slf4j
public class ContractBillAccountingLogServiceImpl extends IBaseService<ContractBillAccountingLogDAO,ContractBillAccountingLogDAOExample,ContractBillAccountingLogDAOMapper> {
    @Autowired
    ContractBillAccountingLogDAOMapper contractBillAccountingLogDAOMapper;

    public ContractBillAccountingLogServiceImpl(ContractBillAccountingLogDAOMapper mapper, IdGenerateService idGenerate) {
        super(mapper, idGenerate, IdType.CONTRACT_BILL_ACCOUNTING_LOG);
    }

    public BigDecimal searchRoomIdByContractId(BigDecimal contractId){
        BigDecimal roomId = contractBillAccountingLogDAOMapper.searchRoomIdByContractId(contractId);
        return roomId;
    }

    public BigDecimal searchContractFeeIdByContractId(BigDecimal contractId){
        BigDecimal contractFeeId = contractBillAccountingLogDAOMapper.searchContractFeeIdByContractId(contractId);
        return contractFeeId;
    }
}
