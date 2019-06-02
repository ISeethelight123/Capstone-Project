package com.sq.mapper;

import java.util.List;

import org.springframework.stereotype.Component;

import com.sq.pojo.Orders;
@Component(value="ordersMappersq")
public interface OrdersMapper {

	List<Orders> selectOrdersById(String[] arr);
	
	
	
	
}
