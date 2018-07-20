package raf;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.util.Arrays;

/**
 * 完成用户注册功能
 * 
 * 用user.dat文件保存用户信息
 * 每个用户的信息包括:用户名,密码,昵称,年龄
 * 其中年龄是int值,其余都是字符串.
 * 
 * @author adminitartor
 *
 */
public class Test1 {
	public static void main(String[] args) throws IOException {
		RandomAccessFile raf 
			= new RandomAccessFile("user.dat","rw");
		//先将指针移动到文件末尾,以便追加新记录
		raf.seek(raf.length());
		
		String name = "克晶";
		String password = "123456";
		String nickname = "晶";
		int age = 35;
		/*
		 * 每条记录占用100字节,其中用户名,密码,
		 * 昵称各占32字节,int型的age占4字节.
		 * 数据"留白"的目的是便于后期修改信息.
		 */
		//写用户名
		byte[] data = name.getBytes("UTF-8");
		data = Arrays.copyOf(data, 32);
		raf.write(data);//一次写了32字节
		
		data = password.getBytes("UTF-8");
		data = Arrays.copyOf(data, 32);
		raf.write(data);
		
		data = nickname.getBytes("UTF-8");
		data = Arrays.copyOf(data, 32);
		raf.write(data);
		
		raf.writeInt(age);
		
		System.out.println("注册完毕!");
		raf.close();
	}
}









