package string;

public class StringDemo01 {

	public static void main(String[] args) {
		/* 
		 * 字符串"对象"是不可改变的
		 */
		String s1 = "abc";
		String s2 = s1;
		s1 = s1 + "def";
		System.out.println(s1);
		System.out.println(s2);
		
	}
}







