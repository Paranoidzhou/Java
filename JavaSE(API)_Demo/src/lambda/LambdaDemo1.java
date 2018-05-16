package lambda;
/*
 * lambda表达式：
 * JDK8之后推出的新特性：lambda用于创建匿名内部类.
 * 
 * lambda表达式创建的匿名内部类所属的接口必须只能有一个抽象方法.否则不可以使用.
 * 
 * 语法规则：
 
       (方法参数)->{
           方法体
       }
 */
public class LambdaDemo1 {
	public static void main(String[] args) {
		Runnable r1 = new Runnable() {
			public void run() {
				System.out.print("Hello");
			}
		};
		
		//使用lambda表达式简化后：
		Runnable r2 = ()->{
			System.out.println("World");
		};
		
		//当方法体中只有一行代码，那么方法体的“{ }”都可以省略
		Runnable r3 = ()->System.out.println("超级懒人版~~");
		
		r1.run();
		r2.run();
		r3.run();
		
	}
}
