package IO;

import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;

/*
 * 在流链接中使用PW。
 */
public class PrintWriterDemo02 {
	public static void main(String[] args) throws FileNotFoundException, UnsupportedEncodingException {
		/*
		 * 在流连接中使用时，需要在转换流中指定字符集。
		 */
		PrintWriter pw = new PrintWriter(
				new BufferedWriter(
						new OutputStreamWriter(
								new FileOutputStream("pw2.txt")
								,"UTF-8"
								)
						)
				);
		pw.println("你说明天就要走远！");
		pw.println("不想人生留下遗憾！");
		System.out.println("写出完毕！");
		pw.close();
	}
}
