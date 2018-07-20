package thread;
/**
 * 睡眠阻塞
 * 
 * static void sleep(long ms)
 * 当一个线程执行sleep方法后就会进入阻塞状态指定
 * 的毫秒,超时后线程会自动回到RUNNABLE状态等待再次
 * 并发运行.
 * 该方法会要求必须处理InterruptedException,即:
 * 当一个线程处于睡眠阻塞时被其他线程调用interrupted
 * 方法中断时会抛出该中断异常并打断睡眠阻塞.
 * 
 * interrupt()方法是线程的一个方法,用于中断线程,
 * 但是若线程处于阻塞状态时是中断阻塞,若线程没有
 * 处于阻塞状态则线程直接被中断.
 * 
 * @author adminitartor
 *
 */
public class SleepBlockDemo {
	public static void main(String[] args) {
		final Thread lin = new Thread(){
			public void run(){
				System.out.println("lin:刚美完容,睡一觉吧!");
				try {
					Thread.sleep(1000000);
				} catch (InterruptedException e) {
					System.out.println("lin:干嘛呢!干嘛呢!干嘛呢!都破了相了!");
				}
			}
		};
		
		Thread huang = new Thread(){
			public void run(){
				System.out.println("黄:那我开始了啊!");
				for(int i=0;i<5;i++){
					System.out.println("黄:80!");
					try {
						Thread.sleep(1000);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
				}
				System.out.println("咣当!");
				/*
				 * 在JDK1.8之前,由于JVM内存分配问题,要求
				 * 一个方法中的局部内部类若引用这个方法的
				 * 其他局部变量时,要求该变量必须是final的
				 * 所以main方法的局部内部类huang中引用了
				 * main方法的局部变量lin,那么lin必须是
				 * final的
				 */
				lin.interrupt();//中断lin线程
				System.out.println("黄:搞定!");
			}
		};
		lin.start();
		huang.start();
		
	}
}








