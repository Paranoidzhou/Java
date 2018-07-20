package string;

public class TrimDemo07 {
	public static void main(String[] args) {
		/*
		 * 去除当前字符串的两端空白
		 * trim() 如果字符串两端有空白则返回
		 * 这个字符串的一个两端没有空白副本
		 * 空白: 编号小于等于32的字符 
		 */
		String str = " \n \r  \t Tom \r  ";
		String s = str.trim();
		System.out.println(s); 
		System.out.println(str==s); //false
		
		String s1 = "Jerry";
		String s2 = s1.trim();
		System.out.println(s1==s2); 
		
		
		/*
		 * 如下代码的输出结果 
		 */
		String name = " Tom ";
		name.trim();
		System.out.println(name); 
		//A."Tom"  B." Tom " C."TOM"  D."tom"
		//答案: B 
	}
}














