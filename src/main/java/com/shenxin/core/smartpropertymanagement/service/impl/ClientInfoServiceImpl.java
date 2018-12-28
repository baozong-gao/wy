package com.shenxin.core.smartpropertymanagement.service.impl;

import com.shenxin.core.smartpropertymanagement.domain.em.IdType;
import com.shenxin.core.smartpropertymanagement.persist.entity.ClientInfo;
import com.shenxin.core.smartpropertymanagement.persist.entity.ClientInfoExample;
import com.shenxin.core.smartpropertymanagement.persist.mapper.ClientInfoMapper;
import com.shenxin.core.smartpropertymanagement.service.IBaseService;
import com.shenxin.core.smartpropertymanagement.service.IdGenerateService;
import org.springframework.stereotype.Service;

/**
 * @author Lancelot cailuyuan
 * @create 2018-07-13 10:25
 * @description
 */
@Service
public class ClientInfoServiceImpl extends IBaseService<ClientInfo,ClientInfoExample,ClientInfoMapper>{
    public ClientInfoServiceImpl(ClientInfoMapper mapper, IdGenerateService idGenerate) {
        super(mapper, idGenerate, IdType.CLIENT);
    }
}
