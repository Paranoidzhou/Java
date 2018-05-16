package raf;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;

public class CopyDemo {

	public static void main(String[] args) throws IOException {
		RandomAccessFile src = new RandomAccessFile("demo.txt","r");
		RandomAccessFile desc = new RandomAccessFile("demo_cp.txt","rw");
		int d = -1;  	/*保存每次读取到的字节*/
		while((d = src.read()) != -1) {
			desc.write(d);
		}
		System.out.println("复制完毕了！");
		src.close();
		desc.close();

	}

}
