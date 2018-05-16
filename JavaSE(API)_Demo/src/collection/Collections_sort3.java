package collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Collections_sort3 {
	public static void main(String[] args) {
		List<String> list = new ArrayList<String>();
		list.add("陈小春");
		list.add("十年");
		list.add("渣渣灰");
		list.add("传奇");
		list.add("古天乐");
		System.out.println(list);
		System.out.println("===========================");
		
		/*	
		 *     除了有侵入性之外，该sort方法还有一个问题就是若元素已经实现了Comparable接口
		 * 并定义了比较规则，但是该规则不满足我们实际排序需求时也没有办法，比如String,该类
		 * 也不允许我们从写它的方法。   
		 */
		//Collections.sort(list);
		/*
		 *    推荐的排序方式：
		 *    当遇到排序自定义类型元素，或者集合元素自身的比较规则不满足排序时都建议使用下面的方式排序。
		 *    该sort方法要求额外传入一个比较器，并按照比较器规则比较集合元素并进行排序.因此该排序方法
		 * 不要求集合元素实现Copmarable接口。  
		 */	
		Collections.sort(list, new Comparator<String>(){
			public int compare(String o1, String o2) {
				return o1.length() - o2.length();
			}
		});
		System.out.println(list);
	}
}
