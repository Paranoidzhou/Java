package lambda;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/*
 * 
 */
public class LambdaDemo2 {
	public static void main(String[] args) {
		List<String>list = new ArrayList<String>();
		list.add("你的名字");
		list.add("你");
		list.add("你的");
		list.add("你的名");
		
		//按照字符长短（多少）排序：
		Collections.sort(list,new Comparator<String>() {
			public int compare(String o1,String o2) {
				return o1.length()-o2.length();
			}
		});
		System.out.println(list);
		
		//使用lambda简化（懒人式）：
		//按字符从长到短排序：
		/*
		 * 参数无需指定类型（指定也可以），编译器会结合上下文判定参数类型.
		 * 若方法需要返回值，而方法只有一行代码时，在物略{}的同时，return
		 * 关键字也要忽略.
		 */
		Collections.sort(list,(s1,s2)->s2.length()-s1.length());
		System.out.println(list);
	}
}
