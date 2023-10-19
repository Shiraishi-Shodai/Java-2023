package Hangman;

public class Method {
	private int matchCount = 0;
	private boolean judge;
	public void printHangman(int n) {
		switch(n) {
		case 0:
			System.out.println("－－－－－\n｜\n｜\n｜\n｜\n｜\n｜");
		case 1:
			System.out.println("－－－－－\n｜   ｜\n｜\n｜\n｜\n｜\n｜");
			break;
		case 2:
			System.out.println("－－－－－\n｜   ｜\n｜   ● \n｜\n｜\n｜\n｜");
			break;
		case 3:
			System.out.println("－－－－－\n｜   ｜\n｜   ● \n｜ ／\n｜\n｜\n｜");
			break;
		case 4:
			System.out.println("－－－－－\n｜   ｜\n｜   ● \n｜ ／｜\n｜\n｜\n｜");
			break;
		case 5:
			System.out.println("－－－－－\n｜   ｜\n｜   ● \n｜ ／｜＼ \n｜\n｜\n｜");
			break;
		case 6:
			System.out.println("－－－－－\n｜   ｜\n｜   ● \n｜ ／｜＼\n｜   ｜\n｜\n｜");
			break;
		case 7:
			System.out.println("－－－－－\n｜   ｜\n｜   ● \n｜ ／｜＼\n｜   ｜\n｜  ／\n｜");
			break;
		case 8:
			System.out.println("－－－－－\n｜   ｜\n｜   ● \n｜ ／｜＼\n｜   ｜\n｜ ／  ＼\n｜");
			break;
		}
	}
	
	//取り出した単語の文字数文-を格納
	public void change(char test,String []box,String []secret) {
		//入力された一文字を文字列に変換
		String str = String.valueOf(test);
		for(int i = 0;i<box.length;i++) {
			if(secret[i].matches("-")&&str.matches(box[i])) {
				secret[i] = box[i];
			}
		}
	}
	//シークレット文字を表示
	public void open(String secret[]) {
		for(int i = 0;i<secret.length;i++) {
			System.out.print(secret[i]);
		}
		System.out.println("("+secret.length+"文字)");
	}
	
	
	
}
