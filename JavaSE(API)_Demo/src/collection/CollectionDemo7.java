package collection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

/*
 *	  JDK1.5之后推出的一个特性：泛型
 *    泛型也称为参数化类型，他可以用于指定一个类中的属性类型，方法参数的类型以及返回值类型等.
 * 这样做的好处是将类型的定义权交给了调用者，而不再是提供者决定，提高了灵活性。
 *    泛型在集合中广泛被使用，用于指定集合中的元素类型，若不指定泛型，则默认为原型Object.  
 */
public class CollectionDemo7 {
	public static void main(String[] args) {
        Collection<String> c = new ArrayList<String>();
//        编译后的class文件样子：
//        Collection c = new ArrayList();
        /*    当调用方法传入泛型约束的参数时，编译器会检查实际参数是否符合该参数指定的
         * 泛型类型，不符合编译不通过。
         *    由于当前集合泛型指定为String,那么调用add方法时编译器会检查实际参数是否
         * 为String，不符合就编译失败。   
         */
           c.add("ABC");
           c.add("EFG");
           c.add("666");
           //c.add(123);   //编译报错，因为指定了String类型，不再默认Object。
           System.out.println(c);
           System.out.println("================");
           
          /* 使用新循环遍历时，接收每个集合元素时也可以直接使用泛型的实际类型了。  */
           for(String s : c) {
        	   System.out.println(s);
              }
           System.out.println("================");
           
          /* 当获取一个泛型类型的值时，编译器会自动根据泛型指定的实际类型做向下造型操作。*/
          Iterator<String> it = c.iterator();
          while(it.hasNext()) {
        	  String str = it.next();
        	  System.out.println(str);
          }
          
//          编译后的样子:
//          Iterator it = c.iterator();
//          while(it.hasNext()) {
//        	  String str = (String) it.next();
//            }
	}
}
