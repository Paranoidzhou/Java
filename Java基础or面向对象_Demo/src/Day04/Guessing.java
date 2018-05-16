package Day04;

import java.util.Scanner;

public class Guessing {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		//int num = (int)(Math.random()*1000+1);
		int num = 100;
		int guess;
		System.out.println("请随机输入一个数：");
		do{
			guess = scan.nextInt();
			if(guess == 0){
				break;
			}
			if(guess > num) {
				System.out.println("很遗憾，猜大了，请猜小一点：");
			}else if(guess < num){
				System.out.println("很遗憾，猜小了，请猜大一点：");
			}

		}while (guess != num);
		if(guess == 0) {
			System.out.println("很遗憾，欢迎下次在玩！");
		}else {
			System.out.println("恭喜你，猜对了！");
		}
		/*
		 System.out.println("请随机输入一个数字：\n若想退出请输0：");
		 int guess = scan.nextInt();
		 while(guess != num) {
			 if(guess == 0) {
				 break;
			 }
			 if(guess > num) {
				 System.out.println("猜大了，请再输入小一点的数：");
			 }else {
				 System.out.println("猜小了，请在输入大一点的数:");
			 }
			// System.out.println("猜错了，请重新输入：");
			 guess = scan.nextInt();
		 }
		 if(guess == 0) {
			 System.out.println("很遗憾，欢迎下次在玩！");
		 }else {
			 System.out.println("猜对了，恭喜！");
		 } 
		 */
	}
}
