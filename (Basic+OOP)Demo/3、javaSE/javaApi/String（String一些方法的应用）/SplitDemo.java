package string;
/**
 * java支持正则表达式方法2
 * 
 * String[] split(String regex)
 * 将当前字符串按照满足正则表达式的部分拆分,将拆分
 * 出来的内容存入字符串数组并返回.
 * @author adminitartor
 *
 */
public class SplitDemo {
	public static void main(String[] args) {
		String str = "abc123def456ghi";
		/*
		 * 按照数字部分进行拆分,获得所有字母部分
		 * 若连续匹配了拆分部分,那么中间会拆分出
		 * 一个空字符串.若是在字符串末尾连续匹配
		 * 那么所有拆分出来的空字符串全部忽略.
		 */
		String[] data = str.split("[0-9]+");
		System.out.println(data.length);
		for(int i=0;i<data.length;i++){
			System.out.println(data[i]);
		}
	}
}









