package date;

import java.util.Calendar;

/*
 * 计算时间操作.
 * void add(int field,int amount)
 * 对指定的时间分量加上指定的值，若给定的值是负数则是减去
 */
public class Calendar_add {
	public static void main(String[] args) {
		/*
		 * 计算：
		 * 3年2个月零25天以后那天所在周的周一是哪天？
		 */
		Calendar calendar = Calendar.getInstance();
		
		calendar.add(calendar.YEAR,3);          //增加三年
		System.out.println(calendar.getTime());
		
		calendar.add(calendar.MONTH,2);         //增加两个月
		System.out.println(calendar.getTime());
		
	   calendar.add(calendar.DAY_OF_YEAR,25);  //增加25天 【提示：可加可减，天按年算】
	   System.out.println(calendar.getTime());
	   
	   calendar.set(calendar.DAY_OF_WEEK,calendar.MONDAY); //设置到未来的某一周的周一
	   System.out.println(calendar.getTime());
	}
}
