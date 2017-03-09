package cn.adapter.clazz;

public class ClassAdapterTest {

	// 测试类public class Client   
    public static void main(String[] args) {  
        // 使用普通功能类  
        Target concreteTarget = new ConcreteTarget();  
        concreteTarget.request();  
          
        // 使用特殊功能类，即适配类  
        Target adapter = new Adapter();  
        adapter.request();  
    } 

}
