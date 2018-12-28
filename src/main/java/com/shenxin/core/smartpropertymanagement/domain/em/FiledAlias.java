package com.shenxin.core.smartpropertymanagement.domain.em;

/**
 * @Author: gaobaozong
 * @Description: bean copy 别名
 * @Date: Created in 2017/12/20 - 14:43
 * @Version: V1.0-SNAPSHOT
 */
import java.lang.annotation.*;
@Target(ElementType.FIELD)
@Retention(RetentionPolicy.RUNTIME)
@Documented
@Inherited
public @interface FiledAlias {
    public String []  value();

    //获取 别名[index].子别名
    public boolean isCollection() default false;

    public int index() default 0;

    public String subAlias() default "";

    public boolean isGetCollectionSize() default false;
}
