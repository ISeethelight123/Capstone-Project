package com.qyqjava.service.impl;

import java.util.Date;
import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.qyqjava.mapper.AllocationMapper;
import com.qyqjava.mapper.OrdersMapper;
import com.qyqjava.mapper.OutwerhouseMapper;
import com.qyqjava.pojo.Allocation;
import com.qyqjava.pojo.AllocationExample;
import com.qyqjava.pojo.Orders;
import com.qyqjava.pojo.OrdersExample;
import com.qyqjava.pojo.Outwerhouse;
import com.qyqjava.pojo.OutwerhouseExample;
import com.qyqjava.pojo.OutwerhouseExample.Criteria;
import com.qyqjava.service.OutWrehouseService_qyq;

@Service
@Transactional
public class OutWrehouseServiceImpl_qyq implements OutWrehouseService_qyq {
	@Resource(name = "outwerhosueQYQ")
	private OutwerhouseMapper outwerhouseMapper;
	@Resource(name = "allocationQYQ")
	private AllocationMapper allocationMapper;
	@Resource(name = "orderSQYQ")
	private OrdersMapper ordersMapper;

	/*
	 * 查看所有出库单
	 * 
	 * @see com.qyqjava.service.OutWrehouseService_qyq#showOutWrehouseInfo()
	 */
	public List<Outwerhouse> showOutWrehouseInfo() {
		List<Outwerhouse> list = outwerhouseMapper.selectByExample(null);
		System.out.println(list);
		return list;
	}

	/*
	 * 按条件查询出库单
	 */
	public List<Outwerhouse> showOutRequire(String id) {
		OutwerhouseExample oExample = new OutwerhouseExample();
		Criteria criteria = oExample.createCriteria();
		criteria.andOutwerhouseIdEqualTo(Integer.parseInt(id));

		List<Outwerhouse> list = outwerhouseMapper.selectByExample(oExample);
		System.out.println(list);
		return list;
	}

	/*
	 * 查询仓库货位中的所有订单及订单位置
	 */
	public List<Allocation> showOutwerhousesInfo(String id) {
		AllocationExample example = new AllocationExample();
		com.qyqjava.pojo.AllocationExample.Criteria criteria = example.createCriteria();
		criteria.andAllocationTypeEqualTo(1);
		criteria.andWrehouseIdEqualTo(Integer.parseInt(id));

		List<Allocation> list = allocationMapper.selectByExample(example);
		System.out.println(list);
		return list;
	}

	/*
	 * 增加出库单: 1.根据订单号修改 allocation 表中的字段Order_ID 为0、allocation_Type 为0
	 * 2.在订单表order中修改字段order_state 为2 3.在出库单表
	 * outwrehouse中添加字段：outtime（时间）、wrehouse_ID（仓库号）、order_id（订单号）
	 */
	public int addOutWrehouseInfo(Allocation allocation, String id) {
		// 订单号：
		String orderId = allocation.getOrderId();
		// 货位号
		Integer allocationId = allocation.getAllocationId();
		// 仓库号
		Integer wrehouseId = allocation.getWrehouseId();
		System.out.println("添加出库单"+allocation);
		// 1.格据货位号为条件
		AllocationExample allocationExample = new AllocationExample();
		com.qyqjava.pojo.AllocationExample.Criteria AllCriteria = allocationExample.createCriteria();
		AllCriteria.andAllocationIdEqualTo(allocationId);
		AllCriteria.andWrehouseIdEqualTo(Integer.parseInt(id));

		Allocation allocation2 = new Allocation();
		allocation2.setAllocationType(0);
		allocation2.setOrderId("0");
		int k = allocationMapper.updateByExampleSelective(allocation2, allocationExample);

		// 2.在订单表order中修改字段order_state 为2
		OrdersExample ordersExample = new OrdersExample();
		com.qyqjava.pojo.OrdersExample.Criteria ordersCriteria = ordersExample.createCriteria();
		ordersCriteria.andOrderIdEqualTo(Integer.parseInt(orderId));

		Orders orders = new Orders();
		orders.setOrderState(0);
		int j = ordersMapper.updateByExampleSelective(orders, ordersExample);

		// 3.outwrehouse中添加字段：outtime（时间）、wrehouse_ID（仓库号）、order_id（订单号）
		Date date = new Date();
		Outwerhouse outwerhouse = new Outwerhouse();
		outwerhouse.setOuttime(date);
		outwerhouse.setOrderId(Integer.parseInt(orderId));
		outwerhouse.setWrehouseId(wrehouseId);

		int i = outwerhouseMapper.insertSelective(outwerhouse);
		System.out.println("i--" + i + "j--" + j + "k--" + k);
		if (i == 1 && j == 1 && k == 1) {
			return 1;
		} else {
			return 0;
		}
	}

	/*
	 * 根据订单号查询仓位号
	 */
	public List<Allocation> showOWinfo(String id) {
		AllocationExample example = new AllocationExample();
		com.qyqjava.pojo.AllocationExample.Criteria criteria = example.createCriteria();
		criteria.andOrderIdEqualTo(id);

		List<Allocation> list = allocationMapper.selectByExample(example);
		System.out.println(list);
		return list;
	}

}
