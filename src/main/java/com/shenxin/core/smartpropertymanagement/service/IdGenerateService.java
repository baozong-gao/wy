package com.shenxin.core.smartpropertymanagement.service;

import com.shenxin.core.smartpropertymanagement.domain.em.IdType;
import com.shenxin.core.smartpropertymanagement.persist.mapper.SeqMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

/**
 * @Author: gaobaozong
 * @Description: id 生成器
 * @Date: Created in 2018/6/15 - 11:35
 * @Version: V1.0
 */
@Service
public class IdGenerateService {

    @Autowired
    SeqMapper seqMapper;

    protected int genId(IdType type){
        switch (type){
            case FUNCTION:
                return seqMapper.getFunctionSeq();
            case USER:
                return seqMapper.getSysUsrSeq();
            case ROLE:
                return seqMapper.getRoleSeq();
            case COMPANY:
                return seqMapper.getCompanySeq();
            case EMPLOYEE:
                return seqMapper.getEmployeeSeq();
            case BUILDING:
                return seqMapper.getBuildingSeq();
            case CLIENT:
                return seqMapper.getClientSeq();
            case DEPARTMENT:
                return seqMapper.getDepartmentSeq();
            case CONTRACTFEES:
                return seqMapper.getContractFeesSeq();
            case ROOM:
                return seqMapper.getRoomSeq();
            case CONTRACTINFO:
                return seqMapper.getContractInfoSeq();
            case CONTRACT:
                return seqMapper.getContractSeq();
            case CONTRACT_FEE_CATEGORY:
                return seqMapper.getContractFeeCategorySeq();
            case CONTRACT_TEMPLATE:
                return seqMapper.getContractTemplateSeq();
            case CONTRACT_BILLS:
                return seqMapper.getContractBillsSeq();
            case CONTRACT_FEE_ACCOUNTING_LOG:
                return seqMapper.getContractFeeAccountingLogSeq();
            case CONTRACT_BILL_ACCOUNTING_LOG:
                return seqMapper.getContractBillAccountingLogSeq();
            default:
                return (int)Math.round(Math.random()*89999999+10000000);
        }
    }

    public String getId(IdType type){
        String nowTime = LocalDateTime.now().format(DateTimeFormatter.ofPattern("yyyyMMdd"));
        String id = genId(type)+"";
        // 以下几种类型生成的id前面不需要加日期
        if (type == IdType.COMPANY || type == IdType.DEPARTMENT || type == IdType.FUNCTION){
            return id;
        }
       return  nowTime+id;
    }

    public String getId(){
        return  getId(IdType.DEFAULT);
    }

    public BigDecimal getBigDecimalId(){
        return new BigDecimal(getId());
    }
}
