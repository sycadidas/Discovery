package cn.abstractFactory.Product.product;

import cn.abstractFactory.Product.abstractProduct.MainBoard;
/**
 * 具体产品ADM的主板
 * @author sunyanchen
 */
public class AmdMainBoard implements MainBoard {  
    private int cpuHoles;  
    public AmdMainBoard(int cpuHoles){  
        this.cpuHoles = cpuHoles;  
    }  
    @Override  
    public void installCpu() {  
        System.out.println("AMD主板上的CPU插槽孔数："+cpuHoles);  
    }  
  
}

