package thread;
/*
 * 查看线程信息的相关方法。
 */
public class InfoDemo {
	public static void main(String[] args) {
		Thread main = Thread.currentThread();
		/*获取线程标识符（ID）*/
		long id = main.getId();
		System.out.println(id);
		/*获取线程名称*/
		String name = main.getName();
		System.out.println(name);
		/*获取线程优先级*/
		int priority = main.getPriority();
		System.out.println(priority);
		/*获取线程状态*/
		System.out.println("线程状态："+main.getState());
		/*测试线程是否处与活动状态*/
		System.out.println("isAlive:"+main.isAlive());
		/*测试线程是否为守护线程*/
		System.out.println("isDaemon:"+main.isDaemon());
		/*测试线程是否已经中断*/
		System.out.println("isInterruped:"+main.isInterrupted());

	}
}
