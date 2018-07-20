package day07;
import java.util.Scanner;
//猜字符小游戏
public class Guessing {
	//主方法
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		char[] chs = generate(); //获取随机字符数组
		System.out.println(chs); //作弊
		int count = 0; //猜错的次数
		while(true){ //自造死循环
			System.out.println("猜吧!");
			String str = scan.next().toUpperCase(); //获取用户输入的字符串
			if(str.equals("EXIT")){ //判断字符串内容相等
				System.out.println("下次再来吧!");
				break;
			}
			char[] input = str.toCharArray(); //将字符串转换为字符数组
			int[] result = check(chs,input); //对比:随机字符数组与用户输入的字符数组
			if(result[0]==chs.length){ //对
				int score = 100*chs.length-10*count; //一个字符100分，猜错一次扣10分
				System.out.println("恭喜你，猜对了!得分为:"+score);
				break; //终止循环
			}else{ //错
				count++; //猜错次数增1
				System.out.println("字符对个数为:"+result[1]+"，位置对个数为:"+result[0]);
			}
		}
	}
	
	//生成随机字符数组chs
	public static char[] generate(){
		char[] chs = new char[5]; //随机字符数组
		char[] letters = { 'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J',
				'K', 'L', 'M', 'N', 'O', 'P', 'Q', 'R', 'S', 'T', 'U', 'V',
				'W', 'X', 'Y', 'Z' }; //随机字符范围数组
		boolean[] flags = new boolean[letters.length]; //开关数组
		for(int i=0;i<chs.length;i++){ //遍历随机字符数组
			int index;
			do{
				index = (int)(Math.random()*letters.length); //随机下标(0到25)
			}while(flags[index]==true); //当下标index对应的开关为true时，表示对应字符已存过，则重新生成下标index
			                            //当下标index对应的开关为false时，表示对应字符未存过，则循环结束
			chs[i] = letters[index]; //基于下标index到letters获取字符并赋值给chs中的每一个元素
			flags[index] = true; //将下标index对应的开关修改为true，表示对应字符已存过
		}
		//i=0 index=0           chs[0]='A' flags[0]=true
		//i=1 index=25          chs[1]='Z' flags[25]=true
		//i=2 index=0/25/0/25/1 chs[2]='B' flags[1]=true
		return chs;
	}
	
	//对比:随机字符数组chs与用户输入的字符数组input
	public static int[] check(char[] chs,char[] input){
		int[] result = new int[2]; //(0,0)，假设result[0]为位置对，result[1]为字符对
		for(int i=0;i<chs.length;i++){ //遍历随机字符数组
			for(int j=0;j<input.length;j++){ //遍历用户输入的字符数组
				if(chs[i]==input[j]){ //字符对
					result[1]++; //字符对个数增1
					if(i==j){ //位置对
						result[0]++; //位置对个数增1
					}
					break; //剩余input元素不再参与比较了
				}
			}
		}
		return result;
	}

}



















