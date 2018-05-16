package raf;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.io.UnsupportedEncodingException;
import java.util.Arrays;
import java.util.Scanner;

/*
 * 完成用户注册功能。
 * 
 * 用user.dta文件保存用户信息
 * 每个用户的信息包括：用户名，密码，昵称，年龄。
 * 其中年龄是int值，其余都是字符串。
 */
public class Test1 {
	public static void main(String[] args) throws IOException {
		Scanner in = new Scanner (System.in);
		RandomAccessFile raf = new RandomAccessFile("user.dat","rw");
		raf.seek(raf.length());    //移动指针到末尾，这样设置不会覆盖写，而是追加写
		String name = "苍老师";
		String password ="123456";
		String nickname = "松";
		int age = 35;
		/*
		 * 数据“留白”的目的是便于后期修改信息。
		  
		 
		 * 写用户名*/
		byte [] data  = name.getBytes("UTF-8");
		data = Arrays.copyOf(data, 32);  //多余留空，扩至32字节，方便以后修改
		raf.write(data);
		/* 写密码*/
		data = password.getBytes("UTF-8");
		data = Arrays.copyOf(data, 32);  //多余留空，扩至32字节，方便以后修改
		raf.write(data);
		/* 写昵称*/
		data = nickname.getBytes("UTF-8");
		data = Arrays.copyOf(data,32);   //多余留空，扩至32字节，方便以后修改
		raf.write(data);
		/* 写年龄*/
		raf.writeInt(age);               //年龄只占四字节，不用管
		raf.close();
		System.out.println("注册完毕！");	
	}
}
