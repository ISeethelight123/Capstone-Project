package com.sq.mapper;

import java.util.List;

import com.sq.pojo.Controls;
import com.sq.pojo.ControlsQueryVo;
/**
 *  运单接口类
 * @author sunqi
 *
 */
public interface ControlsMapper {

	/**
	 * 运单增加
	 */
	Integer addControls(Controls con); 
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
	 * 运单查询(分页对象)
	 */
	List<Controls> selectControlsAllByControlsQueryVo(ControlsQueryVo vo);
	/**
	 * 运单查询(符合条件的运单数量)
	 */
	Integer selectControlsCountByControlsQueryVo(ControlsQueryVo vo);
	
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
	
	/**
	 * 查询调度单的id最大值
	 */
	Integer selectMaxControlsId();
	
}
