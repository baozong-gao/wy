package com.shenxin.core.smartpropertymanagement.persist.entity;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class ContractFeesInfoExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ContractFeesInfoExample() {
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

        public Criteria andBillsIdIsNull() {
            addCriterion("BILLS_ID is null");
            return (Criteria) this;
        }

        public Criteria andBillsIdIsNotNull() {
            addCriterion("BILLS_ID is not null");
            return (Criteria) this;
        }

        public Criteria andBillsIdEqualTo(BigDecimal value) {
            addCriterion("BILLS_ID =", value, "billsId");
            return (Criteria) this;
        }

        public Criteria andBillsIdNotEqualTo(BigDecimal value) {
            addCriterion("BILLS_ID <>", value, "billsId");
            return (Criteria) this;
        }

        public Criteria andBillsIdGreaterThan(BigDecimal value) {
            addCriterion("BILLS_ID >", value, "billsId");
            return (Criteria) this;
        }

        public Criteria andBillsIdGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("BILLS_ID >=", value, "billsId");
            return (Criteria) this;
        }

        public Criteria andBillsIdLessThan(BigDecimal value) {
            addCriterion("BILLS_ID <", value, "billsId");
            return (Criteria) this;
        }

        public Criteria andBillsIdLessThanOrEqualTo(BigDecimal value) {
            addCriterion("BILLS_ID <=", value, "billsId");
            return (Criteria) this;
        }

        public Criteria andBillsIdIn(List<BigDecimal> values) {
            addCriterion("BILLS_ID in", values, "billsId");
            return (Criteria) this;
        }

        public Criteria andBillsIdNotIn(List<BigDecimal> values) {
            addCriterion("BILLS_ID not in", values, "billsId");
            return (Criteria) this;
        }

        public Criteria andBillsIdBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("BILLS_ID between", value1, value2, "billsId");
            return (Criteria) this;
        }

        public Criteria andBillsIdNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("BILLS_ID not between", value1, value2, "billsId");
            return (Criteria) this;
        }

        public Criteria andFeeTypeIsNull() {
            addCriterion("FEE_TYPE is null");
            return (Criteria) this;
        }

        public Criteria andFeeTypeIsNotNull() {
            addCriterion("FEE_TYPE is not null");
            return (Criteria) this;
        }

        public Criteria andFeeTypeEqualTo(String value) {
            addCriterion("FEE_TYPE =", value, "feeType");
            return (Criteria) this;
        }

        public Criteria andFeeTypeNotEqualTo(String value) {
            addCriterion("FEE_TYPE <>", value, "feeType");
            return (Criteria) this;
        }

        public Criteria andFeeTypeGreaterThan(String value) {
            addCriterion("FEE_TYPE >", value, "feeType");
            return (Criteria) this;
        }

        public Criteria andFeeTypeGreaterThanOrEqualTo(String value) {
            addCriterion("FEE_TYPE >=", value, "feeType");
            return (Criteria) this;
        }

        public Criteria andFeeTypeLessThan(String value) {
            addCriterion("FEE_TYPE <", value, "feeType");
            return (Criteria) this;
        }

        public Criteria andFeeTypeLessThanOrEqualTo(String value) {
            addCriterion("FEE_TYPE <=", value, "feeType");
            return (Criteria) this;
        }

        public Criteria andFeeTypeLike(String value) {
            addCriterion("FEE_TYPE like", value, "feeType");
            return (Criteria) this;
        }

        public Criteria andFeeTypeNotLike(String value) {
            addCriterion("FEE_TYPE not like", value, "feeType");
            return (Criteria) this;
        }

        public Criteria andFeeTypeIn(List<String> values) {
            addCriterion("FEE_TYPE in", values, "feeType");
            return (Criteria) this;
        }

        public Criteria andFeeTypeNotIn(List<String> values) {
            addCriterion("FEE_TYPE not in", values, "feeType");
            return (Criteria) this;
        }

        public Criteria andFeeTypeBetween(String value1, String value2) {
            addCriterion("FEE_TYPE between", value1, value2, "feeType");
            return (Criteria) this;
        }

        public Criteria andFeeTypeNotBetween(String value1, String value2) {
            addCriterion("FEE_TYPE not between", value1, value2, "feeType");
            return (Criteria) this;
        }

        public Criteria andFeePayTypeIsNull() {
            addCriterion("FEE_PAY_TYPE is null");
            return (Criteria) this;
        }

        public Criteria andFeePayTypeIsNotNull() {
            addCriterion("FEE_PAY_TYPE is not null");
            return (Criteria) this;
        }

        public Criteria andFeePayTypeEqualTo(String value) {
            addCriterion("FEE_PAY_TYPE =", value, "feePayType");
            return (Criteria) this;
        }

        public Criteria andFeePayTypeNotEqualTo(String value) {
            addCriterion("FEE_PAY_TYPE <>", value, "feePayType");
            return (Criteria) this;
        }

        public Criteria andFeePayTypeGreaterThan(String value) {
            addCriterion("FEE_PAY_TYPE >", value, "feePayType");
            return (Criteria) this;
        }

        public Criteria andFeePayTypeGreaterThanOrEqualTo(String value) {
            addCriterion("FEE_PAY_TYPE >=", value, "feePayType");
            return (Criteria) this;
        }

        public Criteria andFeePayTypeLessThan(String value) {
            addCriterion("FEE_PAY_TYPE <", value, "feePayType");
            return (Criteria) this;
        }

        public Criteria andFeePayTypeLessThanOrEqualTo(String value) {
            addCriterion("FEE_PAY_TYPE <=", value, "feePayType");
            return (Criteria) this;
        }

        public Criteria andFeePayTypeLike(String value) {
            addCriterion("FEE_PAY_TYPE like", value, "feePayType");
            return (Criteria) this;
        }

        public Criteria andFeePayTypeNotLike(String value) {
            addCriterion("FEE_PAY_TYPE not like", value, "feePayType");
            return (Criteria) this;
        }

        public Criteria andFeePayTypeIn(List<String> values) {
            addCriterion("FEE_PAY_TYPE in", values, "feePayType");
            return (Criteria) this;
        }

        public Criteria andFeePayTypeNotIn(List<String> values) {
            addCriterion("FEE_PAY_TYPE not in", values, "feePayType");
            return (Criteria) this;
        }

        public Criteria andFeePayTypeBetween(String value1, String value2) {
            addCriterion("FEE_PAY_TYPE between", value1, value2, "feePayType");
            return (Criteria) this;
        }

        public Criteria andFeePayTypeNotBetween(String value1, String value2) {
            addCriterion("FEE_PAY_TYPE not between", value1, value2, "feePayType");
            return (Criteria) this;
        }

        public Criteria andFeeAmountIsNull() {
            addCriterion("FEE_AMOUNT is null");
            return (Criteria) this;
        }

        public Criteria andFeeAmountIsNotNull() {
            addCriterion("FEE_AMOUNT is not null");
            return (Criteria) this;
        }

        public Criteria andFeeAmountEqualTo(BigDecimal value) {
            addCriterion("FEE_AMOUNT =", value, "feeAmount");
            return (Criteria) this;
        }

        public Criteria andFeeAmountNotEqualTo(BigDecimal value) {
            addCriterion("FEE_AMOUNT <>", value, "feeAmount");
            return (Criteria) this;
        }

        public Criteria andFeeAmountGreaterThan(BigDecimal value) {
            addCriterion("FEE_AMOUNT >", value, "feeAmount");
            return (Criteria) this;
        }

        public Criteria andFeeAmountGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("FEE_AMOUNT >=", value, "feeAmount");
            return (Criteria) this;
        }

        public Criteria andFeeAmountLessThan(BigDecimal value) {
            addCriterion("FEE_AMOUNT <", value, "feeAmount");
            return (Criteria) this;
        }

        public Criteria andFeeAmountLessThanOrEqualTo(BigDecimal value) {
            addCriterion("FEE_AMOUNT <=", value, "feeAmount");
            return (Criteria) this;
        }

        public Criteria andFeeAmountIn(List<BigDecimal> values) {
            addCriterion("FEE_AMOUNT in", values, "feeAmount");
            return (Criteria) this;
        }

        public Criteria andFeeAmountNotIn(List<BigDecimal> values) {
            addCriterion("FEE_AMOUNT not in", values, "feeAmount");
            return (Criteria) this;
        }

        public Criteria andFeeAmountBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("FEE_AMOUNT between", value1, value2, "feeAmount");
            return (Criteria) this;
        }

        public Criteria andFeeAmountNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("FEE_AMOUNT not between", value1, value2, "feeAmount");
            return (Criteria) this;
        }

        public Criteria andFeePeriodIsNull() {
            addCriterion("FEE_PERIOD is null");
            return (Criteria) this;
        }

        public Criteria andFeePeriodIsNotNull() {
            addCriterion("FEE_PERIOD is not null");
            return (Criteria) this;
        }

        public Criteria andFeePeriodEqualTo(BigDecimal value) {
            addCriterion("FEE_PERIOD =", value, "feePeriod");
            return (Criteria) this;
        }

        public Criteria andFeePeriodNotEqualTo(BigDecimal value) {
            addCriterion("FEE_PERIOD <>", value, "feePeriod");
            return (Criteria) this;
        }

        public Criteria andFeePeriodGreaterThan(BigDecimal value) {
            addCriterion("FEE_PERIOD >", value, "feePeriod");
            return (Criteria) this;
        }

        public Criteria andFeePeriodGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("FEE_PERIOD >=", value, "feePeriod");
            return (Criteria) this;
        }

        public Criteria andFeePeriodLessThan(BigDecimal value) {
            addCriterion("FEE_PERIOD <", value, "feePeriod");
            return (Criteria) this;
        }

        public Criteria andFeePeriodLessThanOrEqualTo(BigDecimal value) {
            addCriterion("FEE_PERIOD <=", value, "feePeriod");
            return (Criteria) this;
        }

        public Criteria andFeePeriodIn(List<BigDecimal> values) {
            addCriterion("FEE_PERIOD in", values, "feePeriod");
            return (Criteria) this;
        }

        public Criteria andFeePeriodNotIn(List<BigDecimal> values) {
            addCriterion("FEE_PERIOD not in", values, "feePeriod");
            return (Criteria) this;
        }

        public Criteria andFeePeriodBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("FEE_PERIOD between", value1, value2, "feePeriod");
            return (Criteria) this;
        }

        public Criteria andFeePeriodNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("FEE_PERIOD not between", value1, value2, "feePeriod");
            return (Criteria) this;
        }

        public Criteria andFeePhaseIsNull() {
            addCriterion("FEE_PHASE is null");
            return (Criteria) this;
        }

        public Criteria andFeePhaseIsNotNull() {
            addCriterion("FEE_PHASE is not null");
            return (Criteria) this;
        }

        public Criteria andFeePhaseEqualTo(String value) {
            addCriterion("FEE_PHASE =", value, "feePhase");
            return (Criteria) this;
        }

        public Criteria andFeePhaseNotEqualTo(String value) {
            addCriterion("FEE_PHASE <>", value, "feePhase");
            return (Criteria) this;
        }

        public Criteria andFeePhaseGreaterThan(String value) {
            addCriterion("FEE_PHASE >", value, "feePhase");
            return (Criteria) this;
        }

        public Criteria andFeePhaseGreaterThanOrEqualTo(String value) {
            addCriterion("FEE_PHASE >=", value, "feePhase");
            return (Criteria) this;
        }

        public Criteria andFeePhaseLessThan(String value) {
            addCriterion("FEE_PHASE <", value, "feePhase");
            return (Criteria) this;
        }

        public Criteria andFeePhaseLessThanOrEqualTo(String value) {
            addCriterion("FEE_PHASE <=", value, "feePhase");
            return (Criteria) this;
        }

        public Criteria andFeePhaseLike(String value) {
            addCriterion("FEE_PHASE like", value, "feePhase");
            return (Criteria) this;
        }

        public Criteria andFeePhaseNotLike(String value) {
            addCriterion("FEE_PHASE not like", value, "feePhase");
            return (Criteria) this;
        }

        public Criteria andFeePhaseIn(List<String> values) {
            addCriterion("FEE_PHASE in", values, "feePhase");
            return (Criteria) this;
        }

        public Criteria andFeePhaseNotIn(List<String> values) {
            addCriterion("FEE_PHASE not in", values, "feePhase");
            return (Criteria) this;
        }

        public Criteria andFeePhaseBetween(String value1, String value2) {
            addCriterion("FEE_PHASE between", value1, value2, "feePhase");
            return (Criteria) this;
        }

        public Criteria andFeePhaseNotBetween(String value1, String value2) {
            addCriterion("FEE_PHASE not between", value1, value2, "feePhase");
            return (Criteria) this;
        }

        public Criteria andFeeStartDateIsNull() {
            addCriterion("FEE_START_DATE is null");
            return (Criteria) this;
        }

        public Criteria andFeeStartDateIsNotNull() {
            addCriterion("FEE_START_DATE is not null");
            return (Criteria) this;
        }

        public Criteria andFeeStartDateEqualTo(String value) {
            addCriterion("FEE_START_DATE =", value, "feeStartDate");
            return (Criteria) this;
        }

        public Criteria andFeeStartDateNotEqualTo(String value) {
            addCriterion("FEE_START_DATE <>", value, "feeStartDate");
            return (Criteria) this;
        }

        public Criteria andFeeStartDateGreaterThan(String value) {
            addCriterion("FEE_START_DATE >", value, "feeStartDate");
            return (Criteria) this;
        }

        public Criteria andFeeStartDateGreaterThanOrEqualTo(String value) {
            addCriterion("FEE_START_DATE >=", value, "feeStartDate");
            return (Criteria) this;
        }

        public Criteria andFeeStartDateLessThan(String value) {
            addCriterion("FEE_START_DATE <", value, "feeStartDate");
            return (Criteria) this;
        }

        public Criteria andFeeStartDateLessThanOrEqualTo(String value) {
            addCriterion("FEE_START_DATE <=", value, "feeStartDate");
            return (Criteria) this;
        }

        public Criteria andFeeStartDateLike(String value) {
            addCriterion("FEE_START_DATE like", value, "feeStartDate");
            return (Criteria) this;
        }

        public Criteria andFeeStartDateNotLike(String value) {
            addCriterion("FEE_START_DATE not like", value, "feeStartDate");
            return (Criteria) this;
        }

        public Criteria andFeeStartDateIn(List<String> values) {
            addCriterion("FEE_START_DATE in", values, "feeStartDate");
            return (Criteria) this;
        }

        public Criteria andFeeStartDateNotIn(List<String> values) {
            addCriterion("FEE_START_DATE not in", values, "feeStartDate");
            return (Criteria) this;
        }

        public Criteria andFeeStartDateBetween(String value1, String value2) {
            addCriterion("FEE_START_DATE between", value1, value2, "feeStartDate");
            return (Criteria) this;
        }

        public Criteria andFeeStartDateNotBetween(String value1, String value2) {
            addCriterion("FEE_START_DATE not between", value1, value2, "feeStartDate");
            return (Criteria) this;
        }

        public Criteria andFeeEndDateIsNull() {
            addCriterion("FEE_END_DATE is null");
            return (Criteria) this;
        }

        public Criteria andFeeEndDateIsNotNull() {
            addCriterion("FEE_END_DATE is not null");
            return (Criteria) this;
        }

        public Criteria andFeeEndDateEqualTo(String value) {
            addCriterion("FEE_END_DATE =", value, "feeEndDate");
            return (Criteria) this;
        }

        public Criteria andFeeEndDateNotEqualTo(String value) {
            addCriterion("FEE_END_DATE <>", value, "feeEndDate");
            return (Criteria) this;
        }

        public Criteria andFeeEndDateGreaterThan(String value) {
            addCriterion("FEE_END_DATE >", value, "feeEndDate");
            return (Criteria) this;
        }

        public Criteria andFeeEndDateGreaterThanOrEqualTo(String value) {
            addCriterion("FEE_END_DATE >=", value, "feeEndDate");
            return (Criteria) this;
        }

        public Criteria andFeeEndDateLessThan(String value) {
            addCriterion("FEE_END_DATE <", value, "feeEndDate");
            return (Criteria) this;
        }

        public Criteria andFeeEndDateLessThanOrEqualTo(String value) {
            addCriterion("FEE_END_DATE <=", value, "feeEndDate");
            return (Criteria) this;
        }

        public Criteria andFeeEndDateLike(String value) {
            addCriterion("FEE_END_DATE like", value, "feeEndDate");
            return (Criteria) this;
        }

        public Criteria andFeeEndDateNotLike(String value) {
            addCriterion("FEE_END_DATE not like", value, "feeEndDate");
            return (Criteria) this;
        }

        public Criteria andFeeEndDateIn(List<String> values) {
            addCriterion("FEE_END_DATE in", values, "feeEndDate");
            return (Criteria) this;
        }

        public Criteria andFeeEndDateNotIn(List<String> values) {
            addCriterion("FEE_END_DATE not in", values, "feeEndDate");
            return (Criteria) this;
        }

        public Criteria andFeeEndDateBetween(String value1, String value2) {
            addCriterion("FEE_END_DATE between", value1, value2, "feeEndDate");
            return (Criteria) this;
        }

        public Criteria andFeeEndDateNotBetween(String value1, String value2) {
            addCriterion("FEE_END_DATE not between", value1, value2, "feeEndDate");
            return (Criteria) this;
        }

        public Criteria andReceivableDateIsNull() {
            addCriterion("RECEIVABLE_DATE is null");
            return (Criteria) this;
        }

        public Criteria andReceivableDateIsNotNull() {
            addCriterion("RECEIVABLE_DATE is not null");
            return (Criteria) this;
        }

        public Criteria andReceivableDateEqualTo(String value) {
            addCriterion("RECEIVABLE_DATE =", value, "receivableDate");
            return (Criteria) this;
        }

        public Criteria andReceivableDateNotEqualTo(String value) {
            addCriterion("RECEIVABLE_DATE <>", value, "receivableDate");
            return (Criteria) this;
        }

        public Criteria andReceivableDateGreaterThan(String value) {
            addCriterion("RECEIVABLE_DATE >", value, "receivableDate");
            return (Criteria) this;
        }

        public Criteria andReceivableDateGreaterThanOrEqualTo(String value) {
            addCriterion("RECEIVABLE_DATE >=", value, "receivableDate");
            return (Criteria) this;
        }

        public Criteria andReceivableDateLessThan(String value) {
            addCriterion("RECEIVABLE_DATE <", value, "receivableDate");
            return (Criteria) this;
        }

        public Criteria andReceivableDateLessThanOrEqualTo(String value) {
            addCriterion("RECEIVABLE_DATE <=", value, "receivableDate");
            return (Criteria) this;
        }

        public Criteria andReceivableDateLike(String value) {
            addCriterion("RECEIVABLE_DATE like", value, "receivableDate");
            return (Criteria) this;
        }

        public Criteria andReceivableDateNotLike(String value) {
            addCriterion("RECEIVABLE_DATE not like", value, "receivableDate");
            return (Criteria) this;
        }

        public Criteria andReceivableDateIn(List<String> values) {
            addCriterion("RECEIVABLE_DATE in", values, "receivableDate");
            return (Criteria) this;
        }

        public Criteria andReceivableDateNotIn(List<String> values) {
            addCriterion("RECEIVABLE_DATE not in", values, "receivableDate");
            return (Criteria) this;
        }

        public Criteria andReceivableDateBetween(String value1, String value2) {
            addCriterion("RECEIVABLE_DATE between", value1, value2, "receivableDate");
            return (Criteria) this;
        }

        public Criteria andReceivableDateNotBetween(String value1, String value2) {
            addCriterion("RECEIVABLE_DATE not between", value1, value2, "receivableDate");
            return (Criteria) this;
        }

        public Criteria andPenaltyFeeIsNull() {
            addCriterion("PENALTY_FEE is null");
            return (Criteria) this;
        }

        public Criteria andPenaltyFeeIsNotNull() {
            addCriterion("PENALTY_FEE is not null");
            return (Criteria) this;
        }

        public Criteria andPenaltyFeeEqualTo(BigDecimal value) {
            addCriterion("PENALTY_FEE =", value, "penaltyFee");
            return (Criteria) this;
        }

        public Criteria andPenaltyFeeNotEqualTo(BigDecimal value) {
            addCriterion("PENALTY_FEE <>", value, "penaltyFee");
            return (Criteria) this;
        }

        public Criteria andPenaltyFeeGreaterThan(BigDecimal value) {
            addCriterion("PENALTY_FEE >", value, "penaltyFee");
            return (Criteria) this;
        }

        public Criteria andPenaltyFeeGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("PENALTY_FEE >=", value, "penaltyFee");
            return (Criteria) this;
        }

        public Criteria andPenaltyFeeLessThan(BigDecimal value) {
            addCriterion("PENALTY_FEE <", value, "penaltyFee");
            return (Criteria) this;
        }

        public Criteria andPenaltyFeeLessThanOrEqualTo(BigDecimal value) {
            addCriterion("PENALTY_FEE <=", value, "penaltyFee");
            return (Criteria) this;
        }

        public Criteria andPenaltyFeeIn(List<BigDecimal> values) {
            addCriterion("PENALTY_FEE in", values, "penaltyFee");
            return (Criteria) this;
        }

        public Criteria andPenaltyFeeNotIn(List<BigDecimal> values) {
            addCriterion("PENALTY_FEE not in", values, "penaltyFee");
            return (Criteria) this;
        }

        public Criteria andPenaltyFeeBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("PENALTY_FEE between", value1, value2, "penaltyFee");
            return (Criteria) this;
        }

        public Criteria andPenaltyFeeNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("PENALTY_FEE not between", value1, value2, "penaltyFee");
            return (Criteria) this;
        }

        public Criteria andDiscountFeeIsNull() {
            addCriterion("DISCOUNT_FEE is null");
            return (Criteria) this;
        }

        public Criteria andDiscountFeeIsNotNull() {
            addCriterion("DISCOUNT_FEE is not null");
            return (Criteria) this;
        }

        public Criteria andDiscountFeeEqualTo(BigDecimal value) {
            addCriterion("DISCOUNT_FEE =", value, "discountFee");
            return (Criteria) this;
        }

        public Criteria andDiscountFeeNotEqualTo(BigDecimal value) {
            addCriterion("DISCOUNT_FEE <>", value, "discountFee");
            return (Criteria) this;
        }

        public Criteria andDiscountFeeGreaterThan(BigDecimal value) {
            addCriterion("DISCOUNT_FEE >", value, "discountFee");
            return (Criteria) this;
        }

        public Criteria andDiscountFeeGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("DISCOUNT_FEE >=", value, "discountFee");
            return (Criteria) this;
        }

        public Criteria andDiscountFeeLessThan(BigDecimal value) {
            addCriterion("DISCOUNT_FEE <", value, "discountFee");
            return (Criteria) this;
        }

        public Criteria andDiscountFeeLessThanOrEqualTo(BigDecimal value) {
            addCriterion("DISCOUNT_FEE <=", value, "discountFee");
            return (Criteria) this;
        }

        public Criteria andDiscountFeeIn(List<BigDecimal> values) {
            addCriterion("DISCOUNT_FEE in", values, "discountFee");
            return (Criteria) this;
        }

        public Criteria andDiscountFeeNotIn(List<BigDecimal> values) {
            addCriterion("DISCOUNT_FEE not in", values, "discountFee");
            return (Criteria) this;
        }

        public Criteria andDiscountFeeBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("DISCOUNT_FEE between", value1, value2, "discountFee");
            return (Criteria) this;
        }

        public Criteria andDiscountFeeNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("DISCOUNT_FEE not between", value1, value2, "discountFee");
            return (Criteria) this;
        }

        public Criteria andDiscountRemarkIsNull() {
            addCriterion("DISCOUNT_REMARK is null");
            return (Criteria) this;
        }

        public Criteria andDiscountRemarkIsNotNull() {
            addCriterion("DISCOUNT_REMARK is not null");
            return (Criteria) this;
        }

        public Criteria andDiscountRemarkEqualTo(String value) {
            addCriterion("DISCOUNT_REMARK =", value, "discountRemark");
            return (Criteria) this;
        }

        public Criteria andDiscountRemarkNotEqualTo(String value) {
            addCriterion("DISCOUNT_REMARK <>", value, "discountRemark");
            return (Criteria) this;
        }

        public Criteria andDiscountRemarkGreaterThan(String value) {
            addCriterion("DISCOUNT_REMARK >", value, "discountRemark");
            return (Criteria) this;
        }

        public Criteria andDiscountRemarkGreaterThanOrEqualTo(String value) {
            addCriterion("DISCOUNT_REMARK >=", value, "discountRemark");
            return (Criteria) this;
        }

        public Criteria andDiscountRemarkLessThan(String value) {
            addCriterion("DISCOUNT_REMARK <", value, "discountRemark");
            return (Criteria) this;
        }

        public Criteria andDiscountRemarkLessThanOrEqualTo(String value) {
            addCriterion("DISCOUNT_REMARK <=", value, "discountRemark");
            return (Criteria) this;
        }

        public Criteria andDiscountRemarkLike(String value) {
            addCriterion("DISCOUNT_REMARK like", value, "discountRemark");
            return (Criteria) this;
        }

        public Criteria andDiscountRemarkNotLike(String value) {
            addCriterion("DISCOUNT_REMARK not like", value, "discountRemark");
            return (Criteria) this;
        }

        public Criteria andDiscountRemarkIn(List<String> values) {
            addCriterion("DISCOUNT_REMARK in", values, "discountRemark");
            return (Criteria) this;
        }

        public Criteria andDiscountRemarkNotIn(List<String> values) {
            addCriterion("DISCOUNT_REMARK not in", values, "discountRemark");
            return (Criteria) this;
        }

        public Criteria andDiscountRemarkBetween(String value1, String value2) {
            addCriterion("DISCOUNT_REMARK between", value1, value2, "discountRemark");
            return (Criteria) this;
        }

        public Criteria andDiscountRemarkNotBetween(String value1, String value2) {
            addCriterion("DISCOUNT_REMARK not between", value1, value2, "discountRemark");
            return (Criteria) this;
        }

        public Criteria andRealAmountIsNull() {
            addCriterion("REAL_AMOUNT is null");
            return (Criteria) this;
        }

        public Criteria andRealAmountIsNotNull() {
            addCriterion("REAL_AMOUNT is not null");
            return (Criteria) this;
        }

        public Criteria andRealAmountEqualTo(BigDecimal value) {
            addCriterion("REAL_AMOUNT =", value, "realAmount");
            return (Criteria) this;
        }

        public Criteria andRealAmountNotEqualTo(BigDecimal value) {
            addCriterion("REAL_AMOUNT <>", value, "realAmount");
            return (Criteria) this;
        }

        public Criteria andRealAmountGreaterThan(BigDecimal value) {
            addCriterion("REAL_AMOUNT >", value, "realAmount");
            return (Criteria) this;
        }

        public Criteria andRealAmountGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("REAL_AMOUNT >=", value, "realAmount");
            return (Criteria) this;
        }

        public Criteria andRealAmountLessThan(BigDecimal value) {
            addCriterion("REAL_AMOUNT <", value, "realAmount");
            return (Criteria) this;
        }

        public Criteria andRealAmountLessThanOrEqualTo(BigDecimal value) {
            addCriterion("REAL_AMOUNT <=", value, "realAmount");
            return (Criteria) this;
        }

        public Criteria andRealAmountIn(List<BigDecimal> values) {
            addCriterion("REAL_AMOUNT in", values, "realAmount");
            return (Criteria) this;
        }

        public Criteria andRealAmountNotIn(List<BigDecimal> values) {
            addCriterion("REAL_AMOUNT not in", values, "realAmount");
            return (Criteria) this;
        }

        public Criteria andRealAmountBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("REAL_AMOUNT between", value1, value2, "realAmount");
            return (Criteria) this;
        }

        public Criteria andRealAmountNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("REAL_AMOUNT not between", value1, value2, "realAmount");
            return (Criteria) this;
        }

        public Criteria andFeeStatusIsNull() {
            addCriterion("FEE_STATUS is null");
            return (Criteria) this;
        }

        public Criteria andFeeStatusIsNotNull() {
            addCriterion("FEE_STATUS is not null");
            return (Criteria) this;
        }

        public Criteria andFeeStatusEqualTo(String value) {
            addCriterion("FEE_STATUS =", value, "feeStatus");
            return (Criteria) this;
        }

        public Criteria andFeeStatusNotEqualTo(String value) {
            addCriterion("FEE_STATUS <>", value, "feeStatus");
            return (Criteria) this;
        }

        public Criteria andFeeStatusGreaterThan(String value) {
            addCriterion("FEE_STATUS >", value, "feeStatus");
            return (Criteria) this;
        }

        public Criteria andFeeStatusGreaterThanOrEqualTo(String value) {
            addCriterion("FEE_STATUS >=", value, "feeStatus");
            return (Criteria) this;
        }

        public Criteria andFeeStatusLessThan(String value) {
            addCriterion("FEE_STATUS <", value, "feeStatus");
            return (Criteria) this;
        }

        public Criteria andFeeStatusLessThanOrEqualTo(String value) {
            addCriterion("FEE_STATUS <=", value, "feeStatus");
            return (Criteria) this;
        }

        public Criteria andFeeStatusLike(String value) {
            addCriterion("FEE_STATUS like", value, "feeStatus");
            return (Criteria) this;
        }

        public Criteria andFeeStatusNotLike(String value) {
            addCriterion("FEE_STATUS not like", value, "feeStatus");
            return (Criteria) this;
        }

        public Criteria andFeeStatusIn(List<String> values) {
            addCriterion("FEE_STATUS in", values, "feeStatus");
            return (Criteria) this;
        }

        public Criteria andFeeStatusNotIn(List<String> values) {
            addCriterion("FEE_STATUS not in", values, "feeStatus");
            return (Criteria) this;
        }

        public Criteria andFeeStatusBetween(String value1, String value2) {
            addCriterion("FEE_STATUS between", value1, value2, "feeStatus");
            return (Criteria) this;
        }

        public Criteria andFeeStatusNotBetween(String value1, String value2) {
            addCriterion("FEE_STATUS not between", value1, value2, "feeStatus");
            return (Criteria) this;
        }

        public Criteria andFeeRemarkIsNull() {
            addCriterion("FEE_REMARK is null");
            return (Criteria) this;
        }

        public Criteria andFeeRemarkIsNotNull() {
            addCriterion("FEE_REMARK is not null");
            return (Criteria) this;
        }

        public Criteria andFeeRemarkEqualTo(String value) {
            addCriterion("FEE_REMARK =", value, "feeRemark");
            return (Criteria) this;
        }

        public Criteria andFeeRemarkNotEqualTo(String value) {
            addCriterion("FEE_REMARK <>", value, "feeRemark");
            return (Criteria) this;
        }

        public Criteria andFeeRemarkGreaterThan(String value) {
            addCriterion("FEE_REMARK >", value, "feeRemark");
            return (Criteria) this;
        }

        public Criteria andFeeRemarkGreaterThanOrEqualTo(String value) {
            addCriterion("FEE_REMARK >=", value, "feeRemark");
            return (Criteria) this;
        }

        public Criteria andFeeRemarkLessThan(String value) {
            addCriterion("FEE_REMARK <", value, "feeRemark");
            return (Criteria) this;
        }

        public Criteria andFeeRemarkLessThanOrEqualTo(String value) {
            addCriterion("FEE_REMARK <=", value, "feeRemark");
            return (Criteria) this;
        }

        public Criteria andFeeRemarkLike(String value) {
            addCriterion("FEE_REMARK like", value, "feeRemark");
            return (Criteria) this;
        }

        public Criteria andFeeRemarkNotLike(String value) {
            addCriterion("FEE_REMARK not like", value, "feeRemark");
            return (Criteria) this;
        }

        public Criteria andFeeRemarkIn(List<String> values) {
            addCriterion("FEE_REMARK in", values, "feeRemark");
            return (Criteria) this;
        }

        public Criteria andFeeRemarkNotIn(List<String> values) {
            addCriterion("FEE_REMARK not in", values, "feeRemark");
            return (Criteria) this;
        }

        public Criteria andFeeRemarkBetween(String value1, String value2) {
            addCriterion("FEE_REMARK between", value1, value2, "feeRemark");
            return (Criteria) this;
        }

        public Criteria andFeeRemarkNotBetween(String value1, String value2) {
            addCriterion("FEE_REMARK not between", value1, value2, "feeRemark");
            return (Criteria) this;
        }

        public Criteria andDeletedIsNull() {
            addCriterion("DELETED is null");
            return (Criteria) this;
        }

        public Criteria andDeletedIsNotNull() {
            addCriterion("DELETED is not null");
            return (Criteria) this;
        }

        public Criteria andDeletedEqualTo(String value) {
            addCriterion("DELETED =", value, "deleted");
            return (Criteria) this;
        }

        public Criteria andDeletedNotEqualTo(String value) {
            addCriterion("DELETED <>", value, "deleted");
            return (Criteria) this;
        }

        public Criteria andDeletedGreaterThan(String value) {
            addCriterion("DELETED >", value, "deleted");
            return (Criteria) this;
        }

        public Criteria andDeletedGreaterThanOrEqualTo(String value) {
            addCriterion("DELETED >=", value, "deleted");
            return (Criteria) this;
        }

        public Criteria andDeletedLessThan(String value) {
            addCriterion("DELETED <", value, "deleted");
            return (Criteria) this;
        }

        public Criteria andDeletedLessThanOrEqualTo(String value) {
            addCriterion("DELETED <=", value, "deleted");
            return (Criteria) this;
        }

        public Criteria andDeletedLike(String value) {
            addCriterion("DELETED like", value, "deleted");
            return (Criteria) this;
        }

        public Criteria andDeletedNotLike(String value) {
            addCriterion("DELETED not like", value, "deleted");
            return (Criteria) this;
        }

        public Criteria andDeletedIn(List<String> values) {
            addCriterion("DELETED in", values, "deleted");
            return (Criteria) this;
        }

        public Criteria andDeletedNotIn(List<String> values) {
            addCriterion("DELETED not in", values, "deleted");
            return (Criteria) this;
        }

        public Criteria andDeletedBetween(String value1, String value2) {
            addCriterion("DELETED between", value1, value2, "deleted");
            return (Criteria) this;
        }

        public Criteria andDeletedNotBetween(String value1, String value2) {
            addCriterion("DELETED not between", value1, value2, "deleted");
            return (Criteria) this;
        }

        public Criteria andCreateUserIsNull() {
            addCriterion("CREATE_USER is null");
            return (Criteria) this;
        }

        public Criteria andCreateUserIsNotNull() {
            addCriterion("CREATE_USER is not null");
            return (Criteria) this;
        }

        public Criteria andCreateUserEqualTo(String value) {
            addCriterion("CREATE_USER =", value, "createUser");
            return (Criteria) this;
        }

        public Criteria andCreateUserNotEqualTo(String value) {
            addCriterion("CREATE_USER <>", value, "createUser");
            return (Criteria) this;
        }

        public Criteria andCreateUserGreaterThan(String value) {
            addCriterion("CREATE_USER >", value, "createUser");
            return (Criteria) this;
        }

        public Criteria andCreateUserGreaterThanOrEqualTo(String value) {
            addCriterion("CREATE_USER >=", value, "createUser");
            return (Criteria) this;
        }

        public Criteria andCreateUserLessThan(String value) {
            addCriterion("CREATE_USER <", value, "createUser");
            return (Criteria) this;
        }

        public Criteria andCreateUserLessThanOrEqualTo(String value) {
            addCriterion("CREATE_USER <=", value, "createUser");
            return (Criteria) this;
        }

        public Criteria andCreateUserLike(String value) {
            addCriterion("CREATE_USER like", value, "createUser");
            return (Criteria) this;
        }

        public Criteria andCreateUserNotLike(String value) {
            addCriterion("CREATE_USER not like", value, "createUser");
            return (Criteria) this;
        }

        public Criteria andCreateUserIn(List<String> values) {
            addCriterion("CREATE_USER in", values, "createUser");
            return (Criteria) this;
        }

        public Criteria andCreateUserNotIn(List<String> values) {
            addCriterion("CREATE_USER not in", values, "createUser");
            return (Criteria) this;
        }

        public Criteria andCreateUserBetween(String value1, String value2) {
            addCriterion("CREATE_USER between", value1, value2, "createUser");
            return (Criteria) this;
        }

        public Criteria andCreateUserNotBetween(String value1, String value2) {
            addCriterion("CREATE_USER not between", value1, value2, "createUser");
            return (Criteria) this;
        }

        public Criteria andUpdateUserIsNull() {
            addCriterion("UPDATE_USER is null");
            return (Criteria) this;
        }

        public Criteria andUpdateUserIsNotNull() {
            addCriterion("UPDATE_USER is not null");
            return (Criteria) this;
        }

        public Criteria andUpdateUserEqualTo(String value) {
            addCriterion("UPDATE_USER =", value, "updateUser");
            return (Criteria) this;
        }

        public Criteria andUpdateUserNotEqualTo(String value) {
            addCriterion("UPDATE_USER <>", value, "updateUser");
            return (Criteria) this;
        }

        public Criteria andUpdateUserGreaterThan(String value) {
            addCriterion("UPDATE_USER >", value, "updateUser");
            return (Criteria) this;
        }

        public Criteria andUpdateUserGreaterThanOrEqualTo(String value) {
            addCriterion("UPDATE_USER >=", value, "updateUser");
            return (Criteria) this;
        }

        public Criteria andUpdateUserLessThan(String value) {
            addCriterion("UPDATE_USER <", value, "updateUser");
            return (Criteria) this;
        }

        public Criteria andUpdateUserLessThanOrEqualTo(String value) {
            addCriterion("UPDATE_USER <=", value, "updateUser");
            return (Criteria) this;
        }

        public Criteria andUpdateUserLike(String value) {
            addCriterion("UPDATE_USER like", value, "updateUser");
            return (Criteria) this;
        }

        public Criteria andUpdateUserNotLike(String value) {
            addCriterion("UPDATE_USER not like", value, "updateUser");
            return (Criteria) this;
        }

        public Criteria andUpdateUserIn(List<String> values) {
            addCriterion("UPDATE_USER in", values, "updateUser");
            return (Criteria) this;
        }

        public Criteria andUpdateUserNotIn(List<String> values) {
            addCriterion("UPDATE_USER not in", values, "updateUser");
            return (Criteria) this;
        }

        public Criteria andUpdateUserBetween(String value1, String value2) {
            addCriterion("UPDATE_USER between", value1, value2, "updateUser");
            return (Criteria) this;
        }

        public Criteria andUpdateUserNotBetween(String value1, String value2) {
            addCriterion("UPDATE_USER not between", value1, value2, "updateUser");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIsNull() {
            addCriterion("CREATE_TIME is null");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIsNotNull() {
            addCriterion("CREATE_TIME is not null");
            return (Criteria) this;
        }

        public Criteria andCreateTimeEqualTo(Date value) {
            addCriterion("CREATE_TIME =", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotEqualTo(Date value) {
            addCriterion("CREATE_TIME <>", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeGreaterThan(Date value) {
            addCriterion("CREATE_TIME >", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("CREATE_TIME >=", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeLessThan(Date value) {
            addCriterion("CREATE_TIME <", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeLessThanOrEqualTo(Date value) {
            addCriterion("CREATE_TIME <=", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIn(List<Date> values) {
            addCriterion("CREATE_TIME in", values, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotIn(List<Date> values) {
            addCriterion("CREATE_TIME not in", values, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeBetween(Date value1, Date value2) {
            addCriterion("CREATE_TIME between", value1, value2, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotBetween(Date value1, Date value2) {
            addCriterion("CREATE_TIME not between", value1, value2, "createTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeIsNull() {
            addCriterion("UPDATE_TIME is null");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeIsNotNull() {
            addCriterion("UPDATE_TIME is not null");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeEqualTo(Date value) {
            addCriterion("UPDATE_TIME =", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeNotEqualTo(Date value) {
            addCriterion("UPDATE_TIME <>", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeGreaterThan(Date value) {
            addCriterion("UPDATE_TIME >", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("UPDATE_TIME >=", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeLessThan(Date value) {
            addCriterion("UPDATE_TIME <", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeLessThanOrEqualTo(Date value) {
            addCriterion("UPDATE_TIME <=", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeIn(List<Date> values) {
            addCriterion("UPDATE_TIME in", values, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeNotIn(List<Date> values) {
            addCriterion("UPDATE_TIME not in", values, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeBetween(Date value1, Date value2) {
            addCriterion("UPDATE_TIME between", value1, value2, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeNotBetween(Date value1, Date value2) {
            addCriterion("UPDATE_TIME not between", value1, value2, "updateTime");
            return (Criteria) this;
        }

        public Criteria andVersionIsNull() {
            addCriterion("VERSION is null");
            return (Criteria) this;
        }

        public Criteria andVersionIsNotNull() {
            addCriterion("VERSION is not null");
            return (Criteria) this;
        }

        public Criteria andVersionEqualTo(BigDecimal value) {
            addCriterion("VERSION =", value, "version");
            return (Criteria) this;
        }

        public Criteria andVersionNotEqualTo(BigDecimal value) {
            addCriterion("VERSION <>", value, "version");
            return (Criteria) this;
        }

        public Criteria andVersionGreaterThan(BigDecimal value) {
            addCriterion("VERSION >", value, "version");
            return (Criteria) this;
        }

        public Criteria andVersionGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("VERSION >=", value, "version");
            return (Criteria) this;
        }

        public Criteria andVersionLessThan(BigDecimal value) {
            addCriterion("VERSION <", value, "version");
            return (Criteria) this;
        }

        public Criteria andVersionLessThanOrEqualTo(BigDecimal value) {
            addCriterion("VERSION <=", value, "version");
            return (Criteria) this;
        }

        public Criteria andVersionIn(List<BigDecimal> values) {
            addCriterion("VERSION in", values, "version");
            return (Criteria) this;
        }

        public Criteria andVersionNotIn(List<BigDecimal> values) {
            addCriterion("VERSION not in", values, "version");
            return (Criteria) this;
        }

        public Criteria andVersionBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("VERSION between", value1, value2, "version");
            return (Criteria) this;
        }

        public Criteria andVersionNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("VERSION not between", value1, value2, "version");
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