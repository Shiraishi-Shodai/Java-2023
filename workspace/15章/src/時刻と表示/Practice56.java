package 時刻と表示;

import java.time.LocalDateTime;
import java.util.Scanner;

public class Practice56 {

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);

		// 現在日時を取得する（貸出日）
		LocalDateTime rentalDate = LocalDateTime.now();
		System.out.println(rentalDate);
		System.out.println("貸出日数を入力");
		System.out.print("何泊：");
		int rentalDays = stdIn.nextInt();
		
		// 貸出日を表示する
		//DateTimeFormatter fmt = DateTimeFormatter.ofPattern("yyyy/MM/dd");
		System.out.printf("貸出日は%d/%d/%d\n",
				rentalDate.getYear(),
				rentalDate.getMonthValue(),
				rentalDate.getDayOfMonth());
		

		 //返却予定日を計算する
		LocalDateTime rental = rentalDate.plusDays(rentalDays);

		// 返却予定日を表示する
		System.out.printf("貸出日は%s/%s/%s",
				rental.getYear(),
				rental.getMonthValue(),
				rental.getDayOfMonth());
		
	}
}
