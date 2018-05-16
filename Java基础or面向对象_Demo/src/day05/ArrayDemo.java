package day05;

public class ArrayDemo {

	public static void main(String[] args) {
		int [] arr1 = new int [10];
		int [] arr2 = new int [] {1,4,7};
		int [] arr3;
		arr3 = new int [] {1,4,7};
		
		int [] arr = new int [3];
		System.out.println(arr.length);
		arr [0] = 100;
		arr [1] = 200;
		arr [2] = 300;
		//arr [3] = 400;//此行編寫不報錯，輸出回報錯
		System.out.println(arr[arr.length-1]);
	}
}
