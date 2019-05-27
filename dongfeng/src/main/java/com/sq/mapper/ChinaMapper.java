package com.sq.mapper;

import com.sq.pojo.China;

public interface ChinaMapper {

	/**
	 * 查询市区
	 */
	China selectcitybyid(Integer id);
	
	/**
	 * 查询省区
	 */
	String selectprovincebypid(Integer pid);
	
	
}
