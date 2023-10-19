package 第3章.ラムダ式;

import java.util.Scanner;
import java.util.function.BiFunction;

public class Practice77 {
	public static void main(String[] args) {

		int cmd, n1, n2;
		Scanner sc = new Scanner(System.in);

		System.out.print("整数１：");
		n1 = sc.nextInt();
		System.out.print("整数２：");
		n2 = sc.nextInt();
		BiFunction<Integer,Integer,Double> func =
			(Integer n,Integer num) -> {
				return (double)n / num;
		};
		//①ラムダ式による記述 引数は整数型が２つ 戻り値はDouble型 {
//		ToDoubleBiFunction<Integer,Integer> func =
//				(num,n) -> {
//					return n1 / n2;
//		};
		//③funcメソッドを呼び出し 引数はn1,n2  戻り値をdouble型の変数resultで受け取る
		 double  result = func.apply(n1,n2);
		System.out.printf("%d ÷ %d = %.2f", n1, n2, result);
		
//		BinaryOperator<Double> func2 =
//				(Double a, Double b) -> {
//					return (b/a);
//				};
//				
//		double a = 2.0;
//		double b = 1.0;
//		double result2 = func2.apply(a,b);
//		System.out.printf("%d ÷ %d = %.2f", a, b, result2);
	}
}
