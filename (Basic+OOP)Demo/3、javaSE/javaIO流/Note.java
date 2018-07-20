package io;

import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;
import java.util.Scanner;

/**
 * 简易记事本工具
 * 程序启动后,要求用户输入一个文件名,然后对该文件
 * 进行写操作.
 * 每当用户在控制台输入一行字符串,都将该字符串按行
 * 写入到文件中.当用户输入"exit"时程序退出.
 * 
 * 使用PW实现.用流连接形式创建.
 * 
 * 
 * @author adminitartor
 *
 */
public class Note {
	public static void main(String[] args) throws IOException{
		Scanner scanner = new Scanner(System.in);
		System.out.println("请输入文件名:");
		String name = scanner.nextLine();	
		/*
		 * PrintWriter的构造方法中若第一个参数为流
		 * 那么就支持一个重载构造方法,允许再传入一个
		 * boolean值类型的参数,若该值为true,则具有
		 * 自动行刷新功能.
		 * 即:每当使用println方法写出一行字符串后就
		 * 会自动flush
		 */
		PrintWriter pw = new PrintWriter(
			new BufferedWriter(
				new OutputStreamWriter(
					new FileOutputStream(name),
					"UTF-8"
				)	
			),true	
		);		
		System.out.println("请开始输入内容:");
		while(true){
			String line = scanner.nextLine();
			/*
			 * 字符串当遇到字面量与变量进行内容比较时
			 * 应当使用:字面量.equals(变量)
			 * 因为变量在实际开发中不能保证null,所以
			 * 可能引发空指针异常.字面量一定不是空所以
			 * 不会出现该问题.
			 */
			if("exit".equals(line)){
				break;
			}
			pw.println(line);
//			pw.flush();
		}		
		System.out.println("再见!");
		pw.close();
	}
}















