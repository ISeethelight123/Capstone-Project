package com.qyqjava.pojo;

import java.util.ArrayList;
import java.util.List;

public class AllocationExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public AllocationExample() {
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

        public Criteria andNoIsNull() {
            addCriterion("no is null");
            return (Criteria) this;
        }

        public Criteria andNoIsNotNull() {
            addCriterion("no is not null");
            return (Criteria) this;
        }

        public Criteria andNoEqualTo(Integer value) {
            addCriterion("no =", value, "no");
            return (Criteria) this;
        }

        public Criteria andNoNotEqualTo(Integer value) {
            addCriterion("no <>", value, "no");
            return (Criteria) this;
        }

        public Criteria andNoGreaterThan(Integer value) {
            addCriterion("no >", value, "no");
            return (Criteria) this;
        }

        public Criteria andNoGreaterThanOrEqualTo(Integer value) {
            addCriterion("no >=", value, "no");
            return (Criteria) this;
        }

        public Criteria andNoLessThan(Integer value) {
            addCriterion("no <", value, "no");
            return (Criteria) this;
        }

        public Criteria andNoLessThanOrEqualTo(Integer value) {
            addCriterion("no <=", value, "no");
            return (Criteria) this;
        }

        public Criteria andNoIn(List<Integer> values) {
            addCriterion("no in", values, "no");
            return (Criteria) this;
        }

        public Criteria andNoNotIn(List<Integer> values) {
            addCriterion("no not in", values, "no");
            return (Criteria) this;
        }

        public Criteria andNoBetween(Integer value1, Integer value2) {
            addCriterion("no between", value1, value2, "no");
            return (Criteria) this;
        }

        public Criteria andNoNotBetween(Integer value1, Integer value2) {
            addCriterion("no not between", value1, value2, "no");
            return (Criteria) this;
        }

        public Criteria andAllocationIdIsNull() {
            addCriterion("allocation_ID is null");
            return (Criteria) this;
        }

        public Criteria andAllocationIdIsNotNull() {
            addCriterion("allocation_ID is not null");
            return (Criteria) this;
        }

        public Criteria andAllocationIdEqualTo(Integer value) {
            addCriterion("allocation_ID =", value, "allocationId");
            return (Criteria) this;
        }

        public Criteria andAllocationIdNotEqualTo(Integer value) {
            addCriterion("allocation_ID <>", value, "allocationId");
            return (Criteria) this;
        }

        public Criteria andAllocationIdGreaterThan(Integer value) {
            addCriterion("allocation_ID >", value, "allocationId");
            return (Criteria) this;
        }

        public Criteria andAllocationIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("allocation_ID >=", value, "allocationId");
            return (Criteria) this;
        }

        public Criteria andAllocationIdLessThan(Integer value) {
            addCriterion("allocation_ID <", value, "allocationId");
            return (Criteria) this;
        }

        public Criteria andAllocationIdLessThanOrEqualTo(Integer value) {
            addCriterion("allocation_ID <=", value, "allocationId");
            return (Criteria) this;
        }

        public Criteria andAllocationIdIn(List<Integer> values) {
            addCriterion("allocation_ID in", values, "allocationId");
            return (Criteria) this;
        }

        public Criteria andAllocationIdNotIn(List<Integer> values) {
            addCriterion("allocation_ID not in", values, "allocationId");
            return (Criteria) this;
        }

        public Criteria andAllocationIdBetween(Integer value1, Integer value2) {
            addCriterion("allocation_ID between", value1, value2, "allocationId");
            return (Criteria) this;
        }

        public Criteria andAllocationIdNotBetween(Integer value1, Integer value2) {
            addCriterion("allocation_ID not between", value1, value2, "allocationId");
            return (Criteria) this;
        }

        public Criteria andAllocationTypeIsNull() {
            addCriterion("allocation_type is null");
            return (Criteria) this;
        }

        public Criteria andAllocationTypeIsNotNull() {
            addCriterion("allocation_type is not null");
            return (Criteria) this;
        }

        public Criteria andAllocationTypeEqualTo(Integer value) {
            addCriterion("allocation_type =", value, "allocationType");
            return (Criteria) this;
        }

        public Criteria andAllocationTypeNotEqualTo(Integer value) {
            addCriterion("allocation_type <>", value, "allocationType");
            return (Criteria) this;
        }

        public Criteria andAllocationTypeGreaterThan(Integer value) {
            addCriterion("allocation_type >", value, "allocationType");
            return (Criteria) this;
        }

        public Criteria andAllocationTypeGreaterThanOrEqualTo(Integer value) {
            addCriterion("allocation_type >=", value, "allocationType");
            return (Criteria) this;
        }

        public Criteria andAllocationTypeLessThan(Integer value) {
            addCriterion("allocation_type <", value, "allocationType");
            return (Criteria) this;
        }

        public Criteria andAllocationTypeLessThanOrEqualTo(Integer value) {
            addCriterion("allocation_type <=", value, "allocationType");
            return (Criteria) this;
        }

        public Criteria andAllocationTypeIn(List<Integer> values) {
            addCriterion("allocation_type in", values, "allocationType");
            return (Criteria) this;
        }

        public Criteria andAllocationTypeNotIn(List<Integer> values) {
            addCriterion("allocation_type not in", values, "allocationType");
            return (Criteria) this;
        }

        public Criteria andAllocationTypeBetween(Integer value1, Integer value2) {
            addCriterion("allocation_type between", value1, value2, "allocationType");
            return (Criteria) this;
        }

        public Criteria andAllocationTypeNotBetween(Integer value1, Integer value2) {
            addCriterion("allocation_type not between", value1, value2, "allocationType");
            return (Criteria) this;
        }

        public Criteria andOrderIdIsNull() {
            addCriterion("order_ID is null");
            return (Criteria) this;
        }

        public Criteria andOrderIdIsNotNull() {
            addCriterion("order_ID is not null");
            return (Criteria) this;
        }

        public Criteria andOrderIdEqualTo(String value) {
            addCriterion("order_ID =", value, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdNotEqualTo(String value) {
            addCriterion("order_ID <>", value, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdGreaterThan(String value) {
            addCriterion("order_ID >", value, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdGreaterThanOrEqualTo(String value) {
            addCriterion("order_ID >=", value, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdLessThan(String value) {
            addCriterion("order_ID <", value, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdLessThanOrEqualTo(String value) {
            addCriterion("order_ID <=", value, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdLike(String value) {
            addCriterion("order_ID like", value, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdNotLike(String value) {
            addCriterion("order_ID not like", value, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdIn(List<String> values) {
            addCriterion("order_ID in", values, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdNotIn(List<String> values) {
            addCriterion("order_ID not in", values, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdBetween(String value1, String value2) {
            addCriterion("order_ID between", value1, value2, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdNotBetween(String value1, String value2) {
            addCriterion("order_ID not between", value1, value2, "orderId");
            return (Criteria) this;
        }

        public Criteria andWrehouseIdIsNull() {
            addCriterion("wrehouse_ID is null");
            return (Criteria) this;
        }

        public Criteria andWrehouseIdIsNotNull() {
            addCriterion("wrehouse_ID is not null");
            return (Criteria) this;
        }

        public Criteria andWrehouseIdEqualTo(Integer value) {
            addCriterion("wrehouse_ID =", value, "wrehouseId");
            return (Criteria) this;
        }

        public Criteria andWrehouseIdNotEqualTo(Integer value) {
            addCriterion("wrehouse_ID <>", value, "wrehouseId");
            return (Criteria) this;
        }

        public Criteria andWrehouseIdGreaterThan(Integer value) {
            addCriterion("wrehouse_ID >", value, "wrehouseId");
            return (Criteria) this;
        }

        public Criteria andWrehouseIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("wrehouse_ID >=", value, "wrehouseId");
            return (Criteria) this;
        }

        public Criteria andWrehouseIdLessThan(Integer value) {
            addCriterion("wrehouse_ID <", value, "wrehouseId");
            return (Criteria) this;
        }

        public Criteria andWrehouseIdLessThanOrEqualTo(Integer value) {
            addCriterion("wrehouse_ID <=", value, "wrehouseId");
            return (Criteria) this;
        }

        public Criteria andWrehouseIdIn(List<Integer> values) {
            addCriterion("wrehouse_ID in", values, "wrehouseId");
            return (Criteria) this;
        }

        public Criteria andWrehouseIdNotIn(List<Integer> values) {
            addCriterion("wrehouse_ID not in", values, "wrehouseId");
            return (Criteria) this;
        }

        public Criteria andWrehouseIdBetween(Integer value1, Integer value2) {
            addCriterion("wrehouse_ID between", value1, value2, "wrehouseId");
            return (Criteria) this;
        }

        public Criteria andWrehouseIdNotBetween(Integer value1, Integer value2) {
            addCriterion("wrehouse_ID not between", value1, value2, "wrehouseId");
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