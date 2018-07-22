package demo;

import org.apache.commons.lang.StringUtils;

public class Demo05 {
	public static void main(String[] args) {
		/**
		 * 输出 -50 ~ 50 之间的补码
		 */
		for(int i=-50; i<=50; i++){
			System.out.println(
				StringUtils.leftPad(
				Integer.toBinaryString(i), 
				32, '0'));
		}
	}
}
