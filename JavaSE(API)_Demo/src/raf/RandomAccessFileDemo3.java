package raf;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;

import org.omg.Messaging.SyncScopeHelper;

/*
 * RandomAccessFile读写基本类型数据以及RandomAccessFile基于指针的操作。
 */
public class RandomAccessFileDemo3 {
	public static void main(String[] args) throws IOException {
		RandomAccessFile raf = new RandomAccessFile("type.dta","rw");
		/*
		 *    RAF是基于指针进行读写数据的，即：RAF总是在指针当前位置读或写字节的，并且
		 * 读写完毕后指针会自动移动到下一个字节的位置。
		 * 
		 * 创建RAF后指针默认在文件的第一个字节位置。
		 */
		long pos = raf.getFilePointer();
		System.out.println("当前指针位置：:"+pos);
		
		/*将一个int最大值写入文件
		 * 						  vvvvvv
		 * 01111111 11111111 11111111 11111111
		 * 
		 * max>>>24					  vvvvvv
		 * 00000000 00000000 00000000 01111111 11111111 
		 * 
		 * max>>>16					 vvvvvv
		 * 00000000 00000000 01111111 11111111 11111111
		 * 
		 * 位移运算：
		 * >>>:将二进制整体向右移动，左面补0
		 */
		int max = Integer.MAX_VALUE;
		/*以下方法写了4个字节*/
		raf.write(max>>>24);
		System.out.println("当前指针位置：:"+raf.getFilePointer());   // 1
		raf.write(max>>>16);								 
		System.out.println("当前指针位置：:"+raf.getFilePointer());	  // 2 
		raf.write(max>>>8);								  
		System.out.println("当前指针位置：:"+raf.getFilePointer());   // 3
		raf.write(max);
		System.out.println("当前指针位置：:"+raf.getFilePointer());   // 4
		/* 下列方法也写了四个字节*/
		raf.writeInt(max);
		System.out.println("当前指针位置：:"+raf.getFilePointer());   // 8
		/* 下列方法写了8个字节*/
		raf.writeLong(123L);
		System.out.println("当前指针位置：:"+raf.getFilePointer());   // 16
		/* 下列方法写了8个字节*/
		raf.writeDouble(123.123);
		System.out.println("当前指针位置：:"+raf.getFilePointer());   // 24
		/*
		 * void seek (long pos)
		 * 将指针移动到指定位置
		 */
		System.out.println("=========================");
		raf.seek(0);    //将指针移动到 初始 0位置
		System.out.println("当前指针位置：:"+raf.getFilePointer()); 
		System.out.println("写出完毕！");
		/* 若读取4字节int值的过程中发现读取到了末尾，则抛出EOFException
		 *  end of file  [意思就是读到了末尾了] 
		 */
		int d = raf.readInt();
		System.out.println(d);
		System.out.println("=========================");
		raf.seek(8);
		long l = raf.readLong();
		System.out.println(l);
		System.out.println("当前指针位置：:"+raf.getFilePointer());
		
		double dou = raf.readDouble();
		System.out.println(dou);
		System.out.println("当前指针位置：:"+raf.getFilePointer());
		raf.seek(0);
		l = raf.readLong();
		System.out.println(l);
		
		raf.close();
	}
}
