package 第７章.Csv;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Practice84 {
	public static void main(String[] args) throws IOException {
		// 読み込みファイルオープン
		BufferedReader inp = new BufferedReader(new FileReader("C:\\in.csv"));//①in.csvを読み取り用として開く

		String line = null;
		int no = 1;		//連番用のカウンタ
		int number[] = new int[3];
		//見出し出力
		System.out.printf("番号 氏名    科目1 科目2 科目3 合計 平均\n");
		while ((line = inp.readLine()) != null) {
			//②読み込んだ１行(line)を「,」で分割し、配列aryに格納する
			String []ary = line.split(",");
			int total = 0;//③科目1、科目2、科目3を合計する
				for(int i = 0;i<3;i++) {
					number[i] = Integer.parseInt(ary[i+1]);
					total += number[i];
				}
			double avg = total/3.0;//④3科目の平均を求める
			System.out.printf("%2d %s  %3d %5d %5d %4d %.2f \n",no,ary[0],number[0],number[1],number[2],total,avg);//⑤連番、氏名、3科目の得点、合計点、平均点を表示する);
			no++;
		}
		//⑥in.csvを閉じる
	}
}
