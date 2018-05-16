package collection;

import java.util.ArrayList;
import java.util.List;

/*
 *  List提供了一对重载的add,remove方法。
 */
public class List_add_remove {
	public static void main(String[] args) {
		List<String> list = new ArrayList<String>();
		list.add("one");
		list.add("two");
		list.add("three");
		list.add("four");
		System.out.println(list);
		
		list.add(1, "2");
		System.out.println(list);
		
		
		/*E remove(int index)：删除并返回给定位置*/
		String old = list.remove(2);   //删除元素下标为2的元素（可以接收返回值，看实际需求，如果不要可以不接收）
		System.out.println(list);
		System.out.println("old:"+old); //输出被删除的元素
	}
}
