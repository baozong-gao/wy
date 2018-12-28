package com.shenxin.core.smartpropertymanagement.controller.impl;

import com.shenxin.core.smartpropertymanagement.controller.HeightenBaseControllerSupport;
import com.shenxin.core.smartpropertymanagement.controller.IBaseController;
import com.shenxin.core.smartpropertymanagement.domain.SystemConstant;
import com.shenxin.core.smartpropertymanagement.domain.bo.RoomBO;
import com.shenxin.core.smartpropertymanagement.domain.dto.BatchRoomDTO;
import com.shenxin.core.smartpropertymanagement.domain.dto.RoomDTO;
import com.shenxin.core.smartpropertymanagement.domain.vo.BuildingInfoVO;
import com.shenxin.core.smartpropertymanagement.domain.vo.PropertyInfoVO;
import com.shenxin.core.smartpropertymanagement.domain.vo.RoomVO;
import com.shenxin.core.smartpropertymanagement.persist.entity.BuildingInfo;
import com.shenxin.core.smartpropertymanagement.persist.entity.PropertyInfo;
import com.shenxin.core.smartpropertymanagement.persist.entity.ROOMDAO;
import com.shenxin.core.smartpropertymanagement.service.biz.ContractBusinessBiz;
import com.shenxin.core.smartpropertymanagement.service.biz.ContractFeesInfoBiz;
import com.shenxin.core.smartpropertymanagement.service.impl.BuildingInfoServiceImpl;
import com.shenxin.core.smartpropertymanagement.service.impl.PropertyInfoServiceImpl;
import com.shenxin.core.smartpropertymanagement.service.impl.RoomServiceImpl;
import com.shenxin.core.smartpropertymanagement.util.BeanUtils;
import com.shenxin.core.smartpropertymanagement.util.ResultVo;
import com.shenxin.core.smartpropertymanagement.util.UserUtil;
import com.shenxin.core.smartpropertymanagement.util.exception.ValidatorException;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.Validator;
import org.springframework.web.bind.annotation.*;

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
 * @Description: 房间
 * @Date: Created in 2018/7/9 - 10:46
 * @Version: V1.0
 */
@Slf4j
@Controller
@RequestMapping("room")
public class RoomController extends IBaseController<RoomBO, RoomVO, ROOMDAO, RoomDTO> {

    PropertyInfoServiceImpl propertyInfoService;

    RoomServiceImpl service;

    BuildingInfoServiceImpl buildingInfoService;

    Validator validator;

    @Autowired
    ContractFeesInfoBiz feesInfoBiz;

    @Autowired
    ContractBusinessBiz contractBiz;

    @Autowired
    public RoomController(RoomServiceImpl service, Validator validator, PropertyInfoServiceImpl propertyInfoService, BuildingInfoServiceImpl buildingInfoService) {
        super(service, validator, "room", new HeightenBaseControllerSupport() {
            @Override
            public void insertPageAfter(HttpServletRequest request, HttpServletResponse response) {
                PropertyInfo dao = new PropertyInfo();
                dao.setCompanyId(UserUtil.getUserCompanyId());
                // 搜索当前公司的所有业态
                List<PropertyInfo> propertyInfos = propertyInfoService.search(dao);
                request.setAttribute("propertys", BeanUtils.copyList(propertyInfos, PropertyInfoVO.class));

                Optional.ofNullable(propertyInfos).filter(_p -> _p.size()>0).orElseThrow(()->new ValidatorException("公司不存在业态"));
                BuildingInfo building = new BuildingInfo();
                building.setCompanyId(UserUtil.getUserCompanyId());
                building.setPropertyId(propertyInfos.get(0).getId());
                // 搜索当前公司的,第一个业态的所有建筑.
                List<BuildingInfo> buildings = buildingInfoService.search(building);
                request.setAttribute("buildings", BeanUtils.copyList(buildings, BuildingInfoVO.class));
            }

            @Override
            public void insertBefore(HttpServletRequest request, HttpServletResponse response, Object dao) {
                ROOMDAO dao1 = ((ROOMDAO) dao);
                if (dao1.getRoomStatus() == null) {
                    // 默认房屋状态空房
                    dao1.setRoomStatus(SystemConstant.BUSINESS_ROOM_STATUS_EMPTY);
                }
                BuildingInfo buildingInfo = buildingInfoService.searchById(dao1.getBuildingId());
                dao1.setRoomDesc(buildingInfo.getBuildingName() + " - " + dao1.getUnit() + "单元 - " + dao1.getFloor() + "层 - " + dao1.getRoom() + "室");
            }

            @Override
            public void updateBefore(HttpServletRequest request, HttpServletResponse response, Object dao) {
                ROOMDAO dao1 = ((ROOMDAO) dao);
                BuildingInfo buildingInfo = buildingInfoService.searchById(dao1.getBuildingId());
                dao1.setRoomDesc(buildingInfo.getBuildingName() + " - " + dao1.getUnit() + "单元 - " + dao1.getFloor() + "层 - " + dao1.getRoom() + "室");
            }

            @Override
            public void updatePageAfter(HttpServletRequest request, HttpServletResponse response, Object dao) {
                insertPageAfter(request, response);
            }

            // searchPageBefore or After 都用不到,因为页面里面都是用ajax重新请求 下拉选择项

            @Override
            public void searchBefore(HttpServletRequest request, HttpServletResponse response, Object bo) {
                // 只影响bo,数据并用不到
                propertyTypeHandler(request, (RoomBO) bo, propertyInfoService);
            }

            @Override
            public void searchAfter(HttpServletRequest request, HttpServletResponse response, List result) {
                result.stream().forEach(vo -> {
                    RoomVO roomVO = ((RoomVO) vo);
                    // 将查询内容的buildingId和propertyId替换成对应的名字
                    Optional.ofNullable(roomVO).filter(vo1 -> vo1.getBuildingId() != null).map(vo1 -> (BuildingInfo) buildingInfoService.searchById(vo1.getBuildingId())).ifPresent(b -> roomVO.setBuildingName(b.getBuildingName()));
                    Optional.ofNullable(roomVO).filter(vo1 -> vo1.getPropertyId() != null).map(vo1 -> (PropertyInfo) propertyInfoService.searchById(vo1.getPropertyId())).ifPresent(b -> roomVO.setPropertyName(b.getPropertyName()));
                });
            }
        });
        this.propertyInfoService = propertyInfoService;
        this.service = service;
        this.buildingInfoService = buildingInfoService;
        this.validator = validator;
    }


    private static void propertyTypeHandler(HttpServletRequest request, RoomBO bo, PropertyInfoServiceImpl propertyInfoService) {
        String pType = request.getParameter("pt");
        // 通过pType 获取 所有的业态id;
        // 传给bo
        List<BigDecimal> propertyIds = Optional.ofNullable(pType)
                .map(_type -> {
                    PropertyInfo _d = new PropertyInfo();
                    _d.setPropertyType(_type);
                    List<PropertyInfo> propertyInfoList = propertyInfoService.search(_d);
                    return propertyInfoList.stream().map(_p -> _p.getId()).collect(Collectors.toList());
                }).orElse(null);

        if (propertyIds != null && propertyIds.size() == 0){
            throw new ValidatorException("没有业态");
        }
        log.info("pType {}--propertyIds:{}",pType,propertyIds);
        bo.setPropertyIds(propertyIds);
        request.setAttribute("pt", pType);
    }

    // 根据业态ids获取对应的building列表
    private static void SearchConvert(HttpServletRequest request,List<BigDecimal> buildingIds, BuildingInfoServiceImpl buildingInfoService) {
        if (buildingIds == null || buildingIds.size() == 0){
            request.setAttribute("buildings", null);
            return;
        }
        BuildingInfo buildingInfo = new BuildingInfo();
        buildingInfo.setPropertyIds(buildingIds);
        List<BuildingInfo> buildings = buildingInfoService.search(buildingInfo);
        List<BuildingInfoVO> bs = BeanUtils.copyList(buildings, BuildingInfoVO.class);
        log.info("{}",bs);
        request.setAttribute("buildings", bs);
    }

    @Override
    @GetMapping("page")
    public String doPage(HttpSession session, HttpServletRequest request, HttpServletResponse response) throws Exception {
        String pType = request.getParameter("pt");
        request.setAttribute("pt", pType);
        log.info("pt:{}",pType);
        // 根据pt不同的类型,返回不同的页面
        if(SystemConstant.ROOM_TYPE_RESIDENCE.equals(pType)){  //居民住宅返回页面
            return "room/listPageResidence";
        }else if(SystemConstant.ROOM_TYPE_BUSINESS.equals(pType)){
            return "room/listPageBusiness";
        }else{
            return "room/listPageHotel";
        }
    }


    @PostMapping(value = "search", produces = "application/json; charset=utf-8")
    @ResponseBody
    public String doSelectJson(@ModelAttribute RoomBO form, HttpSession session, HttpServletRequest request,
                               HttpServletResponse response) throws Exception {
        return super.doSelect(form, session, request, response);
    }

    @GetMapping("delete/{id:.*}")
    public String delete(@PathVariable String id, HttpServletRequest request, HttpServletResponse response) throws Exception {
        service.delete(new BigDecimal(id));
        String pType = request.getParameter("pt");
        return "redirect:/room/page?pt=" + pType;
    }

    // 退房
    @GetMapping("checkout/{id:.*}")
    @ResponseBody
    public String checkOut(@PathVariable String id) {

        ROOMDAO room = service.searchById(new BigDecimal(id));
        if(room == null){
            return ResultVo.error("房间不存在");
        }

        if (feesInfoBiz.overdueFeesByRoomId(room.getId())) {
            return ResultVo.error("存在逾期帐单,请补齐费用");
        }

        feesInfoBiz.deleteInitialByRoomId(room.getId());

        contractBiz.checkOut(room);
        return ResultVo.succeed();
    }

    @GetMapping("batchPage")
    public String batchAddPage(HttpServletRequest request) {
        PropertyInfo dao = new PropertyInfo();
        dao.setCompanyId(UserUtil.getUserCompanyId());
        List<PropertyInfo> propertyInfos = propertyInfoService.search(dao);
        // 获取当前公司的property
        request.setAttribute("propertys", BeanUtils.copyList(propertyInfos, PropertyInfoVO.class));

        BuildingInfo building = new BuildingInfo();
        building.setCompanyId(UserUtil.getUserCompanyId());
        if(propertyInfos != null && propertyInfos.size() > 0){
            building.setPropertyId(propertyInfos.get(0).getId());
        }

        // 获取当前公司以及第一个物业对应的楼宇.
        List<BuildingInfo> buildings = buildingInfoService.search(building);
        request.setAttribute("buildings", BeanUtils.copyList(buildings, BuildingInfoVO.class));
        return "room/batchAdd";
    }

    @PostMapping("batch")
    @ResponseBody
    public String batchAdd(@RequestBody BatchRoomDTO dto, HttpServletRequest request) {
        try {
            BuildingInfo buildingInfo = buildingInfoService.searchById(dto.getBuildingId());
            List<RoomDTO> roomsDto = dto.getRooms();
            List<ROOMDAO> rooms = new ArrayList<>();
            ROOMDAO dao = null;
            for (RoomDTO room : roomsDto) {
                room.setCompanyId(dto.getCompanyId());
                room.setBuildingId(dto.getBuildingId());
                room.setPropertyId(dto.getPropertyId());
                room.setRoomType(dto.getRoomType());
                dao = new ROOMDAO();
                BeanUtils.copy(room, dao);
                dao.setRoomStatus(SystemConstant.BUSINESS_ROOM_STATUS_EMPTY);
                dao.setRoomDesc(buildingInfo.getBuildingName() + " - " + dao.getUnit() + "单元 - " + dao.getFloor() + "层 - " + dao.getRoom() + "室");
                rooms.add(dao);
            }
            log.info("{} {}", dao, rooms);
            // 批量执行sql
            service.addBatch(rooms);
        } catch (Exception e) {
            log.error("批量增加房间错误", e);
            return ResultVo.error("批量增加房间错误");
        }
        return ResultVo.succeed();
    }
}
