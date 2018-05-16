package day07;																		

import java.util.Scanner;

public class Guessing {
	//主方法
	public static void main(String[] args) {
		Scanner scan =new Scanner(System.in);
		char [] chs = generate();
		System.out.println(chs);
		System.out.println("开始猜数字吧：（每轮猜五个，全中得500分，猜错一次扣10分）");
		int num = 0;
		while(true) {
			String str = scan.next().toUpperCase();     //toUpperCase转成大写
			char [] input = str.toCharArray();			  //toLowerCase转成小写
			if(str.equals("EXIT")) {                    //equals 判断引用数据内容相等
				System.out.println("欢迎下次在玩！");
				break;
			}
			int [] result = check(chs,input);
			
		if (result[1]==chs.length) {
			int score = 100 * chs.length - 10 * num;
			System.out.println("恭喜你！猜对了,你的最终成绩为："+score);
			break;
		}else {
			num++;
			System.out.println("字符对个数："+result[0]+",位置对个数："+result[1]);
			}
		}
	}
	//生成随机数组

	public static char [] generate (){											//generate----生成		

		char [] chs =  new char [5];   //定义一个字符数组
		char[] letters = { 'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J',//定义一串字符数组用来存数
				'K', 'L', 'M', 'N', 'O', 'P', 'Q', 'R', 'S', 'T', 'U', 'V',
				'W', 'X', 'Y', 'Z' };
		
		boolean [] flags = new boolean [letters .length];
		
		for (int i = 0; i < chs.length; i++) {										 //遍历chs数组
			int index;
			do {
				 index = (int)(Math.random()*letters.length);					 //定义一个随机数值
			}while (flags[index] == true );
			chs[i] = letters[index]; 												    //随机数值给相对应数组的位置字符赋值
			flags [index] = true;
			
			/*		i = 0   index = 0     flags[0] = 'A' (false != true)   chs[0]='A'   flags[0] == true  
			 * 
			 * 	i = 1   index = 25	 flags[25]= 'Z' (false != true)   chs[1]='Z'  flags[25]== true
			 *    i = 2   index = 25    flags[25]= 'Z' (true == true)   
			 * 			  index = 1     flags[1] = 'B' (false != true)	 chs[2]='B'   flags[1]== true
			 * 
			 * 	i = 3   index = 5     flags[5] = 'F' (false != true)   chs[3]='F'   flags[5]== true  
			 * 
			 * 	i = 4	  index = 0		 flags[0] =	'A' （true == true）   
			 * 			  index = 1		 flags[1] = 'B' (true == true)
			 * 		  	  index = 6     flags[6] = 'G' (false != true)   chs[4]='G'   flags[6]== true
			 */
		}
		return  chs;
	}

	//对比：随机字符数组chs与用户输入的字符数组input对比								//input-------输入
	public static int [] check (char [] chs,char [] input) {				//result------结果	
		int [] result = new int [2];	//定义一个整型数组用来存						//check-------检查
		for (int i = 0; i < chs.length; i++) {  // 假设[0]字符对   [1]位置对
			for (int j = 0; j < input.length; j++) {
				if(chs[i] == input [j]) {			//判断字符对
					if(i == j) {						//判断位置对
						result [1]++;
					}
					result [0] ++;
					break;
				}
			}
		}
		return  result;
	}

}
