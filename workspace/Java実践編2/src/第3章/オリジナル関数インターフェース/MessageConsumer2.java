package 第3章.オリジナル関数インターフェース;

public interface MessageConsumer2 {
	//①抽象メソッドprintMessageを定義 
	// 引数は文字列の名前、整数の年齢、文字列の住所の３つ 引数は無し
	public abstract void printMessage(String name,int age,String address);
}