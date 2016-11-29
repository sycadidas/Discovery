package com.security.mysecurityfilter.secuMetadata;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.springframework.security.access.ConfigAttribute;
import org.springframework.security.access.SecurityConfig;
import org.springframework.security.web.FilterInvocation;
import org.springframework.security.web.access.intercept.FilterInvocationSecurityMetadataSource;

import com.common.utils.AntUrlPathMatcher;
import com.common.utils.SecuUrlMatcher;

public class MyInvocationSecurityMetadataSource implements FilterInvocationSecurityMetadataSource {   
    private SecuUrlMatcher urlMatcher = new AntUrlPathMatcher();   
//  private static Map<String, Collection<ConfigAttribute>> resourceMap = null;  
      
    //将所有的角色和url的对应关系缓存起来  
    private static List<RoleUrlResource> rus = null;  
      
    @Resource  
    private IRoleUrlResourceDao roleUrlDao;  
      
    //tomcat启动时实例化一次  
    public MyInvocationSecurityMetadataSource() {}  
      
    //参数是要访问的url，返回这个url对于的所有权限（或角色）  
    public Collection<ConfigAttribute> getAttributes(Object object) throws IllegalArgumentException {   
        // 将参数转为url      
        String url = ((FilterInvocation)object).getRequestUrl();     
          
        //查询所有的url和角色的对应关系  
        if(rus == null){  
        rus = roleUrlDao.findAll();  
        }  
          
        //匹配所有的url，并对角色去重  
        Set<String> roles = new HashSet<String>();  
        for(RoleUrlResource ru : rus){  
            if (urlMatcher.pathMatchesUrl(ru.getUrlResource().getUrl(), url)) {   
                        roles.add(ru.getRole().getRoleName());  
                }       
        }  
        Collection<ConfigAttribute> cas = new ArrayList<ConfigAttribute>();   
        for(String role : roles){  
            ConfigAttribute ca = new SecurityConfig(role);  
            cas.add(ca);   
        }  
        return cas;  
        }    
    public boolean supports(Class<?>clazz) {   
            return true;    
            }   
    public Collection<ConfigAttribute> getAllConfigAttributes() {   
        return null;    
        }  
    }  