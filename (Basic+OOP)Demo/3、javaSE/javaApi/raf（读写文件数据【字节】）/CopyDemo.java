package raf;

import java.io.IOException;
import java.io.RandomAccessFile;

/**
 * 复制文件
 * @author adminitartor
 *
 */
public class CopyDemo {
	public static void main(String[] args) throws IOException {
		RandomAccessFile src 
			= new RandomAccessFile("music.mp3","r");		
		RandomAccessFile desc
			= new RandomAccessFile("music_cp.mp3","rw");
		int d = -1;//保存每次读取到的字节
		while((d = src.read()) != -1){
			desc.write(d);
		}		
		System.out.println("复制完毕了!");
		src.close();
		desc.close();
	}
}






