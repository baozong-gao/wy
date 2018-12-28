package com.shenxin.core.smartpropertymanagement.controller.impl;

import com.shenxin.core.smartpropertymanagement.controller.HeightenBaseControllerSupport;
import com.shenxin.core.smartpropertymanagement.controller.IBaseController;
import com.shenxin.core.smartpropertymanagement.domain.SpringConfigConstant;
import com.shenxin.core.smartpropertymanagement.domain.bo.ContractFeesInfoBO;
import com.shenxin.core.smartpropertymanagement.domain.dto.ContractFeesInfoDTO;
import com.shenxin.core.smartpropertymanagement.domain.vo.ContractFeesInfoVO;
import com.shenxin.core.smartpropertymanagement.domain.vo.ContractFeesVO;
import com.shenxin.core.smartpropertymanagement.persist.entity.*;
import com.shenxin.core.smartpropertymanagement.persist.mapper.ContractRoomInfoMapper;
import com.shenxin.core.smartpropertymanagement.service.biz.ContractFeesInfoBiz;
import com.shenxin.core.smartpropertymanagement.service.impl.ContractFeesInfoServiceImpl;
import com.shenxin.core.smartpropertymanagement.service.impl.ContractInfoServiceImpl;
import com.shenxin.core.smartpropertymanagement.service.impl.RoomServiceImpl;
import com.shenxin.core.smartpropertymanagement.util.CommonUitl;
import com.shenxin.core.smartpropertymanagement.util.ResultVo;
import com.shenxin.core.smartpropertymanagement.util.exception.PersistentException;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.validation.Validator;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.math.BigDecimal;
import java.util.List;

/**
 * @author Lancelot cailuyuan
 * @create 2018-07-19 17:18
 * @description
 */
@Controller
@Slf4j
@RequestMapping("/contractFees")
public class ContractFeesInfoController extends IBaseController<ContractFeesInfoBO,ContractFeesInfoVO,ContractFeesInfo,ContractFeesInfoDTO>{
    @Autowired
    ContractFeesInfoBiz contractFeesInfoBiz;

    public ContractFeesInfoController(ContractFeesInfoServiceImpl service, Validator validator, ContractFeesInfoBiz contractFeesInfoBiz, ContractInfoServiceImpl contractInfoService,
                                      RoomServiceImpl roomService) {
        super(service, validator, "contractFees", new HeightenBaseControllerSupport() {
            @Override
            public void searchAfter(HttpServletRequest request, HttpServletResponse response, List result) {
                List<ContractFeesInfoVO> list = result;
                for (ContractFeesInfoVO contractFees: list) {
                    BigDecimal roomId = contractFees.getRoomId();
                    BigDecimal contractId = contractFees.getContractId();
                    ContractFeesInfoVO contractFeesInfoVO = contractFeesInfoBiz.selectAboutProperty(roomId);
                    contractFees.setBuildingName(contractFeesInfoVO.getBuildingName());
                    contractFees.setPropertyName(contractFeesInfoVO.getPropertyName());
                    contractFees.setOwnerName(contractFeesInfoVO.getOwnerName());
                    ContractInfo contractInfo = contractInfoService.searchById(contractId);
                    contractFees.setPrincipleName(contractInfo.getPrincipleName());
                }
            }

            @Override
            public void searchPageBefore(HttpServletRequest request, HttpServletResponse response, Object bo) {
                if(CommonUitl.getCompanyId().equals(new BigDecimal(SpringConfigConstant.PLATEFORM_COMPANYID))){
                    List<CompanyInfo> list = contractFeesInfoBiz.selectAllCompany();
                    request.setAttribute("aboutCompany",list);
                }else{
                    List<PropertyInfo> propertyNameList = contractFeesInfoBiz.selectPropertyByCompanyId();
                    request.setAttribute("aboutProperty",propertyNameList);
                }
            }

            @Override
            public void searchDetailBefore(HttpServletRequest request, HttpServletResponse response, Object dao) {
                ContractInfo contractInfo = contractInfoService.searchById(((ContractFeesInfoVO)dao).getContractId());
                ROOMDAO roomdao = roomService.searchById(((ContractFeesInfoVO)dao).getRoomId());
                ((ContractFeesInfoVO)dao).setRoomDesc(roomdao.getRoomDesc());
                ((ContractFeesInfoVO)dao).setBookerName(contractInfo.getBookerName());
                ((ContractFeesInfoVO)dao).setBookerMobile(contractInfo.getBookerMobile());
            }

            @Override
            public void searchBefore(HttpServletRequest request, HttpServletResponse response, Object bo) {
                ContractFeesInfoBO contractFeesInfoBo = (ContractFeesInfoBO) bo;
                 contractFeesInfoBiz.setRoomBoId(contractFeesInfoBo);
            }
        });

    }

    @RequestMapping("/selectBuilding")
    @ResponseBody
    public List<BuildingInfo> selectBuilding(HttpServletRequest request)throws Exception{
        BigDecimal propertyId = new BigDecimal(request.getParameter("propertyId"));
        List<BuildingInfo> list = contractFeesInfoBiz.selectBuilding(propertyId);
        return list;
    }

    @RequestMapping("/selectPropertyByCompanyId")
    @ResponseBody
    public List<PropertyInfo> selectPropertyByCompanyId(HttpServletRequest request)throws Exception{
        BigDecimal companyId = new BigDecimal(request.getParameter("companyId"));
        List<PropertyInfo> list = contractFeesInfoBiz.selectPropertyByCompanyIdAnother(companyId);
        return list;
    }

    @RequestMapping("/preferential")
    @ResponseBody
    @Transactional(rollbackFor = Exception.class)
    public String preferentialFeeAmount(HttpServletRequest request,ContractFeesInfo contractFeesInfo)throws Exception{
        try {
            contractFeesInfo.setUpdateTime(CommonUitl.getNowDateYyyyMMdd());
            contractFeesInfoBiz.updateFeeAmount(contractFeesInfo,request);
            contractFeesInfoBiz.insertFeeAccountingLog(contractFeesInfo,request);
        } catch (Exception e) {
            log.debug(e.toString());
            throw new PersistentException("系统内部错误，优惠失败");
        }
        return ResultVo.succeed();
    }
}
