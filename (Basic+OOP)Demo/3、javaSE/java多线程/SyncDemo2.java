package thread;
/**
 * 有效的缩小同步范围可以在保证并发安全的前提下
 * 尽可能提高并发效率
 * 
 * 同步块
 * synchronized(同步监视器){
 * 	  需要同步运行的代码片段
 * }
 * 
 * 同步块可以更灵活准确的锁定需要同步运行的代码片段
 * 这样可以有效缩小同步范围提高并发效率
 * 但是需要注意,必须保证多个线程看到的同步监视器
 * 对象是"同一个"才可以.
 * 
 * 
 * @author adminitartor
 *
 */
public class SyncDemo2 {
	public static void main(String[] args) {
		final Shop shop = new Shop();
		Thread t1 = new Thread(){
			public void run(){
				shop.buy();
			}
		};
		Thread t2 = new Thread(){
			public void run(){
				shop.buy();
			}
		};
		t1.start();
		t2.start();
	}
}

class Shop{
//	public synchronized void buy(){
	public void buy(){
		Thread t = Thread.currentThread();
		try {
			System.out.println(t.getName()+":正在挑衣服...");
			Thread.sleep(5000);
			synchronized (this) {
				System.out.println(t.getName()+":正在试衣服...");
				Thread.sleep(5000);
			}
			
			
			System.out.println(t.getName()+":结账离开");
		} catch (Exception e) {
		}
	}
}







