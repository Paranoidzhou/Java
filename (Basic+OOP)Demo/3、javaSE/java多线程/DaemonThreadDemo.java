package thread;
/**
 * 守护线程
 * 守护线程又称为后台线程.默认创建的线程都不是
 * 守护线程,守护线程需要调用线程提供的方法设置:
 * void setDaemon(boolean on)
 * 当参数为true时,线程变为守护线程.
 * 
 * 守护线程使用与普通线程没区别,但是结束时机上
 * 有一个区别之处,即:当进程结束时,所有正在运行的
 * 守护线程会强制结束.
 * 
 * 进程的结束:当一个进程中所有普通线程都结束时,
 * 进程结束.
 * 
 * @author adminitartor
 *
 */
public class DaemonThreadDemo {
	public static void main(String[] args) {
		Thread rose = new Thread(){
			public void run(){
				for(int i=0;i<5;i++){
					System.out.println("rose:let me go!");
					try {
						Thread.sleep(1000);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
				}
				System.out.println("rose:啊啊啊啊啊AAAAAAaaaaaa.....");
				System.out.println("噗通!");
			}
		};
		
		Thread jack = new Thread(){
			public void run(){
				while(true){
					System.out.println("jack:you jump!i jump!");
					try {
						Thread.sleep(1000);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
				}
			}
		};
		rose.start();
		//start调用前进行设置
		jack.setDaemon(true);
		jack.start();
		
		
	}
}








