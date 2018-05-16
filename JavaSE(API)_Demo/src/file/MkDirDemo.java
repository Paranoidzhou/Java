package file;
import java.io.File;
/*
 * 使用File创建一个目录
 */
public class MkDirDemo {
	public static void main(String[] args) {
		/*在当前目录中新建一个目录demo*/
		File file  = new File("./Demo");
		if(!file.exists()) {
			file.mkdir();
			System.out.println("目录创建成功！");
		}else {
			System.out.println("目录已经存在！");
		}
	}
}
