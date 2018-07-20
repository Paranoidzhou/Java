package day06;
//方法的演示
public class MethodDemo {
	public static void main(String[] args) {
		//say();
		//say();
		
		/*
		//sayHi(); //编译错误，有参则必须传参
		//sayHi(250); //编译错误，参数类型不匹配
		sayHi("zhangsan"); //String name="zhangsan"
		sayHi("lisi"); //String name="lisi"
		*/
		
		/*
		double a = getNum(); //getNum()的值就是return后的那个数
		System.out.println(a); //8.88
		*/
		/*
		int b = plus(5,6); //int num1=5,int num2=6
		System.out.println(b); //11
		*/
		/*
		int m=5,n=6;
		int c = plus(m,n); //int num1=m(5),int num2=n(6)
		System.out.println(c); //11
		*/
		
		a(); //嵌套调用
	}
	public static void a(){
		System.out.println(111);
		b();
		System.out.println(222);
	}
	public static void b(){
		System.out.println(333);
		c();
	}
	public static void c(){
		System.out.println(444);
	}
	
	//有参有返回值
	public static int plus(int num1,int num2){
		int num = num1+num2;
		return num; //返回的是num里面的数
		//return num1+num2; //返回的是num1+num2的和
	}
	
	//无参有返回值
	public static double getNum(){
		//return; //编译错误，必须返回一个值
		//return "hi"; //编译错误，返回值类型必须匹配
		return 8.88; //1)结束方法的执行  2)返回结果给调用方
	}
	
	//有参无返回值
	public static void sayHi(String name){
		/*
		if(?){
			return; //结束方法的执行
		}
		*/
		System.out.println("大家好，我叫"+name);
	}
	
	//无参无返回值
	public static void say(){
		System.out.println("大家好，我叫WKJ");
	}
	
}





















