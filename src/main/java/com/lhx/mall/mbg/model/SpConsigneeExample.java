package com.lhx.mall.mbg.model;

import java.util.ArrayList;
import java.util.List;

public class SpConsigneeExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public SpConsigneeExample() {
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

        public Criteria andCgnIdIsNull() {
            addCriterion("cgn_id is null");
            return (Criteria) this;
        }

        public Criteria andCgnIdIsNotNull() {
            addCriterion("cgn_id is not null");
            return (Criteria) this;
        }

        public Criteria andCgnIdEqualTo(Integer value) {
            addCriterion("cgn_id =", value, "cgnId");
            return (Criteria) this;
        }

        public Criteria andCgnIdNotEqualTo(Integer value) {
            addCriterion("cgn_id <>", value, "cgnId");
            return (Criteria) this;
        }

        public Criteria andCgnIdGreaterThan(Integer value) {
            addCriterion("cgn_id >", value, "cgnId");
            return (Criteria) this;
        }

        public Criteria andCgnIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("cgn_id >=", value, "cgnId");
            return (Criteria) this;
        }

        public Criteria andCgnIdLessThan(Integer value) {
            addCriterion("cgn_id <", value, "cgnId");
            return (Criteria) this;
        }

        public Criteria andCgnIdLessThanOrEqualTo(Integer value) {
            addCriterion("cgn_id <=", value, "cgnId");
            return (Criteria) this;
        }

        public Criteria andCgnIdIn(List<Integer> values) {
            addCriterion("cgn_id in", values, "cgnId");
            return (Criteria) this;
        }

        public Criteria andCgnIdNotIn(List<Integer> values) {
            addCriterion("cgn_id not in", values, "cgnId");
            return (Criteria) this;
        }

        public Criteria andCgnIdBetween(Integer value1, Integer value2) {
            addCriterion("cgn_id between", value1, value2, "cgnId");
            return (Criteria) this;
        }

        public Criteria andCgnIdNotBetween(Integer value1, Integer value2) {
            addCriterion("cgn_id not between", value1, value2, "cgnId");
            return (Criteria) this;
        }

        public Criteria andUserIdIsNull() {
            addCriterion("user_id is null");
            return (Criteria) this;
        }

        public Criteria andUserIdIsNotNull() {
            addCriterion("user_id is not null");
            return (Criteria) this;
        }

        public Criteria andUserIdEqualTo(Integer value) {
            addCriterion("user_id =", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotEqualTo(Integer value) {
            addCriterion("user_id <>", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdGreaterThan(Integer value) {
            addCriterion("user_id >", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("user_id >=", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdLessThan(Integer value) {
            addCriterion("user_id <", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdLessThanOrEqualTo(Integer value) {
            addCriterion("user_id <=", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdIn(List<Integer> values) {
            addCriterion("user_id in", values, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotIn(List<Integer> values) {
            addCriterion("user_id not in", values, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdBetween(Integer value1, Integer value2) {
            addCriterion("user_id between", value1, value2, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotBetween(Integer value1, Integer value2) {
            addCriterion("user_id not between", value1, value2, "userId");
            return (Criteria) this;
        }

        public Criteria andCgnNameIsNull() {
            addCriterion("cgn_name is null");
            return (Criteria) this;
        }

        public Criteria andCgnNameIsNotNull() {
            addCriterion("cgn_name is not null");
            return (Criteria) this;
        }

        public Criteria andCgnNameEqualTo(String value) {
            addCriterion("cgn_name =", value, "cgnName");
            return (Criteria) this;
        }

        public Criteria andCgnNameNotEqualTo(String value) {
            addCriterion("cgn_name <>", value, "cgnName");
            return (Criteria) this;
        }

        public Criteria andCgnNameGreaterThan(String value) {
            addCriterion("cgn_name >", value, "cgnName");
            return (Criteria) this;
        }

        public Criteria andCgnNameGreaterThanOrEqualTo(String value) {
            addCriterion("cgn_name >=", value, "cgnName");
            return (Criteria) this;
        }

        public Criteria andCgnNameLessThan(String value) {
            addCriterion("cgn_name <", value, "cgnName");
            return (Criteria) this;
        }

        public Criteria andCgnNameLessThanOrEqualTo(String value) {
            addCriterion("cgn_name <=", value, "cgnName");
            return (Criteria) this;
        }

        public Criteria andCgnNameLike(String value) {
            addCriterion("cgn_name like", value, "cgnName");
            return (Criteria) this;
        }

        public Criteria andCgnNameNotLike(String value) {
            addCriterion("cgn_name not like", value, "cgnName");
            return (Criteria) this;
        }

        public Criteria andCgnNameIn(List<String> values) {
            addCriterion("cgn_name in", values, "cgnName");
            return (Criteria) this;
        }

        public Criteria andCgnNameNotIn(List<String> values) {
            addCriterion("cgn_name not in", values, "cgnName");
            return (Criteria) this;
        }

        public Criteria andCgnNameBetween(String value1, String value2) {
            addCriterion("cgn_name between", value1, value2, "cgnName");
            return (Criteria) this;
        }

        public Criteria andCgnNameNotBetween(String value1, String value2) {
            addCriterion("cgn_name not between", value1, value2, "cgnName");
            return (Criteria) this;
        }

        public Criteria andCgnAddressIsNull() {
            addCriterion("cgn_address is null");
            return (Criteria) this;
        }

        public Criteria andCgnAddressIsNotNull() {
            addCriterion("cgn_address is not null");
            return (Criteria) this;
        }

        public Criteria andCgnAddressEqualTo(String value) {
            addCriterion("cgn_address =", value, "cgnAddress");
            return (Criteria) this;
        }

        public Criteria andCgnAddressNotEqualTo(String value) {
            addCriterion("cgn_address <>", value, "cgnAddress");
            return (Criteria) this;
        }

        public Criteria andCgnAddressGreaterThan(String value) {
            addCriterion("cgn_address >", value, "cgnAddress");
            return (Criteria) this;
        }

        public Criteria andCgnAddressGreaterThanOrEqualTo(String value) {
            addCriterion("cgn_address >=", value, "cgnAddress");
            return (Criteria) this;
        }

        public Criteria andCgnAddressLessThan(String value) {
            addCriterion("cgn_address <", value, "cgnAddress");
            return (Criteria) this;
        }

        public Criteria andCgnAddressLessThanOrEqualTo(String value) {
            addCriterion("cgn_address <=", value, "cgnAddress");
            return (Criteria) this;
        }

        public Criteria andCgnAddressLike(String value) {
            addCriterion("cgn_address like", value, "cgnAddress");
            return (Criteria) this;
        }

        public Criteria andCgnAddressNotLike(String value) {
            addCriterion("cgn_address not like", value, "cgnAddress");
            return (Criteria) this;
        }

        public Criteria andCgnAddressIn(List<String> values) {
            addCriterion("cgn_address in", values, "cgnAddress");
            return (Criteria) this;
        }

        public Criteria andCgnAddressNotIn(List<String> values) {
            addCriterion("cgn_address not in", values, "cgnAddress");
            return (Criteria) this;
        }

        public Criteria andCgnAddressBetween(String value1, String value2) {
            addCriterion("cgn_address between", value1, value2, "cgnAddress");
            return (Criteria) this;
        }

        public Criteria andCgnAddressNotBetween(String value1, String value2) {
            addCriterion("cgn_address not between", value1, value2, "cgnAddress");
            return (Criteria) this;
        }

        public Criteria andCgnTelIsNull() {
            addCriterion("cgn_tel is null");
            return (Criteria) this;
        }

        public Criteria andCgnTelIsNotNull() {
            addCriterion("cgn_tel is not null");
            return (Criteria) this;
        }

        public Criteria andCgnTelEqualTo(String value) {
            addCriterion("cgn_tel =", value, "cgnTel");
            return (Criteria) this;
        }

        public Criteria andCgnTelNotEqualTo(String value) {
            addCriterion("cgn_tel <>", value, "cgnTel");
            return (Criteria) this;
        }

        public Criteria andCgnTelGreaterThan(String value) {
            addCriterion("cgn_tel >", value, "cgnTel");
            return (Criteria) this;
        }

        public Criteria andCgnTelGreaterThanOrEqualTo(String value) {
            addCriterion("cgn_tel >=", value, "cgnTel");
            return (Criteria) this;
        }

        public Criteria andCgnTelLessThan(String value) {
            addCriterion("cgn_tel <", value, "cgnTel");
            return (Criteria) this;
        }

        public Criteria andCgnTelLessThanOrEqualTo(String value) {
            addCriterion("cgn_tel <=", value, "cgnTel");
            return (Criteria) this;
        }

        public Criteria andCgnTelLike(String value) {
            addCriterion("cgn_tel like", value, "cgnTel");
            return (Criteria) this;
        }

        public Criteria andCgnTelNotLike(String value) {
            addCriterion("cgn_tel not like", value, "cgnTel");
            return (Criteria) this;
        }

        public Criteria andCgnTelIn(List<String> values) {
            addCriterion("cgn_tel in", values, "cgnTel");
            return (Criteria) this;
        }

        public Criteria andCgnTelNotIn(List<String> values) {
            addCriterion("cgn_tel not in", values, "cgnTel");
            return (Criteria) this;
        }

        public Criteria andCgnTelBetween(String value1, String value2) {
            addCriterion("cgn_tel between", value1, value2, "cgnTel");
            return (Criteria) this;
        }

        public Criteria andCgnTelNotBetween(String value1, String value2) {
            addCriterion("cgn_tel not between", value1, value2, "cgnTel");
            return (Criteria) this;
        }

        public Criteria andCgnCodeIsNull() {
            addCriterion("cgn_code is null");
            return (Criteria) this;
        }

        public Criteria andCgnCodeIsNotNull() {
            addCriterion("cgn_code is not null");
            return (Criteria) this;
        }

        public Criteria andCgnCodeEqualTo(String value) {
            addCriterion("cgn_code =", value, "cgnCode");
            return (Criteria) this;
        }

        public Criteria andCgnCodeNotEqualTo(String value) {
            addCriterion("cgn_code <>", value, "cgnCode");
            return (Criteria) this;
        }

        public Criteria andCgnCodeGreaterThan(String value) {
            addCriterion("cgn_code >", value, "cgnCode");
            return (Criteria) this;
        }

        public Criteria andCgnCodeGreaterThanOrEqualTo(String value) {
            addCriterion("cgn_code >=", value, "cgnCode");
            return (Criteria) this;
        }

        public Criteria andCgnCodeLessThan(String value) {
            addCriterion("cgn_code <", value, "cgnCode");
            return (Criteria) this;
        }

        public Criteria andCgnCodeLessThanOrEqualTo(String value) {
            addCriterion("cgn_code <=", value, "cgnCode");
            return (Criteria) this;
        }

        public Criteria andCgnCodeLike(String value) {
            addCriterion("cgn_code like", value, "cgnCode");
            return (Criteria) this;
        }

        public Criteria andCgnCodeNotLike(String value) {
            addCriterion("cgn_code not like", value, "cgnCode");
            return (Criteria) this;
        }

        public Criteria andCgnCodeIn(List<String> values) {
            addCriterion("cgn_code in", values, "cgnCode");
            return (Criteria) this;
        }

        public Criteria andCgnCodeNotIn(List<String> values) {
            addCriterion("cgn_code not in", values, "cgnCode");
            return (Criteria) this;
        }

        public Criteria andCgnCodeBetween(String value1, String value2) {
            addCriterion("cgn_code between", value1, value2, "cgnCode");
            return (Criteria) this;
        }

        public Criteria andCgnCodeNotBetween(String value1, String value2) {
            addCriterion("cgn_code not between", value1, value2, "cgnCode");
            return (Criteria) this;
        }

        public Criteria andDeleteTimeIsNull() {
            addCriterion("delete_time is null");
            return (Criteria) this;
        }

        public Criteria andDeleteTimeIsNotNull() {
            addCriterion("delete_time is not null");
            return (Criteria) this;
        }

        public Criteria andDeleteTimeEqualTo(Integer value) {
            addCriterion("delete_time =", value, "deleteTime");
            return (Criteria) this;
        }

        public Criteria andDeleteTimeNotEqualTo(Integer value) {
            addCriterion("delete_time <>", value, "deleteTime");
            return (Criteria) this;
        }

        public Criteria andDeleteTimeGreaterThan(Integer value) {
            addCriterion("delete_time >", value, "deleteTime");
            return (Criteria) this;
        }

        public Criteria andDeleteTimeGreaterThanOrEqualTo(Integer value) {
            addCriterion("delete_time >=", value, "deleteTime");
            return (Criteria) this;
        }

        public Criteria andDeleteTimeLessThan(Integer value) {
            addCriterion("delete_time <", value, "deleteTime");
            return (Criteria) this;
        }

        public Criteria andDeleteTimeLessThanOrEqualTo(Integer value) {
            addCriterion("delete_time <=", value, "deleteTime");
            return (Criteria) this;
        }

        public Criteria andDeleteTimeIn(List<Integer> values) {
            addCriterion("delete_time in", values, "deleteTime");
            return (Criteria) this;
        }

        public Criteria andDeleteTimeNotIn(List<Integer> values) {
            addCriterion("delete_time not in", values, "deleteTime");
            return (Criteria) this;
        }

        public Criteria andDeleteTimeBetween(Integer value1, Integer value2) {
            addCriterion("delete_time between", value1, value2, "deleteTime");
            return (Criteria) this;
        }

        public Criteria andDeleteTimeNotBetween(Integer value1, Integer value2) {
            addCriterion("delete_time not between", value1, value2, "deleteTime");
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