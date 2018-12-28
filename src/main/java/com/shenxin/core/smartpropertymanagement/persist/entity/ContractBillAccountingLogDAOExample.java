package com.shenxin.core.smartpropertymanagement.persist.entity;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class ContractBillAccountingLogDAOExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ContractBillAccountingLogDAOExample() {
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

        public Criteria andContractBillIdIsNull() {
            addCriterion("CONTRACT_BILL_ID is null");
            return (Criteria) this;
        }

        public Criteria andContractBillIdIsNotNull() {
            addCriterion("CONTRACT_BILL_ID is not null");
            return (Criteria) this;
        }

        public Criteria andContractBillIdEqualTo(BigDecimal value) {
            addCriterion("CONTRACT_BILL_ID =", value, "contractBillId");
            return (Criteria) this;
        }

        public Criteria andContractBillIdNotEqualTo(BigDecimal value) {
            addCriterion("CONTRACT_BILL_ID <>", value, "contractBillId");
            return (Criteria) this;
        }

        public Criteria andContractBillIdGreaterThan(BigDecimal value) {
            addCriterion("CONTRACT_BILL_ID >", value, "contractBillId");
            return (Criteria) this;
        }

        public Criteria andContractBillIdGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("CONTRACT_BILL_ID >=", value, "contractBillId");
            return (Criteria) this;
        }

        public Criteria andContractBillIdLessThan(BigDecimal value) {
            addCriterion("CONTRACT_BILL_ID <", value, "contractBillId");
            return (Criteria) this;
        }

        public Criteria andContractBillIdLessThanOrEqualTo(BigDecimal value) {
            addCriterion("CONTRACT_BILL_ID <=", value, "contractBillId");
            return (Criteria) this;
        }

        public Criteria andContractBillIdIn(List<BigDecimal> values) {
            addCriterion("CONTRACT_BILL_ID in", values, "contractBillId");
            return (Criteria) this;
        }

        public Criteria andContractBillIdNotIn(List<BigDecimal> values) {
            addCriterion("CONTRACT_BILL_ID not in", values, "contractBillId");
            return (Criteria) this;
        }

        public Criteria andContractBillIdBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("CONTRACT_BILL_ID between", value1, value2, "contractBillId");
            return (Criteria) this;
        }

        public Criteria andContractBillIdNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("CONTRACT_BILL_ID not between", value1, value2, "contractBillId");
            return (Criteria) this;
        }

        public Criteria andAccountingTypeIsNull() {
            addCriterion("ACCOUNTING_TYPE is null");
            return (Criteria) this;
        }

        public Criteria andAccountingTypeIsNotNull() {
            addCriterion("ACCOUNTING_TYPE is not null");
            return (Criteria) this;
        }

        public Criteria andAccountingTypeEqualTo(String value) {
            addCriterion("ACCOUNTING_TYPE =", value, "accountingType");
            return (Criteria) this;
        }

        public Criteria andAccountingTypeNotEqualTo(String value) {
            addCriterion("ACCOUNTING_TYPE <>", value, "accountingType");
            return (Criteria) this;
        }

        public Criteria andAccountingTypeGreaterThan(String value) {
            addCriterion("ACCOUNTING_TYPE >", value, "accountingType");
            return (Criteria) this;
        }

        public Criteria andAccountingTypeGreaterThanOrEqualTo(String value) {
            addCriterion("ACCOUNTING_TYPE >=", value, "accountingType");
            return (Criteria) this;
        }

        public Criteria andAccountingTypeLessThan(String value) {
            addCriterion("ACCOUNTING_TYPE <", value, "accountingType");
            return (Criteria) this;
        }

        public Criteria andAccountingTypeLessThanOrEqualTo(String value) {
            addCriterion("ACCOUNTING_TYPE <=", value, "accountingType");
            return (Criteria) this;
        }

        public Criteria andAccountingTypeLike(String value) {
            addCriterion("ACCOUNTING_TYPE like", value, "accountingType");
            return (Criteria) this;
        }

        public Criteria andAccountingTypeNotLike(String value) {
            addCriterion("ACCOUNTING_TYPE not like", value, "accountingType");
            return (Criteria) this;
        }

        public Criteria andAccountingTypeIn(List<String> values) {
            addCriterion("ACCOUNTING_TYPE in", values, "accountingType");
            return (Criteria) this;
        }

        public Criteria andAccountingTypeNotIn(List<String> values) {
            addCriterion("ACCOUNTING_TYPE not in", values, "accountingType");
            return (Criteria) this;
        }

        public Criteria andAccountingTypeBetween(String value1, String value2) {
            addCriterion("ACCOUNTING_TYPE between", value1, value2, "accountingType");
            return (Criteria) this;
        }

        public Criteria andAccountingTypeNotBetween(String value1, String value2) {
            addCriterion("ACCOUNTING_TYPE not between", value1, value2, "accountingType");
            return (Criteria) this;
        }

        public Criteria andAccountingAmountIsNull() {
            addCriterion("ACCOUNTING_AMOUNT is null");
            return (Criteria) this;
        }

        public Criteria andAccountingAmountIsNotNull() {
            addCriterion("ACCOUNTING_AMOUNT is not null");
            return (Criteria) this;
        }

        public Criteria andAccountingAmountEqualTo(BigDecimal value) {
            addCriterion("ACCOUNTING_AMOUNT =", value, "accountingAmount");
            return (Criteria) this;
        }

        public Criteria andAccountingAmountNotEqualTo(BigDecimal value) {
            addCriterion("ACCOUNTING_AMOUNT <>", value, "accountingAmount");
            return (Criteria) this;
        }

        public Criteria andAccountingAmountGreaterThan(BigDecimal value) {
            addCriterion("ACCOUNTING_AMOUNT >", value, "accountingAmount");
            return (Criteria) this;
        }

        public Criteria andAccountingAmountGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("ACCOUNTING_AMOUNT >=", value, "accountingAmount");
            return (Criteria) this;
        }

        public Criteria andAccountingAmountLessThan(BigDecimal value) {
            addCriterion("ACCOUNTING_AMOUNT <", value, "accountingAmount");
            return (Criteria) this;
        }

        public Criteria andAccountingAmountLessThanOrEqualTo(BigDecimal value) {
            addCriterion("ACCOUNTING_AMOUNT <=", value, "accountingAmount");
            return (Criteria) this;
        }

        public Criteria andAccountingAmountIn(List<BigDecimal> values) {
            addCriterion("ACCOUNTING_AMOUNT in", values, "accountingAmount");
            return (Criteria) this;
        }

        public Criteria andAccountingAmountNotIn(List<BigDecimal> values) {
            addCriterion("ACCOUNTING_AMOUNT not in", values, "accountingAmount");
            return (Criteria) this;
        }

        public Criteria andAccountingAmountBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("ACCOUNTING_AMOUNT between", value1, value2, "accountingAmount");
            return (Criteria) this;
        }

        public Criteria andAccountingAmountNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("ACCOUNTING_AMOUNT not between", value1, value2, "accountingAmount");
            return (Criteria) this;
        }

        public Criteria andBeforeAmountIsNull() {
            addCriterion("BEFORE_AMOUNT is null");
            return (Criteria) this;
        }

        public Criteria andBeforeAmountIsNotNull() {
            addCriterion("BEFORE_AMOUNT is not null");
            return (Criteria) this;
        }

        public Criteria andBeforeAmountEqualTo(BigDecimal value) {
            addCriterion("BEFORE_AMOUNT =", value, "beforeAmount");
            return (Criteria) this;
        }

        public Criteria andBeforeAmountNotEqualTo(BigDecimal value) {
            addCriterion("BEFORE_AMOUNT <>", value, "beforeAmount");
            return (Criteria) this;
        }

        public Criteria andBeforeAmountGreaterThan(BigDecimal value) {
            addCriterion("BEFORE_AMOUNT >", value, "beforeAmount");
            return (Criteria) this;
        }

        public Criteria andBeforeAmountGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("BEFORE_AMOUNT >=", value, "beforeAmount");
            return (Criteria) this;
        }

        public Criteria andBeforeAmountLessThan(BigDecimal value) {
            addCriterion("BEFORE_AMOUNT <", value, "beforeAmount");
            return (Criteria) this;
        }

        public Criteria andBeforeAmountLessThanOrEqualTo(BigDecimal value) {
            addCriterion("BEFORE_AMOUNT <=", value, "beforeAmount");
            return (Criteria) this;
        }

        public Criteria andBeforeAmountIn(List<BigDecimal> values) {
            addCriterion("BEFORE_AMOUNT in", values, "beforeAmount");
            return (Criteria) this;
        }

        public Criteria andBeforeAmountNotIn(List<BigDecimal> values) {
            addCriterion("BEFORE_AMOUNT not in", values, "beforeAmount");
            return (Criteria) this;
        }

        public Criteria andBeforeAmountBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("BEFORE_AMOUNT between", value1, value2, "beforeAmount");
            return (Criteria) this;
        }

        public Criteria andBeforeAmountNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("BEFORE_AMOUNT not between", value1, value2, "beforeAmount");
            return (Criteria) this;
        }

        public Criteria andAfterAmountIsNull() {
            addCriterion("AFTER_AMOUNT is null");
            return (Criteria) this;
        }

        public Criteria andAfterAmountIsNotNull() {
            addCriterion("AFTER_AMOUNT is not null");
            return (Criteria) this;
        }

        public Criteria andAfterAmountEqualTo(BigDecimal value) {
            addCriterion("AFTER_AMOUNT =", value, "afterAmount");
            return (Criteria) this;
        }

        public Criteria andAfterAmountNotEqualTo(BigDecimal value) {
            addCriterion("AFTER_AMOUNT <>", value, "afterAmount");
            return (Criteria) this;
        }

        public Criteria andAfterAmountGreaterThan(BigDecimal value) {
            addCriterion("AFTER_AMOUNT >", value, "afterAmount");
            return (Criteria) this;
        }

        public Criteria andAfterAmountGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("AFTER_AMOUNT >=", value, "afterAmount");
            return (Criteria) this;
        }

        public Criteria andAfterAmountLessThan(BigDecimal value) {
            addCriterion("AFTER_AMOUNT <", value, "afterAmount");
            return (Criteria) this;
        }

        public Criteria andAfterAmountLessThanOrEqualTo(BigDecimal value) {
            addCriterion("AFTER_AMOUNT <=", value, "afterAmount");
            return (Criteria) this;
        }

        public Criteria andAfterAmountIn(List<BigDecimal> values) {
            addCriterion("AFTER_AMOUNT in", values, "afterAmount");
            return (Criteria) this;
        }

        public Criteria andAfterAmountNotIn(List<BigDecimal> values) {
            addCriterion("AFTER_AMOUNT not in", values, "afterAmount");
            return (Criteria) this;
        }

        public Criteria andAfterAmountBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("AFTER_AMOUNT between", value1, value2, "afterAmount");
            return (Criteria) this;
        }

        public Criteria andAfterAmountNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("AFTER_AMOUNT not between", value1, value2, "afterAmount");
            return (Criteria) this;
        }

        public Criteria andAccountingDateIsNull() {
            addCriterion("ACCOUNTING_DATE is null");
            return (Criteria) this;
        }

        public Criteria andAccountingDateIsNotNull() {
            addCriterion("ACCOUNTING_DATE is not null");
            return (Criteria) this;
        }

        public Criteria andAccountingDateEqualTo(String value) {
            addCriterion("ACCOUNTING_DATE =", value, "accountingDate");
            return (Criteria) this;
        }

        public Criteria andAccountingDateNotEqualTo(String value) {
            addCriterion("ACCOUNTING_DATE <>", value, "accountingDate");
            return (Criteria) this;
        }

        public Criteria andAccountingDateGreaterThan(String value) {
            addCriterion("ACCOUNTING_DATE >", value, "accountingDate");
            return (Criteria) this;
        }

        public Criteria andAccountingDateGreaterThanOrEqualTo(String value) {
            addCriterion("ACCOUNTING_DATE >=", value, "accountingDate");
            return (Criteria) this;
        }

        public Criteria andAccountingDateLessThan(String value) {
            addCriterion("ACCOUNTING_DATE <", value, "accountingDate");
            return (Criteria) this;
        }

        public Criteria andAccountingDateLessThanOrEqualTo(String value) {
            addCriterion("ACCOUNTING_DATE <=", value, "accountingDate");
            return (Criteria) this;
        }

        public Criteria andAccountingDateLike(String value) {
            addCriterion("ACCOUNTING_DATE like", value, "accountingDate");
            return (Criteria) this;
        }

        public Criteria andAccountingDateNotLike(String value) {
            addCriterion("ACCOUNTING_DATE not like", value, "accountingDate");
            return (Criteria) this;
        }

        public Criteria andAccountingDateIn(List<String> values) {
            addCriterion("ACCOUNTING_DATE in", values, "accountingDate");
            return (Criteria) this;
        }

        public Criteria andAccountingDateNotIn(List<String> values) {
            addCriterion("ACCOUNTING_DATE not in", values, "accountingDate");
            return (Criteria) this;
        }

        public Criteria andAccountingDateBetween(String value1, String value2) {
            addCriterion("ACCOUNTING_DATE between", value1, value2, "accountingDate");
            return (Criteria) this;
        }

        public Criteria andAccountingDateNotBetween(String value1, String value2) {
            addCriterion("ACCOUNTING_DATE not between", value1, value2, "accountingDate");
            return (Criteria) this;
        }

        public Criteria andAccountingRemarkIsNull() {
            addCriterion("ACCOUNTING_REMARK is null");
            return (Criteria) this;
        }

        public Criteria andAccountingRemarkIsNotNull() {
            addCriterion("ACCOUNTING_REMARK is not null");
            return (Criteria) this;
        }

        public Criteria andAccountingRemarkEqualTo(String value) {
            addCriterion("ACCOUNTING_REMARK =", value, "accountingRemark");
            return (Criteria) this;
        }

        public Criteria andAccountingRemarkNotEqualTo(String value) {
            addCriterion("ACCOUNTING_REMARK <>", value, "accountingRemark");
            return (Criteria) this;
        }

        public Criteria andAccountingRemarkGreaterThan(String value) {
            addCriterion("ACCOUNTING_REMARK >", value, "accountingRemark");
            return (Criteria) this;
        }

        public Criteria andAccountingRemarkGreaterThanOrEqualTo(String value) {
            addCriterion("ACCOUNTING_REMARK >=", value, "accountingRemark");
            return (Criteria) this;
        }

        public Criteria andAccountingRemarkLessThan(String value) {
            addCriterion("ACCOUNTING_REMARK <", value, "accountingRemark");
            return (Criteria) this;
        }

        public Criteria andAccountingRemarkLessThanOrEqualTo(String value) {
            addCriterion("ACCOUNTING_REMARK <=", value, "accountingRemark");
            return (Criteria) this;
        }

        public Criteria andAccountingRemarkLike(String value) {
            addCriterion("ACCOUNTING_REMARK like", value, "accountingRemark");
            return (Criteria) this;
        }

        public Criteria andAccountingRemarkNotLike(String value) {
            addCriterion("ACCOUNTING_REMARK not like", value, "accountingRemark");
            return (Criteria) this;
        }

        public Criteria andAccountingRemarkIn(List<String> values) {
            addCriterion("ACCOUNTING_REMARK in", values, "accountingRemark");
            return (Criteria) this;
        }

        public Criteria andAccountingRemarkNotIn(List<String> values) {
            addCriterion("ACCOUNTING_REMARK not in", values, "accountingRemark");
            return (Criteria) this;
        }

        public Criteria andAccountingRemarkBetween(String value1, String value2) {
            addCriterion("ACCOUNTING_REMARK between", value1, value2, "accountingRemark");
            return (Criteria) this;
        }

        public Criteria andAccountingRemarkNotBetween(String value1, String value2) {
            addCriterion("ACCOUNTING_REMARK not between", value1, value2, "accountingRemark");
            return (Criteria) this;
        }

        public Criteria andCdFlagIsNull() {
            addCriterion("CD_FLAG is null");
            return (Criteria) this;
        }

        public Criteria andCdFlagIsNotNull() {
            addCriterion("CD_FLAG is not null");
            return (Criteria) this;
        }

        public Criteria andCdFlagEqualTo(String value) {
            addCriterion("CD_FLAG =", value, "cdFlag");
            return (Criteria) this;
        }

        public Criteria andCdFlagNotEqualTo(String value) {
            addCriterion("CD_FLAG <>", value, "cdFlag");
            return (Criteria) this;
        }

        public Criteria andCdFlagGreaterThan(String value) {
            addCriterion("CD_FLAG >", value, "cdFlag");
            return (Criteria) this;
        }

        public Criteria andCdFlagGreaterThanOrEqualTo(String value) {
            addCriterion("CD_FLAG >=", value, "cdFlag");
            return (Criteria) this;
        }

        public Criteria andCdFlagLessThan(String value) {
            addCriterion("CD_FLAG <", value, "cdFlag");
            return (Criteria) this;
        }

        public Criteria andCdFlagLessThanOrEqualTo(String value) {
            addCriterion("CD_FLAG <=", value, "cdFlag");
            return (Criteria) this;
        }

        public Criteria andCdFlagLike(String value) {
            addCriterion("CD_FLAG like", value, "cdFlag");
            return (Criteria) this;
        }

        public Criteria andCdFlagNotLike(String value) {
            addCriterion("CD_FLAG not like", value, "cdFlag");
            return (Criteria) this;
        }

        public Criteria andCdFlagIn(List<String> values) {
            addCriterion("CD_FLAG in", values, "cdFlag");
            return (Criteria) this;
        }

        public Criteria andCdFlagNotIn(List<String> values) {
            addCriterion("CD_FLAG not in", values, "cdFlag");
            return (Criteria) this;
        }

        public Criteria andCdFlagBetween(String value1, String value2) {
            addCriterion("CD_FLAG between", value1, value2, "cdFlag");
            return (Criteria) this;
        }

        public Criteria andCdFlagNotBetween(String value1, String value2) {
            addCriterion("CD_FLAG not between", value1, value2, "cdFlag");
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