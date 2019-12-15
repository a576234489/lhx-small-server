package com.lhx.mall.mbg.model;

import java.util.ArrayList;
import java.util.List;

public class SpPermissionApiExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public SpPermissionApiExample() {
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
            addCriterion("id is null");
            return (Criteria) this;
        }

        public Criteria andIdIsNotNull() {
            addCriterion("id is not null");
            return (Criteria) this;
        }

        public Criteria andIdEqualTo(Integer value) {
            addCriterion("id =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(Integer value) {
            addCriterion("id <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(Integer value) {
            addCriterion("id >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("id >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(Integer value) {
            addCriterion("id <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(Integer value) {
            addCriterion("id <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<Integer> values) {
            addCriterion("id in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<Integer> values) {
            addCriterion("id not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(Integer value1, Integer value2) {
            addCriterion("id between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(Integer value1, Integer value2) {
            addCriterion("id not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andPsIdIsNull() {
            addCriterion("ps_id is null");
            return (Criteria) this;
        }

        public Criteria andPsIdIsNotNull() {
            addCriterion("ps_id is not null");
            return (Criteria) this;
        }

        public Criteria andPsIdEqualTo(Integer value) {
            addCriterion("ps_id =", value, "psId");
            return (Criteria) this;
        }

        public Criteria andPsIdNotEqualTo(Integer value) {
            addCriterion("ps_id <>", value, "psId");
            return (Criteria) this;
        }

        public Criteria andPsIdGreaterThan(Integer value) {
            addCriterion("ps_id >", value, "psId");
            return (Criteria) this;
        }

        public Criteria andPsIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("ps_id >=", value, "psId");
            return (Criteria) this;
        }

        public Criteria andPsIdLessThan(Integer value) {
            addCriterion("ps_id <", value, "psId");
            return (Criteria) this;
        }

        public Criteria andPsIdLessThanOrEqualTo(Integer value) {
            addCriterion("ps_id <=", value, "psId");
            return (Criteria) this;
        }

        public Criteria andPsIdIn(List<Integer> values) {
            addCriterion("ps_id in", values, "psId");
            return (Criteria) this;
        }

        public Criteria andPsIdNotIn(List<Integer> values) {
            addCriterion("ps_id not in", values, "psId");
            return (Criteria) this;
        }

        public Criteria andPsIdBetween(Integer value1, Integer value2) {
            addCriterion("ps_id between", value1, value2, "psId");
            return (Criteria) this;
        }

        public Criteria andPsIdNotBetween(Integer value1, Integer value2) {
            addCriterion("ps_id not between", value1, value2, "psId");
            return (Criteria) this;
        }

        public Criteria andPsApiServiceIsNull() {
            addCriterion("ps_api_service is null");
            return (Criteria) this;
        }

        public Criteria andPsApiServiceIsNotNull() {
            addCriterion("ps_api_service is not null");
            return (Criteria) this;
        }

        public Criteria andPsApiServiceEqualTo(String value) {
            addCriterion("ps_api_service =", value, "psApiService");
            return (Criteria) this;
        }

        public Criteria andPsApiServiceNotEqualTo(String value) {
            addCriterion("ps_api_service <>", value, "psApiService");
            return (Criteria) this;
        }

        public Criteria andPsApiServiceGreaterThan(String value) {
            addCriterion("ps_api_service >", value, "psApiService");
            return (Criteria) this;
        }

        public Criteria andPsApiServiceGreaterThanOrEqualTo(String value) {
            addCriterion("ps_api_service >=", value, "psApiService");
            return (Criteria) this;
        }

        public Criteria andPsApiServiceLessThan(String value) {
            addCriterion("ps_api_service <", value, "psApiService");
            return (Criteria) this;
        }

        public Criteria andPsApiServiceLessThanOrEqualTo(String value) {
            addCriterion("ps_api_service <=", value, "psApiService");
            return (Criteria) this;
        }

        public Criteria andPsApiServiceLike(String value) {
            addCriterion("ps_api_service like", value, "psApiService");
            return (Criteria) this;
        }

        public Criteria andPsApiServiceNotLike(String value) {
            addCriterion("ps_api_service not like", value, "psApiService");
            return (Criteria) this;
        }

        public Criteria andPsApiServiceIn(List<String> values) {
            addCriterion("ps_api_service in", values, "psApiService");
            return (Criteria) this;
        }

        public Criteria andPsApiServiceNotIn(List<String> values) {
            addCriterion("ps_api_service not in", values, "psApiService");
            return (Criteria) this;
        }

        public Criteria andPsApiServiceBetween(String value1, String value2) {
            addCriterion("ps_api_service between", value1, value2, "psApiService");
            return (Criteria) this;
        }

        public Criteria andPsApiServiceNotBetween(String value1, String value2) {
            addCriterion("ps_api_service not between", value1, value2, "psApiService");
            return (Criteria) this;
        }

        public Criteria andPsApiActionIsNull() {
            addCriterion("ps_api_action is null");
            return (Criteria) this;
        }

        public Criteria andPsApiActionIsNotNull() {
            addCriterion("ps_api_action is not null");
            return (Criteria) this;
        }

        public Criteria andPsApiActionEqualTo(String value) {
            addCriterion("ps_api_action =", value, "psApiAction");
            return (Criteria) this;
        }

        public Criteria andPsApiActionNotEqualTo(String value) {
            addCriterion("ps_api_action <>", value, "psApiAction");
            return (Criteria) this;
        }

        public Criteria andPsApiActionGreaterThan(String value) {
            addCriterion("ps_api_action >", value, "psApiAction");
            return (Criteria) this;
        }

        public Criteria andPsApiActionGreaterThanOrEqualTo(String value) {
            addCriterion("ps_api_action >=", value, "psApiAction");
            return (Criteria) this;
        }

        public Criteria andPsApiActionLessThan(String value) {
            addCriterion("ps_api_action <", value, "psApiAction");
            return (Criteria) this;
        }

        public Criteria andPsApiActionLessThanOrEqualTo(String value) {
            addCriterion("ps_api_action <=", value, "psApiAction");
            return (Criteria) this;
        }

        public Criteria andPsApiActionLike(String value) {
            addCriterion("ps_api_action like", value, "psApiAction");
            return (Criteria) this;
        }

        public Criteria andPsApiActionNotLike(String value) {
            addCriterion("ps_api_action not like", value, "psApiAction");
            return (Criteria) this;
        }

        public Criteria andPsApiActionIn(List<String> values) {
            addCriterion("ps_api_action in", values, "psApiAction");
            return (Criteria) this;
        }

        public Criteria andPsApiActionNotIn(List<String> values) {
            addCriterion("ps_api_action not in", values, "psApiAction");
            return (Criteria) this;
        }

        public Criteria andPsApiActionBetween(String value1, String value2) {
            addCriterion("ps_api_action between", value1, value2, "psApiAction");
            return (Criteria) this;
        }

        public Criteria andPsApiActionNotBetween(String value1, String value2) {
            addCriterion("ps_api_action not between", value1, value2, "psApiAction");
            return (Criteria) this;
        }

        public Criteria andPsApiPathIsNull() {
            addCriterion("ps_api_path is null");
            return (Criteria) this;
        }

        public Criteria andPsApiPathIsNotNull() {
            addCriterion("ps_api_path is not null");
            return (Criteria) this;
        }

        public Criteria andPsApiPathEqualTo(String value) {
            addCriterion("ps_api_path =", value, "psApiPath");
            return (Criteria) this;
        }

        public Criteria andPsApiPathNotEqualTo(String value) {
            addCriterion("ps_api_path <>", value, "psApiPath");
            return (Criteria) this;
        }

        public Criteria andPsApiPathGreaterThan(String value) {
            addCriterion("ps_api_path >", value, "psApiPath");
            return (Criteria) this;
        }

        public Criteria andPsApiPathGreaterThanOrEqualTo(String value) {
            addCriterion("ps_api_path >=", value, "psApiPath");
            return (Criteria) this;
        }

        public Criteria andPsApiPathLessThan(String value) {
            addCriterion("ps_api_path <", value, "psApiPath");
            return (Criteria) this;
        }

        public Criteria andPsApiPathLessThanOrEqualTo(String value) {
            addCriterion("ps_api_path <=", value, "psApiPath");
            return (Criteria) this;
        }

        public Criteria andPsApiPathLike(String value) {
            addCriterion("ps_api_path like", value, "psApiPath");
            return (Criteria) this;
        }

        public Criteria andPsApiPathNotLike(String value) {
            addCriterion("ps_api_path not like", value, "psApiPath");
            return (Criteria) this;
        }

        public Criteria andPsApiPathIn(List<String> values) {
            addCriterion("ps_api_path in", values, "psApiPath");
            return (Criteria) this;
        }

        public Criteria andPsApiPathNotIn(List<String> values) {
            addCriterion("ps_api_path not in", values, "psApiPath");
            return (Criteria) this;
        }

        public Criteria andPsApiPathBetween(String value1, String value2) {
            addCriterion("ps_api_path between", value1, value2, "psApiPath");
            return (Criteria) this;
        }

        public Criteria andPsApiPathNotBetween(String value1, String value2) {
            addCriterion("ps_api_path not between", value1, value2, "psApiPath");
            return (Criteria) this;
        }

        public Criteria andPsApiOrderIsNull() {
            addCriterion("ps_api_order is null");
            return (Criteria) this;
        }

        public Criteria andPsApiOrderIsNotNull() {
            addCriterion("ps_api_order is not null");
            return (Criteria) this;
        }

        public Criteria andPsApiOrderEqualTo(Integer value) {
            addCriterion("ps_api_order =", value, "psApiOrder");
            return (Criteria) this;
        }

        public Criteria andPsApiOrderNotEqualTo(Integer value) {
            addCriterion("ps_api_order <>", value, "psApiOrder");
            return (Criteria) this;
        }

        public Criteria andPsApiOrderGreaterThan(Integer value) {
            addCriterion("ps_api_order >", value, "psApiOrder");
            return (Criteria) this;
        }

        public Criteria andPsApiOrderGreaterThanOrEqualTo(Integer value) {
            addCriterion("ps_api_order >=", value, "psApiOrder");
            return (Criteria) this;
        }

        public Criteria andPsApiOrderLessThan(Integer value) {
            addCriterion("ps_api_order <", value, "psApiOrder");
            return (Criteria) this;
        }

        public Criteria andPsApiOrderLessThanOrEqualTo(Integer value) {
            addCriterion("ps_api_order <=", value, "psApiOrder");
            return (Criteria) this;
        }

        public Criteria andPsApiOrderIn(List<Integer> values) {
            addCriterion("ps_api_order in", values, "psApiOrder");
            return (Criteria) this;
        }

        public Criteria andPsApiOrderNotIn(List<Integer> values) {
            addCriterion("ps_api_order not in", values, "psApiOrder");
            return (Criteria) this;
        }

        public Criteria andPsApiOrderBetween(Integer value1, Integer value2) {
            addCriterion("ps_api_order between", value1, value2, "psApiOrder");
            return (Criteria) this;
        }

        public Criteria andPsApiOrderNotBetween(Integer value1, Integer value2) {
            addCriterion("ps_api_order not between", value1, value2, "psApiOrder");
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