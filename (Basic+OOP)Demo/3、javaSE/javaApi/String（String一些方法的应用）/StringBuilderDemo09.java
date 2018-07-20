package string;

public class StringBuilderDemo09 {
	public static void main(String[] args) {
		/*
		 * 字符串的连接操作建议使用 StringBuilder
		 * 进行优化 
		 */
		
		String s = "A";
		s += 5;
		s += 5;
		s += 5;
		s += 5;
		System.out.println(s);
		
		StringBuilder buf=new StringBuilder("A");
		buf.append(5);
		buf.append(5);
		buf.append(5);
		buf.append(5);
		String ss = buf.toString();
		System.out.println(ss); 
	}

}
