package collection;

import java.util.ArrayList;
import java.util.Collection;

/*
 * Boolean contains(Object e)
 * 判断当前集合是否包含给定元素。
 */
public class CollectionDemo2 {
	public static void main(String[] args) {
		Collection c = new ArrayList();
		c.add(new Point(1,2));
		c.add(new Point(3,4));
		c.add(new Point(5,6));
		c.add(new Point(7,8));
		c.add(new Point(9,10));
		Point p = new Point(1,2);
		/*
		 *   集合会将给定元素与集合元素顺序进行equals比较，若
		 *有比较为true的则认为集合包含该元素。『前提是重写了equals』
		 */
		boolean contains = c.contains(p);
		System.out.println("是否包含："+contains);
	}
}
