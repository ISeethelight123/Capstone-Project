package com.lty.serviceimpl;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lty.entity.User;
import com.lty.mapper.UserMapper;
import com.lty.service.UserService;


@Service
public class UserServiceImpl implements UserService {

	@Autowired
	private UserMapper userMapper;
	public User findByUsername(String name) {
		return  userMapper.findByUsername(name);
	}
	
	public List<String> findPermissionByUserId(int userId) {
		return userMapper.findPermissionByUserId(userId);
	}

	@Override
	public List<User> findAll() {
		return userMapper.findAll();
	}

	@Override
	public int deleteJS(int id) {
		// TODO Auto-generated method stub
		return userMapper.deleteJS(id);
	}

	@Override
	public int addJS(User user) {
		// TODO Auto-generated method stub
		return userMapper.addJS(user);
	}

	@Override
	public List<Map<String, Object>> findpower() {
		// TODO Auto-generated method stub
		return userMapper.findpower();
	}


	

	
	

	
	
	
	

	

}
