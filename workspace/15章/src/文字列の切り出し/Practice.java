package 文字列の切り出し;

import java.util.Scanner;

public class Practice {

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		String[] ary = { "愛媛県松山市　", "愛媛県新居浜市", "愛媛県宇和島市" };
		int start, end;
		do {
			System.out.print("切り出し開始位置(1-7)：");
			start = stdIn.nextInt();
			System.out.print("切り出し終了位置(1-7)：");
			end = stdIn.nextInt();
			if (start > end) {
				System.out.println("開始位置 ≦ 終了位置にしてください");
				continue;
			}
			for (String s : ary) {
				//①startからendまでの文字列を切り出して表示する
				System.out.println(s.substring(start-1,end));
			}
			System.out.println();
		} while (true);
	}
}
