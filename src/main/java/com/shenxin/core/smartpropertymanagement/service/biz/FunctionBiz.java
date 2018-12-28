package com.shenxin.core.smartpropertymanagement.service.biz;


import com.shenxin.core.smartpropertymanagement.persist.entity.SysFunctionDAO;
import com.shenxin.core.smartpropertymanagement.persist.entity.SysFunctionDAOExample;
import com.shenxin.core.smartpropertymanagement.persist.mapper.SysFunctionDAOMapper;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

/**
 * @Author: gaobaozong
 * @Description: 权限 业务操作接口 与service配合使用
 * @Date: Created in 2017/12/28 - 11:19
 * @Version: V1.0
 */
@Service
public class FunctionBiz {

    @Autowired
    SysFunctionDAOMapper sysFunctionDAOMapper;

    /**
     * @Author: gaobaozong
     * @Description: 查询所有父级标签, 默认标识是a b
     * @Date: Created in 2017/12/28 - 11:30
     * @param: grade  标签等级
     * @return:
     */
    public List<SysFunctionDAO> searchParentFunction(String grade) {
        if (StringUtils.isBlank(grade)) {
            grade = "C";
        }

        String ParentFunction = String.valueOf((char) (grade.toCharArray()[0] - 1));

        SysFunctionDAOExample example = new SysFunctionDAOExample();
        example.createCriteria().andGradeEqualTo(ParentFunction);
        List<SysFunctionDAO> funcs = sysFunctionDAOMapper.selectByExample(example);
        // funcs是否有值,否则就返回一个list带一个顶级的权限.
        return Optional.ofNullable(funcs).filter(_f -> _f.size() > 0).orElseGet(() -> {
            List<SysFunctionDAO> result = new ArrayList<>();
            SysFunctionDAO topFunc = new SysFunctionDAO();
            topFunc.setId(BigDecimal.ZERO);
            topFunc.setFuncName("顶级");
            result.add(topFunc);
            return result;
        });
    }
}
