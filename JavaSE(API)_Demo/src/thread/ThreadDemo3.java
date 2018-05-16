package thread;
/*
 * 以匿名内部类形式完成线程的两种创建方式。
 */
public class ThreadDemo3 {
	public static void main(String[] args) {
		//方式1  匿名内部类直接创建Thread
		Thread t1 = new Thread() {
			public void run() {
				for (int i = 0; i < 999; i++) {
					System.out.println("你是谁？");
				}
			}
		};
		
		//方式2 匿名内部类创建Runnable,再由线程运行
		Runnable r2 = new Runnable () {
			public void run() {
				for (int i = 0; i < 999; i++) {
					System.out.println("沃系渣渣灰，十年传奇，是兄弟就来砍沃！");
				}
			}
		};
		Thread t2 = new Thread (r2);
		t1.start();
		t2.start();
	}

}
