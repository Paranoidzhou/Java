package exception;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

/*
 * JDK1.7之后推出了一个新的特性：（自动关闭）
 * 
 */
public class FinallyDemo3 {
	public static void main(String[] args) throws FileNotFoundException, IOException {
		
		try(
				/*AutoCloseable接口的子类可以定义在这里
				 * 
				 *   自动关闭语法时编译器认可，编译后的class文件中流的
				 *关闭还是在finally中进行的。
				 */
				FileInputStream fis = new FileInputStream("fos.txt")){	
			int d = fis.read();
			System.out.println(d);
		}catch(IOException e) {
			System.out.println("温馨提示：未知异常！");
		}

	}
}
