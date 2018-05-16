package thread;
/*
 * 第二种创建线程的方式：
 * 实现Runnable接口单独定义线程任务。
 * 
 */
public class ThreadDemo2 {
	public static void main(String[] args) {
		/*创建任务*/
		MyRunnable1 m1 = new MyRunnable1();
		MyRunnable2 m2 = new MyRunnable2();

		/*创建线程*/
		Thread t1 = new Thread(m1);
		Thread t2 = new Thread(m2);
		
		/*启用线程调度*/
		t1.start();
		t2.start();
	}
}
class MyRunnable1 implements Runnable{
	public void run() {
		for (int i = 0; i < 999; i++) {
			System.out.println("我相信我就是我～");	
		}
	}
}
class MyRunnable2 implements Runnable{
	public void run() {
		for (int i = 0; i < 999; i++) {
			System.out.println("我相信明天，我相信会有新的地平线～");	
		}
	}
}