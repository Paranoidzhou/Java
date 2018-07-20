package collection;
/**
 * JDK1.5之后推出了一个新的特性
 * 增强型for循环,也称为:新循环,for each
 * 
 * 新循环并不取代传统for循环的工作,它只用来遍历
 * 集合或数组使用.
 * @author adminitartor
 *
 */
public class NewForDemo1 {
	public static void main(String[] args) {
		String[] array = {"one","two","three","four","five"};
		for(int i=0;i<array.length;i++){
			String str = array[i];
			System.out.println(str);
		}
		/*
		 * 新循环是编译器认可,编译器会在编译源代码
		 * 时改为使用传统for循环遍历数组.
		 */
		for(String str : array){
			System.out.println(str);
		}
	}
}









