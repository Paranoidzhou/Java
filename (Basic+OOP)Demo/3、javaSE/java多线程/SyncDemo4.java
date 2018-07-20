package thread;
/**
 * 互斥锁
 * 使用synchronized锁定多段代码,而锁对象相同时,这
 * 些代码片段之间就是互斥的.多个线程不能同时执行这
 * 些方法.
 * 
 * @author adminitartor
 *
 */
public class SyncDemo4 {
	public static void main(String[] args) {
		final Boo boo = new Boo();
		Thread t1 = new Thread(){
			public void run(){
				boo.methodA();
			}
		};
		Thread t2 = new Thread(){
			public void run(){
				boo.methodB();
			}
		};
		t1.start();
		t2.start();
	}
}

class Boo{
	public synchronized void methodA(){
		try {
			Thread t = Thread.currentThread();
			System.out.println(t.getName()+":正在运行A方法...");
			Thread.sleep(5000);
			System.out.println(t.getName()+":运行A方法完毕");			
		} catch (Exception e) {
		}
	}
	public synchronized void methodB(){
		try {
			Thread t = Thread.currentThread();
			System.out.println(t.getName()+":正在运行B方法...");
			Thread.sleep(5000);
			System.out.println(t.getName()+":运行B方法完毕");			
		} catch (Exception e) {
		}
	}
}







