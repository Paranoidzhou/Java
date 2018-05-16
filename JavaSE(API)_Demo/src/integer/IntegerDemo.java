package integer;
/*
 * 包装类：
 *     由于8个基本类型没有面向对象特性，为了能让他们参与到面向对象的开发中，java
 * 为这8个基本类型提供了对应的8个包装类。
 * 
 * 6个合数字相关的包装类继承自java.lang.Number.
 *    
 *    Number是一个抽象类，定义了不同类型的数字之间互相转换的方法，所以6个数字类
 * 型的包装类都可以将其表示的基本类型在这6种类型之间转换。
 */
public class IntegerDemo {
	public static void main(String[] args) {
		/*
		 * 将基本类型转换为包装类
		 */
		//Integer i1 = new Integer(1);
		//Integer i2 = new Integer(1);
		/*
		 * 推荐使用包装类的静态方法valueOf来转换
		 */
		System.out.println("================");
		Integer i1 = Integer.valueOf(1);
		Integer i2 = Integer.valueOf(1);
		System.out.println(i1 == i2);               //true
		System.out.println(i1.equals(i2));			  //true
		System.out.println("================");

		 i1 = Integer.valueOf(127);
		 i2 = Integer.valueOf(127);	
		System.out.println(i1 == i2);					 //true
		System.out.println(i1.equals(i2));			 //true
		System.out.println("================");
		
		 //-128 到 127
		 i1 = Integer.valueOf(128);
		 i2 = Integer.valueOf(128);
		System.out.println(i1 == i2);					 //false
		System.out.println(i1.equals(i2));			 //true
		System.out.println("================");
		/*
		 * 任意包装类都可以转回各自类型，但不能超范围
		 */
		int a = i1.intValue();
		System.out.println(a);                     //128
		
		double b = i1.intValue();
		System.out.println(b);							 //128.0
		
		byte c = i1.byteValue();
		System.out.println(c);							 //-128
	}
}
