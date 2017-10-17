package cn.singleton;
/**
 * 单例模式---懒汉模式 线程不安全
* @ClassName: LazySingleton 
* @Description: TODO(这里用一句话描述这个类的作用) 
* @author sunyanchen 
* @date 2017年10月17日 下午3:59:39
 */
public class LazySingleton {
	
	private static LazySingleton instance;
	
	private LazySingleton(){}
	
	public static LazySingleton getInstance(){
		if(instance == null){
			instance = new LazySingleton();
		}
		return instance;
	}
	
	//若是想线程安全
//	public static synchronized LazySingleton getInstance(){
//		if(instance == null){
//			instance = new LazySingleton();
//		}
//		return instance;
//	}
	
	public static void main(String[] args) {
		LazySingleton instance1 = LazySingleton.getInstance();
		LazySingleton instance2 = LazySingleton.getInstance();
		
		System.out.println(instance1 == instance2);
		
	}
	
}
