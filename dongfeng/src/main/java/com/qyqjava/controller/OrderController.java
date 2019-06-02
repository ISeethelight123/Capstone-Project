package com.qyqjava.controller;

import java.util.HashSet;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.qyqjava.pojo.Allocation;
import com.qyqjava.pojo.Orders;
import com.qyqjava.pojo.Relation;
import com.qyqjava.service.InwrehouseService;
import com.qyqjava.service.OrderService;

@Controller
@RequestMapping("/ourderCon")
public class OrderController {
	@Autowired
	private OrderService orderService;
	@Autowired
	private InwrehouseService inwrehouseService;

	/*
	 * 查询订单状态为0的订单号，跳转到增加入库单页面
	 */
	/**
	 * 录入出库单： 1，针对几号仓库 2，判断该订单号的位置：是否在本地仓库，是需巷道号，货架号，货位号 方法：如，根据订单号查询1号仓库的135号位置
	 * 4号巷道 2号货架 5号货位 135号 135/40 = 3 15/10 x/(a*b)+1即巷道号 x=135 a=表 relation 的shelf
	 * * allocationNum 上式的余数c c/10+1即货架号 10 = 表 relation 的 allocation 上式的余数d 即货位号
	 */
	@RequestMapping("/showOrderInfo")
	public String showOrderInfo(Model model, String id) {
		// 查询订单状态为0的订单号
		List<Orders> orderList = orderService.showOrderID();
		// 查询关系表
		List<Relation> relationList = inwrehouseService.showRelation(id);
		// 巷道集合
		HashSet<Integer> roadway = new HashSet<>();
		for (int i = 1; i <= relationList.get(0).getRoadway(); i++) {
			roadway.add(i);
		}

		// 货架结合
		HashSet<Integer> shelf = new HashSet<>();
		for (int i = 1; i <= relationList.get(0).getShelf(); i++) {
			shelf.add(i);
		}

		// 货位集合
		HashSet<Integer> allocationList = new HashSet<>();
		for (int i = 1; i <= relationList.get(0).getAllocationnum(); i++) {
			allocationList.add(i);
		}

		model.addAttribute("orderList", orderList);
		model.addAttribute("roadway", roadway);
		model.addAttribute("shelf", shelf);
		model.addAttribute("allocationList", allocationList);
		model.addAttribute("id", id);
		return "PLinsertWre";
	}

	/*
	 * 入库方法： 1.表 allocation 中找到对应的仓库，对应的货架 2.修改字段
	 * orderID(订单号)，allocation_Type（状态）的值。 3.修改表 orders
	 * 对应的订单号所对应的oredr_state的状态，oreder_nowAddress(当前地址)即仓库号
	 * 4.将当前所操作的订单号存入表inwrehouse中，id为自动生成inwrehouse id
	 * 
	 */
	/*
	 * 增加入库单： 1.提示操作几号仓库 2.一个入库单对应多个订单 即要实现订单的批量增加
	 * 先在表：inwrihouse（入库表中添加入库信息，获取inwrehouse_id 存入到表 ordertotel 和ordertotel_id想对应
	 * 同时将对应的订单号排入到相应的库存中，提供巷道号，货架号，货位号找到表中相应的额货位号：
	 * 如1号仓库，x号巷道，y号货架，z号货位，则在表中的位置为wrehouse_ID = 1 AND allocation_ID = ()
	 *  (x -(x- 1) * a + (y-(y - 1) * b + z a = 表relation中 shelf * allocation b = 表relation中
	 * allocation
	 */
	@RequestMapping("/addInWre")
	@ResponseBody
	public int addInWre(String wrehouseId ,String orderId,String allocationId,String shelf, String roadway) {
		Allocation allocation = new Allocation();
		allocation.setWrehouseId(Integer.parseInt(wrehouseId));
		allocation.setOrderId(orderId);
		
		// 查询关系表
		List<Relation> relationList = inwrehouseService.showRelation(wrehouseId);
		int x = Integer.parseInt(roadway);
		int y = Integer.parseInt(shelf);
		int z = Integer.parseInt(allocationId);
		Integer a = relationList.get(0).getShelf();
		Integer b = relationList.get(0).getAllocationnum();
		Integer allocation_ID = (x- 1) * a* b + (y - 1) * b + z;
		allocation.setAllocationId(allocation_ID);
		System.out.println(allocation);
		
		int i = orderService.updateOrder(allocation);
		System.out.println(i);
		return i;
	}

	/*
	 * 修改入库单
	 */
	@RequestMapping("/udOrdInfo")
	@ResponseBody
	public int udOrdInfo(String id, String orderId) {
		int i = inwrehouseService.udInwreInfo(id, orderId);
		return i;
	}

}
