package com.qyqjava.pojo;

import java.util.ArrayList;
import java.util.List;

public class RelationExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public RelationExample() {
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

        public Criteria andRoadwayIsNull() {
            addCriterion("roadway is null");
            return (Criteria) this;
        }

        public Criteria andRoadwayIsNotNull() {
            addCriterion("roadway is not null");
            return (Criteria) this;
        }

        public Criteria andRoadwayEqualTo(Integer value) {
            addCriterion("roadway =", value, "roadway");
            return (Criteria) this;
        }

        public Criteria andRoadwayNotEqualTo(Integer value) {
            addCriterion("roadway <>", value, "roadway");
            return (Criteria) this;
        }

        public Criteria andRoadwayGreaterThan(Integer value) {
            addCriterion("roadway >", value, "roadway");
            return (Criteria) this;
        }

        public Criteria andRoadwayGreaterThanOrEqualTo(Integer value) {
            addCriterion("roadway >=", value, "roadway");
            return (Criteria) this;
        }

        public Criteria andRoadwayLessThan(Integer value) {
            addCriterion("roadway <", value, "roadway");
            return (Criteria) this;
        }

        public Criteria andRoadwayLessThanOrEqualTo(Integer value) {
            addCriterion("roadway <=", value, "roadway");
            return (Criteria) this;
        }

        public Criteria andRoadwayIn(List<Integer> values) {
            addCriterion("roadway in", values, "roadway");
            return (Criteria) this;
        }

        public Criteria andRoadwayNotIn(List<Integer> values) {
            addCriterion("roadway not in", values, "roadway");
            return (Criteria) this;
        }

        public Criteria andRoadwayBetween(Integer value1, Integer value2) {
            addCriterion("roadway between", value1, value2, "roadway");
            return (Criteria) this;
        }

        public Criteria andRoadwayNotBetween(Integer value1, Integer value2) {
            addCriterion("roadway not between", value1, value2, "roadway");
            return (Criteria) this;
        }

        public Criteria andShelfIsNull() {
            addCriterion("shelf is null");
            return (Criteria) this;
        }

        public Criteria andShelfIsNotNull() {
            addCriterion("shelf is not null");
            return (Criteria) this;
        }

        public Criteria andShelfEqualTo(Integer value) {
            addCriterion("shelf =", value, "shelf");
            return (Criteria) this;
        }

        public Criteria andShelfNotEqualTo(Integer value) {
            addCriterion("shelf <>", value, "shelf");
            return (Criteria) this;
        }

        public Criteria andShelfGreaterThan(Integer value) {
            addCriterion("shelf >", value, "shelf");
            return (Criteria) this;
        }

        public Criteria andShelfGreaterThanOrEqualTo(Integer value) {
            addCriterion("shelf >=", value, "shelf");
            return (Criteria) this;
        }

        public Criteria andShelfLessThan(Integer value) {
            addCriterion("shelf <", value, "shelf");
            return (Criteria) this;
        }

        public Criteria andShelfLessThanOrEqualTo(Integer value) {
            addCriterion("shelf <=", value, "shelf");
            return (Criteria) this;
        }

        public Criteria andShelfIn(List<Integer> values) {
            addCriterion("shelf in", values, "shelf");
            return (Criteria) this;
        }

        public Criteria andShelfNotIn(List<Integer> values) {
            addCriterion("shelf not in", values, "shelf");
            return (Criteria) this;
        }

        public Criteria andShelfBetween(Integer value1, Integer value2) {
            addCriterion("shelf between", value1, value2, "shelf");
            return (Criteria) this;
        }

        public Criteria andShelfNotBetween(Integer value1, Integer value2) {
            addCriterion("shelf not between", value1, value2, "shelf");
            return (Criteria) this;
        }

        public Criteria andAllocationnumIsNull() {
            addCriterion("allocationNum is null");
            return (Criteria) this;
        }

        public Criteria andAllocationnumIsNotNull() {
            addCriterion("allocationNum is not null");
            return (Criteria) this;
        }

        public Criteria andAllocationnumEqualTo(Integer value) {
            addCriterion("allocationNum =", value, "allocationnum");
            return (Criteria) this;
        }

        public Criteria andAllocationnumNotEqualTo(Integer value) {
            addCriterion("allocationNum <>", value, "allocationnum");
            return (Criteria) this;
        }

        public Criteria andAllocationnumGreaterThan(Integer value) {
            addCriterion("allocationNum >", value, "allocationnum");
            return (Criteria) this;
        }

        public Criteria andAllocationnumGreaterThanOrEqualTo(Integer value) {
            addCriterion("allocationNum >=", value, "allocationnum");
            return (Criteria) this;
        }

        public Criteria andAllocationnumLessThan(Integer value) {
            addCriterion("allocationNum <", value, "allocationnum");
            return (Criteria) this;
        }

        public Criteria andAllocationnumLessThanOrEqualTo(Integer value) {
            addCriterion("allocationNum <=", value, "allocationnum");
            return (Criteria) this;
        }

        public Criteria andAllocationnumIn(List<Integer> values) {
            addCriterion("allocationNum in", values, "allocationnum");
            return (Criteria) this;
        }

        public Criteria andAllocationnumNotIn(List<Integer> values) {
            addCriterion("allocationNum not in", values, "allocationnum");
            return (Criteria) this;
        }

        public Criteria andAllocationnumBetween(Integer value1, Integer value2) {
            addCriterion("allocationNum between", value1, value2, "allocationnum");
            return (Criteria) this;
        }

        public Criteria andAllocationnumNotBetween(Integer value1, Integer value2) {
            addCriterion("allocationNum not between", value1, value2, "allocationnum");
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