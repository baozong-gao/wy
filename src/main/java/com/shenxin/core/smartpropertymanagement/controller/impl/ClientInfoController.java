package com.shenxin.core.smartpropertymanagement.controller.impl;

import com.shenxin.core.smartpropertymanagement.controller.HeightenBaseControllerSupport;
import com.shenxin.core.smartpropertymanagement.controller.IBaseController;
import com.shenxin.core.smartpropertymanagement.domain.SystemConstant;
import com.shenxin.core.smartpropertymanagement.domain.bo.ClientInfoBO;
import com.shenxin.core.smartpropertymanagement.domain.dto.ClientInfoDTO;
import com.shenxin.core.smartpropertymanagement.domain.vo.ClientInfoVO;
import com.shenxin.core.smartpropertymanagement.persist.entity.ClientAccountInfo;
import com.shenxin.core.smartpropertymanagement.persist.entity.ClientInfo;
import com.shenxin.core.smartpropertymanagement.service.biz.ClientInfoBiz;
import com.shenxin.core.smartpropertymanagement.service.impl.ClientInfoServiceImpl;
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


/**
 * @author Lancelot cailuyuan
 * @create 2018-07-13 10:18
 * @description
 */
@Slf4j
@Controller
@RequestMapping("/client")
public class ClientInfoController extends IBaseController<ClientInfoBO,ClientInfoVO,ClientInfo,ClientInfoDTO>{

    @Autowired
    ClientInfoBiz clientInfoBiz;

    public ClientInfoController(ClientInfoServiceImpl service, Validator validator,ClientInfoBiz clientInfoBiz) {
        super(service, validator, "client", new HeightenBaseControllerSupport() {

            @Override
            public void updatePageAfter(HttpServletRequest request, HttpServletResponse response, Object dao) {
                // 通过clientId 获取 客户帐号信息
                ClientInfo clientInfo = (ClientInfo)dao;
                BigDecimal clientId = clientInfo.getId();
                ClientAccountInfo clientAccountInfo = clientInfoBiz.selectClientAccount(clientId);
                request.setAttribute("clientAccount",clientAccountInfo);
            }

            @Override
            public void updateAfter(HttpServletRequest request, HttpServletResponse response, Object... param) throws Exception {
                // update client info之后 update账户相关信息
                ClientInfoDTO clientInfoDTO = (ClientInfoDTO) param[1];
                clientInfoBiz.updateClientAccountInfo(clientInfoDTO);
            }

            @Override
            public void searchDetailAfter(HttpServletRequest request, HttpServletResponse response, Object dao) {
                ClientInfo clientInfo = (ClientInfo) dao;
                BigDecimal clientId = clientInfo.getId();
                // 根据客户id,设置账户信息.
                ClientAccountInfo clientAccountInfo = clientInfoBiz.selectClientAccount(clientId);
                request.setAttribute("clientAccount",clientAccountInfo);
            }
        });
    }
    @RequestMapping("/insertClient") // 公司类型的客户添加
    @ResponseBody
    @Transactional(rollbackFor = Exception.class)
    public String insertClient(ClientInfo clientInfo, ClientAccountInfo clientAccountInfo){
        // 客户与客户账户一起新增,添加回滚
            clientInfoBiz.insertClient(clientInfo);
            BigDecimal id = clientInfo.getId();
            clientAccountInfo.setClientId(id);
            if("INDIVIDUAL".equals(clientInfo.getClientType())){
                clientAccountInfo.setAccountType(SystemConstant.CLIENT_TYPE_INDIVIDUAL);
            }else if("COMPANY".equals(clientInfo.getClientType())){
                clientAccountInfo.setAccountType(SystemConstant.CLIENT_TYPE_COMPANY);
            }
            clientInfoBiz.insertClinentAccount(clientAccountInfo);
            return ResultVo.succeed();
    }
    @RequestMapping("/insertClientPrivate") // 个人类型的客户添加
    @ResponseBody
    @Transactional(rollbackFor = Exception.class)
    public String insertClientPrivate(ClientInfo clientInfo, ClientAccountInfo clientAccountInfo){
        clientInfoBiz.insertClientPrivate(clientInfo);
        BigDecimal id = clientInfo.getId();
        clientAccountInfo.setClientId(id);
        if("INDIVIDUAL".equals(clientInfo.getClientType())){
            clientAccountInfo.setAccountType(SystemConstant.CLIENT_TYPE_INDIVIDUAL);
        }else if("COMPANY".equals(clientInfo.getClientType())){
            clientAccountInfo.setAccountType(SystemConstant.CLIENT_TYPE_COMPANY);
        }
        clientInfoBiz.insertClinentAccountPrivate(clientAccountInfo);
        return ResultVo.succeed();
    }
}
