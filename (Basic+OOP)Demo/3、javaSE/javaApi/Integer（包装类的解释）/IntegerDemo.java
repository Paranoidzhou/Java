package integer;
/**
 * 包装类
 * 由于8个基本类型没有面向对象特性,为了能让他们参与
 * 到面向对象的开发中,java为这8个基本类型提供了对应
 * 的8个包装类.
 * 
 * 6个和数字相关的包装类继承自java.lang.Number
 * Number是一个抽象类,定义了不同类型的数字之间互相
 * 转换的方法.所以6个数字类型的包装类都可以将其表示
 * 的基本类型在这6中类型之间转换.
 * @author adminitartor
 *
 */
public class IntegerDemo {
	public static void main(String[] args) {
		/*
		 * 将基本类型转换为包装类	
		 */
//		Integer i1 = new Integer(1);
//		Integer i2 = new Integer(1);
		/*
		 * 推荐使用包装类的静态方法valueOf来转换
		 */
		Integer i1 = Integer.valueOf(128);
		Integer i2 = Integer.valueOf(128);
		
		System.out.println(i1==i2);
		System.out.println(i1.equals(i2));
		
		int d = i1.intValue();
		System.out.println(d);
		
		double dou = i1.doubleValue();
		System.out.println(dou);
		
		byte b = i1.byteValue();
		System.out.println(b);
	}
	
}








