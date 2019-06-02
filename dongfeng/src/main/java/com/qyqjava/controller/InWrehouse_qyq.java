package com.qyqjava.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.qyqjava.pojo.Inwrehouse;
import com.qyqjava.service.InwrehouseService;

/**
 * 主要处理入库单方面的请求
 * 
 * @author 10841
 *
 */
@Controller
@RequestMapping("/InWrehouse")
public class InWrehouse_qyq {
	@Autowired
	private InwrehouseService inwrehouseService;

	/*
	 * 增加入库单： 1.提示操作几号仓库 2.一个入库单对应多个订单 即要实现订单的批量增加
	 * 先在表：inwrihouse（入库表中添加入库信息，获取inwrehouse_id 存入到表 ordertotel 和ordertotel_id想对应
	 * 同时将对应的订单号排入到相应的库存中，提供巷道号，货架号，货位号找到表中相应的额货位号：
	 * 如1号仓库，x号巷道，y号货架，z号货位，则在表中的位置为wrehouse_ID = 1 AND allocation_ID = () (x -(x-
	 * 1) * a + (y-(y - 1) * b + z a = 表relation中 shelf * allocation b = 表relation中
	 * allocation
	 */

	/*
	 * 修改入库单：先查询对应入库单号下的所有订单号，再修改订单号
	 */

	/*
	 * 按单号查询
	 */
	@RequestMapping("/showInWreRequire")
	public  String showInWreRequire(String id,Model model) {
		List<Inwrehouse> list = inwrehouseService.showInWreRequire(id);
		model.addAttribute("list", list);
		return "InWrehouse";
	}
	
	
}
