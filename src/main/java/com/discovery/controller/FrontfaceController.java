package com.discovery.controller;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

/**
 * 首页跳转控制器
 * @author sunyanchen
 */
@Controller
@RequestMapping("/first")
public class FrontfaceController {
	//跳转到登录页面 
	@RequestMapping("/hello")
      public ModelAndView hello() throws Exception{
                
		  ModelAndView mv =new ModelAndView();
	        mv.setViewName("hello");
	        return mv;
      }
}
