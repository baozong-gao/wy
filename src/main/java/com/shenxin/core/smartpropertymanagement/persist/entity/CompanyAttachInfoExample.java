package com.shenxin.core.smartpropertymanagement.persist.entity;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class CompanyAttachInfoExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public CompanyAttachInfoExample() {
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

        public Criteria andAttachTypeIsNull() {
            addCriterion("ATTACH_TYPE is null");
            return (Criteria) this;
        }

        public Criteria andAttachTypeIsNotNull() {
            addCriterion("ATTACH_TYPE is not null");
            return (Criteria) this;
        }

        public Criteria andAttachTypeEqualTo(String value) {
            addCriterion("ATTACH_TYPE =", value, "attachType");
            return (Criteria) this;
        }

        public Criteria andAttachTypeNotEqualTo(String value) {
            addCriterion("ATTACH_TYPE <>", value, "attachType");
            return (Criteria) this;
        }

        public Criteria andAttachTypeGreaterThan(String value) {
            addCriterion("ATTACH_TYPE >", value, "attachType");
            return (Criteria) this;
        }

        public Criteria andAttachTypeGreaterThanOrEqualTo(String value) {
            addCriterion("ATTACH_TYPE >=", value, "attachType");
            return (Criteria) this;
        }

        public Criteria andAttachTypeLessThan(String value) {
            addCriterion("ATTACH_TYPE <", value, "attachType");
            return (Criteria) this;
        }

        public Criteria andAttachTypeLessThanOrEqualTo(String value) {
            addCriterion("ATTACH_TYPE <=", value, "attachType");
            return (Criteria) this;
        }

        public Criteria andAttachTypeLike(String value) {
            addCriterion("ATTACH_TYPE like", value, "attachType");
            return (Criteria) this;
        }

        public Criteria andAttachTypeNotLike(String value) {
            addCriterion("ATTACH_TYPE not like", value, "attachType");
            return (Criteria) this;
        }

        public Criteria andAttachTypeIn(List<String> values) {
            addCriterion("ATTACH_TYPE in", values, "attachType");
            return (Criteria) this;
        }

        public Criteria andAttachTypeNotIn(List<String> values) {
            addCriterion("ATTACH_TYPE not in", values, "attachType");
            return (Criteria) this;
        }

        public Criteria andAttachTypeBetween(String value1, String value2) {
            addCriterion("ATTACH_TYPE between", value1, value2, "attachType");
            return (Criteria) this;
        }

        public Criteria andAttachTypeNotBetween(String value1, String value2) {
            addCriterion("ATTACH_TYPE not between", value1, value2, "attachType");
            return (Criteria) this;
        }

        public Criteria andMediaTypeIsNull() {
            addCriterion("MEDIA_TYPE is null");
            return (Criteria) this;
        }

        public Criteria andMediaTypeIsNotNull() {
            addCriterion("MEDIA_TYPE is not null");
            return (Criteria) this;
        }

        public Criteria andMediaTypeEqualTo(String value) {
            addCriterion("MEDIA_TYPE =", value, "mediaType");
            return (Criteria) this;
        }

        public Criteria andMediaTypeNotEqualTo(String value) {
            addCriterion("MEDIA_TYPE <>", value, "mediaType");
            return (Criteria) this;
        }

        public Criteria andMediaTypeGreaterThan(String value) {
            addCriterion("MEDIA_TYPE >", value, "mediaType");
            return (Criteria) this;
        }

        public Criteria andMediaTypeGreaterThanOrEqualTo(String value) {
            addCriterion("MEDIA_TYPE >=", value, "mediaType");
            return (Criteria) this;
        }

        public Criteria andMediaTypeLessThan(String value) {
            addCriterion("MEDIA_TYPE <", value, "mediaType");
            return (Criteria) this;
        }

        public Criteria andMediaTypeLessThanOrEqualTo(String value) {
            addCriterion("MEDIA_TYPE <=", value, "mediaType");
            return (Criteria) this;
        }

        public Criteria andMediaTypeLike(String value) {
            addCriterion("MEDIA_TYPE like", value, "mediaType");
            return (Criteria) this;
        }

        public Criteria andMediaTypeNotLike(String value) {
            addCriterion("MEDIA_TYPE not like", value, "mediaType");
            return (Criteria) this;
        }

        public Criteria andMediaTypeIn(List<String> values) {
            addCriterion("MEDIA_TYPE in", values, "mediaType");
            return (Criteria) this;
        }

        public Criteria andMediaTypeNotIn(List<String> values) {
            addCriterion("MEDIA_TYPE not in", values, "mediaType");
            return (Criteria) this;
        }

        public Criteria andMediaTypeBetween(String value1, String value2) {
            addCriterion("MEDIA_TYPE between", value1, value2, "mediaType");
            return (Criteria) this;
        }

        public Criteria andMediaTypeNotBetween(String value1, String value2) {
            addCriterion("MEDIA_TYPE not between", value1, value2, "mediaType");
            return (Criteria) this;
        }

        public Criteria andStoreTypeIsNull() {
            addCriterion("STORE_TYPE is null");
            return (Criteria) this;
        }

        public Criteria andStoreTypeIsNotNull() {
            addCriterion("STORE_TYPE is not null");
            return (Criteria) this;
        }

        public Criteria andStoreTypeEqualTo(String value) {
            addCriterion("STORE_TYPE =", value, "storeType");
            return (Criteria) this;
        }

        public Criteria andStoreTypeNotEqualTo(String value) {
            addCriterion("STORE_TYPE <>", value, "storeType");
            return (Criteria) this;
        }

        public Criteria andStoreTypeGreaterThan(String value) {
            addCriterion("STORE_TYPE >", value, "storeType");
            return (Criteria) this;
        }

        public Criteria andStoreTypeGreaterThanOrEqualTo(String value) {
            addCriterion("STORE_TYPE >=", value, "storeType");
            return (Criteria) this;
        }

        public Criteria andStoreTypeLessThan(String value) {
            addCriterion("STORE_TYPE <", value, "storeType");
            return (Criteria) this;
        }

        public Criteria andStoreTypeLessThanOrEqualTo(String value) {
            addCriterion("STORE_TYPE <=", value, "storeType");
            return (Criteria) this;
        }

        public Criteria andStoreTypeLike(String value) {
            addCriterion("STORE_TYPE like", value, "storeType");
            return (Criteria) this;
        }

        public Criteria andStoreTypeNotLike(String value) {
            addCriterion("STORE_TYPE not like", value, "storeType");
            return (Criteria) this;
        }

        public Criteria andStoreTypeIn(List<String> values) {
            addCriterion("STORE_TYPE in", values, "storeType");
            return (Criteria) this;
        }

        public Criteria andStoreTypeNotIn(List<String> values) {
            addCriterion("STORE_TYPE not in", values, "storeType");
            return (Criteria) this;
        }

        public Criteria andStoreTypeBetween(String value1, String value2) {
            addCriterion("STORE_TYPE between", value1, value2, "storeType");
            return (Criteria) this;
        }

        public Criteria andStoreTypeNotBetween(String value1, String value2) {
            addCriterion("STORE_TYPE not between", value1, value2, "storeType");
            return (Criteria) this;
        }

        public Criteria andMediaLocationIsNull() {
            addCriterion("MEDIA_LOCATION is null");
            return (Criteria) this;
        }

        public Criteria andMediaLocationIsNotNull() {
            addCriterion("MEDIA_LOCATION is not null");
            return (Criteria) this;
        }

        public Criteria andMediaLocationEqualTo(String value) {
            addCriterion("MEDIA_LOCATION =", value, "mediaLocation");
            return (Criteria) this;
        }

        public Criteria andMediaLocationNotEqualTo(String value) {
            addCriterion("MEDIA_LOCATION <>", value, "mediaLocation");
            return (Criteria) this;
        }

        public Criteria andMediaLocationGreaterThan(String value) {
            addCriterion("MEDIA_LOCATION >", value, "mediaLocation");
            return (Criteria) this;
        }

        public Criteria andMediaLocationGreaterThanOrEqualTo(String value) {
            addCriterion("MEDIA_LOCATION >=", value, "mediaLocation");
            return (Criteria) this;
        }

        public Criteria andMediaLocationLessThan(String value) {
            addCriterion("MEDIA_LOCATION <", value, "mediaLocation");
            return (Criteria) this;
        }

        public Criteria andMediaLocationLessThanOrEqualTo(String value) {
            addCriterion("MEDIA_LOCATION <=", value, "mediaLocation");
            return (Criteria) this;
        }

        public Criteria andMediaLocationLike(String value) {
            addCriterion("MEDIA_LOCATION like", value, "mediaLocation");
            return (Criteria) this;
        }

        public Criteria andMediaLocationNotLike(String value) {
            addCriterion("MEDIA_LOCATION not like", value, "mediaLocation");
            return (Criteria) this;
        }

        public Criteria andMediaLocationIn(List<String> values) {
            addCriterion("MEDIA_LOCATION in", values, "mediaLocation");
            return (Criteria) this;
        }

        public Criteria andMediaLocationNotIn(List<String> values) {
            addCriterion("MEDIA_LOCATION not in", values, "mediaLocation");
            return (Criteria) this;
        }

        public Criteria andMediaLocationBetween(String value1, String value2) {
            addCriterion("MEDIA_LOCATION between", value1, value2, "mediaLocation");
            return (Criteria) this;
        }

        public Criteria andMediaLocationNotBetween(String value1, String value2) {
            addCriterion("MEDIA_LOCATION not between", value1, value2, "mediaLocation");
            return (Criteria) this;
        }

        public Criteria andMediaDescIsNull() {
            addCriterion("MEDIA_DESC is null");
            return (Criteria) this;
        }

        public Criteria andMediaDescIsNotNull() {
            addCriterion("MEDIA_DESC is not null");
            return (Criteria) this;
        }

        public Criteria andMediaDescEqualTo(String value) {
            addCriterion("MEDIA_DESC =", value, "mediaDesc");
            return (Criteria) this;
        }

        public Criteria andMediaDescNotEqualTo(String value) {
            addCriterion("MEDIA_DESC <>", value, "mediaDesc");
            return (Criteria) this;
        }

        public Criteria andMediaDescGreaterThan(String value) {
            addCriterion("MEDIA_DESC >", value, "mediaDesc");
            return (Criteria) this;
        }

        public Criteria andMediaDescGreaterThanOrEqualTo(String value) {
            addCriterion("MEDIA_DESC >=", value, "mediaDesc");
            return (Criteria) this;
        }

        public Criteria andMediaDescLessThan(String value) {
            addCriterion("MEDIA_DESC <", value, "mediaDesc");
            return (Criteria) this;
        }

        public Criteria andMediaDescLessThanOrEqualTo(String value) {
            addCriterion("MEDIA_DESC <=", value, "mediaDesc");
            return (Criteria) this;
        }

        public Criteria andMediaDescLike(String value) {
            addCriterion("MEDIA_DESC like", value, "mediaDesc");
            return (Criteria) this;
        }

        public Criteria andMediaDescNotLike(String value) {
            addCriterion("MEDIA_DESC not like", value, "mediaDesc");
            return (Criteria) this;
        }

        public Criteria andMediaDescIn(List<String> values) {
            addCriterion("MEDIA_DESC in", values, "mediaDesc");
            return (Criteria) this;
        }

        public Criteria andMediaDescNotIn(List<String> values) {
            addCriterion("MEDIA_DESC not in", values, "mediaDesc");
            return (Criteria) this;
        }

        public Criteria andMediaDescBetween(String value1, String value2) {
            addCriterion("MEDIA_DESC between", value1, value2, "mediaDesc");
            return (Criteria) this;
        }

        public Criteria andMediaDescNotBetween(String value1, String value2) {
            addCriterion("MEDIA_DESC not between", value1, value2, "mediaDesc");
            return (Criteria) this;
        }

        public Criteria andMediaStatusIsNull() {
            addCriterion("MEDIA_STATUS is null");
            return (Criteria) this;
        }

        public Criteria andMediaStatusIsNotNull() {
            addCriterion("MEDIA_STATUS is not null");
            return (Criteria) this;
        }

        public Criteria andMediaStatusEqualTo(String value) {
            addCriterion("MEDIA_STATUS =", value, "mediaStatus");
            return (Criteria) this;
        }

        public Criteria andMediaStatusNotEqualTo(String value) {
            addCriterion("MEDIA_STATUS <>", value, "mediaStatus");
            return (Criteria) this;
        }

        public Criteria andMediaStatusGreaterThan(String value) {
            addCriterion("MEDIA_STATUS >", value, "mediaStatus");
            return (Criteria) this;
        }

        public Criteria andMediaStatusGreaterThanOrEqualTo(String value) {
            addCriterion("MEDIA_STATUS >=", value, "mediaStatus");
            return (Criteria) this;
        }

        public Criteria andMediaStatusLessThan(String value) {
            addCriterion("MEDIA_STATUS <", value, "mediaStatus");
            return (Criteria) this;
        }

        public Criteria andMediaStatusLessThanOrEqualTo(String value) {
            addCriterion("MEDIA_STATUS <=", value, "mediaStatus");
            return (Criteria) this;
        }

        public Criteria andMediaStatusLike(String value) {
            addCriterion("MEDIA_STATUS like", value, "mediaStatus");
            return (Criteria) this;
        }

        public Criteria andMediaStatusNotLike(String value) {
            addCriterion("MEDIA_STATUS not like", value, "mediaStatus");
            return (Criteria) this;
        }

        public Criteria andMediaStatusIn(List<String> values) {
            addCriterion("MEDIA_STATUS in", values, "mediaStatus");
            return (Criteria) this;
        }

        public Criteria andMediaStatusNotIn(List<String> values) {
            addCriterion("MEDIA_STATUS not in", values, "mediaStatus");
            return (Criteria) this;
        }

        public Criteria andMediaStatusBetween(String value1, String value2) {
            addCriterion("MEDIA_STATUS between", value1, value2, "mediaStatus");
            return (Criteria) this;
        }

        public Criteria andMediaStatusNotBetween(String value1, String value2) {
            addCriterion("MEDIA_STATUS not between", value1, value2, "mediaStatus");
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