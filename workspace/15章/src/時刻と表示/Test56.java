package 時刻と表示;

import java.time.LocalDateTime;
import java.util.Scanner;

public class Test56 {

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);

		// 現在日時を取得する（貸出日）
		LocalDateTime rentalDate = LocalDateTime.now();//取得する

		System.out.println("貸出日数を入力");
		System.out.print("何泊：");
		int rentalDays = stdIn.nextInt();

		// 貸出日を表示する
		System.out.printf("貸出日は%s/%s/%s\n",rentalDate.getYear(),rentalDate.getMonthValue(),rentalDate.getDayOfMonth());

		// 返却予定日を計算する
		LocalDateTime returnDate = rentalDate.plusDays(rentalDays);//③貸出日に貸出日数を加えて返却予定日を求める

		// 返却予定日を表示する
		System.out.printf("貸出日は%s/%s/%s",returnDate.getYear(),returnDate.getMonthValue(),returnDate.getDayOfMonth());
	}

}
