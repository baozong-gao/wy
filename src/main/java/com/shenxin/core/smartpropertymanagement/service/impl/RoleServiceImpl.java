package com.shenxin.core.smartpropertymanagement.service.impl;

import com.shenxin.core.smartpropertymanagement.domain.SpringConfigConstant;
import com.shenxin.core.smartpropertymanagement.domain.SystemConstant;
import com.shenxin.core.smartpropertymanagement.domain.em.IdType;
import com.shenxin.core.smartpropertymanagement.domain.vo.FunctionVO;
import com.shenxin.core.smartpropertymanagement.persist.entity.*;
import com.shenxin.core.smartpropertymanagement.persist.mapper.RLSysRoleFuncDAOMapper;
import com.shenxin.core.smartpropertymanagement.persist.mapper.RLSysUsrRoleDAOMapper;
import com.shenxin.core.smartpropertymanagement.persist.mapper.SysFunctionDAOMapper;
import com.shenxin.core.smartpropertymanagement.persist.mapper.SysRoleDAOMapper;
import com.shenxin.core.smartpropertymanagement.security.AnyUser;
import com.shenxin.core.smartpropertymanagement.service.IBaseService;
import com.shenxin.core.smartpropertymanagement.service.IdGenerateService;
import com.shenxin.core.smartpropertymanagement.util.BeanUtils;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.math.BigDecimal;
import java.util.HashSet;
import java.util.List;
import java.util.Optional;
import java.util.Set;
import java.util.stream.Collectors;

/**
 * @Author: gaobaozong
 * @Description: 角色服务
 * @Date: Created in 2017/12/19 - 10:50
 * @Version: V1.0-SNAPSHOT
 */
@Slf4j
@Service("roleService")
public class RoleServiceImpl extends IBaseService<SysRoleDAO, SysRoleDAOExample, SysRoleDAOMapper> {


    @Autowired
    RLSysRoleFuncDAOMapper rlSysRoleFuncDAOMapper;

    @Autowired
    SysFunctionDAOMapper sysFunctionDAOMapper;

    @Autowired
    RLSysUsrRoleDAOMapper rlSysUsrRoleDAOMapper;


    @Autowired
    public RoleServiceImpl(SysRoleDAOMapper mapper, IdGenerateService idGenerateService){
        super(mapper, idGenerateService, IdType.ROLE);
    }

    public List getFunctionByRole(BigDecimal id) {
        Set<String> roleFuncIDs = null;
        if (id != null) {
            RLSysRoleFuncDAOExample example = new RLSysRoleFuncDAOExample();
            example.createCriteria().andRoleIdEqualTo(id);
            List<RLSysRoleFuncDAO> roleFunc = rlSysRoleFuncDAOMapper.selectByExample(example);
            roleFuncIDs = roleFunc.stream().map(rf -> rf.getFuncId().toString()).collect(Collectors.toSet());
        }
        // 获取角色对应的所有权限,否则返回空权限集合
        Set<String> _roleFuncIDs = Optional.ofNullable(roleFuncIDs).orElse(new HashSet<>());

        SysFunctionDAOExample funcExam = null;
        AnyUser userDetails = (AnyUser) SecurityContextHolder.getContext().getAuthentication().getPrincipal();
        SysUsrDAO user = userDetails.getUser();
        if(! SpringConfigConstant.PLATEFORM_COMPANYID.equals(user.getCompanyId().toString())){
            funcExam = new SysFunctionDAOExample();
            funcExam.createCriteria().andFuncTypeEqualTo(SystemConstant.FUNC_TYPE_COMPANY);
        }
        List<SysFunctionDAO> allFunction = sysFunctionDAOMapper.selectByExample(funcExam);
        List<FunctionVO> result = BeanUtils.copyList(allFunction, FunctionVO.class);
        // 如果是平台公司,就获取所有权限,否则获取当前公司权限.
        // 并关联当前角色,如果没有角色,则都没有关联.
        result.stream().forEach(func -> func.setAuth(_roleFuncIDs.contains(func.getId().toString())));

        return result;
    }

    @Transactional
    public int upFunctionOnRole(BigDecimal id, List<BigDecimal> func) {
        RLSysRoleFuncDAOExample example = new RLSysRoleFuncDAOExample();
        example.createCriteria().andRoleIdEqualTo(id);
        rlSysRoleFuncDAOMapper.deleteByExample(example);

        Optional.ofNullable(func).ifPresent(funcs -> {
            funcs.stream().forEach(fun -> {
                RLSysRoleFuncDAO dao = new RLSysRoleFuncDAO();
                dao.setFuncId(fun);
                dao.setRoleId(id);
                rlSysRoleFuncDAOMapper.insert(dao);
            });
        });
        return 0;
    }

    public int insertRLUserRole(RLSysUsrRoleDAO rlSysUsrRoleDAO){
        return rlSysUsrRoleDAOMapper.insert(rlSysUsrRoleDAO);
    }
}
