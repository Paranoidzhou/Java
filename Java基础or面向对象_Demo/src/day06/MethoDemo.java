package day06;

public class MethoDemo {

	public static void main(String[] args) {
		long num ;
		long a = System.currentTimeMillis();
		
		num = a()*b((int)(Math.random()*10000000),(int)(Math.random()*100000000));
		
		long b = System.currentTimeMillis();
		System.out.println(num);
		System.out.println(b-a);
	}
	public static long a () { //定义方法
		return 5201314; //return 既是结束方法的执行，又是返回值；
	}
	public static long b(long i , long n ) {
		long c = i * n ;
		return c;
	}
	
}