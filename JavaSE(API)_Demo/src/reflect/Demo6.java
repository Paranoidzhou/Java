package reflect;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/*
 * 检查迭代器具体实现的类型，以及应用的具体对象的类型
 */
public class Demo6 {
	public static void main(String[] args) {
//		List list = new ArrayList();
//		Iterator iterator = list.iterator();
//
//		Class cls = iterator.getClass();
//		System.out.println(cls);  //class java.util.ArrayList$Itr
		
		classtext(666);
		classtext(6.66);
		classtext("666");
		classtext('6');
	}
	public static void classtext(Object obj) {
		Class cls = obj.getClass();
		System.out.println("对象引用的类型："+cls);
		
		
	}
}
