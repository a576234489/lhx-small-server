package com.lhx.mall.mbg.model;

import java.util.ArrayList;
import java.util.List;

public class SpPermissionExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public SpPermissionExample() {
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

        public Criteria andPsIdIsNull() {
            addCriterion("ps_id is null");
            return (Criteria) this;
        }

        public Criteria andPsIdIsNotNull() {
            addCriterion("ps_id is not null");
            return (Criteria) this;
        }

        public Criteria andPsIdEqualTo(Short value) {
            addCriterion("ps_id =", value, "psId");
            return (Criteria) this;
        }

        public Criteria andPsIdNotEqualTo(Short value) {
            addCriterion("ps_id <>", value, "psId");
            return (Criteria) this;
        }

        public Criteria andPsIdGreaterThan(Short value) {
            addCriterion("ps_id >", value, "psId");
            return (Criteria) this;
        }

        public Criteria andPsIdGreaterThanOrEqualTo(Short value) {
            addCriterion("ps_id >=", value, "psId");
            return (Criteria) this;
        }

        public Criteria andPsIdLessThan(Short value) {
            addCriterion("ps_id <", value, "psId");
            return (Criteria) this;
        }

        public Criteria andPsIdLessThanOrEqualTo(Short value) {
            addCriterion("ps_id <=", value, "psId");
            return (Criteria) this;
        }

        public Criteria andPsIdIn(List<Short> values) {
            addCriterion("ps_id in", values, "psId");
            return (Criteria) this;
        }

        public Criteria andPsIdNotIn(List<Short> values) {
            addCriterion("ps_id not in", values, "psId");
            return (Criteria) this;
        }

        public Criteria andPsIdBetween(Short value1, Short value2) {
            addCriterion("ps_id between", value1, value2, "psId");
            return (Criteria) this;
        }

        public Criteria andPsIdNotBetween(Short value1, Short value2) {
            addCriterion("ps_id not between", value1, value2, "psId");
            return (Criteria) this;
        }

        public Criteria andPsNameIsNull() {
            addCriterion("ps_name is null");
            return (Criteria) this;
        }

        public Criteria andPsNameIsNotNull() {
            addCriterion("ps_name is not null");
            return (Criteria) this;
        }

        public Criteria andPsNameEqualTo(String value) {
            addCriterion("ps_name =", value, "psName");
            return (Criteria) this;
        }

        public Criteria andPsNameNotEqualTo(String value) {
            addCriterion("ps_name <>", value, "psName");
            return (Criteria) this;
        }

        public Criteria andPsNameGreaterThan(String value) {
            addCriterion("ps_name >", value, "psName");
            return (Criteria) this;
        }

        public Criteria andPsNameGreaterThanOrEqualTo(String value) {
            addCriterion("ps_name >=", value, "psName");
            return (Criteria) this;
        }

        public Criteria andPsNameLessThan(String value) {
            addCriterion("ps_name <", value, "psName");
            return (Criteria) this;
        }

        public Criteria andPsNameLessThanOrEqualTo(String value) {
            addCriterion("ps_name <=", value, "psName");
            return (Criteria) this;
        }

        public Criteria andPsNameLike(String value) {
            addCriterion("ps_name like", value, "psName");
            return (Criteria) this;
        }

        public Criteria andPsNameNotLike(String value) {
            addCriterion("ps_name not like", value, "psName");
            return (Criteria) this;
        }

        public Criteria andPsNameIn(List<String> values) {
            addCriterion("ps_name in", values, "psName");
            return (Criteria) this;
        }

        public Criteria andPsNameNotIn(List<String> values) {
            addCriterion("ps_name not in", values, "psName");
            return (Criteria) this;
        }

        public Criteria andPsNameBetween(String value1, String value2) {
            addCriterion("ps_name between", value1, value2, "psName");
            return (Criteria) this;
        }

        public Criteria andPsNameNotBetween(String value1, String value2) {
            addCriterion("ps_name not between", value1, value2, "psName");
            return (Criteria) this;
        }

        public Criteria andPsPidIsNull() {
            addCriterion("ps_pid is null");
            return (Criteria) this;
        }

        public Criteria andPsPidIsNotNull() {
            addCriterion("ps_pid is not null");
            return (Criteria) this;
        }

        public Criteria andPsPidEqualTo(Short value) {
            addCriterion("ps_pid =", value, "psPid");
            return (Criteria) this;
        }

        public Criteria andPsPidNotEqualTo(Short value) {
            addCriterion("ps_pid <>", value, "psPid");
            return (Criteria) this;
        }

        public Criteria andPsPidGreaterThan(Short value) {
            addCriterion("ps_pid >", value, "psPid");
            return (Criteria) this;
        }

        public Criteria andPsPidGreaterThanOrEqualTo(Short value) {
            addCriterion("ps_pid >=", value, "psPid");
            return (Criteria) this;
        }

        public Criteria andPsPidLessThan(Short value) {
            addCriterion("ps_pid <", value, "psPid");
            return (Criteria) this;
        }

        public Criteria andPsPidLessThanOrEqualTo(Short value) {
            addCriterion("ps_pid <=", value, "psPid");
            return (Criteria) this;
        }

        public Criteria andPsPidIn(List<Short> values) {
            addCriterion("ps_pid in", values, "psPid");
            return (Criteria) this;
        }

        public Criteria andPsPidNotIn(List<Short> values) {
            addCriterion("ps_pid not in", values, "psPid");
            return (Criteria) this;
        }

        public Criteria andPsPidBetween(Short value1, Short value2) {
            addCriterion("ps_pid between", value1, value2, "psPid");
            return (Criteria) this;
        }

        public Criteria andPsPidNotBetween(Short value1, Short value2) {
            addCriterion("ps_pid not between", value1, value2, "psPid");
            return (Criteria) this;
        }

        public Criteria andPsCIsNull() {
            addCriterion("ps_c is null");
            return (Criteria) this;
        }

        public Criteria andPsCIsNotNull() {
            addCriterion("ps_c is not null");
            return (Criteria) this;
        }

        public Criteria andPsCEqualTo(String value) {
            addCriterion("ps_c =", value, "psC");
            return (Criteria) this;
        }

        public Criteria andPsCNotEqualTo(String value) {
            addCriterion("ps_c <>", value, "psC");
            return (Criteria) this;
        }

        public Criteria andPsCGreaterThan(String value) {
            addCriterion("ps_c >", value, "psC");
            return (Criteria) this;
        }

        public Criteria andPsCGreaterThanOrEqualTo(String value) {
            addCriterion("ps_c >=", value, "psC");
            return (Criteria) this;
        }

        public Criteria andPsCLessThan(String value) {
            addCriterion("ps_c <", value, "psC");
            return (Criteria) this;
        }

        public Criteria andPsCLessThanOrEqualTo(String value) {
            addCriterion("ps_c <=", value, "psC");
            return (Criteria) this;
        }

        public Criteria andPsCLike(String value) {
            addCriterion("ps_c like", value, "psC");
            return (Criteria) this;
        }

        public Criteria andPsCNotLike(String value) {
            addCriterion("ps_c not like", value, "psC");
            return (Criteria) this;
        }

        public Criteria andPsCIn(List<String> values) {
            addCriterion("ps_c in", values, "psC");
            return (Criteria) this;
        }

        public Criteria andPsCNotIn(List<String> values) {
            addCriterion("ps_c not in", values, "psC");
            return (Criteria) this;
        }

        public Criteria andPsCBetween(String value1, String value2) {
            addCriterion("ps_c between", value1, value2, "psC");
            return (Criteria) this;
        }

        public Criteria andPsCNotBetween(String value1, String value2) {
            addCriterion("ps_c not between", value1, value2, "psC");
            return (Criteria) this;
        }

        public Criteria andPsAIsNull() {
            addCriterion("ps_a is null");
            return (Criteria) this;
        }

        public Criteria andPsAIsNotNull() {
            addCriterion("ps_a is not null");
            return (Criteria) this;
        }

        public Criteria andPsAEqualTo(String value) {
            addCriterion("ps_a =", value, "psA");
            return (Criteria) this;
        }

        public Criteria andPsANotEqualTo(String value) {
            addCriterion("ps_a <>", value, "psA");
            return (Criteria) this;
        }

        public Criteria andPsAGreaterThan(String value) {
            addCriterion("ps_a >", value, "psA");
            return (Criteria) this;
        }

        public Criteria andPsAGreaterThanOrEqualTo(String value) {
            addCriterion("ps_a >=", value, "psA");
            return (Criteria) this;
        }

        public Criteria andPsALessThan(String value) {
            addCriterion("ps_a <", value, "psA");
            return (Criteria) this;
        }

        public Criteria andPsALessThanOrEqualTo(String value) {
            addCriterion("ps_a <=", value, "psA");
            return (Criteria) this;
        }

        public Criteria andPsALike(String value) {
            addCriterion("ps_a like", value, "psA");
            return (Criteria) this;
        }

        public Criteria andPsANotLike(String value) {
            addCriterion("ps_a not like", value, "psA");
            return (Criteria) this;
        }

        public Criteria andPsAIn(List<String> values) {
            addCriterion("ps_a in", values, "psA");
            return (Criteria) this;
        }

        public Criteria andPsANotIn(List<String> values) {
            addCriterion("ps_a not in", values, "psA");
            return (Criteria) this;
        }

        public Criteria andPsABetween(String value1, String value2) {
            addCriterion("ps_a between", value1, value2, "psA");
            return (Criteria) this;
        }

        public Criteria andPsANotBetween(String value1, String value2) {
            addCriterion("ps_a not between", value1, value2, "psA");
            return (Criteria) this;
        }

        public Criteria andPsLevelIsNull() {
            addCriterion("ps_level is null");
            return (Criteria) this;
        }

        public Criteria andPsLevelIsNotNull() {
            addCriterion("ps_level is not null");
            return (Criteria) this;
        }

        public Criteria andPsLevelEqualTo(String value) {
            addCriterion("ps_level =", value, "psLevel");
            return (Criteria) this;
        }

        public Criteria andPsLevelNotEqualTo(String value) {
            addCriterion("ps_level <>", value, "psLevel");
            return (Criteria) this;
        }

        public Criteria andPsLevelGreaterThan(String value) {
            addCriterion("ps_level >", value, "psLevel");
            return (Criteria) this;
        }

        public Criteria andPsLevelGreaterThanOrEqualTo(String value) {
            addCriterion("ps_level >=", value, "psLevel");
            return (Criteria) this;
        }

        public Criteria andPsLevelLessThan(String value) {
            addCriterion("ps_level <", value, "psLevel");
            return (Criteria) this;
        }

        public Criteria andPsLevelLessThanOrEqualTo(String value) {
            addCriterion("ps_level <=", value, "psLevel");
            return (Criteria) this;
        }

        public Criteria andPsLevelLike(String value) {
            addCriterion("ps_level like", value, "psLevel");
            return (Criteria) this;
        }

        public Criteria andPsLevelNotLike(String value) {
            addCriterion("ps_level not like", value, "psLevel");
            return (Criteria) this;
        }

        public Criteria andPsLevelIn(List<String> values) {
            addCriterion("ps_level in", values, "psLevel");
            return (Criteria) this;
        }

        public Criteria andPsLevelNotIn(List<String> values) {
            addCriterion("ps_level not in", values, "psLevel");
            return (Criteria) this;
        }

        public Criteria andPsLevelBetween(String value1, String value2) {
            addCriterion("ps_level between", value1, value2, "psLevel");
            return (Criteria) this;
        }

        public Criteria andPsLevelNotBetween(String value1, String value2) {
            addCriterion("ps_level not between", value1, value2, "psLevel");
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