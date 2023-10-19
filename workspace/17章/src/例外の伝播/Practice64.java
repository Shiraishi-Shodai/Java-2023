package 例外の伝播;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Practice64 {
	public static void main(String[] args) {
		try {
			inputCheck();
		}catch(InputMismatchException e) {
			System.out.println("入力エラー発生！！！");
		}
		

	}

	public static void inputCheck() throws InputMismatchException{
		Scanner sc = new Scanner(System.in);

		System.out.print("整数１：");
		int no1 = sc.nextInt();
		System.out.print("整数２：");
		int no2 = sc.nextInt();
		System.out.printf("%dの%d乗は%.0fです", no1, no2, Math.pow(no1, no2));

		sc.close();
	}
}
