package com.shenxin.core.smartpropertymanagement.domain;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

/**
 * @Author: wangzhenyu
 * @Description: 研发部
 * @Date: 2018/7/18
 * @Version: V1.0
 */

@Slf4j
@Component
public class SpringConfigConstant {

    public static String PLATEFORM_COMPANYID;

    @Value("${platform.companyid}")
    public void setPlateformCompanyid(String plateformCompanyid) {
        SpringConfigConstant.PLATEFORM_COMPANYID = plateformCompanyid;
    }
}
