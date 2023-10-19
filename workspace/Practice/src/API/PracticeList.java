package API;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
public class PracticeList {
	public static void main(String[] args) {

		//リストの定義
		List<Integer> a = new ArrayList<>();
		//リストの定義2
		List<String> b = new ArrayList<>(Arrays.asList("赤","青"));
		//リストbの要素数を持つリストstrを生成
		String[] str = new String[b.size()];
		//リストbの要素をstr配列に格納
		b.toArray(str);
		for(int i = 0;i<str.length;i++) {
			System.out.println(Arrays.toString(str));
		}
		b.toArray(str);
		for(Integer i = 0;i<5;i++) {
			a.add(10);
			//a.set(i,i+10);
		}
		//要素番号0番目の要素を削除
		a.remove(４);
		//10が入っている最初の要素番号を取得
		a.indexOf(10);
		//要素数を取得
		a.size();
		for(Integer i = 0;i<5;i++) {
			System.out.println();
		}
		

	}
}


