package 文字の連結;

public class Practice {

	public static void main(String[] args) {
		StringBuilder sb = new StringBuilder();
		String[] pref = { "愛媛県", "香川県", "高知県" };
		String[] city = { "松山市", "高松市", "高知市" };
		String[] adr1 = { "柳井町", "多賀町", "はりまや町" };

		for (int i = 0; i < pref.length; i++) {
			String s = "";
			//①バッファに県を追加
			sb.append(pref[i]);
			//②バッファに市を追加
			sb.append(city[i]);
			//③バッファに町を追加
			sb.append(adr1[i]);
			//④連結済み文字列を取り出す
			s = sb.toString();
			System.out.println(s);
			//⑤バッファをクリア
			sb.setLength(0);
		}
	}
}