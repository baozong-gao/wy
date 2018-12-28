package com.shenxin.core.smartpropertymanagement.controller;

import com.github.pagehelper.PageHelper;
import com.shenxin.core.smartpropertymanagement.domain.BaseForm;
import com.shenxin.core.smartpropertymanagement.domain.vo.Pagination;
import com.shenxin.core.smartpropertymanagement.service.IBaseService;
import com.shenxin.core.smartpropertymanagement.util.BeanUtils;
import com.shenxin.core.smartpropertymanagement.util.ResultVo;
import com.shenxin.core.smartpropertymanagement.util.exception.ExceptionID;
import com.shenxin.core.smartpropertymanagement.util.exception.PersistentException;
import com.shenxin.core.smartpropertymanagement.util.exception.ValidatorException;
import lombok.extern.slf4j.Slf4j;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.transaction.interceptor.TransactionAspectSupport;
import org.springframework.validation.BindingResult;
import org.springframework.validation.Validator;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

/**
 * @Author: gaobaozong
 * @Description: 基本控制层
 * @Date: Created in 2018/6/4 - 14:51
 * @Version: V1.0
 */
@Slf4j
public class IBaseController<BO extends BaseForm, VO, DAO, DTO> {

    private IBaseService service;
    private Validator validator;
    private String pageDir = "";
    private HeightenBaseControllerSupport support;

    private Class<BO> BOCLass;
    private Class<VO> VOCLass;
    private Class<DAO> DAOCLass;
    private Class<DTO> DTOCLass;


    public IBaseController(IBaseService service, Validator validator, String dir, HeightenBaseControllerSupport support) {
        this.service = service;
        this.validator = validator;
        this.pageDir = dir == null ? pageDir : dir;
        this.support = support != null ? support : new HeightenBaseControllerSupport() {};

        Type sType = getClass().getGenericSuperclass();
        Type[] generics = ((ParameterizedType) sType).getActualTypeArguments();
        BOCLass = (Class<BO>) (generics[0]);
        VOCLass = (Class<VO>) (generics[1]);
        DAOCLass = (Class<DAO>) (generics[2]);
        DTOCLass = (Class<DTO>) (generics[3]);
    }


    @GetMapping("page")
    public String doPage(HttpSession session, HttpServletRequest request, HttpServletResponse response) throws Exception {
        support.searchPageBefore(request,response,null); // 暂时 form 都是用不到的
        return pageDir + "/listPage";
    }

    @PostMapping("search")
    @ResponseBody
    public String doSelect(@ModelAttribute("rout") BO form, HttpSession session, HttpServletRequest request,
                           HttpServletResponse response) throws Exception{
        BeanUtils.validateJSR303(validator, form);
        try {
            support.searchBefore(request,response,form);
            int pageCurrent = Integer.parseInt(form.getPage());
            int pageSize = Integer.parseInt(form.getRows());
            DAO dao = DAOCLass.newInstance();
            BeanUtils.copy(form, dao);
            int size = service.count(dao);
            Pagination<VO> page = new Pagination<>(size, pageCurrent, pageSize);
            PageHelper.startPage(pageCurrent, pageSize);
            List<DAO> userList = size == 0 ? new ArrayList<>() : service.search(dao);

            List<VO> result = BeanUtils.copyList(userList, VOCLass);
            page.addResult(result);

            support.searchAfter(request, response, result);
            return ResultVo.succeed(page);
        }catch (ValidatorException e) {
            return ResultVo.error(e.getMessage());
        }catch (Exception e) {
            String id = ExceptionID.getID();
            log.error("查询异常【{}】", id, e);
            return ResultVo.error("查询异常:" + id);
        }
    }


    @GetMapping("addpage")
    public String doAddUserPage(HttpSession session, HttpServletRequest request,
                                HttpServletResponse response) throws Exception {
        DAO dao = DAOCLass.newInstance();
        request.setAttribute("rout", dao);

        support.insertPageAfter(request,response);
        return pageDir + "/addPage";
    }


    @PostMapping("add")
    @ResponseBody
    @Transactional(rollbackFor = Exception.class)
    public String doAdd(@ModelAttribute("rout") DTO dto, BindingResult result, HttpSession session, HttpServletRequest request,
                        HttpServletResponse response) throws Exception {
        try {
            BeanUtils.validateJSR303(validator, dto);
            DAO dao = DAOCLass.newInstance();
            BeanUtils.copy(dto, dao);
            support.insertBefore(request,response,dao);
            service.insert(dao);
            support.insertAfter(request,response,dao,dto);
            return ResultVo.succeed();
        }catch (PersistentException e){
            throw e;
        }catch (ValidatorException e) {
            return ResultVo.error(e.getMessage());
        } catch (Exception e) {
            TransactionAspectSupport.currentTransactionStatus().setRollbackOnly();
            String id = ExceptionID.getID();
            log.error("增加异常【{}】", id, e);
            return ResultVo.error("增加异常:" + id);
        }
    }

    @PostMapping("delete/{id:.*}")
    @ResponseBody
    public String deleteUser(@PathVariable String id, HttpServletRequest request, HttpServletResponse response) throws Exception {
        try {
            service.delete(new BigDecimal(id));
            return ResultVo.succeed();
        } catch (Exception e) {

            String _id = ExceptionID.getID();
            log.error("删除异常【{}】", _id, e);
            return ResultVo.error("删除异常:" + _id);
        }
    }

    @GetMapping("updatepage/{id:.*}")
    public String doUpdateUserPage(@PathVariable String id, HttpSession session, HttpServletRequest request,
                                   HttpServletResponse response) throws Exception {
        DAO dao = (DAO) service.searchById(new BigDecimal(id));
        VO vo = VOCLass.newInstance();
        BeanUtils.copy(dao, vo);
        request.setAttribute("rout", vo);
        support.updatePageAfter(request,response,dao);
        return pageDir + "/updatePage";
    }

    @PostMapping("update")
    @ResponseBody
    @Transactional(rollbackFor = Exception.class)
    public String doUpdate(@ModelAttribute("rout") DTO dto, HttpSession session, HttpServletRequest request,
                           HttpServletResponse response) throws Exception {
        try {
            BeanUtils.validateJSR303(validator, dto);
            DAO dao = DAOCLass.newInstance();
            BeanUtils.copy(dto, dao);
            support.updateBefore(request,response,dao);
            service.update(dao);
            support.updateAfter(request,response,dao,dto);
            return ResultVo.succeed();
        }catch (PersistentException e){
            throw e;
        } catch (ValidatorException e) {
            return ResultVo.error(e.getMessage());
        } catch (Exception e) {
            String id = ExceptionID.getID();
            TransactionAspectSupport.currentTransactionStatus().setRollbackOnly();
            log.error("更新异常【{}】", id, e);
            return ResultVo.error("更新异常:" + id);
        }
    }

    @GetMapping("detailpage/{id:.*}")
    public String doSelectDetailPage(@PathVariable String id,HttpServletRequest request,HttpServletResponse response) throws Exception {
        DAO dao = (DAO) service.searchById(new BigDecimal(id));
        VO vo = VOCLass.newInstance();
        BeanUtils.copy(dao, vo);
        support.searchDetailBefore(request,response,vo);
        request.setAttribute("rout", vo);
        support.searchDetailAfter(request,response,dao);
        return pageDir + "/detailPage";
    }

    @GetMapping("reservePage/{id:.*}")
    public String doSelectReservePage(@PathVariable String id,HttpServletRequest request,HttpServletResponse response) throws Exception{
        DAO dao = (DAO) service.searchById(new BigDecimal(id));
        VO vo = VOCLass.newInstance();
        BeanUtils.copy(dao, vo);
        request.setAttribute("rout", vo);
        return pageDir + "/reservePage";
    }

    @GetMapping("Preferentialpage/{id:.*}")
    public String doSelectPreferential(@PathVariable String id,HttpServletRequest request,HttpServletResponse response) throws Exception{
        DAO dao = (DAO) service.searchById(new BigDecimal(id));
        VO vo = VOCLass.newInstance();
        BeanUtils.copy(dao, vo);
        request.setAttribute("rout", vo);
        return pageDir + "/PreferentialPage";
    }
}
