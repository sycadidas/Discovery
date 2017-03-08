package cn.abstractFactory.Product.product;

import cn.abstractFactory.Product.abstractProduct.Cpu;
/**
 * 具体产品AMD的CPU
 * @author sunyanchen
 */
public class AmdCpu implements Cpu {  
    private int pins;  
    public AmdCpu(int pins){  
        this.pins = pins;  
    }  
    @Override  
    public void calculate() {  
        System.out.println("ADM CPU的脚针数目："+pins);  
    }  
  
}
