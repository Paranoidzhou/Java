package demo;

public class Demo02 {

	public static void main(String[] args) {
		/**
		 * 16进制用于缩写2进制数
		 * 01110010 01001111 11010101 01010101
		 * 7   2    4   f    d   5    5   5
 		 */
		int n = 0x724fd555;
		System.out.println(
			Integer.toBinaryString(n));
		
	}

}
