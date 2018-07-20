package thread;
/**
 * 多线程
 * 多线程允许我们"同时"执行多段代码.
 * 
 * 线程是并发运行的,线程调度会统一规划CPU时间,将
 * CPU的时间划分为若干片段,然后尽可能的均匀分配给
 * 所有要并发运行的线程,每个线程在获得CPU时间片后
 * CPU就来运行它的任务,当时间片用完后,CPU会离开并
 * 执行获取到CPU时间片的线程.
 * 所以所有线程并非真正的"同时"运行着代码,而都是
 * 走走停停的,这种微观上走走停停,宏观上感觉是同时
 * 运行的现象称为并发运行.
 * 
 * 线程提供了两种创建方式
 * 方式一:
 * 继承Thread并重写run方法来定义线程任务.
 * @author adminitartor
 *
 */
public class ThreadDemo1 {
	public static void main(String[] args) {
		Thread t1 = new MyThread1();
		Thread t2 = new MyThread2();
		/*
		 * 注意,启动线程不要调用run方法,而是要
		 * 调用start方法.
		 * 线程开始并发运行时会自动调用run方法.
		 */
		t1.start();
		t2.start();
		
	}
}
/*
 * 第一种创建线程的方式有两个不足:
 * 1:由于java是单继承,这就导致若继承了Thread就不能
 *   再继承其他类,在实际开发中非常不方便,因为无法重
 *   用其他类的某些方法.
 * 2:由于继承Thread后重写run方法定义了线程要执行的
 *   任务,这就导致线程与线程要执行的任务有一个必然
 *   的耦合关系,不利于线程重用.  
 */
class MyThread1 extends Thread{
	public void run(){
		for(int i=0;i<1000;i++){
			System.out.println("你是谁啊?");
		}
	}
}
class MyThread2 extends Thread{
	public void run(){
		for(int i=0;i<1000;i++){
			System.out.println("我是查水表的!");
		}
	}
}







