package reflect;

import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.Scanner;

public class ClassForNameDemo2 {
	public static void main(String[] args)throws Exception {

		/* 动态加载类到内存中*/
		Scanner in = new Scanner(System.in);
		System.out.println("输入类名：");
		String className = in.nextLine();
		/*
		 * 动态加载类.
		 * 当类名错误的时后，会抛出类没有找到的异常.
		 */
		Class cls = Class.forName(className);    //类只加载一次
		System.out.println(cls);
		
		//可以继续检查cls的内部结构.....
		Field [] fields = cls.getDeclaredFields();   //获取属性
		for (Field field : fields) {
			System.out.println("Field(属性)："+field);
		}
		
		Method[] Methods = cls.getDeclaredMethods(); //获取方法
		for (Method method : Methods) {
			System.out.println("Method(方法)："+method);
		}
		
		//利用反射API动态创建对象 (如果有参，则会报错，不写会有默认无参构造)
		Object obj = cls.newInstance();
		System.out.println(obj); 
	}
}
