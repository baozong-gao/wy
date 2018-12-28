package com.shenxin.core.smartpropertymanagement.controller.impl;

import com.shenxin.core.smartpropertymanagement.controller.HeightenBaseControllerSupport;
import com.shenxin.core.smartpropertymanagement.controller.IBaseController;
import com.shenxin.core.smartpropertymanagement.domain.bo.EmployeeInfoBO;
import com.shenxin.core.smartpropertymanagement.domain.dto.EmployeeInfoDTO;
import com.shenxin.core.smartpropertymanagement.domain.vo.EmployeeInfoVO;
import com.shenxin.core.smartpropertymanagement.persist.entity.CompanyDepartmentDAO;
import com.shenxin.core.smartpropertymanagement.persist.entity.EmployeeInfo;
import com.shenxin.core.smartpropertymanagement.persist.entity.SysRoleDAO;
import com.shenxin.core.smartpropertymanagement.persist.entity.SysUsrDAO;
import com.shenxin.core.smartpropertymanagement.security.AnyUser;
import com.shenxin.core.smartpropertymanagement.service.biz.EmployeeInfoBiz;
import com.shenxin.core.smartpropertymanagement.service.impl.EmployeeInfoServiceImpl;
import com.shenxin.core.smartpropertymanagement.util.ResultVo;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Controller;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.validation.Validator;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.math.BigDecimal;
import java.util.List;

/**
 * @author Lancelot cailuyuan
 * @create 2018-07-04 16:12
 * @description
 */
@Controller
@RequestMapping("/employee")
public class EmployeeController extends IBaseController<EmployeeInfoBO,EmployeeInfoVO,EmployeeInfo,EmployeeInfoDTO> {
    @Autowired
    public EmployeeController(EmployeeInfoServiceImpl service, Validator validator,EmployeeInfoBiz employeeInfoBiz) {
        super(service, validator, "employee", new HeightenBaseControllerSupport() {
            @Override
            public void updatePageAfter(HttpServletRequest request, HttpServletResponse response, Object dao) {
                EmployeeInfo employeeInfo = (EmployeeInfo)dao;
                BigDecimal employeeId = employeeInfo.getId();
                // 获取备注 为什么要特意取remark?
                SysUsrDAO sysUsrDAO = employeeInfoBiz.selectRemarkByEmployeeId(employeeId);
                if(sysUsrDAO!=null){
                    request.setAttribute("remark",sysUsrDAO);
                    BigDecimal userId =sysUsrDAO.getId();
                    // 获取userId对应的角色列表
                    List roles = service.selectRoleByUserId(userId);
                    request.setAttribute("roles",roles);
                }
            }

            @Override
            public void updateAfter(HttpServletRequest request, HttpServletResponse response, Object... param) {
                EmployeeInfo employeeInfo = (EmployeeInfo)param[0];
                String roles =request.getParameter("roles");
                if(StringUtils.isNotBlank(roles)){
                    employeeInfoBiz.selectUserByEmployeeId(employeeInfo,request);
                }
                String platformAccount = request.getParameter("platformAccount");
                if("N".equals(platformAccount)){
                    // 如果不需要开通平台用户,则删除用户.
                    employeeInfoBiz.deleteUser(employeeInfo);
                }
            }

            @Override
            public void deleteAfter(HttpServletRequest request, HttpServletResponse response, BigDecimal id) {
                employeeInfoBiz.deleteUserByEmployeeId(id);
            }
        });

    }
    @Autowired
    EmployeeInfoBiz employeeInfoBiz;

    @RequestMapping(value = "selectDepartment",method= RequestMethod.GET)
    @ResponseBody
    public List selectDepartmentByCompanyId(HttpServletRequest request,
                                              HttpServletResponse response){
        AnyUser userDetails = (AnyUser) SecurityContextHolder.getContext().getAuthentication().getPrincipal();
        SysUsrDAO user = userDetails.getUser();
        BigDecimal companyId = user.getCompanyId();
        // 获取公司的部门信息
        List<CompanyDepartmentDAO> list = employeeInfoBiz.selectDepartmentByCompanyId(companyId);
        return list;
    }

    @RequestMapping(value = "/insertEmployee",method = RequestMethod.GET)
    @ResponseBody
    @Transactional(rollbackFor = Exception.class)
    public String insertEmployee(HttpServletRequest request,
                               HttpServletResponse response)throws Exception{
            employeeInfoBiz.insertEmployee(request);
            return ResultVo.succeed();
    }

    @RequestMapping(value = "/selectRoleByCompanyId",method = RequestMethod.GET)
    @ResponseBody
    public List<SysRoleDAO> selectRoleByCompanyId(HttpServletRequest request,
                                            HttpServletResponse response){
        AnyUser userDetails = (AnyUser) SecurityContextHolder.getContext().getAuthentication().getPrincipal();
        SysUsrDAO user = userDetails.getUser();
        BigDecimal companyId = user.getCompanyId();
        // 获取公司的角色列表
        List<SysRoleDAO> roleList = employeeInfoBiz.selectRoleByCompanyId(companyId);
        return roleList;
    }

}
