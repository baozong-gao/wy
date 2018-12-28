package com.shenxin.core.smartpropertymanagement.persist.entity;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class ContractTemplateDAOExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ContractTemplateDAOExample() {
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

        public Criteria andContractTypeIsNull() {
            addCriterion("CONTRACT_TYPE is null");
            return (Criteria) this;
        }

        public Criteria andContractTypeIsNotNull() {
            addCriterion("CONTRACT_TYPE is not null");
            return (Criteria) this;
        }

        public Criteria andContractTypeEqualTo(String value) {
            addCriterion("CONTRACT_TYPE =", value, "contractType");
            return (Criteria) this;
        }

        public Criteria andContractTypeNotEqualTo(String value) {
            addCriterion("CONTRACT_TYPE <>", value, "contractType");
            return (Criteria) this;
        }

        public Criteria andContractTypeGreaterThan(String value) {
            addCriterion("CONTRACT_TYPE >", value, "contractType");
            return (Criteria) this;
        }

        public Criteria andContractTypeGreaterThanOrEqualTo(String value) {
            addCriterion("CONTRACT_TYPE >=", value, "contractType");
            return (Criteria) this;
        }

        public Criteria andContractTypeLessThan(String value) {
            addCriterion("CONTRACT_TYPE <", value, "contractType");
            return (Criteria) this;
        }

        public Criteria andContractTypeLessThanOrEqualTo(String value) {
            addCriterion("CONTRACT_TYPE <=", value, "contractType");
            return (Criteria) this;
        }

        public Criteria andContractTypeLike(String value) {
            addCriterion("CONTRACT_TYPE like", value, "contractType");
            return (Criteria) this;
        }

        public Criteria andContractTypeNotLike(String value) {
            addCriterion("CONTRACT_TYPE not like", value, "contractType");
            return (Criteria) this;
        }

        public Criteria andContractTypeIn(List<String> values) {
            addCriterion("CONTRACT_TYPE in", values, "contractType");
            return (Criteria) this;
        }

        public Criteria andContractTypeNotIn(List<String> values) {
            addCriterion("CONTRACT_TYPE not in", values, "contractType");
            return (Criteria) this;
        }

        public Criteria andContractTypeBetween(String value1, String value2) {
            addCriterion("CONTRACT_TYPE between", value1, value2, "contractType");
            return (Criteria) this;
        }

        public Criteria andContractTypeNotBetween(String value1, String value2) {
            addCriterion("CONTRACT_TYPE not between", value1, value2, "contractType");
            return (Criteria) this;
        }

        public Criteria andContractTemplateNameIsNull() {
            addCriterion("CONTRACT_TEMPLATE_NAME is null");
            return (Criteria) this;
        }

        public Criteria andContractTemplateNameIsNotNull() {
            addCriterion("CONTRACT_TEMPLATE_NAME is not null");
            return (Criteria) this;
        }

        public Criteria andContractTemplateNameEqualTo(String value) {
            addCriterion("CONTRACT_TEMPLATE_NAME =", value, "contractTemplateName");
            return (Criteria) this;
        }

        public Criteria andContractTemplateNameNotEqualTo(String value) {
            addCriterion("CONTRACT_TEMPLATE_NAME <>", value, "contractTemplateName");
            return (Criteria) this;
        }

        public Criteria andContractTemplateNameGreaterThan(String value) {
            addCriterion("CONTRACT_TEMPLATE_NAME >", value, "contractTemplateName");
            return (Criteria) this;
        }

        public Criteria andContractTemplateNameGreaterThanOrEqualTo(String value) {
            addCriterion("CONTRACT_TEMPLATE_NAME >=", value, "contractTemplateName");
            return (Criteria) this;
        }

        public Criteria andContractTemplateNameLessThan(String value) {
            addCriterion("CONTRACT_TEMPLATE_NAME <", value, "contractTemplateName");
            return (Criteria) this;
        }

        public Criteria andContractTemplateNameLessThanOrEqualTo(String value) {
            addCriterion("CONTRACT_TEMPLATE_NAME <=", value, "contractTemplateName");
            return (Criteria) this;
        }

        public Criteria andContractTemplateNameLike(String value) {
            addCriterion("CONTRACT_TEMPLATE_NAME like", value, "contractTemplateName");
            return (Criteria) this;
        }

        public Criteria andContractTemplateNameNotLike(String value) {
            addCriterion("CONTRACT_TEMPLATE_NAME not like", value, "contractTemplateName");
            return (Criteria) this;
        }

        public Criteria andContractTemplateNameIn(List<String> values) {
            addCriterion("CONTRACT_TEMPLATE_NAME in", values, "contractTemplateName");
            return (Criteria) this;
        }

        public Criteria andContractTemplateNameNotIn(List<String> values) {
            addCriterion("CONTRACT_TEMPLATE_NAME not in", values, "contractTemplateName");
            return (Criteria) this;
        }

        public Criteria andContractTemplateNameBetween(String value1, String value2) {
            addCriterion("CONTRACT_TEMPLATE_NAME between", value1, value2, "contractTemplateName");
            return (Criteria) this;
        }

        public Criteria andContractTemplateNameNotBetween(String value1, String value2) {
            addCriterion("CONTRACT_TEMPLATE_NAME not between", value1, value2, "contractTemplateName");
            return (Criteria) this;
        }

        public Criteria andTemplateDocLocationIsNull() {
            addCriterion("TEMPLATE_DOC_LOCATION is null");
            return (Criteria) this;
        }

        public Criteria andTemplateDocLocationIsNotNull() {
            addCriterion("TEMPLATE_DOC_LOCATION is not null");
            return (Criteria) this;
        }

        public Criteria andTemplateDocLocationEqualTo(String value) {
            addCriterion("TEMPLATE_DOC_LOCATION =", value, "templateDocLocation");
            return (Criteria) this;
        }

        public Criteria andTemplateDocLocationNotEqualTo(String value) {
            addCriterion("TEMPLATE_DOC_LOCATION <>", value, "templateDocLocation");
            return (Criteria) this;
        }

        public Criteria andTemplateDocLocationGreaterThan(String value) {
            addCriterion("TEMPLATE_DOC_LOCATION >", value, "templateDocLocation");
            return (Criteria) this;
        }

        public Criteria andTemplateDocLocationGreaterThanOrEqualTo(String value) {
            addCriterion("TEMPLATE_DOC_LOCATION >=", value, "templateDocLocation");
            return (Criteria) this;
        }

        public Criteria andTemplateDocLocationLessThan(String value) {
            addCriterion("TEMPLATE_DOC_LOCATION <", value, "templateDocLocation");
            return (Criteria) this;
        }

        public Criteria andTemplateDocLocationLessThanOrEqualTo(String value) {
            addCriterion("TEMPLATE_DOC_LOCATION <=", value, "templateDocLocation");
            return (Criteria) this;
        }

        public Criteria andTemplateDocLocationLike(String value) {
            addCriterion("TEMPLATE_DOC_LOCATION like", value, "templateDocLocation");
            return (Criteria) this;
        }

        public Criteria andTemplateDocLocationNotLike(String value) {
            addCriterion("TEMPLATE_DOC_LOCATION not like", value, "templateDocLocation");
            return (Criteria) this;
        }

        public Criteria andTemplateDocLocationIn(List<String> values) {
            addCriterion("TEMPLATE_DOC_LOCATION in", values, "templateDocLocation");
            return (Criteria) this;
        }

        public Criteria andTemplateDocLocationNotIn(List<String> values) {
            addCriterion("TEMPLATE_DOC_LOCATION not in", values, "templateDocLocation");
            return (Criteria) this;
        }

        public Criteria andTemplateDocLocationBetween(String value1, String value2) {
            addCriterion("TEMPLATE_DOC_LOCATION between", value1, value2, "templateDocLocation");
            return (Criteria) this;
        }

        public Criteria andTemplateDocLocationNotBetween(String value1, String value2) {
            addCriterion("TEMPLATE_DOC_LOCATION not between", value1, value2, "templateDocLocation");
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