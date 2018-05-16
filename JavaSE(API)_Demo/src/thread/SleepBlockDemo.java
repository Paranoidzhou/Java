package thread;
/*
 * 睡眠阻塞：
 * static void sleep(long ms)
 *     当一个线程执行sleep方法后就会进入阻塞状态指定的毫秒，超时后线程会自动回到RUNNABLE
 * 状态等待再次并发运行。
 * 
 *    该方法会要求必须处理InterruptedException,即：当一个线程处与睡眠阻塞时被其他线程调
 * 用interrupted方法中断时抛出该中断异常并打断睡眠阻塞。
 *    
 *    interrupt()方法是线程的一个方法，用于中断线程，但是若线程处于阻塞状态时是中断阻塞，
 * 若线程没有属于阻塞状态则线程直接被中断。『相当于打断睡眠，醒来了』
 */
public class SleepBlockDemo {
	public static void main(String[] args) {
		/*JDK1.8之前引用要在前面加final*/
		Thread ashuai = new Thread() {
			public void run() {
				System.out.println("睡觉中的阿衰zzzzzzzz！！！");
				try {
					Thread.sleep(10000);     //阻塞指定毫秒数.
					System.out.println("阿衰正常睡醒了～～～");
				} catch (InterruptedException e) {
					System.out.println("被吵醒的阿衰 TAT！！！");
				}
			}
		};
		Thread dalian = new Thread() {
			public void run() {
				System.out.println("兴致勃勃来上课的大脸妹准备开始搞事～");
				for (int i = 0; i < 5; i++) {
					try {
						System.out.println("duang！duang！duang！");
						Thread.sleep(1500);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}	
				}
				System.out.println("轰隆隆～");
				/*
				 *    在JDK1.8版本之前，由于JVM内存分配问题，要求一个方法中的局部内部类若引用这个方法的
				 *其他局部变量时，要求该变量必须是final的。所以main方法的局部内部类dalian中引用了main
				 *方法的局部变量ashuai,那么ashuai必须是final的才能编译通过。 
				 * 
				 */
				ashuai.interrupt();	         //中断ashuai线程
			}
		};
		ashuai.start();
		dalian.start();
	}
}
