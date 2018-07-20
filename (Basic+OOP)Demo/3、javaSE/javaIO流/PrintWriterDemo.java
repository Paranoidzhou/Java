package io;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * 缓冲字符流
 * java.io.BufferedWriter
 * java.io.BufferedReader
 * 
 * java.io.PrintWriter
 * 带有自动行刷新的缓冲字符输出流(常用)
 * 
 * @author adminitartor
 *
 */
public class PrintWriterDemo {
	public static void main(String[] args) throws IOException {
		/*
		 * 向文本文件pw.txt中写出两行字符串
		 * 
		 * PW直接提供了向文件中写入字符串的构造
		 * 方法
		 * PrintWriter(String path)
		 * PrintWriter(File file)
		 */
		PrintWriter pw 
			= new PrintWriter("pw.txt","UTF-8");
		
		pw.println("该配合你演出的我演视而不见.");
		pw.println("别逼一个最爱你的人即兴表演.");
		System.out.println("写出完毕!");
		pw.close();
	}
}








