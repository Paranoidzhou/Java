package file;
import java.io.File;
import java.io.IOException;
/*
 * 使用File创建一个文件。
 */
public class CreateNewFileDemo {
	public static void main(String[] args) throws IOException {
		/*在当前目录中创建一个文件test.txt*/
		File file = new File("./今日总结.txt");
		/*
		 * boolean exists ()
		 * 该方法用于判断当前File表示的文件或目录是否已经存在，存在则返回true
		 */
		
		if(!file.exists()) {       //判断文件是否存在		
			file.createNewFile();   //创建文件
			System.out.println("文件创建成功！");
		}else {
			System.out.println("文件已经存在！");
		}
	}
}
