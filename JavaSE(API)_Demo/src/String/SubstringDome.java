package String;

public class SubstringDome {

	public static void main(String[] args) {
		String url = "http://tedu.cn/index.html";
		/*
		 *   substring(起始位置，结束位置)。
		 *    包含起始位，不包含结束位置。 
		 */
		String host = url.substring(7,14);	//7表示为索引起始下标，14表示索引结束位置
		System.out.println(host);           //输出 tedu.cn
		String host1 = url.substring(7,7+7);
		System.out.println(host1);				//输出结果同上
		String s = url.substring(7,7+4);		// 7+4 表示索引位置7后面的四个数
		System.out.println(s);					//输出tedu
		
		/*
		 * 从起始位置到最后全部截取为子字符串，它是新字符串
		 */
		String s1 = url.substring(15);	//截取起始位置15之后的所有字符
		System.out.println(s1);				//输出index.html
		
		url = "http://www.baidu.com/index.html";
		int index = url.indexOf('/',7);	//向后搜索 / 位置，从第七个位置开始
		System.out.println(index);			//（/位置）在第20个。
		host = url.substring(7,20);	//从第七个开始，搜索index返回值长度(终止位置为20)。
		System.out.println(host);			//输出为:www.baidu.com
		
		String file = url.substring(url.lastIndexOf('/')+1);
		System.out.println(file);
	}

}
