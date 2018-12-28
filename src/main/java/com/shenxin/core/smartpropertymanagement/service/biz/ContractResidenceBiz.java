package com.shenxin.core.smartpropertymanagement.service.biz;
import com.shenxin.core.smartpropertymanagement.domain.SystemConstant;
import com.shenxin.core.smartpropertymanagement.persist.entity.*;
import com.shenxin.core.smartpropertymanagement.persist.mapper.ContractFeeCategoryDAOMapper;
import com.shenxin.core.smartpropertymanagement.persist.mapper.ContractFeesInfoMapper;
import com.shenxin.core.smartpropertymanagement.persist.mapper.ContractInfoMapper;
import com.shenxin.core.smartpropertymanagement.persist.mapper.ContractRoomInfoMapper;
import com.shenxin.core.smartpropertymanagement.security.AnyUser;
import com.shenxin.core.smartpropertymanagement.util.CommonUitl;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.servlet.http.HttpServletRequest;
import java.math.BigDecimal;
import java.text.SimpleDateFormat;
import java.util.*;

/**
 * @author Lancelot cailuyuan
 * @create 2018-07-31 10:57
 * @description
 */
@Slf4j
@Service
public class ContractResidenceBiz {
    @Autowired
    ContractInfoMapper contractInfoMapper;
    @Autowired
    ContractFeesInfoMapper contractFeesInfoMapper;
    @Autowired
    ContractFeeCategoryDAOMapper contractFeeCategoryDAOMapper;
    @Autowired
    ContractRoomInfoMapper contractRoomInfoMapper;

    public BigDecimal insertContractResidence(ContractInfo contractInfo){
        Map map =CommonUitl.getStartAndEndDate(contractInfo.getHtDate());
        contractInfo.setContractStartDate(map.get("startDate").toString());
        contractInfo.setContractEndDate(map.get("endDate").toString());
        contractInfo.setContractStatus(SystemConstant.CONTRACT_STATUS_NORMAL);
        contractInfo.setContractType(SystemConstant.CONTRACT_TYPE_FEE);
        contractInfo.setContractPeriod(new BigDecimal(CommonUitl.getElapsedMonth(contractInfo.getHtDate())));
        contractInfoMapper.insertSelective(contractInfo);
        BigDecimal contractId = contractInfo.getId();
        return contractId;
    }

    public void insertContractFeesResidence(Map map, ContractFeeCategoryDAO contractFeeCategoryDAO, HttpServletRequest request){
        contractFeeCategoryDAO.setFeeType(map.get("feeType").toString());
        contractFeeCategoryDAO.setFeePayType(map.get("feePayType").toString());
        contractFeeCategoryDAO.setFeeAmount(new BigDecimal(map.get("feeAmount").toString()));
        contractFeeCategoryDAO.setContractId(new BigDecimal(map.get("contractId").toString()));
        contractFeeCategoryDAOMapper.insertSelective(contractFeeCategoryDAO);
        ContractFeesInfo contractFeesInfo = new ContractFeesInfo();
        contractFeesInfo.setRoomId(contractFeeCategoryDAO.getRoomId());
        contractFeesInfo.setFeeType(map.get("feeType").toString());
        contractFeesInfo.setFeePayType(map.get("feePayType").toString());
        contractFeesInfo.setFeeAmount(new BigDecimal(map.get("feeAmount").toString()));
        contractFeesInfo.setContractId(new BigDecimal(map.get("contractId").toString()));
        contractFeesInfo.setCompanyId(new BigDecimal(map.get("companyId").toString()));
        contractFeesInfo.setFeeStatus(SystemConstant.FEE_STATUS_INITIAL);
        Map dateMap = CommonUitl.getStartAndEndDate(map.get("htDate").toString());
        contractFeesInfo.setFeeStartDate(dateMap.get("startDate").toString());//费用起始日期
        contractFeesInfo.setFeeEndDate(dateMap.get("endDate").toString());//费用结束日期
        AnyUser anyUser =(AnyUser) request.getSession().getAttribute(SystemConstant.SESSION_USER_KEY);
        contractFeesInfo.setCreateUser(anyUser.getId().toString());
        contractFeesInfo.setCreateTime(CommonUitl.getNowDate());
        contractFeesInfo.setVersion(new BigDecimal(0));
        if(SystemConstant.FEE_PAY_TYPE_PERIOD.equals(contractFeesInfo.getFeePayType())){
            String elapsedMonth = String.valueOf(CommonUitl.getElapsedMonth(map.get("htDate").toString()));
            int elapseMonthInt = Integer.parseInt(elapsedMonth);
            for(int i=1;i<=elapseMonthInt;i++){
                Calendar cal = Calendar.getInstance();
                cal.set(Calendar.YEAR,cal.get(Calendar.YEAR)+(i-1)/12);
                cal.set(Calendar.MONTH,cal.get(Calendar.MONTH)+(i-1)%12);
                int days = cal.getActualMaximum(Calendar.DAY_OF_MONTH);
                cal.set(Calendar.DAY_OF_MONTH, days);
                Date time = cal.getTime();
                contractFeesInfo.setReceivableDate(new SimpleDateFormat("yyyyMMdd").format(time));//应收款日期
                contractFeesInfo.setFeePhase(String.valueOf(i));//账期
                contractFeesInfo.setFeePeriod(new BigDecimal(CommonUitl.getElapsedMonth(map.get("htDate").toString())));///账单周期
                contractFeesInfoMapper.insertSelective(contractFeesInfo);
            }
        }else{
            Calendar cal = Calendar.getInstance();
            int days = cal.getActualMaximum(Calendar.DAY_OF_MONTH);
            cal.set(Calendar.DATE, days);
            Date newD = cal.getTime();
            contractFeesInfo.setReceivableDate(new SimpleDateFormat("yyyyMMdd").format(newD));//应收款日期
            contractFeesInfo.setFeePhase("1");
            contractFeesInfo.setFeePeriod(new BigDecimal(1));
            contractFeesInfoMapper.insertSelective(contractFeesInfo);
        }


    }

    public ContractInfo selectContractResidence(BigDecimal roomId){
        BigDecimal contractId = contractInfoMapper.selectContractId(roomId,SystemConstant.STATUS_NORMAL);
        ContractInfo contractInfo = contractInfoMapper.selectContractResidence(contractId);
        String startDate = contractInfo.getContractStartDate();
        String endDate = contractInfo.getContractEndDate();
        String htDate = CommonUitl.getHtDate(startDate,endDate);
        contractInfo.setHtDate(htDate);
        contractInfo.setId(contractId);
        return contractInfo;
    }

    public void insertContractRoomInfo(ContractInfo contractInfo,BigDecimal contractId){
        ContractRoomInfo contractRoomInfo = new ContractRoomInfo();
        contractRoomInfo.setCompanyId(contractInfo.getCompanyId());
        contractRoomInfo.setContractId(contractId);
        contractRoomInfo.setRoomId(new BigDecimal(contractInfo.getRoomId()));
        contractRoomInfo.setStatus(SystemConstant.STATUS_NORMAL);
        contractRoomInfoMapper.insertSelective(contractRoomInfo);
    }

    public List<ContractFeeCategoryDAO> selectContractResidenceList(BigDecimal contractId){
        List<ContractFeeCategoryDAO> list = contractFeeCategoryDAOMapper.selectContractResidenceList(contractId);
        return list;
    }

    public void updateRoomStatus(BigDecimal roomId){
        ROOMDAO roomdao = new ROOMDAO();
        String roomStatus = SystemConstant.SELFLIVE_ROOM_STATUS_LIVE;
        roomdao.setRoomStatus(roomStatus);
        roomdao.setId(roomId);
        contractInfoMapper.updateRoomStatus(roomdao);
    }
}
