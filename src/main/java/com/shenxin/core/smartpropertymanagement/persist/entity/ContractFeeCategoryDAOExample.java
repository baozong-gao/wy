package com.shenxin.core.smartpropertymanagement.persist.entity;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class ContractFeeCategoryDAOExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ContractFeeCategoryDAOExample() {
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

        public Criteria andPenaltyRateIsNull() {
            addCriterion("PENALTY_RATE is null");
            return (Criteria) this;
        }

        public Criteria andPenaltyRateIsNotNull() {
            addCriterion("PENALTY_RATE is not null");
            return (Criteria) this;
        }

        public Criteria andPenaltyRateEqualTo(BigDecimal value) {
            addCriterion("PENALTY_RATE =", value, "penaltyRate");
            return (Criteria) this;
        }

        public Criteria andPenaltyRateNotEqualTo(BigDecimal value) {
            addCriterion("PENALTY_RATE <>", value, "penaltyRate");
            return (Criteria) this;
        }

        public Criteria andPenaltyRateGreaterThan(BigDecimal value) {
            addCriterion("PENALTY_RATE >", value, "penaltyRate");
            return (Criteria) this;
        }

        public Criteria andPenaltyRateGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("PENALTY_RATE >=", value, "penaltyRate");
            return (Criteria) this;
        }

        public Criteria andPenaltyRateLessThan(BigDecimal value) {
            addCriterion("PENALTY_RATE <", value, "penaltyRate");
            return (Criteria) this;
        }

        public Criteria andPenaltyRateLessThanOrEqualTo(BigDecimal value) {
            addCriterion("PENALTY_RATE <=", value, "penaltyRate");
            return (Criteria) this;
        }

        public Criteria andPenaltyRateIn(List<BigDecimal> values) {
            addCriterion("PENALTY_RATE in", values, "penaltyRate");
            return (Criteria) this;
        }

        public Criteria andPenaltyRateNotIn(List<BigDecimal> values) {
            addCriterion("PENALTY_RATE not in", values, "penaltyRate");
            return (Criteria) this;
        }

        public Criteria andPenaltyRateBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("PENALTY_RATE between", value1, value2, "penaltyRate");
            return (Criteria) this;
        }

        public Criteria andPenaltyRateNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("PENALTY_RATE not between", value1, value2, "penaltyRate");
            return (Criteria) this;
        }

        public Criteria andPenaltyCalculateTypeIsNull() {
            addCriterion("PENALTY_CALCULATE_TYPE is null");
            return (Criteria) this;
        }

        public Criteria andPenaltyCalculateTypeIsNotNull() {
            addCriterion("PENALTY_CALCULATE_TYPE is not null");
            return (Criteria) this;
        }

        public Criteria andPenaltyCalculateTypeEqualTo(String value) {
            addCriterion("PENALTY_CALCULATE_TYPE =", value, "penaltyCalculateType");
            return (Criteria) this;
        }

        public Criteria andPenaltyCalculateTypeNotEqualTo(String value) {
            addCriterion("PENALTY_CALCULATE_TYPE <>", value, "penaltyCalculateType");
            return (Criteria) this;
        }

        public Criteria andPenaltyCalculateTypeGreaterThan(String value) {
            addCriterion("PENALTY_CALCULATE_TYPE >", value, "penaltyCalculateType");
            return (Criteria) this;
        }

        public Criteria andPenaltyCalculateTypeGreaterThanOrEqualTo(String value) {
            addCriterion("PENALTY_CALCULATE_TYPE >=", value, "penaltyCalculateType");
            return (Criteria) this;
        }

        public Criteria andPenaltyCalculateTypeLessThan(String value) {
            addCriterion("PENALTY_CALCULATE_TYPE <", value, "penaltyCalculateType");
            return (Criteria) this;
        }

        public Criteria andPenaltyCalculateTypeLessThanOrEqualTo(String value) {
            addCriterion("PENALTY_CALCULATE_TYPE <=", value, "penaltyCalculateType");
            return (Criteria) this;
        }

        public Criteria andPenaltyCalculateTypeLike(String value) {
            addCriterion("PENALTY_CALCULATE_TYPE like", value, "penaltyCalculateType");
            return (Criteria) this;
        }

        public Criteria andPenaltyCalculateTypeNotLike(String value) {
            addCriterion("PENALTY_CALCULATE_TYPE not like", value, "penaltyCalculateType");
            return (Criteria) this;
        }

        public Criteria andPenaltyCalculateTypeIn(List<String> values) {
            addCriterion("PENALTY_CALCULATE_TYPE in", values, "penaltyCalculateType");
            return (Criteria) this;
        }

        public Criteria andPenaltyCalculateTypeNotIn(List<String> values) {
            addCriterion("PENALTY_CALCULATE_TYPE not in", values, "penaltyCalculateType");
            return (Criteria) this;
        }

        public Criteria andPenaltyCalculateTypeBetween(String value1, String value2) {
            addCriterion("PENALTY_CALCULATE_TYPE between", value1, value2, "penaltyCalculateType");
            return (Criteria) this;
        }

        public Criteria andPenaltyCalculateTypeNotBetween(String value1, String value2) {
            addCriterion("PENALTY_CALCULATE_TYPE not between", value1, value2, "penaltyCalculateType");
            return (Criteria) this;
        }

        public Criteria andFeePayPeriodIsNull() {
            addCriterion("FEE_PAY_PERIOD is null");
            return (Criteria) this;
        }

        public Criteria andFeePayPeriodIsNotNull() {
            addCriterion("FEE_PAY_PERIOD is not null");
            return (Criteria) this;
        }

        public Criteria andFeePayPeriodEqualTo(BigDecimal value) {
            addCriterion("FEE_PAY_PERIOD =", value, "feePayPeriod");
            return (Criteria) this;
        }

        public Criteria andFeePayPeriodNotEqualTo(BigDecimal value) {
            addCriterion("FEE_PAY_PERIOD <>", value, "feePayPeriod");
            return (Criteria) this;
        }

        public Criteria andFeePayPeriodGreaterThan(BigDecimal value) {
            addCriterion("FEE_PAY_PERIOD >", value, "feePayPeriod");
            return (Criteria) this;
        }

        public Criteria andFeePayPeriodGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("FEE_PAY_PERIOD >=", value, "feePayPeriod");
            return (Criteria) this;
        }

        public Criteria andFeePayPeriodLessThan(BigDecimal value) {
            addCriterion("FEE_PAY_PERIOD <", value, "feePayPeriod");
            return (Criteria) this;
        }

        public Criteria andFeePayPeriodLessThanOrEqualTo(BigDecimal value) {
            addCriterion("FEE_PAY_PERIOD <=", value, "feePayPeriod");
            return (Criteria) this;
        }

        public Criteria andFeePayPeriodIn(List<BigDecimal> values) {
            addCriterion("FEE_PAY_PERIOD in", values, "feePayPeriod");
            return (Criteria) this;
        }

        public Criteria andFeePayPeriodNotIn(List<BigDecimal> values) {
            addCriterion("FEE_PAY_PERIOD not in", values, "feePayPeriod");
            return (Criteria) this;
        }

        public Criteria andFeePayPeriodBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("FEE_PAY_PERIOD between", value1, value2, "feePayPeriod");
            return (Criteria) this;
        }

        public Criteria andFeePayPeriodNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("FEE_PAY_PERIOD not between", value1, value2, "feePayPeriod");
            return (Criteria) this;
        }

        public Criteria andFeeHoldPeriodIsNull() {
            addCriterion("FEE_HOLD_PERIOD is null");
            return (Criteria) this;
        }

        public Criteria andFeeHoldPeriodIsNotNull() {
            addCriterion("FEE_HOLD_PERIOD is not null");
            return (Criteria) this;
        }

        public Criteria andFeeHoldPeriodEqualTo(BigDecimal value) {
            addCriterion("FEE_HOLD_PERIOD =", value, "feeHoldPeriod");
            return (Criteria) this;
        }

        public Criteria andFeeHoldPeriodNotEqualTo(BigDecimal value) {
            addCriterion("FEE_HOLD_PERIOD <>", value, "feeHoldPeriod");
            return (Criteria) this;
        }

        public Criteria andFeeHoldPeriodGreaterThan(BigDecimal value) {
            addCriterion("FEE_HOLD_PERIOD >", value, "feeHoldPeriod");
            return (Criteria) this;
        }

        public Criteria andFeeHoldPeriodGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("FEE_HOLD_PERIOD >=", value, "feeHoldPeriod");
            return (Criteria) this;
        }

        public Criteria andFeeHoldPeriodLessThan(BigDecimal value) {
            addCriterion("FEE_HOLD_PERIOD <", value, "feeHoldPeriod");
            return (Criteria) this;
        }

        public Criteria andFeeHoldPeriodLessThanOrEqualTo(BigDecimal value) {
            addCriterion("FEE_HOLD_PERIOD <=", value, "feeHoldPeriod");
            return (Criteria) this;
        }

        public Criteria andFeeHoldPeriodIn(List<BigDecimal> values) {
            addCriterion("FEE_HOLD_PERIOD in", values, "feeHoldPeriod");
            return (Criteria) this;
        }

        public Criteria andFeeHoldPeriodNotIn(List<BigDecimal> values) {
            addCriterion("FEE_HOLD_PERIOD not in", values, "feeHoldPeriod");
            return (Criteria) this;
        }

        public Criteria andFeeHoldPeriodBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("FEE_HOLD_PERIOD between", value1, value2, "feeHoldPeriod");
            return (Criteria) this;
        }

        public Criteria andFeeHoldPeriodNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("FEE_HOLD_PERIOD not between", value1, value2, "feeHoldPeriod");
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

        public Criteria andFeeChangePeriodIsNull() {
            addCriterion("FEE_CHANGE_PERIOD is null");
            return (Criteria) this;
        }

        public Criteria andFeeChangePeriodIsNotNull() {
            addCriterion("FEE_CHANGE_PERIOD is not null");
            return (Criteria) this;
        }

        public Criteria andFeeChangePeriodEqualTo(BigDecimal value) {
            addCriterion("FEE_CHANGE_PERIOD =", value, "feeChangePeriod");
            return (Criteria) this;
        }

        public Criteria andFeeChangePeriodNotEqualTo(BigDecimal value) {
            addCriterion("FEE_CHANGE_PERIOD <>", value, "feeChangePeriod");
            return (Criteria) this;
        }

        public Criteria andFeeChangePeriodGreaterThan(BigDecimal value) {
            addCriterion("FEE_CHANGE_PERIOD >", value, "feeChangePeriod");
            return (Criteria) this;
        }

        public Criteria andFeeChangePeriodGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("FEE_CHANGE_PERIOD >=", value, "feeChangePeriod");
            return (Criteria) this;
        }

        public Criteria andFeeChangePeriodLessThan(BigDecimal value) {
            addCriterion("FEE_CHANGE_PERIOD <", value, "feeChangePeriod");
            return (Criteria) this;
        }

        public Criteria andFeeChangePeriodLessThanOrEqualTo(BigDecimal value) {
            addCriterion("FEE_CHANGE_PERIOD <=", value, "feeChangePeriod");
            return (Criteria) this;
        }

        public Criteria andFeeChangePeriodIn(List<BigDecimal> values) {
            addCriterion("FEE_CHANGE_PERIOD in", values, "feeChangePeriod");
            return (Criteria) this;
        }

        public Criteria andFeeChangePeriodNotIn(List<BigDecimal> values) {
            addCriterion("FEE_CHANGE_PERIOD not in", values, "feeChangePeriod");
            return (Criteria) this;
        }

        public Criteria andFeeChangePeriodBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("FEE_CHANGE_PERIOD between", value1, value2, "feeChangePeriod");
            return (Criteria) this;
        }

        public Criteria andFeeChangePeriodNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("FEE_CHANGE_PERIOD not between", value1, value2, "feeChangePeriod");
            return (Criteria) this;
        }

        public Criteria andFeeChangeCalculateIsNull() {
            addCriterion("FEE_CHANGE_CALCULATE is null");
            return (Criteria) this;
        }

        public Criteria andFeeChangeCalculateIsNotNull() {
            addCriterion("FEE_CHANGE_CALCULATE is not null");
            return (Criteria) this;
        }

        public Criteria andFeeChangeCalculateEqualTo(String value) {
            addCriterion("FEE_CHANGE_CALCULATE =", value, "feeChangeCalculate");
            return (Criteria) this;
        }

        public Criteria andFeeChangeCalculateNotEqualTo(String value) {
            addCriterion("FEE_CHANGE_CALCULATE <>", value, "feeChangeCalculate");
            return (Criteria) this;
        }

        public Criteria andFeeChangeCalculateGreaterThan(String value) {
            addCriterion("FEE_CHANGE_CALCULATE >", value, "feeChangeCalculate");
            return (Criteria) this;
        }

        public Criteria andFeeChangeCalculateGreaterThanOrEqualTo(String value) {
            addCriterion("FEE_CHANGE_CALCULATE >=", value, "feeChangeCalculate");
            return (Criteria) this;
        }

        public Criteria andFeeChangeCalculateLessThan(String value) {
            addCriterion("FEE_CHANGE_CALCULATE <", value, "feeChangeCalculate");
            return (Criteria) this;
        }

        public Criteria andFeeChangeCalculateLessThanOrEqualTo(String value) {
            addCriterion("FEE_CHANGE_CALCULATE <=", value, "feeChangeCalculate");
            return (Criteria) this;
        }

        public Criteria andFeeChangeCalculateLike(String value) {
            addCriterion("FEE_CHANGE_CALCULATE like", value, "feeChangeCalculate");
            return (Criteria) this;
        }

        public Criteria andFeeChangeCalculateNotLike(String value) {
            addCriterion("FEE_CHANGE_CALCULATE not like", value, "feeChangeCalculate");
            return (Criteria) this;
        }

        public Criteria andFeeChangeCalculateIn(List<String> values) {
            addCriterion("FEE_CHANGE_CALCULATE in", values, "feeChangeCalculate");
            return (Criteria) this;
        }

        public Criteria andFeeChangeCalculateNotIn(List<String> values) {
            addCriterion("FEE_CHANGE_CALCULATE not in", values, "feeChangeCalculate");
            return (Criteria) this;
        }

        public Criteria andFeeChangeCalculateBetween(String value1, String value2) {
            addCriterion("FEE_CHANGE_CALCULATE between", value1, value2, "feeChangeCalculate");
            return (Criteria) this;
        }

        public Criteria andFeeChangeCalculateNotBetween(String value1, String value2) {
            addCriterion("FEE_CHANGE_CALCULATE not between", value1, value2, "feeChangeCalculate");
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