package com.shenxin.core.smartpropertymanagement.service.impl;

import com.shenxin.core.smartpropertymanagement.domain.em.IdType;
import com.shenxin.core.smartpropertymanagement.persist.entity.SysLoggerDAO;
import com.shenxin.core.smartpropertymanagement.persist.entity.SysLoggerDAOExample;
import com.shenxin.core.smartpropertymanagement.persist.mapper.SysLoggerDAOMapper;
import com.shenxin.core.smartpropertymanagement.service.IBaseService;
import com.shenxin.core.smartpropertymanagement.service.IdGenerateService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @Author: gaobaozong
 * @Description: 操作日志
 * @Date: Created in 2018/7/5 - 13:35
 * @Version: V1.0
 */
@Slf4j
@Service
public class SysLoggerServiceImpl extends IBaseService<SysLoggerDAO,SysLoggerDAOExample,SysLoggerDAOMapper> {

    @Autowired
    public SysLoggerServiceImpl(SysLoggerDAOMapper mapper, IdGenerateService idGenerateService){
        super(mapper,idGenerateService, IdType.DEFAULT);
    }

}
