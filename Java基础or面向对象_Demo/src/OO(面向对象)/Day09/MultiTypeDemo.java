package OO.Day09;

//多态的演示
public class MultiTypeDemo {
	public static void main(String[] args) {
		Aoo o = new Boo(); //向上造型(自动类型转换)
		Boo o1 = (Boo)o;       //引用o所指向的对象就是Boo
		Inter1 o2 = (Inter1)o; //引用o所指向的对象实现了Inter1
		//Coo o3 = (Coo)o; //ClassCastException类型转换异常
		if(o instanceof Coo){ //false
			Coo o4 = (Coo)o;
		}
		
		System.out.println("over");
	}
}

interface Inter1{
}
class Aoo{
}
class Boo extends Aoo implements Inter1{
}
class Coo extends Aoo{
}
