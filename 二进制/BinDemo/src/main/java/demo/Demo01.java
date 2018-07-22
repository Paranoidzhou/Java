package demo;

import org.apache.commons.lang.StringUtils;

public class Demo01 {

	public static void main(String[] args) {
		/*
		 * 认识一下2进制
		 * 数据在计算机中是2进制的!
		 * int long 等数据都是2进制的!
		 */
		int n = 50;//110010
		//toBinaryString 将一个在内存中实际的2进制
		//转换为字符串! 就是输出n在内存中的情况
		System.out.println(
				Integer.toBinaryString(n));
		System.out.println(n);//"50"
		
		/**
		 * 输出 0 ~ 50 全部的 2进制数
		 * 手工验证:每个2进制数字的值
		 */
		for(int i=0;i<=50;i++){
			String bin=Integer.toBinaryString(i);
			bin = StringUtils.leftPad(bin,32,'0');
			System.out.println(bin);
		}
		
		String s = StringUtils.leftPad(
				"10", 32, '0');
		// 00000000000000000000000000000010
		// 
	
	}
}







