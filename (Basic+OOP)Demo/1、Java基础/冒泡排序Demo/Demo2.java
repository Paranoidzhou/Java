package test;

import java.util.Arrays;
/**
 * 第一种方法
 * @author adminitartor
 *
 */
public class Demo2 {
	public static void main(String[] args) {
		int[] arr = {1,2,3,4,5};
		int[] arr1 = remove(arr,1);
		System.out.println(Arrays.toString(arr1));
	}
	public static int[] remove(int[] ary, int index){
		int[] arr = new int[ary.length-1];
		if(index==0){
			System.arraycopy(ary,1,arr,0,ary.length-1);
		}else if(index==ary.length-1){
			System.arraycopy(ary,0,arr,0,ary.length-1);
		}else{
			System.arraycopy(ary,0,arr,0,index);
			System.arraycopy(ary,index+1,arr,index,ary.length-index-1);
		}
		return arr;
	}
}
