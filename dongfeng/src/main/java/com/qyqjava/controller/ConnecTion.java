package com.qyqjava.controller;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.qyqjava.mapper.AllocationMapper;
import com.qyqjava.pojo.Inwrehouse;
import com.qyqjava.pojo.Outwerhouse;
import com.qyqjava.pojo.Wrehouse;
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
	@Resource(name = "allocationQYQ")
	private AllocationMapper allocationMapper;

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

	/*
	 * 显示仓库订单主页 1.查询仓库的名称 2.查询仓库的订单量
	 */
	@RequestMapping("/goWrePerent")
	public String goWrePerent(Model model) {
		List<String> listx = new ArrayList<>();
	
		// 查询仓库名称
		List<Wrehouse> showWre = WrehouseService.showWre();
		for (Wrehouse wrehouse : showWre) {
			listx.add(wrehouse.getWrehouseName());
		}
		// 查询仓库的订单数
		List<Object> listy = new ArrayList<>();
		List<Object> showAllNum = allocationMapper.showAllNum();
		for (Object object : showAllNum) {
			listy.add(object);
		}
		
		model.addAttribute("listx", listx);
		model.addAttribute("listy", listy);
		return "WrePerent";
	}
}
