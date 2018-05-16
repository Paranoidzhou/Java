package raf;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;

/*
 * 将用户信息读取出来并输出到控制台。
 */
public class Test2 {
	public static void main(String[] args) throws IOException {
		RandomAccessFile raf = new RandomAccessFile("user.dat","r");
		/*  将每个用户信息输出格式：user,psw,nick,age*/
		for (int i = 0; i < raf.length()/100; i++) {
			byte [] data = new byte [32];
			/* 读用户姓名*/
			raf.read(data);
			String user = new String (data,"UTF-8").trim();
			/* 读密码*/
			raf.read(data);
			String psw = new String (data,"UTF-8").trim();
			/* 读用户昵称*/
			raf.read(data);
			String nickname = new String (data,"UTF-8").trim();
			/* 读用户年龄*/
		   int age = raf.readInt();
		   System.out.println(user+","+psw+","+nickname+","+age);
		}
	}
}
