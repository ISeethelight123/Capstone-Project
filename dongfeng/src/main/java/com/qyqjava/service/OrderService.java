package com.qyqjava.service;

import java.util.List;

import com.qyqjava.pojo.Allocation;
import com.qyqjava.pojo.Orders;

public interface OrderService {

	/*
	 * 查询订单状态为0的订单号
	 */
	
	public List<Orders> showOrderID();
	
	/*
	 * 查询仓库中的空闲状态的货位
	 */
	public List<Allocation> showAllocatedID(String id);
	
	/*
	 * 入库操作
	 */
	public int updateOrder(Allocation allocation);
}
