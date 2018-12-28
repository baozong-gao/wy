package com.shenxin.core.smartpropertymanagement.persist.entity;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class CompanyDepartmentDAOExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public CompanyDepartmentDAOExample() {
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

        public Criteria andDepartmentNameIsNull() {
            addCriterion("DEPARTMENT_NAME is null");
            return (Criteria) this;
        }

        public Criteria andDepartmentNameIsNotNull() {
            addCriterion("DEPARTMENT_NAME is not null");
            return (Criteria) this;
        }

        public Criteria andDepartmentNameEqualTo(String value) {
            addCriterion("DEPARTMENT_NAME =", value, "departmentName");
            return (Criteria) this;
        }

        public Criteria andDepartmentNameNotEqualTo(String value) {
            addCriterion("DEPARTMENT_NAME <>", value, "departmentName");
            return (Criteria) this;
        }

        public Criteria andDepartmentNameGreaterThan(String value) {
            addCriterion("DEPARTMENT_NAME >", value, "departmentName");
            return (Criteria) this;
        }

        public Criteria andDepartmentNameGreaterThanOrEqualTo(String value) {
            addCriterion("DEPARTMENT_NAME >=", value, "departmentName");
            return (Criteria) this;
        }

        public Criteria andDepartmentNameLessThan(String value) {
            addCriterion("DEPARTMENT_NAME <", value, "departmentName");
            return (Criteria) this;
        }

        public Criteria andDepartmentNameLessThanOrEqualTo(String value) {
            addCriterion("DEPARTMENT_NAME <=", value, "departmentName");
            return (Criteria) this;
        }

        public Criteria andDepartmentNameLike(String value) {
            addCriterion("DEPARTMENT_NAME like", value, "departmentName");
            return (Criteria) this;
        }

        public Criteria andDepartmentNameNotLike(String value) {
            addCriterion("DEPARTMENT_NAME not like", value, "departmentName");
            return (Criteria) this;
        }

        public Criteria andDepartmentNameIn(List<String> values) {
            addCriterion("DEPARTMENT_NAME in", values, "departmentName");
            return (Criteria) this;
        }

        public Criteria andDepartmentNameNotIn(List<String> values) {
            addCriterion("DEPARTMENT_NAME not in", values, "departmentName");
            return (Criteria) this;
        }

        public Criteria andDepartmentNameBetween(String value1, String value2) {
            addCriterion("DEPARTMENT_NAME between", value1, value2, "departmentName");
            return (Criteria) this;
        }

        public Criteria andDepartmentNameNotBetween(String value1, String value2) {
            addCriterion("DEPARTMENT_NAME not between", value1, value2, "departmentName");
            return (Criteria) this;
        }

        public Criteria andDepartmentDescIsNull() {
            addCriterion("DEPARTMENT_DESC is null");
            return (Criteria) this;
        }

        public Criteria andDepartmentDescIsNotNull() {
            addCriterion("DEPARTMENT_DESC is not null");
            return (Criteria) this;
        }

        public Criteria andDepartmentDescEqualTo(String value) {
            addCriterion("DEPARTMENT_DESC =", value, "departmentDesc");
            return (Criteria) this;
        }

        public Criteria andDepartmentDescNotEqualTo(String value) {
            addCriterion("DEPARTMENT_DESC <>", value, "departmentDesc");
            return (Criteria) this;
        }

        public Criteria andDepartmentDescGreaterThan(String value) {
            addCriterion("DEPARTMENT_DESC >", value, "departmentDesc");
            return (Criteria) this;
        }

        public Criteria andDepartmentDescGreaterThanOrEqualTo(String value) {
            addCriterion("DEPARTMENT_DESC >=", value, "departmentDesc");
            return (Criteria) this;
        }

        public Criteria andDepartmentDescLessThan(String value) {
            addCriterion("DEPARTMENT_DESC <", value, "departmentDesc");
            return (Criteria) this;
        }

        public Criteria andDepartmentDescLessThanOrEqualTo(String value) {
            addCriterion("DEPARTMENT_DESC <=", value, "departmentDesc");
            return (Criteria) this;
        }

        public Criteria andDepartmentDescLike(String value) {
            addCriterion("DEPARTMENT_DESC like", value, "departmentDesc");
            return (Criteria) this;
        }

        public Criteria andDepartmentDescNotLike(String value) {
            addCriterion("DEPARTMENT_DESC not like", value, "departmentDesc");
            return (Criteria) this;
        }

        public Criteria andDepartmentDescIn(List<String> values) {
            addCriterion("DEPARTMENT_DESC in", values, "departmentDesc");
            return (Criteria) this;
        }

        public Criteria andDepartmentDescNotIn(List<String> values) {
            addCriterion("DEPARTMENT_DESC not in", values, "departmentDesc");
            return (Criteria) this;
        }

        public Criteria andDepartmentDescBetween(String value1, String value2) {
            addCriterion("DEPARTMENT_DESC between", value1, value2, "departmentDesc");
            return (Criteria) this;
        }

        public Criteria andDepartmentDescNotBetween(String value1, String value2) {
            addCriterion("DEPARTMENT_DESC not between", value1, value2, "departmentDesc");
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

        public Criteria andDepartmentStatusIsNull() {
            addCriterion("DEPARTMENT_STATUS is null");
            return (Criteria) this;
        }

        public Criteria andDepartmentStatusIsNotNull() {
            addCriterion("DEPARTMENT_STATUS is not null");
            return (Criteria) this;
        }

        public Criteria andDepartmentStatusEqualTo(String value) {
            addCriterion("DEPARTMENT_STATUS =", value, "departmentStatus");
            return (Criteria) this;
        }

        public Criteria andDepartmentStatusNotEqualTo(String value) {
            addCriterion("DEPARTMENT_STATUS <>", value, "departmentStatus");
            return (Criteria) this;
        }

        public Criteria andDepartmentStatusGreaterThan(String value) {
            addCriterion("DEPARTMENT_STATUS >", value, "departmentStatus");
            return (Criteria) this;
        }

        public Criteria andDepartmentStatusGreaterThanOrEqualTo(String value) {
            addCriterion("DEPARTMENT_STATUS >=", value, "departmentStatus");
            return (Criteria) this;
        }

        public Criteria andDepartmentStatusLessThan(String value) {
            addCriterion("DEPARTMENT_STATUS <", value, "departmentStatus");
            return (Criteria) this;
        }

        public Criteria andDepartmentStatusLessThanOrEqualTo(String value) {
            addCriterion("DEPARTMENT_STATUS <=", value, "departmentStatus");
            return (Criteria) this;
        }

        public Criteria andDepartmentStatusLike(String value) {
            addCriterion("DEPARTMENT_STATUS like", value, "departmentStatus");
            return (Criteria) this;
        }

        public Criteria andDepartmentStatusNotLike(String value) {
            addCriterion("DEPARTMENT_STATUS not like", value, "departmentStatus");
            return (Criteria) this;
        }

        public Criteria andDepartmentStatusIn(List<String> values) {
            addCriterion("DEPARTMENT_STATUS in", values, "departmentStatus");
            return (Criteria) this;
        }

        public Criteria andDepartmentStatusNotIn(List<String> values) {
            addCriterion("DEPARTMENT_STATUS not in", values, "departmentStatus");
            return (Criteria) this;
        }

        public Criteria andDepartmentStatusBetween(String value1, String value2) {
            addCriterion("DEPARTMENT_STATUS between", value1, value2, "departmentStatus");
            return (Criteria) this;
        }

        public Criteria andDepartmentStatusNotBetween(String value1, String value2) {
            addCriterion("DEPARTMENT_STATUS not between", value1, value2, "departmentStatus");
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