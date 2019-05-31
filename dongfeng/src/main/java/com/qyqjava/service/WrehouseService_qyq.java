package com.qyqjava.service;
/**
 * 仓库serivice
 * @author Sakure
 *
 */

import java.util.List;
import java.util.Map;

import com.qyqjava.pojo.Relation;
import com.qyqjava.pojo.Wrehouse;

public interface WrehouseService_qyq {
	/*
	 * 显示仓库的信息
	 */
	public List<Map<String, Object>> showWrehouseInfo();

	/*
	 * 根据条件查询
	 */
	public List<Map<String, Object>> showByRequie(String num, String requir);

	/*
	 * 增加仓库信息
	 */
	public int addWrehouseInfo(Wrehouse wrehouse, Relation relation);

	/*
	 * 删除仓库
	 */
	public int deleteWrehouse(String id);

}
