package collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

/*
 *  排序集合：
 *  排序集合可以使用集合的工具类：
 * java.util.Collections
 *  其定义了很多静态方法，用于操作集合.其中sort方法是对List集合进行自然排序（从小到大）。
 *  
 *  请说明Collection与Collections的区别：
 *  Collection是集合的接口。
 *  Collections是集合的工具类。
 */
public class Collections_sort {
	public static void main(String[] args) {
	   List <Integer> list = new ArrayList<Integer>();
	    //先生成一个1-100的随机数集合，长度为10
	   Random random = new Random();
	   for (int i = 0; i < 10; i++) {
		list.add(random.nextInt(100));
	}
		System.out.println("排序前："+list);
		Collections.sort(list);
		System.out.println("排序后："+list);
	}
}
