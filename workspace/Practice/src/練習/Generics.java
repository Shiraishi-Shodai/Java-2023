package 練習;

public class Generics {
	public static void main(String []args) {
		//Genericsの型に整数を設定したいときはIntegerを使う
		Generics2<Integer> g = new Generics2<Integer>();
		g.Method1(10);
	}
}
