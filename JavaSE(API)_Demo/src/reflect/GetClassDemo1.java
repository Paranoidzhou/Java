package reflect;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;


public class GetClassDemo1 {
	public static void main(String[] args) {

		test("abc");  //String
		test(666);    //Integer
		test('f');	  //Charter
		test(9.99);	  //Double

		/* 检查迭代器接口的具体实现类型 $表示为内部的 */
		List list1 = new ArrayList();
		Iterator itor = list1.iterator();
		Class  cls = itor.getClass();
		System.out.println("List具体实现的类型："+cls);

		List list2 = new LinkedList();
		itor =list2.iterator();
		cls = itor.getClass();
		System.out.println("LinkedList具体实现的类型："+cls);

		Set set = new LinkedHashSet();
		itor = set.iterator();
		cls = itor.getClass();
		System.out.println("LinkedHashSet具体实现的类型："+cls);

	}
	public static  void  test(Object obj) {
		/*动态获取Obj的类型*/
		Class cls = obj.getClass();
		System.out.println("动态获取引用的类型："+cls);

		/* 检查对象的类型中声明了哪些属性 */
		//Declared：声明的（定义的）
		/* Field：字段（在java中特指属性）
		 * Field 类型来自反射包Java.lang.reflect,代表一个类中声明的属性信息。
		 */
				Field [] fields = cls.getDeclaredFields();//这段代码表示：动态获取cls代表的类型中定义的属性  
				for (Field field : fields) {
					System.out.println("动态获取的属性："+field);
				}

		//Method：方法
		/* Method：来自reflect包，代表cls中表明方法信息*/
				Method [] methods = cls.getDeclaredMethods();
				for (Method method : methods) {
					System.out.println("动态获取的方法："+method);
				}

		/*获取类中声明的全部构造器信息*/
		// Constructtor : 构造器/构造方法
		Constructor [] constructtors = cls.getDeclaredConstructors();
		for (Constructor constructor : constructtors) {
			System.out.println("动态获取的构造器："+constructor);
		}
	}
}
