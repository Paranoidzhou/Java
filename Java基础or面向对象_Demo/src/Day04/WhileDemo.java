package Day04;

public class WhileDemo {

	public static void main(String[] args) {
		/*
		int i = 1;
		while(i < 11) {
			System.out.println(i+"次：行动是成功的阶梯");
			i++;
		}
		 */		
		/*
		   i = 0 ,
		   true ，输出行动是成功的阶梯
		   i = 1 ,
		   true ，输出行动是成功的阶梯
		   i = 2 ,
		   true ，输出行动是成功的阶梯
		   i = 3 ,
		   true ，输出行动是成功的阶梯
		   i = 4 ,
		   true ，输出行动是成功的阶梯
		   i = 5 ,
		   true ，输出行动是成功的阶梯
		   i = 6 ,
		   true ，输出行动是成功的阶梯
		   i = 7 ,
		   true ，输出行动是成功的阶梯
		   i = 8 ,
		   true ，输出行动是成功的阶梯
		   i = 9 ,
		   true ，输出行动是成功的阶梯
			i = 10 ,
		   false ，循环结束不输出
		 */
		/*
		int num = 1;
		while(num <10) {
			System.out.println(num+"*9="+num * 9);
			num++;
		}
		 */
		int number= 9 ;
		while(number>=1) {
			System.out.println(number+"*9="+number*9);
			number -= 5 ;

		}
	}
}

