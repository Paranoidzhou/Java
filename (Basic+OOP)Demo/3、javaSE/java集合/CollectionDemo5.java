package collection;

import java.util.ArrayList;
import java.util.Collection;

/**
 * 集合操作
 * @author adminitartor
 *
 */
public class CollectionDemo5 {
	public static void main(String[] args) {
		Collection c1 = new ArrayList();
		c1.add("java");
		c1.add("c#");
		c1.add("c++");
		System.out.println("c1:"+c1);
		
		Collection c2 = new ArrayList();
		c2.add("android");
		c2.add("ios");
		System.out.println("c2:"+c2);
		/*
		 * boolean addAll(Collection c)
		 * 将给定集合元素添加到当前集合中
		 */
		c1.addAll(c2);
		System.out.println("c1:"+c1);
		
		Collection c3 = new ArrayList();
		c3.add("android");
		c3.add("c++");
		c3.add("php");
		/**
		 * boolean removeAll(Collection c)
		 * 删除当前集合中与给定集合的公有元素
		 */
		c1.removeAll(c3);
		System.out.println("c1:"+c1);
		
	
	}
}





