package OO.Day03;

public class SuperDome {

	public static void main(String[] args) {
		Boo o = new Boo();
		Doo d = new Doo();
	}

}
class Aoo {
	Aoo(){
		System.out.print("超类的构造方法or");
	}
}

class Boo	extends Aoo{
	Boo(){
		System.out.println("派生类的构造方法");
	}
}

class Coo {
	Coo(int a){
		System.out.print("流星雨砍");
	}
}

class Doo extends Coo{
	Doo(){
		super(6);
		System.out.println("渣渣辉");
	}
	
}