package io;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

/**
 * 文件输入流
 * @author adminitartor
 *
 */
public class FileInputStreamDemo {
	public static void main(String[] args) throws IOException {
		/*
		 * 将fos.txt文件中的数据读取出来
		 */
		
		byte[] data = new byte[100];
		FileInputStream fis
			= new FileInputStream("fos.txt");
		
		int len = fis.read(data);
		String str = new String(data,0,len,"UTF-8");
		System.out.println(str);
		
		fis.close();
	}
}






