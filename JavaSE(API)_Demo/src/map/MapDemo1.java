package map;

import java.util.HashMap;
import java.util.Map;

/*
 * java.util.Map接口：
 * Map称为查找表，该数据结构体现的样子是一个“多行两列”的表格。左列称为key、右列称为value.
 * Map总是根据key查找对应的value.
 * 存储元素也要求以key-value成对存入.
 * 
 * 常用的实现类：java.util.HashMap散列表(哈希表)
 * HashMap是基于散列算法实现的Map,当今世界上最快的查询结构.
 */
public class MapDemo1 {
	public static void main(String[] args) {
		Map<String,Integer> map = new HashMap<String,Integer>();
		/*
		 * V put(K k,V v)
		 * 将给定的key-value对存入到Map中
		 * 
		 * Map有一个要求，key不允许重复（Key的equals比较决定），若使用Map已有的key存入value、
		 * 则是替换value操作。那么put方法返回的就是被替换的value,若没有替换则返回值Null.
		 */
		Integer i = map.put("语文", 150);
		/*
		 * 对于value是包装类的情况，切记：不要直接用基本类型接收返回值，因为会触发自动拆箱特性：
		 * int n = map.put("语文",150);
		 * 下面的代码编译后会该为：
		 * int n = map.put("语文",150).intValue().
		 * 若Key在Map中不存在，则返回值为null,若拆箱则会引发空指针异常.
		 */
		map.put("数学", 140);
		map.put("英语", 130);
		map.put("物理", 120);
		map.put("化学", 110);
		System.out.println("Map:"+map);  //{物理=120, 数学=140, 化学=110, 语文=150, 英语=130}
      System.out.println("i："+i);		//i：null
      
		i =map.put("语文", 66);
		System.out.println("Map:"+map);	//{物理=120, 数学=140, 化学=110, 语文=66, 英语=130}
		System.out.println("i："+i);		//i：150
		
		System.out.println("(元素对数：)size:"+map.size()); //(元素对数：)size:5
		
		/*
		 *  V get(K k);
		 *  根据给定的Key获取对应的value,若给定的key不存在则返回值为null;	
		 */
		i = map.get("物理");  //查看物理成绩
		System.out.println("物理："+i);		//物理：120
		
		/*
		 * V remove(K k);
		 *  删除当前Map中给定的key所对应的这组键值对返回值为该key所对应的value.若给定
		 *  的key在Map中不存在，则返回值为null.
		 */
		i = map.remove("化学");
		System.out.println(i);
		System.out.println(map);
		
	}
}
