package 練習;

public class コピーコンストラクタ {
	public static void main(String []args) {
		コピーコンストラクタ2 copy1 = new コピーコンストラクタ2(10,"白石");
		コピーコンストラクタ2 copy2 = new コピーコンストラクタ2(20,"しょうた");
		copy2 = new コピーコンストラクタ2(copy1);
	}
}
