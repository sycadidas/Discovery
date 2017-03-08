package cn.abstractFactory;

import cn.abstractFactory.factory.abstractFactory.AbstractFactory;
import cn.abstractFactory.factory.factory.AmdFactory;
import cn.abstractFactory.factory.factory.IntelFactory;
/**
 * 客户
 * @author sunyanchen
 */
public class Customer {  
	  
    public static void main(String[] args) {  
        ComputerEngineer cEngineer = new ComputerEngineer();//找到一个工程师  
        AbstractFactory intelFactory = new IntelFactory();  //客户选定某类具体工厂,工厂负责成产匹配的组件  
//        AbstractFactory AmdFactory = new AmdFactory();
        cEngineer.makeComputer(intelFactory);               //工程师开始组装  
    }  
  
}  
