package com.shenxin.core.smartpropertymanagement.persist.entity;

import com.shenxin.core.smartpropertymanagement.domain.em.SearchFiledAlias;

import java.math.BigDecimal;
import java.util.List;

public class ROOMDAO {
    private BigDecimal id;

    private BigDecimal companyId;

    private BigDecimal propertyId;

    private BigDecimal buildingId;

    private String unit;

    private String floor;

    private String room;

    private String subRoom;

    private String roomType;

    private String roomDesc;

    private String ownerType;

    private String ownerName;

    private String ownerContact;

    private String roomProperty;

    private String roomPurpose;

    private BigDecimal roomSize;

    private String roomAspect;

    private String roomLayout;

    private BigDecimal roomBookPrice;

    private String roomStatus;

    private String remark;

    private BigDecimal roomRentPrice;

    @SearchFiledAlias("propertyId")
    private List<BigDecimal> propertyIds;

    public List<BigDecimal> getPropertyIds() {
        return propertyIds;
    }

    public void setPropertyIds(List<BigDecimal> propertyIds) {
        this.propertyIds = propertyIds;
    }

    public BigDecimal getId() {
        return id;
    }

    public void setId(BigDecimal id) {
        this.id = id;
    }

    public BigDecimal getCompanyId() {
        return companyId;
    }

    public void setCompanyId(BigDecimal companyId) {
        this.companyId = companyId;
    }

    public BigDecimal getPropertyId() {
        return propertyId;
    }

    public void setPropertyId(BigDecimal propertyId) {
        this.propertyId = propertyId;
    }

    public BigDecimal getBuildingId() {
        return buildingId;
    }

    public void setBuildingId(BigDecimal buildingId) {
        this.buildingId = buildingId;
    }

    public String getUnit() {
        return unit;
    }

    public void setUnit(String unit) {
        this.unit = unit == null ? null : unit.trim();
    }

    public String getFloor() {
        return floor;
    }

    public void setFloor(String floor) {
        this.floor = floor == null ? null : floor.trim();
    }

    public String getRoom() {
        return room;
    }

    public void setRoom(String room) {
        this.room = room == null ? null : room.trim();
    }

    public String getSubRoom() {
        return subRoom;
    }

    public void setSubRoom(String subRoom) {
        this.subRoom = subRoom == null ? null : subRoom.trim();
    }

    public String getRoomType() {
        return roomType;
    }

    public void setRoomType(String roomType) {
        this.roomType = roomType == null ? null : roomType.trim();
    }

    public String getRoomDesc() {
        return roomDesc;
    }

    public void setRoomDesc(String roomDesc) {
        this.roomDesc = roomDesc == null ? null : roomDesc.trim();
    }

    public String getOwnerType() {
        return ownerType;
    }

    public void setOwnerType(String ownerType) {
        this.ownerType = ownerType == null ? null : ownerType.trim();
    }

    public String getOwnerName() {
        return ownerName;
    }

    public void setOwnerName(String ownerName) {
        this.ownerName = ownerName == null ? null : ownerName.trim();
    }

    public String getOwnerContact() {
        return ownerContact;
    }

    public void setOwnerContact(String ownerContact) {
        this.ownerContact = ownerContact == null ? null : ownerContact.trim();
    }

    public String getRoomProperty() {
        return roomProperty;
    }

    public void setRoomProperty(String roomProperty) {
        this.roomProperty = roomProperty == null ? null : roomProperty.trim();
    }

    public String getRoomPurpose() {
        return roomPurpose;
    }

    public void setRoomPurpose(String roomPurpose) {
        this.roomPurpose = roomPurpose == null ? null : roomPurpose.trim();
    }

    public BigDecimal getRoomSize() {
        return roomSize;
    }

    public void setRoomSize(BigDecimal roomSize) {
        this.roomSize = roomSize;
    }

    public String getRoomAspect() {
        return roomAspect;
    }

    public void setRoomAspect(String roomAspect) {
        this.roomAspect = roomAspect == null ? null : roomAspect.trim();
    }

    public String getRoomLayout() {
        return roomLayout;
    }

    public void setRoomLayout(String roomLayout) {
        this.roomLayout = roomLayout == null ? null : roomLayout.trim();
    }

    public BigDecimal getRoomBookPrice() {
        return roomBookPrice;
    }

    public void setRoomBookPrice(BigDecimal roomBookPrice) {
        this.roomBookPrice = roomBookPrice;
    }

    public String getRoomStatus() {
        return roomStatus;
    }

    public void setRoomStatus(String roomStatus) {
        this.roomStatus = roomStatus == null ? null : roomStatus.trim();
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark == null ? null : remark.trim();
    }

    public BigDecimal getRoomRentPrice() {
        return roomRentPrice;
    }

    public void setRoomRentPrice(BigDecimal roomRentPrice) {
        this.roomRentPrice = roomRentPrice;
    }
}