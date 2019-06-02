package com.lty.service;

import java.util.List;
import java.util.Map;

import com.lty.entity.User;



public interface UserService {
	
	public User findByUsername(String name);
	public List<String> findPermissionByUserId(int userId);
	public List<User>findAll();
	public int deleteJS(int id);
	public int addJS(User user);
	public List<Map<String,Object>> findpower();

}
