package collection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/*
 *  数组转换为集合：
 *  通过集合的工具类Arrays的静态方法asList可以将一个数组转换为List集合。
 * 
 * 	注意点：不能增加元素（会导致扩容），不能删除元素（会导致缩容）。
 *  所以那就不能表示原数组了，这样的操作在数组转换的集合中是不支持的。
 */
public class ArrayToListDemo {
	public static void main(String[] args) {
		String [] array = {"One","Two","Three","Four","Five",};
		
		List<String>list1 =Arrays.asList(array);     //将数组转换为集合
		
		System.out.println("size:"+list1.size());    //获取长度
		
		for (String str : list1) {
			System.out.println(str);
		}
		System.out.println("====================================");
		
		/*对集合元素操作就是对数组元素操作。*/
		list1.set(0, "一");
		System.out.println("List集合："+list1);
		System.out.println("array数组："+Arrays.toString(array));
		System.out.println("====================================");
		
		//  list.add("Six");     由于添加元素会导致数组扩容>>>  
		//  list.remove(0);      删除元素会导致元素缩容>>>>>>>
		//                               那就不能表示原数组了，所以这样的操作在数组转换的集合中是不支持的。
		
		/*若想对集合增删元素，需要复制一个集合*/
		List <String>list2 = new ArrayList(list1);  //创建一个新集合并写入原集合全部元素
		System.out.println("list2:"+list2);
		list2.add("Six");
		list2.remove(0);
		System.out.println("list2增删过后："+list2);  //对新写的集合不会影响原集合的元素
		
	}
}
