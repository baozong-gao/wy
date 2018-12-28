package com.shenxin.core.smartpropertymanagement.controller.impl;

import com.shenxin.core.smartpropertymanagement.controller.HeightenBaseControllerSupport;
import com.shenxin.core.smartpropertymanagement.controller.IBaseController;
import com.shenxin.core.smartpropertymanagement.domain.BaseField;
import com.shenxin.core.smartpropertymanagement.domain.SystemConstant;
import com.shenxin.core.smartpropertymanagement.domain.bo.ContractBusinessBO;
import com.shenxin.core.smartpropertymanagement.domain.dto.ContractBusinessDTO;
import com.shenxin.core.smartpropertymanagement.domain.vo.ContractBusinessVO;
import com.shenxin.core.smartpropertymanagement.domain.vo.ContractFeesVO;
import com.shenxin.core.smartpropertymanagement.domain.vo.RoomVO;
import com.shenxin.core.smartpropertymanagement.persist.entity.*;
import com.shenxin.core.smartpropertymanagement.service.biz.CompanyInfoBiz;
import com.shenxin.core.smartpropertymanagement.service.biz.ContractBusinessBiz;
import com.shenxin.core.smartpropertymanagement.service.biz.PropertyInfoBiz;
import com.shenxin.core.smartpropertymanagement.service.impl.ContractAttachServiceImpl;
import com.shenxin.core.smartpropertymanagement.service.impl.ContractBusinessServiceImpl;
import com.shenxin.core.smartpropertymanagement.service.impl.ContractFeesServiceImpl;
import com.shenxin.core.smartpropertymanagement.service.impl.RoomServiceImpl;
import com.shenxin.core.smartpropertymanagement.util.BeanUtils;
import com.shenxin.core.smartpropertymanagement.util.ResultVo;
import com.shenxin.core.smartpropertymanagement.util.exception.ValidatorException;
import lombok.extern.slf4j.Slf4j;
import org.apache.commons.lang3.StringUtils;
import org.apache.tomcat.util.http.fileupload.IOUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.validation.Validator;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

/**
 * @Author: gaobaozong
 * @Description: 商业合同
 * @Date: Created in 2018/7/23 - 16:03
 * @Version: V1.0
 */
@Slf4j
@Controller
@RequestMapping("/contract/business")
public class ContractBusinessController extends IBaseController<ContractBusinessBO, ContractBusinessVO, ContractInfoDAO, ContractBusinessDTO> {

    ContractAttachServiceImpl contractAttachService;

    RoomServiceImpl roomService;

    Validator validator;

    ContractBusinessServiceImpl service;

    @Autowired
    ContractFeesServiceImpl feesService;
    @Autowired
    ContractBusinessBiz biz;

    @Autowired
    public ContractBusinessController(ContractBusinessServiceImpl service, Validator validator, ContractAttachServiceImpl contractAttachService, RoomServiceImpl roomService,CompanyInfoBiz companyInfoBiz,PropertyInfoBiz propertyInfoBiz,ContractBusinessBiz biz) {
        super(service, validator, "contract_business", new HeightenBaseControllerSupport() {

            @Override
            public void searchPageBefore(HttpServletRequest request, HttpServletResponse response, Object bo) {
                // 获取公司,如果是平台获取所有公司,否则获取当前公司
                List<CompanyInfo> companys = companyInfoBiz.getComany();
                request.setAttribute("companys", companys);

                if (companys != null && companys.size() > 0) {
                    CompanyInfo one = companys.get(0);
                    // 如果公司非空,则取第一个公司的物业,放入列表
                    List<PropertyInfo> propertys = propertyInfoBiz.getPropertyByCompanyId(one.getId());
                    request.setAttribute("propertys", propertys);
                }

            }

            @Override
            public void searchBefore(HttpServletRequest request, HttpServletResponse response, Object o) {
                ContractBusinessBO bo = (ContractBusinessBO)o;
                // roomId,property,building, 在contractInfo dao里面都没有,所以转化成对应的contractId
                biz.setBoRoomIds(bo);
            }

            @Override
            public void searchAfter(HttpServletRequest request, HttpServletResponse response, List result) {
                biz.setRoomCampany(result);
            }

            @Override
            public void insertAfter(HttpServletRequest request, HttpServletResponse response, Object... param) {
                ContractInfoDAO dao = (ContractInfoDAO) param[0];
                ContractBusinessDTO dto = (ContractBusinessDTO) param[1];
                Arrays.stream(dto.getAttachIds()).map(BigDecimal::new).forEach(id -> {
                    ContractAttachDAO attachDAO = contractAttachService.searchById(id);
                    attachDAO.setContractId(dao.getId());
                    contractAttachService.update(attachDAO);
                });
            }

            @Override
            public void insertPageAfter(HttpServletRequest request, HttpServletResponse response) {
                String roomId = request.getParameter("rid");
                Object room = Optional.ofNullable(roomId).map(BigDecimal::new).map(_id -> roomService.searchById(_id)).orElseThrow(() -> new ValidatorException("房间未找到"));
                RoomVO roomVO = new RoomVO();
                try {
                    BeanUtils.copy(room, roomVO);
                    request.setAttribute("room", roomVO);
                    request.setAttribute("temps", biz.getContractTemp());
                } catch (Exception e) {
                }
            }
        });
        this.contractAttachService = contractAttachService;
        this.roomService = roomService;
        this.validator = validator;
        this.service = service;
    }



    @GetMapping("updatepage")
    public String doUpdateUserPage(HttpSession session, HttpServletRequest request,
                                   HttpServletResponse response) throws Exception {
        String roomId = request.getParameter("rid");
        Optional.ofNullable(roomId)
                .filter(StringUtils::isNotBlank)
                .filter(StringUtils::isNumeric)
                .orElseThrow(() -> new ValidatorException("房间id应为数字"));
        ContractInfoDAO dao = service.searchByRoomId(new BigDecimal(roomId));
        ContractBusinessVO vo = new ContractBusinessVO();
        BeanUtils.copy(dao, vo);
        request.setAttribute("rout", vo);

        Object room = Optional.ofNullable(roomId).map(BigDecimal::new).map(_id -> roomService.searchById(_id)).orElseThrow(() -> new ValidatorException("房间未找到"));
        RoomVO roomVO = new RoomVO();
        BeanUtils.copy(room, roomVO);
        request.setAttribute("room", roomVO);

        ContractFeesDAO feesDAO = new ContractFeesDAO();
        feesDAO.setContractId(dao.getId());
        List<ContractFeesDAO> fees = feesService.search(feesDAO);
        Optional.ofNullable(fees).ifPresent(_fees -> {
            List<String> exclusive = new ArrayList<>();
            exclusive.add(SystemConstant.FEE_TYPE_WYF);
            exclusive.add(SystemConstant.FEE_TYPE_FWZJ);
            exclusive.add(SystemConstant.FEE_TYPE_FWYJ);
            List<ContractFeesDAO> f = _fees.stream()
                    .filter(_fee -> !exclusive.contains(_fee.getFeeType()))
                    .collect(Collectors.toList());
            List fv = BeanUtils.copyList(f, ContractFeesVO.class);
            request.setAttribute("cvs", fv);
        });

        ContractAttachDAO attach = new ContractAttachDAO();
        attach.setContractId(dao.getId());
        List<ContractAttachDAO> attachs = contractAttachService.search(attach);
        List<String> as = attachs.stream().map(_a -> _a.getId()).map(BigDecimal::toString).collect(Collectors.toList());
        vo.setAttachIds(as.toArray());

        request.setAttribute("temps", biz.getContractTemp());

        return "contract_business/updatePage";
    }


    @Override
    @PostMapping("add")
    public String doAdd(@ModelAttribute("rout") ContractBusinessDTO dto, BindingResult result, HttpSession session, HttpServletRequest request,
                        HttpServletResponse response) throws Exception {
        BeanUtils.validateJSR303(validator, dto);
        ContractInfoDAO dao = biz.add(dto);
        request.setAttribute("contractId", dao.getId());
        return "forward:/contract/fees/page";
    }


    //上传附件
    @PostMapping("upload")
    @ResponseBody
    public String upload(MultipartFile file, BaseField f) throws Exception {
        ContractAttachDAO attach = new ContractAttachDAO();
        attach.setAttachType(SystemConstant.ATTACH_TYPE_CON_B);
        attach.setMediaType(SystemConstant.ATTACH_FILE_PIC);
        attach.setStoreType(SystemConstant.ATTACH_STORE_TYPE_CONTENT);
        attach.setMediaContent(file.getBytes());
        attach.setMediaDesc(file.getName());
        attach.setCompanyId(new BigDecimal(f.getCompanyId()));
        contractAttachService.insert(attach);
        return attach.getId().toString();
    }

    //下载附件
    @GetMapping("/download/{id}")
    public void download(@PathVariable String id, HttpServletRequest request, HttpServletResponse response) {
        Optional.ofNullable(id)
                .filter(StringUtils::isNotBlank)
                .map(BigDecimal::new)
                .map(_id -> (ContractAttachDAO) contractAttachService.searchById(_id))
                .map(_att -> _att.getMediaContent())
                .ifPresent(_data -> {
                    try (InputStream inputStream = new ByteArrayInputStream(_data);
                         OutputStream outputStream = response.getOutputStream();) {
                        response.setContentType("application/x-download");
                        response.addHeader("Content-Disposition", "attachment;filename=" + id + ".jpg");
                        IOUtils.copy(inputStream, outputStream);
                    } catch (Exception e) {
                        log.error("下载图片异常", e);
                    }
                });
        throw new ValidatorException("未找到图片");
    }

    @GetMapping("/delAtt/{id}")
    @ResponseBody
    public String deleteAttach(@PathVariable String id) {
        Optional.ofNullable(id)
                .filter(StringUtils::isNotBlank)
                .map(BigDecimal::new)
                .ifPresent(_id -> contractAttachService.delete(_id));
        return ResultVo.succeed("删除成功");
    }

}
