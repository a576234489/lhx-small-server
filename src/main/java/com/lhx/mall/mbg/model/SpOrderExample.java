package com.lhx.mall.mbg.model;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class SpOrderExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public SpOrderExample() {
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

        public Criteria andOrderIdIsNull() {
            addCriterion("order_id is null");
            return (Criteria) this;
        }

        public Criteria andOrderIdIsNotNull() {
            addCriterion("order_id is not null");
            return (Criteria) this;
        }

        public Criteria andOrderIdEqualTo(Integer value) {
            addCriterion("order_id =", value, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdNotEqualTo(Integer value) {
            addCriterion("order_id <>", value, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdGreaterThan(Integer value) {
            addCriterion("order_id >", value, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("order_id >=", value, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdLessThan(Integer value) {
            addCriterion("order_id <", value, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdLessThanOrEqualTo(Integer value) {
            addCriterion("order_id <=", value, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdIn(List<Integer> values) {
            addCriterion("order_id in", values, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdNotIn(List<Integer> values) {
            addCriterion("order_id not in", values, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdBetween(Integer value1, Integer value2) {
            addCriterion("order_id between", value1, value2, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdNotBetween(Integer value1, Integer value2) {
            addCriterion("order_id not between", value1, value2, "orderId");
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

        public Criteria andOrderNumberIsNull() {
            addCriterion("order_number is null");
            return (Criteria) this;
        }

        public Criteria andOrderNumberIsNotNull() {
            addCriterion("order_number is not null");
            return (Criteria) this;
        }

        public Criteria andOrderNumberEqualTo(String value) {
            addCriterion("order_number =", value, "orderNumber");
            return (Criteria) this;
        }

        public Criteria andOrderNumberNotEqualTo(String value) {
            addCriterion("order_number <>", value, "orderNumber");
            return (Criteria) this;
        }

        public Criteria andOrderNumberGreaterThan(String value) {
            addCriterion("order_number >", value, "orderNumber");
            return (Criteria) this;
        }

        public Criteria andOrderNumberGreaterThanOrEqualTo(String value) {
            addCriterion("order_number >=", value, "orderNumber");
            return (Criteria) this;
        }

        public Criteria andOrderNumberLessThan(String value) {
            addCriterion("order_number <", value, "orderNumber");
            return (Criteria) this;
        }

        public Criteria andOrderNumberLessThanOrEqualTo(String value) {
            addCriterion("order_number <=", value, "orderNumber");
            return (Criteria) this;
        }

        public Criteria andOrderNumberLike(String value) {
            addCriterion("order_number like", value, "orderNumber");
            return (Criteria) this;
        }

        public Criteria andOrderNumberNotLike(String value) {
            addCriterion("order_number not like", value, "orderNumber");
            return (Criteria) this;
        }

        public Criteria andOrderNumberIn(List<String> values) {
            addCriterion("order_number in", values, "orderNumber");
            return (Criteria) this;
        }

        public Criteria andOrderNumberNotIn(List<String> values) {
            addCriterion("order_number not in", values, "orderNumber");
            return (Criteria) this;
        }

        public Criteria andOrderNumberBetween(String value1, String value2) {
            addCriterion("order_number between", value1, value2, "orderNumber");
            return (Criteria) this;
        }

        public Criteria andOrderNumberNotBetween(String value1, String value2) {
            addCriterion("order_number not between", value1, value2, "orderNumber");
            return (Criteria) this;
        }

        public Criteria andOrderPriceIsNull() {
            addCriterion("order_price is null");
            return (Criteria) this;
        }

        public Criteria andOrderPriceIsNotNull() {
            addCriterion("order_price is not null");
            return (Criteria) this;
        }

        public Criteria andOrderPriceEqualTo(BigDecimal value) {
            addCriterion("order_price =", value, "orderPrice");
            return (Criteria) this;
        }

        public Criteria andOrderPriceNotEqualTo(BigDecimal value) {
            addCriterion("order_price <>", value, "orderPrice");
            return (Criteria) this;
        }

        public Criteria andOrderPriceGreaterThan(BigDecimal value) {
            addCriterion("order_price >", value, "orderPrice");
            return (Criteria) this;
        }

        public Criteria andOrderPriceGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("order_price >=", value, "orderPrice");
            return (Criteria) this;
        }

        public Criteria andOrderPriceLessThan(BigDecimal value) {
            addCriterion("order_price <", value, "orderPrice");
            return (Criteria) this;
        }

        public Criteria andOrderPriceLessThanOrEqualTo(BigDecimal value) {
            addCriterion("order_price <=", value, "orderPrice");
            return (Criteria) this;
        }

        public Criteria andOrderPriceIn(List<BigDecimal> values) {
            addCriterion("order_price in", values, "orderPrice");
            return (Criteria) this;
        }

        public Criteria andOrderPriceNotIn(List<BigDecimal> values) {
            addCriterion("order_price not in", values, "orderPrice");
            return (Criteria) this;
        }

        public Criteria andOrderPriceBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("order_price between", value1, value2, "orderPrice");
            return (Criteria) this;
        }

        public Criteria andOrderPriceNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("order_price not between", value1, value2, "orderPrice");
            return (Criteria) this;
        }

        public Criteria andOrderPayIsNull() {
            addCriterion("order_pay is null");
            return (Criteria) this;
        }

        public Criteria andOrderPayIsNotNull() {
            addCriterion("order_pay is not null");
            return (Criteria) this;
        }

        public Criteria andOrderPayEqualTo(String value) {
            addCriterion("order_pay =", value, "orderPay");
            return (Criteria) this;
        }

        public Criteria andOrderPayNotEqualTo(String value) {
            addCriterion("order_pay <>", value, "orderPay");
            return (Criteria) this;
        }

        public Criteria andOrderPayGreaterThan(String value) {
            addCriterion("order_pay >", value, "orderPay");
            return (Criteria) this;
        }

        public Criteria andOrderPayGreaterThanOrEqualTo(String value) {
            addCriterion("order_pay >=", value, "orderPay");
            return (Criteria) this;
        }

        public Criteria andOrderPayLessThan(String value) {
            addCriterion("order_pay <", value, "orderPay");
            return (Criteria) this;
        }

        public Criteria andOrderPayLessThanOrEqualTo(String value) {
            addCriterion("order_pay <=", value, "orderPay");
            return (Criteria) this;
        }

        public Criteria andOrderPayLike(String value) {
            addCriterion("order_pay like", value, "orderPay");
            return (Criteria) this;
        }

        public Criteria andOrderPayNotLike(String value) {
            addCriterion("order_pay not like", value, "orderPay");
            return (Criteria) this;
        }

        public Criteria andOrderPayIn(List<String> values) {
            addCriterion("order_pay in", values, "orderPay");
            return (Criteria) this;
        }

        public Criteria andOrderPayNotIn(List<String> values) {
            addCriterion("order_pay not in", values, "orderPay");
            return (Criteria) this;
        }

        public Criteria andOrderPayBetween(String value1, String value2) {
            addCriterion("order_pay between", value1, value2, "orderPay");
            return (Criteria) this;
        }

        public Criteria andOrderPayNotBetween(String value1, String value2) {
            addCriterion("order_pay not between", value1, value2, "orderPay");
            return (Criteria) this;
        }

        public Criteria andIsSendIsNull() {
            addCriterion("is_send is null");
            return (Criteria) this;
        }

        public Criteria andIsSendIsNotNull() {
            addCriterion("is_send is not null");
            return (Criteria) this;
        }

        public Criteria andIsSendEqualTo(String value) {
            addCriterion("is_send =", value, "isSend");
            return (Criteria) this;
        }

        public Criteria andIsSendNotEqualTo(String value) {
            addCriterion("is_send <>", value, "isSend");
            return (Criteria) this;
        }

        public Criteria andIsSendGreaterThan(String value) {
            addCriterion("is_send >", value, "isSend");
            return (Criteria) this;
        }

        public Criteria andIsSendGreaterThanOrEqualTo(String value) {
            addCriterion("is_send >=", value, "isSend");
            return (Criteria) this;
        }

        public Criteria andIsSendLessThan(String value) {
            addCriterion("is_send <", value, "isSend");
            return (Criteria) this;
        }

        public Criteria andIsSendLessThanOrEqualTo(String value) {
            addCriterion("is_send <=", value, "isSend");
            return (Criteria) this;
        }

        public Criteria andIsSendLike(String value) {
            addCriterion("is_send like", value, "isSend");
            return (Criteria) this;
        }

        public Criteria andIsSendNotLike(String value) {
            addCriterion("is_send not like", value, "isSend");
            return (Criteria) this;
        }

        public Criteria andIsSendIn(List<String> values) {
            addCriterion("is_send in", values, "isSend");
            return (Criteria) this;
        }

        public Criteria andIsSendNotIn(List<String> values) {
            addCriterion("is_send not in", values, "isSend");
            return (Criteria) this;
        }

        public Criteria andIsSendBetween(String value1, String value2) {
            addCriterion("is_send between", value1, value2, "isSend");
            return (Criteria) this;
        }

        public Criteria andIsSendNotBetween(String value1, String value2) {
            addCriterion("is_send not between", value1, value2, "isSend");
            return (Criteria) this;
        }

        public Criteria andTradeNoIsNull() {
            addCriterion("trade_no is null");
            return (Criteria) this;
        }

        public Criteria andTradeNoIsNotNull() {
            addCriterion("trade_no is not null");
            return (Criteria) this;
        }

        public Criteria andTradeNoEqualTo(String value) {
            addCriterion("trade_no =", value, "tradeNo");
            return (Criteria) this;
        }

        public Criteria andTradeNoNotEqualTo(String value) {
            addCriterion("trade_no <>", value, "tradeNo");
            return (Criteria) this;
        }

        public Criteria andTradeNoGreaterThan(String value) {
            addCriterion("trade_no >", value, "tradeNo");
            return (Criteria) this;
        }

        public Criteria andTradeNoGreaterThanOrEqualTo(String value) {
            addCriterion("trade_no >=", value, "tradeNo");
            return (Criteria) this;
        }

        public Criteria andTradeNoLessThan(String value) {
            addCriterion("trade_no <", value, "tradeNo");
            return (Criteria) this;
        }

        public Criteria andTradeNoLessThanOrEqualTo(String value) {
            addCriterion("trade_no <=", value, "tradeNo");
            return (Criteria) this;
        }

        public Criteria andTradeNoLike(String value) {
            addCriterion("trade_no like", value, "tradeNo");
            return (Criteria) this;
        }

        public Criteria andTradeNoNotLike(String value) {
            addCriterion("trade_no not like", value, "tradeNo");
            return (Criteria) this;
        }

        public Criteria andTradeNoIn(List<String> values) {
            addCriterion("trade_no in", values, "tradeNo");
            return (Criteria) this;
        }

        public Criteria andTradeNoNotIn(List<String> values) {
            addCriterion("trade_no not in", values, "tradeNo");
            return (Criteria) this;
        }

        public Criteria andTradeNoBetween(String value1, String value2) {
            addCriterion("trade_no between", value1, value2, "tradeNo");
            return (Criteria) this;
        }

        public Criteria andTradeNoNotBetween(String value1, String value2) {
            addCriterion("trade_no not between", value1, value2, "tradeNo");
            return (Criteria) this;
        }

        public Criteria andOrderFapiaoTitleIsNull() {
            addCriterion("order_fapiao_title is null");
            return (Criteria) this;
        }

        public Criteria andOrderFapiaoTitleIsNotNull() {
            addCriterion("order_fapiao_title is not null");
            return (Criteria) this;
        }

        public Criteria andOrderFapiaoTitleEqualTo(String value) {
            addCriterion("order_fapiao_title =", value, "orderFapiaoTitle");
            return (Criteria) this;
        }

        public Criteria andOrderFapiaoTitleNotEqualTo(String value) {
            addCriterion("order_fapiao_title <>", value, "orderFapiaoTitle");
            return (Criteria) this;
        }

        public Criteria andOrderFapiaoTitleGreaterThan(String value) {
            addCriterion("order_fapiao_title >", value, "orderFapiaoTitle");
            return (Criteria) this;
        }

        public Criteria andOrderFapiaoTitleGreaterThanOrEqualTo(String value) {
            addCriterion("order_fapiao_title >=", value, "orderFapiaoTitle");
            return (Criteria) this;
        }

        public Criteria andOrderFapiaoTitleLessThan(String value) {
            addCriterion("order_fapiao_title <", value, "orderFapiaoTitle");
            return (Criteria) this;
        }

        public Criteria andOrderFapiaoTitleLessThanOrEqualTo(String value) {
            addCriterion("order_fapiao_title <=", value, "orderFapiaoTitle");
            return (Criteria) this;
        }

        public Criteria andOrderFapiaoTitleLike(String value) {
            addCriterion("order_fapiao_title like", value, "orderFapiaoTitle");
            return (Criteria) this;
        }

        public Criteria andOrderFapiaoTitleNotLike(String value) {
            addCriterion("order_fapiao_title not like", value, "orderFapiaoTitle");
            return (Criteria) this;
        }

        public Criteria andOrderFapiaoTitleIn(List<String> values) {
            addCriterion("order_fapiao_title in", values, "orderFapiaoTitle");
            return (Criteria) this;
        }

        public Criteria andOrderFapiaoTitleNotIn(List<String> values) {
            addCriterion("order_fapiao_title not in", values, "orderFapiaoTitle");
            return (Criteria) this;
        }

        public Criteria andOrderFapiaoTitleBetween(String value1, String value2) {
            addCriterion("order_fapiao_title between", value1, value2, "orderFapiaoTitle");
            return (Criteria) this;
        }

        public Criteria andOrderFapiaoTitleNotBetween(String value1, String value2) {
            addCriterion("order_fapiao_title not between", value1, value2, "orderFapiaoTitle");
            return (Criteria) this;
        }

        public Criteria andOrderFapiaoCompanyIsNull() {
            addCriterion("order_fapiao_company is null");
            return (Criteria) this;
        }

        public Criteria andOrderFapiaoCompanyIsNotNull() {
            addCriterion("order_fapiao_company is not null");
            return (Criteria) this;
        }

        public Criteria andOrderFapiaoCompanyEqualTo(String value) {
            addCriterion("order_fapiao_company =", value, "orderFapiaoCompany");
            return (Criteria) this;
        }

        public Criteria andOrderFapiaoCompanyNotEqualTo(String value) {
            addCriterion("order_fapiao_company <>", value, "orderFapiaoCompany");
            return (Criteria) this;
        }

        public Criteria andOrderFapiaoCompanyGreaterThan(String value) {
            addCriterion("order_fapiao_company >", value, "orderFapiaoCompany");
            return (Criteria) this;
        }

        public Criteria andOrderFapiaoCompanyGreaterThanOrEqualTo(String value) {
            addCriterion("order_fapiao_company >=", value, "orderFapiaoCompany");
            return (Criteria) this;
        }

        public Criteria andOrderFapiaoCompanyLessThan(String value) {
            addCriterion("order_fapiao_company <", value, "orderFapiaoCompany");
            return (Criteria) this;
        }

        public Criteria andOrderFapiaoCompanyLessThanOrEqualTo(String value) {
            addCriterion("order_fapiao_company <=", value, "orderFapiaoCompany");
            return (Criteria) this;
        }

        public Criteria andOrderFapiaoCompanyLike(String value) {
            addCriterion("order_fapiao_company like", value, "orderFapiaoCompany");
            return (Criteria) this;
        }

        public Criteria andOrderFapiaoCompanyNotLike(String value) {
            addCriterion("order_fapiao_company not like", value, "orderFapiaoCompany");
            return (Criteria) this;
        }

        public Criteria andOrderFapiaoCompanyIn(List<String> values) {
            addCriterion("order_fapiao_company in", values, "orderFapiaoCompany");
            return (Criteria) this;
        }

        public Criteria andOrderFapiaoCompanyNotIn(List<String> values) {
            addCriterion("order_fapiao_company not in", values, "orderFapiaoCompany");
            return (Criteria) this;
        }

        public Criteria andOrderFapiaoCompanyBetween(String value1, String value2) {
            addCriterion("order_fapiao_company between", value1, value2, "orderFapiaoCompany");
            return (Criteria) this;
        }

        public Criteria andOrderFapiaoCompanyNotBetween(String value1, String value2) {
            addCriterion("order_fapiao_company not between", value1, value2, "orderFapiaoCompany");
            return (Criteria) this;
        }

        public Criteria andOrderFapiaoContentIsNull() {
            addCriterion("order_fapiao_content is null");
            return (Criteria) this;
        }

        public Criteria andOrderFapiaoContentIsNotNull() {
            addCriterion("order_fapiao_content is not null");
            return (Criteria) this;
        }

        public Criteria andOrderFapiaoContentEqualTo(String value) {
            addCriterion("order_fapiao_content =", value, "orderFapiaoContent");
            return (Criteria) this;
        }

        public Criteria andOrderFapiaoContentNotEqualTo(String value) {
            addCriterion("order_fapiao_content <>", value, "orderFapiaoContent");
            return (Criteria) this;
        }

        public Criteria andOrderFapiaoContentGreaterThan(String value) {
            addCriterion("order_fapiao_content >", value, "orderFapiaoContent");
            return (Criteria) this;
        }

        public Criteria andOrderFapiaoContentGreaterThanOrEqualTo(String value) {
            addCriterion("order_fapiao_content >=", value, "orderFapiaoContent");
            return (Criteria) this;
        }

        public Criteria andOrderFapiaoContentLessThan(String value) {
            addCriterion("order_fapiao_content <", value, "orderFapiaoContent");
            return (Criteria) this;
        }

        public Criteria andOrderFapiaoContentLessThanOrEqualTo(String value) {
            addCriterion("order_fapiao_content <=", value, "orderFapiaoContent");
            return (Criteria) this;
        }

        public Criteria andOrderFapiaoContentLike(String value) {
            addCriterion("order_fapiao_content like", value, "orderFapiaoContent");
            return (Criteria) this;
        }

        public Criteria andOrderFapiaoContentNotLike(String value) {
            addCriterion("order_fapiao_content not like", value, "orderFapiaoContent");
            return (Criteria) this;
        }

        public Criteria andOrderFapiaoContentIn(List<String> values) {
            addCriterion("order_fapiao_content in", values, "orderFapiaoContent");
            return (Criteria) this;
        }

        public Criteria andOrderFapiaoContentNotIn(List<String> values) {
            addCriterion("order_fapiao_content not in", values, "orderFapiaoContent");
            return (Criteria) this;
        }

        public Criteria andOrderFapiaoContentBetween(String value1, String value2) {
            addCriterion("order_fapiao_content between", value1, value2, "orderFapiaoContent");
            return (Criteria) this;
        }

        public Criteria andOrderFapiaoContentNotBetween(String value1, String value2) {
            addCriterion("order_fapiao_content not between", value1, value2, "orderFapiaoContent");
            return (Criteria) this;
        }

        public Criteria andPayStatusIsNull() {
            addCriterion("pay_status is null");
            return (Criteria) this;
        }

        public Criteria andPayStatusIsNotNull() {
            addCriterion("pay_status is not null");
            return (Criteria) this;
        }

        public Criteria andPayStatusEqualTo(String value) {
            addCriterion("pay_status =", value, "payStatus");
            return (Criteria) this;
        }

        public Criteria andPayStatusNotEqualTo(String value) {
            addCriterion("pay_status <>", value, "payStatus");
            return (Criteria) this;
        }

        public Criteria andPayStatusGreaterThan(String value) {
            addCriterion("pay_status >", value, "payStatus");
            return (Criteria) this;
        }

        public Criteria andPayStatusGreaterThanOrEqualTo(String value) {
            addCriterion("pay_status >=", value, "payStatus");
            return (Criteria) this;
        }

        public Criteria andPayStatusLessThan(String value) {
            addCriterion("pay_status <", value, "payStatus");
            return (Criteria) this;
        }

        public Criteria andPayStatusLessThanOrEqualTo(String value) {
            addCriterion("pay_status <=", value, "payStatus");
            return (Criteria) this;
        }

        public Criteria andPayStatusLike(String value) {
            addCriterion("pay_status like", value, "payStatus");
            return (Criteria) this;
        }

        public Criteria andPayStatusNotLike(String value) {
            addCriterion("pay_status not like", value, "payStatus");
            return (Criteria) this;
        }

        public Criteria andPayStatusIn(List<String> values) {
            addCriterion("pay_status in", values, "payStatus");
            return (Criteria) this;
        }

        public Criteria andPayStatusNotIn(List<String> values) {
            addCriterion("pay_status not in", values, "payStatus");
            return (Criteria) this;
        }

        public Criteria andPayStatusBetween(String value1, String value2) {
            addCriterion("pay_status between", value1, value2, "payStatus");
            return (Criteria) this;
        }

        public Criteria andPayStatusNotBetween(String value1, String value2) {
            addCriterion("pay_status not between", value1, value2, "payStatus");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIsNull() {
            addCriterion("create_time is null");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIsNotNull() {
            addCriterion("create_time is not null");
            return (Criteria) this;
        }

        public Criteria andCreateTimeEqualTo(Integer value) {
            addCriterion("create_time =", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotEqualTo(Integer value) {
            addCriterion("create_time <>", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeGreaterThan(Integer value) {
            addCriterion("create_time >", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeGreaterThanOrEqualTo(Integer value) {
            addCriterion("create_time >=", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeLessThan(Integer value) {
            addCriterion("create_time <", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeLessThanOrEqualTo(Integer value) {
            addCriterion("create_time <=", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIn(List<Integer> values) {
            addCriterion("create_time in", values, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotIn(List<Integer> values) {
            addCriterion("create_time not in", values, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeBetween(Integer value1, Integer value2) {
            addCriterion("create_time between", value1, value2, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotBetween(Integer value1, Integer value2) {
            addCriterion("create_time not between", value1, value2, "createTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeIsNull() {
            addCriterion("update_time is null");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeIsNotNull() {
            addCriterion("update_time is not null");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeEqualTo(Integer value) {
            addCriterion("update_time =", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeNotEqualTo(Integer value) {
            addCriterion("update_time <>", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeGreaterThan(Integer value) {
            addCriterion("update_time >", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeGreaterThanOrEqualTo(Integer value) {
            addCriterion("update_time >=", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeLessThan(Integer value) {
            addCriterion("update_time <", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeLessThanOrEqualTo(Integer value) {
            addCriterion("update_time <=", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeIn(List<Integer> values) {
            addCriterion("update_time in", values, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeNotIn(List<Integer> values) {
            addCriterion("update_time not in", values, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeBetween(Integer value1, Integer value2) {
            addCriterion("update_time between", value1, value2, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeNotBetween(Integer value1, Integer value2) {
            addCriterion("update_time not between", value1, value2, "updateTime");
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