package com.shenxin.core.smartpropertymanagement.controller.impl;

import com.shenxin.core.smartpropertymanagement.controller.HeightenBaseControllerSupport;
import com.shenxin.core.smartpropertymanagement.controller.IBaseController;
import com.shenxin.core.smartpropertymanagement.domain.bo.SysRoleBO;
import com.shenxin.core.smartpropertymanagement.domain.dto.SysRoleDTO;
import com.shenxin.core.smartpropertymanagement.domain.vo.FunctionTree;
import com.shenxin.core.smartpropertymanagement.domain.vo.SysRoleVO;
import com.shenxin.core.smartpropertymanagement.persist.entity.SysRoleDAO;
import com.shenxin.core.smartpropertymanagement.service.impl.MenuServiceImpl;
import com.shenxin.core.smartpropertymanagement.service.impl.RoleServiceImpl;
import com.shenxin.core.smartpropertymanagement.util.BeanUtils;
import com.shenxin.core.smartpropertymanagement.util.ResultVo;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.Validator;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.math.BigDecimal;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/**
 * @Author: gaobaozong
 * @Description: 角色
 * @Date: Created in 2018/6/27 - 10:47
 * @Version: V1.0
 */
@Controller("roleController")
@RequestMapping("role")
public class RoleController extends IBaseController<SysRoleBO,SysRoleVO,SysRoleDAO,SysRoleDTO> {

    RoleServiceImpl service;

    @Autowired
    public RoleController(RoleServiceImpl service, Validator validator, MenuServiceImpl menuService){
        super(service, validator, "role", new HeightenBaseControllerSupport() {
            @Override
            public void insertPageAfter(HttpServletRequest request, HttpServletResponse response) {
                List<FunctionTree> func = menuService.getAllFunctionByRoleId(null);
                request.setAttribute("roles", func);
            }

            @Override
            public void updatePageAfter(HttpServletRequest request, HttpServletResponse response, Object dao) {
                BigDecimal id = ((SysRoleDAO)dao).getId();
                List<FunctionTree> func = menuService.getAllFunctionByRoleId(id);
                request.setAttribute("roles", func);
            }

            @Override
            public void updateAfter(HttpServletRequest request, HttpServletResponse response, Object ... param) {
                BigDecimal id = ((SysRoleDAO)param[0]).getId();
                service.upFunctionOnRole(id, ((SysRoleDTO)param[1]).getFuncs());
            }

            @Override
            public void insertAfter(HttpServletRequest request, HttpServletResponse response, Object... param) {
                BigDecimal id = ((SysRoleDAO)param[0]).getId();
                service.upFunctionOnRole(id, ((SysRoleDTO)param[1]).getFuncs());
            }
        });
        this.service = service;
    }

    /**
     *  @Author: gaobaozong
     *  @Description:  获取所有角色权限
     *  @Date: Created in 2017/12/19 - 14:15
     *  @param:
     *  @return:
     */
    @RequestMapping("authpage/{id:.*}")
    public String doUpAuthPage(@PathVariable String  id, HttpSession session, HttpServletRequest request,
                               HttpServletResponse response)throws Exception {
        SysRoleVO vo = new SysRoleVO();
        SysRoleDAO dao =(SysRoleDAO) service.searchById(new BigDecimal(id));
        BeanUtils.copy(dao,vo);
        List func = service.getFunctionByRole(new BigDecimal(id));
        request.setAttribute("roleFuncForm", vo);
        request.setAttribute("role_authorized_all", BeanUtils.object2Json(func));
        return "role/modifyroleresource";
    }


    /**
     *  @Author: gaobaozong
     *  @Description:  权限角色关联
     *  @Date: Created in 2017/12/19 - 14:12
     *  @param:
     *  @return:
     */
    @RequestMapping("authorization")
    @ResponseBody
    public String doUpAuth(String roleId, String functionIds, HttpSession session, HttpServletRequest request,
                           HttpServletResponse response)throws Exception{
        try {
            String [] fids = StringUtils.splitByWholeSeparator(functionIds, ",");
            List ids = Arrays.stream(fids).map(BigDecimal::new).collect(Collectors.toList());
            // 角色关联的权限列表
            service.upFunctionOnRole(new BigDecimal(roleId), ids);
        }catch (Exception e){
            return ResultVo.error("操作失败");
        }
        return ResultVo.succeed();
    }

}
