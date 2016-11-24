package com.discovery.controller;

import org.apache.log4j.Logger;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

/**
 * 此类模拟一个可能报错的控制器，以便测试全局控制器报错统一处理机制
 * 报错如果在控制器吃掉（catch中不处理）则页面不会打印后台报错信息，抛出方法的异常才能被全局类捕获
 * @author sunyanchen
 */
@Controller
@RequestMapping("/come")
public class ErrClass {
private static final Logger log = Logger.getLogger(ErrClass.class);
		@RequestMapping("/err")
	      public ModelAndView hello() {
			try{
				throw new NullPointerException("空指针");
			}catch(Exception e){
				System.out.println(e.getMessage());
				throw new RuntimeException("运行期异常");
			}
	            	
	      }
}
