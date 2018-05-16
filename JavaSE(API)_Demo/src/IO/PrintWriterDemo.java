package IO;

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;

/*
 * 缓冲字符流
 * java.io.BufferedWriter
 * java.io.BufferedReader
 * 
 *java.io.PrintWriter
 * 带有自动行刷新的缓冲字符输出流（常用）
 */
public class PrintWriterDemo {
	public static void main(String[] args) throws FileNotFoundException, UnsupportedEncodingException {
		/*
		 * 向文本文件pw.txt中写出两行字符串
		 * 
		 * PW直接提供了向文件中写入字符串的构造方法
		 * PrintWriter(String path)
		 * PrintWriter(File file)
		 */
		PrintWriter pw = new PrintWriter("pw.txt","UTF-8");
		pw.println("我相信我就是我，我相信明天！");
		pw.println("我相信会有新的地平线！");
		System.out.println("写出完毕！");
		pw.close();
	}
}
