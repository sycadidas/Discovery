package com.discovery.dao;


import java.util.ArrayList;
import java.util.Collection;
import java.util.Map;

import org.apache.ibatis.annotations.Param;
import org.springframework.security.access.ConfigAttribute;
import org.springframework.stereotype.Repository;

import com.common.dto.User;

@Repository
public interface AuthUserDao {
	//用户名密码查询用户-废弃
	public User getUserByUserName(@Param("username")String username,@Param("password")String password);
	//用户名查询所有角色（权限）
	public User getUserByUsername(@Param("username")String username);
	//根据url 查询 该url对应的权限集合
	public ArrayList<String> loadAllAuthons(String url);
}
