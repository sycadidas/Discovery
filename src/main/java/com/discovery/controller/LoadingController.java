package com.discovery.controller;

import java.io.IOException;

import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.alibaba.fastjson.JSONObject;
import com.webservice.phone.MobileCodeWS;
import com.webservice.phone.MobileCodeWSSoap;

@Controller
@RequestMapping("/load")
public class LoadingController {
	@RequestMapping("/script")
	public ModelAndView toLoad(){
		ModelAndView mv = new ModelAndView();
		mv.setViewName("loadingScript");
		return mv;
	}
	
	
	@RequestMapping("/serchPhone")
	public ModelAndView serchPhone(){
		ModelAndView mv = new ModelAndView();
		mv.setViewName("serchPhone");
		return mv;
	}
	
	@RequestMapping(value="/getInfo")
	@ResponseBody
	public String getInfo(String pnumb,HttpServletResponse rp) throws IOException{
		//创建一个MobileCodeWS工厂  
        MobileCodeWS factory = new MobileCodeWS();  
        //根据工厂创建一个MobileCodeWSSoap对象  
        MobileCodeWSSoap mobileCodeWSSoap = factory.getMobileCodeWSSoap();  
        //调用WebService提供的getMobileCodeInfo方法查询手机号码的归属地
        String searchResult = mobileCodeWSSoap.getMobileCodeInfo(pnumb, null);  
        JSONObject jsonObject =new JSONObject();
        jsonObject.put("data", searchResult);
        rp.setContentType("text/html;charset=UTF-8"); 
        rp.getWriter().print(jsonObject.toString()); 
		return null;
	}
}
