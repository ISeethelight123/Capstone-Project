package com.qyqjava.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.qyqjava.mapper.InwrehouseMapper;
import com.qyqjava.mapper.RelationMapper;
import com.qyqjava.pojo.Inwrehouse;
import com.qyqjava.pojo.InwrehouseExample;
import com.qyqjava.pojo.InwrehouseExample.Criteria;
import com.qyqjava.pojo.Relation;
import com.qyqjava.pojo.RelationExample;
import com.qyqjava.service.InwrehouseService;

@Service
@Transactional
public class InWrehouseServiceImpl_qyq implements InwrehouseService {
	@Autowired
	private InwrehouseMapper inwrehouseMapper;
	@Autowired
	private RelationMapper relationMapper;

	/*
	 * 查询全部入库单
	 * 
	 * @see com.qyqjava.service.InwrehouseService#showInWrehouseInfo()
	 */
	public List<Inwrehouse> showInWrehouseInfo() {
		List<Inwrehouse> list = inwrehouseMapper.selectByExample(null);
		return list;
	}

	/*
	 * 按入库单号查询
	 */
	public List<Inwrehouse> showInWreRequire(String id) {
		InwrehouseExample example = new InwrehouseExample();
		Criteria criteria = example.createCriteria();
		criteria.andInwrehouseIdEqualTo(Integer.parseInt(id));
		List<Inwrehouse> list = inwrehouseMapper.selectByExample(example);
		System.out.println(list);
		return list;
	}

	/*
	 * 修改入库单
	 */
	public int udInwreInfo(String id, String orderId) {
		InwrehouseExample example = new InwrehouseExample();
		Criteria criteria = example.createCriteria();
		criteria.andInwrehouseIdEqualTo(Integer.parseInt(id));
		Inwrehouse inwrehouse = new Inwrehouse();
		inwrehouse.setOrderId(Integer.parseInt(orderId));
		int i = inwrehouseMapper.updateByExampleSelective(inwrehouse, example);
		System.out.println(i);
		return i;
	}
	
	/*
	 * 查询关系表
	 */
	public List<Relation> showRelation(String id){
		RelationExample example = new RelationExample();
		com.qyqjava.pojo.RelationExample.Criteria criteria = example.createCriteria();
		criteria.andWrehouseIdEqualTo(Integer.parseInt(id));
		return relationMapper.selectByExample(example);
	}

}
