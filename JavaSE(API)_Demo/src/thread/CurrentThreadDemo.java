package thread;
/*
 * 线程提供了一个静态方法：
 * static Thread currentThread()
 * 该方法可以获取运行这个方法的线程。
 * 
 * java中所有的代码都是线程运行的，main方法也不例外，JVM启动后会启动一个线程来执行main方法。
 * 通常|我们称执行main方法的线程为“主线程”。
 * 
 *    在Sprint的AOP中有一个功能，对数据库事物的切面处理，这里本质上用到了ThreadLocal这个类，而
 * 里面就要使用Thread.currentThread来得知运行代码的线程。
 */
public class CurrentThreadDemo {
	public static void main(String[] args) {
		//获取运行main方法的线程。
		Thread main = Thread.currentThread();
		System.out.println(main);
	   /*运行输出Thread[main,5,main] 它们左到右分别为：线程名字，优先级，线程所在组*/
		dosome();
	  /*Thread[main,5,main]   也就是说它在main线程内，依然是由main线程执行。*/
		
		Thread t = new Thread() {
			public void run() {
				Thread t = Thread.currentThread();
				System.out.println(t);
				dosome();
	 /*Thread[main-0,5,main]   也就是说它在new出来的线程内，由nue出来线程执行。*/
			}
		};
		t.start();
		/*[Thread-0,5,main]   也就是说它在new的新线程内，是由new出来的线程执行。*/
	}
	public static void dosome() {
		Thread dosome = Thread.currentThread();
		System.out.println("运行dosome方法的线程是："+dosome);
		
	}
}
