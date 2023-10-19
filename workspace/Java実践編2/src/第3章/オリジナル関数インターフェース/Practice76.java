package 第3章.オリジナル関数インターフェース;

import java.util.Scanner;

public class Practice76{
	//②messageメソッドを記述
	public static void message(String name,int age,String address) {
		System.out.println("私の名前は"+name+""+age+"才です。"+address+"に住んでます");
	}
	// 引数は文字列の名前、整数の年齢、文字列の住所の３つ 引数は無し {
		//③『私の名前は○○、○○才です。○○に住んでます』と表示す

	public static void main(String[] args) {
		int cmd;
		String s1, s2, s3;
		Scanner sc = new Scanner(System.in);
		Scanner sc2 = new Scanner(System.in);

		System.out.print("氏名：");
		String name = sc.nextLine();
		System.out.print("年齢：");
		int age = sc2.nextInt();
		System.out.print("住所：");
		String address = sc.nextLine();
		
		//④funcにmessageメソッドを代入
		messageConsumer func = Practice76::message;
		//⑤funcメソッドを呼び出す(呼び出しはインターフェースの関数名を使用)
		func.printMessage(name,age,address);
	}
}

