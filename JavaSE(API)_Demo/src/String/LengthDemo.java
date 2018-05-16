package String;

public class LengthDemo {

	public static void main(String[] args) {
		String str = "你今天吃了吗？";
		int len = str.length();
		System.out.println(len);

		System.out.println(str.charAt(2));
		/*
		 *    String 提供了 charAt方法，获取指定位置上的字符。
		 */
		char ch = str.charAt(1);
		System.out.println(ch);
		/*
		 *     利用length方法合charAt方法配合可以实现遍历字符串中每个字符。
		 */
		for (int i = 0; i < str.length(); i++) {
			char c = str.charAt(i);
			System.out.println(c);
		}
	}

}
