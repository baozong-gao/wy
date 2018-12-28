package com.shenxin.core.smartpropertymanagement.controller.impl;

import com.shenxin.core.smartpropertymanagement.controller.HeightenBaseControllerSupport;
import com.shenxin.core.smartpropertymanagement.controller.IBaseController;
import com.shenxin.core.smartpropertymanagement.domain.SystemConstant;
import com.shenxin.core.smartpropertymanagement.domain.bo.ContractBillsBO;
import com.shenxin.core.smartpropertymanagement.domain.dto.ContractBillsDTO;
import com.shenxin.core.smartpropertymanagement.domain.vo.ContractBillsVO;
import com.shenxin.core.smartpropertymanagement.persist.entity.ContractBillsDAO;
import com.shenxin.core.smartpropertymanagement.persist.entity.ContractFeesInfo;
import com.shenxin.core.smartpropertymanagement.persist.entity.ContractInfo;
import com.shenxin.core.smartpropertymanagement.service.biz.ContractBillsBiz;
import com.shenxin.core.smartpropertymanagement.service.impl.ContractBillsServiceImpl;
import com.shenxin.core.smartpropertymanagement.service.impl.ContractFeesInfoServiceImpl;
import com.shenxin.core.smartpropertymanagement.service.impl.ContractInfoServiceImpl;
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
import java.util.Map;

/**
 * @author Lancelot cailuyuan
 * @create 2018-08-20 10:23
 * @description
 */
@Slf4j
@Controller
@RequestMapping(value = "/contractBills")
public class ContractBillsController extends IBaseController<ContractBillsBO,ContractBillsVO,ContractBillsDAO,ContractBillsDTO>{

    @Autowired
    ContractBillsBiz contractBillsBiz;

    public ContractBillsController(ContractBillsServiceImpl service, Validator validator, ContractFeesInfoServiceImpl contractFeesInfoService, ContractInfoServiceImpl contractInfoService) {
        super(service, validator, "contractBills", new HeightenBaseControllerSupport() {

            @Override
            public void insertBefore(HttpServletRequest request, HttpServletResponse response, Object dao) {
                ContractBillsDAO contractBillsDAO = (ContractBillsDAO) dao;
                contractBillsDAO.setBillStatus(SystemConstant.BILL_STATUS_INITIAL);
                contractBillsDAO.setCreateUser(CommonUitl.getUserSessionEntity(request).getId().toString());
                contractBillsDAO.setCreateTime(CommonUitl.getNowDateYyyyMMdd());
                contractBillsDAO.setVersion(new BigDecimal(0));
            }

            @Override
            public void insertAfter(HttpServletRequest request, HttpServletResponse response, Object... param) {
                Map map = request.getParameterMap();
                String[] contractIdList = (String[]) map.get("contractIdList[]");
                for(int i=0;i<contractIdList.length;i++){
                    ContractFeesInfo contractFeesInfo = new ContractFeesInfo();
                    contractFeesInfo.setFeeStatus(SystemConstant.FEE_STATUS_BILLED);
                    contractFeesInfo.setId(new BigDecimal(contractIdList[i]));
                    contractFeesInfo.setUpdateTime(CommonUitl.getNowDateYyyyMMdd());
                    // 更新
                    contractFeesInfoService.update(contractFeesInfo);
                }
            }

            @Override
            public void searchDetailBefore(HttpServletRequest request, HttpServletResponse response, Object dao) {
                ContractInfo contractInfo = contractInfoService.searchById(((ContractBillsVO)dao).getContractId());
                ((ContractBillsVO)dao).setBookerName(contractInfo.getBookerName());
                ((ContractBillsVO)dao).setBookerMobile(contractInfo.getBookerMobile());
            }
        });
    }

    @RequestMapping(value = "/preferential")
    @ResponseBody
    @Transactional(rollbackFor = Exception.class)
    public String preferentialBillAmount(HttpServletRequest request,ContractBillsDTO contractBillsDTO){
        try {
            contractBillsBiz.updateContractBillsFavorable(contractBillsDTO,request);
            contractBillsBiz.insertContractBillAccountingLog(contractBillsDTO,request);
        } catch (Exception e) {
            log.debug(e.toString());
            throw new PersistentException("系统内部错误，优惠失败");
        }
        return ResultVo.succeed();
    }
}
