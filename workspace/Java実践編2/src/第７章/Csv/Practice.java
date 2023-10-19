package 第７章.Csv;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Practice {
	public static void main(String[] args) throws IOException {
		// 読み込みファイルオープン
		BufferedReader inp = new BufferedReader(new FileReader("in.csv"));//①in.csvを読み取り用として開く

		String line = null;
		int no = 1;		//連番用のカウンタ
		//見出し出力
		System.out.printf("番号 氏名    科目1 科目2 科目3 合計 平均\n");
		while ((line = inp.readLine()) != null) {
			//②読み込んだ１行(line)を「,」で分割し、配列aryに格納する
			String ary[] = line.split(",");
			int a = Integer.parseInt(ary[1]);
			int b = Integer.parseInt(ary[2]);
			int c = Integer.parseInt(ary[3]);
			int total = a+b+c;//③科目1、科目2、科目3を合計する
			double avg = total/(double)3; //④3科目の平均を求める
			System.out.printf("%d %s %d %d %d %d %.2f\n",no,ary[0],a,b,c,total,avg);//⑤連番、氏名、3科目の得点、合計点、平均点を表示する);
			no++;
		}
		//⑥in.csvを閉じる
		inp.close();
	}
}