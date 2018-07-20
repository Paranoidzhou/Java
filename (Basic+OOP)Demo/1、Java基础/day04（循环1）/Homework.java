package day04;
//作业讲解
public class Homework {
	public static void main(String[] args) {
		/*
		 * 补充:
		 * 1)变量的作用域/范围:
		 *     从变量的声明开始，到包含它最近的大括号结束
		 * 2)变量的重名问题:
		 *     作用域重叠时，变量不能同名
		 */
		/*
		int a=5;
		if(a>2){
			int b=8;
			//int a=55; //编译错误，作用域重叠时不能同名
		}else{
			int b=6;
		}
		*/
		
		/*
		int a=5;
		if(a>2){
			int b=6;
			System.out.println(a);
			System.out.println(b);
		}
		System.out.println(a);
		System.out.println(b); //编译错误，超出b的作用范围了
		*/
		
		/* 
		//4.三个数的排序:
		int a=8,b=2,c=5;
		if(a>b){
			int t=a;
			a=b;
			b=t;
		}
		if(a>c){
			int t=a;
			a=c;
			c=t;
		}
		if(b>c){
			int t=b;
			b=c;
			c=t;
		}
		System.out.println("a="+a);
		System.out.println("b="+b);
		System.out.println("c="+c);
		*/
		
		
		
		
		
		
		
		
		/*
		//3.两个数的排序:
		int a=8,b=55;
		if(a>b){
			int t=a;
			a=b;
			b=t;
		}
		System.out.println("a="+a);
		System.out.println("b="+b);
		*/
		
		
		
		
		
		
		
		
		
		
		/*
		//2.闰年的判断:
		int year = 2000;
		if((year%4==0 && year%100!=0) || year%400==0){
			System.out.println(year+"是闰年");
		}else{
			System.out.println(year+"不是闰年");
		}
		*/
		
		/*
		//1.求两个数中的最大值
		int a=8,b=55;
		int max = a>b?a:b;
		System.out.println("max="+max);
		*/
	}
}





















