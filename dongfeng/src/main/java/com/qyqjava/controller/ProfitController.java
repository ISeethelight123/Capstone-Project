package com.qyqjava.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.qyqjava.pojo.Expenses;
import com.qyqjava.pojo.Profit;
import com.qyqjava.service.ProfitService;

@Controller
@RequestMapping("/profit")
public class ProfitController {
	@Autowired
	private ProfitService profitService;

	/*
	 * 显示财务表的信息
	 */
	@RequestMapping("/showProfitInfo")
	public String showProfitInfo(Model model) {
		profitService.updatePrefit();
		List<Profit> list = profitService.showProfitInfo();
		model.addAttribute("list", list);
		return "showPf";
	}

	/*
	 * 跳转到支出界面
	 */
	@RequestMapping("/expenses")
	public String addExpenseInfo(Model model) {
		List<Expenses> list = profitService.showExInfo();
		model.addAttribute("list", list);
		return "Expenses";
	}

	/*
	 * 添砖增加支出界面
	 */
	@RequestMapping("/insertexpenses")
	public String insertexpenses() {
		return "addExpenses";
	}

	/*
	 * 增加支出
	 */
	@RequestMapping("/addExpense")
	@ResponseBody
	public int addExpense(Expenses expenses) {
		int i = profitService.addExpenses(expenses);
		return i;
	}

	/*
	 * 删除支出
	 */
	@RequestMapping("/deleteEX")
	@ResponseBody
	public int deleteEX(String no) {
		int i = profitService.deleteEX(no);
		return i;
	}

	/*
	 * 跳转到财务分析界面
	 */
	@RequestMapping("profitAssay")
	public String profitAssay() {
		return "ProfitAssisa";
	}

}
