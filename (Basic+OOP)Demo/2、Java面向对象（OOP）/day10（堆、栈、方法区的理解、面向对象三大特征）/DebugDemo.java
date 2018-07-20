package oo.day10;
//Debug调试的演示
public class DebugDemo {
	public static void main(String[] args) {
		int a = 5;
		test(a);
		show();
		System.out.println("over");
	}
	public static void test(int a){
		int b = a+10;
		if(b>15){
			System.out.println(b);
		}
	}
	public static void show(){
		System.out.println("aaa");
		System.out.println("bbb");
	}
}

















