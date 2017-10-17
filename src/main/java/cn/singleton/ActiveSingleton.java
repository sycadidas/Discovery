package cn.singleton;
/**
 * 单例模式--饿汉
* @ClassName: ActiveSingleton 
* @Description: TODO(这里用一句话描述这个类的作用) 
* @author sunyanchen 
* @date 2017年10月17日 下午4:07:00
 */
public class ActiveSingleton {
	private static ActiveSingleton instance = new ActiveSingleton();
	
	private ActiveSingleton(){}
	
	public static  ActiveSingleton getInstance(){
		return instance;
	}
	
	//也可以将第一行这样写 都是在类加载的时候就创建实例
//	static{
//		instance = new ActiveSingleton();
//	}
	
	
}
