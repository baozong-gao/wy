package com.shenxin.core.smartpropertymanagement.controller.impl;

import com.shenxin.core.smartpropertymanagement.controller.HeightenBaseControllerSupport;
import com.shenxin.core.smartpropertymanagement.controller.IBaseController;
import com.shenxin.core.smartpropertymanagement.domain.SystemConstant;
import com.shenxin.core.smartpropertymanagement.domain.bo.BuildingInfoBO;
import com.shenxin.core.smartpropertymanagement.domain.dto.BuildingInfoDTO;
import com.shenxin.core.smartpropertymanagement.domain.vo.BuildingInfoVO;
import com.shenxin.core.smartpropertymanagement.persist.entity.BuildingInfo;
import com.shenxin.core.smartpropertymanagement.persist.entity.CompanyInfo;
import com.shenxin.core.smartpropertymanagement.persist.entity.PropertyInfo;
import com.shenxin.core.smartpropertymanagement.security.AnyUser;
import com.shenxin.core.smartpropertymanagement.service.biz.BuildingInfoBiz;
import com.shenxin.core.smartpropertymanagement.service.impl.BuildingInfoServiceImpl;
import com.shenxin.core.smartpropertymanagement.util.ResultVo;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.Validator;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.math.BigDecimal;
import java.util.List;

/**
 * @author Lancelot cailuyuan
 * @create 2018-07-09 19:54
 * @description
 */
@Slf4j
@Controller
@RequestMapping("/building")
public class BuildingInfoController extends IBaseController<BuildingInfoBO,BuildingInfoVO,BuildingInfo,BuildingInfoDTO> {
    @Autowired
    BuildingInfoBiz buildingInfoBiz;

    @Autowired
    public BuildingInfoController(BuildingInfoServiceImpl service, Validator validator,BuildingInfoBiz buildingInfoBiz) {
        super(service, validator, "building", new HeightenBaseControllerSupport(){
            @Override
            public void insertPageAfter(HttpServletRequest request, HttpServletResponse response) {
                AnyUser user = (AnyUser) request.getSession().getAttribute(SystemConstant.SESSION_USER_KEY);
                CompanyInfo companyInfo = buildingInfoBiz.getCompanyInfo(user.getUser().getCompanyId() + "");
                // 获取公司名字
                request.setAttribute("companyName",companyInfo.getCompanyName());
                BigDecimal companyId = companyInfo.getId();
                List<PropertyInfo> list = buildingInfoBiz.selectPropertyByCompanyId(companyId);
                // 获取公司名下的物业
                request.setAttribute("propertyList",list);
            }
            @Override
            public void updatePageAfter(HttpServletRequest request, HttpServletResponse response, Object dao) {
                AnyUser user = (AnyUser) request.getSession().getAttribute(SystemConstant.SESSION_USER_KEY);
                CompanyInfo companyInfo = buildingInfoBiz.getCompanyInfo(user.getUser().getCompanyId() + "");
                request.setAttribute("companyName",companyInfo.getCompanyName());
                BigDecimal companyId = companyInfo.getId();
                List<PropertyInfo> list = buildingInfoBiz.selectPropertyByCompanyId(companyId);
                request.setAttribute("propertyList",list);
            }

            @Override
            public void searchAfter(HttpServletRequest request, HttpServletResponse response, List result) {
                 List<BuildingInfoVO> list = result;
                 // 遍历id,设置名字
                for (BuildingInfoVO building: list) {
                    BigDecimal propertyId = building.getPropertyId();
                    String propertyName = buildingInfoBiz.selectPropertyName(propertyId);
                    building.setPropertyName(propertyName);
                }
            }
        });
    }
    // 根据id获取building列表
    @RequestMapping(value = "selectBuilding",method = RequestMethod.GET)
    @ResponseBody
    public String selectBuilding(HttpServletRequest request,
                                  HttpServletResponse response)throws Exception{

        List list =null;
        try {
            list = buildingInfoBiz.selectBuilding(new BigDecimal(request.getParameter("id")));
        } catch (Exception e) {
            return ResultVo.error("查询楼宇异常");
        }
        return ResultVo.succeed(list);
    }

    // 根据propertyId获取building列表
    @RequestMapping(value = "selectBuildingId",method = RequestMethod.GET)
    @ResponseBody
    public String selectBuilding(HttpServletRequest request){
        List list = buildingInfoBiz.searchByPropertyId(new BigDecimal(request.getParameter("id")));
        return ResultVo.succeed(list);
    }
}
