package String;
/*
 *  	 String提供了支持正则表达式的方法1:
 *
 * 	 boolean matches(String regex)
 *  	 使用给定的正则表达式无论是否添加边界符（^ $）都是做全匹配验证的
 *  
 */
public class MatchesDemo {
	public static void main(String[] args) {
		String mail = "51job@zk.com";
		/*
		 *	邮箱的正则表达式： 
		 *	[a-zA-Z0-9_]+@[a-zA-Z0-9_]+(\.[a-z]+)+
		 */
		boolean yz = mail.matches("[a-zA-Z0-9_]+@[a-zA-Z0-9_]+(\\.[a-z]+)+");
		if(yz) {
			System.out.println("邮箱验证通过！");
		}else {
			System.out.println("邮箱格式错误！");
		}
		
	}
}
