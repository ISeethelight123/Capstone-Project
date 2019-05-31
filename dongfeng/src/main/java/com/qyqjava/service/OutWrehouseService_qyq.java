package com.qyqjava.service;

import java.util.List;

import com.qyqjava.pojo.Allocation;
import com.qyqjava.pojo.Outwerhouse;

public interface OutWrehouseService_qyq {

	public List<Outwerhouse> showOutWrehouseInfo();

	/*
	 * 按条件查询
	 */
	public List<Outwerhouse> showOutRequire(String id);

	/*
	 * 增加出库单
	 */
	public int addOutWrehouseInfo(Allocation allocation,String id);
	
	/*
	 * 查询仓库货位中的所有订单及订单位置
	 */
	public List<Allocation> showOutwerhousesInfo(String id);

	/*
	 * 根据订单号查询仓位号
	 */
	public List<Allocation> showOWinfo(String id);
}
