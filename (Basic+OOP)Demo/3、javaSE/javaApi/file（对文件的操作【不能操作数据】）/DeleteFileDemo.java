package file;

import java.io.File;

/**
 * 删除一个文件
 * @author adminitartor
 *
 */
public class DeleteFileDemo {
	public static void main(String[] args) {
		/*
		 * 将当前目录中的test.txt文件删除
		 */
		File file = new File("./test.txt");
		
		if(file.exists()){
			file.delete();
			System.out.println("删除完毕!");
		}else{
			System.out.println("文件不存在!");
		}
	}
}











