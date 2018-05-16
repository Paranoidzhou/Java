package thread;
/*
 * 守护线程：
 *      守护线程又称为后台线程，默认创建的线程都不是守护线程，守护线程需要调用线程提供
 * 的方法设置：
 * void setDaemon(boolean on)
 * 当参数为true时，线程遍为守护线程。
 * 
 *     守护线程使用与普通线程没区别，但是结束实际上有一个区别之处，即：当进程结束时，所
 * 有正在运行的守护线程会强制结束。
 * 
 * 进程的结束：当一个进程中所有普通线程都结束时，进程结束。
 * 
 */
public class DaemonThreadDemo {
	public static void main(String[] args) {
		Thread rose = new Thread() {
			public void run() {
				for (int i = 0; i < 5; i++) {
					System.out.println("rose:Let me go！");
					try {
						Thread.sleep(1000);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
				}
				System.out.println("啊啊啊啊啊AAAAaaa~~咕噜咕噜咕噜");
				System.out.println("扑通～～");
			}
		};
		Thread jack = new Thread() {
			public void run() {
				while(true) {
					System.out.println("jack:You jump！I jump！");
					try {
						Thread.sleep(1000);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
				}
			}
		};
		
		rose.start();
		
		jack.setDaemon(true);   //守护线程的设定必须在调度线程之前设置。  
		jack.start();
		
	//	while(true) {
	//	}
	}
}
