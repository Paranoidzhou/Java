package file;
import java.io.File;
/*
 * 使用File删除一个文件。
 */
public class DeleteFileDemo {
	public static void main(String[] args) {
	/* 将当前目录中的test.txt文件删除*/
		File file = new File("./Demo");
		if(file.exists()) {
			file.delete();
			System.out.println("文件已经删除！");
		}else {
			System.out.println("删除的文件不存在！");
		}
	}
}
