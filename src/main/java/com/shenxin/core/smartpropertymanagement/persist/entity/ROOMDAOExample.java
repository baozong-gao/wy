package com.shenxin.core.smartpropertymanagement.persist.entity;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class ROOMDAOExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ROOMDAOExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    public String getOrderByClause() {
        return orderByClause;
    }

    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    public boolean isDistinct() {
        return distinct;
    }

    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    protected abstract static class GeneratedCriteria {
        protected List<Criterion> criteria;

        protected GeneratedCriteria() {
            super();
            criteria = new ArrayList<Criterion>();
        }

        public boolean isValid() {
            return criteria.size() > 0;
        }

        public List<Criterion> getAllCriteria() {
            return criteria;
        }

        public List<Criterion> getCriteria() {
            return criteria;
        }

        protected void addCriterion(String condition) {
            if (condition == null) {
                throw new RuntimeException("Value for condition cannot be null");
            }
            criteria.add(new Criterion(condition));
        }

        protected void addCriterion(String condition, Object value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value));
        }

        protected void addCriterion(String condition, Object value1, Object value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value1, value2));
        }

        public Criteria andIdIsNull() {
            addCriterion("ID is null");
            return (Criteria) this;
        }

        public Criteria andIdIsNotNull() {
            addCriterion("ID is not null");
            return (Criteria) this;
        }

        public Criteria andIdEqualTo(BigDecimal value) {
            addCriterion("ID =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(BigDecimal value) {
            addCriterion("ID <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(BigDecimal value) {
            addCriterion("ID >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("ID >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(BigDecimal value) {
            addCriterion("ID <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(BigDecimal value) {
            addCriterion("ID <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<BigDecimal> values) {
            addCriterion("ID in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<BigDecimal> values) {
            addCriterion("ID not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("ID between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("ID not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andCompanyIdIsNull() {
            addCriterion("COMPANY_ID is null");
            return (Criteria) this;
        }

        public Criteria andCompanyIdIsNotNull() {
            addCriterion("COMPANY_ID is not null");
            return (Criteria) this;
        }

        public Criteria andCompanyIdEqualTo(BigDecimal value) {
            addCriterion("COMPANY_ID =", value, "companyId");
            return (Criteria) this;
        }

        public Criteria andCompanyIdNotEqualTo(BigDecimal value) {
            addCriterion("COMPANY_ID <>", value, "companyId");
            return (Criteria) this;
        }

        public Criteria andCompanyIdGreaterThan(BigDecimal value) {
            addCriterion("COMPANY_ID >", value, "companyId");
            return (Criteria) this;
        }

        public Criteria andCompanyIdGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("COMPANY_ID >=", value, "companyId");
            return (Criteria) this;
        }

        public Criteria andCompanyIdLessThan(BigDecimal value) {
            addCriterion("COMPANY_ID <", value, "companyId");
            return (Criteria) this;
        }

        public Criteria andCompanyIdLessThanOrEqualTo(BigDecimal value) {
            addCriterion("COMPANY_ID <=", value, "companyId");
            return (Criteria) this;
        }

        public Criteria andCompanyIdIn(List<BigDecimal> values) {
            addCriterion("COMPANY_ID in", values, "companyId");
            return (Criteria) this;
        }

        public Criteria andCompanyIdNotIn(List<BigDecimal> values) {
            addCriterion("COMPANY_ID not in", values, "companyId");
            return (Criteria) this;
        }

        public Criteria andCompanyIdBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("COMPANY_ID between", value1, value2, "companyId");
            return (Criteria) this;
        }

        public Criteria andCompanyIdNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("COMPANY_ID not between", value1, value2, "companyId");
            return (Criteria) this;
        }

        public Criteria andPropertyIdIsNull() {
            addCriterion("PROPERTY_ID is null");
            return (Criteria) this;
        }

        public Criteria andPropertyIdIsNotNull() {
            addCriterion("PROPERTY_ID is not null");
            return (Criteria) this;
        }

        public Criteria andPropertyIdEqualTo(BigDecimal value) {
            addCriterion("PROPERTY_ID =", value, "propertyId");
            return (Criteria) this;
        }

        public Criteria andPropertyIdNotEqualTo(BigDecimal value) {
            addCriterion("PROPERTY_ID <>", value, "propertyId");
            return (Criteria) this;
        }

        public Criteria andPropertyIdGreaterThan(BigDecimal value) {
            addCriterion("PROPERTY_ID >", value, "propertyId");
            return (Criteria) this;
        }

        public Criteria andPropertyIdGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("PROPERTY_ID >=", value, "propertyId");
            return (Criteria) this;
        }

        public Criteria andPropertyIdLessThan(BigDecimal value) {
            addCriterion("PROPERTY_ID <", value, "propertyId");
            return (Criteria) this;
        }

        public Criteria andPropertyIdLessThanOrEqualTo(BigDecimal value) {
            addCriterion("PROPERTY_ID <=", value, "propertyId");
            return (Criteria) this;
        }

        public Criteria andPropertyIdIn(List<BigDecimal> values) {
            addCriterion("PROPERTY_ID in", values, "propertyId");
            return (Criteria) this;
        }

        public Criteria andPropertyIdNotIn(List<BigDecimal> values) {
            addCriterion("PROPERTY_ID not in", values, "propertyId");
            return (Criteria) this;
        }

        public Criteria andPropertyIdBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("PROPERTY_ID between", value1, value2, "propertyId");
            return (Criteria) this;
        }

        public Criteria andPropertyIdNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("PROPERTY_ID not between", value1, value2, "propertyId");
            return (Criteria) this;
        }

        public Criteria andBuildingIdIsNull() {
            addCriterion("BUILDING_ID is null");
            return (Criteria) this;
        }

        public Criteria andBuildingIdIsNotNull() {
            addCriterion("BUILDING_ID is not null");
            return (Criteria) this;
        }

        public Criteria andBuildingIdEqualTo(BigDecimal value) {
            addCriterion("BUILDING_ID =", value, "buildingId");
            return (Criteria) this;
        }

        public Criteria andBuildingIdNotEqualTo(BigDecimal value) {
            addCriterion("BUILDING_ID <>", value, "buildingId");
            return (Criteria) this;
        }

        public Criteria andBuildingIdGreaterThan(BigDecimal value) {
            addCriterion("BUILDING_ID >", value, "buildingId");
            return (Criteria) this;
        }

        public Criteria andBuildingIdGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("BUILDING_ID >=", value, "buildingId");
            return (Criteria) this;
        }

        public Criteria andBuildingIdLessThan(BigDecimal value) {
            addCriterion("BUILDING_ID <", value, "buildingId");
            return (Criteria) this;
        }

        public Criteria andBuildingIdLessThanOrEqualTo(BigDecimal value) {
            addCriterion("BUILDING_ID <=", value, "buildingId");
            return (Criteria) this;
        }

        public Criteria andBuildingIdIn(List<BigDecimal> values) {
            addCriterion("BUILDING_ID in", values, "buildingId");
            return (Criteria) this;
        }

        public Criteria andBuildingIdNotIn(List<BigDecimal> values) {
            addCriterion("BUILDING_ID not in", values, "buildingId");
            return (Criteria) this;
        }

        public Criteria andBuildingIdBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("BUILDING_ID between", value1, value2, "buildingId");
            return (Criteria) this;
        }

        public Criteria andBuildingIdNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("BUILDING_ID not between", value1, value2, "buildingId");
            return (Criteria) this;
        }

        public Criteria andUnitIsNull() {
            addCriterion("UNIT is null");
            return (Criteria) this;
        }

        public Criteria andUnitIsNotNull() {
            addCriterion("UNIT is not null");
            return (Criteria) this;
        }

        public Criteria andUnitEqualTo(String value) {
            addCriterion("UNIT =", value, "unit");
            return (Criteria) this;
        }

        public Criteria andUnitNotEqualTo(String value) {
            addCriterion("UNIT <>", value, "unit");
            return (Criteria) this;
        }

        public Criteria andUnitGreaterThan(String value) {
            addCriterion("UNIT >", value, "unit");
            return (Criteria) this;
        }

        public Criteria andUnitGreaterThanOrEqualTo(String value) {
            addCriterion("UNIT >=", value, "unit");
            return (Criteria) this;
        }

        public Criteria andUnitLessThan(String value) {
            addCriterion("UNIT <", value, "unit");
            return (Criteria) this;
        }

        public Criteria andUnitLessThanOrEqualTo(String value) {
            addCriterion("UNIT <=", value, "unit");
            return (Criteria) this;
        }

        public Criteria andUnitLike(String value) {
            addCriterion("UNIT like", value, "unit");
            return (Criteria) this;
        }

        public Criteria andUnitNotLike(String value) {
            addCriterion("UNIT not like", value, "unit");
            return (Criteria) this;
        }

        public Criteria andUnitIn(List<String> values) {
            addCriterion("UNIT in", values, "unit");
            return (Criteria) this;
        }

        public Criteria andUnitNotIn(List<String> values) {
            addCriterion("UNIT not in", values, "unit");
            return (Criteria) this;
        }

        public Criteria andUnitBetween(String value1, String value2) {
            addCriterion("UNIT between", value1, value2, "unit");
            return (Criteria) this;
        }

        public Criteria andUnitNotBetween(String value1, String value2) {
            addCriterion("UNIT not between", value1, value2, "unit");
            return (Criteria) this;
        }

        public Criteria andFloorIsNull() {
            addCriterion("FLOOR is null");
            return (Criteria) this;
        }

        public Criteria andFloorIsNotNull() {
            addCriterion("FLOOR is not null");
            return (Criteria) this;
        }

        public Criteria andFloorEqualTo(String value) {
            addCriterion("FLOOR =", value, "floor");
            return (Criteria) this;
        }

        public Criteria andFloorNotEqualTo(String value) {
            addCriterion("FLOOR <>", value, "floor");
            return (Criteria) this;
        }

        public Criteria andFloorGreaterThan(String value) {
            addCriterion("FLOOR >", value, "floor");
            return (Criteria) this;
        }

        public Criteria andFloorGreaterThanOrEqualTo(String value) {
            addCriterion("FLOOR >=", value, "floor");
            return (Criteria) this;
        }

        public Criteria andFloorLessThan(String value) {
            addCriterion("FLOOR <", value, "floor");
            return (Criteria) this;
        }

        public Criteria andFloorLessThanOrEqualTo(String value) {
            addCriterion("FLOOR <=", value, "floor");
            return (Criteria) this;
        }

        public Criteria andFloorLike(String value) {
            addCriterion("FLOOR like", value, "floor");
            return (Criteria) this;
        }

        public Criteria andFloorNotLike(String value) {
            addCriterion("FLOOR not like", value, "floor");
            return (Criteria) this;
        }

        public Criteria andFloorIn(List<String> values) {
            addCriterion("FLOOR in", values, "floor");
            return (Criteria) this;
        }

        public Criteria andFloorNotIn(List<String> values) {
            addCriterion("FLOOR not in", values, "floor");
            return (Criteria) this;
        }

        public Criteria andFloorBetween(String value1, String value2) {
            addCriterion("FLOOR between", value1, value2, "floor");
            return (Criteria) this;
        }

        public Criteria andFloorNotBetween(String value1, String value2) {
            addCriterion("FLOOR not between", value1, value2, "floor");
            return (Criteria) this;
        }

        public Criteria andRoomIsNull() {
            addCriterion("ROOM is null");
            return (Criteria) this;
        }

        public Criteria andRoomIsNotNull() {
            addCriterion("ROOM is not null");
            return (Criteria) this;
        }

        public Criteria andRoomEqualTo(String value) {
            addCriterion("ROOM =", value, "room");
            return (Criteria) this;
        }

        public Criteria andRoomNotEqualTo(String value) {
            addCriterion("ROOM <>", value, "room");
            return (Criteria) this;
        }

        public Criteria andRoomGreaterThan(String value) {
            addCriterion("ROOM >", value, "room");
            return (Criteria) this;
        }

        public Criteria andRoomGreaterThanOrEqualTo(String value) {
            addCriterion("ROOM >=", value, "room");
            return (Criteria) this;
        }

        public Criteria andRoomLessThan(String value) {
            addCriterion("ROOM <", value, "room");
            return (Criteria) this;
        }

        public Criteria andRoomLessThanOrEqualTo(String value) {
            addCriterion("ROOM <=", value, "room");
            return (Criteria) this;
        }

        public Criteria andRoomLike(String value) {
            addCriterion("ROOM like", value, "room");
            return (Criteria) this;
        }

        public Criteria andRoomNotLike(String value) {
            addCriterion("ROOM not like", value, "room");
            return (Criteria) this;
        }

        public Criteria andRoomIn(List<String> values) {
            addCriterion("ROOM in", values, "room");
            return (Criteria) this;
        }

        public Criteria andRoomNotIn(List<String> values) {
            addCriterion("ROOM not in", values, "room");
            return (Criteria) this;
        }

        public Criteria andRoomBetween(String value1, String value2) {
            addCriterion("ROOM between", value1, value2, "room");
            return (Criteria) this;
        }

        public Criteria andRoomNotBetween(String value1, String value2) {
            addCriterion("ROOM not between", value1, value2, "room");
            return (Criteria) this;
        }

        public Criteria andSubRoomIsNull() {
            addCriterion("SUB_ROOM is null");
            return (Criteria) this;
        }

        public Criteria andSubRoomIsNotNull() {
            addCriterion("SUB_ROOM is not null");
            return (Criteria) this;
        }

        public Criteria andSubRoomEqualTo(String value) {
            addCriterion("SUB_ROOM =", value, "subRoom");
            return (Criteria) this;
        }

        public Criteria andSubRoomNotEqualTo(String value) {
            addCriterion("SUB_ROOM <>", value, "subRoom");
            return (Criteria) this;
        }

        public Criteria andSubRoomGreaterThan(String value) {
            addCriterion("SUB_ROOM >", value, "subRoom");
            return (Criteria) this;
        }

        public Criteria andSubRoomGreaterThanOrEqualTo(String value) {
            addCriterion("SUB_ROOM >=", value, "subRoom");
            return (Criteria) this;
        }

        public Criteria andSubRoomLessThan(String value) {
            addCriterion("SUB_ROOM <", value, "subRoom");
            return (Criteria) this;
        }

        public Criteria andSubRoomLessThanOrEqualTo(String value) {
            addCriterion("SUB_ROOM <=", value, "subRoom");
            return (Criteria) this;
        }

        public Criteria andSubRoomLike(String value) {
            addCriterion("SUB_ROOM like", value, "subRoom");
            return (Criteria) this;
        }

        public Criteria andSubRoomNotLike(String value) {
            addCriterion("SUB_ROOM not like", value, "subRoom");
            return (Criteria) this;
        }

        public Criteria andSubRoomIn(List<String> values) {
            addCriterion("SUB_ROOM in", values, "subRoom");
            return (Criteria) this;
        }

        public Criteria andSubRoomNotIn(List<String> values) {
            addCriterion("SUB_ROOM not in", values, "subRoom");
            return (Criteria) this;
        }

        public Criteria andSubRoomBetween(String value1, String value2) {
            addCriterion("SUB_ROOM between", value1, value2, "subRoom");
            return (Criteria) this;
        }

        public Criteria andSubRoomNotBetween(String value1, String value2) {
            addCriterion("SUB_ROOM not between", value1, value2, "subRoom");
            return (Criteria) this;
        }

        public Criteria andRoomTypeIsNull() {
            addCriterion("ROOM_TYPE is null");
            return (Criteria) this;
        }

        public Criteria andRoomTypeIsNotNull() {
            addCriterion("ROOM_TYPE is not null");
            return (Criteria) this;
        }

        public Criteria andRoomTypeEqualTo(String value) {
            addCriterion("ROOM_TYPE =", value, "roomType");
            return (Criteria) this;
        }

        public Criteria andRoomTypeNotEqualTo(String value) {
            addCriterion("ROOM_TYPE <>", value, "roomType");
            return (Criteria) this;
        }

        public Criteria andRoomTypeGreaterThan(String value) {
            addCriterion("ROOM_TYPE >", value, "roomType");
            return (Criteria) this;
        }

        public Criteria andRoomTypeGreaterThanOrEqualTo(String value) {
            addCriterion("ROOM_TYPE >=", value, "roomType");
            return (Criteria) this;
        }

        public Criteria andRoomTypeLessThan(String value) {
            addCriterion("ROOM_TYPE <", value, "roomType");
            return (Criteria) this;
        }

        public Criteria andRoomTypeLessThanOrEqualTo(String value) {
            addCriterion("ROOM_TYPE <=", value, "roomType");
            return (Criteria) this;
        }

        public Criteria andRoomTypeLike(String value) {
            addCriterion("ROOM_TYPE like", value, "roomType");
            return (Criteria) this;
        }

        public Criteria andRoomTypeNotLike(String value) {
            addCriterion("ROOM_TYPE not like", value, "roomType");
            return (Criteria) this;
        }

        public Criteria andRoomTypeIn(List<String> values) {
            addCriterion("ROOM_TYPE in", values, "roomType");
            return (Criteria) this;
        }

        public Criteria andRoomTypeNotIn(List<String> values) {
            addCriterion("ROOM_TYPE not in", values, "roomType");
            return (Criteria) this;
        }

        public Criteria andRoomTypeBetween(String value1, String value2) {
            addCriterion("ROOM_TYPE between", value1, value2, "roomType");
            return (Criteria) this;
        }

        public Criteria andRoomTypeNotBetween(String value1, String value2) {
            addCriterion("ROOM_TYPE not between", value1, value2, "roomType");
            return (Criteria) this;
        }

        public Criteria andRoomDescIsNull() {
            addCriterion("ROOM_DESC is null");
            return (Criteria) this;
        }

        public Criteria andRoomDescIsNotNull() {
            addCriterion("ROOM_DESC is not null");
            return (Criteria) this;
        }

        public Criteria andRoomDescEqualTo(String value) {
            addCriterion("ROOM_DESC =", value, "roomDesc");
            return (Criteria) this;
        }

        public Criteria andRoomDescNotEqualTo(String value) {
            addCriterion("ROOM_DESC <>", value, "roomDesc");
            return (Criteria) this;
        }

        public Criteria andRoomDescGreaterThan(String value) {
            addCriterion("ROOM_DESC >", value, "roomDesc");
            return (Criteria) this;
        }

        public Criteria andRoomDescGreaterThanOrEqualTo(String value) {
            addCriterion("ROOM_DESC >=", value, "roomDesc");
            return (Criteria) this;
        }

        public Criteria andRoomDescLessThan(String value) {
            addCriterion("ROOM_DESC <", value, "roomDesc");
            return (Criteria) this;
        }

        public Criteria andRoomDescLessThanOrEqualTo(String value) {
            addCriterion("ROOM_DESC <=", value, "roomDesc");
            return (Criteria) this;
        }

        public Criteria andRoomDescLike(String value) {
            addCriterion("ROOM_DESC like", value, "roomDesc");
            return (Criteria) this;
        }

        public Criteria andRoomDescNotLike(String value) {
            addCriterion("ROOM_DESC not like", value, "roomDesc");
            return (Criteria) this;
        }

        public Criteria andRoomDescIn(List<String> values) {
            addCriterion("ROOM_DESC in", values, "roomDesc");
            return (Criteria) this;
        }

        public Criteria andRoomDescNotIn(List<String> values) {
            addCriterion("ROOM_DESC not in", values, "roomDesc");
            return (Criteria) this;
        }

        public Criteria andRoomDescBetween(String value1, String value2) {
            addCriterion("ROOM_DESC between", value1, value2, "roomDesc");
            return (Criteria) this;
        }

        public Criteria andRoomDescNotBetween(String value1, String value2) {
            addCriterion("ROOM_DESC not between", value1, value2, "roomDesc");
            return (Criteria) this;
        }

        public Criteria andOwnerTypeIsNull() {
            addCriterion("OWNER_TYPE is null");
            return (Criteria) this;
        }

        public Criteria andOwnerTypeIsNotNull() {
            addCriterion("OWNER_TYPE is not null");
            return (Criteria) this;
        }

        public Criteria andOwnerTypeEqualTo(String value) {
            addCriterion("OWNER_TYPE =", value, "ownerType");
            return (Criteria) this;
        }

        public Criteria andOwnerTypeNotEqualTo(String value) {
            addCriterion("OWNER_TYPE <>", value, "ownerType");
            return (Criteria) this;
        }

        public Criteria andOwnerTypeGreaterThan(String value) {
            addCriterion("OWNER_TYPE >", value, "ownerType");
            return (Criteria) this;
        }

        public Criteria andOwnerTypeGreaterThanOrEqualTo(String value) {
            addCriterion("OWNER_TYPE >=", value, "ownerType");
            return (Criteria) this;
        }

        public Criteria andOwnerTypeLessThan(String value) {
            addCriterion("OWNER_TYPE <", value, "ownerType");
            return (Criteria) this;
        }

        public Criteria andOwnerTypeLessThanOrEqualTo(String value) {
            addCriterion("OWNER_TYPE <=", value, "ownerType");
            return (Criteria) this;
        }

        public Criteria andOwnerTypeLike(String value) {
            addCriterion("OWNER_TYPE like", value, "ownerType");
            return (Criteria) this;
        }

        public Criteria andOwnerTypeNotLike(String value) {
            addCriterion("OWNER_TYPE not like", value, "ownerType");
            return (Criteria) this;
        }

        public Criteria andOwnerTypeIn(List<String> values) {
            addCriterion("OWNER_TYPE in", values, "ownerType");
            return (Criteria) this;
        }

        public Criteria andOwnerTypeNotIn(List<String> values) {
            addCriterion("OWNER_TYPE not in", values, "ownerType");
            return (Criteria) this;
        }

        public Criteria andOwnerTypeBetween(String value1, String value2) {
            addCriterion("OWNER_TYPE between", value1, value2, "ownerType");
            return (Criteria) this;
        }

        public Criteria andOwnerTypeNotBetween(String value1, String value2) {
            addCriterion("OWNER_TYPE not between", value1, value2, "ownerType");
            return (Criteria) this;
        }

        public Criteria andOwnerNameIsNull() {
            addCriterion("OWNER_NAME is null");
            return (Criteria) this;
        }

        public Criteria andOwnerNameIsNotNull() {
            addCriterion("OWNER_NAME is not null");
            return (Criteria) this;
        }

        public Criteria andOwnerNameEqualTo(String value) {
            addCriterion("OWNER_NAME =", value, "ownerName");
            return (Criteria) this;
        }

        public Criteria andOwnerNameNotEqualTo(String value) {
            addCriterion("OWNER_NAME <>", value, "ownerName");
            return (Criteria) this;
        }

        public Criteria andOwnerNameGreaterThan(String value) {
            addCriterion("OWNER_NAME >", value, "ownerName");
            return (Criteria) this;
        }

        public Criteria andOwnerNameGreaterThanOrEqualTo(String value) {
            addCriterion("OWNER_NAME >=", value, "ownerName");
            return (Criteria) this;
        }

        public Criteria andOwnerNameLessThan(String value) {
            addCriterion("OWNER_NAME <", value, "ownerName");
            return (Criteria) this;
        }

        public Criteria andOwnerNameLessThanOrEqualTo(String value) {
            addCriterion("OWNER_NAME <=", value, "ownerName");
            return (Criteria) this;
        }

        public Criteria andOwnerNameLike(String value) {
            addCriterion("OWNER_NAME like", value, "ownerName");
            return (Criteria) this;
        }

        public Criteria andOwnerNameNotLike(String value) {
            addCriterion("OWNER_NAME not like", value, "ownerName");
            return (Criteria) this;
        }

        public Criteria andOwnerNameIn(List<String> values) {
            addCriterion("OWNER_NAME in", values, "ownerName");
            return (Criteria) this;
        }

        public Criteria andOwnerNameNotIn(List<String> values) {
            addCriterion("OWNER_NAME not in", values, "ownerName");
            return (Criteria) this;
        }

        public Criteria andOwnerNameBetween(String value1, String value2) {
            addCriterion("OWNER_NAME between", value1, value2, "ownerName");
            return (Criteria) this;
        }

        public Criteria andOwnerNameNotBetween(String value1, String value2) {
            addCriterion("OWNER_NAME not between", value1, value2, "ownerName");
            return (Criteria) this;
        }

        public Criteria andOwnerContactIsNull() {
            addCriterion("OWNER_CONTACT is null");
            return (Criteria) this;
        }

        public Criteria andOwnerContactIsNotNull() {
            addCriterion("OWNER_CONTACT is not null");
            return (Criteria) this;
        }

        public Criteria andOwnerContactEqualTo(String value) {
            addCriterion("OWNER_CONTACT =", value, "ownerContact");
            return (Criteria) this;
        }

        public Criteria andOwnerContactNotEqualTo(String value) {
            addCriterion("OWNER_CONTACT <>", value, "ownerContact");
            return (Criteria) this;
        }

        public Criteria andOwnerContactGreaterThan(String value) {
            addCriterion("OWNER_CONTACT >", value, "ownerContact");
            return (Criteria) this;
        }

        public Criteria andOwnerContactGreaterThanOrEqualTo(String value) {
            addCriterion("OWNER_CONTACT >=", value, "ownerContact");
            return (Criteria) this;
        }

        public Criteria andOwnerContactLessThan(String value) {
            addCriterion("OWNER_CONTACT <", value, "ownerContact");
            return (Criteria) this;
        }

        public Criteria andOwnerContactLessThanOrEqualTo(String value) {
            addCriterion("OWNER_CONTACT <=", value, "ownerContact");
            return (Criteria) this;
        }

        public Criteria andOwnerContactLike(String value) {
            addCriterion("OWNER_CONTACT like", value, "ownerContact");
            return (Criteria) this;
        }

        public Criteria andOwnerContactNotLike(String value) {
            addCriterion("OWNER_CONTACT not like", value, "ownerContact");
            return (Criteria) this;
        }

        public Criteria andOwnerContactIn(List<String> values) {
            addCriterion("OWNER_CONTACT in", values, "ownerContact");
            return (Criteria) this;
        }

        public Criteria andOwnerContactNotIn(List<String> values) {
            addCriterion("OWNER_CONTACT not in", values, "ownerContact");
            return (Criteria) this;
        }

        public Criteria andOwnerContactBetween(String value1, String value2) {
            addCriterion("OWNER_CONTACT between", value1, value2, "ownerContact");
            return (Criteria) this;
        }

        public Criteria andOwnerContactNotBetween(String value1, String value2) {
            addCriterion("OWNER_CONTACT not between", value1, value2, "ownerContact");
            return (Criteria) this;
        }

        public Criteria andRoomPropertyIsNull() {
            addCriterion("ROOM_PROPERTY is null");
            return (Criteria) this;
        }

        public Criteria andRoomPropertyIsNotNull() {
            addCriterion("ROOM_PROPERTY is not null");
            return (Criteria) this;
        }

        public Criteria andRoomPropertyEqualTo(String value) {
            addCriterion("ROOM_PROPERTY =", value, "roomProperty");
            return (Criteria) this;
        }

        public Criteria andRoomPropertyNotEqualTo(String value) {
            addCriterion("ROOM_PROPERTY <>", value, "roomProperty");
            return (Criteria) this;
        }

        public Criteria andRoomPropertyGreaterThan(String value) {
            addCriterion("ROOM_PROPERTY >", value, "roomProperty");
            return (Criteria) this;
        }

        public Criteria andRoomPropertyGreaterThanOrEqualTo(String value) {
            addCriterion("ROOM_PROPERTY >=", value, "roomProperty");
            return (Criteria) this;
        }

        public Criteria andRoomPropertyLessThan(String value) {
            addCriterion("ROOM_PROPERTY <", value, "roomProperty");
            return (Criteria) this;
        }

        public Criteria andRoomPropertyLessThanOrEqualTo(String value) {
            addCriterion("ROOM_PROPERTY <=", value, "roomProperty");
            return (Criteria) this;
        }

        public Criteria andRoomPropertyLike(String value) {
            addCriterion("ROOM_PROPERTY like", value, "roomProperty");
            return (Criteria) this;
        }

        public Criteria andRoomPropertyNotLike(String value) {
            addCriterion("ROOM_PROPERTY not like", value, "roomProperty");
            return (Criteria) this;
        }

        public Criteria andRoomPropertyIn(List<String> values) {
            addCriterion("ROOM_PROPERTY in", values, "roomProperty");
            return (Criteria) this;
        }

        public Criteria andRoomPropertyNotIn(List<String> values) {
            addCriterion("ROOM_PROPERTY not in", values, "roomProperty");
            return (Criteria) this;
        }

        public Criteria andRoomPropertyBetween(String value1, String value2) {
            addCriterion("ROOM_PROPERTY between", value1, value2, "roomProperty");
            return (Criteria) this;
        }

        public Criteria andRoomPropertyNotBetween(String value1, String value2) {
            addCriterion("ROOM_PROPERTY not between", value1, value2, "roomProperty");
            return (Criteria) this;
        }

        public Criteria andRoomPurposeIsNull() {
            addCriterion("ROOM_PURPOSE is null");
            return (Criteria) this;
        }

        public Criteria andRoomPurposeIsNotNull() {
            addCriterion("ROOM_PURPOSE is not null");
            return (Criteria) this;
        }

        public Criteria andRoomPurposeEqualTo(String value) {
            addCriterion("ROOM_PURPOSE =", value, "roomPurpose");
            return (Criteria) this;
        }

        public Criteria andRoomPurposeNotEqualTo(String value) {
            addCriterion("ROOM_PURPOSE <>", value, "roomPurpose");
            return (Criteria) this;
        }

        public Criteria andRoomPurposeGreaterThan(String value) {
            addCriterion("ROOM_PURPOSE >", value, "roomPurpose");
            return (Criteria) this;
        }

        public Criteria andRoomPurposeGreaterThanOrEqualTo(String value) {
            addCriterion("ROOM_PURPOSE >=", value, "roomPurpose");
            return (Criteria) this;
        }

        public Criteria andRoomPurposeLessThan(String value) {
            addCriterion("ROOM_PURPOSE <", value, "roomPurpose");
            return (Criteria) this;
        }

        public Criteria andRoomPurposeLessThanOrEqualTo(String value) {
            addCriterion("ROOM_PURPOSE <=", value, "roomPurpose");
            return (Criteria) this;
        }

        public Criteria andRoomPurposeLike(String value) {
            addCriterion("ROOM_PURPOSE like", value, "roomPurpose");
            return (Criteria) this;
        }

        public Criteria andRoomPurposeNotLike(String value) {
            addCriterion("ROOM_PURPOSE not like", value, "roomPurpose");
            return (Criteria) this;
        }

        public Criteria andRoomPurposeIn(List<String> values) {
            addCriterion("ROOM_PURPOSE in", values, "roomPurpose");
            return (Criteria) this;
        }

        public Criteria andRoomPurposeNotIn(List<String> values) {
            addCriterion("ROOM_PURPOSE not in", values, "roomPurpose");
            return (Criteria) this;
        }

        public Criteria andRoomPurposeBetween(String value1, String value2) {
            addCriterion("ROOM_PURPOSE between", value1, value2, "roomPurpose");
            return (Criteria) this;
        }

        public Criteria andRoomPurposeNotBetween(String value1, String value2) {
            addCriterion("ROOM_PURPOSE not between", value1, value2, "roomPurpose");
            return (Criteria) this;
        }

        public Criteria andRoomSizeIsNull() {
            addCriterion("ROOM_SIZE is null");
            return (Criteria) this;
        }

        public Criteria andRoomSizeIsNotNull() {
            addCriterion("ROOM_SIZE is not null");
            return (Criteria) this;
        }

        public Criteria andRoomSizeEqualTo(BigDecimal value) {
            addCriterion("ROOM_SIZE =", value, "roomSize");
            return (Criteria) this;
        }

        public Criteria andRoomSizeNotEqualTo(BigDecimal value) {
            addCriterion("ROOM_SIZE <>", value, "roomSize");
            return (Criteria) this;
        }

        public Criteria andRoomSizeGreaterThan(BigDecimal value) {
            addCriterion("ROOM_SIZE >", value, "roomSize");
            return (Criteria) this;
        }

        public Criteria andRoomSizeGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("ROOM_SIZE >=", value, "roomSize");
            return (Criteria) this;
        }

        public Criteria andRoomSizeLessThan(BigDecimal value) {
            addCriterion("ROOM_SIZE <", value, "roomSize");
            return (Criteria) this;
        }

        public Criteria andRoomSizeLessThanOrEqualTo(BigDecimal value) {
            addCriterion("ROOM_SIZE <=", value, "roomSize");
            return (Criteria) this;
        }

        public Criteria andRoomSizeIn(List<BigDecimal> values) {
            addCriterion("ROOM_SIZE in", values, "roomSize");
            return (Criteria) this;
        }

        public Criteria andRoomSizeNotIn(List<BigDecimal> values) {
            addCriterion("ROOM_SIZE not in", values, "roomSize");
            return (Criteria) this;
        }

        public Criteria andRoomSizeBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("ROOM_SIZE between", value1, value2, "roomSize");
            return (Criteria) this;
        }

        public Criteria andRoomSizeNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("ROOM_SIZE not between", value1, value2, "roomSize");
            return (Criteria) this;
        }

        public Criteria andRoomAspectIsNull() {
            addCriterion("ROOM_ASPECT is null");
            return (Criteria) this;
        }

        public Criteria andRoomAspectIsNotNull() {
            addCriterion("ROOM_ASPECT is not null");
            return (Criteria) this;
        }

        public Criteria andRoomAspectEqualTo(String value) {
            addCriterion("ROOM_ASPECT =", value, "roomAspect");
            return (Criteria) this;
        }

        public Criteria andRoomAspectNotEqualTo(String value) {
            addCriterion("ROOM_ASPECT <>", value, "roomAspect");
            return (Criteria) this;
        }

        public Criteria andRoomAspectGreaterThan(String value) {
            addCriterion("ROOM_ASPECT >", value, "roomAspect");
            return (Criteria) this;
        }

        public Criteria andRoomAspectGreaterThanOrEqualTo(String value) {
            addCriterion("ROOM_ASPECT >=", value, "roomAspect");
            return (Criteria) this;
        }

        public Criteria andRoomAspectLessThan(String value) {
            addCriterion("ROOM_ASPECT <", value, "roomAspect");
            return (Criteria) this;
        }

        public Criteria andRoomAspectLessThanOrEqualTo(String value) {
            addCriterion("ROOM_ASPECT <=", value, "roomAspect");
            return (Criteria) this;
        }

        public Criteria andRoomAspectLike(String value) {
            addCriterion("ROOM_ASPECT like", value, "roomAspect");
            return (Criteria) this;
        }

        public Criteria andRoomAspectNotLike(String value) {
            addCriterion("ROOM_ASPECT not like", value, "roomAspect");
            return (Criteria) this;
        }

        public Criteria andRoomAspectIn(List<String> values) {
            addCriterion("ROOM_ASPECT in", values, "roomAspect");
            return (Criteria) this;
        }

        public Criteria andRoomAspectNotIn(List<String> values) {
            addCriterion("ROOM_ASPECT not in", values, "roomAspect");
            return (Criteria) this;
        }

        public Criteria andRoomAspectBetween(String value1, String value2) {
            addCriterion("ROOM_ASPECT between", value1, value2, "roomAspect");
            return (Criteria) this;
        }

        public Criteria andRoomAspectNotBetween(String value1, String value2) {
            addCriterion("ROOM_ASPECT not between", value1, value2, "roomAspect");
            return (Criteria) this;
        }

        public Criteria andRoomLayoutIsNull() {
            addCriterion("ROOM_LAYOUT is null");
            return (Criteria) this;
        }

        public Criteria andRoomLayoutIsNotNull() {
            addCriterion("ROOM_LAYOUT is not null");
            return (Criteria) this;
        }

        public Criteria andRoomLayoutEqualTo(String value) {
            addCriterion("ROOM_LAYOUT =", value, "roomLayout");
            return (Criteria) this;
        }

        public Criteria andRoomLayoutNotEqualTo(String value) {
            addCriterion("ROOM_LAYOUT <>", value, "roomLayout");
            return (Criteria) this;
        }

        public Criteria andRoomLayoutGreaterThan(String value) {
            addCriterion("ROOM_LAYOUT >", value, "roomLayout");
            return (Criteria) this;
        }

        public Criteria andRoomLayoutGreaterThanOrEqualTo(String value) {
            addCriterion("ROOM_LAYOUT >=", value, "roomLayout");
            return (Criteria) this;
        }

        public Criteria andRoomLayoutLessThan(String value) {
            addCriterion("ROOM_LAYOUT <", value, "roomLayout");
            return (Criteria) this;
        }

        public Criteria andRoomLayoutLessThanOrEqualTo(String value) {
            addCriterion("ROOM_LAYOUT <=", value, "roomLayout");
            return (Criteria) this;
        }

        public Criteria andRoomLayoutLike(String value) {
            addCriterion("ROOM_LAYOUT like", value, "roomLayout");
            return (Criteria) this;
        }

        public Criteria andRoomLayoutNotLike(String value) {
            addCriterion("ROOM_LAYOUT not like", value, "roomLayout");
            return (Criteria) this;
        }

        public Criteria andRoomLayoutIn(List<String> values) {
            addCriterion("ROOM_LAYOUT in", values, "roomLayout");
            return (Criteria) this;
        }

        public Criteria andRoomLayoutNotIn(List<String> values) {
            addCriterion("ROOM_LAYOUT not in", values, "roomLayout");
            return (Criteria) this;
        }

        public Criteria andRoomLayoutBetween(String value1, String value2) {
            addCriterion("ROOM_LAYOUT between", value1, value2, "roomLayout");
            return (Criteria) this;
        }

        public Criteria andRoomLayoutNotBetween(String value1, String value2) {
            addCriterion("ROOM_LAYOUT not between", value1, value2, "roomLayout");
            return (Criteria) this;
        }

        public Criteria andRoomBookPriceIsNull() {
            addCriterion("ROOM_BOOK_PRICE is null");
            return (Criteria) this;
        }

        public Criteria andRoomBookPriceIsNotNull() {
            addCriterion("ROOM_BOOK_PRICE is not null");
            return (Criteria) this;
        }

        public Criteria andRoomBookPriceEqualTo(BigDecimal value) {
            addCriterion("ROOM_BOOK_PRICE =", value, "roomBookPrice");
            return (Criteria) this;
        }

        public Criteria andRoomBookPriceNotEqualTo(BigDecimal value) {
            addCriterion("ROOM_BOOK_PRICE <>", value, "roomBookPrice");
            return (Criteria) this;
        }

        public Criteria andRoomBookPriceGreaterThan(BigDecimal value) {
            addCriterion("ROOM_BOOK_PRICE >", value, "roomBookPrice");
            return (Criteria) this;
        }

        public Criteria andRoomBookPriceGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("ROOM_BOOK_PRICE >=", value, "roomBookPrice");
            return (Criteria) this;
        }

        public Criteria andRoomBookPriceLessThan(BigDecimal value) {
            addCriterion("ROOM_BOOK_PRICE <", value, "roomBookPrice");
            return (Criteria) this;
        }

        public Criteria andRoomBookPriceLessThanOrEqualTo(BigDecimal value) {
            addCriterion("ROOM_BOOK_PRICE <=", value, "roomBookPrice");
            return (Criteria) this;
        }

        public Criteria andRoomBookPriceIn(List<BigDecimal> values) {
            addCriterion("ROOM_BOOK_PRICE in", values, "roomBookPrice");
            return (Criteria) this;
        }

        public Criteria andRoomBookPriceNotIn(List<BigDecimal> values) {
            addCriterion("ROOM_BOOK_PRICE not in", values, "roomBookPrice");
            return (Criteria) this;
        }

        public Criteria andRoomBookPriceBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("ROOM_BOOK_PRICE between", value1, value2, "roomBookPrice");
            return (Criteria) this;
        }

        public Criteria andRoomBookPriceNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("ROOM_BOOK_PRICE not between", value1, value2, "roomBookPrice");
            return (Criteria) this;
        }

        public Criteria andRoomStatusIsNull() {
            addCriterion("ROOM_STATUS is null");
            return (Criteria) this;
        }

        public Criteria andRoomStatusIsNotNull() {
            addCriterion("ROOM_STATUS is not null");
            return (Criteria) this;
        }

        public Criteria andRoomStatusEqualTo(String value) {
            addCriterion("ROOM_STATUS =", value, "roomStatus");
            return (Criteria) this;
        }

        public Criteria andRoomStatusNotEqualTo(String value) {
            addCriterion("ROOM_STATUS <>", value, "roomStatus");
            return (Criteria) this;
        }

        public Criteria andRoomStatusGreaterThan(String value) {
            addCriterion("ROOM_STATUS >", value, "roomStatus");
            return (Criteria) this;
        }

        public Criteria andRoomStatusGreaterThanOrEqualTo(String value) {
            addCriterion("ROOM_STATUS >=", value, "roomStatus");
            return (Criteria) this;
        }

        public Criteria andRoomStatusLessThan(String value) {
            addCriterion("ROOM_STATUS <", value, "roomStatus");
            return (Criteria) this;
        }

        public Criteria andRoomStatusLessThanOrEqualTo(String value) {
            addCriterion("ROOM_STATUS <=", value, "roomStatus");
            return (Criteria) this;
        }

        public Criteria andRoomStatusLike(String value) {
            addCriterion("ROOM_STATUS like", value, "roomStatus");
            return (Criteria) this;
        }

        public Criteria andRoomStatusNotLike(String value) {
            addCriterion("ROOM_STATUS not like", value, "roomStatus");
            return (Criteria) this;
        }

        public Criteria andRoomStatusIn(List<String> values) {
            addCriterion("ROOM_STATUS in", values, "roomStatus");
            return (Criteria) this;
        }

        public Criteria andRoomStatusNotIn(List<String> values) {
            addCriterion("ROOM_STATUS not in", values, "roomStatus");
            return (Criteria) this;
        }

        public Criteria andRoomStatusBetween(String value1, String value2) {
            addCriterion("ROOM_STATUS between", value1, value2, "roomStatus");
            return (Criteria) this;
        }

        public Criteria andRoomStatusNotBetween(String value1, String value2) {
            addCriterion("ROOM_STATUS not between", value1, value2, "roomStatus");
            return (Criteria) this;
        }

        public Criteria andRemarkIsNull() {
            addCriterion("REMARK is null");
            return (Criteria) this;
        }

        public Criteria andRemarkIsNotNull() {
            addCriterion("REMARK is not null");
            return (Criteria) this;
        }

        public Criteria andRemarkEqualTo(String value) {
            addCriterion("REMARK =", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotEqualTo(String value) {
            addCriterion("REMARK <>", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkGreaterThan(String value) {
            addCriterion("REMARK >", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkGreaterThanOrEqualTo(String value) {
            addCriterion("REMARK >=", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkLessThan(String value) {
            addCriterion("REMARK <", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkLessThanOrEqualTo(String value) {
            addCriterion("REMARK <=", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkLike(String value) {
            addCriterion("REMARK like", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotLike(String value) {
            addCriterion("REMARK not like", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkIn(List<String> values) {
            addCriterion("REMARK in", values, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotIn(List<String> values) {
            addCriterion("REMARK not in", values, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkBetween(String value1, String value2) {
            addCriterion("REMARK between", value1, value2, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotBetween(String value1, String value2) {
            addCriterion("REMARK not between", value1, value2, "remark");
            return (Criteria) this;
        }

        public Criteria andRoomRentPriceIsNull() {
            addCriterion("ROOM_RENT_PRICE is null");
            return (Criteria) this;
        }

        public Criteria andRoomRentPriceIsNotNull() {
            addCriterion("ROOM_RENT_PRICE is not null");
            return (Criteria) this;
        }

        public Criteria andRoomRentPriceEqualTo(BigDecimal value) {
            addCriterion("ROOM_RENT_PRICE =", value, "roomRentPrice");
            return (Criteria) this;
        }

        public Criteria andRoomRentPriceNotEqualTo(BigDecimal value) {
            addCriterion("ROOM_RENT_PRICE <>", value, "roomRentPrice");
            return (Criteria) this;
        }

        public Criteria andRoomRentPriceGreaterThan(BigDecimal value) {
            addCriterion("ROOM_RENT_PRICE >", value, "roomRentPrice");
            return (Criteria) this;
        }

        public Criteria andRoomRentPriceGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("ROOM_RENT_PRICE >=", value, "roomRentPrice");
            return (Criteria) this;
        }

        public Criteria andRoomRentPriceLessThan(BigDecimal value) {
            addCriterion("ROOM_RENT_PRICE <", value, "roomRentPrice");
            return (Criteria) this;
        }

        public Criteria andRoomRentPriceLessThanOrEqualTo(BigDecimal value) {
            addCriterion("ROOM_RENT_PRICE <=", value, "roomRentPrice");
            return (Criteria) this;
        }

        public Criteria andRoomRentPriceIn(List<BigDecimal> values) {
            addCriterion("ROOM_RENT_PRICE in", values, "roomRentPrice");
            return (Criteria) this;
        }

        public Criteria andRoomRentPriceNotIn(List<BigDecimal> values) {
            addCriterion("ROOM_RENT_PRICE not in", values, "roomRentPrice");
            return (Criteria) this;
        }

        public Criteria andRoomRentPriceBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("ROOM_RENT_PRICE between", value1, value2, "roomRentPrice");
            return (Criteria) this;
        }

        public Criteria andRoomRentPriceNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("ROOM_RENT_PRICE not between", value1, value2, "roomRentPrice");
            return (Criteria) this;
        }
    }

    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    public static class Criterion {
        private String condition;

        private Object value;

        private Object secondValue;

        private boolean noValue;

        private boolean singleValue;

        private boolean betweenValue;

        private boolean listValue;

        private String typeHandler;

        public String getCondition() {
            return condition;
        }

        public Object getValue() {
            return value;
        }

        public Object getSecondValue() {
            return secondValue;
        }

        public boolean isNoValue() {
            return noValue;
        }

        public boolean isSingleValue() {
            return singleValue;
        }

        public boolean isBetweenValue() {
            return betweenValue;
        }

        public boolean isListValue() {
            return listValue;
        }

        public String getTypeHandler() {
            return typeHandler;
        }

        protected Criterion(String condition) {
            super();
            this.condition = condition;
            this.typeHandler = null;
            this.noValue = true;
        }

        protected Criterion(String condition, Object value, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.typeHandler = typeHandler;
            if (value instanceof List<?>) {
                this.listValue = true;
            } else {
                this.singleValue = true;
            }
        }

        protected Criterion(String condition, Object value) {
            this(condition, value, null);
        }

        protected Criterion(String condition, Object value, Object secondValue, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.secondValue = secondValue;
            this.typeHandler = typeHandler;
            this.betweenValue = true;
        }

        protected Criterion(String condition, Object value, Object secondValue) {
            this(condition, value, secondValue, null);
        }
    }
}