package date;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

/*
 * 计算商品促销日期：
 * 促销日规则：商品过期日前两周的周三为促销日.
 * 
 * 程序启动后要求用户输入商品的生产日期：  
 * 如：2018-04-26
 * 
 * 输入保质期的天数：
 * 如：21天
 * 
 * 然后经过计算，输出促销日：2018-05-02
 * 
 */
public class DateTest2 {
	public static void main(String[] args) throws ParseException{
		Scanner in = new Scanner(System.in);
		System.out.println("请输入生产日期：");
		String newDay = in.nextLine();
		System.out.println("请输入保质期：");
		int endDay = Integer.parseInt(in.nextLine());
		
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		
		//生产日期：
		Date date = sdf.parse(newDay);
		Calendar calendar = Calendar.getInstance();
		calendar.setTime(date);
		
		//计算过期：
		calendar.add(Calendar.DAY_OF_YEAR,endDay);
		
		//过期前两周：
		calendar.add(Calendar.DAY_OF_YEAR,endDay-14);
		
		//设置促销日：
		calendar.set(Calendar.DAY_OF_WEEK,Calendar.WEDNESDAY);
		
		date = calendar.getTime();
		String str = sdf.format(date);
		System.out.println("促销日为："+str);
		
	}
}
