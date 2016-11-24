package com.discovery.controller;

import java.io.IOException;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.servlet.ModelAndView;

/**
 * 处理全局异常 注解方式-未使用
 * @author sunyanchen
 */
public abstract  class BaseController {
	@ExceptionHandler(IOException.class)
    public ModelAndView handleIOException(HttpServletRequest request, HttpServletResponse response, Exception e) {

        // 视图显示专门的错误页
        ModelAndView modelAndView = new ModelAndView("error");

        return modelAndView;
    }
	
	@ExceptionHandler(NullPointerException.class)
    public ModelAndView handleException(HttpServletRequest request, HttpServletResponse response, Exception e) {

        // 视图显示专门的错误页
        ModelAndView modelAndView = new ModelAndView("error");

        return modelAndView;
    }
}
