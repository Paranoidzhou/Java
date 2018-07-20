package day06;
//冒泡排序
public class BubbleSort {
	public static void main(String[] args) {
		/*
		 * 1.声明整型数组arr，包含10个元素
		 *   遍历数组，给每一个元素赋值为0到99的随机数
		 *   输出数组中的每一个元素
		 * 2.对arr进行升序排列------冒泡
		 * 3.遍历arr，输出每个元素的值
		 */
		int[] arr = new int[10];
		for(int i=0;i<arr.length;i++){
			arr[i] = (int)(Math.random()*100);
			System.out.println(arr[i]);
		}
		for(int i=0;i<arr.length-1;i++){
			for(int j=0;j<arr.length-1-i;j++){
				if(arr[j]>arr[j+1]){
					int t = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = t;
				}
			}
		}
		System.out.println("排序后:");
		for(int i=0;i<arr.length;i++){
			System.out.println(arr[i]);
		}
	}
}













