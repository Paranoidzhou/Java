package collection;

import java.util.ArrayList;
import java.util.Collection;

/*
 * 使用新循环遍历集合
 */
public class NewForDemo2 {
	public static void main(String[] args) {
		Collection c = new ArrayList();
		c.add("Aa");
		c.add("Bb");
		c.add("Cc");
		c.add("Dd");
		c.add("Ee");
		/*
		 * 新循环遍历集合等价于迭代器遍历集合，所以要注意遍历过程中不能通过集合方法增删元素。
		 * 所以说只是用它来遍历集合还是很好用的！！！
		 */
		for (Object o : c) {
			String str = (String)o;  //同理，我们知道它是String类型的，就可以强转
			System.out.println(o);
		}
	}
}
