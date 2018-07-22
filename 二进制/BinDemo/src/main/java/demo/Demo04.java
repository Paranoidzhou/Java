package demo;

public class Demo04 {

	public static void main(String[] args) {
		/* 
		 * 补码特殊值的规律
		 */

		int n = 0; //0x0;
		int m = -1;//0xffffffff;
		int max = Integer.MAX_VALUE;//0x7fffffff
		int min = Integer.MIN_VALUE;//0x80000000
		System.out.println(
				Integer.toBinaryString(n));
		System.out.println(
				Integer.toBinaryString(m));
		System.out.println(
				Integer.toBinaryString(max));
		System.out.println(
				Integer.toBinaryString(min));
		
		long l = Long.MAX_VALUE;
		System.out.println(
			Long.toBinaryString(l)); 
		
	}
}






