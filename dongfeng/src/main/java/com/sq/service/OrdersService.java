package com.sq.service;

import java.util.List;

import com.sq.pojo.Orders;

public interface OrdersService {
	
	//查询订单(根据id)
	List<Orders> selectOrdersById(String[] arr);
	
	
	
	
}
