package com.sq.mapper;

import java.util.List;

import com.sq.pojo.Orders;

public interface OrdersMapper {

	List<Orders> selectOrdersById(String[] arr);
	
	
	
	
}
