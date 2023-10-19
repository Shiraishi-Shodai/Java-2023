package 第3章.オリジナル関数インターフェース;

import java.util.Scanner;

public class Practice {
	//②messageメソッドを記述
	// 引数は文字列の名前、整数の年齢、文字列の住所の３つ 引数は無し {
		//③『私の名前は○○、○○才です。○○に住んでます』と表示する
	public static void Message(String name,int age,String address) {
		System.out.printf("私の名前は%s、 %d才です。 %sに住んでいます",name,age,address);
	}

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
		MessageConsumer2 func = Practice::Message;
		//⑤funcメソッドを呼び出す
		func.printMessage(name,age,address);
	}
}
