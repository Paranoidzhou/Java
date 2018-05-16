package collection;

import java.util.ArrayList;
import java.util.Collection;

/*
 *  集合转换为数组
 * Collection提供了一个方法：toArray,可以将当前集合转换为一个数组。
 */
public class CollectionToArrayDemo {
	public static void main(String[] args) {
		 Collection <String> c = new ArrayList<String>();
		 c.add("one");
		 c.add("two");
		 c.add("three");
		 c.add("four");
		 c.add("five");
		 System.out.println(c);
		 System.out.println("===============");
		 
		 String [] arr = c.toArray(new String [c.size()]);
//		 String [] arr = c.toArray(new String [1]);	
//		 此项与上面效果一样，只不过由点浪费，因为它会看你括号里面的能不能用，不能用就new一个出来。
//		 String [] arr = c.toArray();               
//		 此项不写会报错，因为编译器不知道你要new什么才能对应，如果数组长度比与集合长，没存的值为null。      
		 for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
	}
}
