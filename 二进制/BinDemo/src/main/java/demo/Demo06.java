package demo;

import java.io.RandomAccessFile;

import org.apache.commons.lang.StringUtils;

public class Demo06 {

	public static void main(String[] args) {
		/*
		 * 补码的互补对称现象 -n=~n+1
		 */
		int n = 8;
		int m = ~n+1;
		System.out.println(m); //-8
		//分析计算原理:
		System.out.println(StringUtils.leftPad(
			Integer.toBinaryString(n),32,'0'));
		System.out.println(StringUtils.leftPad(
			Integer.toBinaryString(~n),32,'0'));
		System.out.println(StringUtils.leftPad(
			Integer.toBinaryString(~n+1),32,'0'));
		
		//raf.writeInt(int n)
		//RandomAccessFile raf=new RandomAccessFile(file, mode);
		//raf.writeInt(v);
		//raf.readInt()
	}

}







