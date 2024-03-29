package com.lhx.mall.mbg.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class SpReport1Example {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public SpReport1Example() {
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

        protected void addCriterionForJDBCDate(String condition, Date value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            addCriterion(condition, new java.sql.Date(value.getTime()), property);
        }

        protected void addCriterionForJDBCDate(String condition, List<Date> values, String property) {
            if (values == null || values.size() == 0) {
                throw new RuntimeException("Value list for " + property + " cannot be null or empty");
            }
            List<java.sql.Date> dateList = new ArrayList<java.sql.Date>();
            Iterator<Date> iter = values.iterator();
            while (iter.hasNext()) {
                dateList.add(new java.sql.Date(iter.next().getTime()));
            }
            addCriterion(condition, dateList, property);
        }

        protected void addCriterionForJDBCDate(String condition, Date value1, Date value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            addCriterion(condition, new java.sql.Date(value1.getTime()), new java.sql.Date(value2.getTime()), property);
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

        public Criteria andRp1UserCountIsNull() {
            addCriterion("rp1_user_count is null");
            return (Criteria) this;
        }

        public Criteria andRp1UserCountIsNotNull() {
            addCriterion("rp1_user_count is not null");
            return (Criteria) this;
        }

        public Criteria andRp1UserCountEqualTo(Integer value) {
            addCriterion("rp1_user_count =", value, "rp1UserCount");
            return (Criteria) this;
        }

        public Criteria andRp1UserCountNotEqualTo(Integer value) {
            addCriterion("rp1_user_count <>", value, "rp1UserCount");
            return (Criteria) this;
        }

        public Criteria andRp1UserCountGreaterThan(Integer value) {
            addCriterion("rp1_user_count >", value, "rp1UserCount");
            return (Criteria) this;
        }

        public Criteria andRp1UserCountGreaterThanOrEqualTo(Integer value) {
            addCriterion("rp1_user_count >=", value, "rp1UserCount");
            return (Criteria) this;
        }

        public Criteria andRp1UserCountLessThan(Integer value) {
            addCriterion("rp1_user_count <", value, "rp1UserCount");
            return (Criteria) this;
        }

        public Criteria andRp1UserCountLessThanOrEqualTo(Integer value) {
            addCriterion("rp1_user_count <=", value, "rp1UserCount");
            return (Criteria) this;
        }

        public Criteria andRp1UserCountIn(List<Integer> values) {
            addCriterion("rp1_user_count in", values, "rp1UserCount");
            return (Criteria) this;
        }

        public Criteria andRp1UserCountNotIn(List<Integer> values) {
            addCriterion("rp1_user_count not in", values, "rp1UserCount");
            return (Criteria) this;
        }

        public Criteria andRp1UserCountBetween(Integer value1, Integer value2) {
            addCriterion("rp1_user_count between", value1, value2, "rp1UserCount");
            return (Criteria) this;
        }

        public Criteria andRp1UserCountNotBetween(Integer value1, Integer value2) {
            addCriterion("rp1_user_count not between", value1, value2, "rp1UserCount");
            return (Criteria) this;
        }

        public Criteria andRp1AreaIsNull() {
            addCriterion("rp1_area is null");
            return (Criteria) this;
        }

        public Criteria andRp1AreaIsNotNull() {
            addCriterion("rp1_area is not null");
            return (Criteria) this;
        }

        public Criteria andRp1AreaEqualTo(String value) {
            addCriterion("rp1_area =", value, "rp1Area");
            return (Criteria) this;
        }

        public Criteria andRp1AreaNotEqualTo(String value) {
            addCriterion("rp1_area <>", value, "rp1Area");
            return (Criteria) this;
        }

        public Criteria andRp1AreaGreaterThan(String value) {
            addCriterion("rp1_area >", value, "rp1Area");
            return (Criteria) this;
        }

        public Criteria andRp1AreaGreaterThanOrEqualTo(String value) {
            addCriterion("rp1_area >=", value, "rp1Area");
            return (Criteria) this;
        }

        public Criteria andRp1AreaLessThan(String value) {
            addCriterion("rp1_area <", value, "rp1Area");
            return (Criteria) this;
        }

        public Criteria andRp1AreaLessThanOrEqualTo(String value) {
            addCriterion("rp1_area <=", value, "rp1Area");
            return (Criteria) this;
        }

        public Criteria andRp1AreaLike(String value) {
            addCriterion("rp1_area like", value, "rp1Area");
            return (Criteria) this;
        }

        public Criteria andRp1AreaNotLike(String value) {
            addCriterion("rp1_area not like", value, "rp1Area");
            return (Criteria) this;
        }

        public Criteria andRp1AreaIn(List<String> values) {
            addCriterion("rp1_area in", values, "rp1Area");
            return (Criteria) this;
        }

        public Criteria andRp1AreaNotIn(List<String> values) {
            addCriterion("rp1_area not in", values, "rp1Area");
            return (Criteria) this;
        }

        public Criteria andRp1AreaBetween(String value1, String value2) {
            addCriterion("rp1_area between", value1, value2, "rp1Area");
            return (Criteria) this;
        }

        public Criteria andRp1AreaNotBetween(String value1, String value2) {
            addCriterion("rp1_area not between", value1, value2, "rp1Area");
            return (Criteria) this;
        }

        public Criteria andRp1DateIsNull() {
            addCriterion("rp1_date is null");
            return (Criteria) this;
        }

        public Criteria andRp1DateIsNotNull() {
            addCriterion("rp1_date is not null");
            return (Criteria) this;
        }

        public Criteria andRp1DateEqualTo(Date value) {
            addCriterionForJDBCDate("rp1_date =", value, "rp1Date");
            return (Criteria) this;
        }

        public Criteria andRp1DateNotEqualTo(Date value) {
            addCriterionForJDBCDate("rp1_date <>", value, "rp1Date");
            return (Criteria) this;
        }

        public Criteria andRp1DateGreaterThan(Date value) {
            addCriterionForJDBCDate("rp1_date >", value, "rp1Date");
            return (Criteria) this;
        }

        public Criteria andRp1DateGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("rp1_date >=", value, "rp1Date");
            return (Criteria) this;
        }

        public Criteria andRp1DateLessThan(Date value) {
            addCriterionForJDBCDate("rp1_date <", value, "rp1Date");
            return (Criteria) this;
        }

        public Criteria andRp1DateLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("rp1_date <=", value, "rp1Date");
            return (Criteria) this;
        }

        public Criteria andRp1DateIn(List<Date> values) {
            addCriterionForJDBCDate("rp1_date in", values, "rp1Date");
            return (Criteria) this;
        }

        public Criteria andRp1DateNotIn(List<Date> values) {
            addCriterionForJDBCDate("rp1_date not in", values, "rp1Date");
            return (Criteria) this;
        }

        public Criteria andRp1DateBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("rp1_date between", value1, value2, "rp1Date");
            return (Criteria) this;
        }

        public Criteria andRp1DateNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("rp1_date not between", value1, value2, "rp1Date");
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