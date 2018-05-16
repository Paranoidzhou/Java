package integer;
/*
 *      包装类都提供了一个静态方法：parseXX(String str),可以将字符串 解析为对应
 * 的基本类型数据，但是前提是该字符串描述的数据能被基本类型正确表示。   
 * (double能存整数以及小数，int无法存小数，会报错)
 */
public class IntegerDemo3 {
	public static void main(String[] args) {
		String str = "123";
		int i = Integer.parseInt(str);
		System.out.println(i);           //输出：123
		//System.out.println(d+1);       //输出：124
		
		double dou = Double.parseDouble(str);
		System.out.println(dou);         //输出：123.0
		
		System.out.println("===========");
		String stru = "123.123";
		int a = Integer.parseInt(stru);	
		System.out.println(a);				//输出报错java.lang.NumberFormatException

		double b = Double.parseDouble(stru);
		System.out.println(b);			   
	}
}
