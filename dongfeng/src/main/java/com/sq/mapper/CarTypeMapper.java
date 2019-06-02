package com.sq.mapper;

import java.util.List;

import org.springframework.stereotype.Component;

import com.sq.pojo.CarType;

public interface CarTypeMapper {

	List<CarType> selectTypeAll();
	
}
