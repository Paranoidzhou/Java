package date;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

/*
 * 程序启动后，要求用户输入自己的生日，格式如：
 * 1992-08-02
 * 
 * 然后通过程序计算，输出到今天为止已经活了多少天.再输出自己出生10000天的纪念日是哪天？
 */
public class DateTest1 {
	public static void main(String[] args) throws ParseException {
	
		Scanner in = new Scanner(System.in);
		System.out.println("请输入你的生日：");
		String birthday = in.nextLine();
		
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		Date birDate = sdf.parse(birthday);
		Date now = new Date();
		
		long time = now.getTime() - birDate.getTime();
		
		long day = time/1000/60/60/24;
		
		System.out.println("到今天你经历了："+day+"天");
		
		time = birDate.getTime()+10000L*1000*60*60*24;
		
		Date date = new Date(time);
//		date.setTime(time);  //将时间的毫秒值转换为日期和时间值  可以省略直接写在new Date();后面
		String Wday = sdf.format(date);
		System.out.println("你的一万天纪念日为："+Wday);
		
	}
}
