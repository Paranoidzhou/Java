package oo.day03;
//super的演示
public class SuperDemo {
	public static void main(String[] args) {
		Boo o = new Boo();
	}
}


class Coo{
	Coo(int a){
	}
}
class Doo extends Coo{
	Doo(){
		super(5);
	}
	/*
	//如下代码，写不写都有
	Doo(){
		super();
	}
	*/
}





class Aoo{
	Aoo(){
		System.out.println("超类的构造方法");
	}
}
class Boo extends Aoo{
	Boo(){
		//super(); //默认的(调用超类的构造方法)
		System.out.println("派生类的构造方法");
	}
}
















