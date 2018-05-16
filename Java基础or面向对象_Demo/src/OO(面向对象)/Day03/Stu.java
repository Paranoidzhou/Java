package OO.Day03;
//学生类
public class Stu {
	String name;
	int age;
	String behavior;
	Stu(String name){
		this(name,0,null);
	}


	Stu(String name, int age){
		this(name,age,null);
	}

	Stu(String name,int age,String behavior){
		this.name = name;
		this.age = age;
		this.behavior = behavior;
	}
	public void sayHi() {
		System.out.println("大扎好，沃系"+name+""+age+"年传奇，是兄弟就来"+behavior);
	}
	
	
}
