package file;

import java.io.File;
import java.io.IOException;

/**
 * 使用File创建一个文件
 * @author adminitartor
 *
 */
public class CreateNewFileDemo {
	public static void main(String[] args) throws IOException {
		/*
		 * 在当前目录中创建一个文件test.txt
		 */
		File file = new File("./test.txt");
		/*
		 * boolean exists()
		 * 该方法用于判断当前File表示的文件或目录
		 * 是否已经存在,存在则返回true
		 */
		if(!file.exists()){
			file.createNewFile();
			System.out.println("文件已创建!");
		}else{
			System.out.println("文件已存在!");
		}
		
	}
}










