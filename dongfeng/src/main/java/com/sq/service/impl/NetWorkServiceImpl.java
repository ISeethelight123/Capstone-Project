package com.sq.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sq.mapper.NetWorkMapper;
import com.sq.pojo.NetWork;
import com.sq.service.NetWorkService;
@Service
public class NetWorkServiceImpl implements NetWorkService {

	@Autowired
	NetWorkMapper netWorkMapper;
	
	public void addNetWork(NetWork network) {
		netWorkMapper.addNetWork(network);
	}

	public void deleteNetWorkById(Integer networkId) {
		netWorkMapper.deleteNetWorkById(networkId);
	}

	public void deleteNetWorkMassById(int[] arrId) {
		netWorkMapper.deleteNetWorkMassById(arrId);
	}

	public void updateNetWork(NetWork network) {
		netWorkMapper.updateNetWork(network);
	}

	public List<NetWork> selectNetWorkAll() {
		return netWorkMapper.selectNetWorkAll();
	}

	public NetWork selectNetWorkOneById(Integer networkId) {
		return netWorkMapper.selectNetWorkOneById(networkId);
	}

	public List<NetWork> selectNetWorkChoose(NetWork network) {
		return netWorkMapper.selectNetWorkChoose(network);
	}

	public List<NetWork> selectNetWorkLike(NetWork network) {
		return netWorkMapper.selectNetWorkLike(network);
	}

}
