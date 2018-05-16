package collection;
import java.util.ArrayList;
import java.util.Collection;
/*
 *集合框架
 *
 * java.util.Collection接口
 * Collection是所有集合的顶级接口，规定了所有集合都应当具备的方法。
 * 
 * Collection下面有两个常见的子接口：
 * java.util.List:可重复集，且有序。
 * java.util.Set:不可重复集，大部分实现类无序。
 * 元素是否重复依靠元素自身qeuals比较的结果而定。 
 */
public class CollectionDemo1 {
	public static void main(String[] args) {
		Collection c = new ArrayList();   //new一个实例对象
		
		/* boolean add (E e) 向当前集合中添加元素，成功添加则返回true */
		boolean a = c.add("666");
		System.out.println("元素是否添加成功："+a);
		
		c.add("one");						    //c.add()添加元素
		c.add("two");
		c.add("three");
		c.add("four");
		c.add("five");
		c.add("six");
		
		System.out.println("集合当前元素："+c);
		/*int size() 返回当前集合的元素个数*/
		int size = c.size();
		System.out.println("元素个数（size）:"+size);
		
		/*boolean isEmpty() 判断当前集合是否为空集*/
		boolean isEmpty = c.isEmpty();
		System.out.println("是否为空集(isEmpty)："+isEmpty);
		System.out.println("=============================");
		
		/*void clear() 清空集合 */
		c.clear();
		System.out.println("集合已清空！");
		System.out.println("集合当前元素："+c);		
		System.out.println("元素个数（size）:"+c.size());
		System.out.println("是否为空集(isEmpty)："+c.isEmpty());
	}
}

