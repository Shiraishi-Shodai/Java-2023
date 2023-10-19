package 第3章.関数の代入;

import java.util.Scanner;
import java.util.function.BiFunction;

public class Practice {
	public static Integer plusNum(Integer n1, Integer n2) {
		return n1 + n2;
	}

	public static Integer minusNum(Integer n1, Integer n2) {
		return n1 - n2;
	}

	public static void main(String[] args) {
		//①関数オブジェクトを格納するためのfuncを宣言;
		BiFunction<Integer,Integer,Integer> func;
		int cmd, n1, n2;
		Scanner sc = new Scanner(System.in);

		System.out.println("操作メニュー");
		System.out.print("1:加算, 2:減算 ＞");
		cmd = sc.nextInt();
		System.out.print("整数１：");
		n1 = sc.nextInt();
		System.out.print("整数２：");
		n2 = sc.nextInt();
		if (cmd == 1) {
			//②funcにplusNumメソッドを代入
			func = Practice::plusNum;
		} else {
			//③funcにminusNumメソッドを代入
			func = Practice::minusNum;
		}
		System.out.println("計算結果は" + func.apply(n1, n2));//④funcメソッドを呼び出し(n1とn2を引数に指定) );
	}
}
