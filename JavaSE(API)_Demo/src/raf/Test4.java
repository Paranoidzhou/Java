package raf;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.util.Arrays;
import java.util.Scanner;

public class Test4 {
	public static void main(String[] args) throws IOException {
		Scanner scan = new Scanner(System.in);
			System.out.println("请输入用户名：");	
			String username = scan.nextLine();
			System.out.println("请输入密码：");
			String password = scan.nextLine();
			
			RandomAccessFile raf = new RandomAccessFile("user.dat","rw");
			
			boolean have = false;
			for (int i = 0; i < raf.length()/100; i++) {
				raf.seek(i*100);
				byte [] data = new byte[32];
				raf.read(data);
				String name = new String (data,"UTF-8").trim();
				if(name.equals(username)) {
					data = password.getBytes("UTF-8");
					data = Arrays.copyOf(data, 32);
					raf.write(data);
					have = true;
					System.out.println("修改成功！");
					break;
				}
			}
		if(!have) {
			System.out.println("查无此人!");
		}
		raf.close();
		
	}
}