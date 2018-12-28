package com.shenxin.core.smartpropertymanagement.controller.impl;

import com.shenxin.core.smartpropertymanagement.controller.HeightenBaseControllerSupport;
import com.shenxin.core.smartpropertymanagement.controller.IBaseController;
import com.shenxin.core.smartpropertymanagement.domain.bo.ContractInfoBO;
import com.shenxin.core.smartpropertymanagement.domain.dto.ContractInfoDTO;
import com.shenxin.core.smartpropertymanagement.domain.vo.ContractInfoVO;
import com.shenxin.core.smartpropertymanagement.persist.entity.ContractInfo;
import com.shenxin.core.smartpropertymanagement.service.biz.ContractInfoBiz;
import com.shenxin.core.smartpropertymanagement.service.impl.ContractInfoServiceImpl;
import com.shenxin.core.smartpropertymanagement.util.ResultVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.validation.Validator;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import java.math.BigDecimal;
import java.util.List;

/**
 * @author Lancelot cailuyuan
 * @create 2018-07-24 11:33
 * @description
 */
@Controller
@RequestMapping("/contractInfo")
public class ContractInfoController extends IBaseController<ContractInfoBO,ContractInfoVO,ContractInfo,ContractInfoDTO>{
    @Autowired
    ContractInfoBiz contractInfoBiz;

    public ContractInfoController(ContractInfoServiceImpl service, Validator validator) {
        super(service, validator, "contractInfo", new HeightenBaseControllerSupport() {
        });
    }

    @RequestMapping("/insertContractInfoAndOthers")
    @ResponseBody
    @Transactional(rollbackFor = Exception.class)
    public String insertContractInfo(ContractInfo contractInfo,HttpServletRequest request)throws Exception{
        String roomId = contractInfo.getRoomId();
        if(contractInfoBiz.selectContractBookingExist(new BigDecimal(roomId))){
            return ResultVo.error("房屋已经被预订");
        }
        contractInfoBiz.insertContractInfoAndOthers(contractInfo,request);
        return ResultVo.succeed();
    }

    @RequestMapping("/selectContractDetails/{id:.*}")
    @Transactional(rollbackFor = Exception.class)
    public String selectContractDetails(@PathVariable String id,HttpServletRequest request)throws Exception{
        BigDecimal roomId = new BigDecimal(id);
        List<ContractInfo> contractInfo = contractInfoBiz.selectContractDetails(roomId);
        String roomDesc = contractInfoBiz.selectRoomDesc(roomId);
        request.setAttribute("roomDesc",roomDesc);
        request.setAttribute("rout",contractInfo);
        return "room/detailPage";
    }
}
