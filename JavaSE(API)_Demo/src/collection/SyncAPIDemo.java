package collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/*
 *    线程安全的集合：
 *    常用的集合实现类：ArrayList,LinkedList,HashSet它们都不是线程安全的，多线程
 * 情况下使用会出现并发安全问题。
 * 
 *   Collections提供了将集合转换为线程安全的方法。  
 */
public class SyncAPIDemo {
	public static void main(String[] args) {
		List<String>list = new ArrayList<String>();	
		list.add("One");
		list.add("Two");
		list.add("Three");
		list.add("Four");
		System.out.println("非线程安全List有序集合："+list);
		
		list = Collections.synchronizedList(list);
		System.out.println("线程安全List有序集合："+list);
		
		Set<String>set = new HashSet<String>(list);
		System.out.println("非线程安全Set无序集合："+set);
		
		set = Collections.synchronizedSet(set);
		System.out.println("线程安全Set无序集合："+set);
		
		/*
		 *   API手册中有说明，就算是一个线程安全的集合也不和迭代器遍历做互斥，所以若并发 
		 * 操作时存在有遍历操作时要自行维护它们只见的互斥关系。
		 */
	}
}
