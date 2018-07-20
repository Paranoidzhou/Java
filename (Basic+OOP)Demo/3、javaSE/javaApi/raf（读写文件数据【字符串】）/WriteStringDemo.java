package raf;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;

/**
 * 向文件中写入字符串
 * @author adminitartor
 *
 */
public class WriteStringDemo {
	public static void main(String[] args) throws IOException {
		RandomAccessFile raf
			= new RandomAccessFile("raf.txt","rw");
		
		String str = "你在南方的艳阳里,大雪纷飞.";
		/*
		 * String提供了将字符串转换为字节的方法:
		 * byte[] getBytes()
		 * 按照系统默认字符集转换(不推荐,存在平台差异)
		 * 
		 * byte[] getBytes(String csn)
		 * 按照给定的字符集转换,字符集的名字不区分大小写
		 * 常见字符集:
		 * GBK:国标编码 中文2字节
		 * UTF-8:unicode的子集,也成为万国码 中文3字节
		 * ISO8859-1:欧洲字符集,不支持中文
		 */
		byte[] data = str.getBytes("gbk");
		
		raf.write(data);
		
		System.out.println("写出完毕!");
		raf.close();
		
	}
}





