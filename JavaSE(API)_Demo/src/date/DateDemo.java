package date;
/*
 *  java.util.Date
 *  Date的每一个实例用于表示一个具体的时间.内部维护一个long值，记录的是
 *自1970年1月1日 00：00：00到其表示的时间之间所经过的毫秒.
 *
 *  Date设计存在缺陷，所以大部分操作时间的方法都被声明为过时的，不再建议
 *使用.所以先在使用Date往往只用来表示一个时间点而已.
 */

import java.util.Date;

public class DateDemo {
	public static void main(String[] args) {
		
			Date date = new Date();
			System.out.println(date);	
			
			//获取Date内部维护的long值
			long time = date.getTime();
			System.out.println(time);
			
			time += 1000*60*60*24;
			date.setTime(time);
			System.out.println(date);
		
		
	}
}
