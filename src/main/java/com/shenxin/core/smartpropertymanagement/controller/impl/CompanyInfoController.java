package com.shenxin.core.smartpropertymanagement.controller.impl;

import com.shenxin.core.smartpropertymanagement.controller.HeightenBaseControllerSupport;
import com.shenxin.core.smartpropertymanagement.controller.IBaseController;
import com.shenxin.core.smartpropertymanagement.domain.bo.CompanyInfoBO;
import com.shenxin.core.smartpropertymanagement.domain.dto.CompanyInfoDTO;
import com.shenxin.core.smartpropertymanagement.domain.vo.CompanyInfoVO;
import com.shenxin.core.smartpropertymanagement.persist.entity.CompanyInfo;
import com.shenxin.core.smartpropertymanagement.service.biz.CompanyAttachInfoBiz;
import com.shenxin.core.smartpropertymanagement.service.biz.CompanyInfoBiz;
import com.shenxin.core.smartpropertymanagement.service.impl.CompanyInfoServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.Validator;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.UnsupportedEncodingException;
import java.sql.Blob;
import java.sql.SQLException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author Lancelot cailuyuan
 * @create 2018-06-21 12:22
 * @description
 */
@Controller
@RequestMapping("/company")
public class CompanyInfoController extends IBaseController<CompanyInfoBO,CompanyInfoVO,CompanyInfo,CompanyInfoDTO> {
    @Autowired
    CompanyAttachInfoBiz companyAttachInfoBiz;
    @Autowired
    CompanyInfoBiz companyInfoBiz;

    @Autowired
    public CompanyInfoController(CompanyInfoServiceImpl service, Validator validator, CompanyAttachInfoBiz companyAttachInfoBiz){
        super(service, validator, "company", new HeightenBaseControllerSupport() {

            @Override
            public void insertAfter(HttpServletRequest request, HttpServletResponse response,Object ... dao) {
                CompanyInfo companyInfo = (CompanyInfo)dao[0];
                // 添加公司之后,添加公司的默认管理员和公司的附件(照片)
                companyAttachInfoBiz.insertUser(companyInfo);
                companyAttachInfoBiz.insertIntoCompanyAttach(companyInfo);
            }

            @Override
            public void updateAfter(HttpServletRequest request, HttpServletResponse response, Object... param) {
                CompanyInfo companyInfo = (CompanyInfo)param[0];
                companyAttachInfoBiz.updateCompanyAttachInfo(companyInfo);
            }


        });
    }

    @RequestMapping(value = "/updateCompanyPage",method = RequestMethod.GET)
    public String updatePage (HttpServletRequest request,
                              HttpServletResponse response) throws SQLException {
        String id = request.getParameter("id");
        List<Map<String,Object>> list = companyAttachInfoBiz.selectCompanyById(id);
        Map map =new HashMap();
        map = list.get(0);
        // 返回map,后期可以修改map文件,返回实体类
        String companId = map.get("ID").toString();
        List<Map<String,Object>> companyAttachList = companyAttachInfoBiz.selectCompanyAttachByCompanyId(companId);
        for (Map<String,Object> maps:companyAttachList) {
            try {
                //blob 转 String,
                String blobString = new String(((Blob)(maps.get("MEDIA_CONTENT"))).getBytes(1, (int) ((Blob)(maps.get("MEDIA_CONTENT"))).length()),"GBK");
                maps.put("MEDIA_CONTENT",blobString);
            } catch (UnsupportedEncodingException e) {
                e.printStackTrace();
            }
        }
        request.setAttribute("attach",companyAttachList);
        request.setAttribute("rout", list); // 里面用到的只有第一个map
        return "company/updatePage";
    }

    @RequestMapping(value = "/selectCompanyCount",method = RequestMethod.GET)
    @ResponseBody
    public int selectCompanyCount(HttpServletRequest request,
                                     HttpServletResponse response){
        int count = companyInfoBiz.selectCompanyCount();
        return count;
    }
}
