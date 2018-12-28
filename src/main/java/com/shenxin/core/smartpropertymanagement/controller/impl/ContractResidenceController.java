package com.shenxin.core.smartpropertymanagement.controller.impl;

import com.shenxin.core.smartpropertymanagement.controller.HeightenBaseControllerSupport;
import com.shenxin.core.smartpropertymanagement.controller.IBaseController;
import com.shenxin.core.smartpropertymanagement.domain.bo.ContractResidenceBO;
import com.shenxin.core.smartpropertymanagement.domain.dto.ContractResidenceDTO;
import com.shenxin.core.smartpropertymanagement.domain.vo.ContractResidenceVO;
import com.shenxin.core.smartpropertymanagement.persist.entity.*;
import com.shenxin.core.smartpropertymanagement.persist.mapper.ROOMDAOMapper;
import com.shenxin.core.smartpropertymanagement.service.biz.ContractInfoBiz;
import com.shenxin.core.smartpropertymanagement.service.biz.ContractResidenceBiz;
import com.shenxin.core.smartpropertymanagement.service.impl.ContractResidenceServiceImpl;
import com.shenxin.core.smartpropertymanagement.service.impl.RoomServiceImpl;
import com.shenxin.core.smartpropertymanagement.util.ResultVo;
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
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import static com.shenxin.core.smartpropertymanagement.util.Collections3.toJSONList;

/**
 * @author Lancelot cailuyuan
 * @create 2018-07-30 10:52
 * @description
 */
@Slf4j
@Controller
@RequestMapping("/contract/residence")
public class ContractResidenceController extends IBaseController<ContractResidenceBO,ContractResidenceVO,ContractInfo,ContractResidenceDTO>{

    @Autowired
    ContractResidenceBiz contractResidenceBiz;
    @Autowired
    ROOMDAOMapper roomdaoMapper;
    public ContractResidenceController(ContractResidenceServiceImpl service, Validator validator,RoomServiceImpl roomService,ContractResidenceBiz contractResidenceBiz) {
        super(service, validator, "contract_residence", new HeightenBaseControllerSupport() {
            @Override
            public void insertPageAfter(HttpServletRequest request, HttpServletResponse response) {
                BigDecimal roomId = new BigDecimal(request.getParameter("rid"));
                ROOMDAO roomDao = roomService.searchById(roomId);
                request.setAttribute("roomDao",roomDao);
            }
        });
    }
    @RequestMapping("/addContract")
    @Transactional(rollbackFor = Exception.class)
    @ResponseBody
    public String addContract(HttpServletRequest request, ContractInfo contractInfo, ContractFeeCategoryDAO contractFeeCategoryDAO) throws Exception{
        try {
            BigDecimal contractId = contractResidenceBiz.insertContractResidence(contractInfo);
            contractResidenceBiz.insertContractRoomInfo(contractInfo,contractId);
            String info = request.getParameter("info");
            List<Map> ts = toJSONList(info);
            for(int i = 0;i<ts.size();i++){
                Map map = new HashMap();
                map = ts.get(i);
                map.put("contractId",contractId);
                map.put("companyId",contractInfo.getCompanyId());
                map.put("htDate",contractInfo.getHtDate());
                contractResidenceBiz.insertContractFeesResidence(map,contractFeeCategoryDAO,request);
            }
            contractResidenceBiz.updateRoomStatus(new BigDecimal(contractInfo.getRoomId()));
        } catch (Exception e) {
            return ResultVo.error("新增失败");
        }
        return ResultVo.succeed();
    }
    @RequestMapping("/updatepage")
    @Transactional(rollbackFor = Exception.class)
    public String updatepage(HttpServletRequest request){
        BigDecimal roomId = new BigDecimal(request.getParameter("rid"));
        ROOMDAO roomdao = roomdaoMapper.selectByPrimaryKey(roomId);
        request.setAttribute("roomdao",roomdao);
        ContractInfo contractInfo =contractResidenceBiz.selectContractResidence(roomId);
        request.setAttribute("contractInfo",contractInfo);
        List<ContractFeeCategoryDAO> list = contractResidenceBiz.selectContractResidenceList(contractInfo.getId());
        request.setAttribute("rout",list);
        return "contract_residence/updatePage";
    }
}
