package exception;
/**
 * finally块
 * finally块只能定义在异常处理机制的最后,可以直接
 * 跟在try后面或者最后一个catch之后.
 * 
 * finally可以保证只要程序运行到try当中,那么无论
 * try当中的代码片段是否出现异常,finally块里面的
 * 代码都必然执行.
 * 通常把释放资源等操作放在finally中,比如流的关闭.
 * @author adminitartor
 *
 */
public class FinallyDemo {
	public static void main(String[] args) {
		System.out.println("程序开始了");
		try {
			String str = "";
			System.out.println(str.length());
			return;
		} catch (Exception e) {
			System.out.println("出错了!");
		} finally{
			System.out.println("finally中的代码运行了!");	
		}
		System.out.println("程序结束了");
	}
}








