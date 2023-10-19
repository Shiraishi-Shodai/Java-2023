package オリジナル例外;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Practice {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		try {
			System.out.print("整数１：");
			int no1 = sc.nextInt();
			if (no1 < 0) {
				//②オリジナル例外を発生させて、メッセージ "負の値です" を渡す。
				throw new MinusException("負の値です");
			}
			System.out.print("整数２：");
			int no2 = sc.nextInt();
			if (no2 < 0) {
				//④オリジナル例外を発生させて、メッセージ "負の値です" を渡す。
				throw new MinusException("負の値です");
			}
			System.out.printf("%dの%d乗は%.0fです", no1, no2, Math.pow(no1, no2));

		} catch (InputMismatchException e) {
			System.out.println("入力エラー発生！！！");
		} catch (MinusException e) {
			System.out.println(e);
		}
		sc.close();
	}
}
