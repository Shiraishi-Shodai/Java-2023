package 第3章.関数の代入;

import java.util.Scanner;
import java.util.function.BiFunction;
import java.util.function.BinaryOperator;
import java.util.function.ToIntBiFunction;

public class Practice75 {
	public static Integer plusNum(Integer n1, Integer n2) {
		return n1 + n2;
	}

	public static Integer minusNum(Integer n1, Integer n2) {
		return n1 - n2;
	}

	public static void main(String[] args) {
		//①関数オブジェクトを格納するためのfuncを宣言;
		BiFunction<Integer,Integer,Integer> func;
		BinaryOperator<Integer> func3;
		ToIntBiFunction<Integer,Integer> func2;
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
			func = Practice75::plusNum;
			func2 = Practice75::plusNum;
			func3 = Practice75::plusNum;
		} else {
			//③funcにminusNumメソッドを代入
			func = Practice75::minusNum;
			func2 = Practice75::minusNum;
			func3 = Practice75::minusNum;
		}
		//④funcメソッドを呼び出し(n1とn2を引数に指定
		System.out.println("計算結果は" +  func.apply(n1, n2));
		System.out.println("計算結果は" +  func2.applyAsInt(n1, n2));
		System.out.println("計算結果は" +  func3.apply(n1, n2));
	}
}

