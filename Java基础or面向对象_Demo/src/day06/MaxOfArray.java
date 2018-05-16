package day06;

import java.util.Arrays;

public class MaxOfArray {

	public static void main(String[] args) {
		// 求数组元素最大值
		int [] array = new int [10];
		int max = array[0];
		for(int i =0 ; i<10 ; i++) {
			array [i] =(int) (Math.random()*100);
			System.out.println(array[i]);
			if(array[i] > max) {
				max = array[i];
			}
		}
		System.out.println("最大值为："+max);
		
		array = Arrays.copyOf(array, array.length+1);
		array[array.length-1] = max;
		for (int i = 0; i<array.length;i++) {
			System.out.println(array[i]);
		}
		System.out.println("最大值赋值后为："+max);
	}
}
