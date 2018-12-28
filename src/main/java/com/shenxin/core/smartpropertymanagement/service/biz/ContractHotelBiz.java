package com.shenxin.core.smartpropertymanagement.service.biz;

import com.shenxin.core.smartpropertymanagement.domain.SystemConstant;
import com.shenxin.core.smartpropertymanagement.domain.dto.ContractHotelDTO;
import com.shenxin.core.smartpropertymanagement.persist.entity.*;
import com.shenxin.core.smartpropertymanagement.service.impl.*;
import com.shenxin.core.smartpropertymanagement.util.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Optional;

@Component
public class ContractHotelBiz {

    @Autowired
    ContractAttachServiceImpl contractAttachService;
    @Autowired
    RoomServiceImpl roomService;
    @Autowired
    ContractHotelServiceImpl service;
    @Autowired
    ContractFeesServiceImpl feesService;
    @Autowired
    ContractRoomLiverServiceImpl roomLiverService;

    @Transactional
    public ContractInfoDAO add(ContractHotelDTO dto) throws Exception {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyyMMdd");
        LocalDate startDate = LocalDate.parse(dto.getContractStartDate(), formatter);
        LocalDate endDate = LocalDate.parse(dto.getContractEndDate(), formatter);
        int payPeriod = dto.getFeePayPeriod().intValue();  //付几
        BigDecimal holdPeriod = dto.getFeeHoldPeriod(); //押几
        BigDecimal roomId = dto.getRoomId();

        Period p = Period.between(startDate, endDate);
        long feePeriod = Optional.ofNullable(p.getYears()).map(_y -> _y * 12).orElse(0) +
                Optional.ofNullable(p.getMonths()).orElse(0) +
                Optional.ofNullable(p.getDays()).filter(_d -> _d > 0).map(_d -> 1).orElse(0); //周期

        ContractInfoDAO dao = new ContractInfoDAO();
        BeanUtils.copy(dto, dao);
        dao.setContractStatus(SystemConstant.CONTRACT_STATUS_NEED_CONFIRM);
        dao.setContractPeriod(new BigDecimal(feePeriod));
        dao.setContractType(SystemConstant.PROPERTY_TYPE_HOTEL);
        service.insert(dao);

        ROOMDAO room = new ROOMDAO();
        room.setId(dto.getRoomId());
        room.setRoomStatus(SystemConstant.BUSINESS_ROOM_STAUTS_RENT);
        roomService.update(room);

        Optional.ofNullable(dto.getHotelAPic()).ifPresent(apic -> {
            ContractAttachDAO attach = new ContractAttachDAO();
            attach.setCompanyId(dao.getId());
            attach.setAttachType(SystemConstant.ATTACH_TYPE_CON_B);
            attach.setMediaType(SystemConstant.ATTACH_FILE_PIC);
            attach.setStoreType(SystemConstant.ATTACH_STORE_TYPE_CONTENT);
            attach.setMediaContent(apic.getBytes());
            attach.setCompanyId(new BigDecimal(dto.getCompanyId()));
            contractAttachService.insert(attach);
        });
        Optional.ofNullable(dto.getHotelBPic()).ifPresent(bpic -> {
            ContractAttachDAO attach = new ContractAttachDAO();
            attach.setCompanyId(dao.getId());
            attach.setAttachType(SystemConstant.ATTACH_TYPE_CON_B);
            attach.setMediaType(SystemConstant.ATTACH_FILE_PIC);
            attach.setStoreType(SystemConstant.ATTACH_STORE_TYPE_CONTENT);
            attach.setMediaContent(bpic.getBytes());
            attach.setCompanyId(new BigDecimal(dto.getCompanyId()));
            contractAttachService.insert(attach);
        });

        Optional.ofNullable(dto.getPayAmt()).ifPresent(_amt -> {
            ContractHotelDTO.ContractFeeCategory fee = new ContractHotelDTO.ContractFeeCategory();
            fee.feeAmount = _amt;
            fee.feePayType = SystemConstant.FEE_PAY_TYPE_PERIOD;
            fee.feeType = SystemConstant.FEE_TYPE_FWZJ;
            if (dto.fees == null) {
                dto.fees = new ArrayList<>();
            }
            dto.getFees().add(fee);
        });

        Optional.ofNullable(dto.getDepositAmt()).ifPresent(_amt -> {
            ContractHotelDTO.ContractFeeCategory fee = new ContractHotelDTO.ContractFeeCategory();
            fee.feeAmount = _amt;
            fee.feePayType = SystemConstant.FEE_PAY_TYPE_ONETIME;
            fee.feeType = SystemConstant.FEE_TYPE_FWYJ;
            if (dto.fees == null) {
                dto.fees = new ArrayList<>();
            }
            dto.getFees().add(fee);
        });

        Optional.ofNullable(dto.getLivers())
                .filter(livers -> livers.size() > 0)
                .ifPresent(livers ->
                        livers.stream().forEach(liver -> {
                            try {
                                ContractRoomLiver liverDAO = new ContractRoomLiver();
                                BeanUtils.copy(liver, liverDAO);
                                liverDAO.setCompanyId(new BigDecimal(dto.getCompanyId()));
                                liverDAO.setContractId(dao.getId());
                                liverDAO.setRoomId(roomId);
                                roomLiverService.insert(liverDAO);
                            } catch (Exception e) {
                                throw new RuntimeException(e);
                            }
                        }));

        Optional.ofNullable(dto.getFees())
                .filter(_fees -> _fees.size() > 0)
                .ifPresent(_fees ->
                        _fees.stream().forEach(_fee -> {
                            try {
                                ContractFeesDAO feesDAO = new ContractFeesDAO();
                                BeanUtils.copy(_fee, feesDAO);
                                feesDAO.setCompanyId(new BigDecimal(dto.getCompanyId()));
                                feesDAO.setContractId(dao.getId());
                                feesDAO.setRoomId(roomId);
                                feesDAO.setFeeStatus(SystemConstant.FEE_STATUS_INITIAL);
                                feesDAO.setVersion(BigDecimal.ONE);
                                if (SystemConstant.FEE_PAY_TYPE_ONETIME.equals(_fee.feePayType)) {
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
                                } else if (SystemConstant.FEE_PAY_TYPE_PERIOD.equals(_fee.feePayType)) {
                                    feesDAO.setFeePeriod(new BigDecimal(feePeriod));
                                    int _feePeriod = 0;
                                    String feeEndDate = "";
                                    for (LocalDate t = startDate; t.isBefore(endDate); ) {
                                        feesDAO.setFeeStartDate(t.format(formatter));
                                        feesDAO.setFeeEndDate(t.plusMonths(1).plusDays(-1).format(formatter));
                                        if (_feePeriod % payPeriod == 0) {
                                            feeEndDate = feesDAO.getFeeStartDate();
                                        }
                                        feesDAO.setReceivableDate(feeEndDate);
                                        feesDAO.setFeePhase(++_feePeriod + "");

                                        t = t.plusMonths(1);
                                        if (t.isAfter(endDate)) {
                                            feesDAO.setFeeEndDate(endDate.format(formatter));
                                        }
                                        feesService.insert(feesDAO);
                                    }
                                }

                            } catch (Exception e) {
                                throw new RuntimeException(e);
                            }
                        }));
        return dao;
    }

}
