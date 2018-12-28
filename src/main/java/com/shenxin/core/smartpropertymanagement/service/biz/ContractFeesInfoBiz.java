package com.shenxin.core.smartpropertymanagement.service.biz;

import com.shenxin.core.smartpropertymanagement.domain.SpringConfigConstant;
import com.shenxin.core.smartpropertymanagement.domain.SystemConstant;
import com.shenxin.core.smartpropertymanagement.domain.bo.ContractFeesInfoBO;
import com.shenxin.core.smartpropertymanagement.domain.vo.ContractFeesInfoVO;
import com.shenxin.core.smartpropertymanagement.persist.entity.*;
import com.shenxin.core.smartpropertymanagement.persist.mapper.ContractFeeAccountingLogDAOMapper;
import com.shenxin.core.smartpropertymanagement.persist.mapper.ContractFeesInfoMapper;
import com.shenxin.core.smartpropertymanagement.persist.mapper.ContractRoomInfoDAOMapper;
import com.shenxin.core.smartpropertymanagement.security.AnyUser;
import com.shenxin.core.smartpropertymanagement.service.impl.ContractBusinessServiceImpl;
import com.shenxin.core.smartpropertymanagement.service.impl.ContractFeesServiceImpl;
import com.shenxin.core.smartpropertymanagement.service.impl.RoomServiceImpl;
import com.shenxin.core.smartpropertymanagement.util.CommonUitl;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Service;

import javax.servlet.http.HttpServletRequest;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

/**
 * @author Lancelot cailuyuan
 * @create 2018-07-20 11:12
 * @description
 */
@Service
public class ContractFeesInfoBiz {
    @Autowired
    ContractFeesInfoMapper contractFeesInfoMapper;
    @Autowired
    ContractBusinessServiceImpl contractService;
    @Autowired
    ContractFeesServiceImpl feesService;
    @Autowired
    ContractFeeAccountingLogDAOMapper contractFeeAccountingLogDAOMapper;
    @Autowired
    RoomServiceImpl roomService;
    @Autowired
    ContractRoomInfoDAOMapper contractRoomInfoDAOMapper;

    public List<PropertyInfo> selectPropertyByCompanyId(){
        AnyUser userDetails = (AnyUser) SecurityContextHolder.getContext().getAuthentication().getPrincipal();
        SysUsrDAO user = userDetails.getUser();
        BigDecimal companyId = user.getCompanyId();
        if(companyId.equals(new BigDecimal(SpringConfigConstant.PLATEFORM_COMPANYID))){
            List<PropertyInfo> list = contractFeesInfoMapper.selectAllProperty(companyId);
            return list;
        }else{
            List<PropertyInfo> list = contractFeesInfoMapper.selectPropertyByCompanyId(companyId);
            return list;
        }
    }

    public List<BuildingInfo> selectBuilding(BigDecimal propertyId){
        List list = contractFeesInfoMapper.selectBuilding(propertyId);
        return list;
    }

    public List<CompanyInfo> selectAllCompany(){
        List<CompanyInfo> list = contractFeesInfoMapper.selectAllCompany();
        return list;
    }

    public List<PropertyInfo> selectPropertyByCompanyIdAnother(BigDecimal companyId){
        List<PropertyInfo> list = contractFeesInfoMapper.selectPropertyByCompanyIdAnother(companyId);
        return list;
    }

    public List<ContractFeesDAO> searchByRoomId(BigDecimal roomId, String feesStatus){
        ContractInfoDAO contract = contractService.searchByRoomId(roomId);
        ContractFeesDAO fees = new ContractFeesDAO();
        fees.setContractId(contract.getId());
        if(StringUtils.isNotBlank(feesStatus)){
            fees.setFeeStatus(feesStatus);
        }
       return  feesService.search(fees);
    }

    public void deleteInitialByRoomId(BigDecimal roomId){
        List<ContractFeesDAO> contractFeess = searchByRoomId(roomId, SystemConstant.FEE_STATUS_INITIAL);
        Optional.ofNullable(contractFeess).ifPresent(fees -> {
            fees.stream().map(fee -> fee.getId()).forEach(id -> feesService.delete(id));
        });
    }

    public boolean overdueFeesByRoomId(BigDecimal roomId){
        List<ContractFeesDAO> contractFeess = searchByRoomId(roomId, SystemConstant.FEE_STATUS_OVERDUE);
        return contractFeess.size() > 0;
    }

    public boolean initFeesByRoomId(BigDecimal roomId){
        List<ContractFeesDAO> contractFeess = searchByRoomId(roomId, SystemConstant.FEE_STATUS_INITIAL);
        return contractFeess.size() > 0;
    }

    public ContractFeesInfoVO selectAboutProperty(BigDecimal roomId){
        ContractFeesInfoVO contractFeesInfoVO = contractFeesInfoMapper.selectAboutProperty(roomId);
        return contractFeesInfoVO;
    }

    public void updateFeeAmount(ContractFeesInfo contractFeesInfo,HttpServletRequest request){
        contractFeesInfo.setUpdateTime(CommonUitl.getNowDateYyyyMMdd());
        contractFeesInfo.setUpdateUser(CommonUitl.getUserSessionEntity(request).getId().toString());
        contractFeesInfoMapper.updateFeeAmount(contractFeesInfo);
    }

    public void insertFeeAccountingLog(ContractFeesInfo contractFeesInfo, HttpServletRequest request){
        BigDecimal accountAmount = new BigDecimal(request.getParameter("accountAmount"));
        BigDecimal beforeAmount = new BigDecimal(request.getParameter("beforeAmount"));
        ContractFeeAccountingLogDAO contractFeeAccountingLogDAO = new ContractFeeAccountingLogDAO();
        contractFeeAccountingLogDAO.setCompanyId(contractFeesInfo.getCompanyId());
        contractFeeAccountingLogDAO.setContractFeeId(contractFeesInfo.getId());
        contractFeeAccountingLogDAO.setAccountingType(SystemConstant.ACCOUNTING_TYPE_DEBIT);//账务类型
        contractFeeAccountingLogDAO.setAccountingAmount(accountAmount);
        contractFeeAccountingLogDAO.setBeforeAmount(beforeAmount);
        contractFeeAccountingLogDAO.setAfterAmount(contractFeesInfo.getFeeAmount());
        contractFeeAccountingLogDAO.setAccountingDate(CommonUitl.getNowStringDate());
        contractFeeAccountingLogDAO.setAccountingRemark("收入账单优惠");
        AnyUser anyUser = CommonUitl.getUserSessionEntity(request);
        contractFeeAccountingLogDAO.setCreateUser(anyUser.getId().toString());
        contractFeeAccountingLogDAO.setCreateTime(CommonUitl.getNowDateYyyyMMdd());
        contractFeeAccountingLogDAO.setVersion(new BigDecimal(0));
        contractFeeAccountingLogDAOMapper.insertSelective(contractFeeAccountingLogDAO);
    }

    public void setRoomBoId(ContractFeesInfoBO contractFeesInfoBO){
        ROOMDAO roomdao = new ROOMDAO();
        Optional.ofNullable(contractFeesInfoBO.getPropertyId()).ifPresent(_propertyId -> {
            roomdao.setPropertyId(_propertyId);
        });
        Optional.ofNullable(contractFeesInfoBO.getBuildingId()).ifPresent(_buildingId -> {
            roomdao.setBuildingId(_buildingId);
        });
        List<BigDecimal> roomIdList = new ArrayList<>();
        Optional.ofNullable(roomService.search(roomdao)).ifPresent(roomIds ->
                roomIds.stream().map(roomIdStream -> roomIdStream.getId()).forEach(roomId -> roomIdList.add(roomId)));

        List<BigDecimal> contractIds = new ArrayList<>();
        Optional.ofNullable(roomIdList).ifPresent(roomIdList1 -> {
            ContractRoomInfoDAOExample example = new ContractRoomInfoDAOExample();
            example.createCriteria().andRoomIdIn(roomIdList1);
            Optional.ofNullable(contractRoomInfoDAOMapper.selectByExample(example)).ifPresent(_crs ->{
                _crs.stream().map(_cr -> _cr.getContractId()).forEach(_cid -> contractIds.add(_cid));
            });
            contractFeesInfoBO.setIds(contractIds);
        });

    }
}
