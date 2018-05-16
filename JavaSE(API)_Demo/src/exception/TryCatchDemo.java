package exception;
/*
 * java 异常捕获机制中的try-catch
 * 
 * 语法：
  try{
  
  }catch(XXException e){
  		捕获try代码片段中出现的xxException并处理
  }
 */
public class TryCatchDemo {
	public static void main(String[] args) {
	System.out.println("程序开始了！");
	
	/*
	 *    当JVM运行程序时发现出现了某个异常时，会自动实列化该类型的
	 *异常实例，并将代码执行过程设置到该异常实例中将其抛出。 
	 *
	 *   若抛出异常的代码没有被异常处理机制捕获，那么JVM会将该异常抛
	 *到当前方法之外，若抛出到main方法之外，则当前程序中断。【单线程情况下】
	 */
	try {	//try中出错代码以后的内容都不会再执行！
		
	//String str = null;
	  String str = "";
	System.out.println(str.length());
	System.out.println(str.charAt(0));
	System.out.println("没有抛出异常，此项会执行！");
	
	System.out.println(Integer.parseInt(str));
	//System.out.println("这句话大概不会执行了！");
	
	}catch(NullPointerException e) {
		System.out.println("温馨提示：出现空指针异常了！");
	}catch(StringIndexOutOfBoundsException e) {
		System.out.println("温馨提示：下标越界异常了！");
		/*养成一个好习惯：
		 * 在最后一个catch捕获Exception，防止因为未捕获的异常导致程序中断
		 * 【尽量在此之前先捕获所知的子类】
		 */
	}catch(Exception e ) {
		System.out.println("未知异次元异常* - *");
	}
	System.out.println("程序结束了！");

	}
}
