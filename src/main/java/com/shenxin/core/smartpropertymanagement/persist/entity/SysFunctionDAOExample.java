package com.shenxin.core.smartpropertymanagement.persist.entity;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class SysFunctionDAOExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public SysFunctionDAOExample() {
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

        public Criteria andGradeEqualTo(String value) {
            addCriterion("GRADE =", value, "grade");
            return (Criteria) this;
        }

        public Criteria andGradeNotEqualTo(String value) {
            addCriterion("GRADE <>", value, "grade");
            return (Criteria) this;
        }

        public Criteria andGradeGreaterThan(String value) {
            addCriterion("GRADE >", value, "grade");
            return (Criteria) this;
        }

        public Criteria andGradeGreaterThanOrEqualTo(String value) {
            addCriterion("GRADE >=", value, "grade");
            return (Criteria) this;
        }

        public Criteria andGradeLessThan(String value) {
            addCriterion("GRADE <", value, "grade");
            return (Criteria) this;
        }

        public Criteria andGradeLessThanOrEqualTo(String value) {
            addCriterion("GRADE <=", value, "grade");
            return (Criteria) this;
        }

        public Criteria andGradeLike(String value) {
            addCriterion("GRADE like", value, "grade");
            return (Criteria) this;
        }

        public Criteria andGradeNotLike(String value) {
            addCriterion("GRADE not like", value, "grade");
            return (Criteria) this;
        }

        public Criteria andGradeIn(List<String> values) {
            addCriterion("GRADE in", values, "grade");
            return (Criteria) this;
        }

        public Criteria andGradeNotIn(List<String> values) {
            addCriterion("GRADE not in", values, "grade");
            return (Criteria) this;
        }

        public Criteria andGradeBetween(String value1, String value2) {
            addCriterion("GRADE between", value1, value2, "grade");
            return (Criteria) this;
        }

        public Criteria andGradeNotBetween(String value1, String value2) {
            addCriterion("GRADE not between", value1, value2, "grade");
            return (Criteria) this;
        }

        public Criteria andFuncNameIsNull() {
            addCriterion("FUNC_NAME is null");
            return (Criteria) this;
        }

        public Criteria andFuncNameIsNotNull() {
            addCriterion("FUNC_NAME is not null");
            return (Criteria) this;
        }

        public Criteria andFuncNameEqualTo(String value) {
            addCriterion("FUNC_NAME =", value, "funcName");
            return (Criteria) this;
        }

        public Criteria andFuncNameNotEqualTo(String value) {
            addCriterion("FUNC_NAME <>", value, "funcName");
            return (Criteria) this;
        }

        public Criteria andFuncNameGreaterThan(String value) {
            addCriterion("FUNC_NAME >", value, "funcName");
            return (Criteria) this;
        }

        public Criteria andFuncNameGreaterThanOrEqualTo(String value) {
            addCriterion("FUNC_NAME >=", value, "funcName");
            return (Criteria) this;
        }

        public Criteria andFuncNameLessThan(String value) {
            addCriterion("FUNC_NAME <", value, "funcName");
            return (Criteria) this;
        }

        public Criteria andFuncNameLessThanOrEqualTo(String value) {
            addCriterion("FUNC_NAME <=", value, "funcName");
            return (Criteria) this;
        }

        public Criteria andFuncNameLike(String value) {
            addCriterion("FUNC_NAME like", value, "funcName");
            return (Criteria) this;
        }

        public Criteria andFuncNameNotLike(String value) {
            addCriterion("FUNC_NAME not like", value, "funcName");
            return (Criteria) this;
        }

        public Criteria andFuncNameIn(List<String> values) {
            addCriterion("FUNC_NAME in", values, "funcName");
            return (Criteria) this;
        }

        public Criteria andFuncNameNotIn(List<String> values) {
            addCriterion("FUNC_NAME not in", values, "funcName");
            return (Criteria) this;
        }

        public Criteria andFuncNameBetween(String value1, String value2) {
            addCriterion("FUNC_NAME between", value1, value2, "funcName");
            return (Criteria) this;
        }

        public Criteria andFuncNameNotBetween(String value1, String value2) {
            addCriterion("FUNC_NAME not between", value1, value2, "funcName");
            return (Criteria) this;
        }

        public Criteria andFuncUriIsNull() {
            addCriterion("FUNC_URI is null");
            return (Criteria) this;
        }

        public Criteria andFuncUriIsNotNull() {
            addCriterion("FUNC_URI is not null");
            return (Criteria) this;
        }

        public Criteria andFuncUriEqualTo(String value) {
            addCriterion("FUNC_URI =", value, "funcUri");
            return (Criteria) this;
        }

        public Criteria andFuncUriNotEqualTo(String value) {
            addCriterion("FUNC_URI <>", value, "funcUri");
            return (Criteria) this;
        }

        public Criteria andFuncUriGreaterThan(String value) {
            addCriterion("FUNC_URI >", value, "funcUri");
            return (Criteria) this;
        }

        public Criteria andFuncUriGreaterThanOrEqualTo(String value) {
            addCriterion("FUNC_URI >=", value, "funcUri");
            return (Criteria) this;
        }

        public Criteria andFuncUriLessThan(String value) {
            addCriterion("FUNC_URI <", value, "funcUri");
            return (Criteria) this;
        }

        public Criteria andFuncUriLessThanOrEqualTo(String value) {
            addCriterion("FUNC_URI <=", value, "funcUri");
            return (Criteria) this;
        }

        public Criteria andFuncUriLike(String value) {
            addCriterion("FUNC_URI like", value, "funcUri");
            return (Criteria) this;
        }

        public Criteria andFuncUriNotLike(String value) {
            addCriterion("FUNC_URI not like", value, "funcUri");
            return (Criteria) this;
        }

        public Criteria andFuncUriIn(List<String> values) {
            addCriterion("FUNC_URI in", values, "funcUri");
            return (Criteria) this;
        }

        public Criteria andFuncUriNotIn(List<String> values) {
            addCriterion("FUNC_URI not in", values, "funcUri");
            return (Criteria) this;
        }

        public Criteria andFuncUriBetween(String value1, String value2) {
            addCriterion("FUNC_URI between", value1, value2, "funcUri");
            return (Criteria) this;
        }

        public Criteria andFuncUriNotBetween(String value1, String value2) {
            addCriterion("FUNC_URI not between", value1, value2, "funcUri");
            return (Criteria) this;
        }

        public Criteria andFuncTypeIsNull() {
            addCriterion("FUNC_TYPE is null");
            return (Criteria) this;
        }

        public Criteria andFuncTypeIsNotNull() {
            addCriterion("FUNC_TYPE is not null");
            return (Criteria) this;
        }

        public Criteria andFuncTypeEqualTo(String value) {
            addCriterion("FUNC_TYPE =", value, "funcType");
            return (Criteria) this;
        }

        public Criteria andFuncTypeNotEqualTo(String value) {
            addCriterion("FUNC_TYPE <>", value, "funcType");
            return (Criteria) this;
        }

        public Criteria andFuncTypeGreaterThan(String value) {
            addCriterion("FUNC_TYPE >", value, "funcType");
            return (Criteria) this;
        }

        public Criteria andFuncTypeGreaterThanOrEqualTo(String value) {
            addCriterion("FUNC_TYPE >=", value, "funcType");
            return (Criteria) this;
        }

        public Criteria andFuncTypeLessThan(String value) {
            addCriterion("FUNC_TYPE <", value, "funcType");
            return (Criteria) this;
        }

        public Criteria andFuncTypeLessThanOrEqualTo(String value) {
            addCriterion("FUNC_TYPE <=", value, "funcType");
            return (Criteria) this;
        }

        public Criteria andFuncTypeLike(String value) {
            addCriterion("FUNC_TYPE like", value, "funcType");
            return (Criteria) this;
        }

        public Criteria andFuncTypeNotLike(String value) {
            addCriterion("FUNC_TYPE not like", value, "funcType");
            return (Criteria) this;
        }

        public Criteria andFuncTypeIn(List<String> values) {
            addCriterion("FUNC_TYPE in", values, "funcType");
            return (Criteria) this;
        }

        public Criteria andFuncTypeNotIn(List<String> values) {
            addCriterion("FUNC_TYPE not in", values, "funcType");
            return (Criteria) this;
        }

        public Criteria andFuncTypeBetween(String value1, String value2) {
            addCriterion("FUNC_TYPE between", value1, value2, "funcType");
            return (Criteria) this;
        }

        public Criteria andFuncTypeNotBetween(String value1, String value2) {
            addCriterion("FUNC_TYPE not between", value1, value2, "funcType");
            return (Criteria) this;
        }

        public Criteria andAuthCodeIsNull() {
            addCriterion("AUTH_CODE is null");
            return (Criteria) this;
        }

        public Criteria andAuthCodeIsNotNull() {
            addCriterion("AUTH_CODE is not null");
            return (Criteria) this;
        }

        public Criteria andAuthCodeEqualTo(String value) {
            addCriterion("AUTH_CODE =", value, "authCode");
            return (Criteria) this;
        }

        public Criteria andAuthCodeNotEqualTo(String value) {
            addCriterion("AUTH_CODE <>", value, "authCode");
            return (Criteria) this;
        }

        public Criteria andAuthCodeGreaterThan(String value) {
            addCriterion("AUTH_CODE >", value, "authCode");
            return (Criteria) this;
        }

        public Criteria andAuthCodeGreaterThanOrEqualTo(String value) {
            addCriterion("AUTH_CODE >=", value, "authCode");
            return (Criteria) this;
        }

        public Criteria andAuthCodeLessThan(String value) {
            addCriterion("AUTH_CODE <", value, "authCode");
            return (Criteria) this;
        }

        public Criteria andAuthCodeLessThanOrEqualTo(String value) {
            addCriterion("AUTH_CODE <=", value, "authCode");
            return (Criteria) this;
        }

        public Criteria andAuthCodeLike(String value) {
            addCriterion("AUTH_CODE like", value, "authCode");
            return (Criteria) this;
        }

        public Criteria andAuthCodeNotLike(String value) {
            addCriterion("AUTH_CODE not like", value, "authCode");
            return (Criteria) this;
        }

        public Criteria andAuthCodeIn(List<String> values) {
            addCriterion("AUTH_CODE in", values, "authCode");
            return (Criteria) this;
        }

        public Criteria andAuthCodeNotIn(List<String> values) {
            addCriterion("AUTH_CODE not in", values, "authCode");
            return (Criteria) this;
        }

        public Criteria andAuthCodeBetween(String value1, String value2) {
            addCriterion("AUTH_CODE between", value1, value2, "authCode");
            return (Criteria) this;
        }

        public Criteria andAuthCodeNotBetween(String value1, String value2) {
            addCriterion("AUTH_CODE not between", value1, value2, "authCode");
            return (Criteria) this;
        }

        public Criteria andFuncStatusIsNull() {
            addCriterion("FUNC_STATUS is null");
            return (Criteria) this;
        }

        public Criteria andFuncStatusIsNotNull() {
            addCriterion("FUNC_STATUS is not null");
            return (Criteria) this;
        }

        public Criteria andFuncStatusEqualTo(String value) {
            addCriterion("FUNC_STATUS =", value, "funcStatus");
            return (Criteria) this;
        }

        public Criteria andFuncStatusNotEqualTo(String value) {
            addCriterion("FUNC_STATUS <>", value, "funcStatus");
            return (Criteria) this;
        }

        public Criteria andFuncStatusGreaterThan(String value) {
            addCriterion("FUNC_STATUS >", value, "funcStatus");
            return (Criteria) this;
        }

        public Criteria andFuncStatusGreaterThanOrEqualTo(String value) {
            addCriterion("FUNC_STATUS >=", value, "funcStatus");
            return (Criteria) this;
        }

        public Criteria andFuncStatusLessThan(String value) {
            addCriterion("FUNC_STATUS <", value, "funcStatus");
            return (Criteria) this;
        }

        public Criteria andFuncStatusLessThanOrEqualTo(String value) {
            addCriterion("FUNC_STATUS <=", value, "funcStatus");
            return (Criteria) this;
        }

        public Criteria andFuncStatusLike(String value) {
            addCriterion("FUNC_STATUS like", value, "funcStatus");
            return (Criteria) this;
        }

        public Criteria andFuncStatusNotLike(String value) {
            addCriterion("FUNC_STATUS not like", value, "funcStatus");
            return (Criteria) this;
        }

        public Criteria andFuncStatusIn(List<String> values) {
            addCriterion("FUNC_STATUS in", values, "funcStatus");
            return (Criteria) this;
        }

        public Criteria andFuncStatusNotIn(List<String> values) {
            addCriterion("FUNC_STATUS not in", values, "funcStatus");
            return (Criteria) this;
        }

        public Criteria andFuncStatusBetween(String value1, String value2) {
            addCriterion("FUNC_STATUS between", value1, value2, "funcStatus");
            return (Criteria) this;
        }

        public Criteria andFuncStatusNotBetween(String value1, String value2) {
            addCriterion("FUNC_STATUS not between", value1, value2, "funcStatus");
            return (Criteria) this;
        }

        public Criteria andOrderByIsNull() {
            addCriterion("ORDER_BY is null");
            return (Criteria) this;
        }

        public Criteria andOrderByIsNotNull() {
            addCriterion("ORDER_BY is not null");
            return (Criteria) this;
        }

        public Criteria andOrderByEqualTo(BigDecimal value) {
            addCriterion("ORDER_BY =", value, "orderBy");
            return (Criteria) this;
        }

        public Criteria andOrderByNotEqualTo(BigDecimal value) {
            addCriterion("ORDER_BY <>", value, "orderBy");
            return (Criteria) this;
        }

        public Criteria andOrderByGreaterThan(BigDecimal value) {
            addCriterion("ORDER_BY >", value, "orderBy");
            return (Criteria) this;
        }

        public Criteria andOrderByGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("ORDER_BY >=", value, "orderBy");
            return (Criteria) this;
        }

        public Criteria andOrderByLessThan(BigDecimal value) {
            addCriterion("ORDER_BY <", value, "orderBy");
            return (Criteria) this;
        }

        public Criteria andOrderByLessThanOrEqualTo(BigDecimal value) {
            addCriterion("ORDER_BY <=", value, "orderBy");
            return (Criteria) this;
        }

        public Criteria andOrderByIn(List<BigDecimal> values) {
            addCriterion("ORDER_BY in", values, "orderBy");
            return (Criteria) this;
        }

        public Criteria andOrderByNotIn(List<BigDecimal> values) {
            addCriterion("ORDER_BY not in", values, "orderBy");
            return (Criteria) this;
        }

        public Criteria andOrderByBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("ORDER_BY between", value1, value2, "orderBy");
            return (Criteria) this;
        }

        public Criteria andOrderByNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("ORDER_BY not between", value1, value2, "orderBy");
            return (Criteria) this;
        }

        public Criteria andLogoIsNull() {
            addCriterion("LOGO is null");
            return (Criteria) this;
        }

        public Criteria andLogoIsNotNull() {
            addCriterion("LOGO is not null");
            return (Criteria) this;
        }

        public Criteria andLogoEqualTo(String value) {
            addCriterion("LOGO =", value, "logo");
            return (Criteria) this;
        }

        public Criteria andLogoNotEqualTo(String value) {
            addCriterion("LOGO <>", value, "logo");
            return (Criteria) this;
        }

        public Criteria andLogoGreaterThan(String value) {
            addCriterion("LOGO >", value, "logo");
            return (Criteria) this;
        }

        public Criteria andLogoGreaterThanOrEqualTo(String value) {
            addCriterion("LOGO >=", value, "logo");
            return (Criteria) this;
        }

        public Criteria andLogoLessThan(String value) {
            addCriterion("LOGO <", value, "logo");
            return (Criteria) this;
        }

        public Criteria andLogoLessThanOrEqualTo(String value) {
            addCriterion("LOGO <=", value, "logo");
            return (Criteria) this;
        }

        public Criteria andLogoLike(String value) {
            addCriterion("LOGO like", value, "logo");
            return (Criteria) this;
        }

        public Criteria andLogoNotLike(String value) {
            addCriterion("LOGO not like", value, "logo");
            return (Criteria) this;
        }

        public Criteria andLogoIn(List<String> values) {
            addCriterion("LOGO in", values, "logo");
            return (Criteria) this;
        }

        public Criteria andLogoNotIn(List<String> values) {
            addCriterion("LOGO not in", values, "logo");
            return (Criteria) this;
        }

        public Criteria andLogoBetween(String value1, String value2) {
            addCriterion("LOGO between", value1, value2, "logo");
            return (Criteria) this;
        }

        public Criteria andLogoNotBetween(String value1, String value2) {
            addCriterion("LOGO not between", value1, value2, "logo");
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