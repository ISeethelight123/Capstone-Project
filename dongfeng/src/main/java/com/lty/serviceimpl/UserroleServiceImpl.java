package com.lty.serviceimpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lty.mapper.UserroleMapper;
import com.lty.service.UserroleService;
@Service
public class UserroleServiceImpl implements UserroleService{

	@Autowired
	private UserroleMapper userRoleMapper;
	public int addpowerNumber(int id, int selectid) {
		return userRoleMapper.addpowerNumber(id, selectid) ;
	}
	@Override
	public int deletePower(int id) {
		
		return userRoleMapper.deletePower(id);
	}

}
