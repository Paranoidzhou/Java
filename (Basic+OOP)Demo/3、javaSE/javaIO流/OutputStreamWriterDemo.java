package io;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;

/**
 * 字符流
 * java将流按照读写单位划分为字节流与字符流
 * InputStream和OutputStream是所有字节流父类
 * 而java.io.Reader和java.io.Writer是字符流的父类
 * 
 * 字符流只是方便我们读写字符,底层本质还是读写字节,
 * 只是字节与字符的转换工作交给了字符流来完成.
 * 
 * 转换流
 * java.io.InputStreamReader
 * java.io.OutputStreamWriter
 * 
 * 
 * java提供的其他高级字符流都有一个特点就是只能
 * 连在其他字符流上,但是通常低级流都是字节流,这就
 * 导致字符流不能直接搭配字节流使用,但是转换流例外
 * 它们本身是字符流,而它们又可以连接字节流,所以在
 * 实际开发中当我们使用高级的字符流时通常与字节流
 * 连接时要使用转换流,它起到"将字符转换字节"的功能
 * 承上启下.
 * @author adminitartor
 *
 */
public class OutputStreamWriterDemo {
	public static void main(String[] args) throws IOException {
		FileOutputStream fos
			= new FileOutputStream("osw.txt");
		OutputStreamWriter osw
			= new OutputStreamWriter(fos,"UTF-8");
		
		osw.write("简单点,说话的方式简单点.");
		osw.write("递进的情绪请省略,你又不是个演员,别设计那些情节.");
		System.out.println("写出完毕!");
		
		osw.close();
	}
}









