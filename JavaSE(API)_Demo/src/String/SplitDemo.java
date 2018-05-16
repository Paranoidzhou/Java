package String;

import java.util.Arrays;

public class SplitDemo {
	/*
	 * 	 java支持正则表达式方法2：
	 * 
	 *     String[] split(String regex)
	 * 		 将当前字符串按照满足正则表达式的部分拆分，将拆分出来的内容存入字符串数组并返回
	 */	
	public static void main(String[] args) {
		
        String str = "abc123def456ghi789";
        /*
		   按照数字部分进行拆分，获得所有字母部分。 
		 */
        String []data = str.split("[0-9]+");     //加了 +号
        System.out.println(data.length);
        System.out.println(Arrays.toString(data));
        System.out.println("============================");
        String str1 = "abc123def456ghi789";
        /*
           若连续匹配了拆分部分，那么中间会拆分出一个空字符赋串。
         */
        String []data1 = str1.split("[0-9]");    //不加 +号
        System.out.println(data1.length);
        System.out.println(Arrays.toString(data1));
	}
}
