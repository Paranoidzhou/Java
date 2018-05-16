package OO.Day04;

public class Person {
	String name;
	int age;
	String address;

	Person(String name, int age , String address){
		this.name = name;
		this.age = age;
		this.address = address;
	}
	void sayHi() {
		System.out.println("大家好我叫："+name+"，今年"+age+"岁，我来自"+address);
	}
}
class Student extends Person{ 
	String stuId;
	Student(String name,int age , String address,String stuId){
		super(name, age, address);
		this.stuId = stuId;
	}
	void sayHi() {
		System.out.println("大家好我叫："+name+"，今年"+age+"岁，我来自"+address+"，我的学号为："+stuId);
	}
}

class Teacher extends Person{
	double salary;
	Teacher(String name, int age, String address,double salary) {
		super(name, age, address);
		this.salary = salary;
	}
	void sayHi() {
		System.out.println("大家好我叫："+name+"，今年"+age+"岁，我来自"+address+"，我的工资为："+salary);
	}

}
class Doctor extends Person{
	String level;
	Doctor(String name, int age, String address,String level) {
		super(name, age, address);
		this.level = level;
	}
	void sayHi() {
		System.out.println("大家好我叫："+name+"，今年"+age+"岁，我来自"+address+"，我的职位为："+level);
	}
}
