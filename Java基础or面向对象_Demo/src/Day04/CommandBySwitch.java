package Day04;

import java.util.Scanner;

public class CommandBySwitch {
	public static void main(String[] args) {
		System.out.println("请选择功能：\n1.显示全部记录\n2.查询登录记录\n0.退出");
		Scanner scan = new Scanner(System.in);
		int command = scan.nextInt();
		/*  if(command == 1) {
    	System.out.println("全部记录");
    }else if (command == 2){
    	System.out.println("登录记录");
    }else if(command ==0) {
    	System.out.println("欢迎下次使用");
    }else{
    	System.out.println("error:输入错误");
    }
		 */

		switch (command) {
		case 1 :
			System.out.println("全部记录");
			break;
		case 2:
			System.out.println("登录记录");
			break;
		case 0:
			System.out.println("欢迎下次使用");
			break;
		default :
			System.out.println("error:输入错误");
		}  
	}
}
