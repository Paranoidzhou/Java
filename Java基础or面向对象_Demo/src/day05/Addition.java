package day05;

import java.util.Scanner;

public class Addition {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int score = 0;
		for(int i=1 ;i<=10 ; i++) {
			int a = (int)(Math.random()*100);
			int b = (int)(Math.random()*100);
			int daan = a + b;
			
			System.out.println("("+i+")"+a+"+"+b+"=?");
			System.out.println("请输入答案（若想退出请输入-1）：");
			int dati	= scan.nextInt();		
			if( dati == -1) {
				break;
			}
			if(dati == daan) {
				score += 10;
				System.out.println("恭喜你答对了！");
			}else {
				System.out.println("很遗憾你答错了！");
			}	
		}
		if(score >= 80) {
			System.out.println("你的总成绩为："+score+"分,成绩'A'等,你很优秀！");
		}else if(score < 80 && score >= 60){
			System.out.println("你的总成绩为："+score+"分，成绩'B'等，你还须努力！");
		}else {
			System.out.println("你的总成绩为："+score+"分，成绩'C'等，不及格！");
		}	
	}
}
