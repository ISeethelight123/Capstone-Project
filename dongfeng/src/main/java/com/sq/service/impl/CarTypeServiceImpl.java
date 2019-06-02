package com.sq.service.impl;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sq.mapper.CarTypeMapper;
import com.sq.pojo.CarType;
import com.sq.service.CarTypeService;
@Service
public class CarTypeServiceImpl implements CarTypeService {

	@Autowired
	CarTypeMapper carTypeMapper;
	
	public List<CarType> selectTypeAll() {
		return carTypeMapper.selectTypeAll();
	}

}
