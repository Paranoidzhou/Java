package oo.day04;
//重写与重载的演示
public class OverrideOverloadDemo {
	public static void main(String[] args) {
		Goo goo = new Goo();
		Coo o = new Doo();
		goo.test(o); //重载看参数/引用(Coo)
	}
}
class Goo{
	void test(Coo o){
		System.out.println("超类型参数");
		o.show(); //重写看对象(Doo)
	}
	void test(Doo o){
		System.out.println("派生类型参数");
		o.show();
	}
}
class Coo{
	void show(){
		System.out.println("超类show");
	}
}
class Doo extends Coo{
	void show(){
		System.out.println("派生类show");
	}
}















