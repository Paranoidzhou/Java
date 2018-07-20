package thread;
/**
 * 线程提供了一个方法:
 * void join()
 * 该方法允许一个线程在另一个线程上等待,直到其执行
 * 完毕后再继续运行.
 * 这样做可以协调线程间的"同步"运行.
 * 
 * 同步运行:代码执行有先后顺序(单线程运行是同步,多
 * 线程也可以进行同步运行操作)
 * 异步运行:代码各执行各的(多线程下运行代码是异步的)
 * @author adminitartor
 *
 */
public class JoinDemo {
	//标示图片是否下载完毕的状态
	public static boolean isFinish;
	
	public static void main(String[] args) {
		//下载线程
		final Thread download = new Thread(){
			public void run(){
				System.out.println("down:开始下载图片...");
				for(int i=1;i<=100;i++){
					System.out.println("down:"+i+"%");
					try {
						Thread.sleep(50);
					} catch (InterruptedException e) {
					}
				}
				System.out.println("down:图片下载完毕!");
				isFinish = true;
			}
		};
		
		Thread show = new Thread(){
			public void run(){
				System.out.println("show:开始显示图片...");
				//等待下载线程将图片下载完毕
				try {
					/*
					 * show线程在调用download.join()方法后
					 * 就进入了阻塞状态,直到download运行完毕
					 * 才会解除阻塞.
					 */
					download.join();
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
				
				
				if(!isFinish){
					throw new RuntimeException("图片加载失败!");
				}
				System.out.println("show:显示图片完毕!");
				
			}
		};
		
		download.start();
		show.start();
	}
}














