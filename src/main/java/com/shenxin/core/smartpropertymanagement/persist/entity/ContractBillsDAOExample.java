package com.shenxin.core.smartpropertymanagement.persist.entity;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class ContractBillsDAOExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ContractBillsDAOExample() {
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

        public Criteria andBillAmountIsNull() {
            addCriterion("BILL_AMOUNT is null");
            return (Criteria) this;
        }

        public Criteria andBillAmountIsNotNull() {
            addCriterion("BILL_AMOUNT is not null");
            return (Criteria) this;
        }

        public Criteria andBillAmountEqualTo(BigDecimal value) {
            addCriterion("BILL_AMOUNT =", value, "billAmount");
            return (Criteria) this;
        }

        public Criteria andBillAmountNotEqualTo(BigDecimal value) {
            addCriterion("BILL_AMOUNT <>", value, "billAmount");
            return (Criteria) this;
        }

        public Criteria andBillAmountGreaterThan(BigDecimal value) {
            addCriterion("BILL_AMOUNT >", value, "billAmount");
            return (Criteria) this;
        }

        public Criteria andBillAmountGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("BILL_AMOUNT >=", value, "billAmount");
            return (Criteria) this;
        }

        public Criteria andBillAmountLessThan(BigDecimal value) {
            addCriterion("BILL_AMOUNT <", value, "billAmount");
            return (Criteria) this;
        }

        public Criteria andBillAmountLessThanOrEqualTo(BigDecimal value) {
            addCriterion("BILL_AMOUNT <=", value, "billAmount");
            return (Criteria) this;
        }

        public Criteria andBillAmountIn(List<BigDecimal> values) {
            addCriterion("BILL_AMOUNT in", values, "billAmount");
            return (Criteria) this;
        }

        public Criteria andBillAmountNotIn(List<BigDecimal> values) {
            addCriterion("BILL_AMOUNT not in", values, "billAmount");
            return (Criteria) this;
        }

        public Criteria andBillAmountBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("BILL_AMOUNT between", value1, value2, "billAmount");
            return (Criteria) this;
        }

        public Criteria andBillAmountNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("BILL_AMOUNT not between", value1, value2, "billAmount");
            return (Criteria) this;
        }

        public Criteria andPenaltyAmountIsNull() {
            addCriterion("PENALTY_AMOUNT is null");
            return (Criteria) this;
        }

        public Criteria andPenaltyAmountIsNotNull() {
            addCriterion("PENALTY_AMOUNT is not null");
            return (Criteria) this;
        }

        public Criteria andPenaltyAmountEqualTo(BigDecimal value) {
            addCriterion("PENALTY_AMOUNT =", value, "penaltyAmount");
            return (Criteria) this;
        }

        public Criteria andPenaltyAmountNotEqualTo(BigDecimal value) {
            addCriterion("PENALTY_AMOUNT <>", value, "penaltyAmount");
            return (Criteria) this;
        }

        public Criteria andPenaltyAmountGreaterThan(BigDecimal value) {
            addCriterion("PENALTY_AMOUNT >", value, "penaltyAmount");
            return (Criteria) this;
        }

        public Criteria andPenaltyAmountGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("PENALTY_AMOUNT >=", value, "penaltyAmount");
            return (Criteria) this;
        }

        public Criteria andPenaltyAmountLessThan(BigDecimal value) {
            addCriterion("PENALTY_AMOUNT <", value, "penaltyAmount");
            return (Criteria) this;
        }

        public Criteria andPenaltyAmountLessThanOrEqualTo(BigDecimal value) {
            addCriterion("PENALTY_AMOUNT <=", value, "penaltyAmount");
            return (Criteria) this;
        }

        public Criteria andPenaltyAmountIn(List<BigDecimal> values) {
            addCriterion("PENALTY_AMOUNT in", values, "penaltyAmount");
            return (Criteria) this;
        }

        public Criteria andPenaltyAmountNotIn(List<BigDecimal> values) {
            addCriterion("PENALTY_AMOUNT not in", values, "penaltyAmount");
            return (Criteria) this;
        }

        public Criteria andPenaltyAmountBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("PENALTY_AMOUNT between", value1, value2, "penaltyAmount");
            return (Criteria) this;
        }

        public Criteria andPenaltyAmountNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("PENALTY_AMOUNT not between", value1, value2, "penaltyAmount");
            return (Criteria) this;
        }

        public Criteria andDiscountAmountIsNull() {
            addCriterion("DISCOUNT_AMOUNT is null");
            return (Criteria) this;
        }

        public Criteria andDiscountAmountIsNotNull() {
            addCriterion("DISCOUNT_AMOUNT is not null");
            return (Criteria) this;
        }

        public Criteria andDiscountAmountEqualTo(BigDecimal value) {
            addCriterion("DISCOUNT_AMOUNT =", value, "discountAmount");
            return (Criteria) this;
        }

        public Criteria andDiscountAmountNotEqualTo(BigDecimal value) {
            addCriterion("DISCOUNT_AMOUNT <>", value, "discountAmount");
            return (Criteria) this;
        }

        public Criteria andDiscountAmountGreaterThan(BigDecimal value) {
            addCriterion("DISCOUNT_AMOUNT >", value, "discountAmount");
            return (Criteria) this;
        }

        public Criteria andDiscountAmountGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("DISCOUNT_AMOUNT >=", value, "discountAmount");
            return (Criteria) this;
        }

        public Criteria andDiscountAmountLessThan(BigDecimal value) {
            addCriterion("DISCOUNT_AMOUNT <", value, "discountAmount");
            return (Criteria) this;
        }

        public Criteria andDiscountAmountLessThanOrEqualTo(BigDecimal value) {
            addCriterion("DISCOUNT_AMOUNT <=", value, "discountAmount");
            return (Criteria) this;
        }

        public Criteria andDiscountAmountIn(List<BigDecimal> values) {
            addCriterion("DISCOUNT_AMOUNT in", values, "discountAmount");
            return (Criteria) this;
        }

        public Criteria andDiscountAmountNotIn(List<BigDecimal> values) {
            addCriterion("DISCOUNT_AMOUNT not in", values, "discountAmount");
            return (Criteria) this;
        }

        public Criteria andDiscountAmountBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("DISCOUNT_AMOUNT between", value1, value2, "discountAmount");
            return (Criteria) this;
        }

        public Criteria andDiscountAmountNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("DISCOUNT_AMOUNT not between", value1, value2, "discountAmount");
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

        public Criteria andNeedPayAmountIsNull() {
            addCriterion("NEED_PAY_AMOUNT is null");
            return (Criteria) this;
        }

        public Criteria andNeedPayAmountIsNotNull() {
            addCriterion("NEED_PAY_AMOUNT is not null");
            return (Criteria) this;
        }

        public Criteria andNeedPayAmountEqualTo(BigDecimal value) {
            addCriterion("NEED_PAY_AMOUNT =", value, "needPayAmount");
            return (Criteria) this;
        }

        public Criteria andNeedPayAmountNotEqualTo(BigDecimal value) {
            addCriterion("NEED_PAY_AMOUNT <>", value, "needPayAmount");
            return (Criteria) this;
        }

        public Criteria andNeedPayAmountGreaterThan(BigDecimal value) {
            addCriterion("NEED_PAY_AMOUNT >", value, "needPayAmount");
            return (Criteria) this;
        }

        public Criteria andNeedPayAmountGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("NEED_PAY_AMOUNT >=", value, "needPayAmount");
            return (Criteria) this;
        }

        public Criteria andNeedPayAmountLessThan(BigDecimal value) {
            addCriterion("NEED_PAY_AMOUNT <", value, "needPayAmount");
            return (Criteria) this;
        }

        public Criteria andNeedPayAmountLessThanOrEqualTo(BigDecimal value) {
            addCriterion("NEED_PAY_AMOUNT <=", value, "needPayAmount");
            return (Criteria) this;
        }

        public Criteria andNeedPayAmountIn(List<BigDecimal> values) {
            addCriterion("NEED_PAY_AMOUNT in", values, "needPayAmount");
            return (Criteria) this;
        }

        public Criteria andNeedPayAmountNotIn(List<BigDecimal> values) {
            addCriterion("NEED_PAY_AMOUNT not in", values, "needPayAmount");
            return (Criteria) this;
        }

        public Criteria andNeedPayAmountBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("NEED_PAY_AMOUNT between", value1, value2, "needPayAmount");
            return (Criteria) this;
        }

        public Criteria andNeedPayAmountNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("NEED_PAY_AMOUNT not between", value1, value2, "needPayAmount");
            return (Criteria) this;
        }

        public Criteria andPayAmountIsNull() {
            addCriterion("PAY_AMOUNT is null");
            return (Criteria) this;
        }

        public Criteria andPayAmountIsNotNull() {
            addCriterion("PAY_AMOUNT is not null");
            return (Criteria) this;
        }

        public Criteria andPayAmountEqualTo(BigDecimal value) {
            addCriterion("PAY_AMOUNT =", value, "payAmount");
            return (Criteria) this;
        }

        public Criteria andPayAmountNotEqualTo(BigDecimal value) {
            addCriterion("PAY_AMOUNT <>", value, "payAmount");
            return (Criteria) this;
        }

        public Criteria andPayAmountGreaterThan(BigDecimal value) {
            addCriterion("PAY_AMOUNT >", value, "payAmount");
            return (Criteria) this;
        }

        public Criteria andPayAmountGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("PAY_AMOUNT >=", value, "payAmount");
            return (Criteria) this;
        }

        public Criteria andPayAmountLessThan(BigDecimal value) {
            addCriterion("PAY_AMOUNT <", value, "payAmount");
            return (Criteria) this;
        }

        public Criteria andPayAmountLessThanOrEqualTo(BigDecimal value) {
            addCriterion("PAY_AMOUNT <=", value, "payAmount");
            return (Criteria) this;
        }

        public Criteria andPayAmountIn(List<BigDecimal> values) {
            addCriterion("PAY_AMOUNT in", values, "payAmount");
            return (Criteria) this;
        }

        public Criteria andPayAmountNotIn(List<BigDecimal> values) {
            addCriterion("PAY_AMOUNT not in", values, "payAmount");
            return (Criteria) this;
        }

        public Criteria andPayAmountBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("PAY_AMOUNT between", value1, value2, "payAmount");
            return (Criteria) this;
        }

        public Criteria andPayAmountNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("PAY_AMOUNT not between", value1, value2, "payAmount");
            return (Criteria) this;
        }

        public Criteria andBillStatusIsNull() {
            addCriterion("BILL_STATUS is null");
            return (Criteria) this;
        }

        public Criteria andBillStatusIsNotNull() {
            addCriterion("BILL_STATUS is not null");
            return (Criteria) this;
        }

        public Criteria andBillStatusEqualTo(String value) {
            addCriterion("BILL_STATUS =", value, "billStatus");
            return (Criteria) this;
        }

        public Criteria andBillStatusNotEqualTo(String value) {
            addCriterion("BILL_STATUS <>", value, "billStatus");
            return (Criteria) this;
        }

        public Criteria andBillStatusGreaterThan(String value) {
            addCriterion("BILL_STATUS >", value, "billStatus");
            return (Criteria) this;
        }

        public Criteria andBillStatusGreaterThanOrEqualTo(String value) {
            addCriterion("BILL_STATUS >=", value, "billStatus");
            return (Criteria) this;
        }

        public Criteria andBillStatusLessThan(String value) {
            addCriterion("BILL_STATUS <", value, "billStatus");
            return (Criteria) this;
        }

        public Criteria andBillStatusLessThanOrEqualTo(String value) {
            addCriterion("BILL_STATUS <=", value, "billStatus");
            return (Criteria) this;
        }

        public Criteria andBillStatusLike(String value) {
            addCriterion("BILL_STATUS like", value, "billStatus");
            return (Criteria) this;
        }

        public Criteria andBillStatusNotLike(String value) {
            addCriterion("BILL_STATUS not like", value, "billStatus");
            return (Criteria) this;
        }

        public Criteria andBillStatusIn(List<String> values) {
            addCriterion("BILL_STATUS in", values, "billStatus");
            return (Criteria) this;
        }

        public Criteria andBillStatusNotIn(List<String> values) {
            addCriterion("BILL_STATUS not in", values, "billStatus");
            return (Criteria) this;
        }

        public Criteria andBillStatusBetween(String value1, String value2) {
            addCriterion("BILL_STATUS between", value1, value2, "billStatus");
            return (Criteria) this;
        }

        public Criteria andBillStatusNotBetween(String value1, String value2) {
            addCriterion("BILL_STATUS not between", value1, value2, "billStatus");
            return (Criteria) this;
        }

        public Criteria andBillRemarkIsNull() {
            addCriterion("BILL_REMARK is null");
            return (Criteria) this;
        }

        public Criteria andBillRemarkIsNotNull() {
            addCriterion("BILL_REMARK is not null");
            return (Criteria) this;
        }

        public Criteria andBillRemarkEqualTo(String value) {
            addCriterion("BILL_REMARK =", value, "billRemark");
            return (Criteria) this;
        }

        public Criteria andBillRemarkNotEqualTo(String value) {
            addCriterion("BILL_REMARK <>", value, "billRemark");
            return (Criteria) this;
        }

        public Criteria andBillRemarkGreaterThan(String value) {
            addCriterion("BILL_REMARK >", value, "billRemark");
            return (Criteria) this;
        }

        public Criteria andBillRemarkGreaterThanOrEqualTo(String value) {
            addCriterion("BILL_REMARK >=", value, "billRemark");
            return (Criteria) this;
        }

        public Criteria andBillRemarkLessThan(String value) {
            addCriterion("BILL_REMARK <", value, "billRemark");
            return (Criteria) this;
        }

        public Criteria andBillRemarkLessThanOrEqualTo(String value) {
            addCriterion("BILL_REMARK <=", value, "billRemark");
            return (Criteria) this;
        }

        public Criteria andBillRemarkLike(String value) {
            addCriterion("BILL_REMARK like", value, "billRemark");
            return (Criteria) this;
        }

        public Criteria andBillRemarkNotLike(String value) {
            addCriterion("BILL_REMARK not like", value, "billRemark");
            return (Criteria) this;
        }

        public Criteria andBillRemarkIn(List<String> values) {
            addCriterion("BILL_REMARK in", values, "billRemark");
            return (Criteria) this;
        }

        public Criteria andBillRemarkNotIn(List<String> values) {
            addCriterion("BILL_REMARK not in", values, "billRemark");
            return (Criteria) this;
        }

        public Criteria andBillRemarkBetween(String value1, String value2) {
            addCriterion("BILL_REMARK between", value1, value2, "billRemark");
            return (Criteria) this;
        }

        public Criteria andBillRemarkNotBetween(String value1, String value2) {
            addCriterion("BILL_REMARK not between", value1, value2, "billRemark");
            return (Criteria) this;
        }

        public Criteria andNotifyStatusIsNull() {
            addCriterion("NOTIFY_STATUS is null");
            return (Criteria) this;
        }

        public Criteria andNotifyStatusIsNotNull() {
            addCriterion("NOTIFY_STATUS is not null");
            return (Criteria) this;
        }

        public Criteria andNotifyStatusEqualTo(String value) {
            addCriterion("NOTIFY_STATUS =", value, "notifyStatus");
            return (Criteria) this;
        }

        public Criteria andNotifyStatusNotEqualTo(String value) {
            addCriterion("NOTIFY_STATUS <>", value, "notifyStatus");
            return (Criteria) this;
        }

        public Criteria andNotifyStatusGreaterThan(String value) {
            addCriterion("NOTIFY_STATUS >", value, "notifyStatus");
            return (Criteria) this;
        }

        public Criteria andNotifyStatusGreaterThanOrEqualTo(String value) {
            addCriterion("NOTIFY_STATUS >=", value, "notifyStatus");
            return (Criteria) this;
        }

        public Criteria andNotifyStatusLessThan(String value) {
            addCriterion("NOTIFY_STATUS <", value, "notifyStatus");
            return (Criteria) this;
        }

        public Criteria andNotifyStatusLessThanOrEqualTo(String value) {
            addCriterion("NOTIFY_STATUS <=", value, "notifyStatus");
            return (Criteria) this;
        }

        public Criteria andNotifyStatusLike(String value) {
            addCriterion("NOTIFY_STATUS like", value, "notifyStatus");
            return (Criteria) this;
        }

        public Criteria andNotifyStatusNotLike(String value) {
            addCriterion("NOTIFY_STATUS not like", value, "notifyStatus");
            return (Criteria) this;
        }

        public Criteria andNotifyStatusIn(List<String> values) {
            addCriterion("NOTIFY_STATUS in", values, "notifyStatus");
            return (Criteria) this;
        }

        public Criteria andNotifyStatusNotIn(List<String> values) {
            addCriterion("NOTIFY_STATUS not in", values, "notifyStatus");
            return (Criteria) this;
        }

        public Criteria andNotifyStatusBetween(String value1, String value2) {
            addCriterion("NOTIFY_STATUS between", value1, value2, "notifyStatus");
            return (Criteria) this;
        }

        public Criteria andNotifyStatusNotBetween(String value1, String value2) {
            addCriterion("NOTIFY_STATUS not between", value1, value2, "notifyStatus");
            return (Criteria) this;
        }

        public Criteria andPromptStatusIsNull() {
            addCriterion("PROMPT_STATUS is null");
            return (Criteria) this;
        }

        public Criteria andPromptStatusIsNotNull() {
            addCriterion("PROMPT_STATUS is not null");
            return (Criteria) this;
        }

        public Criteria andPromptStatusEqualTo(String value) {
            addCriterion("PROMPT_STATUS =", value, "promptStatus");
            return (Criteria) this;
        }

        public Criteria andPromptStatusNotEqualTo(String value) {
            addCriterion("PROMPT_STATUS <>", value, "promptStatus");
            return (Criteria) this;
        }

        public Criteria andPromptStatusGreaterThan(String value) {
            addCriterion("PROMPT_STATUS >", value, "promptStatus");
            return (Criteria) this;
        }

        public Criteria andPromptStatusGreaterThanOrEqualTo(String value) {
            addCriterion("PROMPT_STATUS >=", value, "promptStatus");
            return (Criteria) this;
        }

        public Criteria andPromptStatusLessThan(String value) {
            addCriterion("PROMPT_STATUS <", value, "promptStatus");
            return (Criteria) this;
        }

        public Criteria andPromptStatusLessThanOrEqualTo(String value) {
            addCriterion("PROMPT_STATUS <=", value, "promptStatus");
            return (Criteria) this;
        }

        public Criteria andPromptStatusLike(String value) {
            addCriterion("PROMPT_STATUS like", value, "promptStatus");
            return (Criteria) this;
        }

        public Criteria andPromptStatusNotLike(String value) {
            addCriterion("PROMPT_STATUS not like", value, "promptStatus");
            return (Criteria) this;
        }

        public Criteria andPromptStatusIn(List<String> values) {
            addCriterion("PROMPT_STATUS in", values, "promptStatus");
            return (Criteria) this;
        }

        public Criteria andPromptStatusNotIn(List<String> values) {
            addCriterion("PROMPT_STATUS not in", values, "promptStatus");
            return (Criteria) this;
        }

        public Criteria andPromptStatusBetween(String value1, String value2) {
            addCriterion("PROMPT_STATUS between", value1, value2, "promptStatus");
            return (Criteria) this;
        }

        public Criteria andPromptStatusNotBetween(String value1, String value2) {
            addCriterion("PROMPT_STATUS not between", value1, value2, "promptStatus");
            return (Criteria) this;
        }

        public Criteria andNotifyTimesIsNull() {
            addCriterion("NOTIFY_TIMES is null");
            return (Criteria) this;
        }

        public Criteria andNotifyTimesIsNotNull() {
            addCriterion("NOTIFY_TIMES is not null");
            return (Criteria) this;
        }

        public Criteria andNotifyTimesEqualTo(BigDecimal value) {
            addCriterion("NOTIFY_TIMES =", value, "notifyTimes");
            return (Criteria) this;
        }

        public Criteria andNotifyTimesNotEqualTo(BigDecimal value) {
            addCriterion("NOTIFY_TIMES <>", value, "notifyTimes");
            return (Criteria) this;
        }

        public Criteria andNotifyTimesGreaterThan(BigDecimal value) {
            addCriterion("NOTIFY_TIMES >", value, "notifyTimes");
            return (Criteria) this;
        }

        public Criteria andNotifyTimesGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("NOTIFY_TIMES >=", value, "notifyTimes");
            return (Criteria) this;
        }

        public Criteria andNotifyTimesLessThan(BigDecimal value) {
            addCriterion("NOTIFY_TIMES <", value, "notifyTimes");
            return (Criteria) this;
        }

        public Criteria andNotifyTimesLessThanOrEqualTo(BigDecimal value) {
            addCriterion("NOTIFY_TIMES <=", value, "notifyTimes");
            return (Criteria) this;
        }

        public Criteria andNotifyTimesIn(List<BigDecimal> values) {
            addCriterion("NOTIFY_TIMES in", values, "notifyTimes");
            return (Criteria) this;
        }

        public Criteria andNotifyTimesNotIn(List<BigDecimal> values) {
            addCriterion("NOTIFY_TIMES not in", values, "notifyTimes");
            return (Criteria) this;
        }

        public Criteria andNotifyTimesBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("NOTIFY_TIMES between", value1, value2, "notifyTimes");
            return (Criteria) this;
        }

        public Criteria andNotifyTimesNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("NOTIFY_TIMES not between", value1, value2, "notifyTimes");
            return (Criteria) this;
        }

        public Criteria andLastNotifyTimeIsNull() {
            addCriterion("LAST_NOTIFY_TIME is null");
            return (Criteria) this;
        }

        public Criteria andLastNotifyTimeIsNotNull() {
            addCriterion("LAST_NOTIFY_TIME is not null");
            return (Criteria) this;
        }

        public Criteria andLastNotifyTimeEqualTo(String value) {
            addCriterion("LAST_NOTIFY_TIME =", value, "lastNotifyTime");
            return (Criteria) this;
        }

        public Criteria andLastNotifyTimeNotEqualTo(String value) {
            addCriterion("LAST_NOTIFY_TIME <>", value, "lastNotifyTime");
            return (Criteria) this;
        }

        public Criteria andLastNotifyTimeGreaterThan(String value) {
            addCriterion("LAST_NOTIFY_TIME >", value, "lastNotifyTime");
            return (Criteria) this;
        }

        public Criteria andLastNotifyTimeGreaterThanOrEqualTo(String value) {
            addCriterion("LAST_NOTIFY_TIME >=", value, "lastNotifyTime");
            return (Criteria) this;
        }

        public Criteria andLastNotifyTimeLessThan(String value) {
            addCriterion("LAST_NOTIFY_TIME <", value, "lastNotifyTime");
            return (Criteria) this;
        }

        public Criteria andLastNotifyTimeLessThanOrEqualTo(String value) {
            addCriterion("LAST_NOTIFY_TIME <=", value, "lastNotifyTime");
            return (Criteria) this;
        }

        public Criteria andLastNotifyTimeLike(String value) {
            addCriterion("LAST_NOTIFY_TIME like", value, "lastNotifyTime");
            return (Criteria) this;
        }

        public Criteria andLastNotifyTimeNotLike(String value) {
            addCriterion("LAST_NOTIFY_TIME not like", value, "lastNotifyTime");
            return (Criteria) this;
        }

        public Criteria andLastNotifyTimeIn(List<String> values) {
            addCriterion("LAST_NOTIFY_TIME in", values, "lastNotifyTime");
            return (Criteria) this;
        }

        public Criteria andLastNotifyTimeNotIn(List<String> values) {
            addCriterion("LAST_NOTIFY_TIME not in", values, "lastNotifyTime");
            return (Criteria) this;
        }

        public Criteria andLastNotifyTimeBetween(String value1, String value2) {
            addCriterion("LAST_NOTIFY_TIME between", value1, value2, "lastNotifyTime");
            return (Criteria) this;
        }

        public Criteria andLastNotifyTimeNotBetween(String value1, String value2) {
            addCriterion("LAST_NOTIFY_TIME not between", value1, value2, "lastNotifyTime");
            return (Criteria) this;
        }

        public Criteria andPromptTimesIsNull() {
            addCriterion("PROMPT_TIMES is null");
            return (Criteria) this;
        }

        public Criteria andPromptTimesIsNotNull() {
            addCriterion("PROMPT_TIMES is not null");
            return (Criteria) this;
        }

        public Criteria andPromptTimesEqualTo(BigDecimal value) {
            addCriterion("PROMPT_TIMES =", value, "promptTimes");
            return (Criteria) this;
        }

        public Criteria andPromptTimesNotEqualTo(BigDecimal value) {
            addCriterion("PROMPT_TIMES <>", value, "promptTimes");
            return (Criteria) this;
        }

        public Criteria andPromptTimesGreaterThan(BigDecimal value) {
            addCriterion("PROMPT_TIMES >", value, "promptTimes");
            return (Criteria) this;
        }

        public Criteria andPromptTimesGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("PROMPT_TIMES >=", value, "promptTimes");
            return (Criteria) this;
        }

        public Criteria andPromptTimesLessThan(BigDecimal value) {
            addCriterion("PROMPT_TIMES <", value, "promptTimes");
            return (Criteria) this;
        }

        public Criteria andPromptTimesLessThanOrEqualTo(BigDecimal value) {
            addCriterion("PROMPT_TIMES <=", value, "promptTimes");
            return (Criteria) this;
        }

        public Criteria andPromptTimesIn(List<BigDecimal> values) {
            addCriterion("PROMPT_TIMES in", values, "promptTimes");
            return (Criteria) this;
        }

        public Criteria andPromptTimesNotIn(List<BigDecimal> values) {
            addCriterion("PROMPT_TIMES not in", values, "promptTimes");
            return (Criteria) this;
        }

        public Criteria andPromptTimesBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("PROMPT_TIMES between", value1, value2, "promptTimes");
            return (Criteria) this;
        }

        public Criteria andPromptTimesNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("PROMPT_TIMES not between", value1, value2, "promptTimes");
            return (Criteria) this;
        }

        public Criteria andLastPromptTimeIsNull() {
            addCriterion("LAST_PROMPT_TIME is null");
            return (Criteria) this;
        }

        public Criteria andLastPromptTimeIsNotNull() {
            addCriterion("LAST_PROMPT_TIME is not null");
            return (Criteria) this;
        }

        public Criteria andLastPromptTimeEqualTo(String value) {
            addCriterion("LAST_PROMPT_TIME =", value, "lastPromptTime");
            return (Criteria) this;
        }

        public Criteria andLastPromptTimeNotEqualTo(String value) {
            addCriterion("LAST_PROMPT_TIME <>", value, "lastPromptTime");
            return (Criteria) this;
        }

        public Criteria andLastPromptTimeGreaterThan(String value) {
            addCriterion("LAST_PROMPT_TIME >", value, "lastPromptTime");
            return (Criteria) this;
        }

        public Criteria andLastPromptTimeGreaterThanOrEqualTo(String value) {
            addCriterion("LAST_PROMPT_TIME >=", value, "lastPromptTime");
            return (Criteria) this;
        }

        public Criteria andLastPromptTimeLessThan(String value) {
            addCriterion("LAST_PROMPT_TIME <", value, "lastPromptTime");
            return (Criteria) this;
        }

        public Criteria andLastPromptTimeLessThanOrEqualTo(String value) {
            addCriterion("LAST_PROMPT_TIME <=", value, "lastPromptTime");
            return (Criteria) this;
        }

        public Criteria andLastPromptTimeLike(String value) {
            addCriterion("LAST_PROMPT_TIME like", value, "lastPromptTime");
            return (Criteria) this;
        }

        public Criteria andLastPromptTimeNotLike(String value) {
            addCriterion("LAST_PROMPT_TIME not like", value, "lastPromptTime");
            return (Criteria) this;
        }

        public Criteria andLastPromptTimeIn(List<String> values) {
            addCriterion("LAST_PROMPT_TIME in", values, "lastPromptTime");
            return (Criteria) this;
        }

        public Criteria andLastPromptTimeNotIn(List<String> values) {
            addCriterion("LAST_PROMPT_TIME not in", values, "lastPromptTime");
            return (Criteria) this;
        }

        public Criteria andLastPromptTimeBetween(String value1, String value2) {
            addCriterion("LAST_PROMPT_TIME between", value1, value2, "lastPromptTime");
            return (Criteria) this;
        }

        public Criteria andLastPromptTimeNotBetween(String value1, String value2) {
            addCriterion("LAST_PROMPT_TIME not between", value1, value2, "lastPromptTime");
            return (Criteria) this;
        }

        public Criteria andPaymentRecordIdIsNull() {
            addCriterion("PAYMENT_RECORD_ID is null");
            return (Criteria) this;
        }

        public Criteria andPaymentRecordIdIsNotNull() {
            addCriterion("PAYMENT_RECORD_ID is not null");
            return (Criteria) this;
        }

        public Criteria andPaymentRecordIdEqualTo(BigDecimal value) {
            addCriterion("PAYMENT_RECORD_ID =", value, "paymentRecordId");
            return (Criteria) this;
        }

        public Criteria andPaymentRecordIdNotEqualTo(BigDecimal value) {
            addCriterion("PAYMENT_RECORD_ID <>", value, "paymentRecordId");
            return (Criteria) this;
        }

        public Criteria andPaymentRecordIdGreaterThan(BigDecimal value) {
            addCriterion("PAYMENT_RECORD_ID >", value, "paymentRecordId");
            return (Criteria) this;
        }

        public Criteria andPaymentRecordIdGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("PAYMENT_RECORD_ID >=", value, "paymentRecordId");
            return (Criteria) this;
        }

        public Criteria andPaymentRecordIdLessThan(BigDecimal value) {
            addCriterion("PAYMENT_RECORD_ID <", value, "paymentRecordId");
            return (Criteria) this;
        }

        public Criteria andPaymentRecordIdLessThanOrEqualTo(BigDecimal value) {
            addCriterion("PAYMENT_RECORD_ID <=", value, "paymentRecordId");
            return (Criteria) this;
        }

        public Criteria andPaymentRecordIdIn(List<BigDecimal> values) {
            addCriterion("PAYMENT_RECORD_ID in", values, "paymentRecordId");
            return (Criteria) this;
        }

        public Criteria andPaymentRecordIdNotIn(List<BigDecimal> values) {
            addCriterion("PAYMENT_RECORD_ID not in", values, "paymentRecordId");
            return (Criteria) this;
        }

        public Criteria andPaymentRecordIdBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("PAYMENT_RECORD_ID between", value1, value2, "paymentRecordId");
            return (Criteria) this;
        }

        public Criteria andPaymentRecordIdNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("PAYMENT_RECORD_ID not between", value1, value2, "paymentRecordId");
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