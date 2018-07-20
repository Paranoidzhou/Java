package exception;
/**
 * 异常的抛出
 * 
 * throw关键字,用于将一个异常抛出.
 * 通常两种情况会主动抛出一个异常:
 * 1:程序遇到一个满足语法要求,但是不满足业务逻辑
 *   要求的时候可以主动抛出一个异常给调用者.
 * 2:程序出现了异常,但是不应当在当前代码片段中解决
 *   该异常时可以抛出给调用者.  
 * 
 * @author adminitartor
 *
 */
public class ThrowDemo {
	public static void main(String[] args){
		Person p = new Person();
			/*
			 * 满足语法,但是不满足业务逻辑要求
			 */
		
			/*
			 * 当我们调用一个含有throws声明异常
			 * 抛出的方法时,编译器要求我们必须
			 * 处理这个异常,处理方式有两种:
			 * 1:try-catch自行捕获并处理.
			 * 2:在当前方法上继续使用throws声明
			 *   将该异常抛出.
			 */
		
		try {
			p.setAge(10000);
		} catch (IllegalAgeException e) {
			e.printStackTrace();
		}
		

		System.out.println("年龄:"+p.getAge());
		
	}
}










