package exception;

import java.io.FileInputStream;
import java.io.IOException;

/**
 * 流操作中的异常捕获
 * 
 * @author adminitartor
 *
 */
public class FinallyDemo2 {
	public static void main(String[] args) {
		FileInputStream fis = null;
		try {
			fis = new FileInputStream("fos.txt");
			int d = fis.read();
			System.out.println(d);
		} catch (IOException e) {

		} finally {
			try {
				if (fis != null) {
					fis.close();
				}
			} catch (IOException e) {

			}
		}
	}
}
