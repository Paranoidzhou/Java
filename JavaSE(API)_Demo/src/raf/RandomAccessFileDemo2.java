package raf;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;

/*
 * 从文件中读取字节
 */
public class RandomAccessFileDemo2 {
	public static void main(String[] args) throws IOException {
		/*                                                          ./可以忽略不写      */
		RandomAccessFile raf = new RandomAccessFile("raf.dta","rw");
		/*
		 * int read ()
		 * 从文件中读取1个字节，并以int形式返回。
		 * 若返回值为-1则表示读取到了文件末尾。
		 */
		int d = raf.read();
		System.out.println(d);  //输出值 1
		
		d = raf.read();
		System.out.println(d);	//输出值-1
		raf.close();
	}
}
