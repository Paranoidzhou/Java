package thread;
/*
 * 死锁现象:
 * 线程都保持着自己的锁，但是都等待对方先释放锁,所以就出现了互相"僵持"的情况，导致程序不会在继续向下运行。
 */
public class SyncDemo5 {
	public static void main(String[] args) {
		final Coo coo = new Coo();
		Thread t1 = new Thread() {
			public void run() {
				coo.Aoo();
			}
		};
		Thread t2 = new Thread() {
			public void run() {
				coo.Boo();
			}
		};
		t1.start();
		t2.start();
	}
}
class Coo{
	private Object syncA = new Object();
	private Object syncB = new Object();

	public void Aoo() {
		synchronized(syncA) {
			try {
				Thread t = Thread.currentThread();
				System.out.println(t.getName()+":正在执行A方法...");
				Thread.sleep(5000);
				Boo();
				System.out.println(t.getName()+":A方法执行完毕～！");
			}catch(Exception e) {
			}
		}
	}
	public void Boo() {
		synchronized(syncB) {
			try {
				Thread t = Thread.currentThread();
				System.out.println(t.getName()+":正在执行B方法...");
				Thread.sleep(5000);
				Aoo();
				System.out.println(t.getName()+":B方法执行完毕～！");
			}catch(Exception e) {
			}
		}
	}
}