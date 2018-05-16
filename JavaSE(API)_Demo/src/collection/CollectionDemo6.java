package collection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

/*
 * 遍历集合元素
 * Collection提供了同一的遍历集合元素的方式：
 * 
 * 迭代器模式：
 * Iterator iterator()
 * 该方法可以获取一个用于遍历当前集合元素的迭代器实现类。
 *    不同的集合实现类都提供了一个可以用于遍历自身的迭代器、我们无需记住每种
 * 迭代器实现类的名字，只需要一Iterator接口接收并调用迭代方法遍历即可。
 * 
 * 迭代器遍历结合遵循：问、取、删的遍历过程，其中删除元素不是必须操作。
 */
public class CollectionDemo6 {
	public static void main(String[] args) {
		Collection c = new ArrayList();
		c.add("one");
		c.add("#");
		c.add("two");
		c.add("#");
		c.add("three");
		c.add("#");
		c.add("four");
		c.add("#");
		c.add("five");
		System.out.println(c);//输出[one, #, two, #, three, #, four, #, five]
		System.out.println("=============================================");
		/*
		 *boolean hasNext() 
		 * 判断集合是否还有元素可以遍历
		 * 
		 * E next()
		 * 取出集合中下一个元素
		 */
		
		Iterator it = c.iterator();
		while(it.hasNext()) {            //【判断是否有元素，有就为true】
			/*
			 * 若有，就取出来！
			 * 因为返回值都是Object类型，所以要强转
			 * 重点提示：【因为此处我们知道是String类型，所以强转为String！！！】
			 * 【当集合有多种元素的时候，不知道强转什么类型，所以尽量把相同类型的放一个集合中】
			 */
		String str = (String)it.next();  
		/*
		 * 
		 * 
		 */
		if("#".equals(str)) {//判断得到的元素时不是 #
			//c.remove(str); //执行会抛出异常java.util.ConcurrentModificationException
			it.remove();     //用迭代器提供的删除不需要传参，拿到的这个是想要删除的就删除
		}
		System.out.println(str);
		
		}
		System.out.println("============================================");
		System.out.println(c);//输出[one, two, three, four, five]
	}
}
