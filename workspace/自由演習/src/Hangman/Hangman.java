package Hangman;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
public class Hangman {
	public static void main(String[] args) { 
		Method m = new Method();
		BufferedReader br = null;
		List <String> list = new ArrayList<>();
		//入力された文字を格納
		List <String> index = new ArrayList<>();
		Random random0 = new Random();
		int random = random0.nextInt(50);
		String word = null;
		String line = null;
		try {
			br = new BufferedReader(new FileReader("word.txt"));
			while((line = br.readLine())!=null) {
				list.add(line);
			}
		}catch(IOException e) {
			System.out.println("入出力エラー1");
		}
		
			Scanner sc = new Scanner(System.in);
			
			//ランダムな単語を取り出し
			word = list.get(random);
			
			//配列に変換
			String []box = word.split("");
			//シークレット単語を作成
			String []secret = new String[box.length];
			for(int i = 0;i<secret.length;i++) {
				secret[i] = "-";
			}
			char test;
			int matchCount;
			int missCount = 1;
			boolean judge = true;
		do {
			matchCount = 0;
			System.out.print("単語:");
			m.open(secret);
			System.out.print("英字:");
			test = sc.next().charAt(0);
			String str = String.valueOf(test);
			// 正規表現をPatternとして作って、
			Pattern pattern = Pattern.compile("[a-z]");
			// マッチさせたい文字列に対するMatcherをPatternから作る
			Matcher matcher = pattern.matcher(str);
			//小文字かつ同じ文字が入力されていればtrueそうでないならfalse
			if(!matcher.find()) {
				System.out.println("小文字のアルファベットで入力してください");
			}else if(index.contains(str)) {
				System.out.println("すでに入力された文字です。再入力してください。");
			}else {
				m.change(test,box,secret);
				for(int i = 0;i<box.length;i++) {
					if(secret[i].matches(box[i])) {
						matchCount++;
					}
				}
				index.add(str);
				if(matchCount!=box.length){
					m.printHangman(missCount);
					if(missCount==8) {
						System.out.println("You are dead!");
						System.out.println(word);
						System.out.println("終了します");
						judge = false;
					}
						missCount++;
					}else {
						m.open(secret);
						System.out.println("正解です。終了します");
						judge = false;
					}
			   }
		}while(judge);
		
		
	}
}
