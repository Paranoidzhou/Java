package collection;

import java.util.ArrayList;
import java.util.Collection;

/**
 * 使用新循环遍历集合
 * @author adminitartor
 *
 */
public class NewForDemo2 {
	public static void main(String[] args) {
		Collection c = new ArrayList();
		c.add("one");
		c.add("two");
		c.add("three");
		c.add("four");
		c.add("five");
		/*
		 * 新循环遍历集合就是迭代器遍历集合,所以
		 * 注意,遍历过程中不能通过集合方法增删元素
		 */
		for(Object o : c){
			String str = (String)o;
			System.out.println(str);
		}
	}
}






