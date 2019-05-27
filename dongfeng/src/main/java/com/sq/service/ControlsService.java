package com.sq.service;

import java.util.List;

import com.sq.pojo.Controls;

public interface ControlsService {

	/**
	 * 运单增加
	 */
	void addControls(Controls con); 
	/**
	 * 运单删除
	 */
	void deleteControlsById(Integer ControlsId);
	/**
	 * 运单批量删除
	 */
	void deleteControlsMassById(int[] arrId);
	/**
	 * 运单修改
	 */
	void updateControls(Controls con);
	/**
	 * 运单查询(全部运单)
	 */
	List<Controls> selectControlsAll();
	/**
	 * 运单查询(单个运单)
	 */
	Controls selectControlsOneByControlsId(Integer ControlsId);
	/**
	 * 运单查询(条件运单)
	 */
	List<Controls> selectControlsChoose(Controls con);
	/**
	 * 运单查询(模糊运单)
	 */
	//List<Controls> selectControlsLike(Controls con);
	
	
	
}
