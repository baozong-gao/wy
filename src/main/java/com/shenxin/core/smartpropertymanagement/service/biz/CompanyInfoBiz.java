package com.shenxin.core.smartpropertymanagement.service.biz;

import com.shenxin.core.smartpropertymanagement.persist.entity.CompanyInfo;
import com.shenxin.core.smartpropertymanagement.persist.mapper.CompanyInfoMapper;
import com.shenxin.core.smartpropertymanagement.service.impl.CompanyInfoServiceImpl;
import com.shenxin.core.smartpropertymanagement.util.UserUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.List;

/**
 * @author Lancelot cailuyuan
 * @create 2018-07-09 1:45
 * @description
 */
@Service
public class CompanyInfoBiz {
    @Autowired
    CompanyInfoMapper companyInfoMapper;

    @Autowired
    CompanyInfoServiceImpl service;

    public int selectCompanyCount(){
        int companyCount = companyInfoMapper.selectCompanyCount();
        return companyCount;
    }

    public List<CompanyInfo> getComany(){
       if(UserUtil.isRoot()){
//           CompanyInfo companyInfo = new CompanyInfo();
           // 需要获取所有公司,是不需要传入筛选条件的.
           return service.search(null);
       }
      return Arrays.asList(service.searchById(UserUtil.getUserCompanyId()));
    }
}
