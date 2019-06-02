package com.sq.service;

import java.util.List;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import com.sq.pojo.Wrehouse;

public interface WrehouseService {

	/**
	 * 查询仓库地点
	 */
	List<Wrehouse> selectWrehouse();
	
	/**
	 * 查询仓库地点
	 */
	Wrehouse selectWrehouseById(Integer wrehouseId);
	
	
}
