package cn.abstractFactory.Product.product;

import cn.abstractFactory.Product.abstractProduct.Cpu;
/**
 * 具体产品英特尔的CPU
 * @author sunyanchen
 */
public class IntelCpu implements Cpu {  
    private int pins;   //表示CPU的脚针数  
    public IntelCpu(int pins){  
        this.pins = pins;  
    }  
    @Override  
    public void calculate() {  
        System.out.println("Intel CPU的脚针数目："+pins);  
    }  
  
}