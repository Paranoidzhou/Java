package OO.Day04;

public class OverrideDemo {

	public static void main(String[] args) {


	}

}

class Eoo{
	void show() {}
	double test () {return 6.6;}
	Foo sayHi() {return null;}
	Eoo say() {return null;}
}


class Foo extends Eoo{
	//int show() {}  			//编译错误，void时必须，必须相等
	void show () {}			//编译正确，理由同上
	//int test () {return 6;}   		//编译错误，基本类型时必须相等

	//Eoo sayHi() {return null;}		//编译错误，引用类型必须小于或等于超类类型
	/*	Foo say() {return null;}			编译正确，引用类型小于超类 */
	Eoo say() {return null;}			//编译正确，引用类型等于超类

}