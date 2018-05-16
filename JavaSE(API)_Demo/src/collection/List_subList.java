package collection;

import java.util.ArrayList;
import java.util.List;

/*
 *   List subList(int s , int e)
 *    截取指定范围内的子集【含头不含尾，下标从0开始】
 */
public class List_subList {
	public static void main(String[] args) {
		List<Integer> list = new ArrayList<Integer>();
		for (int i = 0; i < 10; i++) {
			list.add(i);
		}
		System.out.println("List:"+list);
		
		List <Integer> subList = list.subList(3,8);
		System.out.println("List子集："+subList);
		
		//将子集元素扩大10倍
		for (int i = 0; i < subList.size(); i++) {
//			int d = subList.get(i);
//			d = d*10;      此两句可省略成下面括号后边的精简代码。
			subList.set(i, subList.get(i)*10);
		}
		System.out.println("List子集增10倍："+subList);
		
		/*对子集元素操作就是对原集合对应元素的操作。*/
		System.out.println("List集合元素："+list);
		
		//删除List集合2-8
		list.subList(2, 9).clear();
		list.remove(0);
		System.out.println("List集合元素："+list);
	}
}
