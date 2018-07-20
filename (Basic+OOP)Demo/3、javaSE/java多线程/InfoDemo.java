package thread;
/**
 * 查看线程信息的相关方法
 * 
 * @author adminitartor
 *
 */
public class InfoDemo {
	public static void main(String[] args) {
		Thread main = Thread.currentThread();
		long id = main.getId();
		System.out.println("id:"+id);	
		String name = main.getName();
		System.out.println("name:"+name);	
		int priority = main.getPriority();
		System.out.println("priority:"+priority);
		System.out.println("isAlive:"+main.isAlive());
		System.out.println("isDaemon:"+main.isDaemon());
		System.out.println("isInterrupted:"+main.isInterrupted());
	}
}



