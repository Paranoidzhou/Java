 package collection;

import java.util.List;
import java.util.ArrayList;

/*
 *  java.tuil.List 线性表
 *  List的特点：可重复集，并且有序。可以通过下标操作元素
 *   常用实现类：
 *  ArrayList:内部由数组实现，查询快，增删慢。
 *  LinkedList:内部由链表实现，查询慢，增删块（首位增删效率最优）。
 *   对于性能不是极端苛刻情况下，通常使用ArrayList。
 */
public class List_get_set {
	public static void main(String[] args) {
		List <String> list = new ArrayList<String>();
		list.add("ABC");
		list.add("DEF");
		list.add("GHI");
		list.add("JKL");
		System.out.println(list);
		
		/*E get(int index)：获取指定位置对应的元素*/
		//等同于数组   String str = arr[1];
		String str = list.get(1);
		System.out.println(str);
		System.out.println("====================");
		
		for(int i=0 ; i<list.size();i++) {
			str = list.get(i);
			System.out.println(str);
		}
		System.out.println("====================");
		
		/*E set(int index)：将指定元素设置到指定位置，返回值为原位置对应的元素，所以是替换元素操作*/
		String old = list.set(1, "def");
		System.out.println(list);
		System.out.println("old："+old);
	}
}
