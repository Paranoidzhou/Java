package raf;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;

/**
 * 将用户信息读取出来并输出到控制台
 * @author adminitartor
 *
 */
public class Test2 {
	public static void main(String[] args) throws IOException {
		RandomAccessFile raf 
			= new RandomAccessFile("user.dat","r");
		/*
		 * 将每个用户信息输出格式:user,pwd,nick,age
		 */
		for(int i=0;i<raf.length()/100;i++){	
			//读用户名
			byte[] data = new byte[32];
			raf.read(data);
			String name = new String(data,"UTF-8").trim();
			//读密码
			raf.read(data);
			String pwd = new String(data,"UTF-8").trim();
			//读昵称
			raf.read(data);
			String nickname = new String(data,"UTF-8").trim();
			//读年龄
			int age = raf.readInt();
			System.out.println(name+","+pwd+","+nickname+","+age);
		}
		
	}
}





