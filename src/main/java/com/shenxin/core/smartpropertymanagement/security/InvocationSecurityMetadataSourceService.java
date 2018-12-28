package com.shenxin.core.smartpropertymanagement.security;

import com.shenxin.core.smartpropertymanagement.persist.entity.SysFunctionDAO;
import com.shenxin.core.smartpropertymanagement.service.impl.FunctionServiceImpl;
import lombok.extern.slf4j.Slf4j;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.ConfigAttribute;
import org.springframework.security.access.SecurityConfig;
import org.springframework.security.web.FilterInvocation;
import org.springframework.security.web.access.intercept.FilterInvocationSecurityMetadataSource;
import org.springframework.security.web.util.matcher.AntPathRequestMatcher;
import org.springframework.stereotype.Service;

import javax.servlet.http.HttpServletRequest;
import java.util.*;

/**
 * @Author: gaobaozong
 * @Description: 加载url对应权限列表中的权限
 * @Date: Created in 2018/6/5 - 10:27
 * @Version: V1.0
 */
@Slf4j
@Service("invocationSecurityMetadataSourceService")
public class InvocationSecurityMetadataSourceService  implements
        FilterInvocationSecurityMetadataSource {

    @Autowired
    private FunctionServiceImpl permissionDao;

    private volatile HashMap<String, Collection<ConfigAttribute>> map = null;

    public void reloadResource(){
        map = new HashMap<>();
        Collection<ConfigAttribute> array;
        ConfigAttribute cfg;
        List<SysFunctionDAO> permissions = permissionDao.search(null);
        for(SysFunctionDAO permission : permissions) {
            String funcUri = permission.getFuncUri();
            if(StringUtils.isBlank(funcUri)) continue;
            String[] split = funcUri.split("[?]");
            String key = split[0];
            array = map.get(key);
            if(array == null){
                array = new ArrayList<>();
                map.put(key, array);
            }

            String code = permission.getAuthCode();
            if(StringUtils.isNotBlank(code)){
                cfg = new SecurityConfig(permission.getAuthCode());
                array.add(cfg);
            }
        }
        log.info("reloadResource:{}",map);
    }

    /**
     * 加载uri所对应的权限集合
     */
    public synchronized void loadResourceDefine(){
        if(map != null) return;
        reloadResource();
    }

    /**
     * 找到uri所对应权限列表则返回，否则表示uri没有在security的保护下，允许访问
     * @param object
     * @return
     * @throws IllegalArgumentException
     */
    @Override
    public Collection<ConfigAttribute> getAttributes(Object object) throws IllegalArgumentException {
        if(map == null) loadResourceDefine();

        HttpServletRequest request = ((FilterInvocation) object).getHttpRequest();
        AntPathRequestMatcher matcher;
        String resUrl;
        for(Iterator<String> iter = map.keySet().iterator(); iter.hasNext(); ) {
            resUrl = iter.next();
            matcher = new AntPathRequestMatcher(resUrl);
            if(matcher.matches(request)) {
                return map.get(resUrl);
            }
        }
        return null;
    }

    @Override
    public Collection<ConfigAttribute> getAllConfigAttributes() {
        return null;
    }

    //如果为真则说明支持当前格式类型,才会到上面的 getAttributes 方法中
    @Override
    public boolean supports(Class<?> clazz) {
        return true;
    }
}