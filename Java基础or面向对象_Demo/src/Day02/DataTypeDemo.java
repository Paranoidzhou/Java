package Day02;

public class DataTypeDemo {

	public static void main(String[] args) {
		int a = 5;
		long b = a;
		int c = (int)b;
		System.out.println(c);
		long d = 10000000000L;
		int e = (int)d;
		System.out.println(e);
		double f = 56.987;
		int g = (int)f;
		System.out.println(g);
		short s1 = 5;
		short s2 = 6;
		short s3 = (short) (s1 + s2);
		
		/*
		  boolean b1 = true;
		  boolean b2 = false;
		  //boolean b3 = 250;
		  
		  char c1 = '男';
		  System.out.println(c1);
		  char c2 = 'm';
		  System.out.println(c2);
		  char c3 = '5';
		  System.out.println(c3);
		  char c4 = ' ';
		  System.out.println(c4);
		  //char c5 = '';
		  //char c6 = '你好';
		  char c7 = 97;
		  System.out.println(c7);
		  char c8 = '\'';
	     System.out.println(c8);
		   */
		

		/*
		//题一：
		int a = 37;
		//int b = 10000000000;    //编译错误，直接量超出int整型范围
		System.out.println(5/3);  //1  整数运算，答案舍弃小数 
		System.out.println(3/5);  //0  整数运算，答案舍弃小数
		System.out.println(3.0/5);//0.6
		int c = 2147483647;
		c = c+1;                  
		System.out.println(c);    //-2147483648
		//题二：
		//long d = 10000000000;    //
		long e = 1000000000*2*10L;
		System.out.println(e);    //20000000000
		long f = 1000000000*3*10L;
		System.out.println(f);    //-12949672960
		long g = 1000000000L*3*10;
		System.out.println(g);    //30000000000
		long h = System.currentTimeMillis();
		System.out.println(h);   
		
		//题三：
		double i = 3.14;
		double j = 6.0;
		double k = 4.9;
		System.out.println(j-k);  //1.0999999999999996
		double p = 10.0;
		double o = 9.9;
		System.out.println(p-o);  //0.09999999999999964
		double m = 3.0;
		double n = 2.9;
		System.out.println(m-n);  //0.10000000000000009
		*/


	}
}
