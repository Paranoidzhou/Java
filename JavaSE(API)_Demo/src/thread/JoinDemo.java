package thread;


/*
 * 线程提供了一个方法：
 * void join()
 * 该方法允许一个线程在另一个线程上等待，直到其执行完毕后再继续运行。这样做可以协调线程间的“同步”运行。  
 * 
 * 同步线程：代码执行有先后顺序（单线程运行是同步，多线程也可以进行同步运行操作。）
 * 异步运行：代码各执行各的（多线程下运行代码是异步的。）
 */
public class JoinDemo {
	/*定义一个属性：标识图片是否下载完毕的状态*/
	public static boolean isFinish;
	
	public static void main(String[] args) {
		//模拟一个下载图片的线程
		Thread download = new Thread() {
			public void run() {
				System.out.println("Start:图片下载中........");
				for (int i = 1; i <= 100; i++) {
					System.out.println("Down:"+i+"%");
					try {
						Thread.sleep(50);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
				}
				System.out.println("End:图片下载完毕........");
				isFinish = true;
			}
		};
		Thread show = new Thread() {
			public void run() {
				System.out.println("Show:开始加载图片。");
				/*等待下载线程将图片下载完毕*/
				try {
				/*  show线程在调用download.join()方法后就进入了阻塞状态，直到download
				 *运行完毕猜会解除阻塞。
				 */
					download.join();//这里会等download线程走完，才会走下一步。
				} catch (InterruptedException e) {
   				e.printStackTrace();
				}
				
				if(!isFinish) {
					throw new RuntimeException("图片加载失败～！");
				}
				System.out.println("图片显示成功～！");
			}
		};
		
		download.start();		
		show.start();
	}
}
