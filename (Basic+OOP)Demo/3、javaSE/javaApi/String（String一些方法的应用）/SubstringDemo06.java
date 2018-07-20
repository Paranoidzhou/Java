package string;

public class SubstringDemo06 {
	public static void main(String[] args) {
		/*
		 * 截取子字符串
		 */
		String url="http://tedu.cn/index.html";
		//          01234567890123456789012345
		//                 tedu.cn
		/*
		 * substring(起始位置, 结束位置)
		 * 包含起始位不包含结束位置.
		 */
		String host=url.substring(7, 14);
		//才7开始连续截取4个字符
		String s = url.substring(7, 7+4);
		System.out.println(host);
		System.out.println(s);
		/*
		 * 从起始位置到最后全部截取为子字符串
		 */
		String s2 = url.substring(15);
		System.out.println(s2);
		
		/*
		 * 动态截取 URL 中的主机名
		 * http://tedu.cn/java/index.html
		 * http://canglaoshi.org/index.html
		 * http://tmooc.cn/index.html 
		 */
		url="http://canglaoshi.org/index.html";
		int index=url.indexOf("/", 7);
		host=url.substring(7, index);
		System.out.println(host);
		//截取URL中的文件名
		String file=url.substring(
				url.lastIndexOf("/")+1);
		System.out.println(file);
	}
}










