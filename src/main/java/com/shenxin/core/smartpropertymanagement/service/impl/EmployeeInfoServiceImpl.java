package com.shenxin.core.smartpropertymanagement.service.impl;

import com.shenxin.core.smartpropertymanagement.domain.em.IdType;
import com.shenxin.core.smartpropertymanagement.domain.vo.SysRoleVO;
import com.shenxin.core.smartpropertymanagement.persist.entity.*;
import com.shenxin.core.smartpropertymanagement.persist.mapper.EmployeeInfoMapper;
import com.shenxin.core.smartpropertymanagement.persist.mapper.PropertyInfoMapper;
import com.shenxin.core.smartpropertymanagement.persist.mapper.RLSysUsrRoleDAOMapper;
import com.shenxin.core.smartpropertymanagement.persist.mapper.SysRoleDAOMapper;
import com.shenxin.core.smartpropertymanagement.service.IBaseService;
import com.shenxin.core.smartpropertymanagement.service.IdGenerateService;
import com.shenxin.core.smartpropertymanagement.util.BeanUtils;
import com.shenxin.core.smartpropertymanagement.util.UserUtil;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

/**
 * @author Lancelot cailuyuan
 * @create 2018-07-04 17:23
 * @description
 */
@Slf4j
@Service("employeeInfoService")
public class EmployeeInfoServiceImpl extends IBaseService<EmployeeInfo,EmployeeInfoExample,EmployeeInfoMapper> {

    @Autowired
    SysRoleDAOMapper roleDAOMapper;

    @Autowired
    RLSysUsrRoleDAOMapper rlSysUsrRoleDAOMapper;

    public EmployeeInfoServiceImpl(EmployeeInfoMapper mapper, IdGenerateService idGenerate) {
        super(mapper, idGenerate, IdType.EMPLOYEE);
    }

    public List selectRoleByUserId(BigDecimal userId){
        RLSysUsrRoleDAOExample example = new RLSysUsrRoleDAOExample();
        RLSysUsrRoleDAOExample.Criteria criteria = example.createCriteria();
        if (userId != null) {
            criteria.andUserIdEqualTo(userId);
        }

        List<RLSysUsrRoleDAO> ur = rlSysUsrRoleDAOMapper.selectByExample(example);
        Set<BigDecimal> roleIDs = ur.stream().map(rf -> rf.getRoleId()).collect(Collectors.toSet());

        SysRoleDAOExample example1 = new SysRoleDAOExample();
        SysRoleDAOExample.Criteria criteria1 = example1.createCriteria();
        BigDecimal companyId =  UserUtil.getUserCompanyId();
        if(companyId != null){
            criteria1.andCompanyIdEqualTo(companyId);
        }
        List<SysRoleDAO> allRoles = roleDAOMapper.selectByExample(example1);
        List<SysRoleVO> result = BeanUtils.copyList(allRoles, SysRoleVO.class);
        result.stream().forEach(role -> role.setAuth(roleIDs.contains(role.getId())));

        return result;
    }
}
