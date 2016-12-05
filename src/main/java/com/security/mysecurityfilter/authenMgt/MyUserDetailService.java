package com.security.mysecurityfilter.authenMgt;

import java.util.ArrayList;
import java.util.Collection;

import org.springframework.dao.DataAccessException;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;


public class MyUserDetailService implements UserDetailsService{
	
	//登陆验证时，通过username获取用户的所有权限信息，  
    //并返回User放到spring的全局缓存SecurityContextHolder中，以供授权器使用
	
	
	@Override
	public UserDetails loadUserByUsername(String username)   
            throws UsernameNotFoundException, DataAccessException {     
        Collection<GrantedAuthority> auths=new ArrayList<GrantedAuthority>();   
          
        SimpleGrantedAuthority auth2=new SimpleGrantedAuthority("ROLE_ADMIN");   
        SimpleGrantedAuthority auth1=new SimpleGrantedAuthority("ROLE_USER");   
          
        if(username.equals("sunyanchen")){   
            auths=new ArrayList<GrantedAuthority>();   
            auths.add(auth1);  
            auths.add(auth2);        
        }       
          
        User user = new User(username, "123", true, true, true, true, auths);   
        return user;    
        }   
    }   
	

