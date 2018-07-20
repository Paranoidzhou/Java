package day05;
//for循环的演示
public class ForDemo {
	public static void main(String[] args) {
		/*
		//1到100的累加和，只要个位不为3的
		int sum = 0; //和
		for(int i=1;i<=100;i++){
			if(i%10!=3){
				sum = sum+i;
			}
		}
		System.out.println("sum="+sum);
		*/
		
		/*
		//1到100的累加和，跳过个位为3的
		int sum = 0; //和
		for(int i=1;i<=100;i++){
			if(i%10==3){
				continue;
			}
			sum = sum+i;
		}
		System.out.println("sum="+sum);
		*/
		/*
		 * sum=0
		 * i=1 sum=1
		 * i=2 sum=1+2
		 * i=3
		 * i=4 sum=1+2+4
		 */
		
		
		
		
		
		
		
		
		
		
		
		/*
		int sum = 0;
		for(int i=1;i<=100;i++){
			if(sum>=4000){
				break; //跳出循环
			}
			sum = sum+i;
		}
		System.out.println("sum="+sum);
		*/
		
		
		
		
		
		
		
		
		
		
		/*
		int sum = 0; //和
		int i=1;
		for(;i<=100;i++){
			sum = sum+i;
		}
		System.out.println("sum="+sum);
		*/
		
		/*
		int sum = 0; //和
		for(int i=1;i<=100;){
			sum = sum+i;
			i++;
		}
		System.out.println("sum="+sum);
		*/
		
		/*
		for(;;){ //死循环
			System.out.println("我要学习...");
		}
		*/
		
		/*
		for(int i=1,j=6;i<5;i+=2,j-=2){
		}
		*/
		/*
		 * i=1,j=6
		 * i=3,j=4
		 * i=5,j=2
		 */
		
		
		
		
		
		/*
		//累加:1+2+3+4+...+99+100=?
		int sum = 0; //和
		for(int i=1;i<=100;i++){
			sum = sum+i;
		}
		System.out.println("sum="+sum);
		*/
		/*
		 * 执行过程:
		 *     sum=0
		 * i=1 sum=1
		 * i=2 sum=1+2
		 * i=3 sum=1+2+3
		 * i=4 sum=1+2+3+4
		 * ...
		 * i=100 sum=1+2+3+4+...+100
		 * i=101
		 */
		
		
		
		
		
		
		
		
		
		
		
		/*
		for(int times=0;times<10;times++){
			System.out.println("行动是成功的阶梯");
		}
		for(int num=1;num<=9;num++){
			System.out.println(num+"*9="+num*9);
		}
		for(int num=9;num>=1;num--){
			System.out.println(num+"*9="+num*9);
		}
		*/
	}
}
















