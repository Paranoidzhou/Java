package io;

import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;

/**
 * 在流连接中使用PW
 * @author adminitartor
 *
 */
public class PrintWriterDemo2 {
	public static void main(String[] args) throws IOException {
		/*
		 * 在流连接中使用时,需要在转换流中指定
		 * 字符集
		 */
		PrintWriter pw = new PrintWriter(
			new BufferedWriter(
				new OutputStreamWriter(
					new FileOutputStream("pw2.txt")
					,"UTF-8"
				)	
			)	
		);
		
		pw.println("我爱北京天安门,");
		pw.println("天安门上太阳升.");
		
		System.out.println("写出完毕!");
		pw.close();
		
	}
}







