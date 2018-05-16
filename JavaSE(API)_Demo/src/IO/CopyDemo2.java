package IO;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/*
 * 缓冲流
 * java.io.BufferedInputStream
 * java.io.BufferedInputStream
 * 
 * 缓冲流是一对高级流，作用是提高读写效率。
 */
public class CopyDemo2 {
	public static void main(String[] args) throws IOException {
		FileInputStream fio = new FileInputStream("fos.txt");
		BufferedInputStream bio = new BufferedInputStream(fio);
		
		FileOutputStream fos = new FileOutputStream("fos_cp1.txt");
		BufferedOutputStream bos = new BufferedOutputStream(fos);
		
		int d = -1;
		/*
		 * 缓冲流实际上本质就是进行块读写操作，无论我们使用缓冲流进行何种读写方式（随机读写，块读写）
		 * 最终都会被缓冲流转换为块读写形式是通过文件流进行实际操作。
		 * 缓冲流内部维护了一个8K的字节数组，用于块读写操作。
		 */
		while((d = bio.read()) !=-1) {
			bos.write(d);
		}
		System.out.println("复制完毕！");
		/* 官方高级流只需要关闭最外层即可。*/
		bio.close();
		bos.close();
	}
}
