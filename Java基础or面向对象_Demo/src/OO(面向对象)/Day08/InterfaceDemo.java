package OO.Day08;
//接口的演示
public class InterfaceDemo {

	public static void main(String[] args) {
		//Inter4 o1 = new Inter4();//编译错误，抽象类不能被实例化
		Inter4 o2 = new Eoo();//向上造型
		Inter3 o3 = new Eoo();//向上造型
	}	
}
//练习第一题：
interface  Inter1 {			//定义接口
	int PI = 5;	 //接口中只能声明常量，前面都默认写有public static final 
	void say();	 //接口里面的方法只能是抽象方法，
					  //如果没写，方法前面都默认有 public abstract  	
	public void say1();
	//int num;            //编译错误，常量未声明同时初始化(任何变量默认为常量)
	
}
//练习第二题:
interface Inter2{				//定义接口
	void a();
	void b();
}
class Aoo implements Inter2{    //声明普通类并实现Inter2
	public void a() {}			  //类中方法必须加上public
	public void b() {}			  //因为重写修饰必须大于或等于父类
}
//练习第三题：
interface Inter3{        
	void c();
}
class Boo implements Inter2,Inter3{
	public void c() {	}
	public void a() {	}
	public void b() {	}
}
//练习第四题：
abstract class Coo{				  //声明抽象类 Coo
	abstract void d();			  //包含抽象方法d()
	//void k();						  //编译错误。抽象方法abstract不可省略
}
class Doo extends Coo implements Inter3{
	public void c() {	}
	void d() {}
}
//练习第五题
interface Inter4 extends Inter3{
	void e();
}
class Eoo implements Inter4{
	public void e() {}
	public void c() {}
}