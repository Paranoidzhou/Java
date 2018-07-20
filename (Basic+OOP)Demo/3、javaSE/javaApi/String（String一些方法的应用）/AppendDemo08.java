package string;

public class AppendDemo08 {

	public static void main(String[] args) {
		StringBuilder buf=
			new StringBuilder();
		System.out.println(buf.capacity());//16
		buf.append("范传奇");
		System.out.println(buf.length());//3
		System.out.println(buf.capacity());//16
		buf.append("早晨出门以后");
		buf.append("干了件惊天动地");
		System.out.println(buf.length());//16
		buf.append("大事情");
		System.out.println(buf.capacity());//34
		//函数编程风格
		buf.append("大事情").append("呵呵")
			.insert(0, "据传说")
			.delete(15, 15+4)
			.replace(4, 4+2, "老师")
			.reverse();
		System.out.println(buf);
	}
}





