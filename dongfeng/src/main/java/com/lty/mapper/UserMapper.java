package com.lty.mapper;
import java.util.List;
import java.util.Map;

import com.lty.entity.User;

public interface UserMapper {
	//根据名字找账号
	public User findByUsername(String name);
	//根据ID找授权码
	public List<String> findPermissionByUserId(int userId);
	//查找所有角色
	public List<User>findAll();
	//删除角色
	public int deleteJS(int id);
	//添加角色
	public int addJS(User user);
	//查权限
	public List<Map<String,Object>> findpower();

	

}
