package day06;

import java.util.Arrays;

public class ArrayDemo {

	public static void main(String[] args) {
		 int [] a = new int [] {1,2,3,4,5,6,7,8,9,10} ;
		 int [] b = Arrays.copyOf(a, 99);
		 for(int i = 0 ; i<b.length; i++) {
			 System.out.println(b[i]);

		 /*
		 for(int i = 1;i <a.length; i ++) {
			 a [i] =(int)(Math.random()*100);
		 }
		 System.arraycopy(a, 1, b,2, 6);
		 */
		 
		 }
		 
	}

}
