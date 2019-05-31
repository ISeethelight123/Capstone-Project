package com.sq.service.impl;

import java.util.List;

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
	 * 查询省区
	 */
	public List<China> selectprovincebyid() {
		return chinaMapper.selectprovincebyid();
	}

	

}
