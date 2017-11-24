package cn.decorator;
//饮料 原业务类
public abstract class Beverahe {
	//饮料 都应该有个描述信息 和 价格 如：82年的雪碧 1800元
	protected String description;
	
	public String getDescription(){
	      return description;
     }
	public abstract double cost();
}
