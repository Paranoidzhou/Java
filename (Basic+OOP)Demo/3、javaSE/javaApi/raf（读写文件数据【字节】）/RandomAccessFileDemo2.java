package raf;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;

/**
 * RAF读写基本类型数据以及RAF基于指针的操作.
 * @author adminitartor
 *
 */
public class RandomAccessFileDemo2 {
	public static void main(String[] args) throws IOException {
		RandomAccessFile raf 
			= new RandomAccessFile("type.dat","rw");
		/*
		 * RAF是基于指针进行读写数据的,即:RAF总是
		 * 在指针当前位置读或写字节的,并且读写完毕
		 * 后指针会自动移动到下一个字节的位置.
		 * 
		 * 创建RAF后指针默认在文件的第一个字节位置 
		 */
		//获取指针位置
		long pos = raf.getFilePointer();
		System.out.println("pos:"+pos);
		
		
		//将一个int最大值写入文件
		/*
		 *                            vvvvvvvv
		 * 01111111 11111111 11111111 11111111
		 * 
		 * max>>>24
		 * 00000000 00000000 00000000 01111111 11111111 11111111 11111111
		 * 
		 * max>>>16
		 * 00000000 00000000 01111111 11111111 11111111 11111111
		 * 位移运算:
		 * >>> :将2进制整体向右移动,左面补0
		 */
		int max = Integer.MAX_VALUE;
		raf.write(max>>>24);
		System.out.println("pos:"+raf.getFilePointer());
		
		raf.write(max>>>16);
		raf.write(max>>>8);
		raf.write(max);
		System.out.println("pos:"+raf.getFilePointer());
		/*
		 * RAF提供了方便写出基本类型数据的方法
		 * writeInt(int d)
		 * 一次性将给定的int值对应的4字节全部写出
		 */
		raf.writeInt(max);
		System.out.println("pos:"+raf.getFilePointer());
		
		//连续写出8字节
		raf.writeLong(123L);
		System.out.println("pos:"+raf.getFilePointer());
		raf.writeDouble(123.123);
		System.out.println("pos:"+raf.getFilePointer());
		System.out.println("写出完毕!");
		
		/*
		 * void seek(long pos)
		 * 将指针移动到指定位置
		 */
		raf.seek(0);
		System.out.println("pos:"+raf.getFilePointer());
		/*
		 * 若读取4字节int值的过程中发现读取到了末尾
		 * 则抛出EOFException   end of file
		 */
		int d = raf.readInt();
		System.out.println(d);
		System.out.println("pos:"+raf.getFilePointer());
		
		//读取long值
		raf.seek(8);
		long l = raf.readLong();
		System.out.println(l);
		System.out.println("pos:"+raf.getFilePointer());
		
		double dou = raf.readDouble();
		System.out.println(dou);
		System.out.println("pos:"+raf.getFilePointer());
		
		raf.seek(0);
		l = raf.readLong();
		System.out.println(l);
		
		
		raf.close();
	}
}











