package com.shenxin.core.smartpropertymanagement.service.impl;

import com.shenxin.core.smartpropertymanagement.domain.em.IdType;
import com.shenxin.core.smartpropertymanagement.persist.entity.ContractBillsDAO;
import com.shenxin.core.smartpropertymanagement.persist.entity.ContractBillsDAOExample;
import com.shenxin.core.smartpropertymanagement.persist.mapper.ContractBillsDAOMapper;
import com.shenxin.core.smartpropertymanagement.service.IBaseService;
import com.shenxin.core.smartpropertymanagement.service.IdGenerateService;
import com.shenxin.core.smartpropertymanagement.util.CommonUitl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.servlet.http.HttpServletRequest;

/**
 * @author Lancelot cailuyuan
 * @create 2018-08-20 10:26
 * @description
 */
@Service("contractBillsService")
public class ContractBillsServiceImpl extends IBaseService<ContractBillsDAO,ContractBillsDAOExample,ContractBillsDAOMapper>{

    @Autowired
    public ContractBillsServiceImpl(ContractBillsDAOMapper mapper, IdGenerateService idGenerate) {
        super(mapper, idGenerate,IdType.CONTRACT_BILLS);
    }
}
