package 時刻と表示;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
public class Practice55 {

	public static void main(String[] args) {
		Date now = new Date();
		String week[] = { "", "日", "月", "火", "水", "木", "金", "土" };
		System.out.println("Dateインスタンスからint値を生成した場合");
		Calendar c = Calendar.getInstance();
		c.setTime(now);
		//c.set(Calendar.MONTH,10);
		System.out.printf("%d年%d月%d日(%s曜日)%d時%d分%d秒",
				c.get(Calendar.YEAR),
				//フィールドの値は0から11で、JANUARY(0), FEBRUARY(1), MARCH(2), APRIL(3), 
				//MAY(4), JUNE(5), JULY(6), AUGUST(7), SEPTEMBER(8), OCTOBER(9), NOVEMBER(10),
				//DECEMBER(11)になります。
				c.get(Calendar.MONTH)+1,
				c.get(Calendar.DAY_OF_MONTH),
				//フィールドの値は1から7で、SUNDAY(1)、MONDAY(2)、TUESDAY(3)、WEDNESDAY(4)、THURSDAY(5)、
				//FRIDAY(6)、および SATURDAY(7) になります。
				week[c.get(Calendar.DAY_OF_WEEK)],
				c.get(Calendar.HOUR),
				c.get(Calendar.MINUTE),
				c.get(Calendar.SECOND));

		System.out.println("\nSimpleDateFormatを用いた場合");
		SimpleDateFormat f = new SimpleDateFormat("yyyy年MM月dd日 E曜日 HH時:mm分:s秒");
		String s = f.format(now);
		System.out.printf(s);
	}
}
