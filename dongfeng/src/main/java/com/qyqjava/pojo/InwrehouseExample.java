package com.qyqjava.pojo;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class InwrehouseExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public InwrehouseExample() {
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

        public Criteria andInwrehouseIdIsNull() {
            addCriterion("inwrehouse_id is null");
            return (Criteria) this;
        }

        public Criteria andInwrehouseIdIsNotNull() {
            addCriterion("inwrehouse_id is not null");
            return (Criteria) this;
        }

        public Criteria andInwrehouseIdEqualTo(Integer value) {
            addCriterion("inwrehouse_id =", value, "inwrehouseId");
            return (Criteria) this;
        }

        public Criteria andInwrehouseIdNotEqualTo(Integer value) {
            addCriterion("inwrehouse_id <>", value, "inwrehouseId");
            return (Criteria) this;
        }

        public Criteria andInwrehouseIdGreaterThan(Integer value) {
            addCriterion("inwrehouse_id >", value, "inwrehouseId");
            return (Criteria) this;
        }

        public Criteria andInwrehouseIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("inwrehouse_id >=", value, "inwrehouseId");
            return (Criteria) this;
        }

        public Criteria andInwrehouseIdLessThan(Integer value) {
            addCriterion("inwrehouse_id <", value, "inwrehouseId");
            return (Criteria) this;
        }

        public Criteria andInwrehouseIdLessThanOrEqualTo(Integer value) {
            addCriterion("inwrehouse_id <=", value, "inwrehouseId");
            return (Criteria) this;
        }

        public Criteria andInwrehouseIdIn(List<Integer> values) {
            addCriterion("inwrehouse_id in", values, "inwrehouseId");
            return (Criteria) this;
        }

        public Criteria andInwrehouseIdNotIn(List<Integer> values) {
            addCriterion("inwrehouse_id not in", values, "inwrehouseId");
            return (Criteria) this;
        }

        public Criteria andInwrehouseIdBetween(Integer value1, Integer value2) {
            addCriterion("inwrehouse_id between", value1, value2, "inwrehouseId");
            return (Criteria) this;
        }

        public Criteria andInwrehouseIdNotBetween(Integer value1, Integer value2) {
            addCriterion("inwrehouse_id not between", value1, value2, "inwrehouseId");
            return (Criteria) this;
        }

        public Criteria andInwrehouseTimeIsNull() {
            addCriterion("inwrehouse_time is null");
            return (Criteria) this;
        }

        public Criteria andInwrehouseTimeIsNotNull() {
            addCriterion("inwrehouse_time is not null");
            return (Criteria) this;
        }

        public Criteria andInwrehouseTimeEqualTo(Date value) {
            addCriterion("inwrehouse_time =", value, "inwrehouseTime");
            return (Criteria) this;
        }

        public Criteria andInwrehouseTimeNotEqualTo(Date value) {
            addCriterion("inwrehouse_time <>", value, "inwrehouseTime");
            return (Criteria) this;
        }

        public Criteria andInwrehouseTimeGreaterThan(Date value) {
            addCriterion("inwrehouse_time >", value, "inwrehouseTime");
            return (Criteria) this;
        }

        public Criteria andInwrehouseTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("inwrehouse_time >=", value, "inwrehouseTime");
            return (Criteria) this;
        }

        public Criteria andInwrehouseTimeLessThan(Date value) {
            addCriterion("inwrehouse_time <", value, "inwrehouseTime");
            return (Criteria) this;
        }

        public Criteria andInwrehouseTimeLessThanOrEqualTo(Date value) {
            addCriterion("inwrehouse_time <=", value, "inwrehouseTime");
            return (Criteria) this;
        }

        public Criteria andInwrehouseTimeIn(List<Date> values) {
            addCriterion("inwrehouse_time in", values, "inwrehouseTime");
            return (Criteria) this;
        }

        public Criteria andInwrehouseTimeNotIn(List<Date> values) {
            addCriterion("inwrehouse_time not in", values, "inwrehouseTime");
            return (Criteria) this;
        }

        public Criteria andInwrehouseTimeBetween(Date value1, Date value2) {
            addCriterion("inwrehouse_time between", value1, value2, "inwrehouseTime");
            return (Criteria) this;
        }

        public Criteria andInwrehouseTimeNotBetween(Date value1, Date value2) {
            addCriterion("inwrehouse_time not between", value1, value2, "inwrehouseTime");
            return (Criteria) this;
        }

        public Criteria andWrehouseIdIsNull() {
            addCriterion("wrehouse_id is null");
            return (Criteria) this;
        }

        public Criteria andWrehouseIdIsNotNull() {
            addCriterion("wrehouse_id is not null");
            return (Criteria) this;
        }

        public Criteria andWrehouseIdEqualTo(Integer value) {
            addCriterion("wrehouse_id =", value, "wrehouseId");
            return (Criteria) this;
        }

        public Criteria andWrehouseIdNotEqualTo(Integer value) {
            addCriterion("wrehouse_id <>", value, "wrehouseId");
            return (Criteria) this;
        }

        public Criteria andWrehouseIdGreaterThan(Integer value) {
            addCriterion("wrehouse_id >", value, "wrehouseId");
            return (Criteria) this;
        }

        public Criteria andWrehouseIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("wrehouse_id >=", value, "wrehouseId");
            return (Criteria) this;
        }

        public Criteria andWrehouseIdLessThan(Integer value) {
            addCriterion("wrehouse_id <", value, "wrehouseId");
            return (Criteria) this;
        }

        public Criteria andWrehouseIdLessThanOrEqualTo(Integer value) {
            addCriterion("wrehouse_id <=", value, "wrehouseId");
            return (Criteria) this;
        }

        public Criteria andWrehouseIdIn(List<Integer> values) {
            addCriterion("wrehouse_id in", values, "wrehouseId");
            return (Criteria) this;
        }

        public Criteria andWrehouseIdNotIn(List<Integer> values) {
            addCriterion("wrehouse_id not in", values, "wrehouseId");
            return (Criteria) this;
        }

        public Criteria andWrehouseIdBetween(Integer value1, Integer value2) {
            addCriterion("wrehouse_id between", value1, value2, "wrehouseId");
            return (Criteria) this;
        }

        public Criteria andWrehouseIdNotBetween(Integer value1, Integer value2) {
            addCriterion("wrehouse_id not between", value1, value2, "wrehouseId");
            return (Criteria) this;
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