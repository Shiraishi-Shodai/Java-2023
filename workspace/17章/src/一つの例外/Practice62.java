package 一つの例外;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Practice62 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		try {
			System.out.print("整数１：");
			int no1 = sc.nextInt();
			System.out.print("整数２：");
			int no2 = sc.nextInt();
			System.out.printf("%dの%d乗は%.0fです", no1, no2, Math.pow(no1, no2));
		} catch(InputMismatchException e) {
			System.out.print("エラーです！！");
		}
		sc.close();
	}
}

