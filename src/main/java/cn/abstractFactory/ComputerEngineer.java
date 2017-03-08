package cn.abstractFactory;

import cn.abstractFactory.Product.abstractProduct.Cpu;
import cn.abstractFactory.Product.abstractProduct.MainBoard;
import cn.abstractFactory.factory.abstractFactory.AbstractFactory;
/**
 * 工程师
 * @author sunyanchen
 */
public class ComputerEngineer {  
    private Cpu cpu = null;  
    private MainBoard mainBoard = null;  
      
    public void makeComputer(AbstractFactory af){  
        //1.准备装机的硬件  
        this.prepareHardWares(af);  
        //2.组装机器  
        //3.测试机器  
        //4.交付客户  
    }  
    public void prepareHardWares(AbstractFactory af){  
        this.cpu = af.createCpu();              //准备CPU，但是不关心是什么CPU  
        this.mainBoard = af.creatMainBoard();   //准备主板，也不关心是什么主板  
        //查看槽孔是否和脚针数目匹配  
        this.cpu.calculate();  
        this.mainBoard.installCpu();  
    }  
} 
