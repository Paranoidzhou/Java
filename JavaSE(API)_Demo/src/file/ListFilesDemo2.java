package file;

import java.io.File;
import java.io.FileFilter;

/*
 * 使用File获取一个目录中满足条件的子项
 */
public class ListFilesDemo2 {
	public static void main(String[] args) {
		/*获取当前目录中所有的文本数据*/
		File dir = new File(".");
		//MyFilter filter = new MyFilter();
		/*使用匿名内部类型形式完成文件过滤器创建*/
		/*
		FileFilter filter = new FileFilter() {
			public boolean accept(File file) {
				return file.getName().startsWith(".");
			}
		};
		*/
		File[] subs = dir.listFiles(new FileFilter() {
			public boolean accept(File file) {
				return file.getName().startsWith(".");
			}
		});
		for (int i = 0; i < subs.length; i++) {
			System.out.println(subs[i].getName());
		}
	}
}
class MyFilter implements FileFilter{
	/*
	 *     实现了文件过滤器接口后，要求必须重写accept方法，该方法的作用是
	 * 定义过滤规则，当参数file满足要求该方法返回true即可。
	 */
	public boolean accept(File file) {
		System.out.println("正在过滤："+file.getName());
		/* 检查是否以 ".txt"结尾的文件*/
		return file.getName().endsWith(".txt");
	}
}