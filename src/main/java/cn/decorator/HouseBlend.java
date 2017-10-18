package cn.decorator;
//原业务类的一个实现 待装饰
public class HouseBlend extends Beverahe{

	public HouseBlend(){
		description="House Blend coffee";
	}
	
	@Override
	public double cost() {
		return 4.9;
	}

}
