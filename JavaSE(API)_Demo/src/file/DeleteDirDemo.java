package file;
import java.io.File;
/*
 * 使用File删除一个目录
 */
public class DeleteDirDemo {
	public static void main(String[] args) {
		File dir = new File("./a");
		if(dir.exists()) {
			/*
			 * 删除目录中由一个前提条件，即：该目录必须是一个空目录才可以删除。
			 */
			dir.delete();
			System.out.println("目录已删除！");
		}else {
			System.out.println("目录不存在！");
		}
	}
}
