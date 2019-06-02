package com.sq.mapper;

import java.util.List;

import com.sq.pojo.Line;

public interface LineMapper {

	/**
	 * 路线增加
	 */
	void addLine(Line line); 
	/**
	 * 路线删除
	 */
	void deleteLineById(Integer LineId);
	/**
	 * 路线批量删除
	 */
	void deleteLineMassById(int[] arrId);
	/**
	 * 路线修改
	 */
	void updateLine(Line line);
	/**
	 * 路线查询(全部车辆)
	 */
	List<Line> selectLineAll();
	/**
	 * 路线查询(单个车辆)
	 */
	Line selectLineOneById(Integer LineId);
	
	/**
	 * 路线查询(条件查询)
	 */
	List<Line> selectLineChoose(Line line);
	/**
	 * 路线查询(模糊查询)
	 */
	//List<Line> selectLineLike(Line line);
	
	
	
	
	
}
