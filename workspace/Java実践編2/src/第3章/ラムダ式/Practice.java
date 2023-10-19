package 第3章.ラムダ式;

import java.util.Scanner;
import java.util.function.BiFunction;

public class Practice {
	public static void main(String[] args) {

		int cmd, n1, n2;
		Scanner sc = new Scanner(System.in);

		System.out.print("整数１：");
		n1 = sc.nextInt();
		System.out.print("整数２：");
		n2 = sc.nextInt();
		//①ラムダ式による記述 引数は整数型が２つ 戻り値はDouble型 {
		BiFunction<Integer,Integer,Double> func = (x,y) -> {
			return x/(double)y;//②整数１ ÷ 整数２の計算結果を返す
		};
		//③funcメソッドを呼び出し 引数はn1,n2  戻り値をdouble型の変数resultで受け取る
		double result = func.apply(n1,n2);
		System.out.printf("%d ÷ %d = %.2f", n1, n2, result);

	}
}
