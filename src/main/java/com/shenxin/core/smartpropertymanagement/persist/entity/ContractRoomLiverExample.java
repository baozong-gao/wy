package com.shenxin.core.smartpropertymanagement.persist.entity;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class ContractRoomLiverExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ContractRoomLiverExample() {
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

        public Criteria andContractIdIsNull() {
            addCriterion("CONTRACT_ID is null");
            return (Criteria) this;
        }

        public Criteria andContractIdIsNotNull() {
            addCriterion("CONTRACT_ID is not null");
            return (Criteria) this;
        }

        public Criteria andContractIdEqualTo(BigDecimal value) {
            addCriterion("CONTRACT_ID =", value, "contractId");
            return (Criteria) this;
        }

        public Criteria andContractIdNotEqualTo(BigDecimal value) {
            addCriterion("CONTRACT_ID <>", value, "contractId");
            return (Criteria) this;
        }

        public Criteria andContractIdGreaterThan(BigDecimal value) {
            addCriterion("CONTRACT_ID >", value, "contractId");
            return (Criteria) this;
        }

        public Criteria andContractIdGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("CONTRACT_ID >=", value, "contractId");
            return (Criteria) this;
        }

        public Criteria andContractIdLessThan(BigDecimal value) {
            addCriterion("CONTRACT_ID <", value, "contractId");
            return (Criteria) this;
        }

        public Criteria andContractIdLessThanOrEqualTo(BigDecimal value) {
            addCriterion("CONTRACT_ID <=", value, "contractId");
            return (Criteria) this;
        }

        public Criteria andContractIdIn(List<BigDecimal> values) {
            addCriterion("CONTRACT_ID in", values, "contractId");
            return (Criteria) this;
        }

        public Criteria andContractIdNotIn(List<BigDecimal> values) {
            addCriterion("CONTRACT_ID not in", values, "contractId");
            return (Criteria) this;
        }

        public Criteria andContractIdBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("CONTRACT_ID between", value1, value2, "contractId");
            return (Criteria) this;
        }

        public Criteria andContractIdNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("CONTRACT_ID not between", value1, value2, "contractId");
            return (Criteria) this;
        }

        public Criteria andRoomIdIsNull() {
            addCriterion("ROOM_ID is null");
            return (Criteria) this;
        }

        public Criteria andRoomIdIsNotNull() {
            addCriterion("ROOM_ID is not null");
            return (Criteria) this;
        }

        public Criteria andRoomIdEqualTo(BigDecimal value) {
            addCriterion("ROOM_ID =", value, "roomId");
            return (Criteria) this;
        }

        public Criteria andRoomIdNotEqualTo(BigDecimal value) {
            addCriterion("ROOM_ID <>", value, "roomId");
            return (Criteria) this;
        }

        public Criteria andRoomIdGreaterThan(BigDecimal value) {
            addCriterion("ROOM_ID >", value, "roomId");
            return (Criteria) this;
        }

        public Criteria andRoomIdGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("ROOM_ID >=", value, "roomId");
            return (Criteria) this;
        }

        public Criteria andRoomIdLessThan(BigDecimal value) {
            addCriterion("ROOM_ID <", value, "roomId");
            return (Criteria) this;
        }

        public Criteria andRoomIdLessThanOrEqualTo(BigDecimal value) {
            addCriterion("ROOM_ID <=", value, "roomId");
            return (Criteria) this;
        }

        public Criteria andRoomIdIn(List<BigDecimal> values) {
            addCriterion("ROOM_ID in", values, "roomId");
            return (Criteria) this;
        }

        public Criteria andRoomIdNotIn(List<BigDecimal> values) {
            addCriterion("ROOM_ID not in", values, "roomId");
            return (Criteria) this;
        }

        public Criteria andRoomIdBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("ROOM_ID between", value1, value2, "roomId");
            return (Criteria) this;
        }

        public Criteria andRoomIdNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("ROOM_ID not between", value1, value2, "roomId");
            return (Criteria) this;
        }

        public Criteria andLiverNameIsNull() {
            addCriterion("LIVER_NAME is null");
            return (Criteria) this;
        }

        public Criteria andLiverNameIsNotNull() {
            addCriterion("LIVER_NAME is not null");
            return (Criteria) this;
        }

        public Criteria andLiverNameEqualTo(String value) {
            addCriterion("LIVER_NAME =", value, "liverName");
            return (Criteria) this;
        }

        public Criteria andLiverNameNotEqualTo(String value) {
            addCriterion("LIVER_NAME <>", value, "liverName");
            return (Criteria) this;
        }

        public Criteria andLiverNameGreaterThan(String value) {
            addCriterion("LIVER_NAME >", value, "liverName");
            return (Criteria) this;
        }

        public Criteria andLiverNameGreaterThanOrEqualTo(String value) {
            addCriterion("LIVER_NAME >=", value, "liverName");
            return (Criteria) this;
        }

        public Criteria andLiverNameLessThan(String value) {
            addCriterion("LIVER_NAME <", value, "liverName");
            return (Criteria) this;
        }

        public Criteria andLiverNameLessThanOrEqualTo(String value) {
            addCriterion("LIVER_NAME <=", value, "liverName");
            return (Criteria) this;
        }

        public Criteria andLiverNameLike(String value) {
            addCriterion("LIVER_NAME like", value, "liverName");
            return (Criteria) this;
        }

        public Criteria andLiverNameNotLike(String value) {
            addCriterion("LIVER_NAME not like", value, "liverName");
            return (Criteria) this;
        }

        public Criteria andLiverNameIn(List<String> values) {
            addCriterion("LIVER_NAME in", values, "liverName");
            return (Criteria) this;
        }

        public Criteria andLiverNameNotIn(List<String> values) {
            addCriterion("LIVER_NAME not in", values, "liverName");
            return (Criteria) this;
        }

        public Criteria andLiverNameBetween(String value1, String value2) {
            addCriterion("LIVER_NAME between", value1, value2, "liverName");
            return (Criteria) this;
        }

        public Criteria andLiverNameNotBetween(String value1, String value2) {
            addCriterion("LIVER_NAME not between", value1, value2, "liverName");
            return (Criteria) this;
        }

        public Criteria andLiverSexIsNull() {
            addCriterion("LIVER_SEX is null");
            return (Criteria) this;
        }

        public Criteria andLiverSexIsNotNull() {
            addCriterion("LIVER_SEX is not null");
            return (Criteria) this;
        }

        public Criteria andLiverSexEqualTo(String value) {
            addCriterion("LIVER_SEX =", value, "liverSex");
            return (Criteria) this;
        }

        public Criteria andLiverSexNotEqualTo(String value) {
            addCriterion("LIVER_SEX <>", value, "liverSex");
            return (Criteria) this;
        }

        public Criteria andLiverSexGreaterThan(String value) {
            addCriterion("LIVER_SEX >", value, "liverSex");
            return (Criteria) this;
        }

        public Criteria andLiverSexGreaterThanOrEqualTo(String value) {
            addCriterion("LIVER_SEX >=", value, "liverSex");
            return (Criteria) this;
        }

        public Criteria andLiverSexLessThan(String value) {
            addCriterion("LIVER_SEX <", value, "liverSex");
            return (Criteria) this;
        }

        public Criteria andLiverSexLessThanOrEqualTo(String value) {
            addCriterion("LIVER_SEX <=", value, "liverSex");
            return (Criteria) this;
        }

        public Criteria andLiverSexLike(String value) {
            addCriterion("LIVER_SEX like", value, "liverSex");
            return (Criteria) this;
        }

        public Criteria andLiverSexNotLike(String value) {
            addCriterion("LIVER_SEX not like", value, "liverSex");
            return (Criteria) this;
        }

        public Criteria andLiverSexIn(List<String> values) {
            addCriterion("LIVER_SEX in", values, "liverSex");
            return (Criteria) this;
        }

        public Criteria andLiverSexNotIn(List<String> values) {
            addCriterion("LIVER_SEX not in", values, "liverSex");
            return (Criteria) this;
        }

        public Criteria andLiverSexBetween(String value1, String value2) {
            addCriterion("LIVER_SEX between", value1, value2, "liverSex");
            return (Criteria) this;
        }

        public Criteria andLiverSexNotBetween(String value1, String value2) {
            addCriterion("LIVER_SEX not between", value1, value2, "liverSex");
            return (Criteria) this;
        }

        public Criteria andLiverAgeIsNull() {
            addCriterion("LIVER_AGE is null");
            return (Criteria) this;
        }

        public Criteria andLiverAgeIsNotNull() {
            addCriterion("LIVER_AGE is not null");
            return (Criteria) this;
        }

        public Criteria andLiverAgeEqualTo(BigDecimal value) {
            addCriterion("LIVER_AGE =", value, "liverAge");
            return (Criteria) this;
        }

        public Criteria andLiverAgeNotEqualTo(BigDecimal value) {
            addCriterion("LIVER_AGE <>", value, "liverAge");
            return (Criteria) this;
        }

        public Criteria andLiverAgeGreaterThan(BigDecimal value) {
            addCriterion("LIVER_AGE >", value, "liverAge");
            return (Criteria) this;
        }

        public Criteria andLiverAgeGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("LIVER_AGE >=", value, "liverAge");
            return (Criteria) this;
        }

        public Criteria andLiverAgeLessThan(BigDecimal value) {
            addCriterion("LIVER_AGE <", value, "liverAge");
            return (Criteria) this;
        }

        public Criteria andLiverAgeLessThanOrEqualTo(BigDecimal value) {
            addCriterion("LIVER_AGE <=", value, "liverAge");
            return (Criteria) this;
        }

        public Criteria andLiverAgeIn(List<BigDecimal> values) {
            addCriterion("LIVER_AGE in", values, "liverAge");
            return (Criteria) this;
        }

        public Criteria andLiverAgeNotIn(List<BigDecimal> values) {
            addCriterion("LIVER_AGE not in", values, "liverAge");
            return (Criteria) this;
        }

        public Criteria andLiverAgeBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("LIVER_AGE between", value1, value2, "liverAge");
            return (Criteria) this;
        }

        public Criteria andLiverAgeNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("LIVER_AGE not between", value1, value2, "liverAge");
            return (Criteria) this;
        }

        public Criteria andLiverMobileIsNull() {
            addCriterion("LIVER_MOBILE is null");
            return (Criteria) this;
        }

        public Criteria andLiverMobileIsNotNull() {
            addCriterion("LIVER_MOBILE is not null");
            return (Criteria) this;
        }

        public Criteria andLiverMobileEqualTo(String value) {
            addCriterion("LIVER_MOBILE =", value, "liverMobile");
            return (Criteria) this;
        }

        public Criteria andLiverMobileNotEqualTo(String value) {
            addCriterion("LIVER_MOBILE <>", value, "liverMobile");
            return (Criteria) this;
        }

        public Criteria andLiverMobileGreaterThan(String value) {
            addCriterion("LIVER_MOBILE >", value, "liverMobile");
            return (Criteria) this;
        }

        public Criteria andLiverMobileGreaterThanOrEqualTo(String value) {
            addCriterion("LIVER_MOBILE >=", value, "liverMobile");
            return (Criteria) this;
        }

        public Criteria andLiverMobileLessThan(String value) {
            addCriterion("LIVER_MOBILE <", value, "liverMobile");
            return (Criteria) this;
        }

        public Criteria andLiverMobileLessThanOrEqualTo(String value) {
            addCriterion("LIVER_MOBILE <=", value, "liverMobile");
            return (Criteria) this;
        }

        public Criteria andLiverMobileLike(String value) {
            addCriterion("LIVER_MOBILE like", value, "liverMobile");
            return (Criteria) this;
        }

        public Criteria andLiverMobileNotLike(String value) {
            addCriterion("LIVER_MOBILE not like", value, "liverMobile");
            return (Criteria) this;
        }

        public Criteria andLiverMobileIn(List<String> values) {
            addCriterion("LIVER_MOBILE in", values, "liverMobile");
            return (Criteria) this;
        }

        public Criteria andLiverMobileNotIn(List<String> values) {
            addCriterion("LIVER_MOBILE not in", values, "liverMobile");
            return (Criteria) this;
        }

        public Criteria andLiverMobileBetween(String value1, String value2) {
            addCriterion("LIVER_MOBILE between", value1, value2, "liverMobile");
            return (Criteria) this;
        }

        public Criteria andLiverMobileNotBetween(String value1, String value2) {
            addCriterion("LIVER_MOBILE not between", value1, value2, "liverMobile");
            return (Criteria) this;
        }

        public Criteria andLiverIdTypeIsNull() {
            addCriterion("LIVER_ID_TYPE is null");
            return (Criteria) this;
        }

        public Criteria andLiverIdTypeIsNotNull() {
            addCriterion("LIVER_ID_TYPE is not null");
            return (Criteria) this;
        }

        public Criteria andLiverIdTypeEqualTo(String value) {
            addCriterion("LIVER_ID_TYPE =", value, "liverIdType");
            return (Criteria) this;
        }

        public Criteria andLiverIdTypeNotEqualTo(String value) {
            addCriterion("LIVER_ID_TYPE <>", value, "liverIdType");
            return (Criteria) this;
        }

        public Criteria andLiverIdTypeGreaterThan(String value) {
            addCriterion("LIVER_ID_TYPE >", value, "liverIdType");
            return (Criteria) this;
        }

        public Criteria andLiverIdTypeGreaterThanOrEqualTo(String value) {
            addCriterion("LIVER_ID_TYPE >=", value, "liverIdType");
            return (Criteria) this;
        }

        public Criteria andLiverIdTypeLessThan(String value) {
            addCriterion("LIVER_ID_TYPE <", value, "liverIdType");
            return (Criteria) this;
        }

        public Criteria andLiverIdTypeLessThanOrEqualTo(String value) {
            addCriterion("LIVER_ID_TYPE <=", value, "liverIdType");
            return (Criteria) this;
        }

        public Criteria andLiverIdTypeLike(String value) {
            addCriterion("LIVER_ID_TYPE like", value, "liverIdType");
            return (Criteria) this;
        }

        public Criteria andLiverIdTypeNotLike(String value) {
            addCriterion("LIVER_ID_TYPE not like", value, "liverIdType");
            return (Criteria) this;
        }

        public Criteria andLiverIdTypeIn(List<String> values) {
            addCriterion("LIVER_ID_TYPE in", values, "liverIdType");
            return (Criteria) this;
        }

        public Criteria andLiverIdTypeNotIn(List<String> values) {
            addCriterion("LIVER_ID_TYPE not in", values, "liverIdType");
            return (Criteria) this;
        }

        public Criteria andLiverIdTypeBetween(String value1, String value2) {
            addCriterion("LIVER_ID_TYPE between", value1, value2, "liverIdType");
            return (Criteria) this;
        }

        public Criteria andLiverIdTypeNotBetween(String value1, String value2) {
            addCriterion("LIVER_ID_TYPE not between", value1, value2, "liverIdType");
            return (Criteria) this;
        }

        public Criteria andLiverIdNoIsNull() {
            addCriterion("LIVER_ID_NO is null");
            return (Criteria) this;
        }

        public Criteria andLiverIdNoIsNotNull() {
            addCriterion("LIVER_ID_NO is not null");
            return (Criteria) this;
        }

        public Criteria andLiverIdNoEqualTo(String value) {
            addCriterion("LIVER_ID_NO =", value, "liverIdNo");
            return (Criteria) this;
        }

        public Criteria andLiverIdNoNotEqualTo(String value) {
            addCriterion("LIVER_ID_NO <>", value, "liverIdNo");
            return (Criteria) this;
        }

        public Criteria andLiverIdNoGreaterThan(String value) {
            addCriterion("LIVER_ID_NO >", value, "liverIdNo");
            return (Criteria) this;
        }

        public Criteria andLiverIdNoGreaterThanOrEqualTo(String value) {
            addCriterion("LIVER_ID_NO >=", value, "liverIdNo");
            return (Criteria) this;
        }

        public Criteria andLiverIdNoLessThan(String value) {
            addCriterion("LIVER_ID_NO <", value, "liverIdNo");
            return (Criteria) this;
        }

        public Criteria andLiverIdNoLessThanOrEqualTo(String value) {
            addCriterion("LIVER_ID_NO <=", value, "liverIdNo");
            return (Criteria) this;
        }

        public Criteria andLiverIdNoLike(String value) {
            addCriterion("LIVER_ID_NO like", value, "liverIdNo");
            return (Criteria) this;
        }

        public Criteria andLiverIdNoNotLike(String value) {
            addCriterion("LIVER_ID_NO not like", value, "liverIdNo");
            return (Criteria) this;
        }

        public Criteria andLiverIdNoIn(List<String> values) {
            addCriterion("LIVER_ID_NO in", values, "liverIdNo");
            return (Criteria) this;
        }

        public Criteria andLiverIdNoNotIn(List<String> values) {
            addCriterion("LIVER_ID_NO not in", values, "liverIdNo");
            return (Criteria) this;
        }

        public Criteria andLiverIdNoBetween(String value1, String value2) {
            addCriterion("LIVER_ID_NO between", value1, value2, "liverIdNo");
            return (Criteria) this;
        }

        public Criteria andLiverIdNoNotBetween(String value1, String value2) {
            addCriterion("LIVER_ID_NO not between", value1, value2, "liverIdNo");
            return (Criteria) this;
        }

        public Criteria andRelatedClientIdIsNull() {
            addCriterion("RELATED_CLIENT_ID is null");
            return (Criteria) this;
        }

        public Criteria andRelatedClientIdIsNotNull() {
            addCriterion("RELATED_CLIENT_ID is not null");
            return (Criteria) this;
        }

        public Criteria andRelatedClientIdEqualTo(BigDecimal value) {
            addCriterion("RELATED_CLIENT_ID =", value, "relatedClientId");
            return (Criteria) this;
        }

        public Criteria andRelatedClientIdNotEqualTo(BigDecimal value) {
            addCriterion("RELATED_CLIENT_ID <>", value, "relatedClientId");
            return (Criteria) this;
        }

        public Criteria andRelatedClientIdGreaterThan(BigDecimal value) {
            addCriterion("RELATED_CLIENT_ID >", value, "relatedClientId");
            return (Criteria) this;
        }

        public Criteria andRelatedClientIdGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("RELATED_CLIENT_ID >=", value, "relatedClientId");
            return (Criteria) this;
        }

        public Criteria andRelatedClientIdLessThan(BigDecimal value) {
            addCriterion("RELATED_CLIENT_ID <", value, "relatedClientId");
            return (Criteria) this;
        }

        public Criteria andRelatedClientIdLessThanOrEqualTo(BigDecimal value) {
            addCriterion("RELATED_CLIENT_ID <=", value, "relatedClientId");
            return (Criteria) this;
        }

        public Criteria andRelatedClientIdIn(List<BigDecimal> values) {
            addCriterion("RELATED_CLIENT_ID in", values, "relatedClientId");
            return (Criteria) this;
        }

        public Criteria andRelatedClientIdNotIn(List<BigDecimal> values) {
            addCriterion("RELATED_CLIENT_ID not in", values, "relatedClientId");
            return (Criteria) this;
        }

        public Criteria andRelatedClientIdBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("RELATED_CLIENT_ID between", value1, value2, "relatedClientId");
            return (Criteria) this;
        }

        public Criteria andRelatedClientIdNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("RELATED_CLIENT_ID not between", value1, value2, "relatedClientId");
            return (Criteria) this;
        }

        public Criteria andOwnerFlagIsNull() {
            addCriterion("OWNER_FLAG is null");
            return (Criteria) this;
        }

        public Criteria andOwnerFlagIsNotNull() {
            addCriterion("OWNER_FLAG is not null");
            return (Criteria) this;
        }

        public Criteria andOwnerFlagEqualTo(String value) {
            addCriterion("OWNER_FLAG =", value, "ownerFlag");
            return (Criteria) this;
        }

        public Criteria andOwnerFlagNotEqualTo(String value) {
            addCriterion("OWNER_FLAG <>", value, "ownerFlag");
            return (Criteria) this;
        }

        public Criteria andOwnerFlagGreaterThan(String value) {
            addCriterion("OWNER_FLAG >", value, "ownerFlag");
            return (Criteria) this;
        }

        public Criteria andOwnerFlagGreaterThanOrEqualTo(String value) {
            addCriterion("OWNER_FLAG >=", value, "ownerFlag");
            return (Criteria) this;
        }

        public Criteria andOwnerFlagLessThan(String value) {
            addCriterion("OWNER_FLAG <", value, "ownerFlag");
            return (Criteria) this;
        }

        public Criteria andOwnerFlagLessThanOrEqualTo(String value) {
            addCriterion("OWNER_FLAG <=", value, "ownerFlag");
            return (Criteria) this;
        }

        public Criteria andOwnerFlagLike(String value) {
            addCriterion("OWNER_FLAG like", value, "ownerFlag");
            return (Criteria) this;
        }

        public Criteria andOwnerFlagNotLike(String value) {
            addCriterion("OWNER_FLAG not like", value, "ownerFlag");
            return (Criteria) this;
        }

        public Criteria andOwnerFlagIn(List<String> values) {
            addCriterion("OWNER_FLAG in", values, "ownerFlag");
            return (Criteria) this;
        }

        public Criteria andOwnerFlagNotIn(List<String> values) {
            addCriterion("OWNER_FLAG not in", values, "ownerFlag");
            return (Criteria) this;
        }

        public Criteria andOwnerFlagBetween(String value1, String value2) {
            addCriterion("OWNER_FLAG between", value1, value2, "ownerFlag");
            return (Criteria) this;
        }

        public Criteria andOwnerFlagNotBetween(String value1, String value2) {
            addCriterion("OWNER_FLAG not between", value1, value2, "ownerFlag");
            return (Criteria) this;
        }

        public Criteria andRenterFlagIsNull() {
            addCriterion("RENTER_FLAG is null");
            return (Criteria) this;
        }

        public Criteria andRenterFlagIsNotNull() {
            addCriterion("RENTER_FLAG is not null");
            return (Criteria) this;
        }

        public Criteria andRenterFlagEqualTo(String value) {
            addCriterion("RENTER_FLAG =", value, "renterFlag");
            return (Criteria) this;
        }

        public Criteria andRenterFlagNotEqualTo(String value) {
            addCriterion("RENTER_FLAG <>", value, "renterFlag");
            return (Criteria) this;
        }

        public Criteria andRenterFlagGreaterThan(String value) {
            addCriterion("RENTER_FLAG >", value, "renterFlag");
            return (Criteria) this;
        }

        public Criteria andRenterFlagGreaterThanOrEqualTo(String value) {
            addCriterion("RENTER_FLAG >=", value, "renterFlag");
            return (Criteria) this;
        }

        public Criteria andRenterFlagLessThan(String value) {
            addCriterion("RENTER_FLAG <", value, "renterFlag");
            return (Criteria) this;
        }

        public Criteria andRenterFlagLessThanOrEqualTo(String value) {
            addCriterion("RENTER_FLAG <=", value, "renterFlag");
            return (Criteria) this;
        }

        public Criteria andRenterFlagLike(String value) {
            addCriterion("RENTER_FLAG like", value, "renterFlag");
            return (Criteria) this;
        }

        public Criteria andRenterFlagNotLike(String value) {
            addCriterion("RENTER_FLAG not like", value, "renterFlag");
            return (Criteria) this;
        }

        public Criteria andRenterFlagIn(List<String> values) {
            addCriterion("RENTER_FLAG in", values, "renterFlag");
            return (Criteria) this;
        }

        public Criteria andRenterFlagNotIn(List<String> values) {
            addCriterion("RENTER_FLAG not in", values, "renterFlag");
            return (Criteria) this;
        }

        public Criteria andRenterFlagBetween(String value1, String value2) {
            addCriterion("RENTER_FLAG between", value1, value2, "renterFlag");
            return (Criteria) this;
        }

        public Criteria andRenterFlagNotBetween(String value1, String value2) {
            addCriterion("RENTER_FLAG not between", value1, value2, "renterFlag");
            return (Criteria) this;
        }

        public Criteria andBillReceiverIsNull() {
            addCriterion("BILL_RECEIVER is null");
            return (Criteria) this;
        }

        public Criteria andBillReceiverIsNotNull() {
            addCriterion("BILL_RECEIVER is not null");
            return (Criteria) this;
        }

        public Criteria andBillReceiverEqualTo(String value) {
            addCriterion("BILL_RECEIVER =", value, "billReceiver");
            return (Criteria) this;
        }

        public Criteria andBillReceiverNotEqualTo(String value) {
            addCriterion("BILL_RECEIVER <>", value, "billReceiver");
            return (Criteria) this;
        }

        public Criteria andBillReceiverGreaterThan(String value) {
            addCriterion("BILL_RECEIVER >", value, "billReceiver");
            return (Criteria) this;
        }

        public Criteria andBillReceiverGreaterThanOrEqualTo(String value) {
            addCriterion("BILL_RECEIVER >=", value, "billReceiver");
            return (Criteria) this;
        }

        public Criteria andBillReceiverLessThan(String value) {
            addCriterion("BILL_RECEIVER <", value, "billReceiver");
            return (Criteria) this;
        }

        public Criteria andBillReceiverLessThanOrEqualTo(String value) {
            addCriterion("BILL_RECEIVER <=", value, "billReceiver");
            return (Criteria) this;
        }

        public Criteria andBillReceiverLike(String value) {
            addCriterion("BILL_RECEIVER like", value, "billReceiver");
            return (Criteria) this;
        }

        public Criteria andBillReceiverNotLike(String value) {
            addCriterion("BILL_RECEIVER not like", value, "billReceiver");
            return (Criteria) this;
        }

        public Criteria andBillReceiverIn(List<String> values) {
            addCriterion("BILL_RECEIVER in", values, "billReceiver");
            return (Criteria) this;
        }

        public Criteria andBillReceiverNotIn(List<String> values) {
            addCriterion("BILL_RECEIVER not in", values, "billReceiver");
            return (Criteria) this;
        }

        public Criteria andBillReceiverBetween(String value1, String value2) {
            addCriterion("BILL_RECEIVER between", value1, value2, "billReceiver");
            return (Criteria) this;
        }

        public Criteria andBillReceiverNotBetween(String value1, String value2) {
            addCriterion("BILL_RECEIVER not between", value1, value2, "billReceiver");
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