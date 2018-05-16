package IO;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.UnsupportedEncodingException;

/*
 * java IO流
 * java 提供了标准的IO操作，即：输入与输出。
 * IO的作用是可以让我们的程序与外界进行数据交换，比如从网络读写数据，
 * 读取键盘数据，读写文件数据等等。
 * 
 * 标准的IO流根据将功能按照方向划分。
 * 输入：从外界到程序中的过程，这是“读”的过程。
 * 输出：从程序发送至外界的过程，这是“写”的过程。
 * 
 * 学习IO的重点：理解流链接操作，通过应用流链接，按照需求组合高级流与低级流，完成读写操作。
 * 
 * 流分为：节点流（低级流），处理流（高级流）。
 * 节点流：实际链接程序与另一端的管道，负责在两端之间传送数据。
 * 注意：读写一定是建立在节点流的基础上进行的。
 * 
 * 处理流：不能独立存在，可以链接在其他流上，处理流自带某种对数据的加工操作，所以数据流经
 * 该流会对这些数据进行处理，这样可以简化我们对数据的处理操作。
 * 
 * java.io.InputStream
 * 所有字节输入流的父类，是一个抽象类，规定了所有字节输入流都必须具备的读取字节的方法。
 * 
 * java.io.OutputStream
 * 所有子节输出流的父类，是一个抽象类，规定了所有字节输出流都必须具备的写出字节的方法。
 */
//	文件流：文件流是一套低级流，作用是读写文件数据。		 
//	文件流与RandomAccessFile的对比：
//	1：论功能是一致的，都是用来读写文件数据。
//	2：RAF对于文件即可读也可写，但是文件流不行。文件流只用来读文件数据，文件输出流用来向文件中写入数据。
//	3：流的特点是顺序读写操作，即：读写是不能回退的。RAF是随机读写操作，因为依靠指针位置进行读写，
//	   所以可以通过操作指针对文件任意位置随意读写。                 
public class FileOutputStreamDemo {
	public static void main(String[] args) throws IOException {
		/*文件输出流支持的两种写模式：
		 * 1：覆盖写操作，即：若写出的文件有数据，则将原有数据全部删除，将本次通过流写出的内容作为文件数据。
		 * FileOutputStream(String path)
		 * FileOutputStream(File file)
		 * 
		 * 2:追加写操作，若文件有数据则全部保留，从该文件末尾追加内容。
		 * FileOutputStream(String path ,boolean append)
		 * FileOutputStream(File file,boolean append)
		 */
		FileOutputStream fos = new FileOutputStream("fos.txt",true);  //后面如果写了true则是追加写，不加则覆盖写。
		String str = "我祈祷拥有一颗透明的心灵，和会流泪的眼睛！";
		byte [] date = str.getBytes("UTF-8");
		fos.write(date);
		System.out.println("写出完成！");
		fos.close();
	}
}
