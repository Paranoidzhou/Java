package io;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * 缓冲流
 * java.io.BufferedInputStream
 * java.io.BufferedOutputStream
 * 
 * 缓冲流是一对高级流,作用是提高读写效率.
 * 
 * @author adminitartor
 *
 */
public class CopyDemo2 {
	public static void main(String[] args) throws IOException {
		FileInputStream fis
			= new FileInputStream("music.mp3");
		//将缓冲流连接在文件流上,提高读文件效率
		BufferedInputStream bis
			= new BufferedInputStream(fis);
		
		FileOutputStream fos
			= new FileOutputStream("music_cp3.mp3");
		BufferedOutputStream bos
			= new BufferedOutputStream(fos);
		
		int d = -1;
		/*
		 * 缓冲流实际上本质就是进行块读写操作,无论我们
		 * 使用缓冲流进行何种读写方式(随机读写,块读写)
		 * 最终都会被缓冲流转换为块读写形式通过文件流
		 * 进行实际操作.
		 * 缓冲流内部维护了一个8k的字节数组,用于块读写
		 * 操作.
		 */
		while((d = bis.read())!=-1){
			bos.write(d);
		}
		
		System.out.println("复制完毕!");
		
		//只需要关最外层的高级流即可
		bis.close();
		bos.close();
	}
}











