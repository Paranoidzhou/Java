package file;

import java.io.File;

/**
 * 创建一个多级目录
 * @author adminitartor
 *
 */
public class MkDirsDemo {
	public static void main(String[] args) {
		/*
		 * 在当前目录中创建a/b/c/d/e/f目录
		 */
		File dir = new File("./a/b/c/d/e/f");
		if(!dir.exists()){
			/*
			 * mkdirs会将所有不存在的父目录一并
			 * 创建出来
			 */
			dir.mkdirs();
			System.out.println("目录已创建!");
		}else{
			System.out.println("目录已存在!");
		}
	}
}








