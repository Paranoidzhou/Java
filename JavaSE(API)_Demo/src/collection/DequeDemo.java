package collection;

import java.util.Deque;
import java.util.LinkedList;

/*
 *  双端队列：
 * java.util.Deque接口，它继承自java.util.Queue.
 *  双端队列的特点是两端都可以进出队。
 * 
 */
public class DequeDemo {
	public static void main(String[] args) {
		Deque <String> dq  = new LinkedList<String>(); 
		dq.offer("one");
		dq.offer("two");
		dq.offer("three");
		System.out.println(dq);  //[one, two, three]
		
		//队首方向入队：
		dq.offerFirst("four");
		System.out.println(dq);  //[four, one, two, three]
		
		//队尾方向入队：
		dq.offerLast("five");
		System.out.println(dq);  //[four, one, two, three, five]
		
		//引用元素:
		String str =dq.poll();
		System.out.println(str); //four
		System.out.println(dq);  //[one,two,three,five]
		
		str = dq.pollFirst();    //队首poll取元素
		System.out.println(str); //one
		System.out.println(dq);  //[two,three,five]
		
		str = dq.pollLast();     //队尾取元素
		System.out.println(str); //five
		System.out.println(dq);  //[two,three]
		/*peek()方法与以上两个First,last同理*/
	}
}
