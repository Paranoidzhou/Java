package oo.day04;
//测试类
public class Test {
	public static void main(String[] args) {
		/*
		Person[] ps = new Person[5];
		ps[0] = new Student("zhangsan",25,"LF","111");
		ps[1] = new Student("lisi",22,"JMS","222");
		ps[2] = new Teacher("aaa",37,"LF",5000);
		ps[3] = new Teacher("bbb",45,"LF",8000);
		ps[4] = new Doctor("ddd",35,"LF","主治医师");
		for(int i=0;i<ps.length;i++){
			System.out.println(ps[i].name);
			ps[i].sayHi();
		}
		*/
		
		/*
		Student zs = new Student("zhangsan",25,"LF","111");
		Teacher ls = new Teacher("lisi",37,"LF",5000);
		Doctor ww = new Doctor("wangwu",35,"LF","主治医师");
		zs.sayHi();
		ls.sayHi();
		ww.sayHi();
		*/
		
		Student zs = new Student("zhangsan",25,"LF","111");
		//Person zss = new Student("zhangsansan",25,"LF","111");
		zs.sayHi();
		//zss.sayHi(); //重写方法被调用时，看对象的类型
	}
}
class Person{
	String name;
	int age;
	String address;
	Person(String name,int age,String address){
		this.name = name;
		this.age = age;
		this.address = address;
	}
	void sayHi(){
		System.out.println("大家好，我叫"+name+"，今年"+age+"岁了，家住"+address);
	}
}
class Student extends Person{
	String stuId;
	Student(String name,int age,String address,String stuId){
		super(name,age,address);
		this.stuId = stuId;
	}
	void sayHi(){
		System.out.println("大家好，我叫"+name+"，今年"+age+"岁了，家住"+address+"，学号为:"+stuId);
	}
}
class Teacher extends Person{
	double salary;
	Teacher(String name,int age,String address,double salary){
		super(name,age,address);
		this.salary = salary;
	}
	void sayHi(){
		System.out.println("大家好，我叫"+name+"，今年"+age+"岁了，家住"+address+"，工资为:"+salary);
	}
}
class Doctor extends Person{
	String level;
	Doctor(String name,int age,String address,String level){
		super(name,age,address);
		this.level = level;
	}
}
















