package com.qyqjava.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.qyqjava.mapper.ExpensesMapper;
import com.qyqjava.mapper.ProfitMapper;
import com.qyqjava.pojo.Expenses;
import com.qyqjava.pojo.Profit;
import com.qyqjava.service.ProfitService;

@Service
@Transactional
public class ProfitServiceImpl implements ProfitService {
	@Resource(name = "profitMapperQYQ")
	private ProfitMapper ProfitMapper;
	@Resource(name = "expensesMapperQYQ")
	private ExpensesMapper expensesMapper;

	/*
	 * (non-Javadoc)将六月份的收入加入到表中 同时修改收入和支出
	 * 
	 * @see com.qyqjava.service.ProfitService#updateIncome()
	 */
	public int updatePrefit() {
		int income = ProfitMapper.updateIncome();
		int i = ProfitMapper.updateExpenses();
		int pi = ProfitMapper.updateprofit();
		System.out.println("icome" + income + "i" + i + "pi" + pi);
		if (i == 1 && income == 1 && pi == 1) {
			return 1;
		} else {
			return 0;
		}
	}

	/*
	 * (non-Javadoc)显示每个月的收入和利润
	 * 
	 * @see com.qyqjava.service.ProfitService#showProfitInfo()
	 */
	public List<Profit> showProfitInfo() {
		List<Profit> list = ProfitMapper.selectByExample(null);
		System.out.println("ProfitList" + list);
		return list;
	}

	/*
	 * 查看所有支出单
	 */
	public List<Expenses> showExInfo() {
		List<Expenses> list = expensesMapper.selectByExample(null);
		return list;
	}

	/*
	 * 增加支出单
	 */
	public int addExpenses(Expenses expenses) {
		int i = expensesMapper.insertSelective(expenses);
		System.out.println(i);
		return i;
	}

	/*
	 * (non-Javadoc)删除支出单
	 * 
	 * @see com.qyqjava.service.ProfitService#deleteEX(java.lang.String)
	 */
	public int deleteEX(String no) {
		int i = expensesMapper.deleteByPrimaryKey(Integer.parseInt(no));
		System.out.println("deleteEX"+i);
		return i;
	}

	/*
	 * (non-Javadoc)查询所有月份
	 * 
	 * @see com.qyqjava.service.ProfitService#showMonth()
	 */
	public List<Object> showMonth() {
		List<Object> month = ProfitMapper.showMonth();
		System.out.println(month);
		return month;
	}
}
