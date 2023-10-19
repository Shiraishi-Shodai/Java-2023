package 時刻と表示;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class Test57 {

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		System.out.println("貸出日を入力");
		System.out.print("年（西暦）：");
		int year = stdIn.nextInt();
		System.out.print("月：");
		int month = stdIn.nextInt();
		System.out.print("日：");
		int day = stdIn.nextInt();
		LocalDate rentalDate = LocalDate.of(year, month, month);//①入力された年月日でLocalDataを作成

		System.out.println("貸出日数を入力");
		System.out.print("何泊：");
		int rentalDays = stdIn.nextInt();

		// 貸出日を表示する
		DateTimeFormatter fmt = DateTimeFormatter.ofPattern("yyyy年MM月dd日");//②変換するための書式を作成する
		String str = fmt.format(rentalDate);//③ ②で作成した書式を利用して日付情報(貸出日)を文字列に変換する
		System.out.printf("貸出日は%s\n", str);

		// 返却予定日を計算する
		LocalDate returnDate = rentalDate.plusDays(rentalDays); //④貸出日に貸出日数を加えて返却予定日を求める

		// 返却予定日を表示する
		str = fmt.format(returnDate);//⑤ ②で作成した書式を利用して日付情報(返却予定日)を文字列に変換する
		System.out.printf("返却予定日は%s", str);
	}

}
