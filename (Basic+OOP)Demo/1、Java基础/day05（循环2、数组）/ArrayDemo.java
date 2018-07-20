package day05;
//数组的演示
public class ArrayDemo {
	public static void main(String[] args) {
		/*
		 * 数组的练习:
		 * 1)声明整型数组arr1，包含10个元素
		 * 2)声明整型数组arr2，并直接赋值为1,4,7
		 *   声明整型数组arr3，
		 *     给arr3赋值为1,4,7
		 * 3)声明整型数组arr，包含3个元素
		 *     输出arr的长度
		 *     给arr中第1个元素赋值为100
		 *     给arr中第2个元素赋值为200
		 *     给arr中第3个元素赋值为300
		 *     arr[3] = 400;--------------???
		 *     输出arr中最后一个元素的值(下标不能写死)
		 * 4)创建类MaxOfArray，main()中:
		 *   4.1)声明整型数组arr，包含10个元素
		 *   4.2)遍历arr，给每个元素赋值为0到99之间的随机数
		 *   4.3)遍历arr，输出每个元素的值
		 */
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		//1.数组的定义:
		int[] arr1 = new int[10];
		
		//2.数组的初始化:
		int[] arr2 = new int[3]; //0,0,0
		int[] arr3 = {2,5,8}; //2,5,8
		int[] arr4 = new int[]{2,5,8}; //2,5,8
		int[] arr5;
		//arr5 = {2,5,8}; //编译错误，此方式只能声明同时初始化
		arr5 = new int[]{2,5,8}; //正确
		
		//3.数组的访问:
		int[] arr = new int[3];
		System.out.println(arr.length); //3
		arr[0] = 100;
		arr[1] = 200;
		arr[2] = 300;
		//arr[3] = 400; //数组下标越界异常
		System.out.println(arr[arr.length-1]); //输出最后一个元素的值
		
		//4.数组的遍历:
		int[] as = new int[10];
		for(int i=0;i<as.length;i++){
			as[i] = (int)(Math.random()*100);
		}
		for(int i=0;i<as.length;i++){
			System.out.println(as[i]);
		}
		
	}
}













