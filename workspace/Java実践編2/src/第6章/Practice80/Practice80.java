package 第6章.Practice80;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Practice80 {
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);

		try {
			//①ファイルout.txtを出力用（追記）として開く
			FileWriter fw = new FileWriter("out.dat",false);
			while (true) {
				System.out.print("名前：");	
				String name = stdIn.next();

				if (name.equals("END")) {
					break;
				}
				System.out.print("年齢：");
				int age = stdIn.nextInt();
				//②書き込む（氏名と年齢を,で連結し、改行文字を付加） 『氏名,年齢⏎』
				fw.write(name+','+age+'\n');
				
			}
			//③強制書き出し
			fw.flush();
			//④ファイルを閉じる
			fw.close();
		} catch (IOException e) {
			System.out.print("入出力エラー");
		} catch (Exception e) {
			System.out.print("エラー");
		}
		System.out.println("プログラム終了");
	}
}

