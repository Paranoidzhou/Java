package String;

public class IndexOfDemo {

	public static void main(String[] args) {
		String str = "http://tedu.cn/index.html";
     //	起始下标由0开始。	 			
    // 在字符串str中检查斜线'/'出现的位置，如果找到第一个匹配字符的位置，就返回这个位置。
  // (indexOf) 从前往后找。
		int n = str.indexOf('/');  //查找斜线 / 位置
		System.out.println(n);     //返回值为：5
    // （lastIndexOf） 返回指定字符在此字符串中最后一次出现处的索引。 （也就是从后往前找）
		n = str.lastIndexOf('/');  //从最后面的位置开始，向前查找 / 位置。	
		System.out.println(n);		//返回值为：14		
	/*
	    如果没有找到指定字符，则返回 -1；	
	 */
		n = str.indexOf('\\');
		System.out.println(n);    //返回值为：-1
	/*	
		查找多个字符（字符串）时候返回的是匹配字符的第一个起始下标位置
	*/	
		n = str.indexOf("ted");   //查找字符串为双引号
		System.out.println(n);    //返回值为：7
	/*
	 	返回在此字符串中第一次出现指定字符处的索引位置，从指定的索引开始搜索。如果没有搜索到则返回-1.
	 */
		
		n = str.indexOf('/',7);   //从第七个位置开始，往后搜索 斜线/ 位置
		System.out.println(n);    //返回值为：14
		
		n = str.indexOf(".cn",7); //从第7个位置开始，往后搜索 .cn位置
		System.out.println(n);	  //返回值为：11
		
		n = str.indexOf(".cn",12);//从第十二位置开始，往后搜索.cn位置
		System.out.println(n);    //返回值为：-1
	/*
		返回指定字符在此字符串中最后一次出现处的索引，从指定的索引处开始进行反向搜索。
	*/	
	   n = str.lastIndexOf(".cn", 20);//从第二十个位置开始，反向搜索 .cn位置
	   System.out.println(n);		//返回值为：11
	
	
	}
}
