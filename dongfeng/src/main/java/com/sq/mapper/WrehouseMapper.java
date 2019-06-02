package com.sq.mapper;

import java.util.List;

import org.springframework.stereotype.Component;

import com.sq.pojo.Wrehouse;
@Component(value="wrehouseMappersq")
public interface WrehouseMapper {

	/**
	 * 查询仓库地点
	 */
	List<Wrehouse> selectWrehouse();
	/**
	 * 查询仓库地点
	 */
	Wrehouse selectWrehouseById(Integer wrehouseId);
	
	
	
	
}
