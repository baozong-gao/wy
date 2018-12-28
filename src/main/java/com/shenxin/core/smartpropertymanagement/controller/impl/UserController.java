package com.shenxin.core.smartpropertymanagement.controller.impl;

import com.shenxin.core.smartpropertymanagement.controller.HeightenBaseControllerSupport;
import com.shenxin.core.smartpropertymanagement.controller.IBaseController;
import com.shenxin.core.smartpropertymanagement.domain.bo.UserBO;
import com.shenxin.core.smartpropertymanagement.domain.dto.UserDTO;
import com.shenxin.core.smartpropertymanagement.domain.vo.SysRoleVO;
import com.shenxin.core.smartpropertymanagement.domain.vo.UserVO;
import com.shenxin.core.smartpropertymanagement.persist.entity.SysUsrDAO;
import com.shenxin.core.smartpropertymanagement.security.AnyUser;
import com.shenxin.core.smartpropertymanagement.service.impl.UserServiceImpl;
import com.shenxin.core.smartpropertymanagement.util.BeanUtils;
import com.shenxin.core.smartpropertymanagement.util.EncryptUtils;
import com.shenxin.core.smartpropertymanagement.util.ResultVo;
import com.shenxin.core.smartpropertymanagement.util.ReturnUtil;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Controller;
import org.springframework.validation.Validator;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.math.BigDecimal;
import java.util.List;

/**
 * @Author: gaobaozong
 * @Description: 用户
 * @Date: Created in 2018/6/27 - 11:06
 * @Version: V1.0
 */
@Slf4j
@Controller("userController")
@RequestMapping("user")
public class UserController extends IBaseController<UserBO,UserVO,SysUsrDAO,UserDTO> {

    UserServiceImpl userService;

    @Value("${root.name}")
    private String ROOT;

    @Autowired
    public UserController(UserServiceImpl service,  Validator validator){
        super(service, validator, "user", new HeightenBaseControllerSupport() {
            @Override
            public void insertPageAfter(HttpServletRequest request, HttpServletResponse response) {
                // 获取当前用户的所有角色  如果传入的id是null,里面是不可能会有关联的.
                List<SysRoleVO> roles = service.getRoleByUserId(null);
                request.setAttribute("roles", roles);
            }

            @Override
            public void updatePageAfter(HttpServletRequest request, HttpServletResponse response, Object dao) {
                BigDecimal id = ((SysUsrDAO)dao).getId();
                List<SysRoleVO> roles = service.getRoleByUserId(id);
                request.setAttribute("roles", roles);
            }

            @Override
            public void updateBefore(HttpServletRequest request, HttpServletResponse response, Object dao) {
                SysUsrDAO user =  ((SysUsrDAO)dao);
                // 设置为空的时候,不会修改.
                user.setPasswd(null);
            }

            @Override
            public void insertBefore(HttpServletRequest request, HttpServletResponse response, Object dao) {
                SysUsrDAO user =  ((SysUsrDAO)dao);
                user.setPasswd(EncryptUtils.encryptPwd(user.getPasswd()));
            }

            @Override
            public void updateAfter(HttpServletRequest request, HttpServletResponse response, Object ... param) {
                BigDecimal id = ((SysUsrDAO)param[0]).getId();
                // 更新角色关系,去掉旧的,添加新的.
                service.upRoleOnUser(id, ((UserDTO)param[1]).getRoles());
            }

            @Override
            public void insertAfter(HttpServletRequest request, HttpServletResponse response, Object... param) {
                BigDecimal id = ((SysUsrDAO)param[0]).getId();
                service.upRoleOnUser(id, ((UserDTO)param[1]).getRoles());
            }

        });
        this.userService = service;
    }

    @RequestMapping(value = "goToChangepwdPage", method = RequestMethod.GET)
    public String goToChangepwdPage(HttpServletRequest request) {
        AnyUser userDetails = (AnyUser) SecurityContextHolder.getContext().getAuthentication() .getPrincipal();
        request.setAttribute("user", userDetails.getUser());
        return "user/changepwd";
    }

    @RequestMapping(value = "changepwd", method = RequestMethod.POST)
    @ResponseBody
    public String changepwd(HttpServletRequest request, HttpServletResponse response) {
        try {
            String userId = request.getParameter("userid");
            String oldpassword = EncryptUtils.encryptPwd(request.getParameter("oldpassword"));
            String pass = request.getParameter("pass");
            pass = EncryptUtils.encryptPwd(pass);
            SysUsrDAO userDAO = userService.searchById(new BigDecimal(userId));
            // 管理员直接修改,非管理员比较检验旧密码
            if (ROOT.equals(userDAO.getUserName()) || oldpassword.equals(userDAO.getPasswd())) {
                userDAO.setPasswd(pass);
                userService.update(userDAO);
            } else {
                return ResultVo.error("旧密码错误");
            }
        } catch (Exception e) {
            log.error("重置密码错误", e);
            return ResultVo.error("重置密码错误");
        }
        return ResultVo.succeed();
    }


    /**
     * @Author: gaobaozong
     * @Description: 获取所有用户角色
     * @Date: Created in 2017/12/19 - 14:15
     * @param:
     * @return:
     */
    @RequestMapping("authpage/{id:.*}")
    public String doUpAuthPage(@PathVariable String id, HttpSession session, HttpServletRequest request,
                               HttpServletResponse response) throws Exception {
        UserVO vo = new UserVO();
        SysUsrDAO dao =  userService.searchById(new BigDecimal(id));
        BeanUtils.copy(dao, vo);
        List func = userService.getRoleByUserId(new BigDecimal(id));
        // 获取用户和对应的角色列表
        request.setAttribute("user", vo);
        request.setAttribute("roles", func);
        return "user/modifyacctoauth";
    }


    /**
     * @Author: gaobaozong
     * @Description: 用户角色关联
     * @Date: Created in 2017/12/19 - 14:12
     * @param:
     * @return:
     */
    @RequestMapping("auth/{uid:.*}/{rid:.*}/{type:.*}")
    public String doUpAuth(@PathVariable String uid, @PathVariable String rid, @PathVariable String type, HttpSession session, HttpServletRequest request,
                           HttpServletResponse response) throws Exception {
        String succeed = ReturnUtil.succeed();
//        try {
//            if ("op".equalsIgnoreCase(type)) {
//                userService.upRoleOnUser(new BigDecimal(uid), new BigDecimal(rid));
//            } else if ("cl".equalsIgnoreCase(type)) {
//                userService.upRoleOnUser(new BigDecimal(uid), new BigDecimal(rid));
//            }
//        } catch (Exception e) {
//            succeed = ReturnUtil.error("操作失败");
//        }
        ReturnUtil.retJson(response, succeed);
        return null;
    }

    @RequestMapping(value = "resetPasswords",method = RequestMethod.GET)
    @ResponseBody
    public String resetPasswords(HttpServletRequest request,
                               HttpServletResponse response)throws Exception{
        BigDecimal userId = new BigDecimal(request.getParameter("id"));
        try {
            userService.resetPasswords(userId);
        } catch (Exception e) {
            return ResultVo.error("操作失败");
        }
            return ResultVo.succeed();
    }

    @RequestMapping(value = "frozenAccount",method = RequestMethod.GET)
    @ResponseBody
    public String frozenAccount(HttpServletRequest request,
                                HttpServletResponse response)throws Exception{
        BigDecimal userId = new BigDecimal(request.getParameter("id"));
        try {
            userService.frozenAccount(userId);
        } catch (Exception e) {
            return ResultVo.error("操作失败");
        }
        return ResultVo.succeed();
    }

    @RequestMapping(value = "unfreezeAccount",method = RequestMethod.GET)
    @ResponseBody
    public String unfreezeAccount(HttpServletRequest request,
                                  HttpServletResponse response)throws Exception{
        BigDecimal userId = new BigDecimal(request.getParameter("id"));
        try {
            userService.unfreezeAccount(userId);
        } catch (Exception e) {
            return ResultVo.error("操作失败");
        }
        return ResultVo.succeed();
    }
}
