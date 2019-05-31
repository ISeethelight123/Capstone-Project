package com.qyqjava.controller;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.qyqjava.pojo.Inwrehouse;
import com.qyqjava.pojo.Outwerhouse;
import com.qyqjava.service.InwrehouseService;
import com.qyqjava.service.OutWrehouseService_qyq;
import com.qyqjava.service.WrehouseService_qyq;

@Controller
@RequestMapping("/connection")
public class ConnecTion {
	@Autowired
	private WrehouseService_qyq WrehouseService;
	@Autowired
	private InwrehouseService inwrehouseService;
	@Autowired
	private OutWrehouseService_qyq outwrehosueService;

	@RequestMapping("/gomain")
	public String goMain() {
		return "main";
	}

	/*
	 * 跳转到仓库信息页面
	 */
	@RequestMapping("/goWrehouseInfo")
	public String goWrehouseInfo(Model model) {
		// 所有仓库的信息--编号，地址代号，地址，电话，巷道数，货架数，货位数
		List<Map<String, Object>> list = WrehouseService.showWrehouseInfo();
		model.addAttribute("list", list);
		return "WrehouseInfo";
	}

	/*
	 * 跳转到入库界面
	 */
	@RequestMapping("/goInWrehouse")
	public String goInWrehouse(Model model) {
		// 显示所有的入库单信息：编号，入库单号，创建时间
		List<Inwrehouse> list = inwrehouseService.showInWrehouseInfo();
		model.addAttribute("list", list);
		System.out.println(list);
		return "InWrehouse";
	}

	/*
	 * 跳转到出库界面
	 */
	@RequestMapping("/goOutWrehouse")
	public String goOutWrehouse(Model model) {
		// 显示所有的出库单信息：编号，出库单号，创建时间
		List<Outwerhouse> list = outwrehosueService.showOutWrehouseInfo();
		model.addAttribute("list", list);
		return "OutWrehouse";
	}

}
