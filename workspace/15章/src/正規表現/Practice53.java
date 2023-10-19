package 正規表現;

public class Practice53 {
	public static void main(String[] args) {
		String[] ary = { "M11/01/03", "M33:03:10", "M440620",
						"T02/09/30", "12/11/T10", "02/T14/22",
						"S10/04/01","1S5/06/02", "59/08/03S", 
						"H03/12/29", "25/06/02", "HXX/08/03", 
						"R01/01/13", "02R/01/23", "X03/06/28" };
		System.out.println("正常な日付（和暦）");		
		for (String s : ary) {
			if (checkYmd(s)) {
				System.out.println(s);
			}
		}
	}

	public static boolean checkYmd(String s) {
		 //①正規表現で引数の値をパターンマッチングし、正しければtrueを返す。
		//[MTSHR]は[M|T|S|H|R]と一緒、
		//半角数値(0～9)にマッチする \\d
		//用意されているエスケープシーケンス以外を入力すると、実行する際に自動的に\が取り除かれるため\dを利用するときは\\dと記述する
		return s.matches("^[MTSHR]\\d{2}/\\d{2}/\\d{2}$");
	}
}
