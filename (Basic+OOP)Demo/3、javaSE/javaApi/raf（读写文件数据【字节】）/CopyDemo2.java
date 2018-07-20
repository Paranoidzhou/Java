package raf;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;

/**
 * 由于硬盘的物理特性,导致随机读写效率很低,块读写
 * 的效率还是很不错的.
 * 随机读写:单字节读写数据
 * 块读写:一次一组字节读写数据
 * 
 * 所以若想提高读写效率我们需要提高每次读写的数据量
 * 减少实际读写次数来达到.
 * @author adminitartor
 *
 */
public class CopyDemo2 {
	public static void main(String[] args) throws IOException {
		RandomAccessFile src 
			= new RandomAccessFile("movie.mp4","r");		
		RandomAccessFile desc
			= new RandomAccessFile("movie_cp2.mp4","rw");
		/*
		 * RAF提供了一次读写一组字节的方法:
		 * int read(byte[] data)
		 * 一次性读取给定的字节数组总长度的字节量,
		 * 并将这些字节存入到概述组中,返回值为本次
		 * 实际读取到的字节量,若返回值为-1.则表示
		 * 本次读取的是文件末尾.
		 * 
		 * void write(byte[] data)
		 * 一次性将给定的字节数组中所有字节写入文件
		 * 
		 * void write(byte[] data,int offset,int len)
		 * 将给定数组中从下标offset处的连续len个字节
		 * 一次性写出
		 * 1byte   8位2进制
		 * 1kb     1024 byte
		 * 1mb     1024kb
		 * 1gb     1024mb
		 */
		//10kb
		byte[] buf = new byte[1024*10];
		int len = -1;//每次实际读取到的字节数
		long start = System.currentTimeMillis();
		while((len = src.read(buf))!=-1){
			desc.write(buf,0,len);
		}
		long end = System.currentTimeMillis();
		System.out.println("复制完毕!耗时:"+(end-start)+"ms");
		src.close();
		desc.close();
	}
}




