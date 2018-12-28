package com.shenxin.core.smartpropertymanagement.service.biz;

import com.shenxin.core.smartpropertymanagement.domain.SystemConstant;
import com.shenxin.core.smartpropertymanagement.domain.bo.ContractBusinessBO;
import com.shenxin.core.smartpropertymanagement.domain.dto.ContractBusinessDTO;
import com.shenxin.core.smartpropertymanagement.domain.vo.ContractBusinessVO;
import com.shenxin.core.smartpropertymanagement.persist.entity.*;
import com.shenxin.core.smartpropertymanagement.persist.mapper.ContractRoomInfoDAOMapper;
import com.shenxin.core.smartpropertymanagement.persist.mapper.UnionQueryMapper;
import com.shenxin.core.smartpropertymanagement.service.impl.*;
import com.shenxin.core.smartpropertymanagement.util.BeanUtils;
import com.shenxin.core.smartpropertymanagement.util.UserUtil;
import com.shenxin.core.smartpropertymanagement.util.exception.ValidatorException;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.util.*;
import java.util.stream.Collectors;

/**
 * @Author: gaobaozong
 * @Description: 商业楼宇业务
 * @Date: Created in 2018/7/26 - 10:55
 * @Version: V1.0
 */
@Component
public class ContractBusinessBiz {

    @Autowired
    ContractAttachServiceImpl contractAttachService;

    @Autowired
    ContractBillsServiceImpl billsService;


    @Autowired
    RoomServiceImpl roomService;

    @Autowired
    ContractBusinessServiceImpl service;

    @Autowired
    ContractFeesServiceImpl feesService;

    @Autowired
    ContractRoomInfoDAOMapper roomMapper;

    @Autowired
    UnionQueryMapper unionQueryMapper;

    DateTimeFormatter  formatter =  DateTimeFormatter.ofPattern("yyyyMMdd");

    public List getContractTemp(){
       BigDecimal companyId =  UserUtil.getUserCompanyId();
       return  unionQueryMapper.getContractTemp(companyId.toString());
    }

    public void setRoomCampany(List<ContractBusinessVO> vos){
        if(vos == null || vos.size() == 0){
            return ;
        }

        List<String> contractIds = vos.stream().map(vo -> vo.getId()+"").collect(Collectors.toList());
        if(contractIds == null || contractIds.size() == 0){
            return;
        }
        List<CompanyRoomRL> rls = unionQueryMapper.getCompanyRoomByContractIds(contractIds.toArray());
        HashMap<BigDecimal, CompanyRoomRL> rlsmap = new HashMap<>();
        rls.forEach(rl -> {
            rlsmap.put(rl.getContractId(),rl);
        });
        vos.forEach(vo -> {
            CompanyRoomRL roomrl = rlsmap.get(vo.getId());
            Optional.ofNullable(roomrl).ifPresent(rl -> {
                vo.setRoom(rl.getRoomName());
                vo.setProperty(rl.getPropertyName());
                vo.setCompany(rl.getCompanyName());
                vo.setBuilding(rl.getBuildingName());
            });
        });
    }


    public void setBoRoomIds(ContractBusinessBO bo){
        List<BigDecimal> roomIds = new ArrayList<>();
        Optional.ofNullable(bo.getRoom()).ifPresent(_id -> roomIds.add(_id));
        if(roomIds.size() == 0 && (bo.getProperty() != null || bo.getBuilding() != null)){
            // 房间id没有,业态或者楼宇非空
            // 通过业态或者楼宇查询房间,加入房间id列表
            ROOMDAO room = new ROOMDAO();
            room.setPropertyId(bo.getProperty());
            room.setBuildingId(bo.getBuilding());
            Optional.ofNullable(roomService.search(room)).ifPresent(_rooms -> {
                _rooms.stream().map(_room -> _room.getId()).forEach(_id -> roomIds.add(_id));
            });
        }

        List<BigDecimal> contractIds = new ArrayList<>();
        if(roomIds.size() > 0){
            ContractRoomInfoDAOExample example = new ContractRoomInfoDAOExample();
            example.createCriteria().andRoomIdIn(roomIds);
            // 房屋合同通过 房屋id筛选
            Optional.ofNullable(roomMapper.selectByExample(example)).ifPresent(_crs ->{
                _crs.stream().map(_cr -> _cr.getContractId()).forEach(_cid -> contractIds.add(_cid));
            });
            bo.setIds(contractIds);
        }
    }

    @Transactional
    public void checkOut(ROOMDAO room){
        room.setRoomStatus(SystemConstant.BUSINESS_ROOM_STATUS_EMPTY);
        roomService.update(room);

        ContractInfoDAO contract = service.searchByRoomId(room.getId());
        contract.setContractStatus(SystemConstant.CONTRACT_STATUS_CLOSE);
        contract.setRoomId(room.getId());
        service.update(contract);

        ContractRoomInfoDAOExample example = new ContractRoomInfoDAOExample();
        example.createCriteria().andRoomIdEqualTo(room.getId()).andCompanyIdEqualTo(UserUtil.getUserCompanyId()).andContractIdEqualTo(contract.getId());
        ContractRoomInfoDAO contractRoomInfo = new ContractRoomInfoDAO();
        contractRoomInfo.setStatus(SystemConstant.STATUS_CLOSE);
        roomMapper.updateByExampleSelective(contractRoomInfo, example);

    }

    @Transactional
    public ContractInfoDAO add(ContractBusinessDTO dto) throws Exception {

        LocalDate startDate = LocalDate.parse(dto.getContractStartDate(), formatter);
        LocalDate endDate = LocalDate.parse(dto.getContractEndDate(), formatter);
        int payPeriod = dto.getFeePayPeriod().intValue();  //付几
        BigDecimal holdPeriod = dto.getFeeHoldPeriod(); //押几

        Period p = Period.between(startDate, endDate);
        long feePeriod = Optional.ofNullable(p.getYears()).map(_y -> _y *12).orElse(0) +
                Optional.ofNullable(p.getMonths()).orElse(0) +
                Optional.ofNullable(p.getDays()).filter(_d -> _d > 0).map(_d -> 1).orElse(0); //周期


        ContractInfoDAO dao = new ContractInfoDAO();
        BeanUtils.copy(dto, dao);
        dao.setContractStatus(SystemConstant.CONTRACT_STATUS_NEED_CONFIRM);
        dao.setContractPeriod(new BigDecimal(feePeriod));
        service.insert(dao);

        ROOMDAO room = new ROOMDAO();
        room.setId(dto.getRoomId());
        room.setRoomStatus(SystemConstant.BUSINESS_ROOM_STAUTS_RENT);
        roomService.update(room);
        room = roomService.searchById(room.getId());
        BigDecimal roomSize = room.getRoomSize();
        Optional.ofNullable(roomSize).filter(_r -> _r.longValue() > 0).orElseThrow(() -> new ValidatorException("房间面积不能小于0"));

        Arrays.stream(dto.getAttachIds()).filter(StringUtils::isNotBlank).map(BigDecimal::new).forEach(id -> {
            ContractAttachDAO attachDAO = contractAttachService.searchById(id);
            attachDAO.setContractId(dao.getId());
            contractAttachService.update(attachDAO);
        });

        Optional.ofNullable(dto.getPayAmt()).ifPresent(_amt -> {
            ContractBusinessDTO.ContractFeeCategory fee = new ContractBusinessDTO.ContractFeeCategory();
            fee.feeAmount = _amt.multiply(roomSize);
            fee.feePayType = SystemConstant.FEE_PAY_TYPE_PERIOD;
            fee.feeType = SystemConstant.FEE_TYPE_FWZJ;
            if(dto.fees == null ) {
                dto.fees = new ArrayList<>();
            }
            dto.getFees().add(fee);

        });

        Optional.ofNullable(dto.getDepositAmt()).ifPresent(_amt -> {
            ContractBusinessDTO.ContractFeeCategory fee = new ContractBusinessDTO.ContractFeeCategory();
            fee.feeAmount = _amt;
            fee.feePayType = SystemConstant.FEE_PAY_TYPE_ONETIME;
            fee.feeType = SystemConstant.FEE_TYPE_FWYJ;
            if(dto.fees == null ) {
                dto.fees = new ArrayList<>();
            }
            dto.getFees().add(fee);

        });

        Optional.ofNullable(dto.getPropertyAmt()).ifPresent(_amt -> {
            ContractBusinessDTO.ContractFeeCategory fee = new ContractBusinessDTO.ContractFeeCategory();
            fee.feeAmount = _amt;
            fee.feePayType = dto.getFeePayType();
            fee.feeType = SystemConstant.FEE_TYPE_WYF;
            if(dto.fees == null ) {
                dto.fees = new ArrayList<>();
            }
            dto.getFees().add(fee);

        });

        List<ContractBusinessDTO.ContractFeeCategory> fees = dto.getFees();
        String companyId = dto.getCompanyId();
        BigDecimal roomId = dto.getRoomId();
        BigDecimal contractId = dao.getId();
        String feeChangeCalculate = dto.getFeeChangeCalculate();

        generateFees(fees,companyId,roomId,contractId,feeChangeCalculate, startDate, endDate, payPeriod, holdPeriod, feePeriod);
        return dao;
    }

    /**
     * 生成费用
     * @param fees        费用列表
     * @param companyId   公司id
     * @param roomId      房间id
     * @param contractId  合同id
     * @param feeChangeCalculate  增长率
     * @param startDate  开始时间
     * @param endDate    结束时间
     * @param payPeriod  付几
     * @param holdPeriod 押几
     * @param feePeriod  周期
     */
    public void generateFees(List<ContractBusinessDTO.ContractFeeCategory> fees,String companyId,BigDecimal roomId, BigDecimal contractId,String feeChangeCalculate, LocalDate startDate, LocalDate endDate, int payPeriod, BigDecimal holdPeriod, long feePeriod ) {
        Optional.ofNullable(fees)
                .filter(_fees -> _fees.size() > 0)
                .ifPresent(_fees ->
                        _fees.stream().forEach(_fee -> {
                            try {
                                ContractFeesDAO feesDAO = new ContractFeesDAO();
                                BeanUtils.copy(_fee, feesDAO);
                                feesDAO.setCompanyId(new BigDecimal(companyId));
                                feesDAO.setContractId(contractId);
                                feesDAO.setRoomId(roomId);
                                feesDAO.setFeeStatus(SystemConstant.FEE_STATUS_INITIAL);

                                if(SystemConstant.FEE_PAY_TYPE_ONETIME.equals(_fee.feePayType)){
                                    feesDAO.setFeePhase("1");
                                    feesDAO.setFeePeriod(new BigDecimal(1));
                                    feesDAO.setFeeStartDate(startDate.format(formatter));
                                    feesDAO.setFeeEndDate(endDate.format(formatter));
                                    feesDAO.setReceivableDate(feesDAO.getFeeStartDate());
                                    if(SystemConstant.FEE_TYPE_OTHER.equals(_fee.getFeeType())){
                                        feesDAO.setFeeAmount(_fee.feeAmount);
                                    }else{
                                        feesDAO.setFeeAmount(_fee.feeAmount.multiply(holdPeriod));
                                    }
                                    feesService.insert(feesDAO);
                                }else if(SystemConstant.FEE_PAY_TYPE_PERIOD.equals(_fee.feePayType)){
                                    feesDAO.setFeePeriod(new BigDecimal(feePeriod));
                                    int _feePeriod = 0;
                                    String feeEndDate = "";
                                    for(LocalDate t = startDate;t.isBefore(endDate);){
                                        feesDAO.setFeeStartDate(t.format(formatter));
                                        feesDAO.setFeeEndDate(t.plusMonths(1).plusDays(-1).format(formatter));
                                        if(_feePeriod % payPeriod == 0){
                                            feeEndDate = feesDAO.getFeeStartDate();
                                        }
                                        feesDAO.setReceivableDate(feeEndDate);
                                        feesDAO.setFeePhase(++_feePeriod+"");

                                        t = t.plusMonths(1);
                                        if(t.isAfter(endDate)){
                                            feesDAO.setFeeEndDate(endDate.format(formatter));
                                        }
                                        if(_feePeriod % 12 == 1){
                                            feesDAO.setFeeAmount(feesDAO.getFeeAmount().multiply(new BigDecimal(feeChangeCalculate)));
                                        }
                                        feesService.insert(feesDAO);
                                    }
                                }

                            } catch (Exception e) {
                                throw new RuntimeException(e);
                            }
                        }));
    }

}
