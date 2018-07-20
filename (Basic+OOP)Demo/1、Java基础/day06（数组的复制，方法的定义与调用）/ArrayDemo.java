package day06;
import java.util.Arrays;
//数组的演示
public class ArrayDemo {
	public static void main(String[] args) {
		//8.数组的排序:
		int[] arr = {23,27,3,45,28,67};
		for(int i=0;i<arr.length-1;i++){
			for(int j=0;j<arr.length-1-i;j++){
				if(arr[j]<arr[j+1]){
					int t = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = t;
				}
				//若前数大于后数则交换，保证前数小于后数(升序)
				//若前数小于后数则交换，保证前数大于后数(降序)
			}
		}
		for(int i=0;i<arr.length;i++){
			System.out.println(arr[i]);
		}
		
		
		
		
		
		
		
		
		
		
		/*
		int[] arr = {23,27,3,45,28,67};
		Arrays.sort(arr); //升序
		for(int i=0;i<arr.length;i++){
			System.out.println(arr[i]);
		}
		*/
		
		
		
		/*
		//7.数组的复制:
		int[] a = {10,20,30,40,50};
		//数组的扩容(创建了一个新的数组并将源数组数据复制进去)
		a = Arrays.copyOf(a,a.length+1); 
		for(int i=0;i<a.length;i++){
			System.out.println(a[i]);
		}
		*/
		/*
		int[] a = {10,20,30,40,50};
		//a:源数组
		//a1:目标数组
		//6:目标数组的长度
		int[] a1 = Arrays.copyOf(a,6); //灵活性差，效率低
		for(int i=0;i<a1.length;i++){
			System.out.println(a1[i]);
		}
		*/
		/*
		int[] a = {10,20,30,40,50};
		int[] a1 = new int[6]; //0,0,10,20,30,0
		//a:源数组
		//1:源数组的起始下标
		//a1:目标数组
		//0:目标数组的起始下标
		//4:要复制的元素个数
		System.arraycopy(a,1,a1,0,4); //灵活性好、效率高
		for(int i=0;i<a1.length;i++){
			System.out.println(a1[i]);
		}
		*/
		
	}
}














