package test;

import java.util.Arrays;

public class Demo3 {
	public static void main(String[] args) {
		int arr[] = {1,2,3,4,5,6,7,8,9};
		arr = remove(arr,0);
		System.out.println(Arrays.toString(arr));
	}
	public static int[] remove(int[] ary, int index){
		for (int i = index; i < ary.length-1; i++) {
			ary[i] = ary[i+1];
		}
		ary = Arrays.copyOf(ary,ary.length-1);
		return ary;
	}
}
