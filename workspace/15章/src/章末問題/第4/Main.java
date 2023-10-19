package 章末問題.第4;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class Main {
	public static void main(String[]args) {
		
		Date d = new Date();
		Calendar c = Calendar.getInstance();
		c.setTime(d);
		int day = c.get(Calendar.DAY_OF_MONTH)+100;
		c.set(c.get(Calendar.MONTH), day);
		SimpleDateFormat f = new SimpleDateFormat("yyyy年MM月dd日");
		d = c.getTime();
		System.out.println(f.format(d));
		
	}
}
