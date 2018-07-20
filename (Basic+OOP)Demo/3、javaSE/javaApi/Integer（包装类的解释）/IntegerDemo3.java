package integer;
/**
 * 包装类都提供了一个静态方法:parseXX(String str)
 * 可以将字符串解析为对应的基本类型数据,但是前提是
 * 该字符串描述的数据能被基本类型正确表示.
 * @author adminitartor
 *
 */
public class IntegerDemo3 {
	public static void main(String[] args) {
		String str = "123";
		
		int d = Integer.parseInt(str);
		System.out.println(d);//123
		
		double dou = Double.parseDouble(str);
		System.out.println(dou);//123.0
	}
}








