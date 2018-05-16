package lambda;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

/*
 *    集合,Map支持了一个新方法foreach,可以使用lambda遍历.若集合Map是线程安全的,
 * 那么该方法也是并发安全的(可以和添加，删除等操作互斥)
 */
public class LambdaDemo3 {
	public static void main(String[] args) {
		List<String>list = new ArrayList<String>();
		list.add("one");
		list.add("two");
		list.add("four");
		list.add("five");
		list.add("five");
		for (String s : list) {
			System.out.println(s);
		}
		/*
		 * 由于使用集合自身方法遍历，若集合是线程安全的，那么遍历是可以和增删元素互斥的。
		 */
		
		
		list.forEach((s) ->System.out.println(s));
		
		
		
		
		Map<String,Integer>map = new HashMap<String,Integer>();
		map.put("语文",99);
		map.put("数学",98);
		map.put("英语",97);
		Set<Entry<String,Integer>>entrySet=map.entrySet();
		for (Entry<String, Integer> e : entrySet) {
			String k = e.getKey();
			Integer v = e.getValue();
			System.out.println(k+":"+v);
		}
		
		map.forEach((k,v)->System.out.println(k+"："+v));
	}
}
