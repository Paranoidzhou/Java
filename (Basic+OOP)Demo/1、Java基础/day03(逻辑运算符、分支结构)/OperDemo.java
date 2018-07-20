package day03;
//运算符的演示
public class OperDemo {
	public static void main(String[] args) {
		/*
		 * 赋值、字符串连接、条件运算符的练习:
		 * 1)声明整型变量a并赋值为5
		 *     在a本身基础之上增10，输出a
		 *     在a本身基础之上乘2，输出a
		 *     在a本身基础之上除6，输出a
		 * 2)声明整型变量age并赋值为37
		 *     输出age=37
		 *     输出我今年37岁了
		 *   输出10+20+""+30
		 *   输出""+10+20+30
		 *   输出10+20+30+""
		 * 3)声明整型变量b和c，并分别赋值为8和5
		 *     声明整型变量max并赋值为b和c中的最大值
		 *     输出max=?(最大值)
		 */
		/*
		 * 6.条件/三目运算:
		 *   1)语法:
		 *       boolean?数1:数2
		 *   2)执行过程:
		 *       计算boolean的值:
		 *         若为true，则整个的结果为数1
		 *         若为false，则整个的结果为数2
		 *       
		 */
		/*
		int a=8,b=55;
		int max = a>b?a:b; //求a和b的最大值
		System.out.println("max="+max);
		*/	
		/*
		int a=-5;
		int b = a>2?1:-1;
		System.out.println(b);
		*/
		
		/*
		 * 5.字符串连接运算符:+
		 *   1)若两边都是数字，则做加法运算
		 *   2)若两边出现了字符串，则做字符串连接
		 */
		/*
		int age = 37;
		System.out.println("age="); //age=
		System.out.println(age);    //37
		System.out.println("age="+age); //age=37
		System.out.println("我的年龄是:"+age);
		System.out.println("我今年"+age+"岁了");
		
		System.out.println(10+20+""+30); //"3030"
		System.out.println(""+10+20+30); //"102030"
		System.out.println(10+20+30+""); //"60"
		*/
		
		/*
		 * 4.赋值运算符:
		 *   1)简单赋值运算:=
		 *   2)扩展赋值运算:+=,-=,*=,/=,%=
		 */
		/*
		int a = 5;
		a += 10; //相当于a=a+10
		System.out.println(a); //15
		a *= 2; //相当于a=a*2
		System.out.println(a); //30
		a /= 6; //相当于a=a/6
		System.out.println(a); //5
		*/
		
		
		
		
		
		
		
		
		
		
		
		/*
		 * 练习逻辑运算符&&、||、!，要求:
		 * 1)&&(4组)、||(4组)、!(2组)
		 *   4组:true+false,false+true
		 *       true+true,false+false
		 *   2组:true,false
		 * 2)关系运算的那6个符号必须都用上
		 * 3)练习&&和||的短路
		 */
		/*
		int a=5,b=10,c=5;
		System.out.println(b<=c && a<b);
		System.out.println(b>=a || b<c);
		System.out.println(!(a>b));
		
		boolean b4 = a<b || c++>2;
		System.out.println(b4); //true
		System.out.println(c); //5，发生短路了
		*/
		/*
		 * 3.逻辑运算符:
		 *   1)&&:短路与(并且)，两边都为真则为真，见false则false
		 *        当第1个数为false时，发生短路(后面的不执行了)
		 *     ||:短路或(或者)，有一边为真则为真，见true则true
		 *        当第1个数为true时，发生短路(后面的不执行了)
		 *      !:逻辑非(取反)，非真则假，非假则真
		 *   2)逻辑运算是建立在关系运算的基础之上的
		 *     逻辑运算的结果也是boolean型
		 */
		/*
		int a=5,b=10,c=5;
		boolean b4 = a<b || c++>2;
		System.out.println(b4); //true
		System.out.println(c);  //5，发生短路了
		*/
		/*
		boolean b3 = a>b && c++>2;
		System.out.println(b3); //false
		System.out.println(c);  //5，发生短路了
		*/
		
		/*
		boolean b2 = !(a<b);
		System.out.println(b2); //!true=false
		System.out.println(!(a>b)); //!false=true
		*/
		/*
		System.out.println(b>=a || b<c); //true||false=true
		System.out.println(b<=c || a<b); //false||true=true
		System.out.println(a!=b || c<b); //true||true=true
		System.out.println(a==b || c>b); //false||false=false
		*/
		/*
		boolean b1 = b>=a && b<c;
		System.out.println(b1);          //true&&false=false
		System.out.println(b<=c && a<b); //false&&true=false
		System.out.println(a==b && c>b); //false&&false=false
		System.out.println(a!=b && c<b); //true&&true=true
		*/
		
		/*
		 * 2.关系运算符:
		 *   1)>(大于),<(小于)
		 *     >=(大于或等于),<=(小于或等于)
		 *     ==(等于),!=(不等于)
		 *   2)关系运算的结果为boolean型，
		 *     关系成立则为true，关系不成立则为false
		 */
		/*
		int a=5,b=10,c=5;
		boolean b1 = a>b;
		System.out.println(b1);   //false
		System.out.println(c<b);  //true
		System.out.println(a>=c); //true
		System.out.println(a<=b); //true
		System.out.println(a==c); //true
		System.out.println(a!=c); //false
		System.out.println(a%2==0); //false
		*/
		
		
		/*
		 * 算术运算符的练习:
		 * 1)输出5%3，输出9%3，输出3%5
		 * 2)声明整型变量a并赋值为5，a++，输出a
		 *   声明整型变量b并赋值为5，++b，输出b
		 * 3)声明整型变量c并赋值为5
		 *     声明整型变量d并赋值为c++，输出c，输出d
		 *   声明整型变量e并赋值为5
		 *     声明整型变量f并赋值为++e，输出e，输出f
		 * 4)声明整型变量g和h，并分别赋值为5
		 *     输出g--，输出g
		 *     输出--h，输出h
		 */

		/*
		 * 1.算术运算符:+,-,*,/,%,++,--
		 *   1)%:取模/取余，余数为0即为整除
		 *   2)++/--:自增1/自减1，可在变量前也可在变量后
		 *     2.1)单独使用时，在前在后无差别
		 *     2.2)被使用时，在前在后有差别
		 *           a++的值为a
		 *           ++a的值为a+1
		 */
		/*
		int a=5,b=5;
		//1)输出a--的值5
		//2)a自减1变为4
		System.out.println(a--); //5
		System.out.println(a);   //4
		//1)输出--b的值4
		//2)b自减1变为4
		System.out.println(--b); //4
		System.out.println(b);   //4
		*/
		/*
		int a=5,b=5;
		int c=a++; //1)将a++的值5赋值给c  2)a自增1变为6
		int d=++b; //1)将++b的值6赋值给d  2)b自增1变为6
		System.out.println(a); //6
		System.out.println(b); //6
		System.out.println(c); //5
		System.out.println(d); //6
		*/
		/*
		int a=5,b=5;
		a++; //相当于a=a+1
		++b; //相当于b=b+1
		System.out.println(a); //6
		System.out.println(b); //6
		*/
		
		/*
		System.out.println(5%2); //1，商2余1
		System.out.println(8%2); //0，商4余0--整除
		System.out.println(2%8); //2，商0余2
		*/
	}
}



















