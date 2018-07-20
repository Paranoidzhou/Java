package thread;
/**
 * 死锁现象
 * 线程都保持着自己的锁,但是都等待对方先释放锁时
 * 就出现了互相"僵持"的情况,导致程序不会再继续向
 * 下运行.
 * 
 * @author adminitartor
 *
 */
public class SyncDemo5 {
	public static void main(String[] args) {
		final Coo coo = new Coo();
		Thread t1 = new Thread(){
			public void run(){
				coo.methodA();
			}
		};
		Thread t2 = new Thread(){
			public void run(){
				coo.methodB();
			}
		};
		t1.start();
		t2.start();
	}
}

class Coo{	
	private Object syncA = new Object();
	private Object syncB = new Object();
	public void methodA(){
		synchronized (syncA) {
			Thread t = Thread.currentThread();
			System.out.println(t.getName()+":正在运行A方法..");
			try {
				Thread.sleep(5000);
			} catch (InterruptedException e) {
			}
			methodB();
			System.out.println(t.getName()+":运行A方法完毕");
		}		
	}
	public void methodB(){
		synchronized (syncB) {
			Thread t = Thread.currentThread();
			System.out.println(t.getName()+":正在运行B方法..");
			try {
				Thread.sleep(5000);
			} catch (InterruptedException e) {
			}
			methodA();
			System.out.println(t.getName()+":运行B方法完毕");
		}
	}
}














