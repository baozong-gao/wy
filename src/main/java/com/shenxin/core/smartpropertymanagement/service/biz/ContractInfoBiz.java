package com.shenxin.core.smartpropertymanagement.service.biz;

import com.shenxin.core.smartpropertymanagement.domain.SystemConstant;
import com.shenxin.core.smartpropertymanagement.persist.entity.*;
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
import java.util.Date;
import java.util.List;

/**
 * @author Lancelot cailuyuan
 * @create 2018-07-24 12:55
 * @description
 */
@Service
@Slf4j
public class ContractInfoBiz {
    @Autowired
    ContractInfoMapper contractInfoMapper;
    @Autowired
    ContractFeesInfoMapper contractFeesInfoMapper;
    @Autowired
    ContractRoomInfoMapper contractRoomInfoMapper;

    public void insertContractInfoAndOthers(ContractInfo contractInfo, HttpServletRequest request){
        String[] LastSignDate = contractInfo.getLastSignDate().split("-");
        StringBuffer newLastSignDate = new StringBuffer();
        for(int i=0;i<LastSignDate.length;i++){
            newLastSignDate.append(LastSignDate[i]);
        }
        String realDate = newLastSignDate.toString();
        contractInfo.setLastSignDate(realDate);
        contractInfo.setContractStatus(SystemConstant.CONTRACT_STATUS_NORMAL);
        contractInfo.setContractType(SystemConstant.CONTRACT_TYPE_HOTEL_BOOKING);
        contractInfo.setContractPeriod(new BigDecimal(1));
        contractInfoMapper.insertContractInfo(contractInfo);
        BigDecimal contractInfoId = contractInfo.getId();
        ContractFeeCategory contractFeeCategory = new ContractFeeCategory();
        BigDecimal companyId = contractInfo.getCompanyId();
        contractFeeCategory.setContractId(contractInfoId);
        contractFeeCategory.setCompanyId(companyId);
        contractFeeCategory.setRoomId(new BigDecimal(contractInfo.getRoomId()));
        contractFeeCategory.setFeeAmount(new BigDecimal(contractInfo.getFeeAmount()));
        contractFeeCategory.setFeePayType(SystemConstant.FEE_PAY_TYPE_ONETIME);
        contractFeeCategory.setFeeType(SystemConstant.FEE_TYPE_FWDJ);
        contractInfoMapper.insertContractFeeCategory(contractFeeCategory);
        ContractFeesInfo contractFeesInfo = new ContractFeesInfo();
        contractFeesInfo.setCompanyId(contractInfo.getCompanyId());
        contractFeesInfo.setContractId(contractInfoId);
        contractFeesInfo.setRoomId(contractFeeCategory.getRoomId());
        contractFeesInfo.setFeeType(SystemConstant.FEE_TYPE_FWDJ);
        contractFeesInfo.setFeePayType(SystemConstant.FEE_PAY_TYPE_ONETIME);
        contractFeesInfo.setFeeAmount(contractFeeCategory.getFeeAmount());
        SimpleDateFormat df = new SimpleDateFormat("yyyyMMdd");
        String today = df.format(new Date());
        contractFeesInfo.setFeePeriod(new BigDecimal(1));///账单周期
        contractFeesInfo.setFeePhase("1");//账期
        contractFeesInfo.setFeeStartDate(today);//费用起始日期
        contractFeesInfo.setFeeEndDate(today);//费用结束日期
        contractFeesInfo.setReceivableDate(today);//应收款日期
        contractFeesInfo.setFeeStatus(SystemConstant.FEE_STATUS_INITIAL);//费用状态
        contractFeesInfo.setVersion(new BigDecimal(0));
        contractFeesInfo.setFeeRemark(contractInfo.getBookingRemark());//费用说明(备注)
        AnyUser anyUser =(AnyUser) request.getSession().getAttribute(SystemConstant.SESSION_USER_KEY);
        contractFeesInfo.setCreateUser(anyUser.getId().toString());
        contractFeesInfo.setCreateTime(CommonUitl.getNowDate());
        contractFeesInfoMapper.insertSelective(contractFeesInfo);
        ContractRoomInfo contractRoomInfo = new ContractRoomInfo();
        contractRoomInfo.setCompanyId(contractFeesInfo.getCompanyId());
        contractRoomInfo.setContractId(contractFeesInfo.getContractId());
        contractRoomInfo.setRoomId(contractFeesInfo.getRoomId());
        contractRoomInfo.setStatus(SystemConstant.STATUS_NORMAL);
        contractRoomInfoMapper.insertSelective(contractRoomInfo);
        ROOMDAO roomdao = new ROOMDAO();
        roomdao.setRoomStatus(SystemConstant.HOTEL_ROOM_STATUS_BOOKING);
        roomdao.setId(contractRoomInfo.getRoomId());
        contractInfoMapper.updateRoomStatus(roomdao);
    }

    // 查看房屋是否已经被预订
    public Boolean selectContractBookingExist(BigDecimal roomId){
        BigDecimal contractId = contractFeesInfoMapper.selectContractDetails(roomId);
        return contractId != null;
    }

    public List<ContractInfo> selectContractDetails(BigDecimal roomId){
        BigDecimal contractId = contractFeesInfoMapper.selectContractDetails(roomId);
        List<ContractInfo> contractInfo = contractInfoMapper.selectContractInfo(contractId);
        return contractInfo;
    }

    public String selectRoomDesc(BigDecimal roomId){
        String roomDesc = contractFeesInfoMapper.selectRoomDesc(roomId);
        return roomDesc;
    }
}
