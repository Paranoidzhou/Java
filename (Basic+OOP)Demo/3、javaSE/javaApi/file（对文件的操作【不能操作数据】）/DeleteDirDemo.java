package file;

import java.io.File;

/**
 * 删除一个目录
 * @author adminitartor
 *
 */
public class DeleteDirDemo {
	public static void main(String[] args) {
		/*
		 * 将当前目录中的demo目录删除
		 */
		File dir = new File("./demo");
		if(dir.exists()){
			/*
			 * 删除目录有一个前提条件,即:该目录
			 * 必须是一个空目录才可以删除.
			 */
			dir.delete();
			System.out.println("目录已删除");
		}else{
			System.out.println("目录不存在!");
		}
	}
}








