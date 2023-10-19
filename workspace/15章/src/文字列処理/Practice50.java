package 文字列処理;

import java.util.Scanner;

class Practice50 {

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		String s1,s2;
		boolean flg = true;
		do {
			flg = true;
			System.out.print("文字列s1：");
			s1 = stdIn.nextLine();
			System.out.print("文字列s2：");
			s2 = stdIn.nextLine();
			if (s1.isEmpty()) {
				System.out.println("s1は空です");
				flg = false;
			}
			if (s2.isEmpty()) {
				System.out.println("s2は空です");
				flg = false;
			}
			System.out.println();
		} while (!flg);
		int idx = 1+s1.indexOf(s2);//③s2がs1内の最初に登場する位置を調べる
		if (idx == -1) {
			System.out.println("s1中にs2は含まれません。");
		} else {
			System.out.println("s1の"+idx+"にs2は含まれます.");
		}
	}
}
