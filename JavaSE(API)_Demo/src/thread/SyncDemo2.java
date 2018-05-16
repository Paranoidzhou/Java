package thread;
/*
 *有效的缩小同步范围可以在保证并发安全的前提下尽可能的提高并发效率。
 *
 * 同步块
 * syncharonized(同步监视器){
 * 		需要同步运行的代码片段
 * }
 * 
 * 同步块可以更灵活准确的锁定需要同步运行的代码片段，这样可以有效缩小同步范围提高并发效率。
 * 但是需要注意，必须保证多个线程看到的同步监视器对象是“同一个”才可以。
 */
public class SyncDemo2 {
	public static void main(String[] args) {
		final shop shoping = new shop();
		Thread t1 = new Thread() {
			public void run() {
				shoping.buy();
			}
		};
		Thread t2 = new Thread() {
			public void run() {
				shoping.buy();
			}
		};
		
		t1.start();
		t2.start();
	}
}
class shop{
   //public synchronized void buy() {
	public void buy() {
		Thread t = Thread.currentThread();
		try {
			System.out.println(t.getName()+":正在挑选衣服........");
			Thread.sleep(5000);
			//此处的this是shop的实例，谁调用这个方法就是谁	
			synchronized (this) { 
				System.out.println(t.getName()+":正在试穿衣服～！");
				Thread.sleep(5000);	
			}
			
			System.out.println(t.getName()+":付款结帐！");
		} catch (InterruptedException e) {
			
			e.printStackTrace();
		}	
	}
}
