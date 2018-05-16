package OO.Day07;
//内部类的演示
public class InnerClassDemo {
	public static void main(String[] args) {
		Mama m = new Mama();
		//Baby b = new Baby(); //编译错误，内部类对外不可见
	}
}

class Mama{
	private String name;
	void createBaby(){
		Baby b = new Baby(); //内部类对象通常是在外部类中创建的
	}
	class Baby{
		void showMamaName(){
			System.out.println(name);
			System.out.println(Mama.this.name);
			//System.out.println(this.name); //编译错误
		}
	}
}

