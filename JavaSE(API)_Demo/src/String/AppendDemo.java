package String;
/*
 *  将字符串进行拼接
 */
public class AppendDemo {
	public static void main(String[] args) {
		StringBuilder builder = new StringBuilder();  //实例化StringBuilder对象
		builder.append("流星雨");								 //调用append()方法写入字符串
		System.out.println(builder.length());		 //输出字符串长度
		System.out.println(builder.capacity());		 //输出容量
		builder.append("一天不吃饭，然后");					 //多次调用append()方法会拼接上次写入的字符串
		builder.append("我们一起去");
		System.out.println(builder.length());		 //输出字符串长度
		System.out.println(builder.capacity());		 //输出容量
		builder.append("撮一顿自助餐可好？");
		System.out.println(builder.length());
		System.out.println(builder.capacity());	
		System.out.println(builder);
		//以下为函数编程风格：
		builder.append("以下是StringBuilder其他方法：")
		.replace(0, 3, "刘宇星"                   )//replace(int start,int end ,Stringstr) 替换字符串方法
//                                                        将开始位置到结束位置的字符串替换你想要的字符串。
		.insert(3, "星期天")                  //insert()为指定位置插入方法，左边int类型为下标位置，右边为要替换的字符串
		.delete(10, 10+6)							 //delete(int start,int end)为指定位置删除的方法
		;             
		//.reverse();    将字符串反转过来。           
		System.out.println(builder);
	}
}
