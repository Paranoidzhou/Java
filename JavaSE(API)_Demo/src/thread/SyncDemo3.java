package thread;
/*
 * 静态方法若使用synchronized修饰后，那么该方法一定具有同步效果。
 * 
 * 静态方法的锁对象是当前类的类对象
 * Class类：
 * Class类的每一个实例用于表示JVM加载的一个类。
 *     当JVM加在一个类的时候就会实例化一个Class的实例用于表示它、每个类在JVM内部都有且
 * 只有一个Class的实例、所以静态方法锁的就是当前类对应的Class的实例。
 */
public class SyncDemo3 {
	public static void main(String[] args) {
		Thread  t1 = new Thread() {
			public void run() {
				Foo.dosome();
			}
		};
		Thread  t2 = new Thread() {
			public void run() {
				Foo.dosome();
			}
		};

		t1.start();
		t2.start();
	}
}
class Foo{
	public synchronized static void dosome() {
		Thread t = Thread.currentThread();
		try {
			System.out.println(t.getName()+":正在挑选衣服........");
			Thread.sleep(5000);

			System.out.println(t.getName()+":正在试穿衣服～！");
			Thread.sleep(5000);	

			System.out.println(t.getName()+":付款结帐！");
		} catch (InterruptedException e) {

			e.printStackTrace();
		}	
	}
}