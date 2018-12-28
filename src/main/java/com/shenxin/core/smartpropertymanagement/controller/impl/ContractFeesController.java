package com.shenxin.core.smartpropertymanagement.controller.impl;

import com.shenxin.core.smartpropertymanagement.controller.IBaseController;
import com.shenxin.core.smartpropertymanagement.domain.SystemConstant;
import com.shenxin.core.smartpropertymanagement.domain.bo.ContractFeesBO;
import com.shenxin.core.smartpropertymanagement.domain.dto.ContractBusinessDTO;
import com.shenxin.core.smartpropertymanagement.domain.dto.ContractFeesDTO;
import com.shenxin.core.smartpropertymanagement.domain.vo.ContractBusinessVO;
import com.shenxin.core.smartpropertymanagement.domain.vo.ContractFeesVO;
import com.shenxin.core.smartpropertymanagement.domain.vo.RoomVO;
import com.shenxin.core.smartpropertymanagement.persist.entity.ContractFeesDAO;
import com.shenxin.core.smartpropertymanagement.persist.entity.ContractInfoDAO;
import com.shenxin.core.smartpropertymanagement.persist.entity.ROOMDAO;
import com.shenxin.core.smartpropertymanagement.service.biz.ContractBusinessBiz;
import com.shenxin.core.smartpropertymanagement.service.impl.ContractBusinessServiceImpl;
import com.shenxin.core.smartpropertymanagement.service.impl.ContractFeesServiceImpl;
import com.shenxin.core.smartpropertymanagement.service.impl.RoomServiceImpl;
import com.shenxin.core.smartpropertymanagement.util.BeanUtils;
import com.shenxin.core.smartpropertymanagement.util.ResultVo;
import com.shenxin.core.smartpropertymanagement.util.exception.ExceptionID;
import com.shenxin.core.smartpropertymanagement.util.exception.ValidatorException;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.Validator;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

/**
 * @Author: gaobaozong
 * @Description: 帐单计划
 * @Date: Created in 2018/7/24 - 10:16
 * @Version: V1.0
 */
@Slf4j
@Controller
@RequestMapping("/contract/fees")
public class ContractFeesController extends IBaseController<ContractFeesBO, ContractFeesVO, ContractFeesDAO, ContractFeesDTO> {

    ContractFeesServiceImpl service;

    @Autowired
    ContractBusinessServiceImpl contractBusinessService;

    @Autowired
    ContractBusinessBiz contractBusinessBiz;

    @Autowired
    RoomServiceImpl roomService;

    Validator validator;

    @Autowired
    public ContractFeesController(ContractFeesServiceImpl service, Validator validator) {
        super(service, validator, "contract_fees", null);
        this.service = service;
        this.validator = validator;
    }

    @PostMapping("add/{roomId}")
    @ResponseBody
    public String doAdd(@PathVariable("roomId") BigDecimal roomId,ContractFeesDTO  dto,HttpServletRequest request,
                        HttpServletResponse response) throws Exception {

        try {
            BeanUtils.validateJSR303(validator, dto);
            ContractInfoDAO contract = contractBusinessService.searchByRoomId(roomId);

            ContractBusinessDTO.ContractFeeCategory fee = new ContractBusinessDTO.ContractFeeCategory();
            BeanUtils.copy(dto,fee);
            List<ContractBusinessDTO.ContractFeeCategory> fees = new ArrayList<>();
            fees.add(fee);

            ContractBusinessDTO contractdto = new ContractBusinessDTO();
            if(SystemConstant.FEE_PAY_TYPE_PERIOD.equals(dto.getFeePayType())){
                contractdto.setContractStartDate(dto.getFeeStartDate());
            }else{
                contractdto.setContractStartDate(dto.getReceivableDate());
            }
            DateTimeFormatter formatter =  DateTimeFormatter.ofPattern("yyyyMMdd");
            LocalDate startDate = LocalDate.parse(contractdto.getContractStartDate(), formatter);
            LocalDate endDate = LocalDate.parse(contractdto.getContractEndDate(), formatter);
            Optional.ofNullable(contract.getContractStartDate()).map(_time -> LocalDate.parse(_time,formatter)).filter(_t -> _t.isBefore(startDate)).orElseThrow(()-> new ValidatorException("开始时间必须要合同时间内"));
            Optional.ofNullable(contract.getContractEndDate()).map(_time -> LocalDate.parse(_time,formatter)).filter(_t -> _t.isAfter(endDate)).orElseThrow(()-> new ValidatorException("结束时间必须要合同时间内"));
            int payPeriod = contract.getFeePayPeriod().intValue();  //付几
            BigDecimal holdPeriod = contract.getFeeHoldPeriod(); //押几

            Period p = Period.between(startDate, endDate);
            long feePeriod = Optional.ofNullable(p.getYears()).map(_y -> _y *12).orElse(0) +
                    Optional.ofNullable(p.getMonths()).orElse(0) +
                    Optional.ofNullable(p.getDays()).filter(_d -> _d > 0).map(_d -> 1).orElse(0); //周期


            contractBusinessBiz.generateFees(fees,dto.getCompanyId(),roomId,contract.getId(),contract.getFeeChangeCalculate(),startDate,endDate,payPeriod,holdPeriod,feePeriod);

            return ResultVo.succeed();
        } catch (ValidatorException e) {
            return ResultVo.error(e.getMessage());
        } catch (Exception e) {
            String id = ExceptionID.getID();
            log.error("增加异常【{}】", id, e);
            return ResultVo.error("增加异常:" + id);
        }
    }

    @PostMapping("page")
    public String doPostPage(HttpSession session, HttpServletRequest request, HttpServletResponse response) throws Exception {
        BigDecimal contractId = (BigDecimal)request.getAttribute("contractId");
        ContractInfoDAO contract =  contractBusinessService.searchById(contractId);
        ContractBusinessVO contractBusinessVO = new ContractBusinessVO();
        BeanUtils.copy(contract,contractBusinessVO);
        request.setAttribute("contract", contractBusinessVO);

        List<ROOMDAO> rooms = roomService.searchByContractId(contractId);
        List<RoomVO> roomVOS = BeanUtils.copyList(rooms, RoomVO.class);
        if(roomVOS.size() > 0){
            request.setAttribute("room", roomVOS.get(0));
        }
        return super.doPage(session,request,response);
    }

    @PostMapping("search/{id}")
    @ResponseBody
    public String searchByContractId(@PathVariable String id, HttpSession session, HttpServletRequest request,
                                     HttpServletResponse response) throws Exception{
        try {
            ContractFeesDAO dao = new ContractFeesDAO();
            dao.setContractId(new BigDecimal(id));
            List<ContractFeesDAO> result =  service.search(dao);
            List<ContractFeesVO> vos = BeanUtils.copyList(result, ContractFeesVO.class);
            return ResultVo.succeed(vos);
        }catch (Exception e) {
            String _id = ExceptionID.getID();
            log.error("查询异常【{}】", _id, e);
            return ResultVo.error("查询异常:" + _id);
        }
    }

}
