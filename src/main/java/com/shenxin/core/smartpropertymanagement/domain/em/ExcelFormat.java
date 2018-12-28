package com.shenxin.core.smartpropertymanagement.domain.em;

import java.lang.annotation.*;

@Target(ElementType.FIELD)
@Retention(RetentionPolicy.RUNTIME)
@Documented
@Inherited
public @interface ExcelFormat {
	
	 public String dateFormat();
}
