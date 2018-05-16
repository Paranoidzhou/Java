package thread;
/*
 * 互斥锁
 *     使用synchronized锁定多断代码，而锁对象的相同时，这些代码片段之间就是互斥的。
 * 多个线程不能同时执行这些方法。
 * 
 */
public class SyncDemo4 {
	public static void main(String[] args) {
		final Poo p = new Poo();
		Thread t1 = new Thread() {
			public void run() {
				p.Aoo();
			}
		};
		Thread t2 = new Thread() {
			public void run() {
				p.Boo();
			}
		};
		
		t1.start();
		t2.start();
	}
}
class Poo{
	public synchronized void Aoo() { 
		try {
			Thread t = Thread.currentThread();
			System.out.println(t.getName()+":正在执行A方法");	
			Thread.sleep(5000);
			System.out.println(t.getName()+":A方法执行完毕");
		}catch(Exception e) {
		}
	}
	public synchronized void Boo() { 
		//synchronized(this) {   效果是一样的，一个在外面等，一个在里面等。
		try {
			Thread t = Thread.currentThread();
			System.out.println(t.getName()+":正在执行B方法");	
			Thread.sleep(5000);
			System.out.println(t.getName()+":B方法执行完毕");
		}catch(Exception e) {
		}
		//}
	}
}
