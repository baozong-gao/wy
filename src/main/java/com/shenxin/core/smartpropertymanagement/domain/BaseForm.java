package com.shenxin.core.smartpropertymanagement.domain;


import com.shenxin.core.smartpropertymanagement.domain.vo.Pagination;
import lombok.Data;

@Data
public class BaseForm<T> extends BaseField{

    private String rows = "10";

    private String pageNo = "1";

    private String page = "1";

    Pagination<T> pagination;
}

