package IO;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;

/*
 * 缓冲字符输入流:可以按行读取字符串.
 */
public class BufferedReaderDemo {
	public static void main(String[] args) throws IOException {
		/* 将当前源程序读取出来并输出到控制台*/
		FileInputStream fis = new FileInputStream("src/IO/BufferedReaderDemo.java");//读取当前路径的路径文件
		InputStreamReader isr = new InputStreamReader(fis);  //转换流
		BufferedReader br = new BufferedReader(isr);     
		/*
		 * String readLine()
		 * 连续读取若干字节,直到读取到换行符为止,然后将换行符之前读取的字符以一个字符串形式返回.
		 * 注意:返回的字符串中不含有最后读取到的换行符号,
		 * 若返回值为Null,则表示末尾.
		 */
		String line = null;
		while((line = br.readLine())!=null) {
			System.out.println(line);
		}
		br.close();
	}
}
