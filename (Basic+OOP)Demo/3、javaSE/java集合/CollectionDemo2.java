package collection;

import java.util.ArrayList;
import java.util.Collection;

/**
 * boolean contains(Object e)
 * 判断当前集合是否包含给定元素
 * 
 * @author adminitartor
 *
 */
public class CollectionDemo2 {
	public static void main(String[] args) {
		Collection c = new ArrayList();
		c.add(new Point(1,2));
		c.add(new Point(3,4));
		c.add(new Point(5,6));
		c.add(new Point(7,8));
		System.out.println(c);
		Point p = new Point(1,2);
		/*
		 * 集合会将给定元素与集合元素顺序进行
		 * equals比较,若有比较为true的则认为
		 * 集合包含该元素.
		 */
		boolean contains = c.contains(p);
		System.out.println("是否包含:"+contains);
	}
}









