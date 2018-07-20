package thread;
/**
 * 线程提供了一个静态方法:
 * static Thread currentThread()
 * 该方法可以获取运行这个方法的线程
 * 
 * java中所有的代码都是线程运行的,main方法也不例外
 * JVM启动后会启动一个线程来执行main方法.通常我们
 * 称执行main方法的线程为"主线程"
 * 
 * 在Sprint的AOP中有一个功能,对数据库事务的切面
 * 处理,这里本质上用到了ThreadLocal这个类,而里面
 * 就要使用Thread.currentThread来得知运行代码的
 * 线程.
 * @author adminitartor
 *
 */
public class CurrentThreadDemo {
	public static void main(String[] args) {
		//获取运行main方法的线程
		Thread main = Thread.currentThread();
		System.out.println(main);
		dosome();
		
		Thread t = new Thread(){
			public void run(){
				Thread t = Thread.currentThread();
				System.out.println("自定义线程:"+t);
				dosome();
			}
		};
		t.start();
		
	}
	
	public static void dosome(){
		Thread t = Thread.currentThread();
		System.out.println("运行dosome方法的线程是:"+t);
	}
}





