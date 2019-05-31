package com.qyqjava.mapper;

import com.qyqjava.pojo.Wrehouse;
import com.qyqjava.pojo.WrehouseExample;
import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Param;

public interface WrehouseMapper {
	int countByExample(WrehouseExample example);

	int deleteByExample(WrehouseExample example);

	int deleteByPrimaryKey(Integer wrehouseId);

	int insert(Wrehouse record); //增加仓库

	int insertSelective(Wrehouse record);

	List<Wrehouse> selectByExample(WrehouseExample example);

	Wrehouse selectByPrimaryKey(Integer wrehouseId);

	int updateByExampleSelective(@Param("record") Wrehouse record, @Param("example") WrehouseExample example);

	int updateByExample(@Param("record") Wrehouse record, @Param("example") WrehouseExample example);

	int updateByPrimaryKeySelective(Wrehouse record);

	int updateByPrimaryKey(Wrehouse record);

	List<Map<String, Object>> showWerhouseInfo();
	
	List<Map<String, Object>> showByRequir(Wrehouse wrehouse);
	
	int showWrehouseID(String wreAdd);
	
}