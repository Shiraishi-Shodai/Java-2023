package 第6章.Practice79;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {

		Scanner stdIn = new Scanner(System.in);
		BufferedWriter fw = null;
		BufferedReader fr = null;
		try {
			//①ファイルout.txtを出力用（追記）として開く
			//
			fr = new BufferedReader(new FileReader("out.txt"));
			List<String> list = new ArrayList<>();
			String line;
			int i = 0;
			while((line = fr.readLine()) != null) {
				list.add(line+i);
				i++;
			}
			fw = new BufferedWriter(new FileWriter("out.txt"));
			for(String s: list) {
				fw.write(s+"\n");
			}
			
			//while (true) {
//				System.out.print("名前：");	
//				String name = stdIn.next();
//
//				if (name.equals("END")) {
//					break;
//				}
//				System.out.print("年齢：");
//				int age = stdIn.nextInt();
//				//②書き込む（氏名と年齢を,で連結し、改行文字を付加） 『氏名,年齢⏎』
//				fw.write("名前"+name+"年齢"+age+"\n");
			//}
			//③強制書き出し
			fw.flush();
			//④ファイルを閉じる
			fw.close();
		} catch (IOException e) {
			System.out.println("入出力エラー");
		} catch (Exception e) {
			System.out.println("エラー");
		}
		System.out.println("プログラム終了");
	}
}
