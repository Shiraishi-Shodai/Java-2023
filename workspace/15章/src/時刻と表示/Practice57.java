package 時刻と表示;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

class Practice57 {

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		System.out.println("貸出日を入力");
		System.out.print("年（西暦）：");
		int year = stdIn.nextInt();
		System.out.print("月：");
		int month = stdIn.nextInt();
		System.out.print("日：");
		int day = stdIn.nextInt();
		LocalDate rentalDate = LocalDate.of(year, month, day);

		System.out.println("貸出日数を入力");
		System.out.print("何泊：");
		int rentalDays = stdIn.nextInt();

		// 貸出日を表示する
		DateTimeFormatter fmt = DateTimeFormatter.ofPattern("yyyy/MM/dd");
		String str = rentalDate.format(fmt);
		System.out.printf("貸出日は%s\n", str);

		// 返却予定日を計算する
		LocalDate returnDate = rentalDate.plusDays(rentalDays);

		// 返却予定日を表示する
		str = returnDate.format(fmt);
		System.out.printf("返却予定日は%s", str);
	}
}
