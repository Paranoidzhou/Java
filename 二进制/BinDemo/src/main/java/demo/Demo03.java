package demo;

public class Demo03 {

	public static void main(String[] args) {
		/*
		 * 查看一个数据的补码
		 */
		int n = -3;
		System.out.println(
				Integer.toBinaryString(n));
		
		//Java 利用parseInt将10进制负数转换为补码
		int i = Integer.parseInt("-3");
		System.out.println(
				Integer.toBinaryString(i));
		System.out.println(i); //toString(i)

	}

}



