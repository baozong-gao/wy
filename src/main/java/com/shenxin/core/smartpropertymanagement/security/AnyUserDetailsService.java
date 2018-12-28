package com.shenxin.core.smartpropertymanagement.security;

import com.shenxin.core.smartpropertymanagement.domain.SystemConstant;
import com.shenxin.core.smartpropertymanagement.persist.entity.SysFunctionDAO;
import com.shenxin.core.smartpropertymanagement.persist.entity.SysUsrDAO;
import com.shenxin.core.smartpropertymanagement.service.UserAuthService;
import com.shenxin.core.smartpropertymanagement.service.impl.UserServiceImpl;
import com.shenxin.core.smartpropertymanagement.util.exception.PersistentException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.LockedException;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/**
 * @Author: gaobaozong
 * @Description: 加载用户 权限 密码
 * @Date: Created in 2018/6/4 - 17:10
 * @Version: V1.0
 */
@Service
public class AnyUserDetailsService implements UserDetailsService {

    @Autowired
    UserServiceImpl userService;

    @Autowired
    UserAuthService authService;


    @Override
    public UserDetails loadUserByUsername(String name) throws UsernameNotFoundException {
        SysUsrDAO user = null;
        try {
            user = userService.getByName(name);
        } catch (PersistentException e) {
            throw new UsernameNotFoundException(e.getMessage());
        }

        if (user == null) {
            throw new UsernameNotFoundException("用户不存在");
        }

        if (SystemConstant.STATUS_FREEZE.equals(user.getUserStatus())) {
            throw new LockedException("用户已冻结");
        }


        List<SimpleGrantedAuthority> authorities = new ArrayList<>();
        List<SysFunctionDAO> funs = authService.getAuthByUserId(user.getId());
        for (SysFunctionDAO fun : funs) {
            authorities.add(new SimpleGrantedAuthority(fun.getAuthCode()));
        }

        AnyUser anyUser = new AnyUser(name, user.getPasswd(), authorities);
        anyUser.setId(user.getId().longValue());
        anyUser.setNickname(user.getUserName());
        anyUser.setUser(user);


        return anyUser;
    }

    public void refreshAuth(){
        AnyUser userDetails = (AnyUser) SecurityContextHolder.getContext().getAuthentication().getPrincipal();
        Collection<GrantedAuthority> auths = new ArrayList<>(userDetails.getAuthorities());
        auths.clear();

        List<SimpleGrantedAuthority> authorities = new ArrayList<>();
        List<SysFunctionDAO> funs = authService.getAuthByUserId(new BigDecimal(userDetails.getId()));
        for (SysFunctionDAO fun : funs) {
            authorities.add(new SimpleGrantedAuthority(fun.getAuthCode()));
        }
        auths.addAll(authorities);
    }


}
