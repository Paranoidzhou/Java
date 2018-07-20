package file;

import java.io.File;

/**
 * 获取一个目录中的所有子项
 * @author adminitartor
 *
 */
public class ListFilesDemo {
	public static void main(String[] args) {
		/*
		 * 获取当前目录中的所有子项
		 */
		File dir = new File(".");
		
		File[] subs = dir.listFiles();
		System.out.println(dir.getName()+"目录中有"
		                   +subs.length+"个子项");
		for(int i=0;i<subs.length;i++){
			/*
			 * boolean isFile()
			 * 判断当前File表示的是否为文件
			 * 
			 * boolean isDirectory()
			 * 判断当前File表示的是否为目录
			 */
			if(subs[i].isFile()){
				System.out.println("文件:"+subs[i].getName());
			}
			if(subs[i].isDirectory()){
				System.out.println("目录:"+subs[i].getName());
			}
			
		}
	}
}



