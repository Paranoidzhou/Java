package oo.day02;
//学生类的测试类
public class StudentTest {
	public static void main(String[] args) {
		Student zs = new Student("zhangsan");
		Student ls = new Student("lisi",25);
		Student ww = new Student("wangwu",26,"JMS");
		
		zs.sayHi();
		ls.sayHi();
		ww.sayHi();
	}
}















