package 練習;

public class hikakuChar {
	public static void main(String[] args) {
		char a = 'あ';
		char b = 'い';
		char c = 'う';
		
		if(Character.compare(a,b)>0) {
			System.out.println("大きい");
		}else if(Character.compare(a,b)<0){
			System.out.println("小さい");
		}else {
			System.out.println("等しい");
		}
		
	}
}
