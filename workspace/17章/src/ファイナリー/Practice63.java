package ファイナリー;

import java.util.InputMismatchException;
import java.util.Scanner;
public class Practice63 {
	public static void main(String[] args) {

		System.out.println("速さの計算");
		Scanner sc;
		Scanner sc2;
		while (true) {
			sc = new Scanner(System.in);
			sc2 = new Scanner(System.in);
			try {
				System.out.print("距離（km）：");
				int distance = sc.nextInt();
				System.out.print("時間（Hour）：");
				int time = sc.nextInt();
				int result = distance / time;
				System.out.printf("%d ÷ %d → %d(km/h)\n", distance, time, result);
			}catch(InputMismatchException e) {
				System.out.println("入力エラー発生。java.util.InputMismatchException ");
			}catch(ArithmeticException e) {
				System.out.println("算術エラー発生。java.lang.ArithmeticException: / by zero ");
			}
			finally{
				System.out.println("--------------------");
				System.out.print("もう一度？（1…Yes／0…No）：");
				int retry = sc2.nextInt();
				if (retry == 0)
					break;
				System.out.println("--------------------");
			}
		}
		sc.close();
		sc2.close();
	}
}


