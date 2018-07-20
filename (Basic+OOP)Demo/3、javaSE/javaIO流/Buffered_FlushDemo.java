package io;

import java.io.BufferedOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * 缓冲流的缓冲区操作
 * @author adminitartor
 *
 */
public class Buffered_FlushDemo {
	public static void main(String[] args) throws IOException {
		FileOutputStream fos
			= new FileOutputStream("bos.txt");	
		BufferedOutputStream bos
			= new BufferedOutputStream(fos);		
		String str = "摩擦摩擦,是魔鬼的步伐.";
		byte[] data = str.getBytes();
		
		bos.write(data);
		//强制将当前缓冲区数据写出
//		bos.flush();
		System.out.println("写出完毕");
		
		//缓冲流close方法时会flush.
		bos.close();
	}
}










