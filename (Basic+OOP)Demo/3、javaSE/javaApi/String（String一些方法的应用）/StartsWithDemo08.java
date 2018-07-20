package string;

import java.util.Scanner;

public class StartsWithDemo08 {
	public static void main(String[] args) {
		/*
		 * 测试 startsWith()
		 * 检查输入的用户名是否是老王
		 */
		Scanner in = new Scanner(System.in);
		System.out.print("输入用户名:");
		String name = in.nextLine();
		if(name.startsWith("王")){
			System.out.println("老王好!"); 
		}
		
		/* 
		 * http://canglaoshi.org/index.html
		 * https://canglaoshi.org/index.html
		 */
		String url="https://canglaoshi.org/index.html";
		int start=url.startsWith("https")?8:7;
		int end = url.indexOf("/", start);
		String host = url.substring(start, end);
		System.out.println(host); 
	}
}






