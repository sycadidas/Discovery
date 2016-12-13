package com.security.mysecurityfilter.secuMetadata;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.ConfigAttribute;
import org.springframework.security.access.SecurityConfig;
import org.springframework.security.web.FilterInvocation;
import org.springframework.security.web.access.intercept.FilterInvocationSecurityMetadataSource;

import com.discovery.dao.AuthUserDao;

public class MyInvocationSecurityMetadataSource implements FilterInvocationSecurityMetadataSource {   
      
    @Autowired
	private AuthUserDao authuserdao;
    
    //参数是要访问的url，返回这个url对应的所有权限（先不以缓存方式实现）
    public Collection<ConfigAttribute> getAttributes(Object object) throws IllegalArgumentException {   
        // 将参数转为url      
        String url = ((FilterInvocation)object).getRequestUrl();
        String[] split = url.split("/");
        if(split.length == 3){
        	url = "/*/*";
        }else{
        	url = "/admin";
        }
        //取出该url所对应的权限集合
        Collection<ConfigAttribute> c = new ArrayList<ConfigAttribute>();
        ArrayList<String> aus = authuserdao.loadAllAuthons(url);
        for(int i = 0;i<aus.size();i++){
        	c.add(new SecurityConfig(aus.get(i)));
        }
        return c;
           
        }    
    public boolean supports(Class<?>clazz) {   
            return true;    
            }  
    public Collection<ConfigAttribute> getAllConfigAttributes() {   
        return null;    
        }  
    }  