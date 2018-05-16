package integer;
/*      获取基本类型数组最大值和最小值
 *      数字类型的包装类都支持两个常量:
 *      MAX_VALUE   ,  MIN_VALUE
 * 		分别表示对应的基本类型的取值范围；
 * 
 */
public class IntegerDemo2 {
	public static void main(String[] args) {
		int max = Integer.MAX_VALUE;
		System.out.println(max);
		int min = Integer.MIN_VALUE;
		System.out.println(min);
		
		long lmix = Long.MAX_VALUE;
		System.out.println(lmix);
		long lmin = Long.MIN_VALUE;
		System.out.println(lmin);
		
		
	}
}
