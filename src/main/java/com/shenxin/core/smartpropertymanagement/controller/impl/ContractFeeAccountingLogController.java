package com.shenxin.core.smartpropertymanagement.controller.impl;

import com.shenxin.core.smartpropertymanagement.controller.HeightenBaseControllerSupport;
import com.shenxin.core.smartpropertymanagement.controller.IBaseController;
import com.shenxin.core.smartpropertymanagement.domain.bo.ContractFeeAccountingLogBO;
import com.shenxin.core.smartpropertymanagement.domain.dto.ContractFeeAccountingLogDTO;
import com.shenxin.core.smartpropertymanagement.domain.vo.ContractFeeAccountingLogVO;
import com.shenxin.core.smartpropertymanagement.persist.entity.ContractFeeAccountingLogDAO;
import com.shenxin.core.smartpropertymanagement.persist.entity.ContractFeesInfo;
import com.shenxin.core.smartpropertymanagement.service.impl.ContractFeeAccountingLogServiceImpl;
import com.shenxin.core.smartpropertymanagement.service.impl.ContractFeesInfoServiceImpl;
import com.shenxin.core.smartpropertymanagement.service.impl.UserServiceImpl;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.Validator;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.math.BigDecimal;
import java.util.List;

/**
 * @author Lancelot cailuyuan
 * @create 2018-08-28 14:46
 * @description
 */
@Slf4j
@Controller
@RequestMapping(value = "/contractFeeAccountingLog")
public class ContractFeeAccountingLogController extends IBaseController<ContractFeeAccountingLogBO,ContractFeeAccountingLogVO,ContractFeeAccountingLogDAO,ContractFeeAccountingLogDTO>{
    @Autowired
    ContractFeeAccountingLogServiceImpl contractFeeAccountingLogService;

    @Autowired
    public ContractFeeAccountingLogController(ContractFeeAccountingLogServiceImpl service, Validator validator, UserServiceImpl userService, ContractFeesInfoServiceImpl contractFeesInfoService) {
        super(service, validator, "contractFeeAccountingLog", new HeightenBaseControllerSupport() {
            @Override
            public void searchAfter(HttpServletRequest request, HttpServletResponse response, List result) {
                List<ContractFeeAccountingLogVO> list = result;
                for (ContractFeeAccountingLogVO contractFeeAccountingLogVO: list) {
                    String userName = userService.searchById(new BigDecimal(contractFeeAccountingLogVO.getCreateUser())).getUserName();
                    contractFeeAccountingLogVO.setOperator(userName);
                    ContractFeesInfo contractFeesInfo = contractFeesInfoService.searchById(contractFeeAccountingLogVO.getContractFeeId());
                    contractFeeAccountingLogVO.setFeeType(contractFeesInfo.getFeeType());
                    contractFeeAccountingLogVO.setFeePayType(contractFeesInfo.getFeePayType());
                    contractFeeAccountingLogVO.setFeePhase(contractFeesInfo.getFeePhase());
                    contractFeeAccountingLogVO.setPenaltyFee(contractFeesInfo.getPenaltyFee());
                    contractFeeAccountingLogVO.setFeeStatus(contractFeesInfo.getFeeStatus());
                }
            }
        });
    }

}
