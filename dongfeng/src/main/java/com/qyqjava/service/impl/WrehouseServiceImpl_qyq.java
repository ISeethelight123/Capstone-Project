package com.qyqjava.service.impl;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.qyqjava.mapper.AllocationMapper;
import com.qyqjava.mapper.RelationMapper;
import com.qyqjava.mapper.WrehouseMapper;
import com.qyqjava.pojo.Relation;
import com.qyqjava.pojo.Wrehouse;
import com.qyqjava.service.WrehouseService_qyq;

@Service
@Transactional
public class WrehouseServiceImpl_qyq implements WrehouseService_qyq {
	@Resource(name = "wrehouseQYQ")
	private WrehouseMapper wrehouseMapper;
	@Resource(name = "relationQYQ")
	private RelationMapper relationMapper;
	@Resource(name = "allocationQYQ")
	private AllocationMapper allocationMapper;

	/*
	 * 显示仓库的信息
	 * 
	 * @see com.qyqjava.service.WrehouseService_qyq#showWrehouseInfo()
	 */
	public List<Map<String, Object>> showWrehouseInfo() {
		List<Map<String, Object>> list = wrehouseMapper.showWerhouseInfo();
		System.out.println(list);
		return list;
	}

	/*
	 * 根据条件查询：1，按 wrehouse_Address 2,按 wrehouse_Name 查询视图
	 * 
	 * @see com.qyqjava.service.WrehouseService_qyq#showByRequie(com.qyqjava.pojo.
	 * Wrehouse)
	 */
	public List<Map<String, Object>> showByRequie(String num, String requir) {
		Wrehouse wrehouse = new Wrehouse();
		if (num.equals("1")) {
			try {
				int re = Integer.parseInt(requir);
				wrehouse.setWrehouseAddress(re);
				List<Map<String, Object>> list = wrehouseMapper.showByRequir(wrehouse);
				System.out.println("1\t" + wrehouse);
				return list;
			} catch (Exception e) {
				return null;
			}
		} else {
			wrehouse.setWrehouseName(requir);
			System.out.println(wrehouse.getWrehouseName() + "\t" + "impl");
			List<Map<String, Object>> list = wrehouseMapper.showByRequir(wrehouse);
			System.out.println("2\t" + wrehouse);
			return list;
		}

	}

	/**
	 * 增加仓库信息：1，在表wrehouse中添加信息 2，在表relation中添加信息 3，在表allocation中添加信息
	 */
	public int addWrehouseInfo(Wrehouse wrehouse, Relation relation) {
		try {
			System.out.println(wrehouse + "\t" + relation);
			// 1，在表wrehouse中添加信息:`Wrehouse_Address``Wrehouse_Name``Wrehouse_Phone`
			int i1 = wrehouseMapper.insert(wrehouse);
			// 2 在表relation中添加信息：`wrehouse_ID``roadway``shelf``allocationNum`
			// 其中wrehouse_ID 需查询当前的仓库
			int wrehouse_ID = wrehouseMapper.showWrehouseID(wrehouse.getWrehouseAddress().toString());

			relation.setWrehouseId(wrehouse_ID);

			int i2 = relationMapper.insert(relation);
			// 在表allocation中添加数据,在添加allocation是需要走存储过程，参数分别为 wreid和totel
			int totel = relation.getRoadway() * relation.getShelf() * relation.getAllocationnum();
			Map<String, Object> map = new HashMap<>();
			map.put("wreid", wrehouse_ID);
			map.put("totel", totel);
			int i3 = allocationMapper.addAllocation(map);

			System.out.println(i1 + i2 + i3);
			return 1;
		} catch (Exception e) {
			return 0;
		}
	}

	/*
	 * 删除仓库
	 */
	public int deleteWrehouse(String id) {
		Integer i = wrehouseMapper.showWrehouseID(id);
		if (i != 0 && i != null) {
			return 0;
		} else {
			return wrehouseMapper.deleteByPrimaryKey(i);
		}

	}

	/*
	 * 查询仓库中的订单数量
	 * 
	 * @see com.qyqjava.service.WrehouseService_qyq#showOrdersPen()
	 */
	public List<Object> showOrdersPen() {

		List<Object> list = allocationMapper.showAllNum();
		return list;
	}

	/*
	 * (non-Javadoc)查询表wrehouse
	 * 
	 * @see com.qyqjava.service.WrehouseService_qyq#showWre()
	 */
	public List<Wrehouse> showWre() {
		List<Wrehouse> list = wrehouseMapper.selectByExample(null);
		return list;
	}
}
