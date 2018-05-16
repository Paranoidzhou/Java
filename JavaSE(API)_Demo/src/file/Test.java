package file;

import java.io.File;
import java.util.Arrays; 

public class Test {
	public static void main(String[] args) {
	 File dir = new File("./a");
	 delete(dir);
	}
	public static void delete(File dir) {
		/* 判断dir是否为空或者dir是否有文件存在或者dir是否有目录存在*/
		if(dir == null || !dir.exists() || !dir.isDirectory())
			return;			/*检查参数*/
		for(File file :  dir.listFiles()) {
			if(file.isFile()) {
			file.delete();	/*删除所有文件*/
			}else if(file.isDirectory()){
				delete(file);/*递归的方式删除文件*/
			}
			dir.delete();	/*删除目录本身*/
		}
	}
}
