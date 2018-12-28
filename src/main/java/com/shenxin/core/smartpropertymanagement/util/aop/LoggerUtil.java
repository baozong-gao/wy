package com.shenxin.core.smartpropertymanagement.util.aop;

import com.shenxin.core.smartpropertymanagement.persist.entity.SysLoggerDAO;
import com.shenxin.core.smartpropertymanagement.persist.entity.SysUsrDAO;
import com.shenxin.core.smartpropertymanagement.security.AnyUser;
import com.shenxin.core.smartpropertymanagement.service.impl.SysLoggerServiceImpl;
import com.shenxin.core.smartpropertymanagement.util.ResultVo;
import lombok.extern.slf4j.Slf4j;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Component;
import org.springframework.web.context.request.RequestAttributes;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;

import javax.servlet.http.HttpServletRequest;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

/**
 * @Author: gaobaozong
 * @Description: 统一日志记录
 * @Date: Created in 2018/6/26 - 10:14
 * @Version: V1.0
 */
@Slf4j
@Aspect
@Component
public class LoggerUtil {

    @Autowired
    SysLoggerServiceImpl loggerService;

    @Around("execution(* com.shenxin.core.smartpropertymanagement.controller..*(..))")
    public Object method(ProceedingJoinPoint pjp) throws Throwable {
        System.out.println("=====Aspect处理=======");
        Object[] args = pjp.getArgs();
        for (Object arg : args) {
            System.out.println("参数为:" + arg);
        }
        long start = System.currentTimeMillis();
        Object object = pjp.proceed();
        System.out.println("Aspect 耗时:" + (System.currentTimeMillis() - start));

        String ip = "",uri = "",status = "";
        try{
            RequestAttributes ra = RequestContextHolder.getRequestAttributes();
            ServletRequestAttributes sra = (ServletRequestAttributes) ra;
            HttpServletRequest request = sra.getRequest();
            ip = getIPAddress(request);
            uri = request.getRequestURI();

            if(object instanceof String && !((String)object).contains("Page") && !((String)object).contains("index") ){
                status = ((String)object).contains(ResultVo.SUCCEED_CODE) ? "成功" : "失败";
            }

        }catch (Exception e){}

        try {
            AnyUser user = (AnyUser) SecurityContextHolder.getContext().getAuthentication().getPrincipal();
            SysUsrDAO userDao = user.getUser();
            SysLoggerDAO logger = new SysLoggerDAO();
            logger.setCompanyId(userDao.getCompanyId());
            logger.setUserId(userDao.getId());
            logger.setLoginId(userDao.getLoginId());
            logger.setFuncAction( pjp.toShortString());
            logger.setFuncClass(pjp.getTarget().getClass().getSimpleName());
            logger.setOperateDate(LocalDate.now().format(DateTimeFormatter.ofPattern("yyyyMMdd")));
            logger.setOperateTime(LocalTime.now().format(DateTimeFormatter.ofPattern("HHmmss")));
            logger.setOperateResult(status);
            logger.setOperateIp(ip);
            logger.setFuncUrl(uri);
            logger.setRemark("由LoggerUtil记录");
            loggerService.insert(logger);

            log.info("user {} get {}.{} use {} ns.", user.getUser().getLoginId(), pjp.getTarget().getClass().getSimpleName(), pjp.toShortString(), (System.currentTimeMillis() - start));
        }catch (Exception e){}
        return object;
    }


    public static String getIPAddress(HttpServletRequest request) {
        String ip = null;

        //X-Forwarded-For：Squid 服务代理
        String ipAddresses = request.getHeader("X-Forwarded-For");

        if (ipAddresses == null || ipAddresses.length() == 0 || "unknown".equalsIgnoreCase(ipAddresses)) {
            //Proxy-Client-IP：apache 服务代理
            ipAddresses = request.getHeader("Proxy-Client-IP");
        }

        if (ipAddresses == null || ipAddresses.length() == 0 || "unknown".equalsIgnoreCase(ipAddresses)) {
            //WL-Proxy-Client-IP：weblogic 服务代理
            ipAddresses = request.getHeader("WL-Proxy-Client-IP");
        }

        if (ipAddresses == null || ipAddresses.length() == 0 || "unknown".equalsIgnoreCase(ipAddresses)) {
            //HTTP_CLIENT_IP：有些代理服务器
            ipAddresses = request.getHeader("HTTP_CLIENT_IP");
        }

        if (ipAddresses == null || ipAddresses.length() == 0 || "unknown".equalsIgnoreCase(ipAddresses)) {
            //X-Real-IP：nginx服务代理
            ipAddresses = request.getHeader("X-Real-IP");
        }

        //有些网络通过多层代理，那么获取到的ip就会有多个，一般都是通过逗号（,）分割开来，并且第一个ip为客户端的真实IP
        if (ipAddresses != null && ipAddresses.length() != 0) {
            ip = ipAddresses.split(",")[0];
        }

        //还是不能获取到，最后再通过request.getRemoteAddr();获取
        if (ip == null || ip.length() == 0 || "unknown".equalsIgnoreCase(ipAddresses)) {
            ip = request.getRemoteAddr();
        }
        return ip;
    }

}
