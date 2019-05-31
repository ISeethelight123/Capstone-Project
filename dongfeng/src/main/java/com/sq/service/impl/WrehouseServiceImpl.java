package com.sq.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sq.mapper.WrehouseMapper;
import com.sq.pojo.Wrehouse;
import com.sq.service.WrehouseService;
@Service
public class WrehouseServiceImpl implements WrehouseService {

	@Autowired
	WrehouseMapper wrehouseMapper;
	
	/**
	 * 查询仓库地点
	 */
	public List<Wrehouse> selectWrehouse() {
		return wrehouseMapper.selectWrehouse();
	}
	

}
