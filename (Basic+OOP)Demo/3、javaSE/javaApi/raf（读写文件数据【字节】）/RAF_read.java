package raf;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;

/**
 * 从文件中读取字节
 * @author adminitartor
 *
 */
public class RAF_read {
	public static void main(String[] args) throws IOException {
		/*
		 * "./"可以忽略,不写默认也是当前目录中
		 */
		RandomAccessFile raf
			= new RandomAccessFile("raf.dat","r");
		/*
		 * int read()
		 * 从文件中读取1个字节,并以int形式返回.
		 * 若返回值为-1则表示读取到了文件末尾.
		 * 
		 * 00000000 00000000 00000000 00000001
		 */
		int d = raf.read();
		System.out.println(d);
		
		d = raf.read();
		System.out.println(d);//-1
		raf.close();
		
	}
}









