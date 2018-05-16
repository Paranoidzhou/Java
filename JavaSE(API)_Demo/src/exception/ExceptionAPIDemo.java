package exception;
/*
 * 异常常用方法：
 */
public class ExceptionAPIDemo {
	public static void main(String[] args) {
		System.out.println("程序开始了！");
		try {
			String str = "a";
			/*Integer.parseInt(String)：将字符类型数据转换为Integer整型数据
			 * Integer.parseInt(String)遇到一些不能被转换为整型的字符时，会抛出异常
			 */
			System.out.println(Integer.parseInt(str));
		} catch (Exception e) {
			System.out.println("出错了！");
			//输出错误堆栈信息
			e.printStackTrace();
			
			//获取错误消息
			String message = e.getMessage();
			System.out.println("message:"+message);
		}
		System.out.println("程序结束了！");
	}
}
