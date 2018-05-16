package file;
import java.io.File;
/*
 * 使用File创建一个多级目录
 */
public class MkDirsDemo {
	public static void main(String[] args) {
		/* 在当前目录中创建a/b/c/d/e/f目录*/
		File file = new File("./a/b/c/d/e/f");
		if(!file.exists()) {
			/*mkdirs()会将所有不存在的父目录一并创建出来（会补全子目录）*/
			file.mkdirs();
			System.out.println("多级目录创建成功！");
		}else {
			System.out.println("目录已经存在！");
		}
	}
}
