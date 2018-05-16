package integer;
/*
 *   JDK1.5之后推出了一个新的特性：自动拆装箱
 *     该特性是编译器认可，而不是JVM认可的。
 *     编译器在编译代码时若遇到基本类型与包装类互用时会自动补全他们之间转换
 * 的代码，这样做可以让我们在源代码中遍写时不用考虑互转；
 */
public class IntegerDemo4 {
	public static void main(String[] args) {
		/*触发了自动拆箱特性                           以下两个方法在JDK1.5之后可以省略，编译器会默认补上*/
		int i = new Integer(1);              //.intValue();
		Integer in = i;                      //Integer.valueOf(i);
		dosome(i);
		dosome(in);
	}
	public static void dosome(Object o) {
		
	}
}
