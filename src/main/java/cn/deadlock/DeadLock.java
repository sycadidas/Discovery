package cn.deadlock;
/**
 * 
* @ClassName: DeadLock 
* @Description:演示死锁
* @author sunyanchen 
* @date 2017年4月5日 下午3:44:03
 */
public class DeadLock implements Runnable {
	
	public static Object o1 = new Object(),o2 = new Object();
	
	private Integer x = 0;

	public Integer getX() {
		return x;
	}
	public void setX(Integer x) {
		this.x = x;
	}
	public void run() {
		if(x == 0){
			synchronized (o1) {
				System.out.println(Thread.currentThread()+"拿到了o1锁");
				synchronized (o2) {
					System.out.println(Thread.currentThread()+"拿到了o2锁");
				}
			}
			
		}else{
			synchronized (o2) {
				System.out.println(Thread.currentThread()+"拿到了o2锁");
				synchronized (o1) {
					System.out.println(Thread.currentThread()+"拿到了o1锁");
				}
			}
		}
	}  
	public static void main(String[] args) {
		DeadLock d1 = new DeadLock();
		DeadLock d2 = new DeadLock();
		d1.setX(1);
		d2.setX(0);
		
		new Thread(d1).start();
		new Thread(d2).start();
	}
}