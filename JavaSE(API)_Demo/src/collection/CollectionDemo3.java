package collection;

import java.util.ArrayList;
import java.util.Collection;

/*
 * 删除集合元素
 */
public class CollectionDemo3 {
	public static void main(String[] args) {
		Collection c = new ArrayList();
		c.add(new Point(1,2));
		c.add(new Point(3,4));
		c.add(new Point(5,6));
		c.add(new Point(7,8));
		c.add(new Point(9,10));
		System.out.println(c);
		Point p = new Point(1,2);
		/*
		 * boolean remove(Object o)
		 * 删除给定元素：
		 *     集合删除元素是根据给定元素与集合元素顺取equals比较，删除为true的、对于
		 *List集合而言，若存在多个，则只删除一个。 
		 * 
		 */
		c.remove(p);
		System.out.println(c);
	}
}
