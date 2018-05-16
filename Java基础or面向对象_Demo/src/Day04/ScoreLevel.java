package Day04;

import java.util.Scanner;

public class ScoreLevel {

	public static void main(String[] args) {
		System.out.print("请输入任意成绩:");
		Scanner scan = new Scanner(System.in); 
		int score = scan.nextInt();

		if(score < 0 || score > 100 ) {
			System.out.println("error:你输入的成绩不合法\n:请输入100以内并且是成绩为正数");

		}else if(score >= 90) {
			System.out.println("你的成绩为：优秀'A'等.");

		}else if(score >= 80) {
			System.out.println("你的成绩为：良好'B'等.");

		}else if(score >= 60) {
			System.out.println("你的成绩为:及格'C'等.");

		}else {
			System.out.println("你的成绩为：不及格'D'等.");
		}
	}
}
