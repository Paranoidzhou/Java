package day06;
import java.util.Arrays;
//求数组元素最大值并放在最后一个元素的下一个位置
public class MaxOfArray {
	public static void main(String[] args) {
		int[] arr = new int[10];
		for(int i=0;i<arr.length;i++){
			arr[i] = (int)(Math.random()*100);
			System.out.println(arr[i]);
		}
		
		int max = arr[0];
		for(int i=1;i<arr.length;i++){
			if(arr[i]>max){
				max=arr[i];
			}
		}
		System.out.println("最大值为:"+max);
		//数组的扩容
		arr = Arrays.copyOf(arr,arr.length+1);
		//将最大值max赋值给arr中的最后一个元素
		arr[arr.length-1] = max;
		for(int i=0;i<arr.length;i++){
			System.out.println(arr[i]);
		}
		/*
		int[] a = {10,20,30,40,50};
		int[] a1 = new int[6]; //0,0,10,20,30,0
		//a:源数组         1:源数组的起始下标
		//a1:目标数组    0:目标数组的起始下标
		//4:要复制的元素个数
		System.arraycopy(a,1,a1,0,4);
		*/
		
		
	}
}














