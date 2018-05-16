package collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/*
 *  排序自定义类型元素的集合 
 */
public class Collections_sort2 {
	public static void main(String[] args) {
		List<Point> list = new ArrayList<Point>();  
		list.add(new Point(5,6));
		list.add(new Point(1,3));
		list.add(new Point(2,8));
		list.add(new Point(3,4));
		list.add(new Point(9,8));
		list.add(new Point(4,7));
		System.out.println(list);
		System.out.println("================================");
		/*
		 * sort方法要求集合元素必须实现Comparable接口。
		 * Collections的sort方法具有侵入性；
		 *     所谓侵入性，是指当我们使用某个功能时，该功能要求我们为其修改代码，修该的越多，侵入性
		 * 越强，一旦不需要该功能时，这些改动都没有意义了。这在实际开发中是很不推荐的。 
		 */
		Collections.sort(list);
		System.out.println(list);
	}
}
