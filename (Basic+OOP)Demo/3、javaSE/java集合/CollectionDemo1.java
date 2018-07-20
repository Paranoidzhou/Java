package collection;

import java.util.ArrayList;
import java.util.Collection;

/**
 * 集合框架
 * 
 * java.util.Collection接口
 * Collection是所有集合的顶级接口,规定了所有集合
 * 都应当具备的方法.
 * 
 * Collection下面有两个常见的子接口:
 * java.util.List:可重复集,且有序.
 * java.util.Set:不可重复集,大部分实现类无序.
 * 元素是否重复依靠元素自身equals比较的结果而定.
 * 
 * 
 * @author adminitartor
 *
 */
public class CollectionDemo1 {
	public static void main(String[] args) {
		Collection c = new ArrayList();	
		/*
		 * boolean add(E e)
		 * 向当前集合中添加元素,成功添加则返回true
		 */
		c.add("one");
		c.add("two");
		c.add("three");
		c.add("four");
		c.add("five");
		System.out.println(c);
		/*
		 * int size()
		 * 返回当前集合的元素个数
		 */
		int size = c.size();
		System.out.println("size:"+size);
		/*
		 * boolean isEmpty()
		 * 判断当前集合是否为空集
		 * 当集合中不含有任何元素时返回true
		 */
		boolean isEmpty = c.isEmpty();
		System.out.println("isEmpty:"+isEmpty);
		/*
		 * void clear()
		 * 清空集合元素
		 */
		c.clear();
		System.out.println("集合已清空");
		System.out.println(c);
		System.out.println("size:"+c.size());
		System.out.println("isEmpty:"+c.isEmpty());
		
	}
}










