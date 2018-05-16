package date;

import java.util.Calendar;
import java.util.Date;

/*
 * java.utile.Calendar
 * 日历类
 * Calendar本身是一个抽象类，定义了日历类操作时间的相关方法.其提供了一个静态方法getInstance();
 * 可以根据系统所在地区获取一个适用的实现类.大部分地区获取的都是GregorinCalendar,即：阳历
 */
public class CalendarDemo {
	public static void main(String[] args) {
		//日历类默认也表示当前系统时间
		Calendar calendar = Calendar.getInstance();
		System.out.println(calendar);
		
		/*
		 * Calendar可以与Date之间相互转换.
		 * 
		 * 1：Calendar-> Date
		 * Calendar提供了方法：
		 * Date getTime():该方法可以将当前Calendar所表示的日期以Date形式返回. 
		 */
		Date date = calendar.getTime();
		System.out.println(date);
		
		/*
		 * Date -> Calendat
		 * Calendar提供了方法：
		 * void setTime(Date date):使当前Calendar表示给定的Date所表示的日期.
		 */
		calendar.setTime(date);
	}
}
