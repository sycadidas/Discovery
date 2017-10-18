package cn.decorator;
//牛奶装饰类
public class Milk extends CondimentDecorator{

	      protected Beverahe beverage;
	      
	      public Milk(Beverahe beverage){
	          this.beverage=beverage;
	      }
	      
	      @Override
	      public String getDescription() {
	          return beverage.getDescription()+",with milk";
	      }
	     
	      @Override
	     public double cost() {
	         return 2.3+beverage.cost();
	     }

}
