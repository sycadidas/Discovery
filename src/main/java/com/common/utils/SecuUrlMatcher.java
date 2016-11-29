package com.common.utils;

public interface SecuUrlMatcher{  
    Object compile(String paramString);  
    boolean pathMatchesUrl(Object paramObject, String paramString);  
    String getUniversalMatchPattern();   
    boolean requiresLowerCaseUrl();  
} 
