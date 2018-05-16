package IO;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/*
 * 使用文件流进行文件复制操作。
 */
public class CopyDemo {
	public static void main(String[] args) throws IOException {
		/*
		 *     使用文件输入流读取原文件，使用文件输出流向目标文件中写出，然后顺序从原文件读取
		 * 字节写入目标文件完成复制操作。
		 * 使用块方式复制！
		 */
		FileInputStream fis = new FileInputStream("demo.txt");
		FileOutputStream fos = new FileOutputStream("demo_cp1.txt");
		byte [] date = new byte[1024 * 10];
		int len ;
		while((len = fis.read(date)) != -1) {
			fos.write(date);
		}
		System.out.println("复制完毕！");
		fis.close();
		fos.close();
	}
}
