package com.sq.service;

import java.util.List;

import com.sq.pojo.Waybil;

public interface WaybilService {

	/**
	 * 运单增加
	 */
	void addWaybil(Waybil waybil); 
	/**
	 * 运单删除(根据运单号)
	 */
	void deleteWaybilByWaybilId(Integer waybilId);
	
	/**
	 * 运单删除(根据运单表oid)
	 */
	void deleteWaybilByWaybilOid(Integer waybilOid);
	
	/**
	 * 运单批量删除(根据运单表oid)
	 */
	void deleteWaybilMassById(int[] arrId);
	/**
	 * 运单修改
	 */
	void updateWaybil(Waybil waybil);
	/**
	 * 运单查询(全部)
	 */
	List<Waybil> selectWaybilAll();
	/**
	 * 运单查询(单个运单)
	 */
	List<Waybil> selectWaybilOneById(Integer waybilId);
	
	/**
	 * 运单查询(条件查询)
	 */
	List<Waybil> selectWaybilChoose(Waybil waybil);
	
	/**
	 * 生成运单号的最大值
	 */
	Integer selectMaxWaybilId();
	
	/**
	 * 批量生成运单
	 */
	void addWaybilMass(List<Waybil> list);
	
	
	
}
