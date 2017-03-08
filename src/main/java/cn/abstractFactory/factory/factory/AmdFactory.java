package cn.abstractFactory.factory.factory;

import cn.abstractFactory.Product.abstractProduct.Cpu;
import cn.abstractFactory.Product.abstractProduct.MainBoard;
import cn.abstractFactory.Product.product.AmdCpu;
import cn.abstractFactory.Product.product.AmdMainBoard;
import cn.abstractFactory.factory.abstractFactory.AbstractFactory;
/**
 *具体工厂 
 * @author sunyanchen
 */
public class AmdFactory implements AbstractFactory {  
	  
    @Override  
    public Cpu createCpu() {  
        return new AmdCpu(555);  
    }  
    @Override  
    public MainBoard creatMainBoard() {  
        return new AmdMainBoard(555);  
    }  
  
} 
