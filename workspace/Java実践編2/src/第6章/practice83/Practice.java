package 第6章.practice83;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Practice {
	public static void main(String[] args) throws IOException {
		BufferedReader br = null;
		BufferedWriter  ehime = null;
		BufferedWriter  etc = null;
		try {
			// 読み込みファイルオープン
			//①in.txtを読み込みファイルとして開く 変数名inp
			br = new BufferedReader(new FileReader("in.txt"));
			// 書き込みファイルオープン
			//②ehime.txtを書き込みファイルとして開く 変数名ehime
			ehime = new BufferedWriter(new FileWriter("ehime.txt"));
			//③etc.txtを書き込みファイルとして開く 変数名etc
			etc = new BufferedWriter(new FileWriter("etc.txt"));
			String line = null;
	
			while ((line = br.readLine()) != null) {
				if (line.matches("愛媛県.*")) {
					//⑥ehime.txtに書き込み
					ehime.write(line);
					ehime.newLine();
				} else {
					//⑦etc.txtに書き込み
					etc.write(line);
					etc.newLine();
				}
			}
		}catch(IOException e) {
			e.fillInStackTrace();
		}finally {
			if(br != null && ehime != null && etc!= null) {
				try {
					br.close();
					ehime.close();
					etc.close();
				}catch(Exception e) {
					e.setStackTrace(null);
				}
			}
		}

		System.out.println("プログラム終了");
	}
}

