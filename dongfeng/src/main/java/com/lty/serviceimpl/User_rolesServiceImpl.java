package com.lty.serviceimpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.lty.mapper.User_rolesMapper;
import com.lty.service.User_rolesService;
@Service
public class User_rolesServiceImpl implements User_rolesService {

	@Autowired
	private User_rolesMapper user_rolesMapper;
	
	public int deletJSS(int id) {
		
		return user_rolesMapper.deletJSS(id);
	}

	@Override
	public int addJSS(String name) {
		// TODO Auto-generated method stub
		return user_rolesMapper.addJSS(name);
	}
	

}
