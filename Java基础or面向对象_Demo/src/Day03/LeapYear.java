package Day03;

import java.util.Scanner;
//闰年的判断公式：
/*   1)能被4整除，并且不能被100整除
 *    或者
 *   2)能被400整除。
 * 
 */
public class LeapYear {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("请输入年份:");
		int year = scan.nextInt();
		boolean flag = (year%400 == 0 && year%100 !=0) || year%400 == 0;
		String runnian = flag ? year+"是闰年": year+"是平年";
		System.out.println(runnian);

		/*
		System.out.println("请输入姓名：");
		Scanner name = new Scanner(System.in);
		String xueshenname = name.next();
		Scanner scan = new Scanner(System.in);
		System.out.print("请输出XX年：");
    int year = scan.nextInt();
    System.out.print("请输出xx月：");
    int Year = scan.nextInt();
    System.out.print("请输出xx日：");
    int yeaR = scan.nextInt();
    System.out.println("你的名字为："+xueshenname);
    System.out.println("您输入的年月日为："+year+'年'+Year+'月'+yeaR+'日');
		 */
	}
}
