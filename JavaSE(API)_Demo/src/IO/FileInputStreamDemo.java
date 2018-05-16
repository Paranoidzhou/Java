package IO;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

/*  文件输入流 */
public class FileInputStreamDemo {
	public static void main(String[] args) throws IOException {
		/*将fos.txt文件中的数据读取出来*/
		byte [] data = new byte [100];
		FileInputStream fis = new FileInputStream("fos.txt");
		int len = fis.read(data);
		String str = new String(data, 0, len, "UTF-8");
		/*   byte[] bytes (data) :要解码的字符数组    int offset(0)：要解码的第一个byte的索引
             int length(len)：要解码的byte数组的长度   最后则是代表指定字符集。   */
		System.out.println(str);
		fis.close();
	}
}
