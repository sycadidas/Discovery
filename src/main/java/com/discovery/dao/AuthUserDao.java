package com.discovery.dao;

import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import com.common.dto.User;

@Repository
public interface AuthUserDao {
	public User getUserByUserName(@Param("username")String username,@Param("password")String password);
}
