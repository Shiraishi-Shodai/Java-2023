package 時刻と表示;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class Test {

	public static void main(String[] args) {
		Date now = new Date();//①現在日時を取得する
		String week[] = { "", "日", "月", "火", "水", "木", "金", "土" };
		System.out.println("Dateインスタンスからint値を生成した場合");
		Calendar c = Calendar.getInstance();//②Calendarインスタンスの取得
		c.setTime(now);
		System.out.printf("%d年%d月%d日%s曜日%d時%d分%d秒",c.get(Calendar.YEAR),
															c.get(Calendar.MONTH)+1,
															c.get(Calendar.DAY_OF_MONTH),
															week[c.get(Calendar.DAY_OF_WEEK)],
															c.get(Calendar.HOUR),
															c.get(Calendar.MINUTE),
															c.get(Calendar.SECOND));

		System.out.println("\nSimpleDateFormatを用いた場合");
		SimpleDateFormat f = new SimpleDateFormat("yyyy年MM月dd日(E曜日)HH時mm分ss秒");//④9999年99月99日(曜日)99時99分99秒の書式指定
		String s = f.format(now);//⑤Date型からString型へ書式を用いて変換する
		System.out.printf(s);
	}

}
