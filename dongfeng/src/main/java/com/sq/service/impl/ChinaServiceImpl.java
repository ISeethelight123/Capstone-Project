package com.sq.service.impl;

import com.sq.mapper.ChinaMapper;
import com.sq.pojo.China;
import com.sq.service.ChinaService;

public class ChinaServiceImpl implements ChinaService {
	
	
	ChinaMapper chinaMapper;

	/**
	 * 查询市区
	 */
	public China selectcitybyid(Integer id) {
		return chinaMapper.selectcitybyid(id);
	}

	/**
	 * 查询省区
	 */
	public String selectprovincebypid(Integer pid) {
		return chinaMapper.selectprovincebypid(pid);
	}

}
