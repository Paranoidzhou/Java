package String;
//给图片批量改名
public class SplitDemo02 {
	public static void main(String[] args) {
		String image = "abc.jpg";
		String [] names = image.split("\\.");			
		//System.out.println(names.length);				
		//System.out.println(names[1]);
		image = System.currentTimeMillis()+".jpg";  //改名为  系统当前时间.jpg
		System.out.println(image);						  //输出图片名字
		
	}
}
