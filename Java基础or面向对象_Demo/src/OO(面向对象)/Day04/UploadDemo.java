package OO.Day04;

public class UploadDemo {

	public static void main(String[] args) {
		Boo b1 = new Boo();
		b1.a = 2;
		b1.b = 3;
		b1.ao();
		b1.bo();


		Aoo a1 = new Aoo();
		a1.a = 2;
		//a1.b = 3;// 编译错误，超类不能访问派生类
		a1.ao();

		Aoo a2 = new Boo();
		a2.a = 2;	
  /**	a2.b = 6;	 {编译错误	 能点出来什么，看引用的类型
		a2.bo();		 {编译错误 （前边是超类，只能点出超类所有的成员对象）
   */	
		a2.ao();
	}

}
class Aoo {
	int a ;
	void ao(){

	}
}
class Boo extends Aoo{
	int b ;
	void bo() {

	}
}
