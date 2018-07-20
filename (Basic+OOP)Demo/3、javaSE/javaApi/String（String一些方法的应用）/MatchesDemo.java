package string;
/**
 * String提供了支持正则表达式的方法
 * 
 * boolean matches(String regex)
 * 使用给定的正则表达式验证当前字符串是否满足格式
 * 要求
 * 需要注意,给定的正则表达式无论是否添加边界符(^$)
 * 都是做全匹配验证
 * 
 * @author adminitartor
 *
 */
public class MatchesDemo {
	public static void main(String[] args) {
		String mail = "fancq@tedu.cn";
		/*
		 * 邮箱的正则表达式:
		 * [a-zA-Z0-9_]+@[a-zA-Z0-9_]+(\.[a-zA-Z]+)+
		 */
		boolean tf = mail.matches("[a-zA-Z0-9_]+@[a-zA-Z0-9_]+(\\.[a-zA-Z]+)+");
		if(tf){
			System.out.println("是邮箱");
		}else{
			System.out.println("不是邮箱");
		}
	}
}









