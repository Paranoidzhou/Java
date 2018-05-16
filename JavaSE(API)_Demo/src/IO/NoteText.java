package IO;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;
import java.util.Scanner;
/*
 * 简易记事本工具
 * 程序启动后，要求用户输入一个文件名，然后对该文件进行写操作。
 * 每当用户在控制台输入一行字符串，都将该字符串按行写入到文件中。当用户输入“exit”时程序退出。
 */
public class NoteText {
	public static void main(String[] args) throws FileNotFoundException, UnsupportedEncodingException {
		Scanner input = new Scanner(System.in);
		System.out.println("请输入你要输入的文件名：");
		String name = input.nextLine();
		/*
		 *   PrintWriter的构造方法中若第一个参数为流，那么就支持一个重载构造方法，允许再传
		 * 入一个boolean值类型的参数，若该值为true，则具有自动行刷新功能。
		 * 即：每当使用println方法写出一行字符串后就会自动flush()。
		 * 
		 */
		PrintWriter pw = new PrintWriter(
				new BufferedWriter(
						new OutputStreamWriter(
								new FileOutputStream(name+".txt"),"UTF-8"
								)
						),true);
		Scanner in = new Scanner(System.in);
		System.out.println("请写入内容：");
		while(true) {
			String line = in.nextLine();
			if("exit".equals(line)) {  /*如果这样写：  line.equals("exit") 如果输入的时空值，会报空指针异常*/
//			  当字符串遇到字面量与变量进行内容比较时，应当使用： 字面量.equals(变量)
//		      因为变量在实际开发中不能保证null,所以可能引发空指针异常。字面量一定不是空，所以不会出现该问题。
				System.out.println("记事本退出成功！");
				break;
			}else {
				pw.println(line);
				/*pw.flush();*/                 
			}
		};
		pw.close();
	
	}
}
