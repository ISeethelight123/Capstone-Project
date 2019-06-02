package com.qyqjava.pojo;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class OrdersExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public OrdersExample() {
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

        public Criteria andOrderMailnameIsNull() {
            addCriterion("order_mailName is null");
            return (Criteria) this;
        }

        public Criteria andOrderMailnameIsNotNull() {
            addCriterion("order_mailName is not null");
            return (Criteria) this;
        }

        public Criteria andOrderMailnameEqualTo(String value) {
            addCriterion("order_mailName =", value, "orderMailname");
            return (Criteria) this;
        }

        public Criteria andOrderMailnameNotEqualTo(String value) {
            addCriterion("order_mailName <>", value, "orderMailname");
            return (Criteria) this;
        }

        public Criteria andOrderMailnameGreaterThan(String value) {
            addCriterion("order_mailName >", value, "orderMailname");
            return (Criteria) this;
        }

        public Criteria andOrderMailnameGreaterThanOrEqualTo(String value) {
            addCriterion("order_mailName >=", value, "orderMailname");
            return (Criteria) this;
        }

        public Criteria andOrderMailnameLessThan(String value) {
            addCriterion("order_mailName <", value, "orderMailname");
            return (Criteria) this;
        }

        public Criteria andOrderMailnameLessThanOrEqualTo(String value) {
            addCriterion("order_mailName <=", value, "orderMailname");
            return (Criteria) this;
        }

        public Criteria andOrderMailnameLike(String value) {
            addCriterion("order_mailName like", value, "orderMailname");
            return (Criteria) this;
        }

        public Criteria andOrderMailnameNotLike(String value) {
            addCriterion("order_mailName not like", value, "orderMailname");
            return (Criteria) this;
        }

        public Criteria andOrderMailnameIn(List<String> values) {
            addCriterion("order_mailName in", values, "orderMailname");
            return (Criteria) this;
        }

        public Criteria andOrderMailnameNotIn(List<String> values) {
            addCriterion("order_mailName not in", values, "orderMailname");
            return (Criteria) this;
        }

        public Criteria andOrderMailnameBetween(String value1, String value2) {
            addCriterion("order_mailName between", value1, value2, "orderMailname");
            return (Criteria) this;
        }

        public Criteria andOrderMailnameNotBetween(String value1, String value2) {
            addCriterion("order_mailName not between", value1, value2, "orderMailname");
            return (Criteria) this;
        }

        public Criteria andOrderMailphoneIsNull() {
            addCriterion("order_mailPhone is null");
            return (Criteria) this;
        }

        public Criteria andOrderMailphoneIsNotNull() {
            addCriterion("order_mailPhone is not null");
            return (Criteria) this;
        }

        public Criteria andOrderMailphoneEqualTo(String value) {
            addCriterion("order_mailPhone =", value, "orderMailphone");
            return (Criteria) this;
        }

        public Criteria andOrderMailphoneNotEqualTo(String value) {
            addCriterion("order_mailPhone <>", value, "orderMailphone");
            return (Criteria) this;
        }

        public Criteria andOrderMailphoneGreaterThan(String value) {
            addCriterion("order_mailPhone >", value, "orderMailphone");
            return (Criteria) this;
        }

        public Criteria andOrderMailphoneGreaterThanOrEqualTo(String value) {
            addCriterion("order_mailPhone >=", value, "orderMailphone");
            return (Criteria) this;
        }

        public Criteria andOrderMailphoneLessThan(String value) {
            addCriterion("order_mailPhone <", value, "orderMailphone");
            return (Criteria) this;
        }

        public Criteria andOrderMailphoneLessThanOrEqualTo(String value) {
            addCriterion("order_mailPhone <=", value, "orderMailphone");
            return (Criteria) this;
        }

        public Criteria andOrderMailphoneLike(String value) {
            addCriterion("order_mailPhone like", value, "orderMailphone");
            return (Criteria) this;
        }

        public Criteria andOrderMailphoneNotLike(String value) {
            addCriterion("order_mailPhone not like", value, "orderMailphone");
            return (Criteria) this;
        }

        public Criteria andOrderMailphoneIn(List<String> values) {
            addCriterion("order_mailPhone in", values, "orderMailphone");
            return (Criteria) this;
        }

        public Criteria andOrderMailphoneNotIn(List<String> values) {
            addCriterion("order_mailPhone not in", values, "orderMailphone");
            return (Criteria) this;
        }

        public Criteria andOrderMailphoneBetween(String value1, String value2) {
            addCriterion("order_mailPhone between", value1, value2, "orderMailphone");
            return (Criteria) this;
        }

        public Criteria andOrderMailphoneNotBetween(String value1, String value2) {
            addCriterion("order_mailPhone not between", value1, value2, "orderMailphone");
            return (Criteria) this;
        }

        public Criteria andOrderMailaddressIsNull() {
            addCriterion("order_mailAddress is null");
            return (Criteria) this;
        }

        public Criteria andOrderMailaddressIsNotNull() {
            addCriterion("order_mailAddress is not null");
            return (Criteria) this;
        }

        public Criteria andOrderMailaddressEqualTo(String value) {
            addCriterion("order_mailAddress =", value, "orderMailaddress");
            return (Criteria) this;
        }

        public Criteria andOrderMailaddressNotEqualTo(String value) {
            addCriterion("order_mailAddress <>", value, "orderMailaddress");
            return (Criteria) this;
        }

        public Criteria andOrderMailaddressGreaterThan(String value) {
            addCriterion("order_mailAddress >", value, "orderMailaddress");
            return (Criteria) this;
        }

        public Criteria andOrderMailaddressGreaterThanOrEqualTo(String value) {
            addCriterion("order_mailAddress >=", value, "orderMailaddress");
            return (Criteria) this;
        }

        public Criteria andOrderMailaddressLessThan(String value) {
            addCriterion("order_mailAddress <", value, "orderMailaddress");
            return (Criteria) this;
        }

        public Criteria andOrderMailaddressLessThanOrEqualTo(String value) {
            addCriterion("order_mailAddress <=", value, "orderMailaddress");
            return (Criteria) this;
        }

        public Criteria andOrderMailaddressLike(String value) {
            addCriterion("order_mailAddress like", value, "orderMailaddress");
            return (Criteria) this;
        }

        public Criteria andOrderMailaddressNotLike(String value) {
            addCriterion("order_mailAddress not like", value, "orderMailaddress");
            return (Criteria) this;
        }

        public Criteria andOrderMailaddressIn(List<String> values) {
            addCriterion("order_mailAddress in", values, "orderMailaddress");
            return (Criteria) this;
        }

        public Criteria andOrderMailaddressNotIn(List<String> values) {
            addCriterion("order_mailAddress not in", values, "orderMailaddress");
            return (Criteria) this;
        }

        public Criteria andOrderMailaddressBetween(String value1, String value2) {
            addCriterion("order_mailAddress between", value1, value2, "orderMailaddress");
            return (Criteria) this;
        }

        public Criteria andOrderMailaddressNotBetween(String value1, String value2) {
            addCriterion("order_mailAddress not between", value1, value2, "orderMailaddress");
            return (Criteria) this;
        }

        public Criteria andRecipientsIdIsNull() {
            addCriterion("recipients_id is null");
            return (Criteria) this;
        }

        public Criteria andRecipientsIdIsNotNull() {
            addCriterion("recipients_id is not null");
            return (Criteria) this;
        }

        public Criteria andRecipientsIdEqualTo(Integer value) {
            addCriterion("recipients_id =", value, "recipientsId");
            return (Criteria) this;
        }

        public Criteria andRecipientsIdNotEqualTo(Integer value) {
            addCriterion("recipients_id <>", value, "recipientsId");
            return (Criteria) this;
        }

        public Criteria andRecipientsIdGreaterThan(Integer value) {
            addCriterion("recipients_id >", value, "recipientsId");
            return (Criteria) this;
        }

        public Criteria andRecipientsIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("recipients_id >=", value, "recipientsId");
            return (Criteria) this;
        }

        public Criteria andRecipientsIdLessThan(Integer value) {
            addCriterion("recipients_id <", value, "recipientsId");
            return (Criteria) this;
        }

        public Criteria andRecipientsIdLessThanOrEqualTo(Integer value) {
            addCriterion("recipients_id <=", value, "recipientsId");
            return (Criteria) this;
        }

        public Criteria andRecipientsIdIn(List<Integer> values) {
            addCriterion("recipients_id in", values, "recipientsId");
            return (Criteria) this;
        }

        public Criteria andRecipientsIdNotIn(List<Integer> values) {
            addCriterion("recipients_id not in", values, "recipientsId");
            return (Criteria) this;
        }

        public Criteria andRecipientsIdBetween(Integer value1, Integer value2) {
            addCriterion("recipients_id between", value1, value2, "recipientsId");
            return (Criteria) this;
        }

        public Criteria andRecipientsIdNotBetween(Integer value1, Integer value2) {
            addCriterion("recipients_id not between", value1, value2, "recipientsId");
            return (Criteria) this;
        }

        public Criteria andOrderTimeIsNull() {
            addCriterion("order_time is null");
            return (Criteria) this;
        }

        public Criteria andOrderTimeIsNotNull() {
            addCriterion("order_time is not null");
            return (Criteria) this;
        }

        public Criteria andOrderTimeEqualTo(Date value) {
            addCriterionForJDBCDate("order_time =", value, "orderTime");
            return (Criteria) this;
        }

        public Criteria andOrderTimeNotEqualTo(Date value) {
            addCriterionForJDBCDate("order_time <>", value, "orderTime");
            return (Criteria) this;
        }

        public Criteria andOrderTimeGreaterThan(Date value) {
            addCriterionForJDBCDate("order_time >", value, "orderTime");
            return (Criteria) this;
        }

        public Criteria andOrderTimeGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("order_time >=", value, "orderTime");
            return (Criteria) this;
        }

        public Criteria andOrderTimeLessThan(Date value) {
            addCriterionForJDBCDate("order_time <", value, "orderTime");
            return (Criteria) this;
        }

        public Criteria andOrderTimeLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("order_time <=", value, "orderTime");
            return (Criteria) this;
        }

        public Criteria andOrderTimeIn(List<Date> values) {
            addCriterionForJDBCDate("order_time in", values, "orderTime");
            return (Criteria) this;
        }

        public Criteria andOrderTimeNotIn(List<Date> values) {
            addCriterionForJDBCDate("order_time not in", values, "orderTime");
            return (Criteria) this;
        }

        public Criteria andOrderTimeBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("order_time between", value1, value2, "orderTime");
            return (Criteria) this;
        }

        public Criteria andOrderTimeNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("order_time not between", value1, value2, "orderTime");
            return (Criteria) this;
        }

        public Criteria andOrderWeightIsNull() {
            addCriterion("order_weight is null");
            return (Criteria) this;
        }

        public Criteria andOrderWeightIsNotNull() {
            addCriterion("order_weight is not null");
            return (Criteria) this;
        }

        public Criteria andOrderWeightEqualTo(String value) {
            addCriterion("order_weight =", value, "orderWeight");
            return (Criteria) this;
        }

        public Criteria andOrderWeightNotEqualTo(String value) {
            addCriterion("order_weight <>", value, "orderWeight");
            return (Criteria) this;
        }

        public Criteria andOrderWeightGreaterThan(String value) {
            addCriterion("order_weight >", value, "orderWeight");
            return (Criteria) this;
        }

        public Criteria andOrderWeightGreaterThanOrEqualTo(String value) {
            addCriterion("order_weight >=", value, "orderWeight");
            return (Criteria) this;
        }

        public Criteria andOrderWeightLessThan(String value) {
            addCriterion("order_weight <", value, "orderWeight");
            return (Criteria) this;
        }

        public Criteria andOrderWeightLessThanOrEqualTo(String value) {
            addCriterion("order_weight <=", value, "orderWeight");
            return (Criteria) this;
        }

        public Criteria andOrderWeightLike(String value) {
            addCriterion("order_weight like", value, "orderWeight");
            return (Criteria) this;
        }

        public Criteria andOrderWeightNotLike(String value) {
            addCriterion("order_weight not like", value, "orderWeight");
            return (Criteria) this;
        }

        public Criteria andOrderWeightIn(List<String> values) {
            addCriterion("order_weight in", values, "orderWeight");
            return (Criteria) this;
        }

        public Criteria andOrderWeightNotIn(List<String> values) {
            addCriterion("order_weight not in", values, "orderWeight");
            return (Criteria) this;
        }

        public Criteria andOrderWeightBetween(String value1, String value2) {
            addCriterion("order_weight between", value1, value2, "orderWeight");
            return (Criteria) this;
        }

        public Criteria andOrderWeightNotBetween(String value1, String value2) {
            addCriterion("order_weight not between", value1, value2, "orderWeight");
            return (Criteria) this;
        }

        public Criteria andOrderTypeIsNull() {
            addCriterion("order_type is null");
            return (Criteria) this;
        }

        public Criteria andOrderTypeIsNotNull() {
            addCriterion("order_type is not null");
            return (Criteria) this;
        }

        public Criteria andOrderTypeEqualTo(String value) {
            addCriterion("order_type =", value, "orderType");
            return (Criteria) this;
        }

        public Criteria andOrderTypeNotEqualTo(String value) {
            addCriterion("order_type <>", value, "orderType");
            return (Criteria) this;
        }

        public Criteria andOrderTypeGreaterThan(String value) {
            addCriterion("order_type >", value, "orderType");
            return (Criteria) this;
        }

        public Criteria andOrderTypeGreaterThanOrEqualTo(String value) {
            addCriterion("order_type >=", value, "orderType");
            return (Criteria) this;
        }

        public Criteria andOrderTypeLessThan(String value) {
            addCriterion("order_type <", value, "orderType");
            return (Criteria) this;
        }

        public Criteria andOrderTypeLessThanOrEqualTo(String value) {
            addCriterion("order_type <=", value, "orderType");
            return (Criteria) this;
        }

        public Criteria andOrderTypeLike(String value) {
            addCriterion("order_type like", value, "orderType");
            return (Criteria) this;
        }

        public Criteria andOrderTypeNotLike(String value) {
            addCriterion("order_type not like", value, "orderType");
            return (Criteria) this;
        }

        public Criteria andOrderTypeIn(List<String> values) {
            addCriterion("order_type in", values, "orderType");
            return (Criteria) this;
        }

        public Criteria andOrderTypeNotIn(List<String> values) {
            addCriterion("order_type not in", values, "orderType");
            return (Criteria) this;
        }

        public Criteria andOrderTypeBetween(String value1, String value2) {
            addCriterion("order_type between", value1, value2, "orderType");
            return (Criteria) this;
        }

        public Criteria andOrderTypeNotBetween(String value1, String value2) {
            addCriterion("order_type not between", value1, value2, "orderType");
            return (Criteria) this;
        }

        public Criteria andOrderMoneyIsNull() {
            addCriterion("order_money is null");
            return (Criteria) this;
        }

        public Criteria andOrderMoneyIsNotNull() {
            addCriterion("order_money is not null");
            return (Criteria) this;
        }

        public Criteria andOrderMoneyEqualTo(String value) {
            addCriterion("order_money =", value, "orderMoney");
            return (Criteria) this;
        }

        public Criteria andOrderMoneyNotEqualTo(String value) {
            addCriterion("order_money <>", value, "orderMoney");
            return (Criteria) this;
        }

        public Criteria andOrderMoneyGreaterThan(String value) {
            addCriterion("order_money >", value, "orderMoney");
            return (Criteria) this;
        }

        public Criteria andOrderMoneyGreaterThanOrEqualTo(String value) {
            addCriterion("order_money >=", value, "orderMoney");
            return (Criteria) this;
        }

        public Criteria andOrderMoneyLessThan(String value) {
            addCriterion("order_money <", value, "orderMoney");
            return (Criteria) this;
        }

        public Criteria andOrderMoneyLessThanOrEqualTo(String value) {
            addCriterion("order_money <=", value, "orderMoney");
            return (Criteria) this;
        }

        public Criteria andOrderMoneyLike(String value) {
            addCriterion("order_money like", value, "orderMoney");
            return (Criteria) this;
        }

        public Criteria andOrderMoneyNotLike(String value) {
            addCriterion("order_money not like", value, "orderMoney");
            return (Criteria) this;
        }

        public Criteria andOrderMoneyIn(List<String> values) {
            addCriterion("order_money in", values, "orderMoney");
            return (Criteria) this;
        }

        public Criteria andOrderMoneyNotIn(List<String> values) {
            addCriterion("order_money not in", values, "orderMoney");
            return (Criteria) this;
        }

        public Criteria andOrderMoneyBetween(String value1, String value2) {
            addCriterion("order_money between", value1, value2, "orderMoney");
            return (Criteria) this;
        }

        public Criteria andOrderMoneyNotBetween(String value1, String value2) {
            addCriterion("order_money not between", value1, value2, "orderMoney");
            return (Criteria) this;
        }

        public Criteria andOrderStaffidIsNull() {
            addCriterion("order_staffId is null");
            return (Criteria) this;
        }

        public Criteria andOrderStaffidIsNotNull() {
            addCriterion("order_staffId is not null");
            return (Criteria) this;
        }

        public Criteria andOrderStaffidEqualTo(Integer value) {
            addCriterion("order_staffId =", value, "orderStaffid");
            return (Criteria) this;
        }

        public Criteria andOrderStaffidNotEqualTo(Integer value) {
            addCriterion("order_staffId <>", value, "orderStaffid");
            return (Criteria) this;
        }

        public Criteria andOrderStaffidGreaterThan(Integer value) {
            addCriterion("order_staffId >", value, "orderStaffid");
            return (Criteria) this;
        }

        public Criteria andOrderStaffidGreaterThanOrEqualTo(Integer value) {
            addCriterion("order_staffId >=", value, "orderStaffid");
            return (Criteria) this;
        }

        public Criteria andOrderStaffidLessThan(Integer value) {
            addCriterion("order_staffId <", value, "orderStaffid");
            return (Criteria) this;
        }

        public Criteria andOrderStaffidLessThanOrEqualTo(Integer value) {
            addCriterion("order_staffId <=", value, "orderStaffid");
            return (Criteria) this;
        }

        public Criteria andOrderStaffidIn(List<Integer> values) {
            addCriterion("order_staffId in", values, "orderStaffid");
            return (Criteria) this;
        }

        public Criteria andOrderStaffidNotIn(List<Integer> values) {
            addCriterion("order_staffId not in", values, "orderStaffid");
            return (Criteria) this;
        }

        public Criteria andOrderStaffidBetween(Integer value1, Integer value2) {
            addCriterion("order_staffId between", value1, value2, "orderStaffid");
            return (Criteria) this;
        }

        public Criteria andOrderStaffidNotBetween(Integer value1, Integer value2) {
            addCriterion("order_staffId not between", value1, value2, "orderStaffid");
            return (Criteria) this;
        }

        public Criteria andOrderOfferIsNull() {
            addCriterion("order_offer is null");
            return (Criteria) this;
        }

        public Criteria andOrderOfferIsNotNull() {
            addCriterion("order_offer is not null");
            return (Criteria) this;
        }

        public Criteria andOrderOfferEqualTo(String value) {
            addCriterion("order_offer =", value, "orderOffer");
            return (Criteria) this;
        }

        public Criteria andOrderOfferNotEqualTo(String value) {
            addCriterion("order_offer <>", value, "orderOffer");
            return (Criteria) this;
        }

        public Criteria andOrderOfferGreaterThan(String value) {
            addCriterion("order_offer >", value, "orderOffer");
            return (Criteria) this;
        }

        public Criteria andOrderOfferGreaterThanOrEqualTo(String value) {
            addCriterion("order_offer >=", value, "orderOffer");
            return (Criteria) this;
        }

        public Criteria andOrderOfferLessThan(String value) {
            addCriterion("order_offer <", value, "orderOffer");
            return (Criteria) this;
        }

        public Criteria andOrderOfferLessThanOrEqualTo(String value) {
            addCriterion("order_offer <=", value, "orderOffer");
            return (Criteria) this;
        }

        public Criteria andOrderOfferLike(String value) {
            addCriterion("order_offer like", value, "orderOffer");
            return (Criteria) this;
        }

        public Criteria andOrderOfferNotLike(String value) {
            addCriterion("order_offer not like", value, "orderOffer");
            return (Criteria) this;
        }

        public Criteria andOrderOfferIn(List<String> values) {
            addCriterion("order_offer in", values, "orderOffer");
            return (Criteria) this;
        }

        public Criteria andOrderOfferNotIn(List<String> values) {
            addCriterion("order_offer not in", values, "orderOffer");
            return (Criteria) this;
        }

        public Criteria andOrderOfferBetween(String value1, String value2) {
            addCriterion("order_offer between", value1, value2, "orderOffer");
            return (Criteria) this;
        }

        public Criteria andOrderOfferNotBetween(String value1, String value2) {
            addCriterion("order_offer not between", value1, value2, "orderOffer");
            return (Criteria) this;
        }

        public Criteria andOrderUrgentIsNull() {
            addCriterion("order_urgent is null");
            return (Criteria) this;
        }

        public Criteria andOrderUrgentIsNotNull() {
            addCriterion("order_urgent is not null");
            return (Criteria) this;
        }

        public Criteria andOrderUrgentEqualTo(String value) {
            addCriterion("order_urgent =", value, "orderUrgent");
            return (Criteria) this;
        }

        public Criteria andOrderUrgentNotEqualTo(String value) {
            addCriterion("order_urgent <>", value, "orderUrgent");
            return (Criteria) this;
        }

        public Criteria andOrderUrgentGreaterThan(String value) {
            addCriterion("order_urgent >", value, "orderUrgent");
            return (Criteria) this;
        }

        public Criteria andOrderUrgentGreaterThanOrEqualTo(String value) {
            addCriterion("order_urgent >=", value, "orderUrgent");
            return (Criteria) this;
        }

        public Criteria andOrderUrgentLessThan(String value) {
            addCriterion("order_urgent <", value, "orderUrgent");
            return (Criteria) this;
        }

        public Criteria andOrderUrgentLessThanOrEqualTo(String value) {
            addCriterion("order_urgent <=", value, "orderUrgent");
            return (Criteria) this;
        }

        public Criteria andOrderUrgentLike(String value) {
            addCriterion("order_urgent like", value, "orderUrgent");
            return (Criteria) this;
        }

        public Criteria andOrderUrgentNotLike(String value) {
            addCriterion("order_urgent not like", value, "orderUrgent");
            return (Criteria) this;
        }

        public Criteria andOrderUrgentIn(List<String> values) {
            addCriterion("order_urgent in", values, "orderUrgent");
            return (Criteria) this;
        }

        public Criteria andOrderUrgentNotIn(List<String> values) {
            addCriterion("order_urgent not in", values, "orderUrgent");
            return (Criteria) this;
        }

        public Criteria andOrderUrgentBetween(String value1, String value2) {
            addCriterion("order_urgent between", value1, value2, "orderUrgent");
            return (Criteria) this;
        }

        public Criteria andOrderUrgentNotBetween(String value1, String value2) {
            addCriterion("order_urgent not between", value1, value2, "orderUrgent");
            return (Criteria) this;
        }

        public Criteria andOrderStateIsNull() {
            addCriterion("order_state is null");
            return (Criteria) this;
        }

        public Criteria andOrderStateIsNotNull() {
            addCriterion("order_state is not null");
            return (Criteria) this;
        }

        public Criteria andOrderStateEqualTo(Integer value) {
            addCriterion("order_state =", value, "orderState");
            return (Criteria) this;
        }

        public Criteria andOrderStateNotEqualTo(Integer value) {
            addCriterion("order_state <>", value, "orderState");
            return (Criteria) this;
        }

        public Criteria andOrderStateGreaterThan(Integer value) {
            addCriterion("order_state >", value, "orderState");
            return (Criteria) this;
        }

        public Criteria andOrderStateGreaterThanOrEqualTo(Integer value) {
            addCriterion("order_state >=", value, "orderState");
            return (Criteria) this;
        }

        public Criteria andOrderStateLessThan(Integer value) {
            addCriterion("order_state <", value, "orderState");
            return (Criteria) this;
        }

        public Criteria andOrderStateLessThanOrEqualTo(Integer value) {
            addCriterion("order_state <=", value, "orderState");
            return (Criteria) this;
        }

        public Criteria andOrderStateIn(List<Integer> values) {
            addCriterion("order_state in", values, "orderState");
            return (Criteria) this;
        }

        public Criteria andOrderStateNotIn(List<Integer> values) {
            addCriterion("order_state not in", values, "orderState");
            return (Criteria) this;
        }

        public Criteria andOrderStateBetween(Integer value1, Integer value2) {
            addCriterion("order_state between", value1, value2, "orderState");
            return (Criteria) this;
        }

        public Criteria andOrderStateNotBetween(Integer value1, Integer value2) {
            addCriterion("order_state not between", value1, value2, "orderState");
            return (Criteria) this;
        }

        public Criteria andOrderNowaddressIsNull() {
            addCriterion("order_nowAddress is null");
            return (Criteria) this;
        }

        public Criteria andOrderNowaddressIsNotNull() {
            addCriterion("order_nowAddress is not null");
            return (Criteria) this;
        }

        public Criteria andOrderNowaddressEqualTo(String value) {
            addCriterion("order_nowAddress =", value, "orderNowaddress");
            return (Criteria) this;
        }

        public Criteria andOrderNowaddressNotEqualTo(String value) {
            addCriterion("order_nowAddress <>", value, "orderNowaddress");
            return (Criteria) this;
        }

        public Criteria andOrderNowaddressGreaterThan(String value) {
            addCriterion("order_nowAddress >", value, "orderNowaddress");
            return (Criteria) this;
        }

        public Criteria andOrderNowaddressGreaterThanOrEqualTo(String value) {
            addCriterion("order_nowAddress >=", value, "orderNowaddress");
            return (Criteria) this;
        }

        public Criteria andOrderNowaddressLessThan(String value) {
            addCriterion("order_nowAddress <", value, "orderNowaddress");
            return (Criteria) this;
        }

        public Criteria andOrderNowaddressLessThanOrEqualTo(String value) {
            addCriterion("order_nowAddress <=", value, "orderNowaddress");
            return (Criteria) this;
        }

        public Criteria andOrderNowaddressLike(String value) {
            addCriterion("order_nowAddress like", value, "orderNowaddress");
            return (Criteria) this;
        }

        public Criteria andOrderNowaddressNotLike(String value) {
            addCriterion("order_nowAddress not like", value, "orderNowaddress");
            return (Criteria) this;
        }

        public Criteria andOrderNowaddressIn(List<String> values) {
            addCriterion("order_nowAddress in", values, "orderNowaddress");
            return (Criteria) this;
        }

        public Criteria andOrderNowaddressNotIn(List<String> values) {
            addCriterion("order_nowAddress not in", values, "orderNowaddress");
            return (Criteria) this;
        }

        public Criteria andOrderNowaddressBetween(String value1, String value2) {
            addCriterion("order_nowAddress between", value1, value2, "orderNowaddress");
            return (Criteria) this;
        }

        public Criteria andOrderNowaddressNotBetween(String value1, String value2) {
            addCriterion("order_nowAddress not between", value1, value2, "orderNowaddress");
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