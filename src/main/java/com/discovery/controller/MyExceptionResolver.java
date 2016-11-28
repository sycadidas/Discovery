package com.discovery.controller;



import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.servlet.HandlerExceptionResolver;
import org.springframework.web.servlet.ModelAndView;

/**
 * 负责全局处理异常
 * @author sunyanchen
 */
@Controller
public class MyExceptionResolver  implements HandlerExceptionResolver {

	@Override
	public ModelAndView resolveException(HttpServletRequest rq,
			HttpServletResponse rp, Object o, Exception e){
		
		
		  ModelAndView modelAndView = new ModelAndView();
		  
		  modelAndView.addObject("error",e.getMessage());
		  modelAndView.setViewName("errorPage");
		 
	      return modelAndView;
	}
	
}

