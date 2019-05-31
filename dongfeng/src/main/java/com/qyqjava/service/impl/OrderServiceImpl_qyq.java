package com.qyqjava.service.impl;

import java.util.Date;
import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.qyqjava.mapper.AllocationMapper;
import com.qyqjava.mapper.InwrehouseMapper;
import com.qyqjava.mapper.OrdersMapper;
import com.qyqjava.pojo.Allocation;
import com.qyqjava.pojo.AllocationExample;
import com.qyqjava.pojo.Inwrehouse;
import com.qyqjava.pojo.Orders;
import com.qyqjava.pojo.OrdersExample;
import com.qyqjava.pojo.OrdersExample.Criteria;
import com.qyqjava.service.OrderService;

@Service
@Transactional
public class OrderServiceImpl_qyq implements OrderService {
	@Resource(name = "ordersQYQ")
	private OrdersMapper ordersMapper;
	@Resource(name = "allocationQYQ")
	private AllocationMapper allocationMapper;
	@Resource(name = "inwrehouseQYQ")
	private InwrehouseMapper inwrehouseMapper;

	/*
	 * 
	 * (non-Javadoc)查询订单状态为0的订单号
	 * 
	 * @see com.qyqjava.service.OrderService#showOrderID()
	 */
	public List<Orders> showOrderID() {
		OrdersExample example = new OrdersExample();
		Criteria criteria = example.createCriteria();
		criteria.andOrderStateEqualTo(0);
		List<Orders> list = ordersMapper.selectByExample(example);
		System.out.println(list);
		return list;
	}

	/*
	 * (non-Javadoc) 查询空闲货位
	 * 
	 * @see com.qyqjava.service.OrderService#showAllocatedID()
	 */
	public List<Allocation> showAllocatedID(String id) {
		AllocationExample example = new AllocationExample();
		com.qyqjava.pojo.AllocationExample.Criteria criteria = example.createCriteria();
		criteria.andAllocationTypeEqualTo(0);
		criteria.andWrehouseIdEqualTo(Integer.parseInt(id));
		List<Allocation> list = allocationMapper.selectByExample(example);
		System.out.println(list);
		return list;
	}

	/*
	 * 入库方法： 1.表 allocation 中找到对应的仓库，对应的货架 2.修改字段
	 * orderID(订单号)，allocation_Type（状态）的值。 3.修改表 orders
	 * 对应的订单号所对应的oredr_state的状态，oreder_nowAddress(当前地址)即仓库号
	 * 4.增加入库单号：inwrehouse：inwrehouse_time``wrehouse_id``order_id``
	 * 
	 */
	public int updateOrder(Allocation allocation) {
		// 订单号：
		String orderId = allocation.getOrderId();
		// 货位号：
		Integer allocationId = allocation.getAllocationId();
		// 仓库号
		Integer wrehouseId = allocation.getWrehouseId();

		// 先查询该货位表中是否有货物
		AllocationExample showallexample = new AllocationExample();
		com.qyqjava.pojo.AllocationExample.Criteria showallCritteria = showallexample.createCriteria();
		showallCritteria.andAllocationIdEqualTo(allocationId);
		List<Allocation> byExample = allocationMapper.selectByExample(showallexample);
		if (byExample.get(0).getAllocationType() == 0) {
			// 创建货位表的example类
			AllocationExample allexample = new AllocationExample();
			com.qyqjava.pojo.AllocationExample.Criteria allCriteria = allexample.createCriteria();
			allCriteria.andWrehouseIdEqualTo(wrehouseId);
			allCriteria.andAllocationIdEqualTo(allocationId);
			allCriteria.andWrehouseIdEqualTo(wrehouseId);
			// 2,修改表 allocation
			allocation.setAllocationType(1);
			int i = allocationMapper.updateByExampleSelective(allocation, allexample);

			// 3,修改Orders表
			OrdersExample ordersExample = new OrdersExample();
			Criteria orderCriteria = ordersExample.createCriteria();
			orderCriteria.andOrderIdEqualTo(Integer.parseInt(orderId));

			Orders orders = new Orders();
			orders.setOrderNowaddress(wrehouseId.toString());
			orders.setOrderState(1);
			int k = ordersMapper.updateByExampleSelective(orders, ordersExample);

			// 4,增加入库单号：inwrehouse：inwrehouse_time``wrehouse_id``order_id``
			Date date = new Date();
			Inwrehouse inwrehouse = new Inwrehouse();
			inwrehouse.setInwrehouseTime(date);
			inwrehouse.setWrehouseId(wrehouseId);
			inwrehouse.setOrderId(Integer.parseInt(orderId));
			int j = inwrehouseMapper.insertSelective(inwrehouse);

			System.out.println("i--" + i + "j--" + j + "k--" + k);
			if (i == 1 && j == 1 && k == 1) {
				return 1;
			} else {
				return 0;
			}
		} else {
			return 0;
		}

	}

}
