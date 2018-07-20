package string;

public class LengthDemo04 {

	public static void main(String[] args) {
		/*
		 * 使用length() 方法检查字符串中字符的个数 
		 */
		String str = "今天你吃了吗?";
		//            0 1 2 3 4 5 6
		int len = str.length();
		System.out.println(len);//7
		
		/*
		 * String 的长度是属性还是方法:
		 * String 的长度 length() 方法
		 * 数组的长度是 length属性
		 */
		
		/*
		 * String 提供了charAt方法, 获取指定
		 * 位置上的字符.
		 */
		char ch = str.charAt(1);
		System.out.println(ch); 
		//利用length方法和charAt方法配合可以实现
		//遍历字符串中每个字符
		for(int i=0; i<str.length(); i++){
			char c = str.charAt(i);
			System.out.println(c);
		}
		
	}
	
}









