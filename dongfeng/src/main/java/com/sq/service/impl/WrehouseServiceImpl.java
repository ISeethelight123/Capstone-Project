package com.sq.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sq.mapper.WrehouseMapper;
import com.sq.pojo.Wrehouse;
import com.sq.service.WrehouseService;
@Service
public class WrehouseServiceImpl implements WrehouseService {

	@Resource(name="wrehouseMappersq")
	WrehouseMapper wrehouseMapper;
	
	/**
	 * 查询仓库地点
	 */
	public List<Wrehouse> selectWrehouse() {
		return wrehouseMapper.selectWrehouse();
	}

	
	public Wrehouse selectWrehouseById(Integer wrehouseId) {
		return wrehouseMapper.selectWrehouseById(wrehouseId);
	}
	

}
