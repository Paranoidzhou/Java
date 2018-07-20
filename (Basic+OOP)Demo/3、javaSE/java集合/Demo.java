package collection;

import java.util.ArrayList;
import java.util.Collection;

public class Demo {
	public static void main(String[] args) {
		int a = 1;
		String b = "abc";
		Point p = new Point(1,2);
		Collection c = new ArrayList();
		c.add(p);
		dosome(a,b,p,c);
		System.out.println("a:"+a);
		System.out.println("b:"+b);
		System.out.println("p:"+p);
		System.out.println("c:"+c);
	}
	public static void dosome(int a,String b,Point p,Collection c){
		a = a + 1;
		b = b + "!";
		p.setX(2);
		p = new Point(3,4);
		c.clear();
		c.add(p);
		c = new ArrayList();
		c.add(new Point(5,6));
	}
	
}



