package com.shenxin.core.smartpropertymanagement.service.biz;

import com.shenxin.core.smartpropertymanagement.domain.SystemConstant;
import com.shenxin.core.smartpropertymanagement.domain.dto.ContractBillsDTO;
import com.shenxin.core.smartpropertymanagement.persist.entity.ContractBillAccountingLogDAO;
import com.shenxin.core.smartpropertymanagement.persist.mapper.ContractBillAccountingLogDAOMapper;
import com.shenxin.core.smartpropertymanagement.persist.mapper.ContractBillsDAOMapper;
import com.shenxin.core.smartpropertymanagement.util.BeanUtils;
import com.shenxin.core.smartpropertymanagement.util.CommonUitl;
import lombok.extern.slf4j.Slf4j;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.servlet.http.HttpServletRequest;
import java.math.BigDecimal;

/**
 * @author Lancelot cailuyuan
 * @create 2018-08-22 15:37
 * @description
 */
@Service
@Slf4j
public class ContractBillsBiz {

    @Autowired
    ContractBillsDAOMapper contractBillsDAOMapper;

    @Autowired
    ContractBillAccountingLogDAOMapper contractBillAccountingLogDAOMapper;

    /**
     * 应收账单优惠修改
     * @param contractBillsDTO
     * @param request
     */
    public void updateContractBillsFavorable(ContractBillsDTO contractBillsDTO, HttpServletRequest request){
        contractBillsDTO.setUpdateTime(CommonUitl.getNowDateYyyyMMdd());
        contractBillsDTO.setUpdateUser(CommonUitl.getUserSessionEntity(request).getId().toString());
        BigDecimal DiscountAmount = contractBillsDAOMapper.selectByPrimaryKey(contractBillsDTO.getId()).getDiscountAmount();
        if(DiscountAmount == null ){
            contractBillsDAOMapper.updateContractBillsFavorable(contractBillsDTO);
        }else {
            contractBillsDTO.setDiscountAmount(DiscountAmount.add(contractBillsDTO.getDiscountAmount()));
            contractBillsDAOMapper.updateContractBillsFavorable(contractBillsDTO);
        }

    }

    public void insertContractBillAccountingLog(ContractBillsDTO contractBillsDTO,HttpServletRequest request) throws Exception{
        ContractBillAccountingLogDAO contractBillAccountingLogDAO = new ContractBillAccountingLogDAO();
        BeanUtils.copy(contractBillAccountingLogDAO,contractBillsDTO);
        contractBillAccountingLogDAO.setVersion(new BigDecimal(0));
        contractBillAccountingLogDAO.setCreateTime(CommonUitl.getNowDateYyyyMMdd());
        contractBillAccountingLogDAO.setCreateUser(CommonUitl.getUserSessionEntity(request).getId().toString());
        contractBillAccountingLogDAO.setContractBillId(contractBillsDTO.getId());
        contractBillAccountingLogDAO.setAccountingType(SystemConstant.ACCOUNTING_TYPE_DEBIT);
        contractBillAccountingLogDAO.setAccountingAmount(contractBillsDTO.getDiscountAmountForLog());
        contractBillAccountingLogDAO.setAfterAmount(new BigDecimal(contractBillsDTO.getNeedPayAmount()));
        contractBillAccountingLogDAO.setBeforeAmount(contractBillAccountingLogDAO.getAfterAmount().add(contractBillsDTO.getDiscountAmountForLog()));
        contractBillAccountingLogDAO.setAccountingDate(CommonUitl.getNowStringDate());
        contractBillAccountingLogDAO.setAccountingRemark("应收账单优惠");
        contractBillAccountingLogDAO.setCompanyId(new BigDecimal(contractBillsDTO.getCompanyId()));
        contractBillAccountingLogDAOMapper.insertSelective(contractBillAccountingLogDAO);
    }
}
