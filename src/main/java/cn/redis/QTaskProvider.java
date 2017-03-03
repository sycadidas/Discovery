package cn.redis;

import java.util.Random;
import java.util.UUID;

import redis.clients.jedis.Jedis;

/**
 * 消息生产者
 * @author sunyanchen
 */
public class QTaskProvider implements Runnable{

	Jedis jedis = new Jedis("10.144.34.54",6379);  
	
	
	@Override
	public void run() {
		Random random = new Random();  
		while(true){
			try{
				Thread.sleep(random.nextInt(600) + 600);  
                // 模拟生成一个任务  
                UUID taskid = UUID.randomUUID();  
                //将任务插入任务队列：task-queue  
                jedis.lpush("task-queue", taskid.toString());  
                System.out.println("插入了一个新的任务： " + taskid);  
			}catch(Exception e){
				e.printStackTrace();
			}
			
		}
		
	}

}
