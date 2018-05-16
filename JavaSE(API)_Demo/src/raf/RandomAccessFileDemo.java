package raf;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;

/*
 * java.io.RandomAccessFIle
 *  该类是专门用来读写文件数据的，其基于指针操作。
 */
public class RandomAccessFileDemo {
	public static void main(String[] args) throws IOException {
		/*
		 * 创建RadnomAccessfile常用构造方法:
		 * RandomAccessFile(String path,String mode)
		 * RandomAccessFile(File file,String mode)
		 * 
		 * 第一个参数是指定要进行读写操作的文件。
		 * 第二个参数为权限，常用的：
		 * r:只读模式
		 * rw:读写模式
		 */
		RandomAccessFile raf = new RandomAccessFile("./raf.dta","rw");
		/*
		 * void write(int d)
		 * 向文件中写入1字节数据，写的是给定的int值对应的2进制的“低八位”
		 * 	高八位						    低八位
		* vvvvvvv					  vvvvvvv
		 * 00000000 00000000 00000000 00000001
		 */
		raf.write(1);
		raf.close();
		System.out.println("写出完毕！");
	}
}
