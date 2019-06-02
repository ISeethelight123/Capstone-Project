package com.sq.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Service;

import com.sq.mapper.OrdersMapper;
import com.sq.pojo.Orders;
import com.sq.service.OrdersService;
@Service(value="ordersServicesq")
public class OrdersServiceImpl implements OrdersService {

	@Resource(name="ordersMappersq")
	OrdersMapper ordersMapper;
	
	//查询订单(根据id)
	public List<Orders> selectOrdersById(String[] arr) {
		return ordersMapper.selectOrdersById(arr);
	}

}
