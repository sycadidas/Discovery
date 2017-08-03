package cn.T;

import java.util.Random;


public class Tmethod {
/**
 * 泛型方法
 * 类型参数需要放在修饰符后面、返回值类型前面。一旦定义了类型参数，就可以在参数列表、方法体和返回值类型中使用了。
 */
	
	public static <TT,T extends Number> T imTmethod(Number...t){
		T l = null;
		for (Number t2 : t) {
			System.out.println(t2);
		}
		
		return l;
	}
	public static void main(String[] args) {
		System.out.println(imTmethod(5,8,9,0));
	}
}
