package string;
/**
 *  图片重命名
 * @author adminitartor
 *
 */
public class SplitDemo2 {
	public static void main(String[] args) {
		String image = "abc.jpg";
		String[] names = image.split("\\.");
//		System.out.println(names.length);
//		System.out.println(names[1]);
		
		image = System.currentTimeMillis()+"."+names[1];
		System.out.println(image);
	}
}





