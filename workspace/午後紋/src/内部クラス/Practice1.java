package 内部クラス;

public class Practice1 {
	public static void main(String[] args) {
	
		
		Practice3 p3 = new Practice3();
		//内部クラスの定義
		Practice3.Practice4 p4 = p3.new Practice4();
		p4.Inner();
	}
}

class Practice3{
	String a = "外部フィールド";
	int v = 1;
	public void Outter() {
		System.out.println("外部メソッド");
		class Practice5{
			String c = "ローカルクラス";
			int x = 2;
			x = x+v;
		}
		Practice5 p5 = new Practice5();
		System.out.println(p5.c);
	}
	
	class Practice4{
		String b = "内部フィールド";
		public void Inner() {
			System.out.println(a);
			
		}
		
	}
}
