package com.sq.mapper;

import java.util.List;

import org.springframework.stereotype.Component;

import com.sq.pojo.China;
@Component(value="chinaMappersq")
public interface ChinaMapper {

	
	/**
	 * 查询所有省区
	 */
	List<China> selectprovincebyid();
	
	
}
