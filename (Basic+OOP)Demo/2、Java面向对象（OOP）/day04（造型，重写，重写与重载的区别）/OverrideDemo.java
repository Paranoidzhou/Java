package oo.day04;
//重写的演示
public class OverrideDemo {
	public static void main(String[] args) {
		
	}
}

//超类大，派生类小
class Eoo{
	void show(){}
	double test(){return 0.0;}
	Foo sayHi(){return null;}
	Eoo say(){return null;}
}
class Foo extends Eoo{
	//int show(){return 1;} //编译错误，void时必须相等
	//int test(){return 0;} //编译错误，基本类型时必须相等
	//Eoo sayHi(){return null;} //编译错误，引用类型时必须小于或等于
	Foo say(){return null;}
}



















