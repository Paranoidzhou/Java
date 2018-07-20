package string;

public class StringDemo02 {
	public static final String S = "abc";
	public static void main(String[] args) {
		/**
		 * 字符串常量池重用现象
		 * 字面量字符串创建后其引用会保存到
		 * 字符串常量池中, 当再次使用相同字符串
		 * 字面量时候,会使用上一次的字符串引用!
		 */
		String s1 = "abc";
		String s2 = "abc";
		System.out.println(s1==s2);
		String s3 = "abc";
		System.out.println(s1==s3);
		System.out.println(s1==S);
		String s4 = new String("abc");
		System.out.println(s1==s4);//false
		
		/*
		 * 字面量 或 常量的连接结果, 也会
		 * 重用字符串常量池中的对象
		 */
		String s6 = "ab"+"c"; //"abc"
		System.out.println(s1==s6);//true
		//字符串变量的连接结果不会常量池优化
		String s7 = "ab";
		String s8 = s7+"c";//创建了新对象
		System.out.println(s8==s1); //false
		
		
	}
}







