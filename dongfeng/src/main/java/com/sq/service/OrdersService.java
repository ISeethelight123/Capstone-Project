package com.sq.service;

import java.util.List;

import org.springframework.stereotype.Component;

import com.sq.pojo.Orders;
@Component("ordersServicesq")
public interface OrdersService {
	
	//查询订单(根据id)
	List<Orders> selectOrdersById(String[] arr);
	
	
	
	
}
