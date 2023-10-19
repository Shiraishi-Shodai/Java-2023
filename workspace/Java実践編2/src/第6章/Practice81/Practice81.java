package 第6章.Practice81;

//ファイルにバイト単位のデータを書き込むときに使用する入出力ストリーム
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class Practice81 {
	public static void main(String[] args) throws IOException {
		// ファイル書き込み
		FileOutputStream fw = null;
		//①out.datファイルを書き込み用（上書き）として開く 変数名はfos
		fw = new FileOutputStream("out.dat");
		for (int i = 0; i < 26; i++) {
			//②ファイルに書き込む（１バイト） 書き込む内容は65 + i
			fw.write(65+i);
		}
		//③強制的に書き込む
		fw.flush();
		//④ファイルを閉じる
		fw.close();
		// ファイル読み込み
		FileInputStream fis = null;
		//⑤out.datファイルを読み込み用として開く 変数名fis
		fis = new FileInputStream("out.dat");
		int i = fis.read();//⑥ファイルから読み込む 
		while (i != -1) {
			System.out.println(i);
			i = fis.read();//⑥ファイルから読み込む 
		}
		//⑦ファイルを閉じる 
		fis.close();
	}
}