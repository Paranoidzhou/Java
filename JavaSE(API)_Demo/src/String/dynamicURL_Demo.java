package String;

import java.util.Scanner;

public class dynamicURL_Demo {
	public static void main(String[] args) {
        /*
         * 动态URL截取
         */
		Scanner in = new Scanner(System.in);
		System.out.println("请随机输入一个完整网址：");
		String input = in.nextLine();
		int start =input.startsWith("https")?8:7;
		int end = input.indexOf('/',start);
		String host = input.substring(start,end);
		System.out.println(host);
	}
}
