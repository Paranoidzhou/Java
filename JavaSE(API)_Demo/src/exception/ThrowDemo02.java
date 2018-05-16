package exception;

public class ThrowDemo02 {
	public static void main(String[] args) {
		Person02 p = new Person02();
		try {
			/*使用非throws时，编译器不会报错，但是执行会正常报异常，不要求立马处理*/
			p.setAge(1000);
		} catch (Exception e) {
			System.out.println("年龄异常！");
		}
		System.out.println("年龄："+p.getAge());
	}
}
