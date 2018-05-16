package file;

import java.io.File;

public class Test_ {
	public static void main(String[] args) {
		File file = new File("./a");
		 delete(file);
	}
	public static void delete(File file) {
		if(file.isDirectory()) {
			File [] subs = file.listFiles();
			for (int i = 0; i < subs.length; i++) {
				File sub = subs[i];
				delete(sub);	        //实际开发中自己调自己称为：递归调用
			}
		}
		file.delete();
	}
}
