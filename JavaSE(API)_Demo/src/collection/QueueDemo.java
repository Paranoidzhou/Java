package collection;

import java.util.LinkedList;
import java.util.Queue;

/*
 *  队列：
 *  队列可以保存一组元素，但是存取元素必须遵循：先进先出。
 *  
 * java.util.Queue接口 : 规定了队列相关存取元素等操作.
 * Queue继承自java.util.Colletion，所以集合的相关方法它也具备.比如size、clear等。
 *  常用实现类：java.util.LinkedList
 *  
 *  当队列使用调offer(),当集合使用调add().
 */
public class QueueDemo {
	public static void main(String[] args) {
		Queue<String> queue = new LinkedList<String>();
		queue.offer("one");
		queue.offer("two");
		queue.offer("three");
		queue.offer("four");
		queue.offer("five");
		System.out.println(queue);
		System.out.println("=======================");
		
		//出对操作
		String str = queue.poll();
		System.out.println(str);
		System.out.println(queue);
		System.out.println("=======================");
		
		//引用队首元素，不做出队操作。
		str = queue.peek();
		System.out.println(str);
		System.out.println(queue);
		System.out.println("=======================");
		
		//用迭代器遍历不会取出队列元素，非一次性遍历。
		for (String s : queue) {
			System.out.println(s);
		}
		System.out.println("=======================");
		
		//用for循环以及whlie循环都是一次性遍历。
//		while(queue.size()>0){
//			str = queue.poll();
//			System.out.println(str);
//		}
//		System.out.println(queue);
		
//		for(int i = queue.size();i>0;i--) {
//			str = queue.poll();
//			System.out.println(str);
//		}
//		System.out.println(queue);
	}
}
