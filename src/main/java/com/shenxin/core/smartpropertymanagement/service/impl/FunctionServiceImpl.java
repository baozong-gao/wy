package com.shenxin.core.smartpropertymanagement.service.impl;

import com.shenxin.core.smartpropertymanagement.domain.em.IdType;
import com.shenxin.core.smartpropertymanagement.persist.entity.SysFunctionDAO;
import com.shenxin.core.smartpropertymanagement.persist.entity.SysFunctionDAOExample;
import com.shenxin.core.smartpropertymanagement.persist.mapper.SysFunctionDAOMapper;
import com.shenxin.core.smartpropertymanagement.service.IBaseService;
import com.shenxin.core.smartpropertymanagement.service.IdGenerateService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @Author: gaobaozong
 * @Description: 权限查询服务
 * @Date: Created in 2017/12/15 - 11:05
 * @Version: V1.0-SNAPSHOT
 */
@Slf4j
@Service("functionService")
public class FunctionServiceImpl extends IBaseService<SysFunctionDAO,SysFunctionDAOExample,SysFunctionDAOMapper> {

    @Autowired
    public FunctionServiceImpl(SysFunctionDAOMapper mapper, IdGenerateService idGenerateService){
        super(mapper, idGenerateService, IdType.FUNCTION);
    }
}
