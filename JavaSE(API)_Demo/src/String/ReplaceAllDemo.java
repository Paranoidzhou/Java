package String;

public class ReplaceAllDemo {
/*      字符串指出正则表达式方法3：
 * 
 *     String replanceAll(String regex , String str)
 * 		 将当前字符串中满足正则表达式的部分替换为给定内容。 
 */
	public static void main(String[] args) {
		String str  = "dsa15fd21df";
		String str1 = "dsa15fd21df";
		String str2 = "dsa15fd21df";
		str = str.replaceAll("\\d","#NUMBER#");
		System.out.println(str);
		System.out.println("=============================================");
		str1 = str1.replaceAll("[0-9]+", "#NUMBER#");
		System.out.println(str1);
		System.out.println("=============================================");
		str2 = str2.replaceAll("[0-9]", "#NUMBER#");
		System.out.println(str2);
		
		
	}
}
