package file;

import java.io.File;
import java.util.Arrays;

/*
 * 使用File获取一个目录中的所有子项
 */
public class ListFileDemo {
	public static void main(String[] args) {
		/* 获取当前目录中的所有子项*/
		File dir = new File(".");
		File [] subs = dir.listFiles();
		System.out.println(dir.getName()+"目录中有"+subs.length+"个子项目。");
		for (int i = 0; i < subs.length; i++) {
			/*
			 * boolean isFIle()
			 * 判断当前File表示的是否为文件。
			 * 
			 * boolean isDirectory()
			 * 判断当前File表示的是否为目录。
			 */
			subs[i].isFile();
			subs[i].isDirectory();
			if(subs[i].isFile()) {
				System.out.println("是文件："+subs[i].getName());
			}
			if(subs[i].isDirectory()) {
				System.out.println("是目录："+subs[i].getName());
			}
		}
		System.out.println("目录子项名字为："+Arrays.toString(subs));
	}
}
