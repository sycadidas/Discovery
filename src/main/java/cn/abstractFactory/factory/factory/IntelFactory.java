package cn.abstractFactory.factory.factory;

import cn.abstractFactory.Product.abstractProduct.Cpu;
import cn.abstractFactory.Product.abstractProduct.MainBoard;
import cn.abstractFactory.Product.product.IntelCpu;
import cn.abstractFactory.Product.product.IntelMainBoard;
import cn.abstractFactory.factory.abstractFactory.AbstractFactory;
/**
 *具体工厂 
 * @author sunyanchen
 */
public class IntelFactory implements AbstractFactory {  
    @Override  
    public Cpu createCpu() {  
        return new IntelCpu(888);  
    }  
    @Override  
    public MainBoard creatMainBoard() {  
        return new IntelMainBoard(888);  
    }  
  
}
