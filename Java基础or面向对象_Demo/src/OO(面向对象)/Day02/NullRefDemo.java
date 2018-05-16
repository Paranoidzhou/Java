package OO.Day02;
//null和引用类型画等号的演示
public class NullRefDemo {
	public static void main(String[] args) {
		Student zs = new Student("zhangsan",25,"LF");
		System.out.println(zs.age); //25
		Student zss = zs; //指向同一个对象
		zss.age = 28;
		System.out.println(zs.age); //28
		
		int a = 5;
		int b = a; //赋值
		a = 8;
		System.out.println(b); //5

		Student stu = new Student("zhangsan");
		System.out.println(stu.name);
		stu = null; //空，没有指向任何对象
		System.out.println(stu.name); //空指针异常
	
	}
}


