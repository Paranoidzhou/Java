package thread;
/**
 * 线程优先级
 * 线程调用start方法后纳入线程调度统一管理,线程
 * 不能主动获取CPU时间片,只能被动分配.
 * 调整线程优先级可以最大程度的改善某个线程获取
 * CPU时间片的几率.
 * 理论上线程优先级越高的线程获取CPU时间片的次数越多
 * 
 * 线程优先级有10个等级,用整数1-10表示
 * 1最低,5默认,10最高.
 * 
 * void setPriority(int p)
 * 通过该方法可以设置线程的优先级.
 * 
 * 线程提供了3个常量分别表示了最低,默认和最高优先级
 * 
 * 
 * @author adminitartor
 *
 */
public class PriorityDemo {
	public static void main(String[] args) {
		Thread max = new Thread(){
			public void run(){
				for(int i=0;i<10000;i++){
					System.out.println("max");
				}
			}
		};
		Thread norm = new Thread(){
			public void run(){
				for(int i=0;i<10000;i++){
					System.out.println("nor");
				}
			}
		};
		Thread min = new Thread(){
			public void run(){
				for(int i=0;i<10000;i++){
					System.out.println("min");
				}
			}
		};
		
		max.setPriority(Thread.MAX_PRIORITY);
		min.setPriority(Thread.MIN_PRIORITY);
		
		min.start();
		norm.start();
		max.start();
	}
}









