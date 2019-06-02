package com.qyqjava.pojo;


public class Expenses {
	private Integer no;

	private String expensesName;

	private Long expensesMoney;

	private String expensesTime;

	private String expensesDsec;

	public Integer getNo() {
		return no;
	}

	public void setNo(Integer no) {
		this.no = no;
	}

	public String getExpensesName() {
		return expensesName;
	}

	public void setExpensesName(String expensesName) {
		this.expensesName = expensesName == null ? null : expensesName.trim();
	}

	public Long getExpensesMoney() {
		return expensesMoney;
	}

	public void setExpensesMoney(Long expensesMoney) {
		this.expensesMoney = expensesMoney;
	}

	public String getExpensesTime() {
		return expensesTime;
	}

	public void setExpensesTime(String expensesTime) {
		this.expensesTime = expensesTime;
	}

	public String getExpensesDsec() {
		return expensesDsec;
	}

	public void setExpensesDsec(String expensesDsec) {
		this.expensesDsec = expensesDsec == null ? null : expensesDsec.trim();
	}
}