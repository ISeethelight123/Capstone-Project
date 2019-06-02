package com.qyqjava.service;

import java.util.List;

import com.qyqjava.pojo.Inwrehouse;
import com.qyqjava.pojo.Relation;

public interface InwrehouseService {
	
	/*
	 * 查询全部
	 */
	public List<Inwrehouse> showInWrehouseInfo();
	
	
	/*
	 * 根据入库单号查询
	 */
	public List<Inwrehouse> showInWreRequire(String id);

	/*
	 * 修改入库单
	 */
	
	public int udInwreInfo(String id, String orderId);
	
	/*
	 * 查询关系表
	 */
	public List<Relation> showRelation(String id);
}
