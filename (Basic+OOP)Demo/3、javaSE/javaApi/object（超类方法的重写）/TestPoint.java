package object;
/**
 * 测试Point重写的Object方法
 * @author adminitartor
 *
 */
public class TestPoint {
	public static void main(String[] args) {
		Point p = new Point(1,2);
		/*
		 * Object常见方法:
		 * String toString()
		 * 该方法的意义是将当前对象转换为一个字符串
		 * Object已经实现了该方法,返回的字符串是
		 * 当前对象的句柄(引用),格式为:
		 * 类名@地址
		 * 该字符串在实际开发中的意义不大.所以通常
		 * 需要使用这个方法时要重写它.
		 * 
		 */
//		String str = p.toString();
//		System.out.println(str);
		/*
		 * System.out.println(Object o)
		 * 该方法可以将java任何对象输出到控制台,
		 * 而输出的就是该对象toString方法返回的
		 * 字符串.
		 */
		System.out.println("p:"+p);
		
		
		Point p2 = new Point(1,2);
		System.out.println("p2:"+p2);
		
		System.out.println(p==p2);//false
		/*
		 * Object提供的equals方法内部就是用"=="
		 * 比较的,所以没有实际意义,若需要比较两个
		 * 对象内容是否相同应当重写该方法.java提供
		 * 的类都重写了equals.
		 */
		System.out.println(p.equals(p2));//true
		
	}
}











