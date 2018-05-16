package date;

import java.util.Calendar;

/*
 * Calendar提供了方法：
 * int ger(int field)
 * 根据给定的时间分量（各种时间单位）获取对应的值.
 * 
 * 时间分量是一个int值，无需记忆数字,Calendar提供了对应的常量.
 */
public class Calendar_get {
	public static void main(String[] args) {
		Calendar calendar = Calendar.getInstance();
		
		int year = calendar.get(calendar.YEAR);       //获取年
		System.out.println("今年是："+year+"年");
		
		int month = calendar.get(calendar.MONTH)+1;   //获取月【因为月份是0开始，获取当月需要在末尾加一】
		System.out.println("今月是："+year+"年"+month+"月");
		
		int day = calendar.get(calendar.DATE);       //获取日
//		int day = calendar.get(calendar.DAY_OF_MONTH); 效果同上
		System.out.println("今天是："+year+"年"+month+"月"+day+"日");
		
		int h = calendar.get(calendar.HOUR_OF_DAY);  //获取当前小时
		int m = calendar.get(calendar.MINUTE);       //获取当前分钟
		int s = calendar.get(calendar.SECOND);       //获取当前秒钟
		System.out.println(h+":"+m+":"+s);		
		
		int d = calendar.get(calendar.DAY_OF_YEAR); //获取今天是今年的第几天
		System.out.println("今天是今年的第："+d+"天");
		
		d = calendar.get(calendar.DAY_OF_WEEK)-1;   //因为是按照美国星期表，星期日为第一天，所以要减一
		String [] data = {"日","一","二","三","四","五","六",};
		System.out.println("今天是星期："+data[d]);
		
		d = calendar.getActualMaximum(calendar.DAY_OF_YEAR);  //获取本年多少天
		System.out.println("今年共："+d+"天");
		
		d = calendar.getActualMaximum(calendar.DAY_OF_MONTH);   //获取本月多少天
		System.out.println("本月共："+d+"天");
		
	}
}
