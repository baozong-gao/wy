package com.shenxin.core.smartpropertymanagement.controller.impl;

import com.shenxin.core.smartpropertymanagement.controller.HeightenBaseControllerSupport;
import com.shenxin.core.smartpropertymanagement.controller.IBaseController;
import com.shenxin.core.smartpropertymanagement.domain.SystemConstant;
import com.shenxin.core.smartpropertymanagement.domain.bo.ContractHotelBO;
import com.shenxin.core.smartpropertymanagement.domain.dto.ContractHotelDTO;
import com.shenxin.core.smartpropertymanagement.domain.vo.ContractBusinessVO;
import com.shenxin.core.smartpropertymanagement.domain.vo.ContractFeesVO;
import com.shenxin.core.smartpropertymanagement.domain.vo.ContractHotelVO;
import com.shenxin.core.smartpropertymanagement.domain.vo.RoomVO;
import com.shenxin.core.smartpropertymanagement.persist.entity.ContractAttachDAO;
import com.shenxin.core.smartpropertymanagement.persist.entity.ContractFeesDAO;
import com.shenxin.core.smartpropertymanagement.persist.entity.ContractInfoDAO;
import com.shenxin.core.smartpropertymanagement.service.biz.ContractBusinessBiz;
import com.shenxin.core.smartpropertymanagement.service.biz.ContractHotelBiz;
import com.shenxin.core.smartpropertymanagement.service.impl.ContractAttachServiceImpl;
import com.shenxin.core.smartpropertymanagement.service.impl.ContractBusinessServiceImpl;
import com.shenxin.core.smartpropertymanagement.service.impl.ContractFeesServiceImpl;
import com.shenxin.core.smartpropertymanagement.service.impl.RoomServiceImpl;
import com.shenxin.core.smartpropertymanagement.util.BeanUtils;
import com.shenxin.core.smartpropertymanagement.util.exception.ValidatorException;
import lombok.extern.slf4j.Slf4j;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.validation.Validator;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.math.BigDecimal;
import java.util.ArrayList;
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
@RequestMapping("/contract/hotel")
public class ContractHotelController extends IBaseController<ContractHotelBO, ContractHotelVO, ContractInfoDAO, ContractHotelDTO> {

    ContractAttachServiceImpl contractAttachService;
    @Autowired
    ContractBusinessServiceImpl service;
    RoomServiceImpl roomService;
    Validator validator;
    @Autowired
    ContractHotelBiz contractHotelBiz;
    @Autowired
    ContractFeesServiceImpl feesService;
    @Autowired
    ContractBusinessBiz biz;

    @Autowired
    public ContractHotelController(ContractBusinessServiceImpl service, Validator validator, ContractAttachServiceImpl contractAttachService, RoomServiceImpl roomService,ContractBusinessBiz biz) {
        super(service, validator, "contract_hotel", new HeightenBaseControllerSupport() {
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
    }


    @Override
    @PostMapping("add")
    public String doAdd(@ModelAttribute("rout") ContractHotelDTO dto, BindingResult result, HttpSession session, HttpServletRequest request,
                        HttpServletResponse response) throws Exception {
        BeanUtils.validateJSR303(validator, dto);
        ContractInfoDAO dao = contractHotelBiz.add(dto);
        request.setAttribute("contractId", dao.getId());
        return "forward:/contract/fees/page";
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

}
