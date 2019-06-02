package com.sq.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sq.mapper.CarLoadMapper;
import com.sq.pojo.CarLoad;
import com.sq.service.CarLoadService;
@Service
public class CarLoadServiceImpl implements CarLoadService {

	@Autowired
	CarLoadMapper carLoadMapper;
	
	/**
	 * 查询所有载重类型
	 */
	public List<CarLoad> selecLoadtAll() {
		return carLoadMapper.selecLoadtAll();
	}

}
