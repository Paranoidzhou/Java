package file;

import java.io.File;
/*
 * java.io.File
 * File的每一个实例是用于表示硬盘上的一个文件或目录。
 * 
 * 使用File可以：
 * 1：访问其表示的文件或目录的属性信息（名字，大小，修改时间等）
 * 2：操作文件或目录（创建，删除）
 * 3：访问一个目录中的所有子项、
 * 但是不能访问文件数据。
 */
public class FileDemo {
	public static void main(String[] args) {
		/* 访问当前项目目录中的demo.txt文件
		 *      在表示文件或目录时指定的路径尽量不要使用绝对路径，因为不同的操作系统
		 * 路径格式不一致。
		 *      相对路径是最常使用的，但是相对路径相对哪里要看程序在那个运行环境运行，
		 * 而运行环境决定着相对路径。
		 *    在eclopse中运行程序时，“当前目录”指定位该类所处的项目目录
		 */
		File file = new File("./demo.txt");
		/* 获取名字*/
		String name = file.getName();
		System.out.println("name:"+name);
		/* 获取文件大小*/
		long length = file.length();
		System.out.println("文件大小："+length+"字节");
		/*是否可读可写*/
		boolean cr = file.canRead();
		boolean cw = file.canWrite();
		System.out.println("可读："+cr);
		System.out.println("可写："+cw);
		/*是否为隐藏文件*/
		boolean ih = file.isHidden();
		System.out.println("是否隐藏："+ih);
	}
}
