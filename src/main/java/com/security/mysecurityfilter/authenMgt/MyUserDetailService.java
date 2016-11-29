package com.security.mysecurityfilter.authenMgt;

import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;

public class MyUserDetailService implements UserDetailsService{
	
	//登陆验证时，通过username获取用户的所有权限信息，  
    //并返回User放到spring的全局缓存SecurityContextHolder中，以供授权器使用
	@Override
	public UserDetails loadUserByUsername(String username)
			throws UsernameNotFoundException {
		
		return null;
	}
	
}
