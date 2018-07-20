package collection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

/**
 * 遍历集合元素
 * Collection提供了统一的遍历集合元素的方式:
 * 迭代器模式
 * 
 * Iterator iterator()
 * 该方法可以获取一个用于遍历当前集合元素的迭代器
 * 实现类.
 * 不同的集合实现类都提供了一个可以用于遍历自身的
 * 迭代器.我们无需记住每种迭代器实现类的名字,只需
 * 要以Iterator接口接收并调用迭代方法遍历即可.
 * 
 * 迭代器遍历集合遵循:问,取,删的遍历过程
 * 其中删除元素不是必须操作.
 * 
 * @author adminitartor
 *
 */
public class CollectionDemo6 {
	public static void main(String[] args) {
		Collection c = new ArrayList();
		c.add("one");
		c.add("#");
		c.add("two");
		c.add("#");
		c.add("three");
		c.add("#");
		c.add("four");
		c.add("#");
		c.add("five");
		System.out.println(c);
		
		Iterator it = c.iterator();
		/*
		 * boolean hasNext()
		 * 判断集合是否还有元素可以遍历
		 * 
		 * E next()
		 * 取出集合中下一个元素
		 */
		while(it.hasNext()){
			String str = (String)it.next();
			if("#".equals(str)){
				/*
				 * 迭代器要求在遍历的过程中不允许
				 * 通过集合的方法增删元素,否则会
				 * 抛出异常.删除元素可以通过迭代器
				 * 提供的remove方法删除,删除的是
				 * 本次通过next方法迭代的元素
				 */
//				c.remove(str);
				it.remove();
			}
			System.out.println(str);
		}
		System.out.println(c);
	}
}









