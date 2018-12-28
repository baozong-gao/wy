package com.shenxin.core.smartpropertymanagement.domain.em;

import java.lang.annotation.*;


@Target(ElementType.FIELD)
@Retention(RetentionPolicy.RUNTIME)
@Documented
@Inherited
public @interface ExcelSelect {
	/**
	 * @param key,value,key,value,....
	 * @see 把key值替换成value值，key，value成对出现
	 * 		否则将不处理
	 * @return
	 */
	public String[] select();
}
