package com.shenxin.core.smartpropertymanagement.persist.entity;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class EmployeeInfoExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public EmployeeInfoExample() {
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

        public Criteria andDepartmentIdIsNull() {
            addCriterion("DEPARTMENT_ID is null");
            return (Criteria) this;
        }

        public Criteria andDepartmentIdIsNotNull() {
            addCriterion("DEPARTMENT_ID is not null");
            return (Criteria) this;
        }

        public Criteria andDepartmentIdEqualTo(BigDecimal value) {
            addCriterion("DEPARTMENT_ID =", value, "departmentId");
            return (Criteria) this;
        }

        public Criteria andDepartmentIdNotEqualTo(BigDecimal value) {
            addCriterion("DEPARTMENT_ID <>", value, "departmentId");
            return (Criteria) this;
        }

        public Criteria andDepartmentIdGreaterThan(BigDecimal value) {
            addCriterion("DEPARTMENT_ID >", value, "departmentId");
            return (Criteria) this;
        }

        public Criteria andDepartmentIdGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("DEPARTMENT_ID >=", value, "departmentId");
            return (Criteria) this;
        }

        public Criteria andDepartmentIdLessThan(BigDecimal value) {
            addCriterion("DEPARTMENT_ID <", value, "departmentId");
            return (Criteria) this;
        }

        public Criteria andDepartmentIdLessThanOrEqualTo(BigDecimal value) {
            addCriterion("DEPARTMENT_ID <=", value, "departmentId");
            return (Criteria) this;
        }

        public Criteria andDepartmentIdIn(List<BigDecimal> values) {
            addCriterion("DEPARTMENT_ID in", values, "departmentId");
            return (Criteria) this;
        }

        public Criteria andDepartmentIdNotIn(List<BigDecimal> values) {
            addCriterion("DEPARTMENT_ID not in", values, "departmentId");
            return (Criteria) this;
        }

        public Criteria andDepartmentIdBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("DEPARTMENT_ID between", value1, value2, "departmentId");
            return (Criteria) this;
        }

        public Criteria andDepartmentIdNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("DEPARTMENT_ID not between", value1, value2, "departmentId");
            return (Criteria) this;
        }

        public Criteria andEmployeeTypeIsNull() {
            addCriterion("EMPLOYEE_TYPE is null");
            return (Criteria) this;
        }

        public Criteria andEmployeeTypeIsNotNull() {
            addCriterion("EMPLOYEE_TYPE is not null");
            return (Criteria) this;
        }

        public Criteria andEmployeeTypeEqualTo(String value) {
            addCriterion("EMPLOYEE_TYPE =", value, "employeeType");
            return (Criteria) this;
        }

        public Criteria andEmployeeTypeNotEqualTo(String value) {
            addCriterion("EMPLOYEE_TYPE <>", value, "employeeType");
            return (Criteria) this;
        }

        public Criteria andEmployeeTypeGreaterThan(String value) {
            addCriterion("EMPLOYEE_TYPE >", value, "employeeType");
            return (Criteria) this;
        }

        public Criteria andEmployeeTypeGreaterThanOrEqualTo(String value) {
            addCriterion("EMPLOYEE_TYPE >=", value, "employeeType");
            return (Criteria) this;
        }

        public Criteria andEmployeeTypeLessThan(String value) {
            addCriterion("EMPLOYEE_TYPE <", value, "employeeType");
            return (Criteria) this;
        }

        public Criteria andEmployeeTypeLessThanOrEqualTo(String value) {
            addCriterion("EMPLOYEE_TYPE <=", value, "employeeType");
            return (Criteria) this;
        }

        public Criteria andEmployeeTypeLike(String value) {
            addCriterion("EMPLOYEE_TYPE like", value, "employeeType");
            return (Criteria) this;
        }

        public Criteria andEmployeeTypeNotLike(String value) {
            addCriterion("EMPLOYEE_TYPE not like", value, "employeeType");
            return (Criteria) this;
        }

        public Criteria andEmployeeTypeIn(List<String> values) {
            addCriterion("EMPLOYEE_TYPE in", values, "employeeType");
            return (Criteria) this;
        }

        public Criteria andEmployeeTypeNotIn(List<String> values) {
            addCriterion("EMPLOYEE_TYPE not in", values, "employeeType");
            return (Criteria) this;
        }

        public Criteria andEmployeeTypeBetween(String value1, String value2) {
            addCriterion("EMPLOYEE_TYPE between", value1, value2, "employeeType");
            return (Criteria) this;
        }

        public Criteria andEmployeeTypeNotBetween(String value1, String value2) {
            addCriterion("EMPLOYEE_TYPE not between", value1, value2, "employeeType");
            return (Criteria) this;
        }

        public Criteria andEmployeeRoleIsNull() {
            addCriterion("EMPLOYEE_ROLE is null");
            return (Criteria) this;
        }

        public Criteria andEmployeeRoleIsNotNull() {
            addCriterion("EMPLOYEE_ROLE is not null");
            return (Criteria) this;
        }

        public Criteria andEmployeeRoleEqualTo(String value) {
            addCriterion("EMPLOYEE_ROLE =", value, "employeeRole");
            return (Criteria) this;
        }

        public Criteria andEmployeeRoleNotEqualTo(String value) {
            addCriterion("EMPLOYEE_ROLE <>", value, "employeeRole");
            return (Criteria) this;
        }

        public Criteria andEmployeeRoleGreaterThan(String value) {
            addCriterion("EMPLOYEE_ROLE >", value, "employeeRole");
            return (Criteria) this;
        }

        public Criteria andEmployeeRoleGreaterThanOrEqualTo(String value) {
            addCriterion("EMPLOYEE_ROLE >=", value, "employeeRole");
            return (Criteria) this;
        }

        public Criteria andEmployeeRoleLessThan(String value) {
            addCriterion("EMPLOYEE_ROLE <", value, "employeeRole");
            return (Criteria) this;
        }

        public Criteria andEmployeeRoleLessThanOrEqualTo(String value) {
            addCriterion("EMPLOYEE_ROLE <=", value, "employeeRole");
            return (Criteria) this;
        }

        public Criteria andEmployeeRoleLike(String value) {
            addCriterion("EMPLOYEE_ROLE like", value, "employeeRole");
            return (Criteria) this;
        }

        public Criteria andEmployeeRoleNotLike(String value) {
            addCriterion("EMPLOYEE_ROLE not like", value, "employeeRole");
            return (Criteria) this;
        }

        public Criteria andEmployeeRoleIn(List<String> values) {
            addCriterion("EMPLOYEE_ROLE in", values, "employeeRole");
            return (Criteria) this;
        }

        public Criteria andEmployeeRoleNotIn(List<String> values) {
            addCriterion("EMPLOYEE_ROLE not in", values, "employeeRole");
            return (Criteria) this;
        }

        public Criteria andEmployeeRoleBetween(String value1, String value2) {
            addCriterion("EMPLOYEE_ROLE between", value1, value2, "employeeRole");
            return (Criteria) this;
        }

        public Criteria andEmployeeRoleNotBetween(String value1, String value2) {
            addCriterion("EMPLOYEE_ROLE not between", value1, value2, "employeeRole");
            return (Criteria) this;
        }

        public Criteria andNameIsNull() {
            addCriterion("NAME is null");
            return (Criteria) this;
        }

        public Criteria andNameIsNotNull() {
            addCriterion("NAME is not null");
            return (Criteria) this;
        }

        public Criteria andNameEqualTo(String value) {
            addCriterion("NAME =", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotEqualTo(String value) {
            addCriterion("NAME <>", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameGreaterThan(String value) {
            addCriterion("NAME >", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameGreaterThanOrEqualTo(String value) {
            addCriterion("NAME >=", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLessThan(String value) {
            addCriterion("NAME <", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLessThanOrEqualTo(String value) {
            addCriterion("NAME <=", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLike(String value) {
            addCriterion("NAME like", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotLike(String value) {
            addCriterion("NAME not like", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameIn(List<String> values) {
            addCriterion("NAME in", values, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotIn(List<String> values) {
            addCriterion("NAME not in", values, "name");
            return (Criteria) this;
        }

        public Criteria andNameBetween(String value1, String value2) {
            addCriterion("NAME between", value1, value2, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotBetween(String value1, String value2) {
            addCriterion("NAME not between", value1, value2, "name");
            return (Criteria) this;
        }

        public Criteria andMobileIsNull() {
            addCriterion("MOBILE is null");
            return (Criteria) this;
        }

        public Criteria andMobileIsNotNull() {
            addCriterion("MOBILE is not null");
            return (Criteria) this;
        }

        public Criteria andMobileEqualTo(String value) {
            addCriterion("MOBILE =", value, "mobile");
            return (Criteria) this;
        }

        public Criteria andMobileNotEqualTo(String value) {
            addCriterion("MOBILE <>", value, "mobile");
            return (Criteria) this;
        }

        public Criteria andMobileGreaterThan(String value) {
            addCriterion("MOBILE >", value, "mobile");
            return (Criteria) this;
        }

        public Criteria andMobileGreaterThanOrEqualTo(String value) {
            addCriterion("MOBILE >=", value, "mobile");
            return (Criteria) this;
        }

        public Criteria andMobileLessThan(String value) {
            addCriterion("MOBILE <", value, "mobile");
            return (Criteria) this;
        }

        public Criteria andMobileLessThanOrEqualTo(String value) {
            addCriterion("MOBILE <=", value, "mobile");
            return (Criteria) this;
        }

        public Criteria andMobileLike(String value) {
            addCriterion("MOBILE like", value, "mobile");
            return (Criteria) this;
        }

        public Criteria andMobileNotLike(String value) {
            addCriterion("MOBILE not like", value, "mobile");
            return (Criteria) this;
        }

        public Criteria andMobileIn(List<String> values) {
            addCriterion("MOBILE in", values, "mobile");
            return (Criteria) this;
        }

        public Criteria andMobileNotIn(List<String> values) {
            addCriterion("MOBILE not in", values, "mobile");
            return (Criteria) this;
        }

        public Criteria andMobileBetween(String value1, String value2) {
            addCriterion("MOBILE between", value1, value2, "mobile");
            return (Criteria) this;
        }

        public Criteria andMobileNotBetween(String value1, String value2) {
            addCriterion("MOBILE not between", value1, value2, "mobile");
            return (Criteria) this;
        }

        public Criteria andSexIsNull() {
            addCriterion("SEX is null");
            return (Criteria) this;
        }

        public Criteria andSexIsNotNull() {
            addCriterion("SEX is not null");
            return (Criteria) this;
        }

        public Criteria andSexEqualTo(String value) {
            addCriterion("SEX =", value, "sex");
            return (Criteria) this;
        }

        public Criteria andSexNotEqualTo(String value) {
            addCriterion("SEX <>", value, "sex");
            return (Criteria) this;
        }

        public Criteria andSexGreaterThan(String value) {
            addCriterion("SEX >", value, "sex");
            return (Criteria) this;
        }

        public Criteria andSexGreaterThanOrEqualTo(String value) {
            addCriterion("SEX >=", value, "sex");
            return (Criteria) this;
        }

        public Criteria andSexLessThan(String value) {
            addCriterion("SEX <", value, "sex");
            return (Criteria) this;
        }

        public Criteria andSexLessThanOrEqualTo(String value) {
            addCriterion("SEX <=", value, "sex");
            return (Criteria) this;
        }

        public Criteria andSexLike(String value) {
            addCriterion("SEX like", value, "sex");
            return (Criteria) this;
        }

        public Criteria andSexNotLike(String value) {
            addCriterion("SEX not like", value, "sex");
            return (Criteria) this;
        }

        public Criteria andSexIn(List<String> values) {
            addCriterion("SEX in", values, "sex");
            return (Criteria) this;
        }

        public Criteria andSexNotIn(List<String> values) {
            addCriterion("SEX not in", values, "sex");
            return (Criteria) this;
        }

        public Criteria andSexBetween(String value1, String value2) {
            addCriterion("SEX between", value1, value2, "sex");
            return (Criteria) this;
        }

        public Criteria andSexNotBetween(String value1, String value2) {
            addCriterion("SEX not between", value1, value2, "sex");
            return (Criteria) this;
        }

        public Criteria andAgeIsNull() {
            addCriterion("AGE is null");
            return (Criteria) this;
        }

        public Criteria andAgeIsNotNull() {
            addCriterion("AGE is not null");
            return (Criteria) this;
        }

        public Criteria andAgeEqualTo(BigDecimal value) {
            addCriterion("AGE =", value, "age");
            return (Criteria) this;
        }

        public Criteria andAgeNotEqualTo(BigDecimal value) {
            addCriterion("AGE <>", value, "age");
            return (Criteria) this;
        }

        public Criteria andAgeGreaterThan(BigDecimal value) {
            addCriterion("AGE >", value, "age");
            return (Criteria) this;
        }

        public Criteria andAgeGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("AGE >=", value, "age");
            return (Criteria) this;
        }

        public Criteria andAgeLessThan(BigDecimal value) {
            addCriterion("AGE <", value, "age");
            return (Criteria) this;
        }

        public Criteria andAgeLessThanOrEqualTo(BigDecimal value) {
            addCriterion("AGE <=", value, "age");
            return (Criteria) this;
        }

        public Criteria andAgeIn(List<BigDecimal> values) {
            addCriterion("AGE in", values, "age");
            return (Criteria) this;
        }

        public Criteria andAgeNotIn(List<BigDecimal> values) {
            addCriterion("AGE not in", values, "age");
            return (Criteria) this;
        }

        public Criteria andAgeBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("AGE between", value1, value2, "age");
            return (Criteria) this;
        }

        public Criteria andAgeNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("AGE not between", value1, value2, "age");
            return (Criteria) this;
        }

        public Criteria andEducationIsNull() {
            addCriterion("EDUCATION is null");
            return (Criteria) this;
        }

        public Criteria andEducationIsNotNull() {
            addCriterion("EDUCATION is not null");
            return (Criteria) this;
        }

        public Criteria andEducationEqualTo(String value) {
            addCriterion("EDUCATION =", value, "education");
            return (Criteria) this;
        }

        public Criteria andEducationNotEqualTo(String value) {
            addCriterion("EDUCATION <>", value, "education");
            return (Criteria) this;
        }

        public Criteria andEducationGreaterThan(String value) {
            addCriterion("EDUCATION >", value, "education");
            return (Criteria) this;
        }

        public Criteria andEducationGreaterThanOrEqualTo(String value) {
            addCriterion("EDUCATION >=", value, "education");
            return (Criteria) this;
        }

        public Criteria andEducationLessThan(String value) {
            addCriterion("EDUCATION <", value, "education");
            return (Criteria) this;
        }

        public Criteria andEducationLessThanOrEqualTo(String value) {
            addCriterion("EDUCATION <=", value, "education");
            return (Criteria) this;
        }

        public Criteria andEducationLike(String value) {
            addCriterion("EDUCATION like", value, "education");
            return (Criteria) this;
        }

        public Criteria andEducationNotLike(String value) {
            addCriterion("EDUCATION not like", value, "education");
            return (Criteria) this;
        }

        public Criteria andEducationIn(List<String> values) {
            addCriterion("EDUCATION in", values, "education");
            return (Criteria) this;
        }

        public Criteria andEducationNotIn(List<String> values) {
            addCriterion("EDUCATION not in", values, "education");
            return (Criteria) this;
        }

        public Criteria andEducationBetween(String value1, String value2) {
            addCriterion("EDUCATION between", value1, value2, "education");
            return (Criteria) this;
        }

        public Criteria andEducationNotBetween(String value1, String value2) {
            addCriterion("EDUCATION not between", value1, value2, "education");
            return (Criteria) this;
        }

        public Criteria andDepartmentChairmanIsNull() {
            addCriterion("DEPARTMENT_CHAIRMAN is null");
            return (Criteria) this;
        }

        public Criteria andDepartmentChairmanIsNotNull() {
            addCriterion("DEPARTMENT_CHAIRMAN is not null");
            return (Criteria) this;
        }

        public Criteria andDepartmentChairmanEqualTo(String value) {
            addCriterion("DEPARTMENT_CHAIRMAN =", value, "departmentChairman");
            return (Criteria) this;
        }

        public Criteria andDepartmentChairmanNotEqualTo(String value) {
            addCriterion("DEPARTMENT_CHAIRMAN <>", value, "departmentChairman");
            return (Criteria) this;
        }

        public Criteria andDepartmentChairmanGreaterThan(String value) {
            addCriterion("DEPARTMENT_CHAIRMAN >", value, "departmentChairman");
            return (Criteria) this;
        }

        public Criteria andDepartmentChairmanGreaterThanOrEqualTo(String value) {
            addCriterion("DEPARTMENT_CHAIRMAN >=", value, "departmentChairman");
            return (Criteria) this;
        }

        public Criteria andDepartmentChairmanLessThan(String value) {
            addCriterion("DEPARTMENT_CHAIRMAN <", value, "departmentChairman");
            return (Criteria) this;
        }

        public Criteria andDepartmentChairmanLessThanOrEqualTo(String value) {
            addCriterion("DEPARTMENT_CHAIRMAN <=", value, "departmentChairman");
            return (Criteria) this;
        }

        public Criteria andDepartmentChairmanLike(String value) {
            addCriterion("DEPARTMENT_CHAIRMAN like", value, "departmentChairman");
            return (Criteria) this;
        }

        public Criteria andDepartmentChairmanNotLike(String value) {
            addCriterion("DEPARTMENT_CHAIRMAN not like", value, "departmentChairman");
            return (Criteria) this;
        }

        public Criteria andDepartmentChairmanIn(List<String> values) {
            addCriterion("DEPARTMENT_CHAIRMAN in", values, "departmentChairman");
            return (Criteria) this;
        }

        public Criteria andDepartmentChairmanNotIn(List<String> values) {
            addCriterion("DEPARTMENT_CHAIRMAN not in", values, "departmentChairman");
            return (Criteria) this;
        }

        public Criteria andDepartmentChairmanBetween(String value1, String value2) {
            addCriterion("DEPARTMENT_CHAIRMAN between", value1, value2, "departmentChairman");
            return (Criteria) this;
        }

        public Criteria andDepartmentChairmanNotBetween(String value1, String value2) {
            addCriterion("DEPARTMENT_CHAIRMAN not between", value1, value2, "departmentChairman");
            return (Criteria) this;
        }

        public Criteria andAppUserIsNull() {
            addCriterion("APP_USER is null");
            return (Criteria) this;
        }

        public Criteria andAppUserIsNotNull() {
            addCriterion("APP_USER is not null");
            return (Criteria) this;
        }

        public Criteria andAppUserEqualTo(String value) {
            addCriterion("APP_USER =", value, "appUser");
            return (Criteria) this;
        }

        public Criteria andAppUserNotEqualTo(String value) {
            addCriterion("APP_USER <>", value, "appUser");
            return (Criteria) this;
        }

        public Criteria andAppUserGreaterThan(String value) {
            addCriterion("APP_USER >", value, "appUser");
            return (Criteria) this;
        }

        public Criteria andAppUserGreaterThanOrEqualTo(String value) {
            addCriterion("APP_USER >=", value, "appUser");
            return (Criteria) this;
        }

        public Criteria andAppUserLessThan(String value) {
            addCriterion("APP_USER <", value, "appUser");
            return (Criteria) this;
        }

        public Criteria andAppUserLessThanOrEqualTo(String value) {
            addCriterion("APP_USER <=", value, "appUser");
            return (Criteria) this;
        }

        public Criteria andAppUserLike(String value) {
            addCriterion("APP_USER like", value, "appUser");
            return (Criteria) this;
        }

        public Criteria andAppUserNotLike(String value) {
            addCriterion("APP_USER not like", value, "appUser");
            return (Criteria) this;
        }

        public Criteria andAppUserIn(List<String> values) {
            addCriterion("APP_USER in", values, "appUser");
            return (Criteria) this;
        }

        public Criteria andAppUserNotIn(List<String> values) {
            addCriterion("APP_USER not in", values, "appUser");
            return (Criteria) this;
        }

        public Criteria andAppUserBetween(String value1, String value2) {
            addCriterion("APP_USER between", value1, value2, "appUser");
            return (Criteria) this;
        }

        public Criteria andAppUserNotBetween(String value1, String value2) {
            addCriterion("APP_USER not between", value1, value2, "appUser");
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

        public Criteria andLoginPasswdIsNull() {
            addCriterion("LOGIN_PASSWD is null");
            return (Criteria) this;
        }

        public Criteria andLoginPasswdIsNotNull() {
            addCriterion("LOGIN_PASSWD is not null");
            return (Criteria) this;
        }

        public Criteria andLoginPasswdEqualTo(String value) {
            addCriterion("LOGIN_PASSWD =", value, "loginPasswd");
            return (Criteria) this;
        }

        public Criteria andLoginPasswdNotEqualTo(String value) {
            addCriterion("LOGIN_PASSWD <>", value, "loginPasswd");
            return (Criteria) this;
        }

        public Criteria andLoginPasswdGreaterThan(String value) {
            addCriterion("LOGIN_PASSWD >", value, "loginPasswd");
            return (Criteria) this;
        }

        public Criteria andLoginPasswdGreaterThanOrEqualTo(String value) {
            addCriterion("LOGIN_PASSWD >=", value, "loginPasswd");
            return (Criteria) this;
        }

        public Criteria andLoginPasswdLessThan(String value) {
            addCriterion("LOGIN_PASSWD <", value, "loginPasswd");
            return (Criteria) this;
        }

        public Criteria andLoginPasswdLessThanOrEqualTo(String value) {
            addCriterion("LOGIN_PASSWD <=", value, "loginPasswd");
            return (Criteria) this;
        }

        public Criteria andLoginPasswdLike(String value) {
            addCriterion("LOGIN_PASSWD like", value, "loginPasswd");
            return (Criteria) this;
        }

        public Criteria andLoginPasswdNotLike(String value) {
            addCriterion("LOGIN_PASSWD not like", value, "loginPasswd");
            return (Criteria) this;
        }

        public Criteria andLoginPasswdIn(List<String> values) {
            addCriterion("LOGIN_PASSWD in", values, "loginPasswd");
            return (Criteria) this;
        }

        public Criteria andLoginPasswdNotIn(List<String> values) {
            addCriterion("LOGIN_PASSWD not in", values, "loginPasswd");
            return (Criteria) this;
        }

        public Criteria andLoginPasswdBetween(String value1, String value2) {
            addCriterion("LOGIN_PASSWD between", value1, value2, "loginPasswd");
            return (Criteria) this;
        }

        public Criteria andLoginPasswdNotBetween(String value1, String value2) {
            addCriterion("LOGIN_PASSWD not between", value1, value2, "loginPasswd");
            return (Criteria) this;
        }

        public Criteria andPassswdSaltIsNull() {
            addCriterion("PASSSWD_SALT is null");
            return (Criteria) this;
        }

        public Criteria andPassswdSaltIsNotNull() {
            addCriterion("PASSSWD_SALT is not null");
            return (Criteria) this;
        }

        public Criteria andPassswdSaltEqualTo(String value) {
            addCriterion("PASSSWD_SALT =", value, "passswdSalt");
            return (Criteria) this;
        }

        public Criteria andPassswdSaltNotEqualTo(String value) {
            addCriterion("PASSSWD_SALT <>", value, "passswdSalt");
            return (Criteria) this;
        }

        public Criteria andPassswdSaltGreaterThan(String value) {
            addCriterion("PASSSWD_SALT >", value, "passswdSalt");
            return (Criteria) this;
        }

        public Criteria andPassswdSaltGreaterThanOrEqualTo(String value) {
            addCriterion("PASSSWD_SALT >=", value, "passswdSalt");
            return (Criteria) this;
        }

        public Criteria andPassswdSaltLessThan(String value) {
            addCriterion("PASSSWD_SALT <", value, "passswdSalt");
            return (Criteria) this;
        }

        public Criteria andPassswdSaltLessThanOrEqualTo(String value) {
            addCriterion("PASSSWD_SALT <=", value, "passswdSalt");
            return (Criteria) this;
        }

        public Criteria andPassswdSaltLike(String value) {
            addCriterion("PASSSWD_SALT like", value, "passswdSalt");
            return (Criteria) this;
        }

        public Criteria andPassswdSaltNotLike(String value) {
            addCriterion("PASSSWD_SALT not like", value, "passswdSalt");
            return (Criteria) this;
        }

        public Criteria andPassswdSaltIn(List<String> values) {
            addCriterion("PASSSWD_SALT in", values, "passswdSalt");
            return (Criteria) this;
        }

        public Criteria andPassswdSaltNotIn(List<String> values) {
            addCriterion("PASSSWD_SALT not in", values, "passswdSalt");
            return (Criteria) this;
        }

        public Criteria andPassswdSaltBetween(String value1, String value2) {
            addCriterion("PASSSWD_SALT between", value1, value2, "passswdSalt");
            return (Criteria) this;
        }

        public Criteria andPassswdSaltNotBetween(String value1, String value2) {
            addCriterion("PASSSWD_SALT not between", value1, value2, "passswdSalt");
            return (Criteria) this;
        }

        public Criteria andEmployeeStatusIsNull() {
            addCriterion("EMPLOYEE_STATUS is null");
            return (Criteria) this;
        }

        public Criteria andEmployeeStatusIsNotNull() {
            addCriterion("EMPLOYEE_STATUS is not null");
            return (Criteria) this;
        }

        public Criteria andEmployeeStatusEqualTo(String value) {
            addCriterion("EMPLOYEE_STATUS =", value, "employeeStatus");
            return (Criteria) this;
        }

        public Criteria andEmployeeStatusNotEqualTo(String value) {
            addCriterion("EMPLOYEE_STATUS <>", value, "employeeStatus");
            return (Criteria) this;
        }

        public Criteria andEmployeeStatusGreaterThan(String value) {
            addCriterion("EMPLOYEE_STATUS >", value, "employeeStatus");
            return (Criteria) this;
        }

        public Criteria andEmployeeStatusGreaterThanOrEqualTo(String value) {
            addCriterion("EMPLOYEE_STATUS >=", value, "employeeStatus");
            return (Criteria) this;
        }

        public Criteria andEmployeeStatusLessThan(String value) {
            addCriterion("EMPLOYEE_STATUS <", value, "employeeStatus");
            return (Criteria) this;
        }

        public Criteria andEmployeeStatusLessThanOrEqualTo(String value) {
            addCriterion("EMPLOYEE_STATUS <=", value, "employeeStatus");
            return (Criteria) this;
        }

        public Criteria andEmployeeStatusLike(String value) {
            addCriterion("EMPLOYEE_STATUS like", value, "employeeStatus");
            return (Criteria) this;
        }

        public Criteria andEmployeeStatusNotLike(String value) {
            addCriterion("EMPLOYEE_STATUS not like", value, "employeeStatus");
            return (Criteria) this;
        }

        public Criteria andEmployeeStatusIn(List<String> values) {
            addCriterion("EMPLOYEE_STATUS in", values, "employeeStatus");
            return (Criteria) this;
        }

        public Criteria andEmployeeStatusNotIn(List<String> values) {
            addCriterion("EMPLOYEE_STATUS not in", values, "employeeStatus");
            return (Criteria) this;
        }

        public Criteria andEmployeeStatusBetween(String value1, String value2) {
            addCriterion("EMPLOYEE_STATUS between", value1, value2, "employeeStatus");
            return (Criteria) this;
        }

        public Criteria andEmployeeStatusNotBetween(String value1, String value2) {
            addCriterion("EMPLOYEE_STATUS not between", value1, value2, "employeeStatus");
            return (Criteria) this;
        }

        public Criteria andWxOpenIdIsNull() {
            addCriterion("WX_OPEN_ID is null");
            return (Criteria) this;
        }

        public Criteria andWxOpenIdIsNotNull() {
            addCriterion("WX_OPEN_ID is not null");
            return (Criteria) this;
        }

        public Criteria andWxOpenIdEqualTo(String value) {
            addCriterion("WX_OPEN_ID =", value, "wxOpenId");
            return (Criteria) this;
        }

        public Criteria andWxOpenIdNotEqualTo(String value) {
            addCriterion("WX_OPEN_ID <>", value, "wxOpenId");
            return (Criteria) this;
        }

        public Criteria andWxOpenIdGreaterThan(String value) {
            addCriterion("WX_OPEN_ID >", value, "wxOpenId");
            return (Criteria) this;
        }

        public Criteria andWxOpenIdGreaterThanOrEqualTo(String value) {
            addCriterion("WX_OPEN_ID >=", value, "wxOpenId");
            return (Criteria) this;
        }

        public Criteria andWxOpenIdLessThan(String value) {
            addCriterion("WX_OPEN_ID <", value, "wxOpenId");
            return (Criteria) this;
        }

        public Criteria andWxOpenIdLessThanOrEqualTo(String value) {
            addCriterion("WX_OPEN_ID <=", value, "wxOpenId");
            return (Criteria) this;
        }

        public Criteria andWxOpenIdLike(String value) {
            addCriterion("WX_OPEN_ID like", value, "wxOpenId");
            return (Criteria) this;
        }

        public Criteria andWxOpenIdNotLike(String value) {
            addCriterion("WX_OPEN_ID not like", value, "wxOpenId");
            return (Criteria) this;
        }

        public Criteria andWxOpenIdIn(List<String> values) {
            addCriterion("WX_OPEN_ID in", values, "wxOpenId");
            return (Criteria) this;
        }

        public Criteria andWxOpenIdNotIn(List<String> values) {
            addCriterion("WX_OPEN_ID not in", values, "wxOpenId");
            return (Criteria) this;
        }

        public Criteria andWxOpenIdBetween(String value1, String value2) {
            addCriterion("WX_OPEN_ID between", value1, value2, "wxOpenId");
            return (Criteria) this;
        }

        public Criteria andWxOpenIdNotBetween(String value1, String value2) {
            addCriterion("WX_OPEN_ID not between", value1, value2, "wxOpenId");
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