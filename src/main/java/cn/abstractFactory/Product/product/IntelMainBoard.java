package cn.abstractFactory.Product.product;

import cn.abstractFactory.Product.abstractProduct.MainBoard;
/**
 *具体产品英特儿的主板 
 * @author sunyanchen
 */
public class IntelMainBoard implements MainBoard {  
    private int cpuHoles;   //表示主板上的CPU插槽孔数，对应脚针数  
    public IntelMainBoard(int cpuHoles){  
        this.cpuHoles = cpuHoles;  
    }  
    @Override  
    public void installCpu() {  
        System.out.println("Intel主板上的CPU插槽孔数："+cpuHoles);  
    }  
  
}
