package com.qyqjava.service;

import java.util.List;

import com.qyqjava.pojo.Expenses;
import com.qyqjava.pojo.Profit;

public interface ProfitService {

	/*
	 * 查询收入总和并添加到表profit 字段income中 同时修改收入和支出
	 */
	public int updatePrefit();

	/*
	 * 显示每个月的利润
	 */
	public List<Profit> showProfitInfo();

	/*
	 * 增加支出单
	 */
	public int addExpenses(Expenses expenses);

	/*
	 * 查看所有支出单
	 */
	public List<Expenses> showExInfo();
	
	/*
	 * 删除支出
	 */
	public int deleteEX(String no);
	/*
	 * 查询所有月份
	 */
	public List<Object> showMonth();
}
