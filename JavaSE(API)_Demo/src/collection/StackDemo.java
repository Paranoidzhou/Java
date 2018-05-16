package collection;

import java.util.Deque;
import java.util.LinkedList;

/*
 * 栈：
 * 栈可以存储一组元素，但是存取元素必须遵循：先进后出原则.
 * 栈可以通过双端队列Deque实现。
 * 通常栈用于完成“后退”这样的操作。
 * 
 */
public class StackDemo {
	public static void main(String[] args) {
		Deque<String>stack = new LinkedList<String>();
		stack.push("one");
		stack.push("two");
		stack.push("three");
		stack.push("four");
		stack.push("five");
		System.out.println(stack);   //[five,four,three,two,one]
		 
		String str = stack.pop();    //出队操作pop()
		System.out.println(str);     //five
		System.out.println(stack);   //[four,three,two,one]
	}
}
