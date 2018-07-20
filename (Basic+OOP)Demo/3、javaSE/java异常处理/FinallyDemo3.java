package exception;

import java.io.FileInputStream;
import java.io.IOException;

/**
 * JDK1.7之后推出了一个新的特性:自动关闭
 * @author adminitartor
 *
 */
public class FinallyDemo3 {
	private static void main(String[] args) {
		try(
			/*
			 * AutoCloseable接口的子类可以定义在这里
			 * 
			 * 自动关闭语法是编译器认可,编译后的class
			 * 文件中流的关闭还是在finally中进行的.	
			 */
			FileInputStream fis 
				= new FileInputStream("fos.txt");	
		){			
			int d = fis.read();
			System.out.println(d);
		} catch (IOException e) {
			
		}
	}
	
}
