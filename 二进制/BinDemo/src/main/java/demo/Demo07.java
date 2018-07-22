package demo;

public class Demo07 {

	public static void main(String[] args) {
		/**
		 * 验证右移位的数学意义
		 */
		int n = -50;
		int m = n>>1;
		int k = n>>2;
		int g = n>>>1;
		System.out.println(n);
		System.out.println(m);
		System.out.println(k);
		System.out.println(g);
	}

}
