package com.sq.service;

import java.util.List;

import org.springframework.stereotype.Component;

import com.sq.pojo.China;
@Component(value="chinaServicesq")
public interface ChinaService {

	
	/**
	 * 查询省区
	 */
	List<China> selectprovincebyid();
	
	
	
	
	
}
