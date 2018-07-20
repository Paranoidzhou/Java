package string;

public class IndexOfDemo05 {
	public static void main(String[] args) {
		/*
		 * 检查字符串中字符/字符串出现的位置 
		 * 字符串提供了 indexOf(被检索的字符/字符串)
		 * 
		 */
		String str = "http://tedu.cn/index.html";
		//            0123456789012345678901234
		//在字符串str中检查斜线'/'出现的位置,
		//如果找到第一个字符的位置, 就返回这个位置
		int n = str.indexOf('/');
		System.out.println(n);//5
		//如果没有找到指定字符, 则返回 -1
		n = str.indexOf('\\');
		System.out.println(n);//-1
		//查找字符串时候返回的是匹配字符的起始位置
		n = str.indexOf("cn");
		System.out.println(n);//12
		
		/*
		 * 返回在此字符串中第一次出现指定字符处的索引
		 * ，从指定的索引开始搜索。 如果没有搜索到则
		 * 返回-1
		 */
		n = str.indexOf('/', 7);
		System.out.println(n); 
		n = str.indexOf(".cn", 7);
		System.out.println(n); 
		
		/*
		 * 从后向前查找
		 */
		n = str.lastIndexOf('/');
		System.out.println(n);
		
	}
	
}







