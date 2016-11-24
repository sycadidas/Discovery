package com.discovery.service.serviceImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.common.dto.User;
import com.discovery.dao.AuthUserDao;
import com.discovery.service.serviceInte.AuthUserService;

@Service("authUserService")
public class AuthUserServiceImpl implements AuthUserService {
	
	@Autowired
	private AuthUserDao authuserdao;
	
	@Override
	public User queryUserByUserId(String userid,String password) {
		
		return	authuserdao.getUserByUserName(userid,password);
		 
	}

}
