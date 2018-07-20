package io;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * 使用文件流进行文件复制操作
 * @author adminitartor
 *
 */
public class CopyDemo {
	public static void main(String[] args) throws IOException {
		/*
		 * 使用文件输入流读取原文件,使用文件输出流
		 * 向目标文件中写出.然后顺序从原文件读取
		 * 字节写入目标文件完成复制操作.
		 * 使用块方式复制
		 */
		FileInputStream fis
			= new FileInputStream("music.mp3");
		FileOutputStream fos
			= new FileOutputStream("music_cp2.mp3");		
		byte[] data = new byte[1024*10];
		int len = -1;
		while((len = fis.read(data))!=-1){
			fos.write(data,0,len);
		}
		System.out.println("复制完毕!");
		fis.close();
		fos.close();
		
	}
}










