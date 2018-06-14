.package map;

import java.util.Collection;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;


/*
 * Map的遍历：
 * Map由三种遍历方式：
 *  1：遍历所有的key.
 *  2：遍历所有的Key-Value对.
 *  3：遍历所有的value(不常用).
 */
class MapDemo3 {
	public static void main(String[] args) {
		 Map<String,Integer> map 
//				= new HashMap<String,Integer>(1000000);    //括号里可以传参也可以不传参，默认容量为16，建议预估所需要的容量以便于后来的使用且不扩容
	         = new LinkedHashMap<String,Integer>();    //在new HashMap的关键做一些改变（LinkedHashMap），会使得元素可以有序的遍历	
		map.put("语文", 150);
		map.put("数学", 140);
		map.put("英语", 130);
		map.put("物理", 120);
		map.put("化学", 110);
		System.out.println(map);
		/*
		 * 遍历所有的ket:
		 * Set keySet()
		 * 将当前Map中所有的key存入一个集合后返回遍历这个set集合等于遍历了所有的key.
		 */
		Set<String>keyset = map.keySet();  //获取所有的key存入Set集合中。
		for (String str : keyset) {		  //新循环遍历set集合内的元素
			System.out.println(str);		  //输出集合中的每一个元素
		}
		System.out.println("=================================");
		
		/*
		 * 遍历每一组键值对：
		 * 在Map接口中定义了一个内部接口：java.util.Map.Entry。
		 * Entry的每一个实例用于表示当前Map中的一组键值对，其提供了两个常用方法：
		 * k getKey():获取key值。
		 * V getValue():获取value值。
		 * 不同的Map实现类都实现了Entry,并用实现类的每个实例表示一个具体的键值对。
		 * 
		 * Set<Entry> entryset()
		 * 该方法会将Map中所有键值对存入一个集合后返回。
		 */
		Set<Entry<String,Integer>>entrySet = map.entrySet();
		for (Entry<String, Integer> e : entrySet) {
			String key = e.getKey();
			Integer value = e.getValue();
			System.out.println(key+"|"+value);
		}
		System.out.println("=================================");

		/*
		 * 遍历所有的value:
		 * Collection values()
		 * 将当前Map中所有的value以一个集合的形式返回。
		 */
		Collection<Integer> values = map.values();
		for (Integer value : values) {
			System.out.println(value);
		}
	}
}
