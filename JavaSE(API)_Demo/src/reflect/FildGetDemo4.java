package reflect;

import java.lang.reflect.Field;
import java.util.Scanner;

public class FildGetDemo4{
   public static void main(String[] args) throws Exception{
	   Scanner in = new Scanner(System.in);
	   System.out.println("请输入类名：");
	   String className = in.nextLine();
	   System.out.println("请输入属性名：");
	   String filedName = in.nextLine();
	   //加载类：
	   Class cls = Class.forName(className);

	   //查找类中的属性：-
	   //getDeclaredFields： 获取全部属性
	   //getDeclaredField (name)：获取指定名字的一个属性
	   Field fld = cls.getDeclaredField(filedName);
	   System.out.println(fld);

	   //动态创建对象, obj 一定包含指定属性值。
	   //Koo koo = new Koo();  这个创建对象与下面一样。都是创建对象，不过缺点就是写死了。
	   Object obj = cls.newInstance(); //这一行也是创建对象，但是与上面的区别是把创建对象写活了。
	   
	    //Access 访问  Accessible可以访问
	   fld.setAccessible(true);   //此行代码表示可以访问私有属性，  设置为true表示可以，反之false则不可以，默认为false
	   
	   Object value =fld.get(obj); //get的作用是在obj对象上获取fld属性的值，如果Obj上没有fld属性的值，则抛出异常	 
	   /*
	    * 属性名是用户运行期间输入的！输入哪个属性名，那么这段程序就会输出哪个属性的值！
	    * 也就意味着这段程序与属性之间是松耦合的关系
	    */
	   System.out.println(value);
	
    }
}


























