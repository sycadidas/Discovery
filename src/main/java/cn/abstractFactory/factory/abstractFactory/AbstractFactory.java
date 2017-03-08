package cn.abstractFactory.factory.abstractFactory;

import cn.abstractFactory.Product.abstractProduct.Cpu;
import cn.abstractFactory.Product.abstractProduct.MainBoard;
/**
 * 抽象工厂接口
 * @author sunyanchen
 */
public interface AbstractFactory {  
    /** 
     * 创建Cpu对象 
     * @return Cpu对象 
     */  
    public Cpu createCpu();  
    /** 
     * 创建MainBoard对象 
     * @return MainBoard对象 
     */  
    public MainBoard creatMainBoard();  
}  
