package com.shenxin.core.smartpropertymanagement.service.biz;

import com.shenxin.core.smartpropertymanagement.domain.dto.ClientInfoDTO;
import com.shenxin.core.smartpropertymanagement.persist.entity.ClientAccountInfo;
import com.shenxin.core.smartpropertymanagement.persist.entity.ClientInfo;
import com.shenxin.core.smartpropertymanagement.persist.mapper.ClientInfoMapper;
import com.shenxin.core.smartpropertymanagement.util.BeanUtils;
import com.shenxin.core.smartpropertymanagement.util.CommonUitl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;

/**
 * @author Lancelot cailuyuan
 * @create 2018-07-16 23:19
 * @description
 */
@Service
public class ClientInfoBiz {

    @Autowired
    ClientInfoMapper clientInfoMapper;

    public void insertClient(ClientInfo clientInfo){
        BigDecimal companyId = CommonUitl.getCompanyId();
        clientInfo.setCompanyId(companyId);
        clientInfoMapper.insertClient(clientInfo);
    }

    public void insertClinentAccount(ClientAccountInfo clientAccountInfo){
        BigDecimal companyId = CommonUitl.getCompanyId();
        clientAccountInfo.setCompanyId(companyId);
        clientInfoMapper.insertClinentAccount(clientAccountInfo);
    }

    public void insertClientPrivate(ClientInfo clientInfo){
        BigDecimal companyId = CommonUitl.getCompanyId();
        clientInfo.setCompanyId(companyId);
        clientInfoMapper.insertClientPrivate(clientInfo);
    }

    public void insertClinentAccountPrivate(ClientAccountInfo clientAccountInfo){
        BigDecimal companyId = CommonUitl.getCompanyId();
        clientAccountInfo.setCompanyId(companyId);
        clientInfoMapper.insertClinentAccountPrivate(clientAccountInfo);
    }

    public ClientAccountInfo selectClientAccount(BigDecimal clientId){
        ClientAccountInfo clientAccountInfo = clientInfoMapper.selectClientAccount(clientId);
        return clientAccountInfo;
    }

    public void updateClientAccountInfo(ClientInfoDTO clientInfoDTO) throws Exception {

        ClientAccountInfo clientAccountInfo = new ClientAccountInfo();
        BeanUtils.copy(clientAccountInfo,clientInfoDTO);
//        clientAccountInfo.setAccountType(clientInfoDTO.getClientType());
//        clientAccountInfo.setClientId(clientInfoDTO.getId());
//        clientAccountInfo.setCardNo(clientInfoDTO.getCardNo());
//        clientAccountInfo.setCardHolderName(clientInfoDTO.getCardHolderName());
//        clientAccountInfo.setCardBankName(clientInfoDTO.getCardBankName());
//        clientAccountInfo.setCardBankNo(clientInfoDTO.getCardBankNo());
//        clientAccountInfo.setCardBankEnName(clientInfoDTO.getCardBankEnName());
//        clientAccountInfo.setCardBranchName(clientInfoDTO.getCardBranchName());
//        clientAccountInfo.setCardBranchNo(clientInfoDTO.getCardBranchNo());
//        clientAccountInfo.setContactInfo(clientInfoDTO.getContactInfo());
//        clientAccountInfo.setTaxInfo(clientInfoDTO.getTaxInfo());
//        clientAccountInfo.setIdType(clientInfoDTO.getIdType());
//        clientAccountInfo.setIdNo(clientInfoDTO.getIdNo());
        clientInfoMapper.updateClientAccountInfo(clientAccountInfo);
    }
}
