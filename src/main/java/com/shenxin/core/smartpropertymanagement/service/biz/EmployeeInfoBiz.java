package com.shenxin.core.smartpropertymanagement.service.biz;

import com.shenxin.core.smartpropertymanagement.domain.SpringConfigConstant;
import com.shenxin.core.smartpropertymanagement.domain.SystemConstant;
import com.shenxin.core.smartpropertymanagement.persist.entity.*;
import com.shenxin.core.smartpropertymanagement.persist.mapper.EmployeeInfoMapper;
import com.shenxin.core.smartpropertymanagement.persist.mapper.RLSysUsrRoleDAOMapper;
import com.shenxin.core.smartpropertymanagement.persist.mapper.SysUsrDAOMapper;
import com.shenxin.core.smartpropertymanagement.security.AnyUser;
import com.shenxin.core.smartpropertymanagement.util.EncryptUtils;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Service;

import javax.servlet.http.HttpServletRequest;
import java.math.BigDecimal;
import java.util.List;

/**
 * @author Lancelot cailuyuan
 * @create 2018-07-04 22:32
 * @description
 */
@Service
public class EmployeeInfoBiz {
    @Autowired
    EmployeeInfoMapper employeeInfoMapper;

    @Autowired
    SysUsrDAOMapper sysUsrDAOMapper;

    @Autowired
    RLSysUsrRoleDAOMapper rlSysUsrRoleDAOMapper;

    public List<CompanyDepartmentDAO> selectDepartmentByCompanyId(BigDecimal companyId){
        List<CompanyDepartmentDAO> list = employeeInfoMapper.selectDepartMentByCompanyId(companyId);
        return list;
    }

    public void insertEmployee(HttpServletRequest request){
        AnyUser userDetails = (AnyUser) SecurityContextHolder.getContext().getAuthentication().getPrincipal();
        SysUsrDAO user = userDetails.getUser();
        BigDecimal companyId = user.getCompanyId();
        EmployeeInfo employeeInfo = new EmployeeInfo();
        employeeInfo.setCompanyId(companyId);
        employeeInfo.setDepartmentId(new BigDecimal(request.getParameter("departmentId")));
        if(SpringConfigConstant.PLATEFORM_COMPANYID.equals(companyId.toString())){
            employeeInfo.setEmployeeType("INNER");
        }else{
            employeeInfo.setEmployeeType("OUTTER");
        }
        employeeInfo.setName(request.getParameter("name"));
        employeeInfo.setMobile(request.getParameter("mobile"));
        if(StringUtils.isNotBlank(request.getParameter("age"))){
            employeeInfo.setAge(new BigDecimal(request.getParameter("age")));
        }
        employeeInfo.setSex(request.getParameter("sex"));
        employeeInfo.setEducation(request.getParameter("education"));
        employeeInfo.setDepartmentChairman(request.getParameter("departmentChairman"));
        String platformAccount = request.getParameter("platformAccount");
        if("Y".equals(platformAccount)){
            employeeInfo.setLoginId(employeeInfo.getMobile());
            employeeInfo.setLoginPasswd(EncryptUtils.encryptPwd("aaa111"));
            //一时还找不到密码盐值，后期需补充
            employeeInfo.setPassswdSalt("");
            employeeInfoMapper.insertEmployee(employeeInfo);
            BigDecimal employeeId = employeeInfo.getId();
            SysUsrDAO sysUsrDAO = new SysUsrDAO();
            sysUsrDAO.setCompanyId(companyId);
            sysUsrDAO.setUserType(SystemConstant.FUNC_TYPE_COMPANY);
            sysUsrDAO.setUserTypeId(employeeId);
            sysUsrDAO.setUserName(employeeInfo.getName());
            sysUsrDAO.setLoginId(employeeInfo.getLoginId());
            sysUsrDAO.setPasswd(employeeInfo.getLoginPasswd());
            sysUsrDAO.setMobile(employeeInfo.getMobile());
            sysUsrDAO.setRemark(request.getParameter("remark"));
            sysUsrDAOMapper.insertSelective(sysUsrDAO);
            BigDecimal userId =sysUsrDAO.getId();
            String roles =request.getParameter("roles");
            String[] role = roles.split(",");
            for(int i=0;i<role.length;i++){
                BigDecimal roleId = BigDecimal.valueOf(Long.parseLong(role[i]));
                RLSysUsrRoleDAO rlSysUsrRoleDAO = new RLSysUsrRoleDAO();
                rlSysUsrRoleDAO.setRoleId(roleId);
                rlSysUsrRoleDAO.setUserId(userId);
                rlSysUsrRoleDAOMapper.insert(rlSysUsrRoleDAO);
            }
        }else{
            employeeInfoMapper.insertEmployee(employeeInfo);
        }
    }

    public List<SysRoleDAO> selectRoleByCompanyId(BigDecimal companyId){
        List<SysRoleDAO> list = employeeInfoMapper.selectRoleByCompanyId(companyId);
        return list;
    }

    public SysUsrDAO selectRemarkByEmployeeId(BigDecimal employeeId){
        SysUsrDAO sysUsrDAO = employeeInfoMapper.selectRemarkByEmployeeId(employeeId);
        return sysUsrDAO;
    }

    public SysUsrDAO selectUserByEmployeeId(EmployeeInfo employeeInfo,HttpServletRequest request){
        AnyUser userDetails = (AnyUser) SecurityContextHolder.getContext().getAuthentication().getPrincipal();
        SysUsrDAO user = userDetails.getUser();
        BigDecimal companyId = user.getCompanyId();
        SysUsrDAO sysUsrDAO1 = employeeInfoMapper.selectUserByEmployeeId(employeeInfo.getId());
        String roles =request.getParameter("roles");
        String[] role = roles.split(",");
        // 获取员工和 关系
        // 如果用户不存在, 则新增用户, 建立角色关系.
        // 如果存在,则删除旧角色关系,并新增角色关系.
        if(sysUsrDAO1==null){ // 有角色,可能没有用户. 则新建用户.
            SysUsrDAO sysUsrDAO = new SysUsrDAO();
            sysUsrDAO.setCompanyId(companyId);
            sysUsrDAO.setUserType(SystemConstant.FUNC_TYPE_COMPANY);
            sysUsrDAO.setUserTypeId(employeeInfo.getId());
            sysUsrDAO.setUserName(employeeInfo.getName());
            sysUsrDAO.setLoginId(employeeInfo.getMobile());
            sysUsrDAO.setPasswd(EncryptUtils.encryptPwd("aaa111"));
            sysUsrDAO.setMobile(employeeInfo.getMobile());
            sysUsrDAO.setRemark(request.getParameter("remark"));
            sysUsrDAOMapper.insertSelective(sysUsrDAO);
            BigDecimal userId =sysUsrDAO.getId();
            for(int i=0;i<role.length;i++){
                BigDecimal roleId = BigDecimal.valueOf(Long.parseLong(role[i]));
                RLSysUsrRoleDAO rlSysUsrRoleDAO = new RLSysUsrRoleDAO();
                rlSysUsrRoleDAO.setRoleId(roleId);
                rlSysUsrRoleDAO.setUserId(userId);
                rlSysUsrRoleDAOMapper.insert(rlSysUsrRoleDAO);
            }
        }else{
            //批量删除角色，并新增
            BigDecimal userId = sysUsrDAO1.getId();
            rlSysUsrRoleDAOMapper.deleteUserRole(userId);
            for(int i=0;i<role.length;i++){
                BigDecimal roleId = BigDecimal.valueOf(Long.parseLong(role[i]));
                RLSysUsrRoleDAO rlSysUsrRoleDAO = new RLSysUsrRoleDAO();
                rlSysUsrRoleDAO.setRoleId(roleId);
                rlSysUsrRoleDAO.setUserId(sysUsrDAO1.getId());
                rlSysUsrRoleDAOMapper.insert(rlSysUsrRoleDAO);
            }
        }
        return null;
    }

    public void deleteUser(EmployeeInfo employeeInfo){
        BigDecimal employeeId = employeeInfo.getId();
        employeeInfoMapper.deletUser(employeeId);
    }

    public void deleteUserByEmployeeId(BigDecimal employeeId){
        employeeInfoMapper.deletUser(employeeId);
    }
}
