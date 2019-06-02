package com.sq.mapper;

import java.util.List;

import com.sq.pojo.NetWork;

public interface NetWorkMapper {

	/**
	 * 网点增加
	 */
	void addNetWork(NetWork network); 
	/**
	 * 网点删除
	 */
	void deleteNetWorkById(Integer networkId);
	/**
	 * 网点批量删除
	 */
	void deleteNetWorkMassById(int[] arrId);
	/**
	 * 网点修改
	 */
	void updateNetWork(NetWork network);
	/**
	 * 网点查询(全部)
	 */
	List<NetWork> selectNetWorkAll();
	/**
	 * 网点查询(单个)
	 */
	NetWork selectNetWorkOneById(Integer networkId);
	
	/**
	 * 网点查询(条件查询)
	 */
	List<NetWork> selectNetWorkChoose(NetWork network);
	/**
	 * 网点查询(模糊查询)
	 */
	List<NetWork> selectNetWorkLike(NetWork network);
	
	
}
