package com.shenxin.core.smartpropertymanagement.persist.entity;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class BuildingInfoExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public BuildingInfoExample() {
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

        public Criteria andBuildingNameIsNull() {
            addCriterion("BUILDING_NAME is null");
            return (Criteria) this;
        }

        public Criteria andBuildingNameIsNotNull() {
            addCriterion("BUILDING_NAME is not null");
            return (Criteria) this;
        }

        public Criteria andBuildingNameEqualTo(String value) {
            addCriterion("BUILDING_NAME =", value, "buildingName");
            return (Criteria) this;
        }

        public Criteria andBuildingNameNotEqualTo(String value) {
            addCriterion("BUILDING_NAME <>", value, "buildingName");
            return (Criteria) this;
        }

        public Criteria andBuildingNameGreaterThan(String value) {
            addCriterion("BUILDING_NAME >", value, "buildingName");
            return (Criteria) this;
        }

        public Criteria andBuildingNameGreaterThanOrEqualTo(String value) {
            addCriterion("BUILDING_NAME >=", value, "buildingName");
            return (Criteria) this;
        }

        public Criteria andBuildingNameLessThan(String value) {
            addCriterion("BUILDING_NAME <", value, "buildingName");
            return (Criteria) this;
        }

        public Criteria andBuildingNameLessThanOrEqualTo(String value) {
            addCriterion("BUILDING_NAME <=", value, "buildingName");
            return (Criteria) this;
        }

        public Criteria andBuildingNameLike(String value) {
            addCriterion("BUILDING_NAME like", value, "buildingName");
            return (Criteria) this;
        }

        public Criteria andBuildingNameNotLike(String value) {
            addCriterion("BUILDING_NAME not like", value, "buildingName");
            return (Criteria) this;
        }

        public Criteria andBuildingNameIn(List<String> values) {
            addCriterion("BUILDING_NAME in", values, "buildingName");
            return (Criteria) this;
        }

        public Criteria andBuildingNameNotIn(List<String> values) {
            addCriterion("BUILDING_NAME not in", values, "buildingName");
            return (Criteria) this;
        }

        public Criteria andBuildingNameBetween(String value1, String value2) {
            addCriterion("BUILDING_NAME between", value1, value2, "buildingName");
            return (Criteria) this;
        }

        public Criteria andBuildingNameNotBetween(String value1, String value2) {
            addCriterion("BUILDING_NAME not between", value1, value2, "buildingName");
            return (Criteria) this;
        }

        public Criteria andBuildingAreaIsNull() {
            addCriterion("BUILDING_AREA is null");
            return (Criteria) this;
        }

        public Criteria andBuildingAreaIsNotNull() {
            addCriterion("BUILDING_AREA is not null");
            return (Criteria) this;
        }

        public Criteria andBuildingAreaEqualTo(String value) {
            addCriterion("BUILDING_AREA =", value, "buildingArea");
            return (Criteria) this;
        }

        public Criteria andBuildingAreaNotEqualTo(String value) {
            addCriterion("BUILDING_AREA <>", value, "buildingArea");
            return (Criteria) this;
        }

        public Criteria andBuildingAreaGreaterThan(String value) {
            addCriterion("BUILDING_AREA >", value, "buildingArea");
            return (Criteria) this;
        }

        public Criteria andBuildingAreaGreaterThanOrEqualTo(String value) {
            addCriterion("BUILDING_AREA >=", value, "buildingArea");
            return (Criteria) this;
        }

        public Criteria andBuildingAreaLessThan(String value) {
            addCriterion("BUILDING_AREA <", value, "buildingArea");
            return (Criteria) this;
        }

        public Criteria andBuildingAreaLessThanOrEqualTo(String value) {
            addCriterion("BUILDING_AREA <=", value, "buildingArea");
            return (Criteria) this;
        }

        public Criteria andBuildingAreaLike(String value) {
            addCriterion("BUILDING_AREA like", value, "buildingArea");
            return (Criteria) this;
        }

        public Criteria andBuildingAreaNotLike(String value) {
            addCriterion("BUILDING_AREA not like", value, "buildingArea");
            return (Criteria) this;
        }

        public Criteria andBuildingAreaIn(List<String> values) {
            addCriterion("BUILDING_AREA in", values, "buildingArea");
            return (Criteria) this;
        }

        public Criteria andBuildingAreaNotIn(List<String> values) {
            addCriterion("BUILDING_AREA not in", values, "buildingArea");
            return (Criteria) this;
        }

        public Criteria andBuildingAreaBetween(String value1, String value2) {
            addCriterion("BUILDING_AREA between", value1, value2, "buildingArea");
            return (Criteria) this;
        }

        public Criteria andBuildingAreaNotBetween(String value1, String value2) {
            addCriterion("BUILDING_AREA not between", value1, value2, "buildingArea");
            return (Criteria) this;
        }

        public Criteria andBuildingDescIsNull() {
            addCriterion("BUILDING_DESC is null");
            return (Criteria) this;
        }

        public Criteria andBuildingDescIsNotNull() {
            addCriterion("BUILDING_DESC is not null");
            return (Criteria) this;
        }

        public Criteria andBuildingDescEqualTo(String value) {
            addCriterion("BUILDING_DESC =", value, "buildingDesc");
            return (Criteria) this;
        }

        public Criteria andBuildingDescNotEqualTo(String value) {
            addCriterion("BUILDING_DESC <>", value, "buildingDesc");
            return (Criteria) this;
        }

        public Criteria andBuildingDescGreaterThan(String value) {
            addCriterion("BUILDING_DESC >", value, "buildingDesc");
            return (Criteria) this;
        }

        public Criteria andBuildingDescGreaterThanOrEqualTo(String value) {
            addCriterion("BUILDING_DESC >=", value, "buildingDesc");
            return (Criteria) this;
        }

        public Criteria andBuildingDescLessThan(String value) {
            addCriterion("BUILDING_DESC <", value, "buildingDesc");
            return (Criteria) this;
        }

        public Criteria andBuildingDescLessThanOrEqualTo(String value) {
            addCriterion("BUILDING_DESC <=", value, "buildingDesc");
            return (Criteria) this;
        }

        public Criteria andBuildingDescLike(String value) {
            addCriterion("BUILDING_DESC like", value, "buildingDesc");
            return (Criteria) this;
        }

        public Criteria andBuildingDescNotLike(String value) {
            addCriterion("BUILDING_DESC not like", value, "buildingDesc");
            return (Criteria) this;
        }

        public Criteria andBuildingDescIn(List<String> values) {
            addCriterion("BUILDING_DESC in", values, "buildingDesc");
            return (Criteria) this;
        }

        public Criteria andBuildingDescNotIn(List<String> values) {
            addCriterion("BUILDING_DESC not in", values, "buildingDesc");
            return (Criteria) this;
        }

        public Criteria andBuildingDescBetween(String value1, String value2) {
            addCriterion("BUILDING_DESC between", value1, value2, "buildingDesc");
            return (Criteria) this;
        }

        public Criteria andBuildingDescNotBetween(String value1, String value2) {
            addCriterion("BUILDING_DESC not between", value1, value2, "buildingDesc");
            return (Criteria) this;
        }

        public Criteria andBuildingPurposeIsNull() {
            addCriterion("BUILDING_PURPOSE is null");
            return (Criteria) this;
        }

        public Criteria andBuildingPurposeIsNotNull() {
            addCriterion("BUILDING_PURPOSE is not null");
            return (Criteria) this;
        }

        public Criteria andBuildingPurposeEqualTo(String value) {
            addCriterion("BUILDING_PURPOSE =", value, "buildingPurpose");
            return (Criteria) this;
        }

        public Criteria andBuildingPurposeNotEqualTo(String value) {
            addCriterion("BUILDING_PURPOSE <>", value, "buildingPurpose");
            return (Criteria) this;
        }

        public Criteria andBuildingPurposeGreaterThan(String value) {
            addCriterion("BUILDING_PURPOSE >", value, "buildingPurpose");
            return (Criteria) this;
        }

        public Criteria andBuildingPurposeGreaterThanOrEqualTo(String value) {
            addCriterion("BUILDING_PURPOSE >=", value, "buildingPurpose");
            return (Criteria) this;
        }

        public Criteria andBuildingPurposeLessThan(String value) {
            addCriterion("BUILDING_PURPOSE <", value, "buildingPurpose");
            return (Criteria) this;
        }

        public Criteria andBuildingPurposeLessThanOrEqualTo(String value) {
            addCriterion("BUILDING_PURPOSE <=", value, "buildingPurpose");
            return (Criteria) this;
        }

        public Criteria andBuildingPurposeLike(String value) {
            addCriterion("BUILDING_PURPOSE like", value, "buildingPurpose");
            return (Criteria) this;
        }

        public Criteria andBuildingPurposeNotLike(String value) {
            addCriterion("BUILDING_PURPOSE not like", value, "buildingPurpose");
            return (Criteria) this;
        }

        public Criteria andBuildingPurposeIn(List<String> values) {
            addCriterion("BUILDING_PURPOSE in", values, "buildingPurpose");
            return (Criteria) this;
        }

        public Criteria andBuildingPurposeNotIn(List<String> values) {
            addCriterion("BUILDING_PURPOSE not in", values, "buildingPurpose");
            return (Criteria) this;
        }

        public Criteria andBuildingPurposeBetween(String value1, String value2) {
            addCriterion("BUILDING_PURPOSE between", value1, value2, "buildingPurpose");
            return (Criteria) this;
        }

        public Criteria andBuildingPurposeNotBetween(String value1, String value2) {
            addCriterion("BUILDING_PURPOSE not between", value1, value2, "buildingPurpose");
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