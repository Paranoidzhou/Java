package reflect;

import java.util.Scanner;

public class ForNameDemo03 {
	public static void main(String[] args) throws Exception{
		/*
		 *    类只加载一次，即便多次调用forName方法，类也加载一次，forName返回值是同
		 * 一个对象的引用。
		 */
		Scanner in = new Scanner(System.in);
		System.out.println("请输入类名：");
		String className = in.nextLine();
		
		//动态加载类：
		Class cls1= Class.forName(className);
		Class cls2= Class.forName(className);
		Class cls3= Class.forName(className);
		System.out.println(cls1 == cls2);
	}
}
