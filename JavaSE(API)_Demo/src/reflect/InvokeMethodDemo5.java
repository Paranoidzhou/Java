package reflect;

import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.Scanner;


public class InvokeMethodDemo5 {
	@SuppressWarnings({ "unchecked", "rawtypes", "resource" })  //用来告诉编译器，别在警告了
	public static void main(String[] args) throws Exception{
		/*  利用反射API动态执行对象的方法*/
		Scanner in = new Scanner(System.in);
		System.out.println("请输入类名：");
		String className = in.nextLine();
		System.out.println("请输入方法名：");
		String methodName = in.nextLine();
		System.out.println("输入属性名：");
		String fieldName = in.nextLine();
		
		Class cls = Class.forName(className);  //加载类名
		Method method = cls.getDeclaredMethod(methodName);  //加载方法名
		
		Field fidle = cls.getDeclaredField(fieldName);  //加载对象的属性
		
		Object obj = cls.newInstance();    //创建obj对象
		
		method.setAccessible(true);
		fidle.setAccessible(true);
		
		Object m = method.invoke(obj);    //调用方法对象
		Object f = fidle.get(obj);			//获取对象属性
		
		System.out.println("方法："+m);				
		System.out.println("属性："+f);
		
	}
}






//Class cls = Class.forName(className);  //动态加载类
//
///*在类cls中找到需要执行的methodName方法,如果方法名错误，将抛出没有找到方法异常*/
//Method method = cls.getDeclaredMethod(methodName);  //动态加载方法名
//System.out.println("Method:"+method);
//
///* 执行invoke时候，obj对象一定是包含指定method的对象！！否则将出现异常*/
//Object obj = cls.newInstance();     //创建object对象
//method.setAccessible(true);
//Object value = method.invoke(obj);  //动态调用方法
//System.out.println("方法返回值："+value);