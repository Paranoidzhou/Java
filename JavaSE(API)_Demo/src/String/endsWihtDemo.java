package String;

import java.util.Scanner;

public class endsWihtDemo {

	public static void main(String[] args) {
		/*
		 * 测试此字符串是否以指定的后缀结束.(且区分大小写)
		 * 如果参数表示的字符序列是此对象表示的字符序列的后缀，则返回 true；否则返回 false。
		 */
		String str = "Thinking in Java";
		System.out.println(str.endsWith("Java"));		//输出为true
		System.out.println(str.endsWith("Thinking"));//输出为false
		System.out.println(str.endsWith("in"));		//输出为true
		/*
		 * 测试此字符串从指定索引开始的子字符串是否以指定前缀开始。（且区分大小写）
		 * 如果参数表示的字符序列是此对象从索引开始处的子字符串前缀，则返回 true；否则返回 false。
		 */
		System.out.println(str.startsWith("Think"));//输出为true
		System.out.println(str.startsWith("Thing"));//输出为false（若为单词则必须单词每个字母都对）
		System.out.println(str.startsWith("Th"));	  //输出为true
		System.out.println(str.startsWith("in"));	  //输出为false
		
		/*
		 * 测试 startsWith()
		 * 检测输入的用户名是否是老王
		 */
		Scanner in = new Scanner(System.in);
		System.out.println("请输入一个名字：");
		String name = in.nextLine();
		if(name.startsWith("王")) {
			System.out.println("老王洪福齐天！");
		}else{
			System.out.println("不姓王你凑个鸡儿热闹！");
		}
	}
}
