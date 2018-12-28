package com.shenxin.core.smartpropertymanagement.service.impl;

import com.shenxin.core.smartpropertymanagement.domain.em.IdType;
import com.shenxin.core.smartpropertymanagement.domain.vo.SysRoleVO;
import com.shenxin.core.smartpropertymanagement.persist.entity.*;
import com.shenxin.core.smartpropertymanagement.persist.mapper.RLSysUsrRoleDAOMapper;
import com.shenxin.core.smartpropertymanagement.persist.mapper.SysRoleDAOMapper;
import com.shenxin.core.smartpropertymanagement.persist.mapper.SysUsrDAOMapper;
import com.shenxin.core.smartpropertymanagement.service.IBaseService;
import com.shenxin.core.smartpropertymanagement.service.IdGenerateService;
import com.shenxin.core.smartpropertymanagement.util.BeanUtils;
import com.shenxin.core.smartpropertymanagement.util.EncryptUtils;
import com.shenxin.core.smartpropertymanagement.util.UserUtil;
import com.shenxin.core.smartpropertymanagement.util.exception.PersistentException;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
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
 * @Description: 用户信息服务
 * @Date: Created in 2017/12/21 - 14:07
 * @Version: V1.0-SNAPSHOT
 */
@Service("userService")
public class UserServiceImpl extends IBaseService<SysUsrDAO, SysUsrDAOExample, SysUsrDAOMapper> {


    @Autowired
    SysRoleDAOMapper roleDAOMapper;

    @Autowired
    RLSysUsrRoleDAOMapper rlSysUsrRoleDAOMapper;

    @Autowired
    SysUsrDAOMapper sysUsrDAOMapper;

    @Autowired
    public UserServiceImpl(SysUsrDAOMapper mapper, IdGenerateService idGenerateService){
        super(mapper, idGenerateService, IdType.USER);
    }


    public SysUsrDAO getByName(String name) throws PersistentException{
        if(StringUtils.isBlank(name)){
            throw new  PersistentException("用户名输入不合法");
        }

        SysUsrDAO bo = new SysUsrDAO();
        bo.setLoginId(name);
        List<SysUsrDAO> users = search(bo);

        if(users == null || users.size() != 1){
            throw new PersistentException("用户不存在或用户名重复");
        }

        return users.get(0);
    }

    public List getRoleByUserId(BigDecimal id) {
        RLSysUsrRoleDAOExample example = new RLSysUsrRoleDAOExample();
        RLSysUsrRoleDAOExample.Criteria criteria = example.createCriteria();
        Set<BigDecimal> roleIDs = new HashSet<BigDecimal>();
        if (id != null) {
            // 只有加id,之后筛选才有意义.
            criteria.andUserIdEqualTo(id);

            // 通过userId获取所有角色
            List<RLSysUsrRoleDAO> ur = rlSysUsrRoleDAOMapper.selectByExample(example);
            // 收集id为一个集合
            roleIDs = ur.stream().map(rf -> rf.getRoleId()).collect(Collectors.toSet());
        }

        SysRoleDAOExample example1 = new SysRoleDAOExample();
        SysRoleDAOExample.Criteria criteria1 = example1.createCriteria();
        BigDecimal companyId =  UserUtil.getUserCompanyId();
        if(companyId != null){
            criteria1.andCompanyIdEqualTo(companyId);
        }

        // 找出公司内所有角色
        List<SysRoleDAO> allRoles = roleDAOMapper.selectByExample(example1);
        List<SysRoleVO> result = BeanUtils.copyList(allRoles, SysRoleVO.class);
        // 遍历角色,看当前角色是否是用户的角色.

        Set<BigDecimal> finalRoleIDs = roleIDs;
        result.stream().forEach(role -> role.setAuth(finalRoleIDs.contains(role.getId())));

        return result;
    }

    @Transactional(rollbackFor = Exception.class)
    public void upRoleOnUser(BigDecimal uid, List<BigDecimal> rids) {
        RLSysUsrRoleDAOExample example = new RLSysUsrRoleDAOExample();
        example.createCriteria().andUserIdEqualTo(uid);
        // 删除当前用户的角色关系
        rlSysUsrRoleDAOMapper.deleteByExample(example);

        Optional.ofNullable(rids).ifPresent((rid) -> {
            rid.stream().forEach(_rid -> {
                RLSysUsrRoleDAO record = new RLSysUsrRoleDAO();
                record.setRoleId(_rid);
                record.setUserId(uid);
                // 添加当前用户的所有角色关系
                rlSysUsrRoleDAOMapper.insert(record);
            });
        });
    }

    public boolean isPwdSame(BigDecimal userId, String pwd) {
        return Optional.ofNullable(userId)
                .map(_id -> searchById(_id))
                .map(user -> user.getPasswd())
                .filter(_pwd -> _pwd.equals(EncryptUtils.encryptPwd(pwd)))
                .map(tmp -> true)
                .orElse(false);
    }

    public void resetPasswords(BigDecimal userId){
        SysUsrDAO sysUsrDAO = new SysUsrDAO();
        sysUsrDAO.setId(userId);
        sysUsrDAO.setPasswd(EncryptUtils.encryptPwd("aaa111"));
        sysUsrDAOMapper.resetPasswords(sysUsrDAO);
    }

    public void frozenAccount(BigDecimal userId){
        sysUsrDAOMapper.frozenAccount(userId);
    }

    public void unfreezeAccount(BigDecimal userId){
        sysUsrDAOMapper.unfreezeAccount(userId);
    };
}
