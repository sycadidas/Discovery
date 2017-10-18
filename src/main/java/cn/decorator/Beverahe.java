package cn.decorator;
//饮料 原业务类
public abstract class Beverahe {

	protected String description;
	
	public String getDescription(){
	      return description;
     }
	public abstract double cost();
}
