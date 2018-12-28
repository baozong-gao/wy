package com.shenxin.core.smartpropertymanagement.security;

import lombok.extern.slf4j.Slf4j;
import org.springframework.security.access.AccessDecisionManager;
import org.springframework.security.access.AccessDeniedException;
import org.springframework.security.access.ConfigAttribute;
import org.springframework.security.authentication.InsufficientAuthenticationException;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.stereotype.Service;

import java.util.Collection;
import java.util.Iterator;

/**
 * @Author: gaobaozong
 * @Description: 权限管理器
 * @Date: Created in 2018/6/4 - 18:28
 * @Version: V1.0
 */
@Slf4j
@Service
public class DecisionManager implements AccessDecisionManager{

    /**
      *  @Author: gaobaozong
      *  @Description:  判断是否拥有权限
      *  @Date: Created in 2018/6/5 - 10:02
      *  @param:  authentication 是UserDetailsService中GrantedAuthority的集合
      *  @param:  object 是请求信息 , HttpServletRequest request = ((FilterInvocation) object).getHttpRequest();
      *  @param:  configAttributes 是FilterInvocationSecurityMetadataSource 的getAttributes(Object object)这个方法返回的结果
      *  @return: 
      */
    @Override
    public void decide(Authentication authentication, Object object, Collection<ConfigAttribute> configAttributes) throws AccessDeniedException, InsufficientAuthenticationException {

        if(null== configAttributes || configAttributes.size() <=0) {
            return;
        }
        ConfigAttribute c;
        String needRole;
        for(Iterator<ConfigAttribute> iter = configAttributes.iterator(); iter.hasNext(); ) {
            c = iter.next();
            needRole = c.getAttribute();  //url的角色
            for(GrantedAuthority ga : authentication.getAuthorities()) { //当前登入用户的角色
                if(needRole.trim().equals(ga.getAuthority())) {
                    log.info("有权限:{}\n{}\n{}",c,ga,authentication.getAuthorities());
                    return;
                }
            }
        }
        log.info("没有权限:{}",authentication.getAuthorities());
        throw new AccessDeniedException("没有权限");
    }

    @Override
    public boolean supports(ConfigAttribute attribute) {
        return true;
    }

    @Override
    public boolean supports(Class<?> clazz) {
        return true;
    }
}
