package exception;
/*
 * finally块
 *   finally块只能定义在异常处理机制的最后，可以直接跟在try后面，
 * 或者最后一个catch之后。
 *   finall可以保证只要程序运行到try当中，那么无论try当中的代码片
 * 段是否出现异常，finally块里面的代码都必然执行。  
 * 通常把释放资源等操作放在finally中，比如流的关闭。
 */
public class FinallyDemo {
	public static void main(String[] args) {
		System.out.println("程序开始了！");
		try {
			String str = "";
			System.out.println(str.length());
			return;
		}catch(Exception e){
			System.out.println("温馨提示：你的程序报错了！");
		}finally {
			System.out.println("finally捕获异常：来自你的程序错误！");
		}
		System.out.println("程序结束了！");
	}
}
