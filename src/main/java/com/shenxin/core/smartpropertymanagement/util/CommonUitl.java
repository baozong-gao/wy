package com.shenxin.core.smartpropertymanagement.util;

import com.shenxin.core.smartpropertymanagement.domain.SystemConstant;
import com.shenxin.core.smartpropertymanagement.persist.entity.SysUsrDAO;
import com.shenxin.core.smartpropertymanagement.security.AnyUser;
import org.omg.CORBA.Any;
import org.springframework.security.core.context.SecurityContextHolder;

import javax.servlet.http.HttpServletRequest;
import java.math.BigDecimal;
import java.text.ParsePosition;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * @author Lancelot cailuyuan
 * @create 2018-07-20 14:44
 * @description
 */

public class CommonUitl {
    //用来拿登录者的commpanyId用
    public static BigDecimal getCompanyId(){
        AnyUser userDetails = (AnyUser) SecurityContextHolder.getContext().getAuthentication().getPrincipal();
        SysUsrDAO user = userDetails.getUser();
        BigDecimal companyId = user.getCompanyId();
        return companyId;
    }
    //把yyyy-mm-dd~yyyy-mm-dd形式的日期转换成yyyymmdd的Map输出

    public static Map getStartAndEndDate(String date){
        String[] startAndEnd = date.split("~");
        String startDate = startAndEnd[0].replace("-","");
        String endDate = startAndEnd[1].replace("-","");
        Map map = new HashMap();
        map.put("startDate",startDate);
        map.put("endDate",endDate);
        return  map;
    }
    //计算两个yyyy-mm-dd~yyyy-mm-dd形式日期的经过多少个月份
    public static int getElapsedMonth(String date){
        String[] startAndEnd = date.split("~");
        String startDate = startAndEnd[0].replace("-","").trim();
        String endDate = startAndEnd[1].replace("-","").trim();
        int endYear = Integer.parseInt(endDate.substring(0,4));
        int startYear = Integer.parseInt(startDate.substring(0,4));
        int endMonth = Integer.parseInt(endDate.substring(4,6));
        int startMonth = Integer.parseInt(startDate.substring(4,6));
        if(startYear == endYear){
            int elapsedMonth = endMonth - startMonth + 1;
            return elapsedMonth;
        }else{
            if(endMonth>startMonth){
                int elapsedMonth = (endYear - startYear)*12 + (endMonth - startMonth + 1);
                return elapsedMonth;
            }else {
                int elapsedMonth = (endYear - startYear)*12 - (startMonth - endMonth + 1);
                return elapsedMonth;
            }
        }
    }
    //传入两个yyyymmdd格式的日期，拼接成yyyy-mm-dd~yyyy-mm-dd形式返回
    public static String getHtDate(String startDate,String endDate){
        StringBuffer sb = new StringBuffer();
        String startYear = startDate.substring(0,4);
        String startMonth = startDate.substring(4,6);
        String startDay = startDate.substring(6,8);
        String endYear = endDate.substring(0,4);
        String endMonth = endDate.substring(4,6);
        String endDay = endDate.substring(6,8);
        sb.append("").append(startYear).append("-").append(startMonth).append("-").append(startDay).append("~")
        .append(endYear).append("-").append(endMonth).append("-").append(endDay).append("");
        return sb.toString();
    }

    /**
     * 获取现在的时间
     */
    public static Date getNowDate() {
        Date currentTime = new Date();
        SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        String dateString = formatter.format(currentTime);
        ParsePosition pos = new ParsePosition(0);
        Date currentTime_2 = formatter.parse(dateString, pos);
        return currentTime_2;
    }

    /**
     * 获取当前时间返回String类型的yyyyMMdd
     * @return
     */
    public static String getNowStringDate(){
        Date currentTime = new Date();
        SimpleDateFormat formatter = new SimpleDateFormat("yyyyMMdd");
        String dateString = formatter.format(currentTime);
        return dateString;
    }

    /**
     * 获取Session中的User实体
     * @param request
     * @return
     */
    public static AnyUser getUserSessionEntity(HttpServletRequest request){
        AnyUser anyUser =(AnyUser) request.getSession().getAttribute(SystemConstant.SESSION_USER_KEY);
        return anyUser;
    }

    public static Date getNowDateYyyyMMdd() {
        Date currentTime = new Date();
        SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd");
        String dateString = formatter.format(currentTime);
        ParsePosition pos = new ParsePosition(0);
        Date currentTime_2 = formatter.parse(dateString, pos);
        return currentTime_2;
    }
}
