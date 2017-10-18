package cn.decorator;
//测试类
public class Starbuzz {
	public static void main(String[] args) {
		Beverahe beverage=new Mocha(new Milk(new HouseBlend()));
		//如上就是一杯HouseBlend配上两份Mocha和一份Milk，博主没去星巴克喝过咖啡,这样配可以么= =
		System.out.println(beverage.getDescription()+":"+beverage.cost());
	}
	
}
