package 章末問題.第4;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Main2 {
	public static void main(String[]args) {
		LocalDate d = LocalDate.now();
		 d = d.plusDays(100);
		DateTimeFormatter f = DateTimeFormatter.ofPattern("yyyy年MM月dd日");
		System.out.println(d.format(f));
	}
}
