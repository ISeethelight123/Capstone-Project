package com.sq.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sq.mapper.ChinaMapper;
import com.sq.pojo.China;
import com.sq.service.ChinaService;
@Service
public class ChinaServiceImpl implements ChinaService {
	
	@Autowired
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
