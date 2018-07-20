package file;

import java.io.File;

/**
 * 1:编写一段代码,要求完成1+2+3+4+5...+100
 *   并输出结果.但是该代码中不得出现for,while
 *   关键字.
 * 
 * 2:一瓶汽水1块钱,3个瓶盖可以换一瓶,2个空瓶可以换
 *   一瓶,编写程序计算:20块钱总共可以得到多少瓶?
 * 
 * 
 * 
 * 练习
 * @author adminitartor
 *
 */
public class Test {
	public static void main(String[] args) {
		File dir = new File("./a");
		delete(dir);
	}
	/**
	 * 将给定的File表示的文件或目录删除
	 * @param file
	 */
	public static void delete(File file){
		if(file.isDirectory()){
			//先将目录清空
			File[] subs = file.listFiles();
			for(int i=0;i<subs.length;i++){
				File sub = subs[i];
				delete(sub);
			}
		}
		file.delete();
	}
}






