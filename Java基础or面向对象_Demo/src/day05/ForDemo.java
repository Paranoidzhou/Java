package day05;

public class ForDemo {

	public static void main(String[] args) {

		int num = 0;
		for (int i = 1; i <= 100; i++) {
			num   +=  i;	
		}
		System.out.println("num=" + num);
	}

}
/*				执行过程：
 *                num=0
 *      i = 1     num=0+1
 * 	  i = 2     num=0+1+2
 * 	  i = 3     num=0+1+2+3
 * 	  i = 4     num=0+1+2+3+4
 *      i = ***   num=0+1+2+3+4+***+100
 * 	  i = 101   判定为假，结束循环，输出num的值
 */
