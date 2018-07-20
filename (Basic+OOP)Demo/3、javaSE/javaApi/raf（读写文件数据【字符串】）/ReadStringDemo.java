package raf;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;

/**
 * 读取字符串
 * @author adminitartor
 *
 */
public class ReadStringDemo {
	public static void main(String[] args) throws IOException {
		RandomAccessFile raf 
			= new RandomAccessFile("raf.txt","r");
		byte[] data = new byte[100];
		//一次性读取100字节
		int len = raf.read(data);
		/*
		 * String提供的了构造方法:
		 * String(byte[] data)
		 * 按照系统默认字符集将字节数组内容转为字符串
		 * 
		 * String(byte[] data,String csn)
		 * 按照给定字符集将字节数组内容转换为字符串
		 * 
		 * String(byte[] data,int offset,int len,String csn)
		 * 将给定字节数组中从下标offset处的连续len个
		 * 字节按照给定字符集转换为对应字符串
		 */
//		String str = new String(data,"gbk");
		String str = new String(data,0,len,"gbk");
		System.out.println(str);
		
		
		raf.close();
	}
}








