package cn.singleton;
/**
 * 静态内部类方式实现单例模式
* @ClassName: InternalClassSingleton 
* @Description:
* 这种方式是Singleton类被装载了，instance不一定被初始化。
* 因为SingletonHolder类没有被主动使用，
* 只有显示通过调用getInstance方法时，才会显示装载SingletonHolder类，从而实例化instance
* @author sunyanchen 
* @date 2017年10月17日 下午4:19:51
 */
public class InternalClassSingleton {
	private static class SingletonHolder {
		//这里将变量设置为final 代表这个引用一旦初始化 不允许被修改
		private static final InternalClassSingleton instance = new InternalClassSingleton(); 
	}
	private InternalClassSingleton(){}
	
	//这里方法加上final 防止InternalClassSingleton的子类修改这个方法
	public static final InternalClassSingleton getInstance(){
		return SingletonHolder.instance;
	}
}
