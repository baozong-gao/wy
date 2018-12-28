package com.shenxin.core.smartpropertymanagement.util.aop;

import com.shenxin.core.smartpropertymanagement.domain.BaseField;
import com.shenxin.core.smartpropertymanagement.domain.bo.ContractTemplateBO;
import com.shenxin.core.smartpropertymanagement.persist.entity.SysUsrDAO;
import com.shenxin.core.smartpropertymanagement.security.AnyUser;
import com.shenxin.core.smartpropertymanagement.util.UserUtil;
import lombok.extern.slf4j.Slf4j;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Component;

import java.math.BigDecimal;
import java.util.Optional;

/**
 * @Author: gaobaozong
 * @Description: 公司隔离数据
 * @Date: Created in 2018/6/27 - 17:02
 * @Version: V1.0
 */
@Slf4j
@Aspect
@Component
public class CompanyInsulate {


    @Around("execution(* com.shenxin.core.smartpropertymanagement.controller..*(..))")
    public Object method(ProceedingJoinPoint pjp) throws Throwable {
        try {
            AnyUser userDetails = (AnyUser) SecurityContextHolder.getContext().getAuthentication().getPrincipal();
            SysUsrDAO user = userDetails.getUser();
            Object[] args = pjp.getArgs();
            for (Object arg : args) {
                if (arg instanceof BaseField ) {
                    log.info("CompanyInsulate:{}\n{}",pjp,pjp.toShortString());
                    if(UserUtil.isRoot() && !pjp.toShortString().contains("doAdd") && !pjp.toShortString().contains("batchAdd") && !(arg instanceof ContractTemplateBO)){
                        continue;
                    }else {
                        Optional.ofNullable(user)
                                .map(_u -> _u.getCompanyId())
                                .map(BigDecimal::toString)
                                .ifPresent(_companyId -> {
                                    ((BaseField) arg).setCompanyId(_companyId);
                                });
                    }
                }
            }
        } catch (Exception e) {
        }
        return pjp.proceed();
    }

}
