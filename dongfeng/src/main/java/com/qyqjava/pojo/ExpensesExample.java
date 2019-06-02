package com.qyqjava.pojo;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class ExpensesExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ExpensesExample() {
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

        public Criteria andExpensesNameIsNull() {
            addCriterion("expenses_name is null");
            return (Criteria) this;
        }

        public Criteria andExpensesNameIsNotNull() {
            addCriterion("expenses_name is not null");
            return (Criteria) this;
        }

        public Criteria andExpensesNameEqualTo(String value) {
            addCriterion("expenses_name =", value, "expensesName");
            return (Criteria) this;
        }

        public Criteria andExpensesNameNotEqualTo(String value) {
            addCriterion("expenses_name <>", value, "expensesName");
            return (Criteria) this;
        }

        public Criteria andExpensesNameGreaterThan(String value) {
            addCriterion("expenses_name >", value, "expensesName");
            return (Criteria) this;
        }

        public Criteria andExpensesNameGreaterThanOrEqualTo(String value) {
            addCriterion("expenses_name >=", value, "expensesName");
            return (Criteria) this;
        }

        public Criteria andExpensesNameLessThan(String value) {
            addCriterion("expenses_name <", value, "expensesName");
            return (Criteria) this;
        }

        public Criteria andExpensesNameLessThanOrEqualTo(String value) {
            addCriterion("expenses_name <=", value, "expensesName");
            return (Criteria) this;
        }

        public Criteria andExpensesNameLike(String value) {
            addCriterion("expenses_name like", value, "expensesName");
            return (Criteria) this;
        }

        public Criteria andExpensesNameNotLike(String value) {
            addCriterion("expenses_name not like", value, "expensesName");
            return (Criteria) this;
        }

        public Criteria andExpensesNameIn(List<String> values) {
            addCriterion("expenses_name in", values, "expensesName");
            return (Criteria) this;
        }

        public Criteria andExpensesNameNotIn(List<String> values) {
            addCriterion("expenses_name not in", values, "expensesName");
            return (Criteria) this;
        }

        public Criteria andExpensesNameBetween(String value1, String value2) {
            addCriterion("expenses_name between", value1, value2, "expensesName");
            return (Criteria) this;
        }

        public Criteria andExpensesNameNotBetween(String value1, String value2) {
            addCriterion("expenses_name not between", value1, value2, "expensesName");
            return (Criteria) this;
        }

        public Criteria andExpensesMoneyIsNull() {
            addCriterion("expenses_money is null");
            return (Criteria) this;
        }

        public Criteria andExpensesMoneyIsNotNull() {
            addCriterion("expenses_money is not null");
            return (Criteria) this;
        }

        public Criteria andExpensesMoneyEqualTo(Long value) {
            addCriterion("expenses_money =", value, "expensesMoney");
            return (Criteria) this;
        }

        public Criteria andExpensesMoneyNotEqualTo(Long value) {
            addCriterion("expenses_money <>", value, "expensesMoney");
            return (Criteria) this;
        }

        public Criteria andExpensesMoneyGreaterThan(Long value) {
            addCriterion("expenses_money >", value, "expensesMoney");
            return (Criteria) this;
        }

        public Criteria andExpensesMoneyGreaterThanOrEqualTo(Long value) {
            addCriterion("expenses_money >=", value, "expensesMoney");
            return (Criteria) this;
        }

        public Criteria andExpensesMoneyLessThan(Long value) {
            addCriterion("expenses_money <", value, "expensesMoney");
            return (Criteria) this;
        }

        public Criteria andExpensesMoneyLessThanOrEqualTo(Long value) {
            addCriterion("expenses_money <=", value, "expensesMoney");
            return (Criteria) this;
        }

        public Criteria andExpensesMoneyIn(List<Long> values) {
            addCriterion("expenses_money in", values, "expensesMoney");
            return (Criteria) this;
        }

        public Criteria andExpensesMoneyNotIn(List<Long> values) {
            addCriterion("expenses_money not in", values, "expensesMoney");
            return (Criteria) this;
        }

        public Criteria andExpensesMoneyBetween(Long value1, Long value2) {
            addCriterion("expenses_money between", value1, value2, "expensesMoney");
            return (Criteria) this;
        }

        public Criteria andExpensesMoneyNotBetween(Long value1, Long value2) {
            addCriterion("expenses_money not between", value1, value2, "expensesMoney");
            return (Criteria) this;
        }

        public Criteria andExpensesTimeIsNull() {
            addCriterion("expenses_time is null");
            return (Criteria) this;
        }

        public Criteria andExpensesTimeIsNotNull() {
            addCriterion("expenses_time is not null");
            return (Criteria) this;
        }

        public Criteria andExpensesTimeEqualTo(Date value) {
            addCriterionForJDBCDate("expenses_time =", value, "expensesTime");
            return (Criteria) this;
        }

        public Criteria andExpensesTimeNotEqualTo(Date value) {
            addCriterionForJDBCDate("expenses_time <>", value, "expensesTime");
            return (Criteria) this;
        }

        public Criteria andExpensesTimeGreaterThan(Date value) {
            addCriterionForJDBCDate("expenses_time >", value, "expensesTime");
            return (Criteria) this;
        }

        public Criteria andExpensesTimeGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("expenses_time >=", value, "expensesTime");
            return (Criteria) this;
        }

        public Criteria andExpensesTimeLessThan(Date value) {
            addCriterionForJDBCDate("expenses_time <", value, "expensesTime");
            return (Criteria) this;
        }

        public Criteria andExpensesTimeLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("expenses_time <=", value, "expensesTime");
            return (Criteria) this;
        }

        public Criteria andExpensesTimeIn(List<Date> values) {
            addCriterionForJDBCDate("expenses_time in", values, "expensesTime");
            return (Criteria) this;
        }

        public Criteria andExpensesTimeNotIn(List<Date> values) {
            addCriterionForJDBCDate("expenses_time not in", values, "expensesTime");
            return (Criteria) this;
        }

        public Criteria andExpensesTimeBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("expenses_time between", value1, value2, "expensesTime");
            return (Criteria) this;
        }

        public Criteria andExpensesTimeNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("expenses_time not between", value1, value2, "expensesTime");
            return (Criteria) this;
        }

        public Criteria andExpensesDsecIsNull() {
            addCriterion("expenses_dsec is null");
            return (Criteria) this;
        }

        public Criteria andExpensesDsecIsNotNull() {
            addCriterion("expenses_dsec is not null");
            return (Criteria) this;
        }

        public Criteria andExpensesDsecEqualTo(String value) {
            addCriterion("expenses_dsec =", value, "expensesDsec");
            return (Criteria) this;
        }

        public Criteria andExpensesDsecNotEqualTo(String value) {
            addCriterion("expenses_dsec <>", value, "expensesDsec");
            return (Criteria) this;
        }

        public Criteria andExpensesDsecGreaterThan(String value) {
            addCriterion("expenses_dsec >", value, "expensesDsec");
            return (Criteria) this;
        }

        public Criteria andExpensesDsecGreaterThanOrEqualTo(String value) {
            addCriterion("expenses_dsec >=", value, "expensesDsec");
            return (Criteria) this;
        }

        public Criteria andExpensesDsecLessThan(String value) {
            addCriterion("expenses_dsec <", value, "expensesDsec");
            return (Criteria) this;
        }

        public Criteria andExpensesDsecLessThanOrEqualTo(String value) {
            addCriterion("expenses_dsec <=", value, "expensesDsec");
            return (Criteria) this;
        }

        public Criteria andExpensesDsecLike(String value) {
            addCriterion("expenses_dsec like", value, "expensesDsec");
            return (Criteria) this;
        }

        public Criteria andExpensesDsecNotLike(String value) {
            addCriterion("expenses_dsec not like", value, "expensesDsec");
            return (Criteria) this;
        }

        public Criteria andExpensesDsecIn(List<String> values) {
            addCriterion("expenses_dsec in", values, "expensesDsec");
            return (Criteria) this;
        }

        public Criteria andExpensesDsecNotIn(List<String> values) {
            addCriterion("expenses_dsec not in", values, "expensesDsec");
            return (Criteria) this;
        }

        public Criteria andExpensesDsecBetween(String value1, String value2) {
            addCriterion("expenses_dsec between", value1, value2, "expensesDsec");
            return (Criteria) this;
        }

        public Criteria andExpensesDsecNotBetween(String value1, String value2) {
            addCriterion("expenses_dsec not between", value1, value2, "expensesDsec");
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