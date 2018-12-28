package com.shenxin.core.smartpropertymanagement.persist.entity;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class CompanyInfoExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public CompanyInfoExample() {
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

        public Criteria andParentIdIsNull() {
            addCriterion("PARENT_ID is null");
            return (Criteria) this;
        }

        public Criteria andParentIdIsNotNull() {
            addCriterion("PARENT_ID is not null");
            return (Criteria) this;
        }

        public Criteria andParentIdEqualTo(BigDecimal value) {
            addCriterion("PARENT_ID =", value, "parentId");
            return (Criteria) this;
        }

        public Criteria andParentIdNotEqualTo(BigDecimal value) {
            addCriterion("PARENT_ID <>", value, "parentId");
            return (Criteria) this;
        }

        public Criteria andParentIdGreaterThan(BigDecimal value) {
            addCriterion("PARENT_ID >", value, "parentId");
            return (Criteria) this;
        }

        public Criteria andParentIdGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("PARENT_ID >=", value, "parentId");
            return (Criteria) this;
        }

        public Criteria andParentIdLessThan(BigDecimal value) {
            addCriterion("PARENT_ID <", value, "parentId");
            return (Criteria) this;
        }

        public Criteria andParentIdLessThanOrEqualTo(BigDecimal value) {
            addCriterion("PARENT_ID <=", value, "parentId");
            return (Criteria) this;
        }

        public Criteria andParentIdIn(List<BigDecimal> values) {
            addCriterion("PARENT_ID in", values, "parentId");
            return (Criteria) this;
        }

        public Criteria andParentIdNotIn(List<BigDecimal> values) {
            addCriterion("PARENT_ID not in", values, "parentId");
            return (Criteria) this;
        }

        public Criteria andParentIdBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("PARENT_ID between", value1, value2, "parentId");
            return (Criteria) this;
        }

        public Criteria andParentIdNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("PARENT_ID not between", value1, value2, "parentId");
            return (Criteria) this;
        }

        public Criteria andGradeIsNull() {
            addCriterion("GRADE is null");
            return (Criteria) this;
        }

        public Criteria andGradeIsNotNull() {
            addCriterion("GRADE is not null");
            return (Criteria) this;
        }

        public Criteria andGradeEqualTo(BigDecimal value) {
            addCriterion("GRADE =", value, "grade");
            return (Criteria) this;
        }

        public Criteria andGradeNotEqualTo(BigDecimal value) {
            addCriterion("GRADE <>", value, "grade");
            return (Criteria) this;
        }

        public Criteria andGradeGreaterThan(BigDecimal value) {
            addCriterion("GRADE >", value, "grade");
            return (Criteria) this;
        }

        public Criteria andGradeGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("GRADE >=", value, "grade");
            return (Criteria) this;
        }

        public Criteria andGradeLessThan(BigDecimal value) {
            addCriterion("GRADE <", value, "grade");
            return (Criteria) this;
        }

        public Criteria andGradeLessThanOrEqualTo(BigDecimal value) {
            addCriterion("GRADE <=", value, "grade");
            return (Criteria) this;
        }

        public Criteria andGradeIn(List<BigDecimal> values) {
            addCriterion("GRADE in", values, "grade");
            return (Criteria) this;
        }

        public Criteria andGradeNotIn(List<BigDecimal> values) {
            addCriterion("GRADE not in", values, "grade");
            return (Criteria) this;
        }

        public Criteria andGradeBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("GRADE between", value1, value2, "grade");
            return (Criteria) this;
        }

        public Criteria andGradeNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("GRADE not between", value1, value2, "grade");
            return (Criteria) this;
        }

        public Criteria andCompanyNameIsNull() {
            addCriterion("COMPANY_NAME is null");
            return (Criteria) this;
        }

        public Criteria andCompanyNameIsNotNull() {
            addCriterion("COMPANY_NAME is not null");
            return (Criteria) this;
        }

        public Criteria andCompanyNameEqualTo(String value) {
            addCriterion("COMPANY_NAME =", value, "companyName");
            return (Criteria) this;
        }

        public Criteria andCompanyNameNotEqualTo(String value) {
            addCriterion("COMPANY_NAME <>", value, "companyName");
            return (Criteria) this;
        }

        public Criteria andCompanyNameGreaterThan(String value) {
            addCriterion("COMPANY_NAME >", value, "companyName");
            return (Criteria) this;
        }

        public Criteria andCompanyNameGreaterThanOrEqualTo(String value) {
            addCriterion("COMPANY_NAME >=", value, "companyName");
            return (Criteria) this;
        }

        public Criteria andCompanyNameLessThan(String value) {
            addCriterion("COMPANY_NAME <", value, "companyName");
            return (Criteria) this;
        }

        public Criteria andCompanyNameLessThanOrEqualTo(String value) {
            addCriterion("COMPANY_NAME <=", value, "companyName");
            return (Criteria) this;
        }

        public Criteria andCompanyNameLike(String value) {
            addCriterion("COMPANY_NAME like", value, "companyName");
            return (Criteria) this;
        }

        public Criteria andCompanyNameNotLike(String value) {
            addCriterion("COMPANY_NAME not like", value, "companyName");
            return (Criteria) this;
        }

        public Criteria andCompanyNameIn(List<String> values) {
            addCriterion("COMPANY_NAME in", values, "companyName");
            return (Criteria) this;
        }

        public Criteria andCompanyNameNotIn(List<String> values) {
            addCriterion("COMPANY_NAME not in", values, "companyName");
            return (Criteria) this;
        }

        public Criteria andCompanyNameBetween(String value1, String value2) {
            addCriterion("COMPANY_NAME between", value1, value2, "companyName");
            return (Criteria) this;
        }

        public Criteria andCompanyNameNotBetween(String value1, String value2) {
            addCriterion("COMPANY_NAME not between", value1, value2, "companyName");
            return (Criteria) this;
        }

        public Criteria andCompanyShortNameIsNull() {
            addCriterion("COMPANY_SHORT_NAME is null");
            return (Criteria) this;
        }

        public Criteria andCompanyShortNameIsNotNull() {
            addCriterion("COMPANY_SHORT_NAME is not null");
            return (Criteria) this;
        }

        public Criteria andCompanyShortNameEqualTo(String value) {
            addCriterion("COMPANY_SHORT_NAME =", value, "companyShortName");
            return (Criteria) this;
        }

        public Criteria andCompanyShortNameNotEqualTo(String value) {
            addCriterion("COMPANY_SHORT_NAME <>", value, "companyShortName");
            return (Criteria) this;
        }

        public Criteria andCompanyShortNameGreaterThan(String value) {
            addCriterion("COMPANY_SHORT_NAME >", value, "companyShortName");
            return (Criteria) this;
        }

        public Criteria andCompanyShortNameGreaterThanOrEqualTo(String value) {
            addCriterion("COMPANY_SHORT_NAME >=", value, "companyShortName");
            return (Criteria) this;
        }

        public Criteria andCompanyShortNameLessThan(String value) {
            addCriterion("COMPANY_SHORT_NAME <", value, "companyShortName");
            return (Criteria) this;
        }

        public Criteria andCompanyShortNameLessThanOrEqualTo(String value) {
            addCriterion("COMPANY_SHORT_NAME <=", value, "companyShortName");
            return (Criteria) this;
        }

        public Criteria andCompanyShortNameLike(String value) {
            addCriterion("COMPANY_SHORT_NAME like", value, "companyShortName");
            return (Criteria) this;
        }

        public Criteria andCompanyShortNameNotLike(String value) {
            addCriterion("COMPANY_SHORT_NAME not like", value, "companyShortName");
            return (Criteria) this;
        }

        public Criteria andCompanyShortNameIn(List<String> values) {
            addCriterion("COMPANY_SHORT_NAME in", values, "companyShortName");
            return (Criteria) this;
        }

        public Criteria andCompanyShortNameNotIn(List<String> values) {
            addCriterion("COMPANY_SHORT_NAME not in", values, "companyShortName");
            return (Criteria) this;
        }

        public Criteria andCompanyShortNameBetween(String value1, String value2) {
            addCriterion("COMPANY_SHORT_NAME between", value1, value2, "companyShortName");
            return (Criteria) this;
        }

        public Criteria andCompanyShortNameNotBetween(String value1, String value2) {
            addCriterion("COMPANY_SHORT_NAME not between", value1, value2, "companyShortName");
            return (Criteria) this;
        }

        public Criteria andCompanyEnNameIsNull() {
            addCriterion("COMPANY_EN_NAME is null");
            return (Criteria) this;
        }

        public Criteria andCompanyEnNameIsNotNull() {
            addCriterion("COMPANY_EN_NAME is not null");
            return (Criteria) this;
        }

        public Criteria andCompanyEnNameEqualTo(String value) {
            addCriterion("COMPANY_EN_NAME =", value, "companyEnName");
            return (Criteria) this;
        }

        public Criteria andCompanyEnNameNotEqualTo(String value) {
            addCriterion("COMPANY_EN_NAME <>", value, "companyEnName");
            return (Criteria) this;
        }

        public Criteria andCompanyEnNameGreaterThan(String value) {
            addCriterion("COMPANY_EN_NAME >", value, "companyEnName");
            return (Criteria) this;
        }

        public Criteria andCompanyEnNameGreaterThanOrEqualTo(String value) {
            addCriterion("COMPANY_EN_NAME >=", value, "companyEnName");
            return (Criteria) this;
        }

        public Criteria andCompanyEnNameLessThan(String value) {
            addCriterion("COMPANY_EN_NAME <", value, "companyEnName");
            return (Criteria) this;
        }

        public Criteria andCompanyEnNameLessThanOrEqualTo(String value) {
            addCriterion("COMPANY_EN_NAME <=", value, "companyEnName");
            return (Criteria) this;
        }

        public Criteria andCompanyEnNameLike(String value) {
            addCriterion("COMPANY_EN_NAME like", value, "companyEnName");
            return (Criteria) this;
        }

        public Criteria andCompanyEnNameNotLike(String value) {
            addCriterion("COMPANY_EN_NAME not like", value, "companyEnName");
            return (Criteria) this;
        }

        public Criteria andCompanyEnNameIn(List<String> values) {
            addCriterion("COMPANY_EN_NAME in", values, "companyEnName");
            return (Criteria) this;
        }

        public Criteria andCompanyEnNameNotIn(List<String> values) {
            addCriterion("COMPANY_EN_NAME not in", values, "companyEnName");
            return (Criteria) this;
        }

        public Criteria andCompanyEnNameBetween(String value1, String value2) {
            addCriterion("COMPANY_EN_NAME between", value1, value2, "companyEnName");
            return (Criteria) this;
        }

        public Criteria andCompanyEnNameNotBetween(String value1, String value2) {
            addCriterion("COMPANY_EN_NAME not between", value1, value2, "companyEnName");
            return (Criteria) this;
        }

        public Criteria andCompanyTypeIsNull() {
            addCriterion("COMPANY_TYPE is null");
            return (Criteria) this;
        }

        public Criteria andCompanyTypeIsNotNull() {
            addCriterion("COMPANY_TYPE is not null");
            return (Criteria) this;
        }

        public Criteria andCompanyTypeEqualTo(String value) {
            addCriterion("COMPANY_TYPE =", value, "companyType");
            return (Criteria) this;
        }

        public Criteria andCompanyTypeNotEqualTo(String value) {
            addCriterion("COMPANY_TYPE <>", value, "companyType");
            return (Criteria) this;
        }

        public Criteria andCompanyTypeGreaterThan(String value) {
            addCriterion("COMPANY_TYPE >", value, "companyType");
            return (Criteria) this;
        }

        public Criteria andCompanyTypeGreaterThanOrEqualTo(String value) {
            addCriterion("COMPANY_TYPE >=", value, "companyType");
            return (Criteria) this;
        }

        public Criteria andCompanyTypeLessThan(String value) {
            addCriterion("COMPANY_TYPE <", value, "companyType");
            return (Criteria) this;
        }

        public Criteria andCompanyTypeLessThanOrEqualTo(String value) {
            addCriterion("COMPANY_TYPE <=", value, "companyType");
            return (Criteria) this;
        }

        public Criteria andCompanyTypeLike(String value) {
            addCriterion("COMPANY_TYPE like", value, "companyType");
            return (Criteria) this;
        }

        public Criteria andCompanyTypeNotLike(String value) {
            addCriterion("COMPANY_TYPE not like", value, "companyType");
            return (Criteria) this;
        }

        public Criteria andCompanyTypeIn(List<String> values) {
            addCriterion("COMPANY_TYPE in", values, "companyType");
            return (Criteria) this;
        }

        public Criteria andCompanyTypeNotIn(List<String> values) {
            addCriterion("COMPANY_TYPE not in", values, "companyType");
            return (Criteria) this;
        }

        public Criteria andCompanyTypeBetween(String value1, String value2) {
            addCriterion("COMPANY_TYPE between", value1, value2, "companyType");
            return (Criteria) this;
        }

        public Criteria andCompanyTypeNotBetween(String value1, String value2) {
            addCriterion("COMPANY_TYPE not between", value1, value2, "companyType");
            return (Criteria) this;
        }

        public Criteria andAddressIsNull() {
            addCriterion("ADDRESS is null");
            return (Criteria) this;
        }

        public Criteria andAddressIsNotNull() {
            addCriterion("ADDRESS is not null");
            return (Criteria) this;
        }

        public Criteria andAddressEqualTo(String value) {
            addCriterion("ADDRESS =", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressNotEqualTo(String value) {
            addCriterion("ADDRESS <>", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressGreaterThan(String value) {
            addCriterion("ADDRESS >", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressGreaterThanOrEqualTo(String value) {
            addCriterion("ADDRESS >=", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressLessThan(String value) {
            addCriterion("ADDRESS <", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressLessThanOrEqualTo(String value) {
            addCriterion("ADDRESS <=", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressLike(String value) {
            addCriterion("ADDRESS like", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressNotLike(String value) {
            addCriterion("ADDRESS not like", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressIn(List<String> values) {
            addCriterion("ADDRESS in", values, "address");
            return (Criteria) this;
        }

        public Criteria andAddressNotIn(List<String> values) {
            addCriterion("ADDRESS not in", values, "address");
            return (Criteria) this;
        }

        public Criteria andAddressBetween(String value1, String value2) {
            addCriterion("ADDRESS between", value1, value2, "address");
            return (Criteria) this;
        }

        public Criteria andAddressNotBetween(String value1, String value2) {
            addCriterion("ADDRESS not between", value1, value2, "address");
            return (Criteria) this;
        }

        public Criteria andWebsiteDomainIsNull() {
            addCriterion("WEBSITE_DOMAIN is null");
            return (Criteria) this;
        }

        public Criteria andWebsiteDomainIsNotNull() {
            addCriterion("WEBSITE_DOMAIN is not null");
            return (Criteria) this;
        }

        public Criteria andWebsiteDomainEqualTo(String value) {
            addCriterion("WEBSITE_DOMAIN =", value, "websiteDomain");
            return (Criteria) this;
        }

        public Criteria andWebsiteDomainNotEqualTo(String value) {
            addCriterion("WEBSITE_DOMAIN <>", value, "websiteDomain");
            return (Criteria) this;
        }

        public Criteria andWebsiteDomainGreaterThan(String value) {
            addCriterion("WEBSITE_DOMAIN >", value, "websiteDomain");
            return (Criteria) this;
        }

        public Criteria andWebsiteDomainGreaterThanOrEqualTo(String value) {
            addCriterion("WEBSITE_DOMAIN >=", value, "websiteDomain");
            return (Criteria) this;
        }

        public Criteria andWebsiteDomainLessThan(String value) {
            addCriterion("WEBSITE_DOMAIN <", value, "websiteDomain");
            return (Criteria) this;
        }

        public Criteria andWebsiteDomainLessThanOrEqualTo(String value) {
            addCriterion("WEBSITE_DOMAIN <=", value, "websiteDomain");
            return (Criteria) this;
        }

        public Criteria andWebsiteDomainLike(String value) {
            addCriterion("WEBSITE_DOMAIN like", value, "websiteDomain");
            return (Criteria) this;
        }

        public Criteria andWebsiteDomainNotLike(String value) {
            addCriterion("WEBSITE_DOMAIN not like", value, "websiteDomain");
            return (Criteria) this;
        }

        public Criteria andWebsiteDomainIn(List<String> values) {
            addCriterion("WEBSITE_DOMAIN in", values, "websiteDomain");
            return (Criteria) this;
        }

        public Criteria andWebsiteDomainNotIn(List<String> values) {
            addCriterion("WEBSITE_DOMAIN not in", values, "websiteDomain");
            return (Criteria) this;
        }

        public Criteria andWebsiteDomainBetween(String value1, String value2) {
            addCriterion("WEBSITE_DOMAIN between", value1, value2, "websiteDomain");
            return (Criteria) this;
        }

        public Criteria andWebsiteDomainNotBetween(String value1, String value2) {
            addCriterion("WEBSITE_DOMAIN not between", value1, value2, "websiteDomain");
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

        public Criteria andZipCodeIsNull() {
            addCriterion("ZIP_CODE is null");
            return (Criteria) this;
        }

        public Criteria andZipCodeIsNotNull() {
            addCriterion("ZIP_CODE is not null");
            return (Criteria) this;
        }

        public Criteria andZipCodeEqualTo(String value) {
            addCriterion("ZIP_CODE =", value, "zipCode");
            return (Criteria) this;
        }

        public Criteria andZipCodeNotEqualTo(String value) {
            addCriterion("ZIP_CODE <>", value, "zipCode");
            return (Criteria) this;
        }

        public Criteria andZipCodeGreaterThan(String value) {
            addCriterion("ZIP_CODE >", value, "zipCode");
            return (Criteria) this;
        }

        public Criteria andZipCodeGreaterThanOrEqualTo(String value) {
            addCriterion("ZIP_CODE >=", value, "zipCode");
            return (Criteria) this;
        }

        public Criteria andZipCodeLessThan(String value) {
            addCriterion("ZIP_CODE <", value, "zipCode");
            return (Criteria) this;
        }

        public Criteria andZipCodeLessThanOrEqualTo(String value) {
            addCriterion("ZIP_CODE <=", value, "zipCode");
            return (Criteria) this;
        }

        public Criteria andZipCodeLike(String value) {
            addCriterion("ZIP_CODE like", value, "zipCode");
            return (Criteria) this;
        }

        public Criteria andZipCodeNotLike(String value) {
            addCriterion("ZIP_CODE not like", value, "zipCode");
            return (Criteria) this;
        }

        public Criteria andZipCodeIn(List<String> values) {
            addCriterion("ZIP_CODE in", values, "zipCode");
            return (Criteria) this;
        }

        public Criteria andZipCodeNotIn(List<String> values) {
            addCriterion("ZIP_CODE not in", values, "zipCode");
            return (Criteria) this;
        }

        public Criteria andZipCodeBetween(String value1, String value2) {
            addCriterion("ZIP_CODE between", value1, value2, "zipCode");
            return (Criteria) this;
        }

        public Criteria andZipCodeNotBetween(String value1, String value2) {
            addCriterion("ZIP_CODE not between", value1, value2, "zipCode");
            return (Criteria) this;
        }

        public Criteria andServiceTypeIsNull() {
            addCriterion("SERVICE_TYPE is null");
            return (Criteria) this;
        }

        public Criteria andServiceTypeIsNotNull() {
            addCriterion("SERVICE_TYPE is not null");
            return (Criteria) this;
        }

        public Criteria andServiceTypeEqualTo(String value) {
            addCriterion("SERVICE_TYPE =", value, "serviceType");
            return (Criteria) this;
        }

        public Criteria andServiceTypeNotEqualTo(String value) {
            addCriterion("SERVICE_TYPE <>", value, "serviceType");
            return (Criteria) this;
        }

        public Criteria andServiceTypeGreaterThan(String value) {
            addCriterion("SERVICE_TYPE >", value, "serviceType");
            return (Criteria) this;
        }

        public Criteria andServiceTypeGreaterThanOrEqualTo(String value) {
            addCriterion("SERVICE_TYPE >=", value, "serviceType");
            return (Criteria) this;
        }

        public Criteria andServiceTypeLessThan(String value) {
            addCriterion("SERVICE_TYPE <", value, "serviceType");
            return (Criteria) this;
        }

        public Criteria andServiceTypeLessThanOrEqualTo(String value) {
            addCriterion("SERVICE_TYPE <=", value, "serviceType");
            return (Criteria) this;
        }

        public Criteria andServiceTypeLike(String value) {
            addCriterion("SERVICE_TYPE like", value, "serviceType");
            return (Criteria) this;
        }

        public Criteria andServiceTypeNotLike(String value) {
            addCriterion("SERVICE_TYPE not like", value, "serviceType");
            return (Criteria) this;
        }

        public Criteria andServiceTypeIn(List<String> values) {
            addCriterion("SERVICE_TYPE in", values, "serviceType");
            return (Criteria) this;
        }

        public Criteria andServiceTypeNotIn(List<String> values) {
            addCriterion("SERVICE_TYPE not in", values, "serviceType");
            return (Criteria) this;
        }

        public Criteria andServiceTypeBetween(String value1, String value2) {
            addCriterion("SERVICE_TYPE between", value1, value2, "serviceType");
            return (Criteria) this;
        }

        public Criteria andServiceTypeNotBetween(String value1, String value2) {
            addCriterion("SERVICE_TYPE not between", value1, value2, "serviceType");
            return (Criteria) this;
        }

        public Criteria andLegalNameIsNull() {
            addCriterion("LEGAL_NAME is null");
            return (Criteria) this;
        }

        public Criteria andLegalNameIsNotNull() {
            addCriterion("LEGAL_NAME is not null");
            return (Criteria) this;
        }

        public Criteria andLegalNameEqualTo(String value) {
            addCriterion("LEGAL_NAME =", value, "legalName");
            return (Criteria) this;
        }

        public Criteria andLegalNameNotEqualTo(String value) {
            addCriterion("LEGAL_NAME <>", value, "legalName");
            return (Criteria) this;
        }

        public Criteria andLegalNameGreaterThan(String value) {
            addCriterion("LEGAL_NAME >", value, "legalName");
            return (Criteria) this;
        }

        public Criteria andLegalNameGreaterThanOrEqualTo(String value) {
            addCriterion("LEGAL_NAME >=", value, "legalName");
            return (Criteria) this;
        }

        public Criteria andLegalNameLessThan(String value) {
            addCriterion("LEGAL_NAME <", value, "legalName");
            return (Criteria) this;
        }

        public Criteria andLegalNameLessThanOrEqualTo(String value) {
            addCriterion("LEGAL_NAME <=", value, "legalName");
            return (Criteria) this;
        }

        public Criteria andLegalNameLike(String value) {
            addCriterion("LEGAL_NAME like", value, "legalName");
            return (Criteria) this;
        }

        public Criteria andLegalNameNotLike(String value) {
            addCriterion("LEGAL_NAME not like", value, "legalName");
            return (Criteria) this;
        }

        public Criteria andLegalNameIn(List<String> values) {
            addCriterion("LEGAL_NAME in", values, "legalName");
            return (Criteria) this;
        }

        public Criteria andLegalNameNotIn(List<String> values) {
            addCriterion("LEGAL_NAME not in", values, "legalName");
            return (Criteria) this;
        }

        public Criteria andLegalNameBetween(String value1, String value2) {
            addCriterion("LEGAL_NAME between", value1, value2, "legalName");
            return (Criteria) this;
        }

        public Criteria andLegalNameNotBetween(String value1, String value2) {
            addCriterion("LEGAL_NAME not between", value1, value2, "legalName");
            return (Criteria) this;
        }

        public Criteria andLegalPhoneIsNull() {
            addCriterion("LEGAL_PHONE is null");
            return (Criteria) this;
        }

        public Criteria andLegalPhoneIsNotNull() {
            addCriterion("LEGAL_PHONE is not null");
            return (Criteria) this;
        }

        public Criteria andLegalPhoneEqualTo(String value) {
            addCriterion("LEGAL_PHONE =", value, "legalPhone");
            return (Criteria) this;
        }

        public Criteria andLegalPhoneNotEqualTo(String value) {
            addCriterion("LEGAL_PHONE <>", value, "legalPhone");
            return (Criteria) this;
        }

        public Criteria andLegalPhoneGreaterThan(String value) {
            addCriterion("LEGAL_PHONE >", value, "legalPhone");
            return (Criteria) this;
        }

        public Criteria andLegalPhoneGreaterThanOrEqualTo(String value) {
            addCriterion("LEGAL_PHONE >=", value, "legalPhone");
            return (Criteria) this;
        }

        public Criteria andLegalPhoneLessThan(String value) {
            addCriterion("LEGAL_PHONE <", value, "legalPhone");
            return (Criteria) this;
        }

        public Criteria andLegalPhoneLessThanOrEqualTo(String value) {
            addCriterion("LEGAL_PHONE <=", value, "legalPhone");
            return (Criteria) this;
        }

        public Criteria andLegalPhoneLike(String value) {
            addCriterion("LEGAL_PHONE like", value, "legalPhone");
            return (Criteria) this;
        }

        public Criteria andLegalPhoneNotLike(String value) {
            addCriterion("LEGAL_PHONE not like", value, "legalPhone");
            return (Criteria) this;
        }

        public Criteria andLegalPhoneIn(List<String> values) {
            addCriterion("LEGAL_PHONE in", values, "legalPhone");
            return (Criteria) this;
        }

        public Criteria andLegalPhoneNotIn(List<String> values) {
            addCriterion("LEGAL_PHONE not in", values, "legalPhone");
            return (Criteria) this;
        }

        public Criteria andLegalPhoneBetween(String value1, String value2) {
            addCriterion("LEGAL_PHONE between", value1, value2, "legalPhone");
            return (Criteria) this;
        }

        public Criteria andLegalPhoneNotBetween(String value1, String value2) {
            addCriterion("LEGAL_PHONE not between", value1, value2, "legalPhone");
            return (Criteria) this;
        }

        public Criteria andLegalEmailIsNull() {
            addCriterion("LEGAL_EMAIL is null");
            return (Criteria) this;
        }

        public Criteria andLegalEmailIsNotNull() {
            addCriterion("LEGAL_EMAIL is not null");
            return (Criteria) this;
        }

        public Criteria andLegalEmailEqualTo(String value) {
            addCriterion("LEGAL_EMAIL =", value, "legalEmail");
            return (Criteria) this;
        }

        public Criteria andLegalEmailNotEqualTo(String value) {
            addCriterion("LEGAL_EMAIL <>", value, "legalEmail");
            return (Criteria) this;
        }

        public Criteria andLegalEmailGreaterThan(String value) {
            addCriterion("LEGAL_EMAIL >", value, "legalEmail");
            return (Criteria) this;
        }

        public Criteria andLegalEmailGreaterThanOrEqualTo(String value) {
            addCriterion("LEGAL_EMAIL >=", value, "legalEmail");
            return (Criteria) this;
        }

        public Criteria andLegalEmailLessThan(String value) {
            addCriterion("LEGAL_EMAIL <", value, "legalEmail");
            return (Criteria) this;
        }

        public Criteria andLegalEmailLessThanOrEqualTo(String value) {
            addCriterion("LEGAL_EMAIL <=", value, "legalEmail");
            return (Criteria) this;
        }

        public Criteria andLegalEmailLike(String value) {
            addCriterion("LEGAL_EMAIL like", value, "legalEmail");
            return (Criteria) this;
        }

        public Criteria andLegalEmailNotLike(String value) {
            addCriterion("LEGAL_EMAIL not like", value, "legalEmail");
            return (Criteria) this;
        }

        public Criteria andLegalEmailIn(List<String> values) {
            addCriterion("LEGAL_EMAIL in", values, "legalEmail");
            return (Criteria) this;
        }

        public Criteria andLegalEmailNotIn(List<String> values) {
            addCriterion("LEGAL_EMAIL not in", values, "legalEmail");
            return (Criteria) this;
        }

        public Criteria andLegalEmailBetween(String value1, String value2) {
            addCriterion("LEGAL_EMAIL between", value1, value2, "legalEmail");
            return (Criteria) this;
        }

        public Criteria andLegalEmailNotBetween(String value1, String value2) {
            addCriterion("LEGAL_EMAIL not between", value1, value2, "legalEmail");
            return (Criteria) this;
        }

        public Criteria andLegalIdNoIsNull() {
            addCriterion("LEGAL_ID_NO is null");
            return (Criteria) this;
        }

        public Criteria andLegalIdNoIsNotNull() {
            addCriterion("LEGAL_ID_NO is not null");
            return (Criteria) this;
        }

        public Criteria andLegalIdNoEqualTo(String value) {
            addCriterion("LEGAL_ID_NO =", value, "legalIdNo");
            return (Criteria) this;
        }

        public Criteria andLegalIdNoNotEqualTo(String value) {
            addCriterion("LEGAL_ID_NO <>", value, "legalIdNo");
            return (Criteria) this;
        }

        public Criteria andLegalIdNoGreaterThan(String value) {
            addCriterion("LEGAL_ID_NO >", value, "legalIdNo");
            return (Criteria) this;
        }

        public Criteria andLegalIdNoGreaterThanOrEqualTo(String value) {
            addCriterion("LEGAL_ID_NO >=", value, "legalIdNo");
            return (Criteria) this;
        }

        public Criteria andLegalIdNoLessThan(String value) {
            addCriterion("LEGAL_ID_NO <", value, "legalIdNo");
            return (Criteria) this;
        }

        public Criteria andLegalIdNoLessThanOrEqualTo(String value) {
            addCriterion("LEGAL_ID_NO <=", value, "legalIdNo");
            return (Criteria) this;
        }

        public Criteria andLegalIdNoLike(String value) {
            addCriterion("LEGAL_ID_NO like", value, "legalIdNo");
            return (Criteria) this;
        }

        public Criteria andLegalIdNoNotLike(String value) {
            addCriterion("LEGAL_ID_NO not like", value, "legalIdNo");
            return (Criteria) this;
        }

        public Criteria andLegalIdNoIn(List<String> values) {
            addCriterion("LEGAL_ID_NO in", values, "legalIdNo");
            return (Criteria) this;
        }

        public Criteria andLegalIdNoNotIn(List<String> values) {
            addCriterion("LEGAL_ID_NO not in", values, "legalIdNo");
            return (Criteria) this;
        }

        public Criteria andLegalIdNoBetween(String value1, String value2) {
            addCriterion("LEGAL_ID_NO between", value1, value2, "legalIdNo");
            return (Criteria) this;
        }

        public Criteria andLegalIdNoNotBetween(String value1, String value2) {
            addCriterion("LEGAL_ID_NO not between", value1, value2, "legalIdNo");
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

        public Criteria andLinkPhoneIsNull() {
            addCriterion("LINK_PHONE is null");
            return (Criteria) this;
        }

        public Criteria andLinkPhoneIsNotNull() {
            addCriterion("LINK_PHONE is not null");
            return (Criteria) this;
        }

        public Criteria andLinkPhoneEqualTo(String value) {
            addCriterion("LINK_PHONE =", value, "linkPhone");
            return (Criteria) this;
        }

        public Criteria andLinkPhoneNotEqualTo(String value) {
            addCriterion("LINK_PHONE <>", value, "linkPhone");
            return (Criteria) this;
        }

        public Criteria andLinkPhoneGreaterThan(String value) {
            addCriterion("LINK_PHONE >", value, "linkPhone");
            return (Criteria) this;
        }

        public Criteria andLinkPhoneGreaterThanOrEqualTo(String value) {
            addCriterion("LINK_PHONE >=", value, "linkPhone");
            return (Criteria) this;
        }

        public Criteria andLinkPhoneLessThan(String value) {
            addCriterion("LINK_PHONE <", value, "linkPhone");
            return (Criteria) this;
        }

        public Criteria andLinkPhoneLessThanOrEqualTo(String value) {
            addCriterion("LINK_PHONE <=", value, "linkPhone");
            return (Criteria) this;
        }

        public Criteria andLinkPhoneLike(String value) {
            addCriterion("LINK_PHONE like", value, "linkPhone");
            return (Criteria) this;
        }

        public Criteria andLinkPhoneNotLike(String value) {
            addCriterion("LINK_PHONE not like", value, "linkPhone");
            return (Criteria) this;
        }

        public Criteria andLinkPhoneIn(List<String> values) {
            addCriterion("LINK_PHONE in", values, "linkPhone");
            return (Criteria) this;
        }

        public Criteria andLinkPhoneNotIn(List<String> values) {
            addCriterion("LINK_PHONE not in", values, "linkPhone");
            return (Criteria) this;
        }

        public Criteria andLinkPhoneBetween(String value1, String value2) {
            addCriterion("LINK_PHONE between", value1, value2, "linkPhone");
            return (Criteria) this;
        }

        public Criteria andLinkPhoneNotBetween(String value1, String value2) {
            addCriterion("LINK_PHONE not between", value1, value2, "linkPhone");
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

        public Criteria andLinkIdNoIsNull() {
            addCriterion("LINK_ID_NO is null");
            return (Criteria) this;
        }

        public Criteria andLinkIdNoIsNotNull() {
            addCriterion("LINK_ID_NO is not null");
            return (Criteria) this;
        }

        public Criteria andLinkIdNoEqualTo(String value) {
            addCriterion("LINK_ID_NO =", value, "linkIdNo");
            return (Criteria) this;
        }

        public Criteria andLinkIdNoNotEqualTo(String value) {
            addCriterion("LINK_ID_NO <>", value, "linkIdNo");
            return (Criteria) this;
        }

        public Criteria andLinkIdNoGreaterThan(String value) {
            addCriterion("LINK_ID_NO >", value, "linkIdNo");
            return (Criteria) this;
        }

        public Criteria andLinkIdNoGreaterThanOrEqualTo(String value) {
            addCriterion("LINK_ID_NO >=", value, "linkIdNo");
            return (Criteria) this;
        }

        public Criteria andLinkIdNoLessThan(String value) {
            addCriterion("LINK_ID_NO <", value, "linkIdNo");
            return (Criteria) this;
        }

        public Criteria andLinkIdNoLessThanOrEqualTo(String value) {
            addCriterion("LINK_ID_NO <=", value, "linkIdNo");
            return (Criteria) this;
        }

        public Criteria andLinkIdNoLike(String value) {
            addCriterion("LINK_ID_NO like", value, "linkIdNo");
            return (Criteria) this;
        }

        public Criteria andLinkIdNoNotLike(String value) {
            addCriterion("LINK_ID_NO not like", value, "linkIdNo");
            return (Criteria) this;
        }

        public Criteria andLinkIdNoIn(List<String> values) {
            addCriterion("LINK_ID_NO in", values, "linkIdNo");
            return (Criteria) this;
        }

        public Criteria andLinkIdNoNotIn(List<String> values) {
            addCriterion("LINK_ID_NO not in", values, "linkIdNo");
            return (Criteria) this;
        }

        public Criteria andLinkIdNoBetween(String value1, String value2) {
            addCriterion("LINK_ID_NO between", value1, value2, "linkIdNo");
            return (Criteria) this;
        }

        public Criteria andLinkIdNoNotBetween(String value1, String value2) {
            addCriterion("LINK_ID_NO not between", value1, value2, "linkIdNo");
            return (Criteria) this;
        }

        public Criteria andCompanyStatusIsNull() {
            addCriterion("COMPANY_STATUS is null");
            return (Criteria) this;
        }

        public Criteria andCompanyStatusIsNotNull() {
            addCriterion("COMPANY_STATUS is not null");
            return (Criteria) this;
        }

        public Criteria andCompanyStatusEqualTo(String value) {
            addCriterion("COMPANY_STATUS =", value, "companyStatus");
            return (Criteria) this;
        }

        public Criteria andCompanyStatusNotEqualTo(String value) {
            addCriterion("COMPANY_STATUS <>", value, "companyStatus");
            return (Criteria) this;
        }

        public Criteria andCompanyStatusGreaterThan(String value) {
            addCriterion("COMPANY_STATUS >", value, "companyStatus");
            return (Criteria) this;
        }

        public Criteria andCompanyStatusGreaterThanOrEqualTo(String value) {
            addCriterion("COMPANY_STATUS >=", value, "companyStatus");
            return (Criteria) this;
        }

        public Criteria andCompanyStatusLessThan(String value) {
            addCriterion("COMPANY_STATUS <", value, "companyStatus");
            return (Criteria) this;
        }

        public Criteria andCompanyStatusLessThanOrEqualTo(String value) {
            addCriterion("COMPANY_STATUS <=", value, "companyStatus");
            return (Criteria) this;
        }

        public Criteria andCompanyStatusLike(String value) {
            addCriterion("COMPANY_STATUS like", value, "companyStatus");
            return (Criteria) this;
        }

        public Criteria andCompanyStatusNotLike(String value) {
            addCriterion("COMPANY_STATUS not like", value, "companyStatus");
            return (Criteria) this;
        }

        public Criteria andCompanyStatusIn(List<String> values) {
            addCriterion("COMPANY_STATUS in", values, "companyStatus");
            return (Criteria) this;
        }

        public Criteria andCompanyStatusNotIn(List<String> values) {
            addCriterion("COMPANY_STATUS not in", values, "companyStatus");
            return (Criteria) this;
        }

        public Criteria andCompanyStatusBetween(String value1, String value2) {
            addCriterion("COMPANY_STATUS between", value1, value2, "companyStatus");
            return (Criteria) this;
        }

        public Criteria andCompanyStatusNotBetween(String value1, String value2) {
            addCriterion("COMPANY_STATUS not between", value1, value2, "companyStatus");
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