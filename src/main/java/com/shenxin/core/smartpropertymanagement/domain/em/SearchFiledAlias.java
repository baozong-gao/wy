package com.shenxin.core.smartpropertymanagement.domain.em;

import java.lang.annotation.*;

/**
 * @Author: wangzhenyu
 * @Description: 研发部
 * @Date: 2018/7/18
 * @Version: V1.0
 */
@Target(ElementType.FIELD)
@Retention(RetentionPolicy.RUNTIME)
@Documented
@Inherited
public @interface SearchFiledAlias {
    public String [] value();
}
