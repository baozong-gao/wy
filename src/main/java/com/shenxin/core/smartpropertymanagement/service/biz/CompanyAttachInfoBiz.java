package com.shenxin.core.smartpropertymanagement.service.biz;

import com.shenxin.core.smartpropertymanagement.domain.SystemConstant;
import com.shenxin.core.smartpropertymanagement.persist.entity.CompanyAttachInfo;
import com.shenxin.core.smartpropertymanagement.persist.entity.CompanyInfo;
import com.shenxin.core.smartpropertymanagement.persist.entity.RLSysUsrRoleDAO;
import com.shenxin.core.smartpropertymanagement.persist.entity.SysUsrDAO;
import com.shenxin.core.smartpropertymanagement.persist.mapper.CompanyAttachInfoMapper;
import com.shenxin.core.smartpropertymanagement.persist.mapper.RLSysUsrRoleDAOMapper;
import com.shenxin.core.smartpropertymanagement.persist.mapper.SysUsrDAOMapper;
import com.shenxin.core.smartpropertymanagement.util.EncryptUtils;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.List;
import java.util.Map;

/**
 * @author Lancelot cailuyuan
 * @create 2018-06-28 17:45
 * @description
 */
@Service
public class CompanyAttachInfoBiz {
    @Autowired
    CompanyAttachInfoMapper companyAttachInfoMapper;

    @Autowired
    SysUsrDAOMapper sysUsrDAOMapper;

    @Autowired
    RLSysUsrRoleDAOMapper rlSysUsrRoleDAOMapper;

    @Autowired
    CompanyAttachInfoBiz companyAttachInfoBiz;


    public void insertIntoCompanyAttach(CompanyInfo companyInfo){
        if(StringUtils.isNoneBlank(companyInfo.getImgFileXuke())){
            BigDecimal companyId = companyInfo.getId();
            CompanyAttachInfo companyAttachInfo = new CompanyAttachInfo();
            companyAttachInfo.setCompanyId(companyId);
            companyAttachInfo.setAttachType(SystemConstant.ATTACH_TYPE_YYZZ);
            companyAttachInfo.setMediaType("PIC");
            companyAttachInfo.setStoreType("CONTENT");
            companyAttachInfo.setMediaContent((companyInfo.getImgFileXuke()).getBytes());
            companyAttachInfo.setMediaDesc("营业许可证");
            companyAttachInfoMapper.insertSelective(companyAttachInfo);
        }
        if(StringUtils.isNoneBlank(companyInfo.getImgFileFront())){
            BigDecimal companyId = companyInfo.getId();
            CompanyAttachInfo companyAttachInfo = new CompanyAttachInfo();
            companyAttachInfo.setCompanyId(companyId);
            companyAttachInfo.setAttachType(SystemConstant.ATTACH_TYPE_SFZZM);
            companyAttachInfo.setMediaType("PIC");
            companyAttachInfo.setStoreType("CONTENT");
            companyAttachInfo.setMediaContent((companyInfo.getImgFileFront()).getBytes());
            companyAttachInfo.setMediaDesc("身份证正面");
            companyAttachInfoMapper.insertSelective(companyAttachInfo);
        }
        if(StringUtils.isNoneBlank(companyInfo.getImgFileBack())){
            BigDecimal companyId = companyInfo.getId();
            CompanyAttachInfo companyAttachInfo = new CompanyAttachInfo();
            companyAttachInfo.setCompanyId(companyId);
            companyAttachInfo.setAttachType(SystemConstant.ATTACH_TYPE_SFZFM);
            companyAttachInfo.setMediaType("PIC");
            companyAttachInfo.setStoreType("CONTENT");
            companyAttachInfo.setMediaContent((companyInfo.getImgFileBack()).getBytes());
            companyAttachInfo.setMediaDesc("身份证反面");
            companyAttachInfoMapper.insertSelective(companyAttachInfo);
        }

    }
    public void updateCompanyAttachInfo(CompanyInfo companyInfo){
        BigDecimal companyId = companyInfo.getId();
        List<Map<String,Object>> companyAttachList = companyAttachInfoBiz.selectCompanyAttachByCompanyId(companyId.toString());
        if(companyAttachList!=null && companyAttachList.size()>0){
            for (Map<String,Object> map:companyAttachList) {
                if(StringUtils.isNoneBlank(companyInfo.getImgFileXuke()) && map.get("ATTACH_TYPE").equals(SystemConstant.ATTACH_TYPE_YYZZ)){
                    CompanyAttachInfo companyAttachInfo = new CompanyAttachInfo();
                    companyAttachInfo.setId(BigDecimal.valueOf(Long.parseLong(map.get("ID").toString())));
                    companyAttachInfo.setCompanyId(companyId);
                    companyAttachInfo.setMediaContent((companyInfo.getImgFileXuke()).getBytes());
                    companyAttachInfoMapper.updateByPrimaryKeySelective(companyAttachInfo);
                }
                if(StringUtils.isNoneBlank(companyInfo.getImgFileFront()) && map.get("ATTACH_TYPE").equals(SystemConstant.ATTACH_TYPE_SFZZM)){
                    CompanyAttachInfo companyAttachInfo = new CompanyAttachInfo();
                    companyAttachInfo.setId(BigDecimal.valueOf(Long.parseLong(map.get("ID").toString())));
                    companyAttachInfo.setCompanyId(companyId);
                    companyAttachInfo.setMediaContent((companyInfo.getImgFileFront()).getBytes());
                    companyAttachInfoMapper.updateByPrimaryKeySelective(companyAttachInfo);
                }
                if(StringUtils.isNoneBlank(companyInfo.getImgFileBack()) && map.get("ATTACH_TYPE").equals(SystemConstant.ATTACH_TYPE_SFZFM)){
                    CompanyAttachInfo companyAttachInfo = new CompanyAttachInfo();
                    companyAttachInfo.setId(BigDecimal.valueOf(Long.parseLong(map.get("ID").toString())));
                    companyAttachInfo.setCompanyId(companyId);
                    companyAttachInfo.setMediaContent((companyInfo.getImgFileBack()).getBytes());
                    companyAttachInfoMapper.updateByPrimaryKeySelective(companyAttachInfo);
                }
            }
        }

    }

    public void insertUser(CompanyInfo companyInfo){
        SysUsrDAO sysUsrDAO = new SysUsrDAO();
        sysUsrDAO.setCompanyId(companyInfo.getId());
        sysUsrDAO.setUserType(SystemConstant.FUNC_TYPE_COMPANY);
        sysUsrDAO.setUserName(companyInfo.getLinkName());
        sysUsrDAO.setLoginId(companyInfo.getLinkPhone());
        sysUsrDAO.setPasswd(EncryptUtils.encryptPwd("aaa111"));
        sysUsrDAO.setMobile(companyInfo.getLinkPhone());
        sysUsrDAO.setEmail(companyInfo.getLinkEmail());
        sysUsrDAO.setRemark("添加公司默认为公司分配的管理员账号");
        sysUsrDAOMapper.insertSelective(sysUsrDAO);
        RLSysUsrRoleDAO rlSysUsrRoleDAO = new RLSysUsrRoleDAO();
        rlSysUsrRoleDAO.setUserId(sysUsrDAO.getId());
        BigDecimal bd = new BigDecimal("2");
        rlSysUsrRoleDAO.setRoleId(bd);
        rlSysUsrRoleDAOMapper.insertSelective(rlSysUsrRoleDAO);
    }

    public List selectCompanyById(String id){
        List list = companyAttachInfoMapper.selectCompanyById(id);
        return list;
    }

    public List selectCompanyAttachByCompanyId(String id){
        List list =companyAttachInfoMapper.selectCompanyAttachByCompanyId(id);
        return list;
    }


}
