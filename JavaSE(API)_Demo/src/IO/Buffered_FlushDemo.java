package IO;

import java.io.BufferedOutputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/*
 * 
 */
public class Buffered_FlushDemo {
	public static void main(String[] args) throws IOException {
	 FileOutputStream fos = new FileOutputStream("BOS.txt");	
	 BufferedOutputStream bos = new BufferedOutputStream(fos);
	 String str = "摩擦摩擦，是魔鬼的步伐～";
	 byte[] data = str.getBytes();
	 bos.write(data);
	 /*强制将当前缓冲区数据写出*/
	 //bos.flush();
	 System.out.println("写出完毕！");
	 
	 /*在关闭bos之前，会有flush()执行*/
	 bos.close();
	}
}
