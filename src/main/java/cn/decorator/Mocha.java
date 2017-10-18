package cn.decorator;
//摩卡装饰类
public class Mocha extends CondimentDecorator{
	      protected Beverahe beverage;
	      
	      public Mocha(Beverahe beverage){
	          this.beverage=beverage;
	        }
	      
	      @Override
	      public String getDescription() {
	          return beverage.getDescription()+",with Mocha";
	        }
         
	      @Override
	      public double cost() {
              return 1.2+beverage.cost();
	      }
}
