package com.discovery.controller;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.common.dto.User;
import com.discovery.service.serviceInte.AuthUserService;

@Controller
@RequestMapping("/check")
public class CheckUser  {
	
	@Resource(name="authUserService")
	private AuthUserService authUserService;
	
	@RequestMapping("/user")
	@ResponseBody
    public String checkUser(String username,String password,HttpServletRequest req){
		  if(username!=null&&password!=null){
			 User user = authUserService.queryUserByUserId(username,password);
			 if(user!=null){
				 req.getSession().setAttribute("username", user.getUsername());
				 return "true";
			 }
		  }
		  return "false";
    }
}
