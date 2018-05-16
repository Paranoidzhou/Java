package Day03;

import java.util.Scanner;

public class AgeRange {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("请输入年龄：");
		int age = scan.nextInt();
		System.out.println("您输入的年龄为："+age);
		boolean c = age >=18 &&  age <=50;
		System.out.println(c); 

	}
}
