package cn.thread;

import java.util.concurrent.Callable;

public class Main implements Callable{
    int i;
    @Override
    public Object call() throws Exception {
        String str=null;
        for (i=0;i<100;i++){
            str=Thread.currentThread().getName()+"--"+i;
            System.out.println(str);
        }
        return str;
    }
}
