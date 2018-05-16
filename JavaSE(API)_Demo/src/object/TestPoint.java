package object;
/*
 *          测试Point重写的Object方法
 */
public class TestPoint {
	public static void main(String[] args) {
		Point p = new Point(1,2); 
		/*
		 * Object常见方法：
		 * String toString()
		 * 该方法的意义是将当前对象转换为一个字符串，Object已经实现了该方法，返回的字符
		 * 串是当前对象的句柄（引用)，格式为：
		 * 类名@地址
		 * 该字符在实际开发中的意义不大。所以通常需要使用合资格方法时要重写它。
		 */
		String str = p.toString();
		System.out.println(str);         
		/*
		 * System.out.println(Object o )
		 * 改方法可以将Java任何对象输出到控制台，而输出的就是该对象toString方法返回的字符串。
		 */
		System.out.println(p);
		
//		p.setX(15);
//		p.setY(25);
//		System.out.println("("+p.getX()+","+p.getY()+")");
//		System.out.println("======================");
//		p.setX(66);
//		p.setY(99);
//		System.out.println("("+p.getX()+","+p.getY()+")");
			
		Point p2 = new Point(1,2);
		System.out.println("p2:"+p2);			
		System.out.println( p == p2);       //双=号是判断是否相等。比的是指向地址是否一样
		/*
		 *    Object提供的equals方法内部就是用"=="比较的，所以没有实际意义，若需要比较两个对
		 * 象内容是否相同应当重写该方法.java提供的类都重写了equals.
		 */
		System.out.println(p.equals(p2));   //equals比较的是内容是否一样
		
		
		
		
		
		
		
	}
}
