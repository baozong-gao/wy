package com.shenxin.core.smartpropertymanagement.persist.entity;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class ClientInfoExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ClientInfoExample() {
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

        public Criteria andClientTypeIsNull() {
            addCriterion("CLIENT_TYPE is null");
            return (Criteria) this;
        }

        public Criteria andClientTypeIsNotNull() {
            addCriterion("CLIENT_TYPE is not null");
            return (Criteria) this;
        }

        public Criteria andClientTypeEqualTo(String value) {
            addCriterion("CLIENT_TYPE =", value, "clientType");
            return (Criteria) this;
        }

        public Criteria andClientTypeNotEqualTo(String value) {
            addCriterion("CLIENT_TYPE <>", value, "clientType");
            return (Criteria) this;
        }

        public Criteria andClientTypeGreaterThan(String value) {
            addCriterion("CLIENT_TYPE >", value, "clientType");
            return (Criteria) this;
        }

        public Criteria andClientTypeGreaterThanOrEqualTo(String value) {
            addCriterion("CLIENT_TYPE >=", value, "clientType");
            return (Criteria) this;
        }

        public Criteria andClientTypeLessThan(String value) {
            addCriterion("CLIENT_TYPE <", value, "clientType");
            return (Criteria) this;
        }

        public Criteria andClientTypeLessThanOrEqualTo(String value) {
            addCriterion("CLIENT_TYPE <=", value, "clientType");
            return (Criteria) this;
        }

        public Criteria andClientTypeLike(String value) {
            addCriterion("CLIENT_TYPE like", value, "clientType");
            return (Criteria) this;
        }

        public Criteria andClientTypeNotLike(String value) {
            addCriterion("CLIENT_TYPE not like", value, "clientType");
            return (Criteria) this;
        }

        public Criteria andClientTypeIn(List<String> values) {
            addCriterion("CLIENT_TYPE in", values, "clientType");
            return (Criteria) this;
        }

        public Criteria andClientTypeNotIn(List<String> values) {
            addCriterion("CLIENT_TYPE not in", values, "clientType");
            return (Criteria) this;
        }

        public Criteria andClientTypeBetween(String value1, String value2) {
            addCriterion("CLIENT_TYPE between", value1, value2, "clientType");
            return (Criteria) this;
        }

        public Criteria andClientTypeNotBetween(String value1, String value2) {
            addCriterion("CLIENT_TYPE not between", value1, value2, "clientType");
            return (Criteria) this;
        }

        public Criteria andInNameIsNull() {
            addCriterion("IN_NAME is null");
            return (Criteria) this;
        }

        public Criteria andInNameIsNotNull() {
            addCriterion("IN_NAME is not null");
            return (Criteria) this;
        }

        public Criteria andInNameEqualTo(String value) {
            addCriterion("IN_NAME =", value, "inName");
            return (Criteria) this;
        }

        public Criteria andInNameNotEqualTo(String value) {
            addCriterion("IN_NAME <>", value, "inName");
            return (Criteria) this;
        }

        public Criteria andInNameGreaterThan(String value) {
            addCriterion("IN_NAME >", value, "inName");
            return (Criteria) this;
        }

        public Criteria andInNameGreaterThanOrEqualTo(String value) {
            addCriterion("IN_NAME >=", value, "inName");
            return (Criteria) this;
        }

        public Criteria andInNameLessThan(String value) {
            addCriterion("IN_NAME <", value, "inName");
            return (Criteria) this;
        }

        public Criteria andInNameLessThanOrEqualTo(String value) {
            addCriterion("IN_NAME <=", value, "inName");
            return (Criteria) this;
        }

        public Criteria andInNameLike(String value) {
            addCriterion("IN_NAME like", value, "inName");
            return (Criteria) this;
        }

        public Criteria andInNameNotLike(String value) {
            addCriterion("IN_NAME not like", value, "inName");
            return (Criteria) this;
        }

        public Criteria andInNameIn(List<String> values) {
            addCriterion("IN_NAME in", values, "inName");
            return (Criteria) this;
        }

        public Criteria andInNameNotIn(List<String> values) {
            addCriterion("IN_NAME not in", values, "inName");
            return (Criteria) this;
        }

        public Criteria andInNameBetween(String value1, String value2) {
            addCriterion("IN_NAME between", value1, value2, "inName");
            return (Criteria) this;
        }

        public Criteria andInNameNotBetween(String value1, String value2) {
            addCriterion("IN_NAME not between", value1, value2, "inName");
            return (Criteria) this;
        }

        public Criteria andInEnNameIsNull() {
            addCriterion("IN_EN_NAME is null");
            return (Criteria) this;
        }

        public Criteria andInEnNameIsNotNull() {
            addCriterion("IN_EN_NAME is not null");
            return (Criteria) this;
        }

        public Criteria andInEnNameEqualTo(String value) {
            addCriterion("IN_EN_NAME =", value, "inEnName");
            return (Criteria) this;
        }

        public Criteria andInEnNameNotEqualTo(String value) {
            addCriterion("IN_EN_NAME <>", value, "inEnName");
            return (Criteria) this;
        }

        public Criteria andInEnNameGreaterThan(String value) {
            addCriterion("IN_EN_NAME >", value, "inEnName");
            return (Criteria) this;
        }

        public Criteria andInEnNameGreaterThanOrEqualTo(String value) {
            addCriterion("IN_EN_NAME >=", value, "inEnName");
            return (Criteria) this;
        }

        public Criteria andInEnNameLessThan(String value) {
            addCriterion("IN_EN_NAME <", value, "inEnName");
            return (Criteria) this;
        }

        public Criteria andInEnNameLessThanOrEqualTo(String value) {
            addCriterion("IN_EN_NAME <=", value, "inEnName");
            return (Criteria) this;
        }

        public Criteria andInEnNameLike(String value) {
            addCriterion("IN_EN_NAME like", value, "inEnName");
            return (Criteria) this;
        }

        public Criteria andInEnNameNotLike(String value) {
            addCriterion("IN_EN_NAME not like", value, "inEnName");
            return (Criteria) this;
        }

        public Criteria andInEnNameIn(List<String> values) {
            addCriterion("IN_EN_NAME in", values, "inEnName");
            return (Criteria) this;
        }

        public Criteria andInEnNameNotIn(List<String> values) {
            addCriterion("IN_EN_NAME not in", values, "inEnName");
            return (Criteria) this;
        }

        public Criteria andInEnNameBetween(String value1, String value2) {
            addCriterion("IN_EN_NAME between", value1, value2, "inEnName");
            return (Criteria) this;
        }

        public Criteria andInEnNameNotBetween(String value1, String value2) {
            addCriterion("IN_EN_NAME not between", value1, value2, "inEnName");
            return (Criteria) this;
        }

        public Criteria andInAgeIsNull() {
            addCriterion("IN_AGE is null");
            return (Criteria) this;
        }

        public Criteria andInAgeIsNotNull() {
            addCriterion("IN_AGE is not null");
            return (Criteria) this;
        }

        public Criteria andInAgeEqualTo(BigDecimal value) {
            addCriterion("IN_AGE =", value, "inAge");
            return (Criteria) this;
        }

        public Criteria andInAgeNotEqualTo(BigDecimal value) {
            addCriterion("IN_AGE <>", value, "inAge");
            return (Criteria) this;
        }

        public Criteria andInAgeGreaterThan(BigDecimal value) {
            addCriterion("IN_AGE >", value, "inAge");
            return (Criteria) this;
        }

        public Criteria andInAgeGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("IN_AGE >=", value, "inAge");
            return (Criteria) this;
        }

        public Criteria andInAgeLessThan(BigDecimal value) {
            addCriterion("IN_AGE <", value, "inAge");
            return (Criteria) this;
        }

        public Criteria andInAgeLessThanOrEqualTo(BigDecimal value) {
            addCriterion("IN_AGE <=", value, "inAge");
            return (Criteria) this;
        }

        public Criteria andInAgeIn(List<BigDecimal> values) {
            addCriterion("IN_AGE in", values, "inAge");
            return (Criteria) this;
        }

        public Criteria andInAgeNotIn(List<BigDecimal> values) {
            addCriterion("IN_AGE not in", values, "inAge");
            return (Criteria) this;
        }

        public Criteria andInAgeBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("IN_AGE between", value1, value2, "inAge");
            return (Criteria) this;
        }

        public Criteria andInAgeNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("IN_AGE not between", value1, value2, "inAge");
            return (Criteria) this;
        }

        public Criteria andInSexualIsNull() {
            addCriterion("IN_SEXUAL is null");
            return (Criteria) this;
        }

        public Criteria andInSexualIsNotNull() {
            addCriterion("IN_SEXUAL is not null");
            return (Criteria) this;
        }

        public Criteria andInSexualEqualTo(String value) {
            addCriterion("IN_SEXUAL =", value, "inSexual");
            return (Criteria) this;
        }

        public Criteria andInSexualNotEqualTo(String value) {
            addCriterion("IN_SEXUAL <>", value, "inSexual");
            return (Criteria) this;
        }

        public Criteria andInSexualGreaterThan(String value) {
            addCriterion("IN_SEXUAL >", value, "inSexual");
            return (Criteria) this;
        }

        public Criteria andInSexualGreaterThanOrEqualTo(String value) {
            addCriterion("IN_SEXUAL >=", value, "inSexual");
            return (Criteria) this;
        }

        public Criteria andInSexualLessThan(String value) {
            addCriterion("IN_SEXUAL <", value, "inSexual");
            return (Criteria) this;
        }

        public Criteria andInSexualLessThanOrEqualTo(String value) {
            addCriterion("IN_SEXUAL <=", value, "inSexual");
            return (Criteria) this;
        }

        public Criteria andInSexualLike(String value) {
            addCriterion("IN_SEXUAL like", value, "inSexual");
            return (Criteria) this;
        }

        public Criteria andInSexualNotLike(String value) {
            addCriterion("IN_SEXUAL not like", value, "inSexual");
            return (Criteria) this;
        }

        public Criteria andInSexualIn(List<String> values) {
            addCriterion("IN_SEXUAL in", values, "inSexual");
            return (Criteria) this;
        }

        public Criteria andInSexualNotIn(List<String> values) {
            addCriterion("IN_SEXUAL not in", values, "inSexual");
            return (Criteria) this;
        }

        public Criteria andInSexualBetween(String value1, String value2) {
            addCriterion("IN_SEXUAL between", value1, value2, "inSexual");
            return (Criteria) this;
        }

        public Criteria andInSexualNotBetween(String value1, String value2) {
            addCriterion("IN_SEXUAL not between", value1, value2, "inSexual");
            return (Criteria) this;
        }

        public Criteria andInMobileIsNull() {
            addCriterion("IN_MOBILE is null");
            return (Criteria) this;
        }

        public Criteria andInMobileIsNotNull() {
            addCriterion("IN_MOBILE is not null");
            return (Criteria) this;
        }

        public Criteria andInMobileEqualTo(String value) {
            addCriterion("IN_MOBILE =", value, "inMobile");
            return (Criteria) this;
        }

        public Criteria andInMobileNotEqualTo(String value) {
            addCriterion("IN_MOBILE <>", value, "inMobile");
            return (Criteria) this;
        }

        public Criteria andInMobileGreaterThan(String value) {
            addCriterion("IN_MOBILE >", value, "inMobile");
            return (Criteria) this;
        }

        public Criteria andInMobileGreaterThanOrEqualTo(String value) {
            addCriterion("IN_MOBILE >=", value, "inMobile");
            return (Criteria) this;
        }

        public Criteria andInMobileLessThan(String value) {
            addCriterion("IN_MOBILE <", value, "inMobile");
            return (Criteria) this;
        }

        public Criteria andInMobileLessThanOrEqualTo(String value) {
            addCriterion("IN_MOBILE <=", value, "inMobile");
            return (Criteria) this;
        }

        public Criteria andInMobileLike(String value) {
            addCriterion("IN_MOBILE like", value, "inMobile");
            return (Criteria) this;
        }

        public Criteria andInMobileNotLike(String value) {
            addCriterion("IN_MOBILE not like", value, "inMobile");
            return (Criteria) this;
        }

        public Criteria andInMobileIn(List<String> values) {
            addCriterion("IN_MOBILE in", values, "inMobile");
            return (Criteria) this;
        }

        public Criteria andInMobileNotIn(List<String> values) {
            addCriterion("IN_MOBILE not in", values, "inMobile");
            return (Criteria) this;
        }

        public Criteria andInMobileBetween(String value1, String value2) {
            addCriterion("IN_MOBILE between", value1, value2, "inMobile");
            return (Criteria) this;
        }

        public Criteria andInMobileNotBetween(String value1, String value2) {
            addCriterion("IN_MOBILE not between", value1, value2, "inMobile");
            return (Criteria) this;
        }

        public Criteria andInCountryIsNull() {
            addCriterion("IN_COUNTRY is null");
            return (Criteria) this;
        }

        public Criteria andInCountryIsNotNull() {
            addCriterion("IN_COUNTRY is not null");
            return (Criteria) this;
        }

        public Criteria andInCountryEqualTo(String value) {
            addCriterion("IN_COUNTRY =", value, "inCountry");
            return (Criteria) this;
        }

        public Criteria andInCountryNotEqualTo(String value) {
            addCriterion("IN_COUNTRY <>", value, "inCountry");
            return (Criteria) this;
        }

        public Criteria andInCountryGreaterThan(String value) {
            addCriterion("IN_COUNTRY >", value, "inCountry");
            return (Criteria) this;
        }

        public Criteria andInCountryGreaterThanOrEqualTo(String value) {
            addCriterion("IN_COUNTRY >=", value, "inCountry");
            return (Criteria) this;
        }

        public Criteria andInCountryLessThan(String value) {
            addCriterion("IN_COUNTRY <", value, "inCountry");
            return (Criteria) this;
        }

        public Criteria andInCountryLessThanOrEqualTo(String value) {
            addCriterion("IN_COUNTRY <=", value, "inCountry");
            return (Criteria) this;
        }

        public Criteria andInCountryLike(String value) {
            addCriterion("IN_COUNTRY like", value, "inCountry");
            return (Criteria) this;
        }

        public Criteria andInCountryNotLike(String value) {
            addCriterion("IN_COUNTRY not like", value, "inCountry");
            return (Criteria) this;
        }

        public Criteria andInCountryIn(List<String> values) {
            addCriterion("IN_COUNTRY in", values, "inCountry");
            return (Criteria) this;
        }

        public Criteria andInCountryNotIn(List<String> values) {
            addCriterion("IN_COUNTRY not in", values, "inCountry");
            return (Criteria) this;
        }

        public Criteria andInCountryBetween(String value1, String value2) {
            addCriterion("IN_COUNTRY between", value1, value2, "inCountry");
            return (Criteria) this;
        }

        public Criteria andInCountryNotBetween(String value1, String value2) {
            addCriterion("IN_COUNTRY not between", value1, value2, "inCountry");
            return (Criteria) this;
        }

        public Criteria andInOrigIsNull() {
            addCriterion("IN_ORIG is null");
            return (Criteria) this;
        }

        public Criteria andInOrigIsNotNull() {
            addCriterion("IN_ORIG is not null");
            return (Criteria) this;
        }

        public Criteria andInOrigEqualTo(String value) {
            addCriterion("IN_ORIG =", value, "inOrig");
            return (Criteria) this;
        }

        public Criteria andInOrigNotEqualTo(String value) {
            addCriterion("IN_ORIG <>", value, "inOrig");
            return (Criteria) this;
        }

        public Criteria andInOrigGreaterThan(String value) {
            addCriterion("IN_ORIG >", value, "inOrig");
            return (Criteria) this;
        }

        public Criteria andInOrigGreaterThanOrEqualTo(String value) {
            addCriterion("IN_ORIG >=", value, "inOrig");
            return (Criteria) this;
        }

        public Criteria andInOrigLessThan(String value) {
            addCriterion("IN_ORIG <", value, "inOrig");
            return (Criteria) this;
        }

        public Criteria andInOrigLessThanOrEqualTo(String value) {
            addCriterion("IN_ORIG <=", value, "inOrig");
            return (Criteria) this;
        }

        public Criteria andInOrigLike(String value) {
            addCriterion("IN_ORIG like", value, "inOrig");
            return (Criteria) this;
        }

        public Criteria andInOrigNotLike(String value) {
            addCriterion("IN_ORIG not like", value, "inOrig");
            return (Criteria) this;
        }

        public Criteria andInOrigIn(List<String> values) {
            addCriterion("IN_ORIG in", values, "inOrig");
            return (Criteria) this;
        }

        public Criteria andInOrigNotIn(List<String> values) {
            addCriterion("IN_ORIG not in", values, "inOrig");
            return (Criteria) this;
        }

        public Criteria andInOrigBetween(String value1, String value2) {
            addCriterion("IN_ORIG between", value1, value2, "inOrig");
            return (Criteria) this;
        }

        public Criteria andInOrigNotBetween(String value1, String value2) {
            addCriterion("IN_ORIG not between", value1, value2, "inOrig");
            return (Criteria) this;
        }

        public Criteria andInOrigAddressIsNull() {
            addCriterion("IN_ORIG_ADDRESS is null");
            return (Criteria) this;
        }

        public Criteria andInOrigAddressIsNotNull() {
            addCriterion("IN_ORIG_ADDRESS is not null");
            return (Criteria) this;
        }

        public Criteria andInOrigAddressEqualTo(String value) {
            addCriterion("IN_ORIG_ADDRESS =", value, "inOrigAddress");
            return (Criteria) this;
        }

        public Criteria andInOrigAddressNotEqualTo(String value) {
            addCriterion("IN_ORIG_ADDRESS <>", value, "inOrigAddress");
            return (Criteria) this;
        }

        public Criteria andInOrigAddressGreaterThan(String value) {
            addCriterion("IN_ORIG_ADDRESS >", value, "inOrigAddress");
            return (Criteria) this;
        }

        public Criteria andInOrigAddressGreaterThanOrEqualTo(String value) {
            addCriterion("IN_ORIG_ADDRESS >=", value, "inOrigAddress");
            return (Criteria) this;
        }

        public Criteria andInOrigAddressLessThan(String value) {
            addCriterion("IN_ORIG_ADDRESS <", value, "inOrigAddress");
            return (Criteria) this;
        }

        public Criteria andInOrigAddressLessThanOrEqualTo(String value) {
            addCriterion("IN_ORIG_ADDRESS <=", value, "inOrigAddress");
            return (Criteria) this;
        }

        public Criteria andInOrigAddressLike(String value) {
            addCriterion("IN_ORIG_ADDRESS like", value, "inOrigAddress");
            return (Criteria) this;
        }

        public Criteria andInOrigAddressNotLike(String value) {
            addCriterion("IN_ORIG_ADDRESS not like", value, "inOrigAddress");
            return (Criteria) this;
        }

        public Criteria andInOrigAddressIn(List<String> values) {
            addCriterion("IN_ORIG_ADDRESS in", values, "inOrigAddress");
            return (Criteria) this;
        }

        public Criteria andInOrigAddressNotIn(List<String> values) {
            addCriterion("IN_ORIG_ADDRESS not in", values, "inOrigAddress");
            return (Criteria) this;
        }

        public Criteria andInOrigAddressBetween(String value1, String value2) {
            addCriterion("IN_ORIG_ADDRESS between", value1, value2, "inOrigAddress");
            return (Criteria) this;
        }

        public Criteria andInOrigAddressNotBetween(String value1, String value2) {
            addCriterion("IN_ORIG_ADDRESS not between", value1, value2, "inOrigAddress");
            return (Criteria) this;
        }

        public Criteria andInLiveAddressIsNull() {
            addCriterion("IN_LIVE_ADDRESS is null");
            return (Criteria) this;
        }

        public Criteria andInLiveAddressIsNotNull() {
            addCriterion("IN_LIVE_ADDRESS is not null");
            return (Criteria) this;
        }

        public Criteria andInLiveAddressEqualTo(String value) {
            addCriterion("IN_LIVE_ADDRESS =", value, "inLiveAddress");
            return (Criteria) this;
        }

        public Criteria andInLiveAddressNotEqualTo(String value) {
            addCriterion("IN_LIVE_ADDRESS <>", value, "inLiveAddress");
            return (Criteria) this;
        }

        public Criteria andInLiveAddressGreaterThan(String value) {
            addCriterion("IN_LIVE_ADDRESS >", value, "inLiveAddress");
            return (Criteria) this;
        }

        public Criteria andInLiveAddressGreaterThanOrEqualTo(String value) {
            addCriterion("IN_LIVE_ADDRESS >=", value, "inLiveAddress");
            return (Criteria) this;
        }

        public Criteria andInLiveAddressLessThan(String value) {
            addCriterion("IN_LIVE_ADDRESS <", value, "inLiveAddress");
            return (Criteria) this;
        }

        public Criteria andInLiveAddressLessThanOrEqualTo(String value) {
            addCriterion("IN_LIVE_ADDRESS <=", value, "inLiveAddress");
            return (Criteria) this;
        }

        public Criteria andInLiveAddressLike(String value) {
            addCriterion("IN_LIVE_ADDRESS like", value, "inLiveAddress");
            return (Criteria) this;
        }

        public Criteria andInLiveAddressNotLike(String value) {
            addCriterion("IN_LIVE_ADDRESS not like", value, "inLiveAddress");
            return (Criteria) this;
        }

        public Criteria andInLiveAddressIn(List<String> values) {
            addCriterion("IN_LIVE_ADDRESS in", values, "inLiveAddress");
            return (Criteria) this;
        }

        public Criteria andInLiveAddressNotIn(List<String> values) {
            addCriterion("IN_LIVE_ADDRESS not in", values, "inLiveAddress");
            return (Criteria) this;
        }

        public Criteria andInLiveAddressBetween(String value1, String value2) {
            addCriterion("IN_LIVE_ADDRESS between", value1, value2, "inLiveAddress");
            return (Criteria) this;
        }

        public Criteria andInLiveAddressNotBetween(String value1, String value2) {
            addCriterion("IN_LIVE_ADDRESS not between", value1, value2, "inLiveAddress");
            return (Criteria) this;
        }

        public Criteria andInIdTypeIsNull() {
            addCriterion("IN_ID_TYPE is null");
            return (Criteria) this;
        }

        public Criteria andInIdTypeIsNotNull() {
            addCriterion("IN_ID_TYPE is not null");
            return (Criteria) this;
        }

        public Criteria andInIdTypeEqualTo(String value) {
            addCriterion("IN_ID_TYPE =", value, "inIdType");
            return (Criteria) this;
        }

        public Criteria andInIdTypeNotEqualTo(String value) {
            addCriterion("IN_ID_TYPE <>", value, "inIdType");
            return (Criteria) this;
        }

        public Criteria andInIdTypeGreaterThan(String value) {
            addCriterion("IN_ID_TYPE >", value, "inIdType");
            return (Criteria) this;
        }

        public Criteria andInIdTypeGreaterThanOrEqualTo(String value) {
            addCriterion("IN_ID_TYPE >=", value, "inIdType");
            return (Criteria) this;
        }

        public Criteria andInIdTypeLessThan(String value) {
            addCriterion("IN_ID_TYPE <", value, "inIdType");
            return (Criteria) this;
        }

        public Criteria andInIdTypeLessThanOrEqualTo(String value) {
            addCriterion("IN_ID_TYPE <=", value, "inIdType");
            return (Criteria) this;
        }

        public Criteria andInIdTypeLike(String value) {
            addCriterion("IN_ID_TYPE like", value, "inIdType");
            return (Criteria) this;
        }

        public Criteria andInIdTypeNotLike(String value) {
            addCriterion("IN_ID_TYPE not like", value, "inIdType");
            return (Criteria) this;
        }

        public Criteria andInIdTypeIn(List<String> values) {
            addCriterion("IN_ID_TYPE in", values, "inIdType");
            return (Criteria) this;
        }

        public Criteria andInIdTypeNotIn(List<String> values) {
            addCriterion("IN_ID_TYPE not in", values, "inIdType");
            return (Criteria) this;
        }

        public Criteria andInIdTypeBetween(String value1, String value2) {
            addCriterion("IN_ID_TYPE between", value1, value2, "inIdType");
            return (Criteria) this;
        }

        public Criteria andInIdTypeNotBetween(String value1, String value2) {
            addCriterion("IN_ID_TYPE not between", value1, value2, "inIdType");
            return (Criteria) this;
        }

        public Criteria andInIdNoIsNull() {
            addCriterion("IN_ID_NO is null");
            return (Criteria) this;
        }

        public Criteria andInIdNoIsNotNull() {
            addCriterion("IN_ID_NO is not null");
            return (Criteria) this;
        }

        public Criteria andInIdNoEqualTo(String value) {
            addCriterion("IN_ID_NO =", value, "inIdNo");
            return (Criteria) this;
        }

        public Criteria andInIdNoNotEqualTo(String value) {
            addCriterion("IN_ID_NO <>", value, "inIdNo");
            return (Criteria) this;
        }

        public Criteria andInIdNoGreaterThan(String value) {
            addCriterion("IN_ID_NO >", value, "inIdNo");
            return (Criteria) this;
        }

        public Criteria andInIdNoGreaterThanOrEqualTo(String value) {
            addCriterion("IN_ID_NO >=", value, "inIdNo");
            return (Criteria) this;
        }

        public Criteria andInIdNoLessThan(String value) {
            addCriterion("IN_ID_NO <", value, "inIdNo");
            return (Criteria) this;
        }

        public Criteria andInIdNoLessThanOrEqualTo(String value) {
            addCriterion("IN_ID_NO <=", value, "inIdNo");
            return (Criteria) this;
        }

        public Criteria andInIdNoLike(String value) {
            addCriterion("IN_ID_NO like", value, "inIdNo");
            return (Criteria) this;
        }

        public Criteria andInIdNoNotLike(String value) {
            addCriterion("IN_ID_NO not like", value, "inIdNo");
            return (Criteria) this;
        }

        public Criteria andInIdNoIn(List<String> values) {
            addCriterion("IN_ID_NO in", values, "inIdNo");
            return (Criteria) this;
        }

        public Criteria andInIdNoNotIn(List<String> values) {
            addCriterion("IN_ID_NO not in", values, "inIdNo");
            return (Criteria) this;
        }

        public Criteria andInIdNoBetween(String value1, String value2) {
            addCriterion("IN_ID_NO between", value1, value2, "inIdNo");
            return (Criteria) this;
        }

        public Criteria andInIdNoNotBetween(String value1, String value2) {
            addCriterion("IN_ID_NO not between", value1, value2, "inIdNo");
            return (Criteria) this;
        }

        public Criteria andCmNameIsNull() {
            addCriterion("CM_NAME is null");
            return (Criteria) this;
        }

        public Criteria andCmNameIsNotNull() {
            addCriterion("CM_NAME is not null");
            return (Criteria) this;
        }

        public Criteria andCmNameEqualTo(String value) {
            addCriterion("CM_NAME =", value, "cmName");
            return (Criteria) this;
        }

        public Criteria andCmNameNotEqualTo(String value) {
            addCriterion("CM_NAME <>", value, "cmName");
            return (Criteria) this;
        }

        public Criteria andCmNameGreaterThan(String value) {
            addCriterion("CM_NAME >", value, "cmName");
            return (Criteria) this;
        }

        public Criteria andCmNameGreaterThanOrEqualTo(String value) {
            addCriterion("CM_NAME >=", value, "cmName");
            return (Criteria) this;
        }

        public Criteria andCmNameLessThan(String value) {
            addCriterion("CM_NAME <", value, "cmName");
            return (Criteria) this;
        }

        public Criteria andCmNameLessThanOrEqualTo(String value) {
            addCriterion("CM_NAME <=", value, "cmName");
            return (Criteria) this;
        }

        public Criteria andCmNameLike(String value) {
            addCriterion("CM_NAME like", value, "cmName");
            return (Criteria) this;
        }

        public Criteria andCmNameNotLike(String value) {
            addCriterion("CM_NAME not like", value, "cmName");
            return (Criteria) this;
        }

        public Criteria andCmNameIn(List<String> values) {
            addCriterion("CM_NAME in", values, "cmName");
            return (Criteria) this;
        }

        public Criteria andCmNameNotIn(List<String> values) {
            addCriterion("CM_NAME not in", values, "cmName");
            return (Criteria) this;
        }

        public Criteria andCmNameBetween(String value1, String value2) {
            addCriterion("CM_NAME between", value1, value2, "cmName");
            return (Criteria) this;
        }

        public Criteria andCmNameNotBetween(String value1, String value2) {
            addCriterion("CM_NAME not between", value1, value2, "cmName");
            return (Criteria) this;
        }

        public Criteria andCmEnNameIsNull() {
            addCriterion("CM_EN_NAME is null");
            return (Criteria) this;
        }

        public Criteria andCmEnNameIsNotNull() {
            addCriterion("CM_EN_NAME is not null");
            return (Criteria) this;
        }

        public Criteria andCmEnNameEqualTo(String value) {
            addCriterion("CM_EN_NAME =", value, "cmEnName");
            return (Criteria) this;
        }

        public Criteria andCmEnNameNotEqualTo(String value) {
            addCriterion("CM_EN_NAME <>", value, "cmEnName");
            return (Criteria) this;
        }

        public Criteria andCmEnNameGreaterThan(String value) {
            addCriterion("CM_EN_NAME >", value, "cmEnName");
            return (Criteria) this;
        }

        public Criteria andCmEnNameGreaterThanOrEqualTo(String value) {
            addCriterion("CM_EN_NAME >=", value, "cmEnName");
            return (Criteria) this;
        }

        public Criteria andCmEnNameLessThan(String value) {
            addCriterion("CM_EN_NAME <", value, "cmEnName");
            return (Criteria) this;
        }

        public Criteria andCmEnNameLessThanOrEqualTo(String value) {
            addCriterion("CM_EN_NAME <=", value, "cmEnName");
            return (Criteria) this;
        }

        public Criteria andCmEnNameLike(String value) {
            addCriterion("CM_EN_NAME like", value, "cmEnName");
            return (Criteria) this;
        }

        public Criteria andCmEnNameNotLike(String value) {
            addCriterion("CM_EN_NAME not like", value, "cmEnName");
            return (Criteria) this;
        }

        public Criteria andCmEnNameIn(List<String> values) {
            addCriterion("CM_EN_NAME in", values, "cmEnName");
            return (Criteria) this;
        }

        public Criteria andCmEnNameNotIn(List<String> values) {
            addCriterion("CM_EN_NAME not in", values, "cmEnName");
            return (Criteria) this;
        }

        public Criteria andCmEnNameBetween(String value1, String value2) {
            addCriterion("CM_EN_NAME between", value1, value2, "cmEnName");
            return (Criteria) this;
        }

        public Criteria andCmEnNameNotBetween(String value1, String value2) {
            addCriterion("CM_EN_NAME not between", value1, value2, "cmEnName");
            return (Criteria) this;
        }

        public Criteria andCmOutNameIsNull() {
            addCriterion("CM_OUT_NAME is null");
            return (Criteria) this;
        }

        public Criteria andCmOutNameIsNotNull() {
            addCriterion("CM_OUT_NAME is not null");
            return (Criteria) this;
        }

        public Criteria andCmOutNameEqualTo(String value) {
            addCriterion("CM_OUT_NAME =", value, "cmOutName");
            return (Criteria) this;
        }

        public Criteria andCmOutNameNotEqualTo(String value) {
            addCriterion("CM_OUT_NAME <>", value, "cmOutName");
            return (Criteria) this;
        }

        public Criteria andCmOutNameGreaterThan(String value) {
            addCriterion("CM_OUT_NAME >", value, "cmOutName");
            return (Criteria) this;
        }

        public Criteria andCmOutNameGreaterThanOrEqualTo(String value) {
            addCriterion("CM_OUT_NAME >=", value, "cmOutName");
            return (Criteria) this;
        }

        public Criteria andCmOutNameLessThan(String value) {
            addCriterion("CM_OUT_NAME <", value, "cmOutName");
            return (Criteria) this;
        }

        public Criteria andCmOutNameLessThanOrEqualTo(String value) {
            addCriterion("CM_OUT_NAME <=", value, "cmOutName");
            return (Criteria) this;
        }

        public Criteria andCmOutNameLike(String value) {
            addCriterion("CM_OUT_NAME like", value, "cmOutName");
            return (Criteria) this;
        }

        public Criteria andCmOutNameNotLike(String value) {
            addCriterion("CM_OUT_NAME not like", value, "cmOutName");
            return (Criteria) this;
        }

        public Criteria andCmOutNameIn(List<String> values) {
            addCriterion("CM_OUT_NAME in", values, "cmOutName");
            return (Criteria) this;
        }

        public Criteria andCmOutNameNotIn(List<String> values) {
            addCriterion("CM_OUT_NAME not in", values, "cmOutName");
            return (Criteria) this;
        }

        public Criteria andCmOutNameBetween(String value1, String value2) {
            addCriterion("CM_OUT_NAME between", value1, value2, "cmOutName");
            return (Criteria) this;
        }

        public Criteria andCmOutNameNotBetween(String value1, String value2) {
            addCriterion("CM_OUT_NAME not between", value1, value2, "cmOutName");
            return (Criteria) this;
        }

        public Criteria andCmSizeIsNull() {
            addCriterion("CM_SIZE is null");
            return (Criteria) this;
        }

        public Criteria andCmSizeIsNotNull() {
            addCriterion("CM_SIZE is not null");
            return (Criteria) this;
        }

        public Criteria andCmSizeEqualTo(BigDecimal value) {
            addCriterion("CM_SIZE =", value, "cmSize");
            return (Criteria) this;
        }

        public Criteria andCmSizeNotEqualTo(BigDecimal value) {
            addCriterion("CM_SIZE <>", value, "cmSize");
            return (Criteria) this;
        }

        public Criteria andCmSizeGreaterThan(BigDecimal value) {
            addCriterion("CM_SIZE >", value, "cmSize");
            return (Criteria) this;
        }

        public Criteria andCmSizeGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("CM_SIZE >=", value, "cmSize");
            return (Criteria) this;
        }

        public Criteria andCmSizeLessThan(BigDecimal value) {
            addCriterion("CM_SIZE <", value, "cmSize");
            return (Criteria) this;
        }

        public Criteria andCmSizeLessThanOrEqualTo(BigDecimal value) {
            addCriterion("CM_SIZE <=", value, "cmSize");
            return (Criteria) this;
        }

        public Criteria andCmSizeIn(List<BigDecimal> values) {
            addCriterion("CM_SIZE in", values, "cmSize");
            return (Criteria) this;
        }

        public Criteria andCmSizeNotIn(List<BigDecimal> values) {
            addCriterion("CM_SIZE not in", values, "cmSize");
            return (Criteria) this;
        }

        public Criteria andCmSizeBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("CM_SIZE between", value1, value2, "cmSize");
            return (Criteria) this;
        }

        public Criteria andCmSizeNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("CM_SIZE not between", value1, value2, "cmSize");
            return (Criteria) this;
        }

        public Criteria andCmTypeIsNull() {
            addCriterion("CM_TYPE is null");
            return (Criteria) this;
        }

        public Criteria andCmTypeIsNotNull() {
            addCriterion("CM_TYPE is not null");
            return (Criteria) this;
        }

        public Criteria andCmTypeEqualTo(String value) {
            addCriterion("CM_TYPE =", value, "cmType");
            return (Criteria) this;
        }

        public Criteria andCmTypeNotEqualTo(String value) {
            addCriterion("CM_TYPE <>", value, "cmType");
            return (Criteria) this;
        }

        public Criteria andCmTypeGreaterThan(String value) {
            addCriterion("CM_TYPE >", value, "cmType");
            return (Criteria) this;
        }

        public Criteria andCmTypeGreaterThanOrEqualTo(String value) {
            addCriterion("CM_TYPE >=", value, "cmType");
            return (Criteria) this;
        }

        public Criteria andCmTypeLessThan(String value) {
            addCriterion("CM_TYPE <", value, "cmType");
            return (Criteria) this;
        }

        public Criteria andCmTypeLessThanOrEqualTo(String value) {
            addCriterion("CM_TYPE <=", value, "cmType");
            return (Criteria) this;
        }

        public Criteria andCmTypeLike(String value) {
            addCriterion("CM_TYPE like", value, "cmType");
            return (Criteria) this;
        }

        public Criteria andCmTypeNotLike(String value) {
            addCriterion("CM_TYPE not like", value, "cmType");
            return (Criteria) this;
        }

        public Criteria andCmTypeIn(List<String> values) {
            addCriterion("CM_TYPE in", values, "cmType");
            return (Criteria) this;
        }

        public Criteria andCmTypeNotIn(List<String> values) {
            addCriterion("CM_TYPE not in", values, "cmType");
            return (Criteria) this;
        }

        public Criteria andCmTypeBetween(String value1, String value2) {
            addCriterion("CM_TYPE between", value1, value2, "cmType");
            return (Criteria) this;
        }

        public Criteria andCmTypeNotBetween(String value1, String value2) {
            addCriterion("CM_TYPE not between", value1, value2, "cmType");
            return (Criteria) this;
        }

        public Criteria andCmCatagoryIsNull() {
            addCriterion("CM_CATAGORY is null");
            return (Criteria) this;
        }

        public Criteria andCmCatagoryIsNotNull() {
            addCriterion("CM_CATAGORY is not null");
            return (Criteria) this;
        }

        public Criteria andCmCatagoryEqualTo(String value) {
            addCriterion("CM_CATAGORY =", value, "cmCatagory");
            return (Criteria) this;
        }

        public Criteria andCmCatagoryNotEqualTo(String value) {
            addCriterion("CM_CATAGORY <>", value, "cmCatagory");
            return (Criteria) this;
        }

        public Criteria andCmCatagoryGreaterThan(String value) {
            addCriterion("CM_CATAGORY >", value, "cmCatagory");
            return (Criteria) this;
        }

        public Criteria andCmCatagoryGreaterThanOrEqualTo(String value) {
            addCriterion("CM_CATAGORY >=", value, "cmCatagory");
            return (Criteria) this;
        }

        public Criteria andCmCatagoryLessThan(String value) {
            addCriterion("CM_CATAGORY <", value, "cmCatagory");
            return (Criteria) this;
        }

        public Criteria andCmCatagoryLessThanOrEqualTo(String value) {
            addCriterion("CM_CATAGORY <=", value, "cmCatagory");
            return (Criteria) this;
        }

        public Criteria andCmCatagoryLike(String value) {
            addCriterion("CM_CATAGORY like", value, "cmCatagory");
            return (Criteria) this;
        }

        public Criteria andCmCatagoryNotLike(String value) {
            addCriterion("CM_CATAGORY not like", value, "cmCatagory");
            return (Criteria) this;
        }

        public Criteria andCmCatagoryIn(List<String> values) {
            addCriterion("CM_CATAGORY in", values, "cmCatagory");
            return (Criteria) this;
        }

        public Criteria andCmCatagoryNotIn(List<String> values) {
            addCriterion("CM_CATAGORY not in", values, "cmCatagory");
            return (Criteria) this;
        }

        public Criteria andCmCatagoryBetween(String value1, String value2) {
            addCriterion("CM_CATAGORY between", value1, value2, "cmCatagory");
            return (Criteria) this;
        }

        public Criteria andCmCatagoryNotBetween(String value1, String value2) {
            addCriterion("CM_CATAGORY not between", value1, value2, "cmCatagory");
            return (Criteria) this;
        }

        public Criteria andCmMainBusinessIsNull() {
            addCriterion("CM_MAIN_BUSINESS is null");
            return (Criteria) this;
        }

        public Criteria andCmMainBusinessIsNotNull() {
            addCriterion("CM_MAIN_BUSINESS is not null");
            return (Criteria) this;
        }

        public Criteria andCmMainBusinessEqualTo(String value) {
            addCriterion("CM_MAIN_BUSINESS =", value, "cmMainBusiness");
            return (Criteria) this;
        }

        public Criteria andCmMainBusinessNotEqualTo(String value) {
            addCriterion("CM_MAIN_BUSINESS <>", value, "cmMainBusiness");
            return (Criteria) this;
        }

        public Criteria andCmMainBusinessGreaterThan(String value) {
            addCriterion("CM_MAIN_BUSINESS >", value, "cmMainBusiness");
            return (Criteria) this;
        }

        public Criteria andCmMainBusinessGreaterThanOrEqualTo(String value) {
            addCriterion("CM_MAIN_BUSINESS >=", value, "cmMainBusiness");
            return (Criteria) this;
        }

        public Criteria andCmMainBusinessLessThan(String value) {
            addCriterion("CM_MAIN_BUSINESS <", value, "cmMainBusiness");
            return (Criteria) this;
        }

        public Criteria andCmMainBusinessLessThanOrEqualTo(String value) {
            addCriterion("CM_MAIN_BUSINESS <=", value, "cmMainBusiness");
            return (Criteria) this;
        }

        public Criteria andCmMainBusinessLike(String value) {
            addCriterion("CM_MAIN_BUSINESS like", value, "cmMainBusiness");
            return (Criteria) this;
        }

        public Criteria andCmMainBusinessNotLike(String value) {
            addCriterion("CM_MAIN_BUSINESS not like", value, "cmMainBusiness");
            return (Criteria) this;
        }

        public Criteria andCmMainBusinessIn(List<String> values) {
            addCriterion("CM_MAIN_BUSINESS in", values, "cmMainBusiness");
            return (Criteria) this;
        }

        public Criteria andCmMainBusinessNotIn(List<String> values) {
            addCriterion("CM_MAIN_BUSINESS not in", values, "cmMainBusiness");
            return (Criteria) this;
        }

        public Criteria andCmMainBusinessBetween(String value1, String value2) {
            addCriterion("CM_MAIN_BUSINESS between", value1, value2, "cmMainBusiness");
            return (Criteria) this;
        }

        public Criteria andCmMainBusinessNotBetween(String value1, String value2) {
            addCriterion("CM_MAIN_BUSINESS not between", value1, value2, "cmMainBusiness");
            return (Criteria) this;
        }

        public Criteria andCmAddressIsNull() {
            addCriterion("CM_ADDRESS is null");
            return (Criteria) this;
        }

        public Criteria andCmAddressIsNotNull() {
            addCriterion("CM_ADDRESS is not null");
            return (Criteria) this;
        }

        public Criteria andCmAddressEqualTo(String value) {
            addCriterion("CM_ADDRESS =", value, "cmAddress");
            return (Criteria) this;
        }

        public Criteria andCmAddressNotEqualTo(String value) {
            addCriterion("CM_ADDRESS <>", value, "cmAddress");
            return (Criteria) this;
        }

        public Criteria andCmAddressGreaterThan(String value) {
            addCriterion("CM_ADDRESS >", value, "cmAddress");
            return (Criteria) this;
        }

        public Criteria andCmAddressGreaterThanOrEqualTo(String value) {
            addCriterion("CM_ADDRESS >=", value, "cmAddress");
            return (Criteria) this;
        }

        public Criteria andCmAddressLessThan(String value) {
            addCriterion("CM_ADDRESS <", value, "cmAddress");
            return (Criteria) this;
        }

        public Criteria andCmAddressLessThanOrEqualTo(String value) {
            addCriterion("CM_ADDRESS <=", value, "cmAddress");
            return (Criteria) this;
        }

        public Criteria andCmAddressLike(String value) {
            addCriterion("CM_ADDRESS like", value, "cmAddress");
            return (Criteria) this;
        }

        public Criteria andCmAddressNotLike(String value) {
            addCriterion("CM_ADDRESS not like", value, "cmAddress");
            return (Criteria) this;
        }

        public Criteria andCmAddressIn(List<String> values) {
            addCriterion("CM_ADDRESS in", values, "cmAddress");
            return (Criteria) this;
        }

        public Criteria andCmAddressNotIn(List<String> values) {
            addCriterion("CM_ADDRESS not in", values, "cmAddress");
            return (Criteria) this;
        }

        public Criteria andCmAddressBetween(String value1, String value2) {
            addCriterion("CM_ADDRESS between", value1, value2, "cmAddress");
            return (Criteria) this;
        }

        public Criteria andCmAddressNotBetween(String value1, String value2) {
            addCriterion("CM_ADDRESS not between", value1, value2, "cmAddress");
            return (Criteria) this;
        }

        public Criteria andCmRegisterAmountIsNull() {
            addCriterion("CM_REGISTER_AMOUNT is null");
            return (Criteria) this;
        }

        public Criteria andCmRegisterAmountIsNotNull() {
            addCriterion("CM_REGISTER_AMOUNT is not null");
            return (Criteria) this;
        }

        public Criteria andCmRegisterAmountEqualTo(String value) {
            addCriterion("CM_REGISTER_AMOUNT =", value, "cmRegisterAmount");
            return (Criteria) this;
        }

        public Criteria andCmRegisterAmountNotEqualTo(String value) {
            addCriterion("CM_REGISTER_AMOUNT <>", value, "cmRegisterAmount");
            return (Criteria) this;
        }

        public Criteria andCmRegisterAmountGreaterThan(String value) {
            addCriterion("CM_REGISTER_AMOUNT >", value, "cmRegisterAmount");
            return (Criteria) this;
        }

        public Criteria andCmRegisterAmountGreaterThanOrEqualTo(String value) {
            addCriterion("CM_REGISTER_AMOUNT >=", value, "cmRegisterAmount");
            return (Criteria) this;
        }

        public Criteria andCmRegisterAmountLessThan(String value) {
            addCriterion("CM_REGISTER_AMOUNT <", value, "cmRegisterAmount");
            return (Criteria) this;
        }

        public Criteria andCmRegisterAmountLessThanOrEqualTo(String value) {
            addCriterion("CM_REGISTER_AMOUNT <=", value, "cmRegisterAmount");
            return (Criteria) this;
        }

        public Criteria andCmRegisterAmountLike(String value) {
            addCriterion("CM_REGISTER_AMOUNT like", value, "cmRegisterAmount");
            return (Criteria) this;
        }

        public Criteria andCmRegisterAmountNotLike(String value) {
            addCriterion("CM_REGISTER_AMOUNT not like", value, "cmRegisterAmount");
            return (Criteria) this;
        }

        public Criteria andCmRegisterAmountIn(List<String> values) {
            addCriterion("CM_REGISTER_AMOUNT in", values, "cmRegisterAmount");
            return (Criteria) this;
        }

        public Criteria andCmRegisterAmountNotIn(List<String> values) {
            addCriterion("CM_REGISTER_AMOUNT not in", values, "cmRegisterAmount");
            return (Criteria) this;
        }

        public Criteria andCmRegisterAmountBetween(String value1, String value2) {
            addCriterion("CM_REGISTER_AMOUNT between", value1, value2, "cmRegisterAmount");
            return (Criteria) this;
        }

        public Criteria andCmRegisterAmountNotBetween(String value1, String value2) {
            addCriterion("CM_REGISTER_AMOUNT not between", value1, value2, "cmRegisterAmount");
            return (Criteria) this;
        }

        public Criteria andCmRegisterAddressIsNull() {
            addCriterion("CM_REGISTER_ADDRESS is null");
            return (Criteria) this;
        }

        public Criteria andCmRegisterAddressIsNotNull() {
            addCriterion("CM_REGISTER_ADDRESS is not null");
            return (Criteria) this;
        }

        public Criteria andCmRegisterAddressEqualTo(String value) {
            addCriterion("CM_REGISTER_ADDRESS =", value, "cmRegisterAddress");
            return (Criteria) this;
        }

        public Criteria andCmRegisterAddressNotEqualTo(String value) {
            addCriterion("CM_REGISTER_ADDRESS <>", value, "cmRegisterAddress");
            return (Criteria) this;
        }

        public Criteria andCmRegisterAddressGreaterThan(String value) {
            addCriterion("CM_REGISTER_ADDRESS >", value, "cmRegisterAddress");
            return (Criteria) this;
        }

        public Criteria andCmRegisterAddressGreaterThanOrEqualTo(String value) {
            addCriterion("CM_REGISTER_ADDRESS >=", value, "cmRegisterAddress");
            return (Criteria) this;
        }

        public Criteria andCmRegisterAddressLessThan(String value) {
            addCriterion("CM_REGISTER_ADDRESS <", value, "cmRegisterAddress");
            return (Criteria) this;
        }

        public Criteria andCmRegisterAddressLessThanOrEqualTo(String value) {
            addCriterion("CM_REGISTER_ADDRESS <=", value, "cmRegisterAddress");
            return (Criteria) this;
        }

        public Criteria andCmRegisterAddressLike(String value) {
            addCriterion("CM_REGISTER_ADDRESS like", value, "cmRegisterAddress");
            return (Criteria) this;
        }

        public Criteria andCmRegisterAddressNotLike(String value) {
            addCriterion("CM_REGISTER_ADDRESS not like", value, "cmRegisterAddress");
            return (Criteria) this;
        }

        public Criteria andCmRegisterAddressIn(List<String> values) {
            addCriterion("CM_REGISTER_ADDRESS in", values, "cmRegisterAddress");
            return (Criteria) this;
        }

        public Criteria andCmRegisterAddressNotIn(List<String> values) {
            addCriterion("CM_REGISTER_ADDRESS not in", values, "cmRegisterAddress");
            return (Criteria) this;
        }

        public Criteria andCmRegisterAddressBetween(String value1, String value2) {
            addCriterion("CM_REGISTER_ADDRESS between", value1, value2, "cmRegisterAddress");
            return (Criteria) this;
        }

        public Criteria andCmRegisterAddressNotBetween(String value1, String value2) {
            addCriterion("CM_REGISTER_ADDRESS not between", value1, value2, "cmRegisterAddress");
            return (Criteria) this;
        }

        public Criteria andCmCompanyNoIsNull() {
            addCriterion("CM_COMPANY_NO is null");
            return (Criteria) this;
        }

        public Criteria andCmCompanyNoIsNotNull() {
            addCriterion("CM_COMPANY_NO is not null");
            return (Criteria) this;
        }

        public Criteria andCmCompanyNoEqualTo(String value) {
            addCriterion("CM_COMPANY_NO =", value, "cmCompanyNo");
            return (Criteria) this;
        }

        public Criteria andCmCompanyNoNotEqualTo(String value) {
            addCriterion("CM_COMPANY_NO <>", value, "cmCompanyNo");
            return (Criteria) this;
        }

        public Criteria andCmCompanyNoGreaterThan(String value) {
            addCriterion("CM_COMPANY_NO >", value, "cmCompanyNo");
            return (Criteria) this;
        }

        public Criteria andCmCompanyNoGreaterThanOrEqualTo(String value) {
            addCriterion("CM_COMPANY_NO >=", value, "cmCompanyNo");
            return (Criteria) this;
        }

        public Criteria andCmCompanyNoLessThan(String value) {
            addCriterion("CM_COMPANY_NO <", value, "cmCompanyNo");
            return (Criteria) this;
        }

        public Criteria andCmCompanyNoLessThanOrEqualTo(String value) {
            addCriterion("CM_COMPANY_NO <=", value, "cmCompanyNo");
            return (Criteria) this;
        }

        public Criteria andCmCompanyNoLike(String value) {
            addCriterion("CM_COMPANY_NO like", value, "cmCompanyNo");
            return (Criteria) this;
        }

        public Criteria andCmCompanyNoNotLike(String value) {
            addCriterion("CM_COMPANY_NO not like", value, "cmCompanyNo");
            return (Criteria) this;
        }

        public Criteria andCmCompanyNoIn(List<String> values) {
            addCriterion("CM_COMPANY_NO in", values, "cmCompanyNo");
            return (Criteria) this;
        }

        public Criteria andCmCompanyNoNotIn(List<String> values) {
            addCriterion("CM_COMPANY_NO not in", values, "cmCompanyNo");
            return (Criteria) this;
        }

        public Criteria andCmCompanyNoBetween(String value1, String value2) {
            addCriterion("CM_COMPANY_NO between", value1, value2, "cmCompanyNo");
            return (Criteria) this;
        }

        public Criteria andCmCompanyNoNotBetween(String value1, String value2) {
            addCriterion("CM_COMPANY_NO not between", value1, value2, "cmCompanyNo");
            return (Criteria) this;
        }

        public Criteria andCmLegalNameIsNull() {
            addCriterion("CM_LEGAL_NAME is null");
            return (Criteria) this;
        }

        public Criteria andCmLegalNameIsNotNull() {
            addCriterion("CM_LEGAL_NAME is not null");
            return (Criteria) this;
        }

        public Criteria andCmLegalNameEqualTo(String value) {
            addCriterion("CM_LEGAL_NAME =", value, "cmLegalName");
            return (Criteria) this;
        }

        public Criteria andCmLegalNameNotEqualTo(String value) {
            addCriterion("CM_LEGAL_NAME <>", value, "cmLegalName");
            return (Criteria) this;
        }

        public Criteria andCmLegalNameGreaterThan(String value) {
            addCriterion("CM_LEGAL_NAME >", value, "cmLegalName");
            return (Criteria) this;
        }

        public Criteria andCmLegalNameGreaterThanOrEqualTo(String value) {
            addCriterion("CM_LEGAL_NAME >=", value, "cmLegalName");
            return (Criteria) this;
        }

        public Criteria andCmLegalNameLessThan(String value) {
            addCriterion("CM_LEGAL_NAME <", value, "cmLegalName");
            return (Criteria) this;
        }

        public Criteria andCmLegalNameLessThanOrEqualTo(String value) {
            addCriterion("CM_LEGAL_NAME <=", value, "cmLegalName");
            return (Criteria) this;
        }

        public Criteria andCmLegalNameLike(String value) {
            addCriterion("CM_LEGAL_NAME like", value, "cmLegalName");
            return (Criteria) this;
        }

        public Criteria andCmLegalNameNotLike(String value) {
            addCriterion("CM_LEGAL_NAME not like", value, "cmLegalName");
            return (Criteria) this;
        }

        public Criteria andCmLegalNameIn(List<String> values) {
            addCriterion("CM_LEGAL_NAME in", values, "cmLegalName");
            return (Criteria) this;
        }

        public Criteria andCmLegalNameNotIn(List<String> values) {
            addCriterion("CM_LEGAL_NAME not in", values, "cmLegalName");
            return (Criteria) this;
        }

        public Criteria andCmLegalNameBetween(String value1, String value2) {
            addCriterion("CM_LEGAL_NAME between", value1, value2, "cmLegalName");
            return (Criteria) this;
        }

        public Criteria andCmLegalNameNotBetween(String value1, String value2) {
            addCriterion("CM_LEGAL_NAME not between", value1, value2, "cmLegalName");
            return (Criteria) this;
        }

        public Criteria andCmLegalPhoneIsNull() {
            addCriterion("CM_LEGAL_PHONE is null");
            return (Criteria) this;
        }

        public Criteria andCmLegalPhoneIsNotNull() {
            addCriterion("CM_LEGAL_PHONE is not null");
            return (Criteria) this;
        }

        public Criteria andCmLegalPhoneEqualTo(String value) {
            addCriterion("CM_LEGAL_PHONE =", value, "cmLegalPhone");
            return (Criteria) this;
        }

        public Criteria andCmLegalPhoneNotEqualTo(String value) {
            addCriterion("CM_LEGAL_PHONE <>", value, "cmLegalPhone");
            return (Criteria) this;
        }

        public Criteria andCmLegalPhoneGreaterThan(String value) {
            addCriterion("CM_LEGAL_PHONE >", value, "cmLegalPhone");
            return (Criteria) this;
        }

        public Criteria andCmLegalPhoneGreaterThanOrEqualTo(String value) {
            addCriterion("CM_LEGAL_PHONE >=", value, "cmLegalPhone");
            return (Criteria) this;
        }

        public Criteria andCmLegalPhoneLessThan(String value) {
            addCriterion("CM_LEGAL_PHONE <", value, "cmLegalPhone");
            return (Criteria) this;
        }

        public Criteria andCmLegalPhoneLessThanOrEqualTo(String value) {
            addCriterion("CM_LEGAL_PHONE <=", value, "cmLegalPhone");
            return (Criteria) this;
        }

        public Criteria andCmLegalPhoneLike(String value) {
            addCriterion("CM_LEGAL_PHONE like", value, "cmLegalPhone");
            return (Criteria) this;
        }

        public Criteria andCmLegalPhoneNotLike(String value) {
            addCriterion("CM_LEGAL_PHONE not like", value, "cmLegalPhone");
            return (Criteria) this;
        }

        public Criteria andCmLegalPhoneIn(List<String> values) {
            addCriterion("CM_LEGAL_PHONE in", values, "cmLegalPhone");
            return (Criteria) this;
        }

        public Criteria andCmLegalPhoneNotIn(List<String> values) {
            addCriterion("CM_LEGAL_PHONE not in", values, "cmLegalPhone");
            return (Criteria) this;
        }

        public Criteria andCmLegalPhoneBetween(String value1, String value2) {
            addCriterion("CM_LEGAL_PHONE between", value1, value2, "cmLegalPhone");
            return (Criteria) this;
        }

        public Criteria andCmLegalPhoneNotBetween(String value1, String value2) {
            addCriterion("CM_LEGAL_PHONE not between", value1, value2, "cmLegalPhone");
            return (Criteria) this;
        }

        public Criteria andCmLegalEmailIsNull() {
            addCriterion("CM_LEGAL_EMAIL is null");
            return (Criteria) this;
        }

        public Criteria andCmLegalEmailIsNotNull() {
            addCriterion("CM_LEGAL_EMAIL is not null");
            return (Criteria) this;
        }

        public Criteria andCmLegalEmailEqualTo(String value) {
            addCriterion("CM_LEGAL_EMAIL =", value, "cmLegalEmail");
            return (Criteria) this;
        }

        public Criteria andCmLegalEmailNotEqualTo(String value) {
            addCriterion("CM_LEGAL_EMAIL <>", value, "cmLegalEmail");
            return (Criteria) this;
        }

        public Criteria andCmLegalEmailGreaterThan(String value) {
            addCriterion("CM_LEGAL_EMAIL >", value, "cmLegalEmail");
            return (Criteria) this;
        }

        public Criteria andCmLegalEmailGreaterThanOrEqualTo(String value) {
            addCriterion("CM_LEGAL_EMAIL >=", value, "cmLegalEmail");
            return (Criteria) this;
        }

        public Criteria andCmLegalEmailLessThan(String value) {
            addCriterion("CM_LEGAL_EMAIL <", value, "cmLegalEmail");
            return (Criteria) this;
        }

        public Criteria andCmLegalEmailLessThanOrEqualTo(String value) {
            addCriterion("CM_LEGAL_EMAIL <=", value, "cmLegalEmail");
            return (Criteria) this;
        }

        public Criteria andCmLegalEmailLike(String value) {
            addCriterion("CM_LEGAL_EMAIL like", value, "cmLegalEmail");
            return (Criteria) this;
        }

        public Criteria andCmLegalEmailNotLike(String value) {
            addCriterion("CM_LEGAL_EMAIL not like", value, "cmLegalEmail");
            return (Criteria) this;
        }

        public Criteria andCmLegalEmailIn(List<String> values) {
            addCriterion("CM_LEGAL_EMAIL in", values, "cmLegalEmail");
            return (Criteria) this;
        }

        public Criteria andCmLegalEmailNotIn(List<String> values) {
            addCriterion("CM_LEGAL_EMAIL not in", values, "cmLegalEmail");
            return (Criteria) this;
        }

        public Criteria andCmLegalEmailBetween(String value1, String value2) {
            addCriterion("CM_LEGAL_EMAIL between", value1, value2, "cmLegalEmail");
            return (Criteria) this;
        }

        public Criteria andCmLegalEmailNotBetween(String value1, String value2) {
            addCriterion("CM_LEGAL_EMAIL not between", value1, value2, "cmLegalEmail");
            return (Criteria) this;
        }

        public Criteria andCmLinkNameIsNull() {
            addCriterion("CM_LINK_NAME is null");
            return (Criteria) this;
        }

        public Criteria andCmLinkNameIsNotNull() {
            addCriterion("CM_LINK_NAME is not null");
            return (Criteria) this;
        }

        public Criteria andCmLinkNameEqualTo(String value) {
            addCriterion("CM_LINK_NAME =", value, "cmLinkName");
            return (Criteria) this;
        }

        public Criteria andCmLinkNameNotEqualTo(String value) {
            addCriterion("CM_LINK_NAME <>", value, "cmLinkName");
            return (Criteria) this;
        }

        public Criteria andCmLinkNameGreaterThan(String value) {
            addCriterion("CM_LINK_NAME >", value, "cmLinkName");
            return (Criteria) this;
        }

        public Criteria andCmLinkNameGreaterThanOrEqualTo(String value) {
            addCriterion("CM_LINK_NAME >=", value, "cmLinkName");
            return (Criteria) this;
        }

        public Criteria andCmLinkNameLessThan(String value) {
            addCriterion("CM_LINK_NAME <", value, "cmLinkName");
            return (Criteria) this;
        }

        public Criteria andCmLinkNameLessThanOrEqualTo(String value) {
            addCriterion("CM_LINK_NAME <=", value, "cmLinkName");
            return (Criteria) this;
        }

        public Criteria andCmLinkNameLike(String value) {
            addCriterion("CM_LINK_NAME like", value, "cmLinkName");
            return (Criteria) this;
        }

        public Criteria andCmLinkNameNotLike(String value) {
            addCriterion("CM_LINK_NAME not like", value, "cmLinkName");
            return (Criteria) this;
        }

        public Criteria andCmLinkNameIn(List<String> values) {
            addCriterion("CM_LINK_NAME in", values, "cmLinkName");
            return (Criteria) this;
        }

        public Criteria andCmLinkNameNotIn(List<String> values) {
            addCriterion("CM_LINK_NAME not in", values, "cmLinkName");
            return (Criteria) this;
        }

        public Criteria andCmLinkNameBetween(String value1, String value2) {
            addCriterion("CM_LINK_NAME between", value1, value2, "cmLinkName");
            return (Criteria) this;
        }

        public Criteria andCmLinkNameNotBetween(String value1, String value2) {
            addCriterion("CM_LINK_NAME not between", value1, value2, "cmLinkName");
            return (Criteria) this;
        }

        public Criteria andCmLinkPhoneIsNull() {
            addCriterion("CM_LINK_PHONE is null");
            return (Criteria) this;
        }

        public Criteria andCmLinkPhoneIsNotNull() {
            addCriterion("CM_LINK_PHONE is not null");
            return (Criteria) this;
        }

        public Criteria andCmLinkPhoneEqualTo(String value) {
            addCriterion("CM_LINK_PHONE =", value, "cmLinkPhone");
            return (Criteria) this;
        }

        public Criteria andCmLinkPhoneNotEqualTo(String value) {
            addCriterion("CM_LINK_PHONE <>", value, "cmLinkPhone");
            return (Criteria) this;
        }

        public Criteria andCmLinkPhoneGreaterThan(String value) {
            addCriterion("CM_LINK_PHONE >", value, "cmLinkPhone");
            return (Criteria) this;
        }

        public Criteria andCmLinkPhoneGreaterThanOrEqualTo(String value) {
            addCriterion("CM_LINK_PHONE >=", value, "cmLinkPhone");
            return (Criteria) this;
        }

        public Criteria andCmLinkPhoneLessThan(String value) {
            addCriterion("CM_LINK_PHONE <", value, "cmLinkPhone");
            return (Criteria) this;
        }

        public Criteria andCmLinkPhoneLessThanOrEqualTo(String value) {
            addCriterion("CM_LINK_PHONE <=", value, "cmLinkPhone");
            return (Criteria) this;
        }

        public Criteria andCmLinkPhoneLike(String value) {
            addCriterion("CM_LINK_PHONE like", value, "cmLinkPhone");
            return (Criteria) this;
        }

        public Criteria andCmLinkPhoneNotLike(String value) {
            addCriterion("CM_LINK_PHONE not like", value, "cmLinkPhone");
            return (Criteria) this;
        }

        public Criteria andCmLinkPhoneIn(List<String> values) {
            addCriterion("CM_LINK_PHONE in", values, "cmLinkPhone");
            return (Criteria) this;
        }

        public Criteria andCmLinkPhoneNotIn(List<String> values) {
            addCriterion("CM_LINK_PHONE not in", values, "cmLinkPhone");
            return (Criteria) this;
        }

        public Criteria andCmLinkPhoneBetween(String value1, String value2) {
            addCriterion("CM_LINK_PHONE between", value1, value2, "cmLinkPhone");
            return (Criteria) this;
        }

        public Criteria andCmLinkPhoneNotBetween(String value1, String value2) {
            addCriterion("CM_LINK_PHONE not between", value1, value2, "cmLinkPhone");
            return (Criteria) this;
        }

        public Criteria andCmLinkEmailIsNull() {
            addCriterion("CM_LINK_EMAIL is null");
            return (Criteria) this;
        }

        public Criteria andCmLinkEmailIsNotNull() {
            addCriterion("CM_LINK_EMAIL is not null");
            return (Criteria) this;
        }

        public Criteria andCmLinkEmailEqualTo(String value) {
            addCriterion("CM_LINK_EMAIL =", value, "cmLinkEmail");
            return (Criteria) this;
        }

        public Criteria andCmLinkEmailNotEqualTo(String value) {
            addCriterion("CM_LINK_EMAIL <>", value, "cmLinkEmail");
            return (Criteria) this;
        }

        public Criteria andCmLinkEmailGreaterThan(String value) {
            addCriterion("CM_LINK_EMAIL >", value, "cmLinkEmail");
            return (Criteria) this;
        }

        public Criteria andCmLinkEmailGreaterThanOrEqualTo(String value) {
            addCriterion("CM_LINK_EMAIL >=", value, "cmLinkEmail");
            return (Criteria) this;
        }

        public Criteria andCmLinkEmailLessThan(String value) {
            addCriterion("CM_LINK_EMAIL <", value, "cmLinkEmail");
            return (Criteria) this;
        }

        public Criteria andCmLinkEmailLessThanOrEqualTo(String value) {
            addCriterion("CM_LINK_EMAIL <=", value, "cmLinkEmail");
            return (Criteria) this;
        }

        public Criteria andCmLinkEmailLike(String value) {
            addCriterion("CM_LINK_EMAIL like", value, "cmLinkEmail");
            return (Criteria) this;
        }

        public Criteria andCmLinkEmailNotLike(String value) {
            addCriterion("CM_LINK_EMAIL not like", value, "cmLinkEmail");
            return (Criteria) this;
        }

        public Criteria andCmLinkEmailIn(List<String> values) {
            addCriterion("CM_LINK_EMAIL in", values, "cmLinkEmail");
            return (Criteria) this;
        }

        public Criteria andCmLinkEmailNotIn(List<String> values) {
            addCriterion("CM_LINK_EMAIL not in", values, "cmLinkEmail");
            return (Criteria) this;
        }

        public Criteria andCmLinkEmailBetween(String value1, String value2) {
            addCriterion("CM_LINK_EMAIL between", value1, value2, "cmLinkEmail");
            return (Criteria) this;
        }

        public Criteria andCmLinkEmailNotBetween(String value1, String value2) {
            addCriterion("CM_LINK_EMAIL not between", value1, value2, "cmLinkEmail");
            return (Criteria) this;
        }

        public Criteria andVipFlagIsNull() {
            addCriterion("VIP_FLAG is null");
            return (Criteria) this;
        }

        public Criteria andVipFlagIsNotNull() {
            addCriterion("VIP_FLAG is not null");
            return (Criteria) this;
        }

        public Criteria andVipFlagEqualTo(String value) {
            addCriterion("VIP_FLAG =", value, "vipFlag");
            return (Criteria) this;
        }

        public Criteria andVipFlagNotEqualTo(String value) {
            addCriterion("VIP_FLAG <>", value, "vipFlag");
            return (Criteria) this;
        }

        public Criteria andVipFlagGreaterThan(String value) {
            addCriterion("VIP_FLAG >", value, "vipFlag");
            return (Criteria) this;
        }

        public Criteria andVipFlagGreaterThanOrEqualTo(String value) {
            addCriterion("VIP_FLAG >=", value, "vipFlag");
            return (Criteria) this;
        }

        public Criteria andVipFlagLessThan(String value) {
            addCriterion("VIP_FLAG <", value, "vipFlag");
            return (Criteria) this;
        }

        public Criteria andVipFlagLessThanOrEqualTo(String value) {
            addCriterion("VIP_FLAG <=", value, "vipFlag");
            return (Criteria) this;
        }

        public Criteria andVipFlagLike(String value) {
            addCriterion("VIP_FLAG like", value, "vipFlag");
            return (Criteria) this;
        }

        public Criteria andVipFlagNotLike(String value) {
            addCriterion("VIP_FLAG not like", value, "vipFlag");
            return (Criteria) this;
        }

        public Criteria andVipFlagIn(List<String> values) {
            addCriterion("VIP_FLAG in", values, "vipFlag");
            return (Criteria) this;
        }

        public Criteria andVipFlagNotIn(List<String> values) {
            addCriterion("VIP_FLAG not in", values, "vipFlag");
            return (Criteria) this;
        }

        public Criteria andVipFlagBetween(String value1, String value2) {
            addCriterion("VIP_FLAG between", value1, value2, "vipFlag");
            return (Criteria) this;
        }

        public Criteria andVipFlagNotBetween(String value1, String value2) {
            addCriterion("VIP_FLAG not between", value1, value2, "vipFlag");
            return (Criteria) this;
        }

        public Criteria andVipNoIsNull() {
            addCriterion("VIP_NO is null");
            return (Criteria) this;
        }

        public Criteria andVipNoIsNotNull() {
            addCriterion("VIP_NO is not null");
            return (Criteria) this;
        }

        public Criteria andVipNoEqualTo(String value) {
            addCriterion("VIP_NO =", value, "vipNo");
            return (Criteria) this;
        }

        public Criteria andVipNoNotEqualTo(String value) {
            addCriterion("VIP_NO <>", value, "vipNo");
            return (Criteria) this;
        }

        public Criteria andVipNoGreaterThan(String value) {
            addCriterion("VIP_NO >", value, "vipNo");
            return (Criteria) this;
        }

        public Criteria andVipNoGreaterThanOrEqualTo(String value) {
            addCriterion("VIP_NO >=", value, "vipNo");
            return (Criteria) this;
        }

        public Criteria andVipNoLessThan(String value) {
            addCriterion("VIP_NO <", value, "vipNo");
            return (Criteria) this;
        }

        public Criteria andVipNoLessThanOrEqualTo(String value) {
            addCriterion("VIP_NO <=", value, "vipNo");
            return (Criteria) this;
        }

        public Criteria andVipNoLike(String value) {
            addCriterion("VIP_NO like", value, "vipNo");
            return (Criteria) this;
        }

        public Criteria andVipNoNotLike(String value) {
            addCriterion("VIP_NO not like", value, "vipNo");
            return (Criteria) this;
        }

        public Criteria andVipNoIn(List<String> values) {
            addCriterion("VIP_NO in", values, "vipNo");
            return (Criteria) this;
        }

        public Criteria andVipNoNotIn(List<String> values) {
            addCriterion("VIP_NO not in", values, "vipNo");
            return (Criteria) this;
        }

        public Criteria andVipNoBetween(String value1, String value2) {
            addCriterion("VIP_NO between", value1, value2, "vipNo");
            return (Criteria) this;
        }

        public Criteria andVipNoNotBetween(String value1, String value2) {
            addCriterion("VIP_NO not between", value1, value2, "vipNo");
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