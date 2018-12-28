package com.shenxin.core.smartpropertymanagement.persist.entity;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class SysLoggerDAOExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public SysLoggerDAOExample() {
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

        public Criteria andOperateDateIsNull() {
            addCriterion("OPERATE_DATE is null");
            return (Criteria) this;
        }

        public Criteria andOperateDateIsNotNull() {
            addCriterion("OPERATE_DATE is not null");
            return (Criteria) this;
        }

        public Criteria andOperateDateEqualTo(String value) {
            addCriterion("OPERATE_DATE =", value, "operateDate");
            return (Criteria) this;
        }

        public Criteria andOperateDateNotEqualTo(String value) {
            addCriterion("OPERATE_DATE <>", value, "operateDate");
            return (Criteria) this;
        }

        public Criteria andOperateDateGreaterThan(String value) {
            addCriterion("OPERATE_DATE >", value, "operateDate");
            return (Criteria) this;
        }

        public Criteria andOperateDateGreaterThanOrEqualTo(String value) {
            addCriterion("OPERATE_DATE >=", value, "operateDate");
            return (Criteria) this;
        }

        public Criteria andOperateDateLessThan(String value) {
            addCriterion("OPERATE_DATE <", value, "operateDate");
            return (Criteria) this;
        }

        public Criteria andOperateDateLessThanOrEqualTo(String value) {
            addCriterion("OPERATE_DATE <=", value, "operateDate");
            return (Criteria) this;
        }

        public Criteria andOperateDateLike(String value) {
            addCriterion("OPERATE_DATE like", value, "operateDate");
            return (Criteria) this;
        }

        public Criteria andOperateDateNotLike(String value) {
            addCriterion("OPERATE_DATE not like", value, "operateDate");
            return (Criteria) this;
        }

        public Criteria andOperateDateIn(List<String> values) {
            addCriterion("OPERATE_DATE in", values, "operateDate");
            return (Criteria) this;
        }

        public Criteria andOperateDateNotIn(List<String> values) {
            addCriterion("OPERATE_DATE not in", values, "operateDate");
            return (Criteria) this;
        }

        public Criteria andOperateDateBetween(String value1, String value2) {
            addCriterion("OPERATE_DATE between", value1, value2, "operateDate");
            return (Criteria) this;
        }

        public Criteria andOperateDateNotBetween(String value1, String value2) {
            addCriterion("OPERATE_DATE not between", value1, value2, "operateDate");
            return (Criteria) this;
        }

        public Criteria andOperateTimeIsNull() {
            addCriterion("OPERATE_TIME is null");
            return (Criteria) this;
        }

        public Criteria andOperateTimeIsNotNull() {
            addCriterion("OPERATE_TIME is not null");
            return (Criteria) this;
        }

        public Criteria andOperateTimeEqualTo(String value) {
            addCriterion("OPERATE_TIME =", value, "operateTime");
            return (Criteria) this;
        }

        public Criteria andOperateTimeNotEqualTo(String value) {
            addCriterion("OPERATE_TIME <>", value, "operateTime");
            return (Criteria) this;
        }

        public Criteria andOperateTimeGreaterThan(String value) {
            addCriterion("OPERATE_TIME >", value, "operateTime");
            return (Criteria) this;
        }

        public Criteria andOperateTimeGreaterThanOrEqualTo(String value) {
            addCriterion("OPERATE_TIME >=", value, "operateTime");
            return (Criteria) this;
        }

        public Criteria andOperateTimeLessThan(String value) {
            addCriterion("OPERATE_TIME <", value, "operateTime");
            return (Criteria) this;
        }

        public Criteria andOperateTimeLessThanOrEqualTo(String value) {
            addCriterion("OPERATE_TIME <=", value, "operateTime");
            return (Criteria) this;
        }

        public Criteria andOperateTimeLike(String value) {
            addCriterion("OPERATE_TIME like", value, "operateTime");
            return (Criteria) this;
        }

        public Criteria andOperateTimeNotLike(String value) {
            addCriterion("OPERATE_TIME not like", value, "operateTime");
            return (Criteria) this;
        }

        public Criteria andOperateTimeIn(List<String> values) {
            addCriterion("OPERATE_TIME in", values, "operateTime");
            return (Criteria) this;
        }

        public Criteria andOperateTimeNotIn(List<String> values) {
            addCriterion("OPERATE_TIME not in", values, "operateTime");
            return (Criteria) this;
        }

        public Criteria andOperateTimeBetween(String value1, String value2) {
            addCriterion("OPERATE_TIME between", value1, value2, "operateTime");
            return (Criteria) this;
        }

        public Criteria andOperateTimeNotBetween(String value1, String value2) {
            addCriterion("OPERATE_TIME not between", value1, value2, "operateTime");
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

        public Criteria andUserIdIsNull() {
            addCriterion("USER_ID is null");
            return (Criteria) this;
        }

        public Criteria andUserIdIsNotNull() {
            addCriterion("USER_ID is not null");
            return (Criteria) this;
        }

        public Criteria andUserIdEqualTo(BigDecimal value) {
            addCriterion("USER_ID =", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotEqualTo(BigDecimal value) {
            addCriterion("USER_ID <>", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdGreaterThan(BigDecimal value) {
            addCriterion("USER_ID >", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("USER_ID >=", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdLessThan(BigDecimal value) {
            addCriterion("USER_ID <", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdLessThanOrEqualTo(BigDecimal value) {
            addCriterion("USER_ID <=", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdIn(List<BigDecimal> values) {
            addCriterion("USER_ID in", values, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotIn(List<BigDecimal> values) {
            addCriterion("USER_ID not in", values, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("USER_ID between", value1, value2, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("USER_ID not between", value1, value2, "userId");
            return (Criteria) this;
        }

        public Criteria andLoginIdIsNull() {
            addCriterion("LOGIN_ID is null");
            return (Criteria) this;
        }

        public Criteria andLoginIdIsNotNull() {
            addCriterion("LOGIN_ID is not null");
            return (Criteria) this;
        }

        public Criteria andLoginIdEqualTo(String value) {
            addCriterion("LOGIN_ID =", value, "loginId");
            return (Criteria) this;
        }

        public Criteria andLoginIdNotEqualTo(String value) {
            addCriterion("LOGIN_ID <>", value, "loginId");
            return (Criteria) this;
        }

        public Criteria andLoginIdGreaterThan(String value) {
            addCriterion("LOGIN_ID >", value, "loginId");
            return (Criteria) this;
        }

        public Criteria andLoginIdGreaterThanOrEqualTo(String value) {
            addCriterion("LOGIN_ID >=", value, "loginId");
            return (Criteria) this;
        }

        public Criteria andLoginIdLessThan(String value) {
            addCriterion("LOGIN_ID <", value, "loginId");
            return (Criteria) this;
        }

        public Criteria andLoginIdLessThanOrEqualTo(String value) {
            addCriterion("LOGIN_ID <=", value, "loginId");
            return (Criteria) this;
        }

        public Criteria andLoginIdLike(String value) {
            addCriterion("LOGIN_ID like", value, "loginId");
            return (Criteria) this;
        }

        public Criteria andLoginIdNotLike(String value) {
            addCriterion("LOGIN_ID not like", value, "loginId");
            return (Criteria) this;
        }

        public Criteria andLoginIdIn(List<String> values) {
            addCriterion("LOGIN_ID in", values, "loginId");
            return (Criteria) this;
        }

        public Criteria andLoginIdNotIn(List<String> values) {
            addCriterion("LOGIN_ID not in", values, "loginId");
            return (Criteria) this;
        }

        public Criteria andLoginIdBetween(String value1, String value2) {
            addCriterion("LOGIN_ID between", value1, value2, "loginId");
            return (Criteria) this;
        }

        public Criteria andLoginIdNotBetween(String value1, String value2) {
            addCriterion("LOGIN_ID not between", value1, value2, "loginId");
            return (Criteria) this;
        }

        public Criteria andFuncClassIsNull() {
            addCriterion("FUNC_CLASS is null");
            return (Criteria) this;
        }

        public Criteria andFuncClassIsNotNull() {
            addCriterion("FUNC_CLASS is not null");
            return (Criteria) this;
        }

        public Criteria andFuncClassEqualTo(String value) {
            addCriterion("FUNC_CLASS =", value, "funcClass");
            return (Criteria) this;
        }

        public Criteria andFuncClassNotEqualTo(String value) {
            addCriterion("FUNC_CLASS <>", value, "funcClass");
            return (Criteria) this;
        }

        public Criteria andFuncClassGreaterThan(String value) {
            addCriterion("FUNC_CLASS >", value, "funcClass");
            return (Criteria) this;
        }

        public Criteria andFuncClassGreaterThanOrEqualTo(String value) {
            addCriterion("FUNC_CLASS >=", value, "funcClass");
            return (Criteria) this;
        }

        public Criteria andFuncClassLessThan(String value) {
            addCriterion("FUNC_CLASS <", value, "funcClass");
            return (Criteria) this;
        }

        public Criteria andFuncClassLessThanOrEqualTo(String value) {
            addCriterion("FUNC_CLASS <=", value, "funcClass");
            return (Criteria) this;
        }

        public Criteria andFuncClassLike(String value) {
            addCriterion("FUNC_CLASS like", value, "funcClass");
            return (Criteria) this;
        }

        public Criteria andFuncClassNotLike(String value) {
            addCriterion("FUNC_CLASS not like", value, "funcClass");
            return (Criteria) this;
        }

        public Criteria andFuncClassIn(List<String> values) {
            addCriterion("FUNC_CLASS in", values, "funcClass");
            return (Criteria) this;
        }

        public Criteria andFuncClassNotIn(List<String> values) {
            addCriterion("FUNC_CLASS not in", values, "funcClass");
            return (Criteria) this;
        }

        public Criteria andFuncClassBetween(String value1, String value2) {
            addCriterion("FUNC_CLASS between", value1, value2, "funcClass");
            return (Criteria) this;
        }

        public Criteria andFuncClassNotBetween(String value1, String value2) {
            addCriterion("FUNC_CLASS not between", value1, value2, "funcClass");
            return (Criteria) this;
        }

        public Criteria andFuncActionIsNull() {
            addCriterion("FUNC_ACTION is null");
            return (Criteria) this;
        }

        public Criteria andFuncActionIsNotNull() {
            addCriterion("FUNC_ACTION is not null");
            return (Criteria) this;
        }

        public Criteria andFuncActionEqualTo(String value) {
            addCriterion("FUNC_ACTION =", value, "funcAction");
            return (Criteria) this;
        }

        public Criteria andFuncActionNotEqualTo(String value) {
            addCriterion("FUNC_ACTION <>", value, "funcAction");
            return (Criteria) this;
        }

        public Criteria andFuncActionGreaterThan(String value) {
            addCriterion("FUNC_ACTION >", value, "funcAction");
            return (Criteria) this;
        }

        public Criteria andFuncActionGreaterThanOrEqualTo(String value) {
            addCriterion("FUNC_ACTION >=", value, "funcAction");
            return (Criteria) this;
        }

        public Criteria andFuncActionLessThan(String value) {
            addCriterion("FUNC_ACTION <", value, "funcAction");
            return (Criteria) this;
        }

        public Criteria andFuncActionLessThanOrEqualTo(String value) {
            addCriterion("FUNC_ACTION <=", value, "funcAction");
            return (Criteria) this;
        }

        public Criteria andFuncActionLike(String value) {
            addCriterion("FUNC_ACTION like", value, "funcAction");
            return (Criteria) this;
        }

        public Criteria andFuncActionNotLike(String value) {
            addCriterion("FUNC_ACTION not like", value, "funcAction");
            return (Criteria) this;
        }

        public Criteria andFuncActionIn(List<String> values) {
            addCriterion("FUNC_ACTION in", values, "funcAction");
            return (Criteria) this;
        }

        public Criteria andFuncActionNotIn(List<String> values) {
            addCriterion("FUNC_ACTION not in", values, "funcAction");
            return (Criteria) this;
        }

        public Criteria andFuncActionBetween(String value1, String value2) {
            addCriterion("FUNC_ACTION between", value1, value2, "funcAction");
            return (Criteria) this;
        }

        public Criteria andFuncActionNotBetween(String value1, String value2) {
            addCriterion("FUNC_ACTION not between", value1, value2, "funcAction");
            return (Criteria) this;
        }

        public Criteria andFuncUrlIsNull() {
            addCriterion("FUNC_URL is null");
            return (Criteria) this;
        }

        public Criteria andFuncUrlIsNotNull() {
            addCriterion("FUNC_URL is not null");
            return (Criteria) this;
        }

        public Criteria andFuncUrlEqualTo(String value) {
            addCriterion("FUNC_URL =", value, "funcUrl");
            return (Criteria) this;
        }

        public Criteria andFuncUrlNotEqualTo(String value) {
            addCriterion("FUNC_URL <>", value, "funcUrl");
            return (Criteria) this;
        }

        public Criteria andFuncUrlGreaterThan(String value) {
            addCriterion("FUNC_URL >", value, "funcUrl");
            return (Criteria) this;
        }

        public Criteria andFuncUrlGreaterThanOrEqualTo(String value) {
            addCriterion("FUNC_URL >=", value, "funcUrl");
            return (Criteria) this;
        }

        public Criteria andFuncUrlLessThan(String value) {
            addCriterion("FUNC_URL <", value, "funcUrl");
            return (Criteria) this;
        }

        public Criteria andFuncUrlLessThanOrEqualTo(String value) {
            addCriterion("FUNC_URL <=", value, "funcUrl");
            return (Criteria) this;
        }

        public Criteria andFuncUrlLike(String value) {
            addCriterion("FUNC_URL like", value, "funcUrl");
            return (Criteria) this;
        }

        public Criteria andFuncUrlNotLike(String value) {
            addCriterion("FUNC_URL not like", value, "funcUrl");
            return (Criteria) this;
        }

        public Criteria andFuncUrlIn(List<String> values) {
            addCriterion("FUNC_URL in", values, "funcUrl");
            return (Criteria) this;
        }

        public Criteria andFuncUrlNotIn(List<String> values) {
            addCriterion("FUNC_URL not in", values, "funcUrl");
            return (Criteria) this;
        }

        public Criteria andFuncUrlBetween(String value1, String value2) {
            addCriterion("FUNC_URL between", value1, value2, "funcUrl");
            return (Criteria) this;
        }

        public Criteria andFuncUrlNotBetween(String value1, String value2) {
            addCriterion("FUNC_URL not between", value1, value2, "funcUrl");
            return (Criteria) this;
        }

        public Criteria andOperateIpIsNull() {
            addCriterion("OPERATE_IP is null");
            return (Criteria) this;
        }

        public Criteria andOperateIpIsNotNull() {
            addCriterion("OPERATE_IP is not null");
            return (Criteria) this;
        }

        public Criteria andOperateIpEqualTo(String value) {
            addCriterion("OPERATE_IP =", value, "operateIp");
            return (Criteria) this;
        }

        public Criteria andOperateIpNotEqualTo(String value) {
            addCriterion("OPERATE_IP <>", value, "operateIp");
            return (Criteria) this;
        }

        public Criteria andOperateIpGreaterThan(String value) {
            addCriterion("OPERATE_IP >", value, "operateIp");
            return (Criteria) this;
        }

        public Criteria andOperateIpGreaterThanOrEqualTo(String value) {
            addCriterion("OPERATE_IP >=", value, "operateIp");
            return (Criteria) this;
        }

        public Criteria andOperateIpLessThan(String value) {
            addCriterion("OPERATE_IP <", value, "operateIp");
            return (Criteria) this;
        }

        public Criteria andOperateIpLessThanOrEqualTo(String value) {
            addCriterion("OPERATE_IP <=", value, "operateIp");
            return (Criteria) this;
        }

        public Criteria andOperateIpLike(String value) {
            addCriterion("OPERATE_IP like", value, "operateIp");
            return (Criteria) this;
        }

        public Criteria andOperateIpNotLike(String value) {
            addCriterion("OPERATE_IP not like", value, "operateIp");
            return (Criteria) this;
        }

        public Criteria andOperateIpIn(List<String> values) {
            addCriterion("OPERATE_IP in", values, "operateIp");
            return (Criteria) this;
        }

        public Criteria andOperateIpNotIn(List<String> values) {
            addCriterion("OPERATE_IP not in", values, "operateIp");
            return (Criteria) this;
        }

        public Criteria andOperateIpBetween(String value1, String value2) {
            addCriterion("OPERATE_IP between", value1, value2, "operateIp");
            return (Criteria) this;
        }

        public Criteria andOperateIpNotBetween(String value1, String value2) {
            addCriterion("OPERATE_IP not between", value1, value2, "operateIp");
            return (Criteria) this;
        }

        public Criteria andOperateResultIsNull() {
            addCriterion("OPERATE_RESULT is null");
            return (Criteria) this;
        }

        public Criteria andOperateResultIsNotNull() {
            addCriterion("OPERATE_RESULT is not null");
            return (Criteria) this;
        }

        public Criteria andOperateResultEqualTo(String value) {
            addCriterion("OPERATE_RESULT =", value, "operateResult");
            return (Criteria) this;
        }

        public Criteria andOperateResultNotEqualTo(String value) {
            addCriterion("OPERATE_RESULT <>", value, "operateResult");
            return (Criteria) this;
        }

        public Criteria andOperateResultGreaterThan(String value) {
            addCriterion("OPERATE_RESULT >", value, "operateResult");
            return (Criteria) this;
        }

        public Criteria andOperateResultGreaterThanOrEqualTo(String value) {
            addCriterion("OPERATE_RESULT >=", value, "operateResult");
            return (Criteria) this;
        }

        public Criteria andOperateResultLessThan(String value) {
            addCriterion("OPERATE_RESULT <", value, "operateResult");
            return (Criteria) this;
        }

        public Criteria andOperateResultLessThanOrEqualTo(String value) {
            addCriterion("OPERATE_RESULT <=", value, "operateResult");
            return (Criteria) this;
        }

        public Criteria andOperateResultLike(String value) {
            addCriterion("OPERATE_RESULT like", value, "operateResult");
            return (Criteria) this;
        }

        public Criteria andOperateResultNotLike(String value) {
            addCriterion("OPERATE_RESULT not like", value, "operateResult");
            return (Criteria) this;
        }

        public Criteria andOperateResultIn(List<String> values) {
            addCriterion("OPERATE_RESULT in", values, "operateResult");
            return (Criteria) this;
        }

        public Criteria andOperateResultNotIn(List<String> values) {
            addCriterion("OPERATE_RESULT not in", values, "operateResult");
            return (Criteria) this;
        }

        public Criteria andOperateResultBetween(String value1, String value2) {
            addCriterion("OPERATE_RESULT between", value1, value2, "operateResult");
            return (Criteria) this;
        }

        public Criteria andOperateResultNotBetween(String value1, String value2) {
            addCriterion("OPERATE_RESULT not between", value1, value2, "operateResult");
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