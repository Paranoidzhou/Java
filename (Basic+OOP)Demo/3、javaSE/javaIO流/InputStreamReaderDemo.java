package io;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * 读取字符
 * @author adminitartor
 *
 */
public class InputStreamReaderDemo {
	public static void main(String[] args) throws IOException {
		FileInputStream fis
			= new FileInputStream("osw.txt");
		
		InputStreamReader isr
			= new InputStreamReader(fis,"UTF-8");
		//读一个字符
//		int d = isr.read();
//		char c = (char)d;
//		System.out.println(c);
		
		int d = -1;
		while((d = isr.read())!=-1){
			char c = (char)d;
			System.out.print(c);
		}
		
		isr.close();
	}
}








