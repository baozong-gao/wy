package com.shenxin.core.smartpropertymanagement.persist.entity;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class ContractInfoDAOExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ContractInfoDAOExample() {
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

        public Criteria andContractTemplateIdIsNull() {
            addCriterion("CONTRACT_TEMPLATE_ID is null");
            return (Criteria) this;
        }

        public Criteria andContractTemplateIdIsNotNull() {
            addCriterion("CONTRACT_TEMPLATE_ID is not null");
            return (Criteria) this;
        }

        public Criteria andContractTemplateIdEqualTo(BigDecimal value) {
            addCriterion("CONTRACT_TEMPLATE_ID =", value, "contractTemplateId");
            return (Criteria) this;
        }

        public Criteria andContractTemplateIdNotEqualTo(BigDecimal value) {
            addCriterion("CONTRACT_TEMPLATE_ID <>", value, "contractTemplateId");
            return (Criteria) this;
        }

        public Criteria andContractTemplateIdGreaterThan(BigDecimal value) {
            addCriterion("CONTRACT_TEMPLATE_ID >", value, "contractTemplateId");
            return (Criteria) this;
        }

        public Criteria andContractTemplateIdGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("CONTRACT_TEMPLATE_ID >=", value, "contractTemplateId");
            return (Criteria) this;
        }

        public Criteria andContractTemplateIdLessThan(BigDecimal value) {
            addCriterion("CONTRACT_TEMPLATE_ID <", value, "contractTemplateId");
            return (Criteria) this;
        }

        public Criteria andContractTemplateIdLessThanOrEqualTo(BigDecimal value) {
            addCriterion("CONTRACT_TEMPLATE_ID <=", value, "contractTemplateId");
            return (Criteria) this;
        }

        public Criteria andContractTemplateIdIn(List<BigDecimal> values) {
            addCriterion("CONTRACT_TEMPLATE_ID in", values, "contractTemplateId");
            return (Criteria) this;
        }

        public Criteria andContractTemplateIdNotIn(List<BigDecimal> values) {
            addCriterion("CONTRACT_TEMPLATE_ID not in", values, "contractTemplateId");
            return (Criteria) this;
        }

        public Criteria andContractTemplateIdBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("CONTRACT_TEMPLATE_ID between", value1, value2, "contractTemplateId");
            return (Criteria) this;
        }

        public Criteria andContractTemplateIdNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("CONTRACT_TEMPLATE_ID not between", value1, value2, "contractTemplateId");
            return (Criteria) this;
        }

        public Criteria andPrincipleNameIsNull() {
            addCriterion("PRINCIPLE_NAME is null");
            return (Criteria) this;
        }

        public Criteria andPrincipleNameIsNotNull() {
            addCriterion("PRINCIPLE_NAME is not null");
            return (Criteria) this;
        }

        public Criteria andPrincipleNameEqualTo(String value) {
            addCriterion("PRINCIPLE_NAME =", value, "principleName");
            return (Criteria) this;
        }

        public Criteria andPrincipleNameNotEqualTo(String value) {
            addCriterion("PRINCIPLE_NAME <>", value, "principleName");
            return (Criteria) this;
        }

        public Criteria andPrincipleNameGreaterThan(String value) {
            addCriterion("PRINCIPLE_NAME >", value, "principleName");
            return (Criteria) this;
        }

        public Criteria andPrincipleNameGreaterThanOrEqualTo(String value) {
            addCriterion("PRINCIPLE_NAME >=", value, "principleName");
            return (Criteria) this;
        }

        public Criteria andPrincipleNameLessThan(String value) {
            addCriterion("PRINCIPLE_NAME <", value, "principleName");
            return (Criteria) this;
        }

        public Criteria andPrincipleNameLessThanOrEqualTo(String value) {
            addCriterion("PRINCIPLE_NAME <=", value, "principleName");
            return (Criteria) this;
        }

        public Criteria andPrincipleNameLike(String value) {
            addCriterion("PRINCIPLE_NAME like", value, "principleName");
            return (Criteria) this;
        }

        public Criteria andPrincipleNameNotLike(String value) {
            addCriterion("PRINCIPLE_NAME not like", value, "principleName");
            return (Criteria) this;
        }

        public Criteria andPrincipleNameIn(List<String> values) {
            addCriterion("PRINCIPLE_NAME in", values, "principleName");
            return (Criteria) this;
        }

        public Criteria andPrincipleNameNotIn(List<String> values) {
            addCriterion("PRINCIPLE_NAME not in", values, "principleName");
            return (Criteria) this;
        }

        public Criteria andPrincipleNameBetween(String value1, String value2) {
            addCriterion("PRINCIPLE_NAME between", value1, value2, "principleName");
            return (Criteria) this;
        }

        public Criteria andPrincipleNameNotBetween(String value1, String value2) {
            addCriterion("PRINCIPLE_NAME not between", value1, value2, "principleName");
            return (Criteria) this;
        }

        public Criteria andPrincipleMobileIsNull() {
            addCriterion("PRINCIPLE_MOBILE is null");
            return (Criteria) this;
        }

        public Criteria andPrincipleMobileIsNotNull() {
            addCriterion("PRINCIPLE_MOBILE is not null");
            return (Criteria) this;
        }

        public Criteria andPrincipleMobileEqualTo(String value) {
            addCriterion("PRINCIPLE_MOBILE =", value, "principleMobile");
            return (Criteria) this;
        }

        public Criteria andPrincipleMobileNotEqualTo(String value) {
            addCriterion("PRINCIPLE_MOBILE <>", value, "principleMobile");
            return (Criteria) this;
        }

        public Criteria andPrincipleMobileGreaterThan(String value) {
            addCriterion("PRINCIPLE_MOBILE >", value, "principleMobile");
            return (Criteria) this;
        }

        public Criteria andPrincipleMobileGreaterThanOrEqualTo(String value) {
            addCriterion("PRINCIPLE_MOBILE >=", value, "principleMobile");
            return (Criteria) this;
        }

        public Criteria andPrincipleMobileLessThan(String value) {
            addCriterion("PRINCIPLE_MOBILE <", value, "principleMobile");
            return (Criteria) this;
        }

        public Criteria andPrincipleMobileLessThanOrEqualTo(String value) {
            addCriterion("PRINCIPLE_MOBILE <=", value, "principleMobile");
            return (Criteria) this;
        }

        public Criteria andPrincipleMobileLike(String value) {
            addCriterion("PRINCIPLE_MOBILE like", value, "principleMobile");
            return (Criteria) this;
        }

        public Criteria andPrincipleMobileNotLike(String value) {
            addCriterion("PRINCIPLE_MOBILE not like", value, "principleMobile");
            return (Criteria) this;
        }

        public Criteria andPrincipleMobileIn(List<String> values) {
            addCriterion("PRINCIPLE_MOBILE in", values, "principleMobile");
            return (Criteria) this;
        }

        public Criteria andPrincipleMobileNotIn(List<String> values) {
            addCriterion("PRINCIPLE_MOBILE not in", values, "principleMobile");
            return (Criteria) this;
        }

        public Criteria andPrincipleMobileBetween(String value1, String value2) {
            addCriterion("PRINCIPLE_MOBILE between", value1, value2, "principleMobile");
            return (Criteria) this;
        }

        public Criteria andPrincipleMobileNotBetween(String value1, String value2) {
            addCriterion("PRINCIPLE_MOBILE not between", value1, value2, "principleMobile");
            return (Criteria) this;
        }

        public Criteria andPrincipleAddressIsNull() {
            addCriterion("PRINCIPLE_ADDRESS is null");
            return (Criteria) this;
        }

        public Criteria andPrincipleAddressIsNotNull() {
            addCriterion("PRINCIPLE_ADDRESS is not null");
            return (Criteria) this;
        }

        public Criteria andPrincipleAddressEqualTo(String value) {
            addCriterion("PRINCIPLE_ADDRESS =", value, "principleAddress");
            return (Criteria) this;
        }

        public Criteria andPrincipleAddressNotEqualTo(String value) {
            addCriterion("PRINCIPLE_ADDRESS <>", value, "principleAddress");
            return (Criteria) this;
        }

        public Criteria andPrincipleAddressGreaterThan(String value) {
            addCriterion("PRINCIPLE_ADDRESS >", value, "principleAddress");
            return (Criteria) this;
        }

        public Criteria andPrincipleAddressGreaterThanOrEqualTo(String value) {
            addCriterion("PRINCIPLE_ADDRESS >=", value, "principleAddress");
            return (Criteria) this;
        }

        public Criteria andPrincipleAddressLessThan(String value) {
            addCriterion("PRINCIPLE_ADDRESS <", value, "principleAddress");
            return (Criteria) this;
        }

        public Criteria andPrincipleAddressLessThanOrEqualTo(String value) {
            addCriterion("PRINCIPLE_ADDRESS <=", value, "principleAddress");
            return (Criteria) this;
        }

        public Criteria andPrincipleAddressLike(String value) {
            addCriterion("PRINCIPLE_ADDRESS like", value, "principleAddress");
            return (Criteria) this;
        }

        public Criteria andPrincipleAddressNotLike(String value) {
            addCriterion("PRINCIPLE_ADDRESS not like", value, "principleAddress");
            return (Criteria) this;
        }

        public Criteria andPrincipleAddressIn(List<String> values) {
            addCriterion("PRINCIPLE_ADDRESS in", values, "principleAddress");
            return (Criteria) this;
        }

        public Criteria andPrincipleAddressNotIn(List<String> values) {
            addCriterion("PRINCIPLE_ADDRESS not in", values, "principleAddress");
            return (Criteria) this;
        }

        public Criteria andPrincipleAddressBetween(String value1, String value2) {
            addCriterion("PRINCIPLE_ADDRESS between", value1, value2, "principleAddress");
            return (Criteria) this;
        }

        public Criteria andPrincipleAddressNotBetween(String value1, String value2) {
            addCriterion("PRINCIPLE_ADDRESS not between", value1, value2, "principleAddress");
            return (Criteria) this;
        }

        public Criteria andPrincipleAgentIsNull() {
            addCriterion("PRINCIPLE_AGENT is null");
            return (Criteria) this;
        }

        public Criteria andPrincipleAgentIsNotNull() {
            addCriterion("PRINCIPLE_AGENT is not null");
            return (Criteria) this;
        }

        public Criteria andPrincipleAgentEqualTo(String value) {
            addCriterion("PRINCIPLE_AGENT =", value, "principleAgent");
            return (Criteria) this;
        }

        public Criteria andPrincipleAgentNotEqualTo(String value) {
            addCriterion("PRINCIPLE_AGENT <>", value, "principleAgent");
            return (Criteria) this;
        }

        public Criteria andPrincipleAgentGreaterThan(String value) {
            addCriterion("PRINCIPLE_AGENT >", value, "principleAgent");
            return (Criteria) this;
        }

        public Criteria andPrincipleAgentGreaterThanOrEqualTo(String value) {
            addCriterion("PRINCIPLE_AGENT >=", value, "principleAgent");
            return (Criteria) this;
        }

        public Criteria andPrincipleAgentLessThan(String value) {
            addCriterion("PRINCIPLE_AGENT <", value, "principleAgent");
            return (Criteria) this;
        }

        public Criteria andPrincipleAgentLessThanOrEqualTo(String value) {
            addCriterion("PRINCIPLE_AGENT <=", value, "principleAgent");
            return (Criteria) this;
        }

        public Criteria andPrincipleAgentLike(String value) {
            addCriterion("PRINCIPLE_AGENT like", value, "principleAgent");
            return (Criteria) this;
        }

        public Criteria andPrincipleAgentNotLike(String value) {
            addCriterion("PRINCIPLE_AGENT not like", value, "principleAgent");
            return (Criteria) this;
        }

        public Criteria andPrincipleAgentIn(List<String> values) {
            addCriterion("PRINCIPLE_AGENT in", values, "principleAgent");
            return (Criteria) this;
        }

        public Criteria andPrincipleAgentNotIn(List<String> values) {
            addCriterion("PRINCIPLE_AGENT not in", values, "principleAgent");
            return (Criteria) this;
        }

        public Criteria andPrincipleAgentBetween(String value1, String value2) {
            addCriterion("PRINCIPLE_AGENT between", value1, value2, "principleAgent");
            return (Criteria) this;
        }

        public Criteria andPrincipleAgentNotBetween(String value1, String value2) {
            addCriterion("PRINCIPLE_AGENT not between", value1, value2, "principleAgent");
            return (Criteria) this;
        }

        public Criteria andPrincipleAgentMobileIsNull() {
            addCriterion("PRINCIPLE_AGENT_MOBILE is null");
            return (Criteria) this;
        }

        public Criteria andPrincipleAgentMobileIsNotNull() {
            addCriterion("PRINCIPLE_AGENT_MOBILE is not null");
            return (Criteria) this;
        }

        public Criteria andPrincipleAgentMobileEqualTo(String value) {
            addCriterion("PRINCIPLE_AGENT_MOBILE =", value, "principleAgentMobile");
            return (Criteria) this;
        }

        public Criteria andPrincipleAgentMobileNotEqualTo(String value) {
            addCriterion("PRINCIPLE_AGENT_MOBILE <>", value, "principleAgentMobile");
            return (Criteria) this;
        }

        public Criteria andPrincipleAgentMobileGreaterThan(String value) {
            addCriterion("PRINCIPLE_AGENT_MOBILE >", value, "principleAgentMobile");
            return (Criteria) this;
        }

        public Criteria andPrincipleAgentMobileGreaterThanOrEqualTo(String value) {
            addCriterion("PRINCIPLE_AGENT_MOBILE >=", value, "principleAgentMobile");
            return (Criteria) this;
        }

        public Criteria andPrincipleAgentMobileLessThan(String value) {
            addCriterion("PRINCIPLE_AGENT_MOBILE <", value, "principleAgentMobile");
            return (Criteria) this;
        }

        public Criteria andPrincipleAgentMobileLessThanOrEqualTo(String value) {
            addCriterion("PRINCIPLE_AGENT_MOBILE <=", value, "principleAgentMobile");
            return (Criteria) this;
        }

        public Criteria andPrincipleAgentMobileLike(String value) {
            addCriterion("PRINCIPLE_AGENT_MOBILE like", value, "principleAgentMobile");
            return (Criteria) this;
        }

        public Criteria andPrincipleAgentMobileNotLike(String value) {
            addCriterion("PRINCIPLE_AGENT_MOBILE not like", value, "principleAgentMobile");
            return (Criteria) this;
        }

        public Criteria andPrincipleAgentMobileIn(List<String> values) {
            addCriterion("PRINCIPLE_AGENT_MOBILE in", values, "principleAgentMobile");
            return (Criteria) this;
        }

        public Criteria andPrincipleAgentMobileNotIn(List<String> values) {
            addCriterion("PRINCIPLE_AGENT_MOBILE not in", values, "principleAgentMobile");
            return (Criteria) this;
        }

        public Criteria andPrincipleAgentMobileBetween(String value1, String value2) {
            addCriterion("PRINCIPLE_AGENT_MOBILE between", value1, value2, "principleAgentMobile");
            return (Criteria) this;
        }

        public Criteria andPrincipleAgentMobileNotBetween(String value1, String value2) {
            addCriterion("PRINCIPLE_AGENT_MOBILE not between", value1, value2, "principleAgentMobile");
            return (Criteria) this;
        }

        public Criteria andPrincipleAgentAddressIsNull() {
            addCriterion("PRINCIPLE_AGENT_ADDRESS is null");
            return (Criteria) this;
        }

        public Criteria andPrincipleAgentAddressIsNotNull() {
            addCriterion("PRINCIPLE_AGENT_ADDRESS is not null");
            return (Criteria) this;
        }

        public Criteria andPrincipleAgentAddressEqualTo(String value) {
            addCriterion("PRINCIPLE_AGENT_ADDRESS =", value, "principleAgentAddress");
            return (Criteria) this;
        }

        public Criteria andPrincipleAgentAddressNotEqualTo(String value) {
            addCriterion("PRINCIPLE_AGENT_ADDRESS <>", value, "principleAgentAddress");
            return (Criteria) this;
        }

        public Criteria andPrincipleAgentAddressGreaterThan(String value) {
            addCriterion("PRINCIPLE_AGENT_ADDRESS >", value, "principleAgentAddress");
            return (Criteria) this;
        }

        public Criteria andPrincipleAgentAddressGreaterThanOrEqualTo(String value) {
            addCriterion("PRINCIPLE_AGENT_ADDRESS >=", value, "principleAgentAddress");
            return (Criteria) this;
        }

        public Criteria andPrincipleAgentAddressLessThan(String value) {
            addCriterion("PRINCIPLE_AGENT_ADDRESS <", value, "principleAgentAddress");
            return (Criteria) this;
        }

        public Criteria andPrincipleAgentAddressLessThanOrEqualTo(String value) {
            addCriterion("PRINCIPLE_AGENT_ADDRESS <=", value, "principleAgentAddress");
            return (Criteria) this;
        }

        public Criteria andPrincipleAgentAddressLike(String value) {
            addCriterion("PRINCIPLE_AGENT_ADDRESS like", value, "principleAgentAddress");
            return (Criteria) this;
        }

        public Criteria andPrincipleAgentAddressNotLike(String value) {
            addCriterion("PRINCIPLE_AGENT_ADDRESS not like", value, "principleAgentAddress");
            return (Criteria) this;
        }

        public Criteria andPrincipleAgentAddressIn(List<String> values) {
            addCriterion("PRINCIPLE_AGENT_ADDRESS in", values, "principleAgentAddress");
            return (Criteria) this;
        }

        public Criteria andPrincipleAgentAddressNotIn(List<String> values) {
            addCriterion("PRINCIPLE_AGENT_ADDRESS not in", values, "principleAgentAddress");
            return (Criteria) this;
        }

        public Criteria andPrincipleAgentAddressBetween(String value1, String value2) {
            addCriterion("PRINCIPLE_AGENT_ADDRESS between", value1, value2, "principleAgentAddress");
            return (Criteria) this;
        }

        public Criteria andPrincipleAgentAddressNotBetween(String value1, String value2) {
            addCriterion("PRINCIPLE_AGENT_ADDRESS not between", value1, value2, "principleAgentAddress");
            return (Criteria) this;
        }

        public Criteria andPrincipleAgentRemarkIsNull() {
            addCriterion("PRINCIPLE_AGENT_REMARK is null");
            return (Criteria) this;
        }

        public Criteria andPrincipleAgentRemarkIsNotNull() {
            addCriterion("PRINCIPLE_AGENT_REMARK is not null");
            return (Criteria) this;
        }

        public Criteria andPrincipleAgentRemarkEqualTo(String value) {
            addCriterion("PRINCIPLE_AGENT_REMARK =", value, "principleAgentRemark");
            return (Criteria) this;
        }

        public Criteria andPrincipleAgentRemarkNotEqualTo(String value) {
            addCriterion("PRINCIPLE_AGENT_REMARK <>", value, "principleAgentRemark");
            return (Criteria) this;
        }

        public Criteria andPrincipleAgentRemarkGreaterThan(String value) {
            addCriterion("PRINCIPLE_AGENT_REMARK >", value, "principleAgentRemark");
            return (Criteria) this;
        }

        public Criteria andPrincipleAgentRemarkGreaterThanOrEqualTo(String value) {
            addCriterion("PRINCIPLE_AGENT_REMARK >=", value, "principleAgentRemark");
            return (Criteria) this;
        }

        public Criteria andPrincipleAgentRemarkLessThan(String value) {
            addCriterion("PRINCIPLE_AGENT_REMARK <", value, "principleAgentRemark");
            return (Criteria) this;
        }

        public Criteria andPrincipleAgentRemarkLessThanOrEqualTo(String value) {
            addCriterion("PRINCIPLE_AGENT_REMARK <=", value, "principleAgentRemark");
            return (Criteria) this;
        }

        public Criteria andPrincipleAgentRemarkLike(String value) {
            addCriterion("PRINCIPLE_AGENT_REMARK like", value, "principleAgentRemark");
            return (Criteria) this;
        }

        public Criteria andPrincipleAgentRemarkNotLike(String value) {
            addCriterion("PRINCIPLE_AGENT_REMARK not like", value, "principleAgentRemark");
            return (Criteria) this;
        }

        public Criteria andPrincipleAgentRemarkIn(List<String> values) {
            addCriterion("PRINCIPLE_AGENT_REMARK in", values, "principleAgentRemark");
            return (Criteria) this;
        }

        public Criteria andPrincipleAgentRemarkNotIn(List<String> values) {
            addCriterion("PRINCIPLE_AGENT_REMARK not in", values, "principleAgentRemark");
            return (Criteria) this;
        }

        public Criteria andPrincipleAgentRemarkBetween(String value1, String value2) {
            addCriterion("PRINCIPLE_AGENT_REMARK between", value1, value2, "principleAgentRemark");
            return (Criteria) this;
        }

        public Criteria andPrincipleAgentRemarkNotBetween(String value1, String value2) {
            addCriterion("PRINCIPLE_AGENT_REMARK not between", value1, value2, "principleAgentRemark");
            return (Criteria) this;
        }

        public Criteria andContraNameIsNull() {
            addCriterion("CONTRA_NAME is null");
            return (Criteria) this;
        }

        public Criteria andContraNameIsNotNull() {
            addCriterion("CONTRA_NAME is not null");
            return (Criteria) this;
        }

        public Criteria andContraNameEqualTo(String value) {
            addCriterion("CONTRA_NAME =", value, "contraName");
            return (Criteria) this;
        }

        public Criteria andContraNameNotEqualTo(String value) {
            addCriterion("CONTRA_NAME <>", value, "contraName");
            return (Criteria) this;
        }

        public Criteria andContraNameGreaterThan(String value) {
            addCriterion("CONTRA_NAME >", value, "contraName");
            return (Criteria) this;
        }

        public Criteria andContraNameGreaterThanOrEqualTo(String value) {
            addCriterion("CONTRA_NAME >=", value, "contraName");
            return (Criteria) this;
        }

        public Criteria andContraNameLessThan(String value) {
            addCriterion("CONTRA_NAME <", value, "contraName");
            return (Criteria) this;
        }

        public Criteria andContraNameLessThanOrEqualTo(String value) {
            addCriterion("CONTRA_NAME <=", value, "contraName");
            return (Criteria) this;
        }

        public Criteria andContraNameLike(String value) {
            addCriterion("CONTRA_NAME like", value, "contraName");
            return (Criteria) this;
        }

        public Criteria andContraNameNotLike(String value) {
            addCriterion("CONTRA_NAME not like", value, "contraName");
            return (Criteria) this;
        }

        public Criteria andContraNameIn(List<String> values) {
            addCriterion("CONTRA_NAME in", values, "contraName");
            return (Criteria) this;
        }

        public Criteria andContraNameNotIn(List<String> values) {
            addCriterion("CONTRA_NAME not in", values, "contraName");
            return (Criteria) this;
        }

        public Criteria andContraNameBetween(String value1, String value2) {
            addCriterion("CONTRA_NAME between", value1, value2, "contraName");
            return (Criteria) this;
        }

        public Criteria andContraNameNotBetween(String value1, String value2) {
            addCriterion("CONTRA_NAME not between", value1, value2, "contraName");
            return (Criteria) this;
        }

        public Criteria andContraMobileIsNull() {
            addCriterion("CONTRA_MOBILE is null");
            return (Criteria) this;
        }

        public Criteria andContraMobileIsNotNull() {
            addCriterion("CONTRA_MOBILE is not null");
            return (Criteria) this;
        }

        public Criteria andContraMobileEqualTo(String value) {
            addCriterion("CONTRA_MOBILE =", value, "contraMobile");
            return (Criteria) this;
        }

        public Criteria andContraMobileNotEqualTo(String value) {
            addCriterion("CONTRA_MOBILE <>", value, "contraMobile");
            return (Criteria) this;
        }

        public Criteria andContraMobileGreaterThan(String value) {
            addCriterion("CONTRA_MOBILE >", value, "contraMobile");
            return (Criteria) this;
        }

        public Criteria andContraMobileGreaterThanOrEqualTo(String value) {
            addCriterion("CONTRA_MOBILE >=", value, "contraMobile");
            return (Criteria) this;
        }

        public Criteria andContraMobileLessThan(String value) {
            addCriterion("CONTRA_MOBILE <", value, "contraMobile");
            return (Criteria) this;
        }

        public Criteria andContraMobileLessThanOrEqualTo(String value) {
            addCriterion("CONTRA_MOBILE <=", value, "contraMobile");
            return (Criteria) this;
        }

        public Criteria andContraMobileLike(String value) {
            addCriterion("CONTRA_MOBILE like", value, "contraMobile");
            return (Criteria) this;
        }

        public Criteria andContraMobileNotLike(String value) {
            addCriterion("CONTRA_MOBILE not like", value, "contraMobile");
            return (Criteria) this;
        }

        public Criteria andContraMobileIn(List<String> values) {
            addCriterion("CONTRA_MOBILE in", values, "contraMobile");
            return (Criteria) this;
        }

        public Criteria andContraMobileNotIn(List<String> values) {
            addCriterion("CONTRA_MOBILE not in", values, "contraMobile");
            return (Criteria) this;
        }

        public Criteria andContraMobileBetween(String value1, String value2) {
            addCriterion("CONTRA_MOBILE between", value1, value2, "contraMobile");
            return (Criteria) this;
        }

        public Criteria andContraMobileNotBetween(String value1, String value2) {
            addCriterion("CONTRA_MOBILE not between", value1, value2, "contraMobile");
            return (Criteria) this;
        }

        public Criteria andContraAddressIsNull() {
            addCriterion("CONTRA_ADDRESS is null");
            return (Criteria) this;
        }

        public Criteria andContraAddressIsNotNull() {
            addCriterion("CONTRA_ADDRESS is not null");
            return (Criteria) this;
        }

        public Criteria andContraAddressEqualTo(String value) {
            addCriterion("CONTRA_ADDRESS =", value, "contraAddress");
            return (Criteria) this;
        }

        public Criteria andContraAddressNotEqualTo(String value) {
            addCriterion("CONTRA_ADDRESS <>", value, "contraAddress");
            return (Criteria) this;
        }

        public Criteria andContraAddressGreaterThan(String value) {
            addCriterion("CONTRA_ADDRESS >", value, "contraAddress");
            return (Criteria) this;
        }

        public Criteria andContraAddressGreaterThanOrEqualTo(String value) {
            addCriterion("CONTRA_ADDRESS >=", value, "contraAddress");
            return (Criteria) this;
        }

        public Criteria andContraAddressLessThan(String value) {
            addCriterion("CONTRA_ADDRESS <", value, "contraAddress");
            return (Criteria) this;
        }

        public Criteria andContraAddressLessThanOrEqualTo(String value) {
            addCriterion("CONTRA_ADDRESS <=", value, "contraAddress");
            return (Criteria) this;
        }

        public Criteria andContraAddressLike(String value) {
            addCriterion("CONTRA_ADDRESS like", value, "contraAddress");
            return (Criteria) this;
        }

        public Criteria andContraAddressNotLike(String value) {
            addCriterion("CONTRA_ADDRESS not like", value, "contraAddress");
            return (Criteria) this;
        }

        public Criteria andContraAddressIn(List<String> values) {
            addCriterion("CONTRA_ADDRESS in", values, "contraAddress");
            return (Criteria) this;
        }

        public Criteria andContraAddressNotIn(List<String> values) {
            addCriterion("CONTRA_ADDRESS not in", values, "contraAddress");
            return (Criteria) this;
        }

        public Criteria andContraAddressBetween(String value1, String value2) {
            addCriterion("CONTRA_ADDRESS between", value1, value2, "contraAddress");
            return (Criteria) this;
        }

        public Criteria andContraAddressNotBetween(String value1, String value2) {
            addCriterion("CONTRA_ADDRESS not between", value1, value2, "contraAddress");
            return (Criteria) this;
        }

        public Criteria andContraAgentIsNull() {
            addCriterion("CONTRA_AGENT is null");
            return (Criteria) this;
        }

        public Criteria andContraAgentIsNotNull() {
            addCriterion("CONTRA_AGENT is not null");
            return (Criteria) this;
        }

        public Criteria andContraAgentEqualTo(String value) {
            addCriterion("CONTRA_AGENT =", value, "contraAgent");
            return (Criteria) this;
        }

        public Criteria andContraAgentNotEqualTo(String value) {
            addCriterion("CONTRA_AGENT <>", value, "contraAgent");
            return (Criteria) this;
        }

        public Criteria andContraAgentGreaterThan(String value) {
            addCriterion("CONTRA_AGENT >", value, "contraAgent");
            return (Criteria) this;
        }

        public Criteria andContraAgentGreaterThanOrEqualTo(String value) {
            addCriterion("CONTRA_AGENT >=", value, "contraAgent");
            return (Criteria) this;
        }

        public Criteria andContraAgentLessThan(String value) {
            addCriterion("CONTRA_AGENT <", value, "contraAgent");
            return (Criteria) this;
        }

        public Criteria andContraAgentLessThanOrEqualTo(String value) {
            addCriterion("CONTRA_AGENT <=", value, "contraAgent");
            return (Criteria) this;
        }

        public Criteria andContraAgentLike(String value) {
            addCriterion("CONTRA_AGENT like", value, "contraAgent");
            return (Criteria) this;
        }

        public Criteria andContraAgentNotLike(String value) {
            addCriterion("CONTRA_AGENT not like", value, "contraAgent");
            return (Criteria) this;
        }

        public Criteria andContraAgentIn(List<String> values) {
            addCriterion("CONTRA_AGENT in", values, "contraAgent");
            return (Criteria) this;
        }

        public Criteria andContraAgentNotIn(List<String> values) {
            addCriterion("CONTRA_AGENT not in", values, "contraAgent");
            return (Criteria) this;
        }

        public Criteria andContraAgentBetween(String value1, String value2) {
            addCriterion("CONTRA_AGENT between", value1, value2, "contraAgent");
            return (Criteria) this;
        }

        public Criteria andContraAgentNotBetween(String value1, String value2) {
            addCriterion("CONTRA_AGENT not between", value1, value2, "contraAgent");
            return (Criteria) this;
        }

        public Criteria andContraAgentMobileIsNull() {
            addCriterion("CONTRA_AGENT_MOBILE is null");
            return (Criteria) this;
        }

        public Criteria andContraAgentMobileIsNotNull() {
            addCriterion("CONTRA_AGENT_MOBILE is not null");
            return (Criteria) this;
        }

        public Criteria andContraAgentMobileEqualTo(String value) {
            addCriterion("CONTRA_AGENT_MOBILE =", value, "contraAgentMobile");
            return (Criteria) this;
        }

        public Criteria andContraAgentMobileNotEqualTo(String value) {
            addCriterion("CONTRA_AGENT_MOBILE <>", value, "contraAgentMobile");
            return (Criteria) this;
        }

        public Criteria andContraAgentMobileGreaterThan(String value) {
            addCriterion("CONTRA_AGENT_MOBILE >", value, "contraAgentMobile");
            return (Criteria) this;
        }

        public Criteria andContraAgentMobileGreaterThanOrEqualTo(String value) {
            addCriterion("CONTRA_AGENT_MOBILE >=", value, "contraAgentMobile");
            return (Criteria) this;
        }

        public Criteria andContraAgentMobileLessThan(String value) {
            addCriterion("CONTRA_AGENT_MOBILE <", value, "contraAgentMobile");
            return (Criteria) this;
        }

        public Criteria andContraAgentMobileLessThanOrEqualTo(String value) {
            addCriterion("CONTRA_AGENT_MOBILE <=", value, "contraAgentMobile");
            return (Criteria) this;
        }

        public Criteria andContraAgentMobileLike(String value) {
            addCriterion("CONTRA_AGENT_MOBILE like", value, "contraAgentMobile");
            return (Criteria) this;
        }

        public Criteria andContraAgentMobileNotLike(String value) {
            addCriterion("CONTRA_AGENT_MOBILE not like", value, "contraAgentMobile");
            return (Criteria) this;
        }

        public Criteria andContraAgentMobileIn(List<String> values) {
            addCriterion("CONTRA_AGENT_MOBILE in", values, "contraAgentMobile");
            return (Criteria) this;
        }

        public Criteria andContraAgentMobileNotIn(List<String> values) {
            addCriterion("CONTRA_AGENT_MOBILE not in", values, "contraAgentMobile");
            return (Criteria) this;
        }

        public Criteria andContraAgentMobileBetween(String value1, String value2) {
            addCriterion("CONTRA_AGENT_MOBILE between", value1, value2, "contraAgentMobile");
            return (Criteria) this;
        }

        public Criteria andContraAgentMobileNotBetween(String value1, String value2) {
            addCriterion("CONTRA_AGENT_MOBILE not between", value1, value2, "contraAgentMobile");
            return (Criteria) this;
        }

        public Criteria andContraAgentAddressIsNull() {
            addCriterion("CONTRA_AGENT_ADDRESS is null");
            return (Criteria) this;
        }

        public Criteria andContraAgentAddressIsNotNull() {
            addCriterion("CONTRA_AGENT_ADDRESS is not null");
            return (Criteria) this;
        }

        public Criteria andContraAgentAddressEqualTo(String value) {
            addCriterion("CONTRA_AGENT_ADDRESS =", value, "contraAgentAddress");
            return (Criteria) this;
        }

        public Criteria andContraAgentAddressNotEqualTo(String value) {
            addCriterion("CONTRA_AGENT_ADDRESS <>", value, "contraAgentAddress");
            return (Criteria) this;
        }

        public Criteria andContraAgentAddressGreaterThan(String value) {
            addCriterion("CONTRA_AGENT_ADDRESS >", value, "contraAgentAddress");
            return (Criteria) this;
        }

        public Criteria andContraAgentAddressGreaterThanOrEqualTo(String value) {
            addCriterion("CONTRA_AGENT_ADDRESS >=", value, "contraAgentAddress");
            return (Criteria) this;
        }

        public Criteria andContraAgentAddressLessThan(String value) {
            addCriterion("CONTRA_AGENT_ADDRESS <", value, "contraAgentAddress");
            return (Criteria) this;
        }

        public Criteria andContraAgentAddressLessThanOrEqualTo(String value) {
            addCriterion("CONTRA_AGENT_ADDRESS <=", value, "contraAgentAddress");
            return (Criteria) this;
        }

        public Criteria andContraAgentAddressLike(String value) {
            addCriterion("CONTRA_AGENT_ADDRESS like", value, "contraAgentAddress");
            return (Criteria) this;
        }

        public Criteria andContraAgentAddressNotLike(String value) {
            addCriterion("CONTRA_AGENT_ADDRESS not like", value, "contraAgentAddress");
            return (Criteria) this;
        }

        public Criteria andContraAgentAddressIn(List<String> values) {
            addCriterion("CONTRA_AGENT_ADDRESS in", values, "contraAgentAddress");
            return (Criteria) this;
        }

        public Criteria andContraAgentAddressNotIn(List<String> values) {
            addCriterion("CONTRA_AGENT_ADDRESS not in", values, "contraAgentAddress");
            return (Criteria) this;
        }

        public Criteria andContraAgentAddressBetween(String value1, String value2) {
            addCriterion("CONTRA_AGENT_ADDRESS between", value1, value2, "contraAgentAddress");
            return (Criteria) this;
        }

        public Criteria andContraAgentAddressNotBetween(String value1, String value2) {
            addCriterion("CONTRA_AGENT_ADDRESS not between", value1, value2, "contraAgentAddress");
            return (Criteria) this;
        }

        public Criteria andContraAgentRemarkIsNull() {
            addCriterion("CONTRA_AGENT_REMARK is null");
            return (Criteria) this;
        }

        public Criteria andContraAgentRemarkIsNotNull() {
            addCriterion("CONTRA_AGENT_REMARK is not null");
            return (Criteria) this;
        }

        public Criteria andContraAgentRemarkEqualTo(String value) {
            addCriterion("CONTRA_AGENT_REMARK =", value, "contraAgentRemark");
            return (Criteria) this;
        }

        public Criteria andContraAgentRemarkNotEqualTo(String value) {
            addCriterion("CONTRA_AGENT_REMARK <>", value, "contraAgentRemark");
            return (Criteria) this;
        }

        public Criteria andContraAgentRemarkGreaterThan(String value) {
            addCriterion("CONTRA_AGENT_REMARK >", value, "contraAgentRemark");
            return (Criteria) this;
        }

        public Criteria andContraAgentRemarkGreaterThanOrEqualTo(String value) {
            addCriterion("CONTRA_AGENT_REMARK >=", value, "contraAgentRemark");
            return (Criteria) this;
        }

        public Criteria andContraAgentRemarkLessThan(String value) {
            addCriterion("CONTRA_AGENT_REMARK <", value, "contraAgentRemark");
            return (Criteria) this;
        }

        public Criteria andContraAgentRemarkLessThanOrEqualTo(String value) {
            addCriterion("CONTRA_AGENT_REMARK <=", value, "contraAgentRemark");
            return (Criteria) this;
        }

        public Criteria andContraAgentRemarkLike(String value) {
            addCriterion("CONTRA_AGENT_REMARK like", value, "contraAgentRemark");
            return (Criteria) this;
        }

        public Criteria andContraAgentRemarkNotLike(String value) {
            addCriterion("CONTRA_AGENT_REMARK not like", value, "contraAgentRemark");
            return (Criteria) this;
        }

        public Criteria andContraAgentRemarkIn(List<String> values) {
            addCriterion("CONTRA_AGENT_REMARK in", values, "contraAgentRemark");
            return (Criteria) this;
        }

        public Criteria andContraAgentRemarkNotIn(List<String> values) {
            addCriterion("CONTRA_AGENT_REMARK not in", values, "contraAgentRemark");
            return (Criteria) this;
        }

        public Criteria andContraAgentRemarkBetween(String value1, String value2) {
            addCriterion("CONTRA_AGENT_REMARK between", value1, value2, "contraAgentRemark");
            return (Criteria) this;
        }

        public Criteria andContraAgentRemarkNotBetween(String value1, String value2) {
            addCriterion("CONTRA_AGENT_REMARK not between", value1, value2, "contraAgentRemark");
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

        public Criteria andThirdPartyNameIsNull() {
            addCriterion("THIRD_PARTY_NAME is null");
            return (Criteria) this;
        }

        public Criteria andThirdPartyNameIsNotNull() {
            addCriterion("THIRD_PARTY_NAME is not null");
            return (Criteria) this;
        }

        public Criteria andThirdPartyNameEqualTo(String value) {
            addCriterion("THIRD_PARTY_NAME =", value, "thirdPartyName");
            return (Criteria) this;
        }

        public Criteria andThirdPartyNameNotEqualTo(String value) {
            addCriterion("THIRD_PARTY_NAME <>", value, "thirdPartyName");
            return (Criteria) this;
        }

        public Criteria andThirdPartyNameGreaterThan(String value) {
            addCriterion("THIRD_PARTY_NAME >", value, "thirdPartyName");
            return (Criteria) this;
        }

        public Criteria andThirdPartyNameGreaterThanOrEqualTo(String value) {
            addCriterion("THIRD_PARTY_NAME >=", value, "thirdPartyName");
            return (Criteria) this;
        }

        public Criteria andThirdPartyNameLessThan(String value) {
            addCriterion("THIRD_PARTY_NAME <", value, "thirdPartyName");
            return (Criteria) this;
        }

        public Criteria andThirdPartyNameLessThanOrEqualTo(String value) {
            addCriterion("THIRD_PARTY_NAME <=", value, "thirdPartyName");
            return (Criteria) this;
        }

        public Criteria andThirdPartyNameLike(String value) {
            addCriterion("THIRD_PARTY_NAME like", value, "thirdPartyName");
            return (Criteria) this;
        }

        public Criteria andThirdPartyNameNotLike(String value) {
            addCriterion("THIRD_PARTY_NAME not like", value, "thirdPartyName");
            return (Criteria) this;
        }

        public Criteria andThirdPartyNameIn(List<String> values) {
            addCriterion("THIRD_PARTY_NAME in", values, "thirdPartyName");
            return (Criteria) this;
        }

        public Criteria andThirdPartyNameNotIn(List<String> values) {
            addCriterion("THIRD_PARTY_NAME not in", values, "thirdPartyName");
            return (Criteria) this;
        }

        public Criteria andThirdPartyNameBetween(String value1, String value2) {
            addCriterion("THIRD_PARTY_NAME between", value1, value2, "thirdPartyName");
            return (Criteria) this;
        }

        public Criteria andThirdPartyNameNotBetween(String value1, String value2) {
            addCriterion("THIRD_PARTY_NAME not between", value1, value2, "thirdPartyName");
            return (Criteria) this;
        }

        public Criteria andThirdPartyMobileIsNull() {
            addCriterion("THIRD_PARTY_MOBILE is null");
            return (Criteria) this;
        }

        public Criteria andThirdPartyMobileIsNotNull() {
            addCriterion("THIRD_PARTY_MOBILE is not null");
            return (Criteria) this;
        }

        public Criteria andThirdPartyMobileEqualTo(String value) {
            addCriterion("THIRD_PARTY_MOBILE =", value, "thirdPartyMobile");
            return (Criteria) this;
        }

        public Criteria andThirdPartyMobileNotEqualTo(String value) {
            addCriterion("THIRD_PARTY_MOBILE <>", value, "thirdPartyMobile");
            return (Criteria) this;
        }

        public Criteria andThirdPartyMobileGreaterThan(String value) {
            addCriterion("THIRD_PARTY_MOBILE >", value, "thirdPartyMobile");
            return (Criteria) this;
        }

        public Criteria andThirdPartyMobileGreaterThanOrEqualTo(String value) {
            addCriterion("THIRD_PARTY_MOBILE >=", value, "thirdPartyMobile");
            return (Criteria) this;
        }

        public Criteria andThirdPartyMobileLessThan(String value) {
            addCriterion("THIRD_PARTY_MOBILE <", value, "thirdPartyMobile");
            return (Criteria) this;
        }

        public Criteria andThirdPartyMobileLessThanOrEqualTo(String value) {
            addCriterion("THIRD_PARTY_MOBILE <=", value, "thirdPartyMobile");
            return (Criteria) this;
        }

        public Criteria andThirdPartyMobileLike(String value) {
            addCriterion("THIRD_PARTY_MOBILE like", value, "thirdPartyMobile");
            return (Criteria) this;
        }

        public Criteria andThirdPartyMobileNotLike(String value) {
            addCriterion("THIRD_PARTY_MOBILE not like", value, "thirdPartyMobile");
            return (Criteria) this;
        }

        public Criteria andThirdPartyMobileIn(List<String> values) {
            addCriterion("THIRD_PARTY_MOBILE in", values, "thirdPartyMobile");
            return (Criteria) this;
        }

        public Criteria andThirdPartyMobileNotIn(List<String> values) {
            addCriterion("THIRD_PARTY_MOBILE not in", values, "thirdPartyMobile");
            return (Criteria) this;
        }

        public Criteria andThirdPartyMobileBetween(String value1, String value2) {
            addCriterion("THIRD_PARTY_MOBILE between", value1, value2, "thirdPartyMobile");
            return (Criteria) this;
        }

        public Criteria andThirdPartyMobileNotBetween(String value1, String value2) {
            addCriterion("THIRD_PARTY_MOBILE not between", value1, value2, "thirdPartyMobile");
            return (Criteria) this;
        }

        public Criteria andContractPeriodIsNull() {
            addCriterion("CONTRACT_PERIOD is null");
            return (Criteria) this;
        }

        public Criteria andContractPeriodIsNotNull() {
            addCriterion("CONTRACT_PERIOD is not null");
            return (Criteria) this;
        }

        public Criteria andContractPeriodEqualTo(BigDecimal value) {
            addCriterion("CONTRACT_PERIOD =", value, "contractPeriod");
            return (Criteria) this;
        }

        public Criteria andContractPeriodNotEqualTo(BigDecimal value) {
            addCriterion("CONTRACT_PERIOD <>", value, "contractPeriod");
            return (Criteria) this;
        }

        public Criteria andContractPeriodGreaterThan(BigDecimal value) {
            addCriterion("CONTRACT_PERIOD >", value, "contractPeriod");
            return (Criteria) this;
        }

        public Criteria andContractPeriodGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("CONTRACT_PERIOD >=", value, "contractPeriod");
            return (Criteria) this;
        }

        public Criteria andContractPeriodLessThan(BigDecimal value) {
            addCriterion("CONTRACT_PERIOD <", value, "contractPeriod");
            return (Criteria) this;
        }

        public Criteria andContractPeriodLessThanOrEqualTo(BigDecimal value) {
            addCriterion("CONTRACT_PERIOD <=", value, "contractPeriod");
            return (Criteria) this;
        }

        public Criteria andContractPeriodIn(List<BigDecimal> values) {
            addCriterion("CONTRACT_PERIOD in", values, "contractPeriod");
            return (Criteria) this;
        }

        public Criteria andContractPeriodNotIn(List<BigDecimal> values) {
            addCriterion("CONTRACT_PERIOD not in", values, "contractPeriod");
            return (Criteria) this;
        }

        public Criteria andContractPeriodBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("CONTRACT_PERIOD between", value1, value2, "contractPeriod");
            return (Criteria) this;
        }

        public Criteria andContractPeriodNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("CONTRACT_PERIOD not between", value1, value2, "contractPeriod");
            return (Criteria) this;
        }

        public Criteria andContractStartDateIsNull() {
            addCriterion("CONTRACT_START_DATE is null");
            return (Criteria) this;
        }

        public Criteria andContractStartDateIsNotNull() {
            addCriterion("CONTRACT_START_DATE is not null");
            return (Criteria) this;
        }

        public Criteria andContractStartDateEqualTo(String value) {
            addCriterion("CONTRACT_START_DATE =", value, "contractStartDate");
            return (Criteria) this;
        }

        public Criteria andContractStartDateNotEqualTo(String value) {
            addCriterion("CONTRACT_START_DATE <>", value, "contractStartDate");
            return (Criteria) this;
        }

        public Criteria andContractStartDateGreaterThan(String value) {
            addCriterion("CONTRACT_START_DATE >", value, "contractStartDate");
            return (Criteria) this;
        }

        public Criteria andContractStartDateGreaterThanOrEqualTo(String value) {
            addCriterion("CONTRACT_START_DATE >=", value, "contractStartDate");
            return (Criteria) this;
        }

        public Criteria andContractStartDateLessThan(String value) {
            addCriterion("CONTRACT_START_DATE <", value, "contractStartDate");
            return (Criteria) this;
        }

        public Criteria andContractStartDateLessThanOrEqualTo(String value) {
            addCriterion("CONTRACT_START_DATE <=", value, "contractStartDate");
            return (Criteria) this;
        }

        public Criteria andContractStartDateLike(String value) {
            addCriterion("CONTRACT_START_DATE like", value, "contractStartDate");
            return (Criteria) this;
        }

        public Criteria andContractStartDateNotLike(String value) {
            addCriterion("CONTRACT_START_DATE not like", value, "contractStartDate");
            return (Criteria) this;
        }

        public Criteria andContractStartDateIn(List<String> values) {
            addCriterion("CONTRACT_START_DATE in", values, "contractStartDate");
            return (Criteria) this;
        }

        public Criteria andContractStartDateNotIn(List<String> values) {
            addCriterion("CONTRACT_START_DATE not in", values, "contractStartDate");
            return (Criteria) this;
        }

        public Criteria andContractStartDateBetween(String value1, String value2) {
            addCriterion("CONTRACT_START_DATE between", value1, value2, "contractStartDate");
            return (Criteria) this;
        }

        public Criteria andContractStartDateNotBetween(String value1, String value2) {
            addCriterion("CONTRACT_START_DATE not between", value1, value2, "contractStartDate");
            return (Criteria) this;
        }

        public Criteria andContractEndDateIsNull() {
            addCriterion("CONTRACT_END_DATE is null");
            return (Criteria) this;
        }

        public Criteria andContractEndDateIsNotNull() {
            addCriterion("CONTRACT_END_DATE is not null");
            return (Criteria) this;
        }

        public Criteria andContractEndDateEqualTo(String value) {
            addCriterion("CONTRACT_END_DATE =", value, "contractEndDate");
            return (Criteria) this;
        }

        public Criteria andContractEndDateNotEqualTo(String value) {
            addCriterion("CONTRACT_END_DATE <>", value, "contractEndDate");
            return (Criteria) this;
        }

        public Criteria andContractEndDateGreaterThan(String value) {
            addCriterion("CONTRACT_END_DATE >", value, "contractEndDate");
            return (Criteria) this;
        }

        public Criteria andContractEndDateGreaterThanOrEqualTo(String value) {
            addCriterion("CONTRACT_END_DATE >=", value, "contractEndDate");
            return (Criteria) this;
        }

        public Criteria andContractEndDateLessThan(String value) {
            addCriterion("CONTRACT_END_DATE <", value, "contractEndDate");
            return (Criteria) this;
        }

        public Criteria andContractEndDateLessThanOrEqualTo(String value) {
            addCriterion("CONTRACT_END_DATE <=", value, "contractEndDate");
            return (Criteria) this;
        }

        public Criteria andContractEndDateLike(String value) {
            addCriterion("CONTRACT_END_DATE like", value, "contractEndDate");
            return (Criteria) this;
        }

        public Criteria andContractEndDateNotLike(String value) {
            addCriterion("CONTRACT_END_DATE not like", value, "contractEndDate");
            return (Criteria) this;
        }

        public Criteria andContractEndDateIn(List<String> values) {
            addCriterion("CONTRACT_END_DATE in", values, "contractEndDate");
            return (Criteria) this;
        }

        public Criteria andContractEndDateNotIn(List<String> values) {
            addCriterion("CONTRACT_END_DATE not in", values, "contractEndDate");
            return (Criteria) this;
        }

        public Criteria andContractEndDateBetween(String value1, String value2) {
            addCriterion("CONTRACT_END_DATE between", value1, value2, "contractEndDate");
            return (Criteria) this;
        }

        public Criteria andContractEndDateNotBetween(String value1, String value2) {
            addCriterion("CONTRACT_END_DATE not between", value1, value2, "contractEndDate");
            return (Criteria) this;
        }

        public Criteria andContractCloseDateIsNull() {
            addCriterion("CONTRACT_CLOSE_DATE is null");
            return (Criteria) this;
        }

        public Criteria andContractCloseDateIsNotNull() {
            addCriterion("CONTRACT_CLOSE_DATE is not null");
            return (Criteria) this;
        }

        public Criteria andContractCloseDateEqualTo(String value) {
            addCriterion("CONTRACT_CLOSE_DATE =", value, "contractCloseDate");
            return (Criteria) this;
        }

        public Criteria andContractCloseDateNotEqualTo(String value) {
            addCriterion("CONTRACT_CLOSE_DATE <>", value, "contractCloseDate");
            return (Criteria) this;
        }

        public Criteria andContractCloseDateGreaterThan(String value) {
            addCriterion("CONTRACT_CLOSE_DATE >", value, "contractCloseDate");
            return (Criteria) this;
        }

        public Criteria andContractCloseDateGreaterThanOrEqualTo(String value) {
            addCriterion("CONTRACT_CLOSE_DATE >=", value, "contractCloseDate");
            return (Criteria) this;
        }

        public Criteria andContractCloseDateLessThan(String value) {
            addCriterion("CONTRACT_CLOSE_DATE <", value, "contractCloseDate");
            return (Criteria) this;
        }

        public Criteria andContractCloseDateLessThanOrEqualTo(String value) {
            addCriterion("CONTRACT_CLOSE_DATE <=", value, "contractCloseDate");
            return (Criteria) this;
        }

        public Criteria andContractCloseDateLike(String value) {
            addCriterion("CONTRACT_CLOSE_DATE like", value, "contractCloseDate");
            return (Criteria) this;
        }

        public Criteria andContractCloseDateNotLike(String value) {
            addCriterion("CONTRACT_CLOSE_DATE not like", value, "contractCloseDate");
            return (Criteria) this;
        }

        public Criteria andContractCloseDateIn(List<String> values) {
            addCriterion("CONTRACT_CLOSE_DATE in", values, "contractCloseDate");
            return (Criteria) this;
        }

        public Criteria andContractCloseDateNotIn(List<String> values) {
            addCriterion("CONTRACT_CLOSE_DATE not in", values, "contractCloseDate");
            return (Criteria) this;
        }

        public Criteria andContractCloseDateBetween(String value1, String value2) {
            addCriterion("CONTRACT_CLOSE_DATE between", value1, value2, "contractCloseDate");
            return (Criteria) this;
        }

        public Criteria andContractCloseDateNotBetween(String value1, String value2) {
            addCriterion("CONTRACT_CLOSE_DATE not between", value1, value2, "contractCloseDate");
            return (Criteria) this;
        }

        public Criteria andContractStatusIsNull() {
            addCriterion("CONTRACT_STATUS is null");
            return (Criteria) this;
        }

        public Criteria andContractStatusIsNotNull() {
            addCriterion("CONTRACT_STATUS is not null");
            return (Criteria) this;
        }

        public Criteria andContractStatusEqualTo(String value) {
            addCriterion("CONTRACT_STATUS =", value, "contractStatus");
            return (Criteria) this;
        }

        public Criteria andContractStatusNotEqualTo(String value) {
            addCriterion("CONTRACT_STATUS <>", value, "contractStatus");
            return (Criteria) this;
        }

        public Criteria andContractStatusGreaterThan(String value) {
            addCriterion("CONTRACT_STATUS >", value, "contractStatus");
            return (Criteria) this;
        }

        public Criteria andContractStatusGreaterThanOrEqualTo(String value) {
            addCriterion("CONTRACT_STATUS >=", value, "contractStatus");
            return (Criteria) this;
        }

        public Criteria andContractStatusLessThan(String value) {
            addCriterion("CONTRACT_STATUS <", value, "contractStatus");
            return (Criteria) this;
        }

        public Criteria andContractStatusLessThanOrEqualTo(String value) {
            addCriterion("CONTRACT_STATUS <=", value, "contractStatus");
            return (Criteria) this;
        }

        public Criteria andContractStatusLike(String value) {
            addCriterion("CONTRACT_STATUS like", value, "contractStatus");
            return (Criteria) this;
        }

        public Criteria andContractStatusNotLike(String value) {
            addCriterion("CONTRACT_STATUS not like", value, "contractStatus");
            return (Criteria) this;
        }

        public Criteria andContractStatusIn(List<String> values) {
            addCriterion("CONTRACT_STATUS in", values, "contractStatus");
            return (Criteria) this;
        }

        public Criteria andContractStatusNotIn(List<String> values) {
            addCriterion("CONTRACT_STATUS not in", values, "contractStatus");
            return (Criteria) this;
        }

        public Criteria andContractStatusBetween(String value1, String value2) {
            addCriterion("CONTRACT_STATUS between", value1, value2, "contractStatus");
            return (Criteria) this;
        }

        public Criteria andContractStatusNotBetween(String value1, String value2) {
            addCriterion("CONTRACT_STATUS not between", value1, value2, "contractStatus");
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

        public Criteria andSignerNameIsNull() {
            addCriterion("SIGNER_NAME is null");
            return (Criteria) this;
        }

        public Criteria andSignerNameIsNotNull() {
            addCriterion("SIGNER_NAME is not null");
            return (Criteria) this;
        }

        public Criteria andSignerNameEqualTo(String value) {
            addCriterion("SIGNER_NAME =", value, "signerName");
            return (Criteria) this;
        }

        public Criteria andSignerNameNotEqualTo(String value) {
            addCriterion("SIGNER_NAME <>", value, "signerName");
            return (Criteria) this;
        }

        public Criteria andSignerNameGreaterThan(String value) {
            addCriterion("SIGNER_NAME >", value, "signerName");
            return (Criteria) this;
        }

        public Criteria andSignerNameGreaterThanOrEqualTo(String value) {
            addCriterion("SIGNER_NAME >=", value, "signerName");
            return (Criteria) this;
        }

        public Criteria andSignerNameLessThan(String value) {
            addCriterion("SIGNER_NAME <", value, "signerName");
            return (Criteria) this;
        }

        public Criteria andSignerNameLessThanOrEqualTo(String value) {
            addCriterion("SIGNER_NAME <=", value, "signerName");
            return (Criteria) this;
        }

        public Criteria andSignerNameLike(String value) {
            addCriterion("SIGNER_NAME like", value, "signerName");
            return (Criteria) this;
        }

        public Criteria andSignerNameNotLike(String value) {
            addCriterion("SIGNER_NAME not like", value, "signerName");
            return (Criteria) this;
        }

        public Criteria andSignerNameIn(List<String> values) {
            addCriterion("SIGNER_NAME in", values, "signerName");
            return (Criteria) this;
        }

        public Criteria andSignerNameNotIn(List<String> values) {
            addCriterion("SIGNER_NAME not in", values, "signerName");
            return (Criteria) this;
        }

        public Criteria andSignerNameBetween(String value1, String value2) {
            addCriterion("SIGNER_NAME between", value1, value2, "signerName");
            return (Criteria) this;
        }

        public Criteria andSignerNameNotBetween(String value1, String value2) {
            addCriterion("SIGNER_NAME not between", value1, value2, "signerName");
            return (Criteria) this;
        }

        public Criteria andSignerMobileIsNull() {
            addCriterion("SIGNER_MOBILE is null");
            return (Criteria) this;
        }

        public Criteria andSignerMobileIsNotNull() {
            addCriterion("SIGNER_MOBILE is not null");
            return (Criteria) this;
        }

        public Criteria andSignerMobileEqualTo(String value) {
            addCriterion("SIGNER_MOBILE =", value, "signerMobile");
            return (Criteria) this;
        }

        public Criteria andSignerMobileNotEqualTo(String value) {
            addCriterion("SIGNER_MOBILE <>", value, "signerMobile");
            return (Criteria) this;
        }

        public Criteria andSignerMobileGreaterThan(String value) {
            addCriterion("SIGNER_MOBILE >", value, "signerMobile");
            return (Criteria) this;
        }

        public Criteria andSignerMobileGreaterThanOrEqualTo(String value) {
            addCriterion("SIGNER_MOBILE >=", value, "signerMobile");
            return (Criteria) this;
        }

        public Criteria andSignerMobileLessThan(String value) {
            addCriterion("SIGNER_MOBILE <", value, "signerMobile");
            return (Criteria) this;
        }

        public Criteria andSignerMobileLessThanOrEqualTo(String value) {
            addCriterion("SIGNER_MOBILE <=", value, "signerMobile");
            return (Criteria) this;
        }

        public Criteria andSignerMobileLike(String value) {
            addCriterion("SIGNER_MOBILE like", value, "signerMobile");
            return (Criteria) this;
        }

        public Criteria andSignerMobileNotLike(String value) {
            addCriterion("SIGNER_MOBILE not like", value, "signerMobile");
            return (Criteria) this;
        }

        public Criteria andSignerMobileIn(List<String> values) {
            addCriterion("SIGNER_MOBILE in", values, "signerMobile");
            return (Criteria) this;
        }

        public Criteria andSignerMobileNotIn(List<String> values) {
            addCriterion("SIGNER_MOBILE not in", values, "signerMobile");
            return (Criteria) this;
        }

        public Criteria andSignerMobileBetween(String value1, String value2) {
            addCriterion("SIGNER_MOBILE between", value1, value2, "signerMobile");
            return (Criteria) this;
        }

        public Criteria andSignerMobileNotBetween(String value1, String value2) {
            addCriterion("SIGNER_MOBILE not between", value1, value2, "signerMobile");
            return (Criteria) this;
        }

        public Criteria andSignerIdTypeIsNull() {
            addCriterion("SIGNER_ID_TYPE is null");
            return (Criteria) this;
        }

        public Criteria andSignerIdTypeIsNotNull() {
            addCriterion("SIGNER_ID_TYPE is not null");
            return (Criteria) this;
        }

        public Criteria andSignerIdTypeEqualTo(String value) {
            addCriterion("SIGNER_ID_TYPE =", value, "signerIdType");
            return (Criteria) this;
        }

        public Criteria andSignerIdTypeNotEqualTo(String value) {
            addCriterion("SIGNER_ID_TYPE <>", value, "signerIdType");
            return (Criteria) this;
        }

        public Criteria andSignerIdTypeGreaterThan(String value) {
            addCriterion("SIGNER_ID_TYPE >", value, "signerIdType");
            return (Criteria) this;
        }

        public Criteria andSignerIdTypeGreaterThanOrEqualTo(String value) {
            addCriterion("SIGNER_ID_TYPE >=", value, "signerIdType");
            return (Criteria) this;
        }

        public Criteria andSignerIdTypeLessThan(String value) {
            addCriterion("SIGNER_ID_TYPE <", value, "signerIdType");
            return (Criteria) this;
        }

        public Criteria andSignerIdTypeLessThanOrEqualTo(String value) {
            addCriterion("SIGNER_ID_TYPE <=", value, "signerIdType");
            return (Criteria) this;
        }

        public Criteria andSignerIdTypeLike(String value) {
            addCriterion("SIGNER_ID_TYPE like", value, "signerIdType");
            return (Criteria) this;
        }

        public Criteria andSignerIdTypeNotLike(String value) {
            addCriterion("SIGNER_ID_TYPE not like", value, "signerIdType");
            return (Criteria) this;
        }

        public Criteria andSignerIdTypeIn(List<String> values) {
            addCriterion("SIGNER_ID_TYPE in", values, "signerIdType");
            return (Criteria) this;
        }

        public Criteria andSignerIdTypeNotIn(List<String> values) {
            addCriterion("SIGNER_ID_TYPE not in", values, "signerIdType");
            return (Criteria) this;
        }

        public Criteria andSignerIdTypeBetween(String value1, String value2) {
            addCriterion("SIGNER_ID_TYPE between", value1, value2, "signerIdType");
            return (Criteria) this;
        }

        public Criteria andSignerIdTypeNotBetween(String value1, String value2) {
            addCriterion("SIGNER_ID_TYPE not between", value1, value2, "signerIdType");
            return (Criteria) this;
        }

        public Criteria andSignerIdNoIsNull() {
            addCriterion("SIGNER_ID_NO is null");
            return (Criteria) this;
        }

        public Criteria andSignerIdNoIsNotNull() {
            addCriterion("SIGNER_ID_NO is not null");
            return (Criteria) this;
        }

        public Criteria andSignerIdNoEqualTo(String value) {
            addCriterion("SIGNER_ID_NO =", value, "signerIdNo");
            return (Criteria) this;
        }

        public Criteria andSignerIdNoNotEqualTo(String value) {
            addCriterion("SIGNER_ID_NO <>", value, "signerIdNo");
            return (Criteria) this;
        }

        public Criteria andSignerIdNoGreaterThan(String value) {
            addCriterion("SIGNER_ID_NO >", value, "signerIdNo");
            return (Criteria) this;
        }

        public Criteria andSignerIdNoGreaterThanOrEqualTo(String value) {
            addCriterion("SIGNER_ID_NO >=", value, "signerIdNo");
            return (Criteria) this;
        }

        public Criteria andSignerIdNoLessThan(String value) {
            addCriterion("SIGNER_ID_NO <", value, "signerIdNo");
            return (Criteria) this;
        }

        public Criteria andSignerIdNoLessThanOrEqualTo(String value) {
            addCriterion("SIGNER_ID_NO <=", value, "signerIdNo");
            return (Criteria) this;
        }

        public Criteria andSignerIdNoLike(String value) {
            addCriterion("SIGNER_ID_NO like", value, "signerIdNo");
            return (Criteria) this;
        }

        public Criteria andSignerIdNoNotLike(String value) {
            addCriterion("SIGNER_ID_NO not like", value, "signerIdNo");
            return (Criteria) this;
        }

        public Criteria andSignerIdNoIn(List<String> values) {
            addCriterion("SIGNER_ID_NO in", values, "signerIdNo");
            return (Criteria) this;
        }

        public Criteria andSignerIdNoNotIn(List<String> values) {
            addCriterion("SIGNER_ID_NO not in", values, "signerIdNo");
            return (Criteria) this;
        }

        public Criteria andSignerIdNoBetween(String value1, String value2) {
            addCriterion("SIGNER_ID_NO between", value1, value2, "signerIdNo");
            return (Criteria) this;
        }

        public Criteria andSignerIdNoNotBetween(String value1, String value2) {
            addCriterion("SIGNER_ID_NO not between", value1, value2, "signerIdNo");
            return (Criteria) this;
        }

        public Criteria andSignerSexIsNull() {
            addCriterion("SIGNER_SEX is null");
            return (Criteria) this;
        }

        public Criteria andSignerSexIsNotNull() {
            addCriterion("SIGNER_SEX is not null");
            return (Criteria) this;
        }

        public Criteria andSignerSexEqualTo(String value) {
            addCriterion("SIGNER_SEX =", value, "signerSex");
            return (Criteria) this;
        }

        public Criteria andSignerSexNotEqualTo(String value) {
            addCriterion("SIGNER_SEX <>", value, "signerSex");
            return (Criteria) this;
        }

        public Criteria andSignerSexGreaterThan(String value) {
            addCriterion("SIGNER_SEX >", value, "signerSex");
            return (Criteria) this;
        }

        public Criteria andSignerSexGreaterThanOrEqualTo(String value) {
            addCriterion("SIGNER_SEX >=", value, "signerSex");
            return (Criteria) this;
        }

        public Criteria andSignerSexLessThan(String value) {
            addCriterion("SIGNER_SEX <", value, "signerSex");
            return (Criteria) this;
        }

        public Criteria andSignerSexLessThanOrEqualTo(String value) {
            addCriterion("SIGNER_SEX <=", value, "signerSex");
            return (Criteria) this;
        }

        public Criteria andSignerSexLike(String value) {
            addCriterion("SIGNER_SEX like", value, "signerSex");
            return (Criteria) this;
        }

        public Criteria andSignerSexNotLike(String value) {
            addCriterion("SIGNER_SEX not like", value, "signerSex");
            return (Criteria) this;
        }

        public Criteria andSignerSexIn(List<String> values) {
            addCriterion("SIGNER_SEX in", values, "signerSex");
            return (Criteria) this;
        }

        public Criteria andSignerSexNotIn(List<String> values) {
            addCriterion("SIGNER_SEX not in", values, "signerSex");
            return (Criteria) this;
        }

        public Criteria andSignerSexBetween(String value1, String value2) {
            addCriterion("SIGNER_SEX between", value1, value2, "signerSex");
            return (Criteria) this;
        }

        public Criteria andSignerSexNotBetween(String value1, String value2) {
            addCriterion("SIGNER_SEX not between", value1, value2, "signerSex");
            return (Criteria) this;
        }

        public Criteria andSignDateIsNull() {
            addCriterion("SIGN_DATE is null");
            return (Criteria) this;
        }

        public Criteria andSignDateIsNotNull() {
            addCriterion("SIGN_DATE is not null");
            return (Criteria) this;
        }

        public Criteria andSignDateEqualTo(String value) {
            addCriterion("SIGN_DATE =", value, "signDate");
            return (Criteria) this;
        }

        public Criteria andSignDateNotEqualTo(String value) {
            addCriterion("SIGN_DATE <>", value, "signDate");
            return (Criteria) this;
        }

        public Criteria andSignDateGreaterThan(String value) {
            addCriterion("SIGN_DATE >", value, "signDate");
            return (Criteria) this;
        }

        public Criteria andSignDateGreaterThanOrEqualTo(String value) {
            addCriterion("SIGN_DATE >=", value, "signDate");
            return (Criteria) this;
        }

        public Criteria andSignDateLessThan(String value) {
            addCriterion("SIGN_DATE <", value, "signDate");
            return (Criteria) this;
        }

        public Criteria andSignDateLessThanOrEqualTo(String value) {
            addCriterion("SIGN_DATE <=", value, "signDate");
            return (Criteria) this;
        }

        public Criteria andSignDateLike(String value) {
            addCriterion("SIGN_DATE like", value, "signDate");
            return (Criteria) this;
        }

        public Criteria andSignDateNotLike(String value) {
            addCriterion("SIGN_DATE not like", value, "signDate");
            return (Criteria) this;
        }

        public Criteria andSignDateIn(List<String> values) {
            addCriterion("SIGN_DATE in", values, "signDate");
            return (Criteria) this;
        }

        public Criteria andSignDateNotIn(List<String> values) {
            addCriterion("SIGN_DATE not in", values, "signDate");
            return (Criteria) this;
        }

        public Criteria andSignDateBetween(String value1, String value2) {
            addCriterion("SIGN_DATE between", value1, value2, "signDate");
            return (Criteria) this;
        }

        public Criteria andSignDateNotBetween(String value1, String value2) {
            addCriterion("SIGN_DATE not between", value1, value2, "signDate");
            return (Criteria) this;
        }

        public Criteria andSignTimeIsNull() {
            addCriterion("SIGN_TIME is null");
            return (Criteria) this;
        }

        public Criteria andSignTimeIsNotNull() {
            addCriterion("SIGN_TIME is not null");
            return (Criteria) this;
        }

        public Criteria andSignTimeEqualTo(String value) {
            addCriterion("SIGN_TIME =", value, "signTime");
            return (Criteria) this;
        }

        public Criteria andSignTimeNotEqualTo(String value) {
            addCriterion("SIGN_TIME <>", value, "signTime");
            return (Criteria) this;
        }

        public Criteria andSignTimeGreaterThan(String value) {
            addCriterion("SIGN_TIME >", value, "signTime");
            return (Criteria) this;
        }

        public Criteria andSignTimeGreaterThanOrEqualTo(String value) {
            addCriterion("SIGN_TIME >=", value, "signTime");
            return (Criteria) this;
        }

        public Criteria andSignTimeLessThan(String value) {
            addCriterion("SIGN_TIME <", value, "signTime");
            return (Criteria) this;
        }

        public Criteria andSignTimeLessThanOrEqualTo(String value) {
            addCriterion("SIGN_TIME <=", value, "signTime");
            return (Criteria) this;
        }

        public Criteria andSignTimeLike(String value) {
            addCriterion("SIGN_TIME like", value, "signTime");
            return (Criteria) this;
        }

        public Criteria andSignTimeNotLike(String value) {
            addCriterion("SIGN_TIME not like", value, "signTime");
            return (Criteria) this;
        }

        public Criteria andSignTimeIn(List<String> values) {
            addCriterion("SIGN_TIME in", values, "signTime");
            return (Criteria) this;
        }

        public Criteria andSignTimeNotIn(List<String> values) {
            addCriterion("SIGN_TIME not in", values, "signTime");
            return (Criteria) this;
        }

        public Criteria andSignTimeBetween(String value1, String value2) {
            addCriterion("SIGN_TIME between", value1, value2, "signTime");
            return (Criteria) this;
        }

        public Criteria andSignTimeNotBetween(String value1, String value2) {
            addCriterion("SIGN_TIME not between", value1, value2, "signTime");
            return (Criteria) this;
        }

        public Criteria andBookingDateIsNull() {
            addCriterion("BOOKING_DATE is null");
            return (Criteria) this;
        }

        public Criteria andBookingDateIsNotNull() {
            addCriterion("BOOKING_DATE is not null");
            return (Criteria) this;
        }

        public Criteria andBookingDateEqualTo(String value) {
            addCriterion("BOOKING_DATE =", value, "bookingDate");
            return (Criteria) this;
        }

        public Criteria andBookingDateNotEqualTo(String value) {
            addCriterion("BOOKING_DATE <>", value, "bookingDate");
            return (Criteria) this;
        }

        public Criteria andBookingDateGreaterThan(String value) {
            addCriterion("BOOKING_DATE >", value, "bookingDate");
            return (Criteria) this;
        }

        public Criteria andBookingDateGreaterThanOrEqualTo(String value) {
            addCriterion("BOOKING_DATE >=", value, "bookingDate");
            return (Criteria) this;
        }

        public Criteria andBookingDateLessThan(String value) {
            addCriterion("BOOKING_DATE <", value, "bookingDate");
            return (Criteria) this;
        }

        public Criteria andBookingDateLessThanOrEqualTo(String value) {
            addCriterion("BOOKING_DATE <=", value, "bookingDate");
            return (Criteria) this;
        }

        public Criteria andBookingDateLike(String value) {
            addCriterion("BOOKING_DATE like", value, "bookingDate");
            return (Criteria) this;
        }

        public Criteria andBookingDateNotLike(String value) {
            addCriterion("BOOKING_DATE not like", value, "bookingDate");
            return (Criteria) this;
        }

        public Criteria andBookingDateIn(List<String> values) {
            addCriterion("BOOKING_DATE in", values, "bookingDate");
            return (Criteria) this;
        }

        public Criteria andBookingDateNotIn(List<String> values) {
            addCriterion("BOOKING_DATE not in", values, "bookingDate");
            return (Criteria) this;
        }

        public Criteria andBookingDateBetween(String value1, String value2) {
            addCriterion("BOOKING_DATE between", value1, value2, "bookingDate");
            return (Criteria) this;
        }

        public Criteria andBookingDateNotBetween(String value1, String value2) {
            addCriterion("BOOKING_DATE not between", value1, value2, "bookingDate");
            return (Criteria) this;
        }

        public Criteria andBookingTimeIsNull() {
            addCriterion("BOOKING_TIME is null");
            return (Criteria) this;
        }

        public Criteria andBookingTimeIsNotNull() {
            addCriterion("BOOKING_TIME is not null");
            return (Criteria) this;
        }

        public Criteria andBookingTimeEqualTo(String value) {
            addCriterion("BOOKING_TIME =", value, "bookingTime");
            return (Criteria) this;
        }

        public Criteria andBookingTimeNotEqualTo(String value) {
            addCriterion("BOOKING_TIME <>", value, "bookingTime");
            return (Criteria) this;
        }

        public Criteria andBookingTimeGreaterThan(String value) {
            addCriterion("BOOKING_TIME >", value, "bookingTime");
            return (Criteria) this;
        }

        public Criteria andBookingTimeGreaterThanOrEqualTo(String value) {
            addCriterion("BOOKING_TIME >=", value, "bookingTime");
            return (Criteria) this;
        }

        public Criteria andBookingTimeLessThan(String value) {
            addCriterion("BOOKING_TIME <", value, "bookingTime");
            return (Criteria) this;
        }

        public Criteria andBookingTimeLessThanOrEqualTo(String value) {
            addCriterion("BOOKING_TIME <=", value, "bookingTime");
            return (Criteria) this;
        }

        public Criteria andBookingTimeLike(String value) {
            addCriterion("BOOKING_TIME like", value, "bookingTime");
            return (Criteria) this;
        }

        public Criteria andBookingTimeNotLike(String value) {
            addCriterion("BOOKING_TIME not like", value, "bookingTime");
            return (Criteria) this;
        }

        public Criteria andBookingTimeIn(List<String> values) {
            addCriterion("BOOKING_TIME in", values, "bookingTime");
            return (Criteria) this;
        }

        public Criteria andBookingTimeNotIn(List<String> values) {
            addCriterion("BOOKING_TIME not in", values, "bookingTime");
            return (Criteria) this;
        }

        public Criteria andBookingTimeBetween(String value1, String value2) {
            addCriterion("BOOKING_TIME between", value1, value2, "bookingTime");
            return (Criteria) this;
        }

        public Criteria andBookingTimeNotBetween(String value1, String value2) {
            addCriterion("BOOKING_TIME not between", value1, value2, "bookingTime");
            return (Criteria) this;
        }

        public Criteria andBookerNameIsNull() {
            addCriterion("BOOKER_NAME is null");
            return (Criteria) this;
        }

        public Criteria andBookerNameIsNotNull() {
            addCriterion("BOOKER_NAME is not null");
            return (Criteria) this;
        }

        public Criteria andBookerNameEqualTo(String value) {
            addCriterion("BOOKER_NAME =", value, "bookerName");
            return (Criteria) this;
        }

        public Criteria andBookerNameNotEqualTo(String value) {
            addCriterion("BOOKER_NAME <>", value, "bookerName");
            return (Criteria) this;
        }

        public Criteria andBookerNameGreaterThan(String value) {
            addCriterion("BOOKER_NAME >", value, "bookerName");
            return (Criteria) this;
        }

        public Criteria andBookerNameGreaterThanOrEqualTo(String value) {
            addCriterion("BOOKER_NAME >=", value, "bookerName");
            return (Criteria) this;
        }

        public Criteria andBookerNameLessThan(String value) {
            addCriterion("BOOKER_NAME <", value, "bookerName");
            return (Criteria) this;
        }

        public Criteria andBookerNameLessThanOrEqualTo(String value) {
            addCriterion("BOOKER_NAME <=", value, "bookerName");
            return (Criteria) this;
        }

        public Criteria andBookerNameLike(String value) {
            addCriterion("BOOKER_NAME like", value, "bookerName");
            return (Criteria) this;
        }

        public Criteria andBookerNameNotLike(String value) {
            addCriterion("BOOKER_NAME not like", value, "bookerName");
            return (Criteria) this;
        }

        public Criteria andBookerNameIn(List<String> values) {
            addCriterion("BOOKER_NAME in", values, "bookerName");
            return (Criteria) this;
        }

        public Criteria andBookerNameNotIn(List<String> values) {
            addCriterion("BOOKER_NAME not in", values, "bookerName");
            return (Criteria) this;
        }

        public Criteria andBookerNameBetween(String value1, String value2) {
            addCriterion("BOOKER_NAME between", value1, value2, "bookerName");
            return (Criteria) this;
        }

        public Criteria andBookerNameNotBetween(String value1, String value2) {
            addCriterion("BOOKER_NAME not between", value1, value2, "bookerName");
            return (Criteria) this;
        }

        public Criteria andBookerMobileIsNull() {
            addCriterion("BOOKER_MOBILE is null");
            return (Criteria) this;
        }

        public Criteria andBookerMobileIsNotNull() {
            addCriterion("BOOKER_MOBILE is not null");
            return (Criteria) this;
        }

        public Criteria andBookerMobileEqualTo(String value) {
            addCriterion("BOOKER_MOBILE =", value, "bookerMobile");
            return (Criteria) this;
        }

        public Criteria andBookerMobileNotEqualTo(String value) {
            addCriterion("BOOKER_MOBILE <>", value, "bookerMobile");
            return (Criteria) this;
        }

        public Criteria andBookerMobileGreaterThan(String value) {
            addCriterion("BOOKER_MOBILE >", value, "bookerMobile");
            return (Criteria) this;
        }

        public Criteria andBookerMobileGreaterThanOrEqualTo(String value) {
            addCriterion("BOOKER_MOBILE >=", value, "bookerMobile");
            return (Criteria) this;
        }

        public Criteria andBookerMobileLessThan(String value) {
            addCriterion("BOOKER_MOBILE <", value, "bookerMobile");
            return (Criteria) this;
        }

        public Criteria andBookerMobileLessThanOrEqualTo(String value) {
            addCriterion("BOOKER_MOBILE <=", value, "bookerMobile");
            return (Criteria) this;
        }

        public Criteria andBookerMobileLike(String value) {
            addCriterion("BOOKER_MOBILE like", value, "bookerMobile");
            return (Criteria) this;
        }

        public Criteria andBookerMobileNotLike(String value) {
            addCriterion("BOOKER_MOBILE not like", value, "bookerMobile");
            return (Criteria) this;
        }

        public Criteria andBookerMobileIn(List<String> values) {
            addCriterion("BOOKER_MOBILE in", values, "bookerMobile");
            return (Criteria) this;
        }

        public Criteria andBookerMobileNotIn(List<String> values) {
            addCriterion("BOOKER_MOBILE not in", values, "bookerMobile");
            return (Criteria) this;
        }

        public Criteria andBookerMobileBetween(String value1, String value2) {
            addCriterion("BOOKER_MOBILE between", value1, value2, "bookerMobile");
            return (Criteria) this;
        }

        public Criteria andBookerMobileNotBetween(String value1, String value2) {
            addCriterion("BOOKER_MOBILE not between", value1, value2, "bookerMobile");
            return (Criteria) this;
        }

        public Criteria andBookingDaysIsNull() {
            addCriterion("BOOKING_DAYS is null");
            return (Criteria) this;
        }

        public Criteria andBookingDaysIsNotNull() {
            addCriterion("BOOKING_DAYS is not null");
            return (Criteria) this;
        }

        public Criteria andBookingDaysEqualTo(BigDecimal value) {
            addCriterion("BOOKING_DAYS =", value, "bookingDays");
            return (Criteria) this;
        }

        public Criteria andBookingDaysNotEqualTo(BigDecimal value) {
            addCriterion("BOOKING_DAYS <>", value, "bookingDays");
            return (Criteria) this;
        }

        public Criteria andBookingDaysGreaterThan(BigDecimal value) {
            addCriterion("BOOKING_DAYS >", value, "bookingDays");
            return (Criteria) this;
        }

        public Criteria andBookingDaysGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("BOOKING_DAYS >=", value, "bookingDays");
            return (Criteria) this;
        }

        public Criteria andBookingDaysLessThan(BigDecimal value) {
            addCriterion("BOOKING_DAYS <", value, "bookingDays");
            return (Criteria) this;
        }

        public Criteria andBookingDaysLessThanOrEqualTo(BigDecimal value) {
            addCriterion("BOOKING_DAYS <=", value, "bookingDays");
            return (Criteria) this;
        }

        public Criteria andBookingDaysIn(List<BigDecimal> values) {
            addCriterion("BOOKING_DAYS in", values, "bookingDays");
            return (Criteria) this;
        }

        public Criteria andBookingDaysNotIn(List<BigDecimal> values) {
            addCriterion("BOOKING_DAYS not in", values, "bookingDays");
            return (Criteria) this;
        }

        public Criteria andBookingDaysBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("BOOKING_DAYS between", value1, value2, "bookingDays");
            return (Criteria) this;
        }

        public Criteria andBookingDaysNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("BOOKING_DAYS not between", value1, value2, "bookingDays");
            return (Criteria) this;
        }

        public Criteria andLastSignDateIsNull() {
            addCriterion("LAST_SIGN_DATE is null");
            return (Criteria) this;
        }

        public Criteria andLastSignDateIsNotNull() {
            addCriterion("LAST_SIGN_DATE is not null");
            return (Criteria) this;
        }

        public Criteria andLastSignDateEqualTo(String value) {
            addCriterion("LAST_SIGN_DATE =", value, "lastSignDate");
            return (Criteria) this;
        }

        public Criteria andLastSignDateNotEqualTo(String value) {
            addCriterion("LAST_SIGN_DATE <>", value, "lastSignDate");
            return (Criteria) this;
        }

        public Criteria andLastSignDateGreaterThan(String value) {
            addCriterion("LAST_SIGN_DATE >", value, "lastSignDate");
            return (Criteria) this;
        }

        public Criteria andLastSignDateGreaterThanOrEqualTo(String value) {
            addCriterion("LAST_SIGN_DATE >=", value, "lastSignDate");
            return (Criteria) this;
        }

        public Criteria andLastSignDateLessThan(String value) {
            addCriterion("LAST_SIGN_DATE <", value, "lastSignDate");
            return (Criteria) this;
        }

        public Criteria andLastSignDateLessThanOrEqualTo(String value) {
            addCriterion("LAST_SIGN_DATE <=", value, "lastSignDate");
            return (Criteria) this;
        }

        public Criteria andLastSignDateLike(String value) {
            addCriterion("LAST_SIGN_DATE like", value, "lastSignDate");
            return (Criteria) this;
        }

        public Criteria andLastSignDateNotLike(String value) {
            addCriterion("LAST_SIGN_DATE not like", value, "lastSignDate");
            return (Criteria) this;
        }

        public Criteria andLastSignDateIn(List<String> values) {
            addCriterion("LAST_SIGN_DATE in", values, "lastSignDate");
            return (Criteria) this;
        }

        public Criteria andLastSignDateNotIn(List<String> values) {
            addCriterion("LAST_SIGN_DATE not in", values, "lastSignDate");
            return (Criteria) this;
        }

        public Criteria andLastSignDateBetween(String value1, String value2) {
            addCriterion("LAST_SIGN_DATE between", value1, value2, "lastSignDate");
            return (Criteria) this;
        }

        public Criteria andLastSignDateNotBetween(String value1, String value2) {
            addCriterion("LAST_SIGN_DATE not between", value1, value2, "lastSignDate");
            return (Criteria) this;
        }

        public Criteria andBookingRemarkIsNull() {
            addCriterion("BOOKING_REMARK is null");
            return (Criteria) this;
        }

        public Criteria andBookingRemarkIsNotNull() {
            addCriterion("BOOKING_REMARK is not null");
            return (Criteria) this;
        }

        public Criteria andBookingRemarkEqualTo(String value) {
            addCriterion("BOOKING_REMARK =", value, "bookingRemark");
            return (Criteria) this;
        }

        public Criteria andBookingRemarkNotEqualTo(String value) {
            addCriterion("BOOKING_REMARK <>", value, "bookingRemark");
            return (Criteria) this;
        }

        public Criteria andBookingRemarkGreaterThan(String value) {
            addCriterion("BOOKING_REMARK >", value, "bookingRemark");
            return (Criteria) this;
        }

        public Criteria andBookingRemarkGreaterThanOrEqualTo(String value) {
            addCriterion("BOOKING_REMARK >=", value, "bookingRemark");
            return (Criteria) this;
        }

        public Criteria andBookingRemarkLessThan(String value) {
            addCriterion("BOOKING_REMARK <", value, "bookingRemark");
            return (Criteria) this;
        }

        public Criteria andBookingRemarkLessThanOrEqualTo(String value) {
            addCriterion("BOOKING_REMARK <=", value, "bookingRemark");
            return (Criteria) this;
        }

        public Criteria andBookingRemarkLike(String value) {
            addCriterion("BOOKING_REMARK like", value, "bookingRemark");
            return (Criteria) this;
        }

        public Criteria andBookingRemarkNotLike(String value) {
            addCriterion("BOOKING_REMARK not like", value, "bookingRemark");
            return (Criteria) this;
        }

        public Criteria andBookingRemarkIn(List<String> values) {
            addCriterion("BOOKING_REMARK in", values, "bookingRemark");
            return (Criteria) this;
        }

        public Criteria andBookingRemarkNotIn(List<String> values) {
            addCriterion("BOOKING_REMARK not in", values, "bookingRemark");
            return (Criteria) this;
        }

        public Criteria andBookingRemarkBetween(String value1, String value2) {
            addCriterion("BOOKING_REMARK between", value1, value2, "bookingRemark");
            return (Criteria) this;
        }

        public Criteria andBookingRemarkNotBetween(String value1, String value2) {
            addCriterion("BOOKING_REMARK not between", value1, value2, "bookingRemark");
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

        public Criteria andPayAmtIsNull() {
            addCriterion("PAY_AMT is null");
            return (Criteria) this;
        }

        public Criteria andPayAmtIsNotNull() {
            addCriterion("PAY_AMT is not null");
            return (Criteria) this;
        }

        public Criteria andPayAmtEqualTo(BigDecimal value) {
            addCriterion("PAY_AMT =", value, "payAmt");
            return (Criteria) this;
        }

        public Criteria andPayAmtNotEqualTo(BigDecimal value) {
            addCriterion("PAY_AMT <>", value, "payAmt");
            return (Criteria) this;
        }

        public Criteria andPayAmtGreaterThan(BigDecimal value) {
            addCriterion("PAY_AMT >", value, "payAmt");
            return (Criteria) this;
        }

        public Criteria andPayAmtGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("PAY_AMT >=", value, "payAmt");
            return (Criteria) this;
        }

        public Criteria andPayAmtLessThan(BigDecimal value) {
            addCriterion("PAY_AMT <", value, "payAmt");
            return (Criteria) this;
        }

        public Criteria andPayAmtLessThanOrEqualTo(BigDecimal value) {
            addCriterion("PAY_AMT <=", value, "payAmt");
            return (Criteria) this;
        }

        public Criteria andPayAmtIn(List<BigDecimal> values) {
            addCriterion("PAY_AMT in", values, "payAmt");
            return (Criteria) this;
        }

        public Criteria andPayAmtNotIn(List<BigDecimal> values) {
            addCriterion("PAY_AMT not in", values, "payAmt");
            return (Criteria) this;
        }

        public Criteria andPayAmtBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("PAY_AMT between", value1, value2, "payAmt");
            return (Criteria) this;
        }

        public Criteria andPayAmtNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("PAY_AMT not between", value1, value2, "payAmt");
            return (Criteria) this;
        }

        public Criteria andDepositAmtIsNull() {
            addCriterion("DEPOSIT_AMT is null");
            return (Criteria) this;
        }

        public Criteria andDepositAmtIsNotNull() {
            addCriterion("DEPOSIT_AMT is not null");
            return (Criteria) this;
        }

        public Criteria andDepositAmtEqualTo(BigDecimal value) {
            addCriterion("DEPOSIT_AMT =", value, "depositAmt");
            return (Criteria) this;
        }

        public Criteria andDepositAmtNotEqualTo(BigDecimal value) {
            addCriterion("DEPOSIT_AMT <>", value, "depositAmt");
            return (Criteria) this;
        }

        public Criteria andDepositAmtGreaterThan(BigDecimal value) {
            addCriterion("DEPOSIT_AMT >", value, "depositAmt");
            return (Criteria) this;
        }

        public Criteria andDepositAmtGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("DEPOSIT_AMT >=", value, "depositAmt");
            return (Criteria) this;
        }

        public Criteria andDepositAmtLessThan(BigDecimal value) {
            addCriterion("DEPOSIT_AMT <", value, "depositAmt");
            return (Criteria) this;
        }

        public Criteria andDepositAmtLessThanOrEqualTo(BigDecimal value) {
            addCriterion("DEPOSIT_AMT <=", value, "depositAmt");
            return (Criteria) this;
        }

        public Criteria andDepositAmtIn(List<BigDecimal> values) {
            addCriterion("DEPOSIT_AMT in", values, "depositAmt");
            return (Criteria) this;
        }

        public Criteria andDepositAmtNotIn(List<BigDecimal> values) {
            addCriterion("DEPOSIT_AMT not in", values, "depositAmt");
            return (Criteria) this;
        }

        public Criteria andDepositAmtBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("DEPOSIT_AMT between", value1, value2, "depositAmt");
            return (Criteria) this;
        }

        public Criteria andDepositAmtNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("DEPOSIT_AMT not between", value1, value2, "depositAmt");
            return (Criteria) this;
        }

        public Criteria andPropertyAmtIsNull() {
            addCriterion("PROPERTY_AMT is null");
            return (Criteria) this;
        }

        public Criteria andPropertyAmtIsNotNull() {
            addCriterion("PROPERTY_AMT is not null");
            return (Criteria) this;
        }

        public Criteria andPropertyAmtEqualTo(BigDecimal value) {
            addCriterion("PROPERTY_AMT =", value, "propertyAmt");
            return (Criteria) this;
        }

        public Criteria andPropertyAmtNotEqualTo(BigDecimal value) {
            addCriterion("PROPERTY_AMT <>", value, "propertyAmt");
            return (Criteria) this;
        }

        public Criteria andPropertyAmtGreaterThan(BigDecimal value) {
            addCriterion("PROPERTY_AMT >", value, "propertyAmt");
            return (Criteria) this;
        }

        public Criteria andPropertyAmtGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("PROPERTY_AMT >=", value, "propertyAmt");
            return (Criteria) this;
        }

        public Criteria andPropertyAmtLessThan(BigDecimal value) {
            addCriterion("PROPERTY_AMT <", value, "propertyAmt");
            return (Criteria) this;
        }

        public Criteria andPropertyAmtLessThanOrEqualTo(BigDecimal value) {
            addCriterion("PROPERTY_AMT <=", value, "propertyAmt");
            return (Criteria) this;
        }

        public Criteria andPropertyAmtIn(List<BigDecimal> values) {
            addCriterion("PROPERTY_AMT in", values, "propertyAmt");
            return (Criteria) this;
        }

        public Criteria andPropertyAmtNotIn(List<BigDecimal> values) {
            addCriterion("PROPERTY_AMT not in", values, "propertyAmt");
            return (Criteria) this;
        }

        public Criteria andPropertyAmtBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("PROPERTY_AMT between", value1, value2, "propertyAmt");
            return (Criteria) this;
        }

        public Criteria andPropertyAmtNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("PROPERTY_AMT not between", value1, value2, "propertyAmt");
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

        public Criteria andPropertyChangeCalculateIsNull() {
            addCriterion("PROPERTY_CHANGE_CALCULATE is null");
            return (Criteria) this;
        }

        public Criteria andPropertyChangeCalculateIsNotNull() {
            addCriterion("PROPERTY_CHANGE_CALCULATE is not null");
            return (Criteria) this;
        }

        public Criteria andPropertyChangeCalculateEqualTo(String value) {
            addCriterion("PROPERTY_CHANGE_CALCULATE =", value, "propertyChangeCalculate");
            return (Criteria) this;
        }

        public Criteria andPropertyChangeCalculateNotEqualTo(String value) {
            addCriterion("PROPERTY_CHANGE_CALCULATE <>", value, "propertyChangeCalculate");
            return (Criteria) this;
        }

        public Criteria andPropertyChangeCalculateGreaterThan(String value) {
            addCriterion("PROPERTY_CHANGE_CALCULATE >", value, "propertyChangeCalculate");
            return (Criteria) this;
        }

        public Criteria andPropertyChangeCalculateGreaterThanOrEqualTo(String value) {
            addCriterion("PROPERTY_CHANGE_CALCULATE >=", value, "propertyChangeCalculate");
            return (Criteria) this;
        }

        public Criteria andPropertyChangeCalculateLessThan(String value) {
            addCriterion("PROPERTY_CHANGE_CALCULATE <", value, "propertyChangeCalculate");
            return (Criteria) this;
        }

        public Criteria andPropertyChangeCalculateLessThanOrEqualTo(String value) {
            addCriterion("PROPERTY_CHANGE_CALCULATE <=", value, "propertyChangeCalculate");
            return (Criteria) this;
        }

        public Criteria andPropertyChangeCalculateLike(String value) {
            addCriterion("PROPERTY_CHANGE_CALCULATE like", value, "propertyChangeCalculate");
            return (Criteria) this;
        }

        public Criteria andPropertyChangeCalculateNotLike(String value) {
            addCriterion("PROPERTY_CHANGE_CALCULATE not like", value, "propertyChangeCalculate");
            return (Criteria) this;
        }

        public Criteria andPropertyChangeCalculateIn(List<String> values) {
            addCriterion("PROPERTY_CHANGE_CALCULATE in", values, "propertyChangeCalculate");
            return (Criteria) this;
        }

        public Criteria andPropertyChangeCalculateNotIn(List<String> values) {
            addCriterion("PROPERTY_CHANGE_CALCULATE not in", values, "propertyChangeCalculate");
            return (Criteria) this;
        }

        public Criteria andPropertyChangeCalculateBetween(String value1, String value2) {
            addCriterion("PROPERTY_CHANGE_CALCULATE between", value1, value2, "propertyChangeCalculate");
            return (Criteria) this;
        }

        public Criteria andPropertyChangeCalculateNotBetween(String value1, String value2) {
            addCriterion("PROPERTY_CHANGE_CALCULATE not between", value1, value2, "propertyChangeCalculate");
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