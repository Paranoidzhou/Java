package String;
public class StringDemo03 {

	public static void main(String[] args) {
		/*
		 * 经典面试题目
		 */
		String str = new String("ABC");
		//如上代码执行期间创建了几个字符串对象
		//A. 1   B.2   C.3   D.4
		//答案: B
		
		/*
		 * 经典面试题目
		 * 解析：字符串字面量之间的直接拼接，在编译期会进行优化，
		 * String s1 = new String("A"+"BC");
		 * 在.class字节码文件中，s1引用指向的是"ABC";
		 */
		String s1 = new String("A"+"BC");
		//如上代码执行期间创建了几个字符串对象
		//A. 1   B.2   C.3   D.4
		//答案: B
		
	}

}



