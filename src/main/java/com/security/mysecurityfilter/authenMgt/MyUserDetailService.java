package com.security.mysecurityfilter.authenMgt;

import java.util.ArrayList;
import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;

import com.discovery.dao.AuthUserDao;


public class MyUserDetailService implements UserDetailsService{
	
	//登陆验证时，通过username获取用户的所有权限信息，  
    //并返回User放到spring的全局缓存SecurityContextHolder中，以供授权器使用
	 @Autowired
	 private AuthUserDao authuserdao;
	
	@Override
	public UserDetails loadUserByUsername(String username)throws UsernameNotFoundException, DataAccessException {     
       
		Collection<GrantedAuthority> auths=new ArrayList<GrantedAuthority>();   
        //根据用户名查询对象
        com.common.dto.User user = authuserdao.getUserByUsername(username);
        	auths.add(new SimpleGrantedAuthority(user.getAu()));
        
        return  new User(username, user.getPassword(), true, true, true, true, auths);   
        }   
    }   
	

