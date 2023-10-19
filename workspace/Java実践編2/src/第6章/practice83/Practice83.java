package 第6章.practice83;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Practice83 {
	public static void main(String[] args) throws IOException {
		// 書き込みファイルオープン
		// 読み込みファイルオープン
		FileWriter ehime = null;
		FileWriter etc = null;
		BufferedReader inp = null;
		try {
			//①in.txtを読み込みファイルとして開く 変数名inp
			inp = new BufferedReader(new FileReader("in.txt"));
			//②ehime.txtを書き込みファイルとして開く 変数名ehime
			ehime = new FileWriter("ehime.txt");
			//③etc.txtを書き込みファイルとして開く 変数名etc
			etc = new FileWriter("etc.txt");
		}catch(IOException e) {
			System.out.println("入出力エラー1");
		}

		String line = null;
		String regex = "^愛媛県";
	    Pattern p = Pattern.compile(regex);
	    Matcher m;
	    try {
			while ((line = inp.readLine())!=null){//④ファイルから１行分読み込んでlineに格納する nullでない間繰り返す) {
				m = p.matcher(line);
				if (m.find()) {//line.matches("^愛媛県.*")でも可能⑤「愛媛県」から始まる文字列か判定する 正規表現を利用) {
					//⑥ehime.txtに書き込み
					ehime.write(line+"\n");
				} else {
					//⑦etc.txtに書き込み
					etc.write(line+"\n");
				}
				ehime.flush();
				etc.flush();
			}
	    }catch(IOException e) {
	    	System.out.println("入出力エラー2");
	    }finally {
	    	if(ehime!=null&&etc!=null) {
	    		try {
	    			//⑧ファイルinp.txtを閉じる
	    			inp.close();
	    			//⑨ファイルehime.txtを閉じる
	    			ehime.close();
	    			//⑩ファイルetc.txtを閉じる
	    			etc.close();
	    		}catch(IOException e) {
	    			
	    		}
	    	}
	    }
		System.out.println("プログラム終了");
	}
}

