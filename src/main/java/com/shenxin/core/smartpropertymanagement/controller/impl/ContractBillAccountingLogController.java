package com.shenxin.core.smartpropertymanagement.controller.impl;

import com.shenxin.core.smartpropertymanagement.controller.HeightenBaseControllerSupport;
import com.shenxin.core.smartpropertymanagement.controller.IBaseController;
import com.shenxin.core.smartpropertymanagement.domain.bo.ContractBillAccountingLogBO;
import com.shenxin.core.smartpropertymanagement.domain.dto.ContractBillAccountingLogDTO;
import com.shenxin.core.smartpropertymanagement.domain.vo.ContractBillAccountingLogVO;
import com.shenxin.core.smartpropertymanagement.persist.entity.ContractBillAccountingLogDAO;
import com.shenxin.core.smartpropertymanagement.persist.entity.ContractBillsDAO;
import com.shenxin.core.smartpropertymanagement.persist.entity.ROOMDAO;
import com.shenxin.core.smartpropertymanagement.service.impl.ContractBillAccountingLogServiceImpl;
import com.shenxin.core.smartpropertymanagement.service.impl.ContractBillsServiceImpl;
import com.shenxin.core.smartpropertymanagement.service.impl.RoomServiceImpl;
import com.shenxin.core.smartpropertymanagement.service.impl.UserServiceImpl;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.validation.Validator;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.math.BigDecimal;
import java.util.List;

/**
 * @author Lancelot cailuyuan
 * @create 2018-08-29 13:56
 * @description
 */
@Controller
@Slf4j
@RequestMapping("/ContractBillAccountingLog")
public class ContractBillAccountingLogController extends IBaseController<ContractBillAccountingLogBO,ContractBillAccountingLogVO,ContractBillAccountingLogDAO,ContractBillAccountingLogDTO>{

    public ContractBillAccountingLogController(ContractBillAccountingLogServiceImpl service, Validator validator, ContractBillsServiceImpl contractBillsService, UserServiceImpl userService, RoomServiceImpl roomService,ContractBillAccountingLogServiceImpl contractBillAccountingLogService) {
        super(service, validator, "contractBillAccountingLog", new HeightenBaseControllerSupport() {
            @Override
            public void searchAfter(HttpServletRequest request, HttpServletResponse response, List result) {
                List<ContractBillAccountingLogVO> list = result;
                for(ContractBillAccountingLogVO contractBillAccountingLogVO:list){
                    String operator = userService.searchById(contractBillAccountingLogVO.getCreateUser()).getUserName();
                    contractBillAccountingLogVO.setOperator(operator);
                    ContractBillsDAO contractBillsDAO = contractBillsService.searchById(contractBillAccountingLogVO.getContractBillId());
                    contractBillAccountingLogVO.setContractId(contractBillsDAO.getContractId());
                    contractBillAccountingLogVO.setPenaltyAmount(contractBillsDAO.getPenaltyAmount());
                    contractBillAccountingLogVO.setBillStatus(contractBillsDAO.getBillStatus());
                    contractBillAccountingLogVO.setBillAmount(contractBillsDAO.getBillAmount());
                    BigDecimal roomId = contractBillAccountingLogService.searchRoomIdByContractId(contractBillsDAO.getContractId());
                    String roomDesc = roomService.searchById(roomId).getRoomDesc();
                    contractBillAccountingLogVO.setRoomDesc(roomDesc);
                    BigDecimal contractFeeId = contractBillAccountingLogService.searchContractFeeIdByContractId(contractBillsDAO.getContractId());
                    contractBillAccountingLogVO.setContractFeeId(contractFeeId);
                }
            }
        });
    }
}
