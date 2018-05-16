package date;

import java.text.SimpleDateFormat;
import java.util.Date;

/*
 * java.text.SimpleDateFormat
 *  可以将字符串与Date之间按照指定的日期格式进行相互转换.
 */
public class SimpleDateFormat_format {
	public static void main(String[] args) {
		Date now = new Date();
		System.out.println(now);
		
//		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
//		SimpleDateFormat sdf = new SimpleDateFormat("yyyy年MM月dd日 HH:mm:ss");
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss E a");
		String str = sdf.format(now);
		System.out.println(str);
		
	}
}
