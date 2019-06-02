package com.lty.mapper;

import org.apache.ibatis.annotations.Param;

public interface UserroleMapper {
	//添加权限码
	public int addpowerNumber(@Param("uid")int id,@Param("rid")int selectid);
	//删除权限码
	public int deletePower(int id);
}
