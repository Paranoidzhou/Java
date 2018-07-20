package test;

import java.util.Arrays;

public class Demo1 {
	public static void main(String[] args) {
		/*int arr[] = {1,3,5,7,9,11,13,15,17,19};
		for (int i = 0; i < arr.length; i++) {
			arr[i] = (int)(Math.random()*100+1);
		}
		
		System.out.println("生成的随机数组为:");	
		System.out.println(Arrays.toString(arr));
		System.out.println("----开始冒泡-----");
		for (int i = 0; i < arr.length-1; i++) {
			for (int j = 0; j < arr.length-i-1; j++) {
				if(arr[j]<arr[j+1]){
					int t = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = t;
				}
			}
			System.out.println(Arrays.toString(arr));
		}
		
		System.out.println("----冒泡结束----");
		System.out.println("排序后的代码为");
		System.out.println(Arrays.toString(arr));
		*/
		int arr[] = {1,3,5,7,9,11,13,15,17,19};
		for(int i =0;i<arr.length/2;i++){
			int t = arr[i];
			arr[i] = arr[arr.length-i-1];
			arr[arr.length-i-1] = t;
		}
		
		//第一次循环   i = 0   arr[i]=1; arr[arr.length-i-1]=19
		   //第一次循环结束后 1和19换
		//第二次循环   i = 1	 arr[i]=3; arr[arr.length-i-1]=17
			//第二次循环结束后 3和17换
		//...
		// 			  i=4    arr[i]=9; arr[arr.length-i-1]=11
			//循环结束后 11和13换
		System.out.println(Arrays.toString(arr));
	}
}
