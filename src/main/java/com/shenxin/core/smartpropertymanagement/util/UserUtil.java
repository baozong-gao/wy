package com.shenxin.core.smartpropertymanagement.util;

import com.shenxin.core.smartpropertymanagement.domain.SpringConfigConstant;
import com.shenxin.core.smartpropertymanagement.persist.entity.SysUsrDAO;
import com.shenxin.core.smartpropertymanagement.security.AnyUser;
import org.springframework.security.core.context.SecurityContextHolder;

import java.math.BigDecimal;
import java.util.Optional;

/**
 * @Author: gaobaozong
 * @Description: 用户工具类
 * @Date: Created in 2018/7/4 - 16:23
 * @Version: V1.0
 */
public class UserUtil {

    public  static BigDecimal getUserCompanyId(){
        BigDecimal companyId = null;
        try {
            SysUsrDAO user = currentUser();
            companyId =  user.getCompanyId();
        }catch (Exception e){}
        return companyId;
    }

    public static SysUsrDAO currentUser(){
        AnyUser userDetails = (AnyUser) SecurityContextHolder.getContext().getAuthentication().getPrincipal();
        return  userDetails.getUser();
    }

    public static boolean isRoot(){
        SysUsrDAO user = currentUser();
        return Optional.ofNullable(user)
                .map(_u -> _u.getCompanyId())
                .map(BigDecimal::toString)
                .map(_c -> _c.equals(SpringConfigConstant.PLATEFORM_COMPANYID))
                .orElse(false);
    }

    public static boolean isNotRoot(){
        return ! isRoot();
    }
}
