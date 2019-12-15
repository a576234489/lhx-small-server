package com.lhx.mall.mbg.model;

import java.util.ArrayList;
import java.util.List;

public class SpManagerExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public SpManagerExample() {
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

        public Criteria andMgIdIsNull() {
            addCriterion("mg_id is null");
            return (Criteria) this;
        }

        public Criteria andMgIdIsNotNull() {
            addCriterion("mg_id is not null");
            return (Criteria) this;
        }

        public Criteria andMgIdEqualTo(Integer value) {
            addCriterion("mg_id =", value, "mgId");
            return (Criteria) this;
        }

        public Criteria andMgIdNotEqualTo(Integer value) {
            addCriterion("mg_id <>", value, "mgId");
            return (Criteria) this;
        }

        public Criteria andMgIdGreaterThan(Integer value) {
            addCriterion("mg_id >", value, "mgId");
            return (Criteria) this;
        }

        public Criteria andMgIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("mg_id >=", value, "mgId");
            return (Criteria) this;
        }

        public Criteria andMgIdLessThan(Integer value) {
            addCriterion("mg_id <", value, "mgId");
            return (Criteria) this;
        }

        public Criteria andMgIdLessThanOrEqualTo(Integer value) {
            addCriterion("mg_id <=", value, "mgId");
            return (Criteria) this;
        }

        public Criteria andMgIdIn(List<Integer> values) {
            addCriterion("mg_id in", values, "mgId");
            return (Criteria) this;
        }

        public Criteria andMgIdNotIn(List<Integer> values) {
            addCriterion("mg_id not in", values, "mgId");
            return (Criteria) this;
        }

        public Criteria andMgIdBetween(Integer value1, Integer value2) {
            addCriterion("mg_id between", value1, value2, "mgId");
            return (Criteria) this;
        }

        public Criteria andMgIdNotBetween(Integer value1, Integer value2) {
            addCriterion("mg_id not between", value1, value2, "mgId");
            return (Criteria) this;
        }

        public Criteria andMgNameIsNull() {
            addCriterion("mg_name is null");
            return (Criteria) this;
        }

        public Criteria andMgNameIsNotNull() {
            addCriterion("mg_name is not null");
            return (Criteria) this;
        }

        public Criteria andMgNameEqualTo(String value) {
            addCriterion("mg_name =", value, "mgName");
            return (Criteria) this;
        }

        public Criteria andMgNameNotEqualTo(String value) {
            addCriterion("mg_name <>", value, "mgName");
            return (Criteria) this;
        }

        public Criteria andMgNameGreaterThan(String value) {
            addCriterion("mg_name >", value, "mgName");
            return (Criteria) this;
        }

        public Criteria andMgNameGreaterThanOrEqualTo(String value) {
            addCriterion("mg_name >=", value, "mgName");
            return (Criteria) this;
        }

        public Criteria andMgNameLessThan(String value) {
            addCriterion("mg_name <", value, "mgName");
            return (Criteria) this;
        }

        public Criteria andMgNameLessThanOrEqualTo(String value) {
            addCriterion("mg_name <=", value, "mgName");
            return (Criteria) this;
        }

        public Criteria andMgNameLike(String value) {
            addCriterion("mg_name like", value, "mgName");
            return (Criteria) this;
        }

        public Criteria andMgNameNotLike(String value) {
            addCriterion("mg_name not like", value, "mgName");
            return (Criteria) this;
        }

        public Criteria andMgNameIn(List<String> values) {
            addCriterion("mg_name in", values, "mgName");
            return (Criteria) this;
        }

        public Criteria andMgNameNotIn(List<String> values) {
            addCriterion("mg_name not in", values, "mgName");
            return (Criteria) this;
        }

        public Criteria andMgNameBetween(String value1, String value2) {
            addCriterion("mg_name between", value1, value2, "mgName");
            return (Criteria) this;
        }

        public Criteria andMgNameNotBetween(String value1, String value2) {
            addCriterion("mg_name not between", value1, value2, "mgName");
            return (Criteria) this;
        }

        public Criteria andMgPwdIsNull() {
            addCriterion("mg_pwd is null");
            return (Criteria) this;
        }

        public Criteria andMgPwdIsNotNull() {
            addCriterion("mg_pwd is not null");
            return (Criteria) this;
        }

        public Criteria andMgPwdEqualTo(String value) {
            addCriterion("mg_pwd =", value, "mgPwd");
            return (Criteria) this;
        }

        public Criteria andMgPwdNotEqualTo(String value) {
            addCriterion("mg_pwd <>", value, "mgPwd");
            return (Criteria) this;
        }

        public Criteria andMgPwdGreaterThan(String value) {
            addCriterion("mg_pwd >", value, "mgPwd");
            return (Criteria) this;
        }

        public Criteria andMgPwdGreaterThanOrEqualTo(String value) {
            addCriterion("mg_pwd >=", value, "mgPwd");
            return (Criteria) this;
        }

        public Criteria andMgPwdLessThan(String value) {
            addCriterion("mg_pwd <", value, "mgPwd");
            return (Criteria) this;
        }

        public Criteria andMgPwdLessThanOrEqualTo(String value) {
            addCriterion("mg_pwd <=", value, "mgPwd");
            return (Criteria) this;
        }

        public Criteria andMgPwdLike(String value) {
            addCriterion("mg_pwd like", value, "mgPwd");
            return (Criteria) this;
        }

        public Criteria andMgPwdNotLike(String value) {
            addCriterion("mg_pwd not like", value, "mgPwd");
            return (Criteria) this;
        }

        public Criteria andMgPwdIn(List<String> values) {
            addCriterion("mg_pwd in", values, "mgPwd");
            return (Criteria) this;
        }

        public Criteria andMgPwdNotIn(List<String> values) {
            addCriterion("mg_pwd not in", values, "mgPwd");
            return (Criteria) this;
        }

        public Criteria andMgPwdBetween(String value1, String value2) {
            addCriterion("mg_pwd between", value1, value2, "mgPwd");
            return (Criteria) this;
        }

        public Criteria andMgPwdNotBetween(String value1, String value2) {
            addCriterion("mg_pwd not between", value1, value2, "mgPwd");
            return (Criteria) this;
        }

        public Criteria andMgTimeIsNull() {
            addCriterion("mg_time is null");
            return (Criteria) this;
        }

        public Criteria andMgTimeIsNotNull() {
            addCriterion("mg_time is not null");
            return (Criteria) this;
        }

        public Criteria andMgTimeEqualTo(Integer value) {
            addCriterion("mg_time =", value, "mgTime");
            return (Criteria) this;
        }

        public Criteria andMgTimeNotEqualTo(Integer value) {
            addCriterion("mg_time <>", value, "mgTime");
            return (Criteria) this;
        }

        public Criteria andMgTimeGreaterThan(Integer value) {
            addCriterion("mg_time >", value, "mgTime");
            return (Criteria) this;
        }

        public Criteria andMgTimeGreaterThanOrEqualTo(Integer value) {
            addCriterion("mg_time >=", value, "mgTime");
            return (Criteria) this;
        }

        public Criteria andMgTimeLessThan(Integer value) {
            addCriterion("mg_time <", value, "mgTime");
            return (Criteria) this;
        }

        public Criteria andMgTimeLessThanOrEqualTo(Integer value) {
            addCriterion("mg_time <=", value, "mgTime");
            return (Criteria) this;
        }

        public Criteria andMgTimeIn(List<Integer> values) {
            addCriterion("mg_time in", values, "mgTime");
            return (Criteria) this;
        }

        public Criteria andMgTimeNotIn(List<Integer> values) {
            addCriterion("mg_time not in", values, "mgTime");
            return (Criteria) this;
        }

        public Criteria andMgTimeBetween(Integer value1, Integer value2) {
            addCriterion("mg_time between", value1, value2, "mgTime");
            return (Criteria) this;
        }

        public Criteria andMgTimeNotBetween(Integer value1, Integer value2) {
            addCriterion("mg_time not between", value1, value2, "mgTime");
            return (Criteria) this;
        }

        public Criteria andRoleIdIsNull() {
            addCriterion("role_id is null");
            return (Criteria) this;
        }

        public Criteria andRoleIdIsNotNull() {
            addCriterion("role_id is not null");
            return (Criteria) this;
        }

        public Criteria andRoleIdEqualTo(Byte value) {
            addCriterion("role_id =", value, "roleId");
            return (Criteria) this;
        }

        public Criteria andRoleIdNotEqualTo(Byte value) {
            addCriterion("role_id <>", value, "roleId");
            return (Criteria) this;
        }

        public Criteria andRoleIdGreaterThan(Byte value) {
            addCriterion("role_id >", value, "roleId");
            return (Criteria) this;
        }

        public Criteria andRoleIdGreaterThanOrEqualTo(Byte value) {
            addCriterion("role_id >=", value, "roleId");
            return (Criteria) this;
        }

        public Criteria andRoleIdLessThan(Byte value) {
            addCriterion("role_id <", value, "roleId");
            return (Criteria) this;
        }

        public Criteria andRoleIdLessThanOrEqualTo(Byte value) {
            addCriterion("role_id <=", value, "roleId");
            return (Criteria) this;
        }

        public Criteria andRoleIdIn(List<Byte> values) {
            addCriterion("role_id in", values, "roleId");
            return (Criteria) this;
        }

        public Criteria andRoleIdNotIn(List<Byte> values) {
            addCriterion("role_id not in", values, "roleId");
            return (Criteria) this;
        }

        public Criteria andRoleIdBetween(Byte value1, Byte value2) {
            addCriterion("role_id between", value1, value2, "roleId");
            return (Criteria) this;
        }

        public Criteria andRoleIdNotBetween(Byte value1, Byte value2) {
            addCriterion("role_id not between", value1, value2, "roleId");
            return (Criteria) this;
        }

        public Criteria andMgMobileIsNull() {
            addCriterion("mg_mobile is null");
            return (Criteria) this;
        }

        public Criteria andMgMobileIsNotNull() {
            addCriterion("mg_mobile is not null");
            return (Criteria) this;
        }

        public Criteria andMgMobileEqualTo(String value) {
            addCriterion("mg_mobile =", value, "mgMobile");
            return (Criteria) this;
        }

        public Criteria andMgMobileNotEqualTo(String value) {
            addCriterion("mg_mobile <>", value, "mgMobile");
            return (Criteria) this;
        }

        public Criteria andMgMobileGreaterThan(String value) {
            addCriterion("mg_mobile >", value, "mgMobile");
            return (Criteria) this;
        }

        public Criteria andMgMobileGreaterThanOrEqualTo(String value) {
            addCriterion("mg_mobile >=", value, "mgMobile");
            return (Criteria) this;
        }

        public Criteria andMgMobileLessThan(String value) {
            addCriterion("mg_mobile <", value, "mgMobile");
            return (Criteria) this;
        }

        public Criteria andMgMobileLessThanOrEqualTo(String value) {
            addCriterion("mg_mobile <=", value, "mgMobile");
            return (Criteria) this;
        }

        public Criteria andMgMobileLike(String value) {
            addCriterion("mg_mobile like", value, "mgMobile");
            return (Criteria) this;
        }

        public Criteria andMgMobileNotLike(String value) {
            addCriterion("mg_mobile not like", value, "mgMobile");
            return (Criteria) this;
        }

        public Criteria andMgMobileIn(List<String> values) {
            addCriterion("mg_mobile in", values, "mgMobile");
            return (Criteria) this;
        }

        public Criteria andMgMobileNotIn(List<String> values) {
            addCriterion("mg_mobile not in", values, "mgMobile");
            return (Criteria) this;
        }

        public Criteria andMgMobileBetween(String value1, String value2) {
            addCriterion("mg_mobile between", value1, value2, "mgMobile");
            return (Criteria) this;
        }

        public Criteria andMgMobileNotBetween(String value1, String value2) {
            addCriterion("mg_mobile not between", value1, value2, "mgMobile");
            return (Criteria) this;
        }

        public Criteria andMgEmailIsNull() {
            addCriterion("mg_email is null");
            return (Criteria) this;
        }

        public Criteria andMgEmailIsNotNull() {
            addCriterion("mg_email is not null");
            return (Criteria) this;
        }

        public Criteria andMgEmailEqualTo(String value) {
            addCriterion("mg_email =", value, "mgEmail");
            return (Criteria) this;
        }

        public Criteria andMgEmailNotEqualTo(String value) {
            addCriterion("mg_email <>", value, "mgEmail");
            return (Criteria) this;
        }

        public Criteria andMgEmailGreaterThan(String value) {
            addCriterion("mg_email >", value, "mgEmail");
            return (Criteria) this;
        }

        public Criteria andMgEmailGreaterThanOrEqualTo(String value) {
            addCriterion("mg_email >=", value, "mgEmail");
            return (Criteria) this;
        }

        public Criteria andMgEmailLessThan(String value) {
            addCriterion("mg_email <", value, "mgEmail");
            return (Criteria) this;
        }

        public Criteria andMgEmailLessThanOrEqualTo(String value) {
            addCriterion("mg_email <=", value, "mgEmail");
            return (Criteria) this;
        }

        public Criteria andMgEmailLike(String value) {
            addCriterion("mg_email like", value, "mgEmail");
            return (Criteria) this;
        }

        public Criteria andMgEmailNotLike(String value) {
            addCriterion("mg_email not like", value, "mgEmail");
            return (Criteria) this;
        }

        public Criteria andMgEmailIn(List<String> values) {
            addCriterion("mg_email in", values, "mgEmail");
            return (Criteria) this;
        }

        public Criteria andMgEmailNotIn(List<String> values) {
            addCriterion("mg_email not in", values, "mgEmail");
            return (Criteria) this;
        }

        public Criteria andMgEmailBetween(String value1, String value2) {
            addCriterion("mg_email between", value1, value2, "mgEmail");
            return (Criteria) this;
        }

        public Criteria andMgEmailNotBetween(String value1, String value2) {
            addCriterion("mg_email not between", value1, value2, "mgEmail");
            return (Criteria) this;
        }

        public Criteria andMgStateIsNull() {
            addCriterion("mg_state is null");
            return (Criteria) this;
        }

        public Criteria andMgStateIsNotNull() {
            addCriterion("mg_state is not null");
            return (Criteria) this;
        }

        public Criteria andMgStateEqualTo(Byte value) {
            addCriterion("mg_state =", value, "mgState");
            return (Criteria) this;
        }

        public Criteria andMgStateNotEqualTo(Byte value) {
            addCriterion("mg_state <>", value, "mgState");
            return (Criteria) this;
        }

        public Criteria andMgStateGreaterThan(Byte value) {
            addCriterion("mg_state >", value, "mgState");
            return (Criteria) this;
        }

        public Criteria andMgStateGreaterThanOrEqualTo(Byte value) {
            addCriterion("mg_state >=", value, "mgState");
            return (Criteria) this;
        }

        public Criteria andMgStateLessThan(Byte value) {
            addCriterion("mg_state <", value, "mgState");
            return (Criteria) this;
        }

        public Criteria andMgStateLessThanOrEqualTo(Byte value) {
            addCriterion("mg_state <=", value, "mgState");
            return (Criteria) this;
        }

        public Criteria andMgStateIn(List<Byte> values) {
            addCriterion("mg_state in", values, "mgState");
            return (Criteria) this;
        }

        public Criteria andMgStateNotIn(List<Byte> values) {
            addCriterion("mg_state not in", values, "mgState");
            return (Criteria) this;
        }

        public Criteria andMgStateBetween(Byte value1, Byte value2) {
            addCriterion("mg_state between", value1, value2, "mgState");
            return (Criteria) this;
        }

        public Criteria andMgStateNotBetween(Byte value1, Byte value2) {
            addCriterion("mg_state not between", value1, value2, "mgState");
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