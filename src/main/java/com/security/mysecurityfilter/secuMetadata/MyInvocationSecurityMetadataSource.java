package com.security.mysecurityfilter.secuMetadata;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;





import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.ConfigAttribute;
import org.springframework.security.access.SecurityConfig;
import org.springframework.security.web.FilterInvocation;
import org.springframework.security.web.access.intercept.FilterInvocationSecurityMetadataSource;

import com.common.utils.AntUrlPathMatcher;
import com.common.utils.UrlMatcher;
import com.discovery.dao.AuthUserDao;

public class MyInvocationSecurityMetadataSource implements FilterInvocationSecurityMetadataSource {   
    private UrlMatcher urlMatcher = new AntUrlPathMatcher();   
    private static Map<String, Collection<ConfigAttribute>> resourceMap = null;  
      
    @Autowired
	private AuthUserDao authuserdao;
    
    //参数是要访问的url，返回这个url对于的所有权限（或角色）
    public Collection<ConfigAttribute> getAttributes(Object object) throws IllegalArgumentException {   
        // 将参数转为url      
        String url = ((FilterInvocation)object).getRequestUrl();
        //从数据库取出所有角色对应的权限
//        resourceMap = authuserdao.loadAllAuthonsUrl();
        
        String ul = "/security/j_spring_security_check";
        Collection<ConfigAttribute> c = new ArrayList<ConfigAttribute>();
        ConfigAttribute cc = new SecurityConfig("ROLE_USER");
        c.add(cc);
        resourceMap.put(ul, c);
        
        Iterator<String>ite = resourceMap.keySet().iterator();   
        while (ite.hasNext()) {           
            String resURL = ite.next();    
            if (urlMatcher.pathMatchesUrl(resURL, url)) {   
                return resourceMap.get(resURL);           
                }         
            }   
        return null;      
        }    
    public boolean supports(Class<?>clazz) {   
            return true;    
            }  
    public Collection<ConfigAttribute> getAllConfigAttributes() {   
        return null;    
        }  
    }  