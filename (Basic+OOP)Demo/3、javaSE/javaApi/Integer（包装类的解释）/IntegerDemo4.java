package integer;
/**
 * JDK1.5之后推出了一个新的特性:自动拆装箱
 * 该特性是编译器认可,而不是JVM.
 * 编译器在编译代码时若遇到基本类型与包装类互用时
 * 会自动补全它们之间转换的代码.这样做可以让我们在
 * 源代码中编写时不再考虑互转.
 * @author adminitartor
 *
 */
public class IntegerDemo4 {
	public static void main(String[] args) {
		/*
		 * 触发了自动拆箱特性
		 * 编译器会将代码改变为:
		 * int i = new Integer(1).intValue();
		 */
		int i = new Integer(1);
		/*
		 * 触发了自动装箱特性
		 * 编译器会将代码改变为:
		 * Integer in = Integer.valueOf(i);
		 */
		Integer in = i;
		
	}
	
}






