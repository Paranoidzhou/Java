package thread;
/**
 * 多线程并发安全问题
 * 
 * 当多个线程并发运行操作同一数据时,由于线程切换的
 * 时机不可控,可能会导致操作该数据时的过程未按照
 * 程序设计的执行顺序运行,导致操作出现混乱,严重时
 * 可能会导致系统瘫痪.
 * @author adminitartor
 *
 */
public class SyncDemo1 {
	public static void main(String[] args) {
		final Table table = new Table();
		Thread t1 = new Thread(){
			public void run(){
				while(true){
					int bean = table.getBean();
					Thread.yield();
					System.out.println(getName()+":"+bean);
				}
			}
		};
		Thread t2 = new Thread(){
			public void run(){
				while(true){
					int bean = table.getBean();
					Thread.yield();
					System.out.println(getName()+":"+bean);
				}
			}
		};
		t1.start();
		t2.start();
	}
}

class Table{
	//桌子上由20个豆子
	private int beans = 20;
	/**
	 * 当一个方法是用synchronized修饰后，那么该
	 * 方法变为"同步方法",多个线程不能同时进入方法
	 * 内容运行.而必须有顺序的一个一个运行.这样就
	 * 可以避免并发安全问题.
	 * 
	 * 在方法上使用synchronized,那么同步监视器对象
	 * 就是该方法所属对象,即:方法中看到的this
	 * @return
	 */
	public synchronized int getBean(){
		if(beans==0){
			throw new RuntimeException("没有豆子了!");
		}
		//模拟线程切换
		Thread.yield();
		return beans--;
	}
}









