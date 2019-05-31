package com.qyqjava.controller;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.qyqjava.pojo.Allocation;
import com.qyqjava.pojo.Outwerhouse;
import com.qyqjava.pojo.Relation;
import com.qyqjava.service.InwrehouseService;
import com.qyqjava.service.OutWrehouseService_qyq;

/**
 * 提供对出库单的相应信息
 * 
 * @author Sakure
 *
 */
@Controller
@RequestMapping("/outWrhouse")
public class OutWrehouseControler_qyq {
	@Autowired
	private OutWrehouseService_qyq outWrehouse;
	@Autowired
	private InwrehouseService InwrehouseService;

	/**
	 * 条件查询
	 * 
	 * @param wreSel_qyq
	 * @param inputname
	 * @return
	 */
	@RequestMapping("/selectRequire")
	public String selectRequire(String id, Model model) {
		List<Outwerhouse> list = outWrehouse.showOutRequire(id);
		model.addAttribute("list", list);
		return "OutWrehouse";
	}

	/*
	 * 查询仓库中的已有的货物
	 */
	@RequestMapping("/showOutWreInfo")
	public String showOutWreInfo(String id, Model model) {
		List<Allocation> list = outWrehouse.showOutwerhousesInfo(id);
		model.addAttribute("list", list);
		model.addAttribute("id", id);
		return "PLoutWre";
	}

	/*
	 * 根据订单号查询订单仓位
	 */
	/**
	 * 录入出库单： 1，针对几号仓库 2，判断该订单号的位置：是否在本地仓库，是需巷道号，货架号，货位号 方法：如，根据订单号查询1号仓库的135号位置
	 * 4号巷道 2号货架 5号货位 135号 135/40 = 3 15/10 x/(a*b)+1 即巷道号 x=135 a=表 relation 的
	 * shelf * allocationNum 上式的余数c c/10+1即货架号 10 = 表 relation 的 allocation 上式的余数d
	 * 即货位号
	 */

	@RequestMapping("/showOWreAlloInfo")
	@ResponseBody
	public List<Map<String, Object>> showOutWreInfo(String orderId, String wrehouseId) {
		// 查询仓位号
		List<Allocation> list = outWrehouse.showOWinfo(orderId);
		Integer allocationId = list.get(0).getAllocationId();
		// 将仓位号分解位巷道号，货架号，货位号
		// 查询关系表
		List<Relation> relationList = InwrehouseService.showRelation(wrehouseId);
		Integer a = relationList.get(0).getShelf();
		Integer b = relationList.get(0).getAllocationnum();
		// 巷道号
		Integer roadway = allocationId / (a * b) + 1;
		// 货架号
		Integer shelf = (allocationId % (a * b)) / 10 + 1;
		// 货位号
		Integer allocation = (allocationId % (a * b)) % 10;
		List<Map<String, Object>> lMaps = new ArrayList<>();
		Map<String, Object> map = new HashMap<>();
		map.put("roadway", roadway);
		map.put("shelf", shelf);
		map.put("allocation", allocation);
		lMaps.add(map);
		System.out.println("a="+a+"\tb="+b+"\tx="+roadway+"\ty="+shelf+"\tz"+allocation);
		return lMaps;
	}

	/**
	 * 增加出库单
	 */
	/*
	 * 增加入库单： 1.提示操作几号仓库 2.一个入库单对应多个订单 即要实现订单的批量增加
	 * 先在表：inwrihouse（入库表中添加入库信息，获取inwrehouse_id 存入到表 ordertotel 和ordertotel_id想对应
	 * 同时将对应的订单号排入到相应的库存中，提供巷道号，货架号，货位号找到表中相应的额货位号：
	 * 如1号仓库，x号巷道，y号货架，z号货位，则在表中的位置为wrehouse_ID = 1 AND allocation_ID = () (x -(x-
	 * 1) * a + (y-(y - 1) * b + z a = 表relation中 shelf * allocation b = 表relation中
	 * allocation
	 */
	@RequestMapping("/addOutWreInfo")
	@ResponseBody
	public int addOutWreInfo(String wrehouseId, String orderId, String roadway, String shelf, String allocation) {
		// 查询关系表
		List<Relation> relationList = InwrehouseService.showRelation(wrehouseId);

		Integer a = relationList.get(0).getShelf();
		Integer b = relationList.get(0).getAllocationnum();

		Allocation allocation2 = new Allocation();
		allocation2.setOrderId(orderId);
		allocation2.setWrehouseId(Integer.parseInt(wrehouseId));

		Integer x = Integer.parseInt(roadway);
		Integer y = Integer.parseInt(shelf);
		Integer z = Integer.parseInt(allocation);

		Integer allo = (x - 1) * a * b + (y - 1) * b + z;
		allocation2.setAllocationId(allo);

		int i = outWrehouse.addOutWrehouseInfo(allocation2, wrehouseId);
		return i;
	}
}
