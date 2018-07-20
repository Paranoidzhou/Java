package file;

import java.io.File;
import java.io.FileFilter;

/**
 * 获取一个目录中满足条件的子项
 * @author adminitartor
 *
 */
public class ListFilesDemo2 {
	public static void main(String[] args) {
		/*
		 * 获取当前目录中所有的文本数据
		 */
		File dir = new File(".");
//		MyFilter filter = new MyFilter();
		/*
		 * 使用匿名内部类形式完成文件过滤器创建
		 */
		FileFilter filter = new FileFilter(){
			public boolean accept(File file) {
				return file.getName().startsWith(".");
			}			
		};
		File[] subs = dir.listFiles(filter);
		
		for(int i=0;i<subs.length;i++){
			System.out.println(subs[i].getName());
		}
	}
}
/**
 * 文件过滤器
 * @author adminitartor
 *
 */
class MyFilter implements FileFilter{
	/**
	 * 实现了文件过滤器接口后,要求必须重写accept
	 * 方法,该方法的作用是定义过滤规则,当参数file
	 * 满足要求该方法返回true即可.
	 */
	public boolean accept(File file) {
		//名字是以".txt"结尾的
		System.out.println("正在过滤:"+file.getName());
		return file.getName().endsWith(".txt");
	}
	
}






