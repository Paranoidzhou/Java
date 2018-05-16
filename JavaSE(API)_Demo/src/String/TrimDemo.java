package String;

public class TrimDemo {

	public static void main(String[] args) {
		/*
		 * 		去除当前字符串的两端空白
		 *    trim()如果字符串两端有空白则返回
		 *     这个字符串的一个两端没有空白副本(当没被接收时，会被丢掉无用)
		 *     空白： 编号小于等于32的字符
		 */
		String str = "  \b\t\b\tTom\t\b\t\b \n";
		System.out.println(str);
		String s =str.trim();
		System.out.println(s);
		System.out.println(str == s);
		
	
		String s1 = "Jerry";
		String s2 = s1.trim();
		System.out.println(s1 == s2);
		
		
		
		/* 经典题：如下代码的输出结果为：*/
		String name = " Tom ";
		name.trim();
		System.out.println(name);
/*		A."Tom"  B." Tom " C."TOM" D."tom"           */
//      答案：B  原因：虽然使用了trim（）方法，生成了新的无空白副本，但是没有接收，输出还是原数组。
//		           纠正：name = name.trim();  接收新生成的无空白副本。则会输出新的无空白副本。
	}

}
