package thread;
/*
 * 多线程：
 * 多线程允许我们“同时”执行多段代码。
 *    线程是并发运行的，线程调度会统一规划CPU时间，将CPU的时间划分为若干片段，然后
 * 尽可能的均匀分配给所有要求并发运行的线程，每个线程在获得CPU时间片后CPU就来运行
 * 它的任务，当时间片用完后，CPU会离开并执行获取到CPU时间片的另一个线程。
 *    所以所有线程并非真正的“同时”运行着代码，而都是走走停停的，这种微观上的走走停
 * 停在宏观上感觉就是同时运行的现象称为并发运行。
 * 
 * 线程提供了两种创建方式：
 * 方式一：继承Thread并重写run方法来定义线程任务。
 * 方式一两个不足：
 * （1）由于java是单继承，这就导致若继承了Thread就不能再继承其他类，在实际开发中非
 * 常不方便，因为无法重用其他类的某些方法。
 * （2）由于继承Thread后重写run()方法定义了线程要执行的任务，这就导致线程与线程要
 * 执行的任务由一个必然的耦合关系，不利于线程重用。
 * 
 * 方式二：在ThreadDemo2中
 */
public class ThreadDemo1{ 
	public static void main(String[] args) {
		Thread t1 = new MyThread1();
		Thread t2 = new MyThread2();
		/*注意：启动线程不要调用run方法，而是要调用start方法。
		 *线程开始并发运行时会自动调用run方法。
		 */
		t1.start();
		t2.start();
	}
}
 class MyThread1 extends Thread {
	public void run() {
		for (int i = 0; i < 500; i++) {
			System.out.println("上海自来水来自海上！");
			System.out.println(i);
		}
	}
}
 class MyThread2 extends Thread{
	 public void run() {
		 for (int i = 0; i < 500; i++) {
			System.out.println("黄山落叶松叶落山黄！");
			System.out.println(i);
		}
	 }
 }