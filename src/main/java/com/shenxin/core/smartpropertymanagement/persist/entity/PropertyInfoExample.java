package com.shenxin.core.smartpropertymanagement.persist.entity;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class PropertyInfoExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public PropertyInfoExample() {
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

        public Criteria andPropertyTypeIsNull() {
            addCriterion("PROPERTY_TYPE is null");
            return (Criteria) this;
        }

        public Criteria andPropertyTypeIsNotNull() {
            addCriterion("PROPERTY_TYPE is not null");
            return (Criteria) this;
        }

        public Criteria andPropertyTypeEqualTo(String value) {
            addCriterion("PROPERTY_TYPE =", value, "propertyType");
            return (Criteria) this;
        }

        public Criteria andPropertyTypeNotEqualTo(String value) {
            addCriterion("PROPERTY_TYPE <>", value, "propertyType");
            return (Criteria) this;
        }

        public Criteria andPropertyTypeGreaterThan(String value) {
            addCriterion("PROPERTY_TYPE >", value, "propertyType");
            return (Criteria) this;
        }

        public Criteria andPropertyTypeGreaterThanOrEqualTo(String value) {
            addCriterion("PROPERTY_TYPE >=", value, "propertyType");
            return (Criteria) this;
        }

        public Criteria andPropertyTypeLessThan(String value) {
            addCriterion("PROPERTY_TYPE <", value, "propertyType");
            return (Criteria) this;
        }

        public Criteria andPropertyTypeLessThanOrEqualTo(String value) {
            addCriterion("PROPERTY_TYPE <=", value, "propertyType");
            return (Criteria) this;
        }

        public Criteria andPropertyTypeLike(String value) {
            addCriterion("PROPERTY_TYPE like", value, "propertyType");
            return (Criteria) this;
        }

        public Criteria andPropertyTypeNotLike(String value) {
            addCriterion("PROPERTY_TYPE not like", value, "propertyType");
            return (Criteria) this;
        }

        public Criteria andPropertyTypeIn(List<String> values) {
            addCriterion("PROPERTY_TYPE in", values, "propertyType");
            return (Criteria) this;
        }

        public Criteria andPropertyTypeNotIn(List<String> values) {
            addCriterion("PROPERTY_TYPE not in", values, "propertyType");
            return (Criteria) this;
        }

        public Criteria andPropertyTypeBetween(String value1, String value2) {
            addCriterion("PROPERTY_TYPE between", value1, value2, "propertyType");
            return (Criteria) this;
        }

        public Criteria andPropertyTypeNotBetween(String value1, String value2) {
            addCriterion("PROPERTY_TYPE not between", value1, value2, "propertyType");
            return (Criteria) this;
        }

        public Criteria andPropertyNameIsNull() {
            addCriterion("PROPERTY_NAME is null");
            return (Criteria) this;
        }

        public Criteria andPropertyNameIsNotNull() {
            addCriterion("PROPERTY_NAME is not null");
            return (Criteria) this;
        }

        public Criteria andPropertyNameEqualTo(String value) {
            addCriterion("PROPERTY_NAME =", value, "propertyName");
            return (Criteria) this;
        }

        public Criteria andPropertyNameNotEqualTo(String value) {
            addCriterion("PROPERTY_NAME <>", value, "propertyName");
            return (Criteria) this;
        }

        public Criteria andPropertyNameGreaterThan(String value) {
            addCriterion("PROPERTY_NAME >", value, "propertyName");
            return (Criteria) this;
        }

        public Criteria andPropertyNameGreaterThanOrEqualTo(String value) {
            addCriterion("PROPERTY_NAME >=", value, "propertyName");
            return (Criteria) this;
        }

        public Criteria andPropertyNameLessThan(String value) {
            addCriterion("PROPERTY_NAME <", value, "propertyName");
            return (Criteria) this;
        }

        public Criteria andPropertyNameLessThanOrEqualTo(String value) {
            addCriterion("PROPERTY_NAME <=", value, "propertyName");
            return (Criteria) this;
        }

        public Criteria andPropertyNameLike(String value) {
            addCriterion("PROPERTY_NAME like", value, "propertyName");
            return (Criteria) this;
        }

        public Criteria andPropertyNameNotLike(String value) {
            addCriterion("PROPERTY_NAME not like", value, "propertyName");
            return (Criteria) this;
        }

        public Criteria andPropertyNameIn(List<String> values) {
            addCriterion("PROPERTY_NAME in", values, "propertyName");
            return (Criteria) this;
        }

        public Criteria andPropertyNameNotIn(List<String> values) {
            addCriterion("PROPERTY_NAME not in", values, "propertyName");
            return (Criteria) this;
        }

        public Criteria andPropertyNameBetween(String value1, String value2) {
            addCriterion("PROPERTY_NAME between", value1, value2, "propertyName");
            return (Criteria) this;
        }

        public Criteria andPropertyNameNotBetween(String value1, String value2) {
            addCriterion("PROPERTY_NAME not between", value1, value2, "propertyName");
            return (Criteria) this;
        }

        public Criteria andPropertyShortNameIsNull() {
            addCriterion("PROPERTY_SHORT_NAME is null");
            return (Criteria) this;
        }

        public Criteria andPropertyShortNameIsNotNull() {
            addCriterion("PROPERTY_SHORT_NAME is not null");
            return (Criteria) this;
        }

        public Criteria andPropertyShortNameEqualTo(String value) {
            addCriterion("PROPERTY_SHORT_NAME =", value, "propertyShortName");
            return (Criteria) this;
        }

        public Criteria andPropertyShortNameNotEqualTo(String value) {
            addCriterion("PROPERTY_SHORT_NAME <>", value, "propertyShortName");
            return (Criteria) this;
        }

        public Criteria andPropertyShortNameGreaterThan(String value) {
            addCriterion("PROPERTY_SHORT_NAME >", value, "propertyShortName");
            return (Criteria) this;
        }

        public Criteria andPropertyShortNameGreaterThanOrEqualTo(String value) {
            addCriterion("PROPERTY_SHORT_NAME >=", value, "propertyShortName");
            return (Criteria) this;
        }

        public Criteria andPropertyShortNameLessThan(String value) {
            addCriterion("PROPERTY_SHORT_NAME <", value, "propertyShortName");
            return (Criteria) this;
        }

        public Criteria andPropertyShortNameLessThanOrEqualTo(String value) {
            addCriterion("PROPERTY_SHORT_NAME <=", value, "propertyShortName");
            return (Criteria) this;
        }

        public Criteria andPropertyShortNameLike(String value) {
            addCriterion("PROPERTY_SHORT_NAME like", value, "propertyShortName");
            return (Criteria) this;
        }

        public Criteria andPropertyShortNameNotLike(String value) {
            addCriterion("PROPERTY_SHORT_NAME not like", value, "propertyShortName");
            return (Criteria) this;
        }

        public Criteria andPropertyShortNameIn(List<String> values) {
            addCriterion("PROPERTY_SHORT_NAME in", values, "propertyShortName");
            return (Criteria) this;
        }

        public Criteria andPropertyShortNameNotIn(List<String> values) {
            addCriterion("PROPERTY_SHORT_NAME not in", values, "propertyShortName");
            return (Criteria) this;
        }

        public Criteria andPropertyShortNameBetween(String value1, String value2) {
            addCriterion("PROPERTY_SHORT_NAME between", value1, value2, "propertyShortName");
            return (Criteria) this;
        }

        public Criteria andPropertyShortNameNotBetween(String value1, String value2) {
            addCriterion("PROPERTY_SHORT_NAME not between", value1, value2, "propertyShortName");
            return (Criteria) this;
        }

        public Criteria andPropertyEnNameIsNull() {
            addCriterion("PROPERTY_EN_NAME is null");
            return (Criteria) this;
        }

        public Criteria andPropertyEnNameIsNotNull() {
            addCriterion("PROPERTY_EN_NAME is not null");
            return (Criteria) this;
        }

        public Criteria andPropertyEnNameEqualTo(String value) {
            addCriterion("PROPERTY_EN_NAME =", value, "propertyEnName");
            return (Criteria) this;
        }

        public Criteria andPropertyEnNameNotEqualTo(String value) {
            addCriterion("PROPERTY_EN_NAME <>", value, "propertyEnName");
            return (Criteria) this;
        }

        public Criteria andPropertyEnNameGreaterThan(String value) {
            addCriterion("PROPERTY_EN_NAME >", value, "propertyEnName");
            return (Criteria) this;
        }

        public Criteria andPropertyEnNameGreaterThanOrEqualTo(String value) {
            addCriterion("PROPERTY_EN_NAME >=", value, "propertyEnName");
            return (Criteria) this;
        }

        public Criteria andPropertyEnNameLessThan(String value) {
            addCriterion("PROPERTY_EN_NAME <", value, "propertyEnName");
            return (Criteria) this;
        }

        public Criteria andPropertyEnNameLessThanOrEqualTo(String value) {
            addCriterion("PROPERTY_EN_NAME <=", value, "propertyEnName");
            return (Criteria) this;
        }

        public Criteria andPropertyEnNameLike(String value) {
            addCriterion("PROPERTY_EN_NAME like", value, "propertyEnName");
            return (Criteria) this;
        }

        public Criteria andPropertyEnNameNotLike(String value) {
            addCriterion("PROPERTY_EN_NAME not like", value, "propertyEnName");
            return (Criteria) this;
        }

        public Criteria andPropertyEnNameIn(List<String> values) {
            addCriterion("PROPERTY_EN_NAME in", values, "propertyEnName");
            return (Criteria) this;
        }

        public Criteria andPropertyEnNameNotIn(List<String> values) {
            addCriterion("PROPERTY_EN_NAME not in", values, "propertyEnName");
            return (Criteria) this;
        }

        public Criteria andPropertyEnNameBetween(String value1, String value2) {
            addCriterion("PROPERTY_EN_NAME between", value1, value2, "propertyEnName");
            return (Criteria) this;
        }

        public Criteria andPropertyEnNameNotBetween(String value1, String value2) {
            addCriterion("PROPERTY_EN_NAME not between", value1, value2, "propertyEnName");
            return (Criteria) this;
        }

        public Criteria andPropertyAddressIsNull() {
            addCriterion("PROPERTY_ADDRESS is null");
            return (Criteria) this;
        }

        public Criteria andPropertyAddressIsNotNull() {
            addCriterion("PROPERTY_ADDRESS is not null");
            return (Criteria) this;
        }

        public Criteria andPropertyAddressEqualTo(String value) {
            addCriterion("PROPERTY_ADDRESS =", value, "propertyAddress");
            return (Criteria) this;
        }

        public Criteria andPropertyAddressNotEqualTo(String value) {
            addCriterion("PROPERTY_ADDRESS <>", value, "propertyAddress");
            return (Criteria) this;
        }

        public Criteria andPropertyAddressGreaterThan(String value) {
            addCriterion("PROPERTY_ADDRESS >", value, "propertyAddress");
            return (Criteria) this;
        }

        public Criteria andPropertyAddressGreaterThanOrEqualTo(String value) {
            addCriterion("PROPERTY_ADDRESS >=", value, "propertyAddress");
            return (Criteria) this;
        }

        public Criteria andPropertyAddressLessThan(String value) {
            addCriterion("PROPERTY_ADDRESS <", value, "propertyAddress");
            return (Criteria) this;
        }

        public Criteria andPropertyAddressLessThanOrEqualTo(String value) {
            addCriterion("PROPERTY_ADDRESS <=", value, "propertyAddress");
            return (Criteria) this;
        }

        public Criteria andPropertyAddressLike(String value) {
            addCriterion("PROPERTY_ADDRESS like", value, "propertyAddress");
            return (Criteria) this;
        }

        public Criteria andPropertyAddressNotLike(String value) {
            addCriterion("PROPERTY_ADDRESS not like", value, "propertyAddress");
            return (Criteria) this;
        }

        public Criteria andPropertyAddressIn(List<String> values) {
            addCriterion("PROPERTY_ADDRESS in", values, "propertyAddress");
            return (Criteria) this;
        }

        public Criteria andPropertyAddressNotIn(List<String> values) {
            addCriterion("PROPERTY_ADDRESS not in", values, "propertyAddress");
            return (Criteria) this;
        }

        public Criteria andPropertyAddressBetween(String value1, String value2) {
            addCriterion("PROPERTY_ADDRESS between", value1, value2, "propertyAddress");
            return (Criteria) this;
        }

        public Criteria andPropertyAddressNotBetween(String value1, String value2) {
            addCriterion("PROPERTY_ADDRESS not between", value1, value2, "propertyAddress");
            return (Criteria) this;
        }

        public Criteria andServicePhoneIsNull() {
            addCriterion("SERVICE_PHONE is null");
            return (Criteria) this;
        }

        public Criteria andServicePhoneIsNotNull() {
            addCriterion("SERVICE_PHONE is not null");
            return (Criteria) this;
        }

        public Criteria andServicePhoneEqualTo(String value) {
            addCriterion("SERVICE_PHONE =", value, "servicePhone");
            return (Criteria) this;
        }

        public Criteria andServicePhoneNotEqualTo(String value) {
            addCriterion("SERVICE_PHONE <>", value, "servicePhone");
            return (Criteria) this;
        }

        public Criteria andServicePhoneGreaterThan(String value) {
            addCriterion("SERVICE_PHONE >", value, "servicePhone");
            return (Criteria) this;
        }

        public Criteria andServicePhoneGreaterThanOrEqualTo(String value) {
            addCriterion("SERVICE_PHONE >=", value, "servicePhone");
            return (Criteria) this;
        }

        public Criteria andServicePhoneLessThan(String value) {
            addCriterion("SERVICE_PHONE <", value, "servicePhone");
            return (Criteria) this;
        }

        public Criteria andServicePhoneLessThanOrEqualTo(String value) {
            addCriterion("SERVICE_PHONE <=", value, "servicePhone");
            return (Criteria) this;
        }

        public Criteria andServicePhoneLike(String value) {
            addCriterion("SERVICE_PHONE like", value, "servicePhone");
            return (Criteria) this;
        }

        public Criteria andServicePhoneNotLike(String value) {
            addCriterion("SERVICE_PHONE not like", value, "servicePhone");
            return (Criteria) this;
        }

        public Criteria andServicePhoneIn(List<String> values) {
            addCriterion("SERVICE_PHONE in", values, "servicePhone");
            return (Criteria) this;
        }

        public Criteria andServicePhoneNotIn(List<String> values) {
            addCriterion("SERVICE_PHONE not in", values, "servicePhone");
            return (Criteria) this;
        }

        public Criteria andServicePhoneBetween(String value1, String value2) {
            addCriterion("SERVICE_PHONE between", value1, value2, "servicePhone");
            return (Criteria) this;
        }

        public Criteria andServicePhoneNotBetween(String value1, String value2) {
            addCriterion("SERVICE_PHONE not between", value1, value2, "servicePhone");
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

        public Criteria andLinkNameIsNull() {
            addCriterion("LINK_NAME is null");
            return (Criteria) this;
        }

        public Criteria andLinkNameIsNotNull() {
            addCriterion("LINK_NAME is not null");
            return (Criteria) this;
        }

        public Criteria andLinkNameEqualTo(String value) {
            addCriterion("LINK_NAME =", value, "linkName");
            return (Criteria) this;
        }

        public Criteria andLinkNameNotEqualTo(String value) {
            addCriterion("LINK_NAME <>", value, "linkName");
            return (Criteria) this;
        }

        public Criteria andLinkNameGreaterThan(String value) {
            addCriterion("LINK_NAME >", value, "linkName");
            return (Criteria) this;
        }

        public Criteria andLinkNameGreaterThanOrEqualTo(String value) {
            addCriterion("LINK_NAME >=", value, "linkName");
            return (Criteria) this;
        }

        public Criteria andLinkNameLessThan(String value) {
            addCriterion("LINK_NAME <", value, "linkName");
            return (Criteria) this;
        }

        public Criteria andLinkNameLessThanOrEqualTo(String value) {
            addCriterion("LINK_NAME <=", value, "linkName");
            return (Criteria) this;
        }

        public Criteria andLinkNameLike(String value) {
            addCriterion("LINK_NAME like", value, "linkName");
            return (Criteria) this;
        }

        public Criteria andLinkNameNotLike(String value) {
            addCriterion("LINK_NAME not like", value, "linkName");
            return (Criteria) this;
        }

        public Criteria andLinkNameIn(List<String> values) {
            addCriterion("LINK_NAME in", values, "linkName");
            return (Criteria) this;
        }

        public Criteria andLinkNameNotIn(List<String> values) {
            addCriterion("LINK_NAME not in", values, "linkName");
            return (Criteria) this;
        }

        public Criteria andLinkNameBetween(String value1, String value2) {
            addCriterion("LINK_NAME between", value1, value2, "linkName");
            return (Criteria) this;
        }

        public Criteria andLinkNameNotBetween(String value1, String value2) {
            addCriterion("LINK_NAME not between", value1, value2, "linkName");
            return (Criteria) this;
        }

        public Criteria andLinkMobileIsNull() {
            addCriterion("LINK_MOBILE is null");
            return (Criteria) this;
        }

        public Criteria andLinkMobileIsNotNull() {
            addCriterion("LINK_MOBILE is not null");
            return (Criteria) this;
        }

        public Criteria andLinkMobileEqualTo(String value) {
            addCriterion("LINK_MOBILE =", value, "linkMobile");
            return (Criteria) this;
        }

        public Criteria andLinkMobileNotEqualTo(String value) {
            addCriterion("LINK_MOBILE <>", value, "linkMobile");
            return (Criteria) this;
        }

        public Criteria andLinkMobileGreaterThan(String value) {
            addCriterion("LINK_MOBILE >", value, "linkMobile");
            return (Criteria) this;
        }

        public Criteria andLinkMobileGreaterThanOrEqualTo(String value) {
            addCriterion("LINK_MOBILE >=", value, "linkMobile");
            return (Criteria) this;
        }

        public Criteria andLinkMobileLessThan(String value) {
            addCriterion("LINK_MOBILE <", value, "linkMobile");
            return (Criteria) this;
        }

        public Criteria andLinkMobileLessThanOrEqualTo(String value) {
            addCriterion("LINK_MOBILE <=", value, "linkMobile");
            return (Criteria) this;
        }

        public Criteria andLinkMobileLike(String value) {
            addCriterion("LINK_MOBILE like", value, "linkMobile");
            return (Criteria) this;
        }

        public Criteria andLinkMobileNotLike(String value) {
            addCriterion("LINK_MOBILE not like", value, "linkMobile");
            return (Criteria) this;
        }

        public Criteria andLinkMobileIn(List<String> values) {
            addCriterion("LINK_MOBILE in", values, "linkMobile");
            return (Criteria) this;
        }

        public Criteria andLinkMobileNotIn(List<String> values) {
            addCriterion("LINK_MOBILE not in", values, "linkMobile");
            return (Criteria) this;
        }

        public Criteria andLinkMobileBetween(String value1, String value2) {
            addCriterion("LINK_MOBILE between", value1, value2, "linkMobile");
            return (Criteria) this;
        }

        public Criteria andLinkMobileNotBetween(String value1, String value2) {
            addCriterion("LINK_MOBILE not between", value1, value2, "linkMobile");
            return (Criteria) this;
        }

        public Criteria andLinkEmailIsNull() {
            addCriterion("LINK_EMAIL is null");
            return (Criteria) this;
        }

        public Criteria andLinkEmailIsNotNull() {
            addCriterion("LINK_EMAIL is not null");
            return (Criteria) this;
        }

        public Criteria andLinkEmailEqualTo(String value) {
            addCriterion("LINK_EMAIL =", value, "linkEmail");
            return (Criteria) this;
        }

        public Criteria andLinkEmailNotEqualTo(String value) {
            addCriterion("LINK_EMAIL <>", value, "linkEmail");
            return (Criteria) this;
        }

        public Criteria andLinkEmailGreaterThan(String value) {
            addCriterion("LINK_EMAIL >", value, "linkEmail");
            return (Criteria) this;
        }

        public Criteria andLinkEmailGreaterThanOrEqualTo(String value) {
            addCriterion("LINK_EMAIL >=", value, "linkEmail");
            return (Criteria) this;
        }

        public Criteria andLinkEmailLessThan(String value) {
            addCriterion("LINK_EMAIL <", value, "linkEmail");
            return (Criteria) this;
        }

        public Criteria andLinkEmailLessThanOrEqualTo(String value) {
            addCriterion("LINK_EMAIL <=", value, "linkEmail");
            return (Criteria) this;
        }

        public Criteria andLinkEmailLike(String value) {
            addCriterion("LINK_EMAIL like", value, "linkEmail");
            return (Criteria) this;
        }

        public Criteria andLinkEmailNotLike(String value) {
            addCriterion("LINK_EMAIL not like", value, "linkEmail");
            return (Criteria) this;
        }

        public Criteria andLinkEmailIn(List<String> values) {
            addCriterion("LINK_EMAIL in", values, "linkEmail");
            return (Criteria) this;
        }

        public Criteria andLinkEmailNotIn(List<String> values) {
            addCriterion("LINK_EMAIL not in", values, "linkEmail");
            return (Criteria) this;
        }

        public Criteria andLinkEmailBetween(String value1, String value2) {
            addCriterion("LINK_EMAIL between", value1, value2, "linkEmail");
            return (Criteria) this;
        }

        public Criteria andLinkEmailNotBetween(String value1, String value2) {
            addCriterion("LINK_EMAIL not between", value1, value2, "linkEmail");
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