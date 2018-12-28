package com.shenxin.core.smartpropertymanagement.domain.vo;

import lombok.Data;

import java.math.BigDecimal;
import java.util.List;

/**
 * @Author: gaobaozong
 * @Description: 权限树
 * @Date: Created in 2017/12/25 - 20:08
 * @Version: V1.0-SNAPSHOT
 */
@Data
public class FunctionTree extends FunctionVO implements Comparable<FunctionTree>{
    List<FunctionTree> subFunc;

    @Override
    public int compareTo(FunctionTree o) {
        if(o == null || o.getOrderBy() == null){
            return 0;
        }
        BigDecimal orderBy = getOrderBy();
        if(orderBy == null){
            return -1;
        }
        if (orderBy.compareTo(o.getOrderBy()) != 0) {
            return orderBy.compareTo(o.getOrderBy());
        } else {
            return getId().compareTo(o.getId());
        }
    }
}
