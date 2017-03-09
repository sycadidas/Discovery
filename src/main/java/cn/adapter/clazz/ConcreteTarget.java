package cn.adapter.clazz;

//具体目标类，只提供普通功能  
class ConcreteTarget implements Target {  
 public void request() {  
     System.out.println("普通类 具有 普通功能...");  
 }  
} 
