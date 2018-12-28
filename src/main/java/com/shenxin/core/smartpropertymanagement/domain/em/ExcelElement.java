package com.shenxin.core.smartpropertymanagement.domain.em;

import java.lang.annotation.*;

@Target(ElementType.FIELD)
@Retention(RetentionPolicy.RUNTIME)
@Documented
@Inherited
public @interface ExcelElement {
     /**
     * 对应excel的第一行（标题行）
     * @return
     */
     public String field();
     public int index();
}