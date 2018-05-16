package date;

import java.util.Calendar;

/*
 * 设置指定时间分量所对应的值.
 * void set(int field,int value)
 */
public class Calendar_set {
	public static void main(String[] args) {
		//  修改为 2008-08-08
		
		Calendar calendar = Calendar.getInstance();
		System.out.println(calendar.getTime());  //当前时间
		
		calendar.set(calendar.YEAR,2008);  //修改年
		System.out.println(calendar.getTime());
		
		calendar.set(calendar.MONTH,calendar.AUGUST);  //修改月   每个月份的单词都代表着一个常量
		System.out.println(calendar.getTime());
		
		calendar.set(calendar.DATE,8); //修改日
		System.out.println(calendar.getTime());
		
		//修改为 2025-1-1  15:00:00
		calendar.set(2025, 1, 1, 18, 00, 00);  //calendar的set重载方法，全部修改
		System.out.println(calendar.getTime());
		
		calendar.set(calendar.HOUR_OF_DAY,8);  //修改时
		calendar.set(calendar.MINUTE,8);			//修改分
		calendar.set(calendar.SECOND,8);       //修改秒
		
		
	}
}
