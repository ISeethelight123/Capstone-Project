package com.qyqjava.pojo;

import java.util.ArrayList;
import java.util.List;

public class WrehouseExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public WrehouseExample() {
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

        public Criteria andWrehouseIdIsNull() {
            addCriterion("Wrehouse_ID is null");
            return (Criteria) this;
        }

        public Criteria andWrehouseIdIsNotNull() {
            addCriterion("Wrehouse_ID is not null");
            return (Criteria) this;
        }

        public Criteria andWrehouseIdEqualTo(Integer value) {
            addCriterion("Wrehouse_ID =", value, "wrehouseId");
            return (Criteria) this;
        }

        public Criteria andWrehouseIdNotEqualTo(Integer value) {
            addCriterion("Wrehouse_ID <>", value, "wrehouseId");
            return (Criteria) this;
        }

        public Criteria andWrehouseIdGreaterThan(Integer value) {
            addCriterion("Wrehouse_ID >", value, "wrehouseId");
            return (Criteria) this;
        }

        public Criteria andWrehouseIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("Wrehouse_ID >=", value, "wrehouseId");
            return (Criteria) this;
        }

        public Criteria andWrehouseIdLessThan(Integer value) {
            addCriterion("Wrehouse_ID <", value, "wrehouseId");
            return (Criteria) this;
        }

        public Criteria andWrehouseIdLessThanOrEqualTo(Integer value) {
            addCriterion("Wrehouse_ID <=", value, "wrehouseId");
            return (Criteria) this;
        }

        public Criteria andWrehouseIdIn(List<Integer> values) {
            addCriterion("Wrehouse_ID in", values, "wrehouseId");
            return (Criteria) this;
        }

        public Criteria andWrehouseIdNotIn(List<Integer> values) {
            addCriterion("Wrehouse_ID not in", values, "wrehouseId");
            return (Criteria) this;
        }

        public Criteria andWrehouseIdBetween(Integer value1, Integer value2) {
            addCriterion("Wrehouse_ID between", value1, value2, "wrehouseId");
            return (Criteria) this;
        }

        public Criteria andWrehouseIdNotBetween(Integer value1, Integer value2) {
            addCriterion("Wrehouse_ID not between", value1, value2, "wrehouseId");
            return (Criteria) this;
        }

        public Criteria andWrehouseAddressIsNull() {
            addCriterion("Wrehouse_Address is null");
            return (Criteria) this;
        }

        public Criteria andWrehouseAddressIsNotNull() {
            addCriterion("Wrehouse_Address is not null");
            return (Criteria) this;
        }

        public Criteria andWrehouseAddressEqualTo(Integer value) {
            addCriterion("Wrehouse_Address =", value, "wrehouseAddress");
            return (Criteria) this;
        }

        public Criteria andWrehouseAddressNotEqualTo(Integer value) {
            addCriterion("Wrehouse_Address <>", value, "wrehouseAddress");
            return (Criteria) this;
        }

        public Criteria andWrehouseAddressGreaterThan(Integer value) {
            addCriterion("Wrehouse_Address >", value, "wrehouseAddress");
            return (Criteria) this;
        }

        public Criteria andWrehouseAddressGreaterThanOrEqualTo(Integer value) {
            addCriterion("Wrehouse_Address >=", value, "wrehouseAddress");
            return (Criteria) this;
        }

        public Criteria andWrehouseAddressLessThan(Integer value) {
            addCriterion("Wrehouse_Address <", value, "wrehouseAddress");
            return (Criteria) this;
        }

        public Criteria andWrehouseAddressLessThanOrEqualTo(Integer value) {
            addCriterion("Wrehouse_Address <=", value, "wrehouseAddress");
            return (Criteria) this;
        }

        public Criteria andWrehouseAddressIn(List<Integer> values) {
            addCriterion("Wrehouse_Address in", values, "wrehouseAddress");
            return (Criteria) this;
        }

        public Criteria andWrehouseAddressNotIn(List<Integer> values) {
            addCriterion("Wrehouse_Address not in", values, "wrehouseAddress");
            return (Criteria) this;
        }

        public Criteria andWrehouseAddressBetween(Integer value1, Integer value2) {
            addCriterion("Wrehouse_Address between", value1, value2, "wrehouseAddress");
            return (Criteria) this;
        }

        public Criteria andWrehouseAddressNotBetween(Integer value1, Integer value2) {
            addCriterion("Wrehouse_Address not between", value1, value2, "wrehouseAddress");
            return (Criteria) this;
        }

        public Criteria andWrehouseNameIsNull() {
            addCriterion("Wrehouse_Name is null");
            return (Criteria) this;
        }

        public Criteria andWrehouseNameIsNotNull() {
            addCriterion("Wrehouse_Name is not null");
            return (Criteria) this;
        }

        public Criteria andWrehouseNameEqualTo(String value) {
            addCriterion("Wrehouse_Name =", value, "wrehouseName");
            return (Criteria) this;
        }

        public Criteria andWrehouseNameNotEqualTo(String value) {
            addCriterion("Wrehouse_Name <>", value, "wrehouseName");
            return (Criteria) this;
        }

        public Criteria andWrehouseNameGreaterThan(String value) {
            addCriterion("Wrehouse_Name >", value, "wrehouseName");
            return (Criteria) this;
        }

        public Criteria andWrehouseNameGreaterThanOrEqualTo(String value) {
            addCriterion("Wrehouse_Name >=", value, "wrehouseName");
            return (Criteria) this;
        }

        public Criteria andWrehouseNameLessThan(String value) {
            addCriterion("Wrehouse_Name <", value, "wrehouseName");
            return (Criteria) this;
        }

        public Criteria andWrehouseNameLessThanOrEqualTo(String value) {
            addCriterion("Wrehouse_Name <=", value, "wrehouseName");
            return (Criteria) this;
        }

        public Criteria andWrehouseNameLike(String value) {
            addCriterion("Wrehouse_Name like", value, "wrehouseName");
            return (Criteria) this;
        }

        public Criteria andWrehouseNameNotLike(String value) {
            addCriterion("Wrehouse_Name not like", value, "wrehouseName");
            return (Criteria) this;
        }

        public Criteria andWrehouseNameIn(List<String> values) {
            addCriterion("Wrehouse_Name in", values, "wrehouseName");
            return (Criteria) this;
        }

        public Criteria andWrehouseNameNotIn(List<String> values) {
            addCriterion("Wrehouse_Name not in", values, "wrehouseName");
            return (Criteria) this;
        }

        public Criteria andWrehouseNameBetween(String value1, String value2) {
            addCriterion("Wrehouse_Name between", value1, value2, "wrehouseName");
            return (Criteria) this;
        }

        public Criteria andWrehouseNameNotBetween(String value1, String value2) {
            addCriterion("Wrehouse_Name not between", value1, value2, "wrehouseName");
            return (Criteria) this;
        }

        public Criteria andWrehousePhoneIsNull() {
            addCriterion("Wrehouse_Phone is null");
            return (Criteria) this;
        }

        public Criteria andWrehousePhoneIsNotNull() {
            addCriterion("Wrehouse_Phone is not null");
            return (Criteria) this;
        }

        public Criteria andWrehousePhoneEqualTo(String value) {
            addCriterion("Wrehouse_Phone =", value, "wrehousePhone");
            return (Criteria) this;
        }

        public Criteria andWrehousePhoneNotEqualTo(String value) {
            addCriterion("Wrehouse_Phone <>", value, "wrehousePhone");
            return (Criteria) this;
        }

        public Criteria andWrehousePhoneGreaterThan(String value) {
            addCriterion("Wrehouse_Phone >", value, "wrehousePhone");
            return (Criteria) this;
        }

        public Criteria andWrehousePhoneGreaterThanOrEqualTo(String value) {
            addCriterion("Wrehouse_Phone >=", value, "wrehousePhone");
            return (Criteria) this;
        }

        public Criteria andWrehousePhoneLessThan(String value) {
            addCriterion("Wrehouse_Phone <", value, "wrehousePhone");
            return (Criteria) this;
        }

        public Criteria andWrehousePhoneLessThanOrEqualTo(String value) {
            addCriterion("Wrehouse_Phone <=", value, "wrehousePhone");
            return (Criteria) this;
        }

        public Criteria andWrehousePhoneLike(String value) {
            addCriterion("Wrehouse_Phone like", value, "wrehousePhone");
            return (Criteria) this;
        }

        public Criteria andWrehousePhoneNotLike(String value) {
            addCriterion("Wrehouse_Phone not like", value, "wrehousePhone");
            return (Criteria) this;
        }

        public Criteria andWrehousePhoneIn(List<String> values) {
            addCriterion("Wrehouse_Phone in", values, "wrehousePhone");
            return (Criteria) this;
        }

        public Criteria andWrehousePhoneNotIn(List<String> values) {
            addCriterion("Wrehouse_Phone not in", values, "wrehousePhone");
            return (Criteria) this;
        }

        public Criteria andWrehousePhoneBetween(String value1, String value2) {
            addCriterion("Wrehouse_Phone between", value1, value2, "wrehousePhone");
            return (Criteria) this;
        }

        public Criteria andWrehousePhoneNotBetween(String value1, String value2) {
            addCriterion("Wrehouse_Phone not between", value1, value2, "wrehousePhone");
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