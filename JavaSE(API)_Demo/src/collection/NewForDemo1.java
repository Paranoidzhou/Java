package collection;
/*
 * JDK1.5之后退出了一个新的特性：
 * 增强型for循环，也称为：新循环, for each
 * 
 * 新循环并不取代传统for循环的工作，它只用来遍历集合或数组使用。
 */
public class NewForDemo1 {
	public static void main(String[] args) {
		String [] array = {"Aa","Bb","Cc","Dd","Ee",};
		for (int i = 0; i < array.length; i++) {
			 String str = array[i];
			 System.out.println(str);
		}
		System.out.println("==================");
		
/**  左边定义接收值（Str）: 需要遍历的数组(array)  */
		for(String str : array) {  //此处相当于for循环的前两个步骤合二为一
			/*
			 * 新循环是编译器认可，编译器会在编译源代码时该为使用传统for循环遍历数组。 
			 */
			System.out.println(str);
		}
	}
}
