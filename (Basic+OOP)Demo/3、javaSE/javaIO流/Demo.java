package io;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Demo {
	public static void main(String[] args) throws IOException {
		/*
		 * 按行获取键盘输入的内容
		 */
		System.out.println("请输入内容:");
		BufferedReader br = new BufferedReader(
			new InputStreamReader(
				System.in	
			)	
		);	
		String line = null;
		while(true){
			line = br.readLine();
			if("exit".equals(line)){
				break;
			}
			System.out.println(line);
		}
		
		br.close();
	}
}





