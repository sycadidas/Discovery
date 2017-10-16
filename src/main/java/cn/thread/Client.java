package cn.thread;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
/**
 * future是线程执行完之后的返回值
* @ClassName: Client 
* @Description: TODO(这里用一句话描述这个类的作用) 
* @author sunyanchen 
* @date 2017年10月16日 下午2:57:30
 */
public class Client {
    public static void main(String[] args) {
        ExecutorService threadPool= Executors.newSingleThreadExecutor();
        Future<String> future=threadPool.submit(new Main());
        System.out.println("----------");
        try {
            System.out.println(future.get()+"X");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
