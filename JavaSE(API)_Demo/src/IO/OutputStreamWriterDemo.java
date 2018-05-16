package IO;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.io.UnsupportedEncodingException;

/*
 * 字符流：
 * java将流按照读写单位划分为字节流与字符流。
 * InputStream合OutputStream是所有字节流父类，而java.io.Reader和java.io.Writer
 * 是字符流的父类。
 * 
 * 字符流只是方便我们读写字符，底层本质还是读写字节，只是字节与字符的转换工作交给了字符流来完成。
 * 【字符流只能写纯文本文件】
 * 
 * 转换流：
 * java.io.InputStreamReader
 * java.io.OutputStreamWriter
 * 
 * 
 * 
 *   java提供的其他高级字符流都有一个特点就是只能连在其他字符流上，但是通常低级流都是字节
 * 流，这就导致字符流不能直接搭配字节流使用，但是转换流例外，它们本身就是字符流，而它们又可
 * 以连接字节流，所以在实际开发中当我们使用高级的字符流时通常与字节流连接时要使用转换流，它
 * 起到“
 * 将字符流转换字节”的功能、承上启下。
 */
public class OutputStreamWriterDemo {
	public static void main(String[] args) throws IOException {
		FileOutputStream fos = new FileOutputStream("osw.txt");
		OutputStreamWriter osw = new OutputStreamWriter(fos,"UTF-8");
		
		osw.write("我是一只小小小小鸟，想要飞呀飞，却飞呀飞不高！");
		osw.write("\n");   //换行
		osw.write("我寻寻觅觅，寻寻觅觅一个温暖的怀抱，这样的要求算不算太高！");
		System.out.println("写出完毕！");
		
		osw.close();       //关闭流

	}
}
