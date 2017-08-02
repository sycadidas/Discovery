package cn.T;


public class Tmethod {
/**
 * 泛型方法
 * 类型参数需要放在修饰符后面、返回值类型前面。一旦定义了类型参数，就可以在参数列表、方法体和返回值类型中使用了。
 */
	
	public static <TT,T extends Number> T imTmethod(T t){
		T l = null;
		if(t instanceof Object){
			System.out.println("T");
		}else{
			System.out.println("t");
		}
		
		return l;
	}
	public static void main(String[] args) {
		System.out.println(imTmethod(5));
	}
}
