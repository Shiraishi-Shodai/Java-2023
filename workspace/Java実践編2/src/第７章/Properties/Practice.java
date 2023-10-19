package 第７章.Properties;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Reader;
import java.io.Writer;
import java.util.Properties;
import java.util.Scanner;

public class Practice {
	public static void main(String[] args) throws IOException {
		Scanner stdIn = new Scanner(System.in);

		Reader fr = new FileReader("my.properties");
		//①Propertiesインスタンスpの生成
		Properties p = new Properties();
		//②ファイル内容を読み取る
		p.load(fr);
		String strName = p.getProperty("myName");//③氏名を読み込み
		String strAge = p.getProperty("myAge");//④年齢を読み込み
		String strHeight = p.getProperty("myHeight");//⑤身長を読み込み
		String strWeight = p.getProperty("myWeight");//⑥体重を読み込み
		System.out.println("氏名：" + strName);
		System.out.println("年齢：" + strAge);
		System.out.println("身長：" + strHeight + "m");
		System.out.println("体重：" + strWeight + "kg");
		fr.close();

		Writer fw = new FileWriter("my.properties");
		System.out.println("現在の身長と体重を入力してください");
		System.out.print("身長(cm)：");
		double height = stdIn.nextDouble();
		System.out.print("体重(kg)：");
		double weight = stdIn.nextDouble();

		//⑦変数heightの値を身長としてセットする
		p.setProperty("myHeight", String.valueOf(height));
		//⑧変数weightの値を体重としてセットする
		p.setProperty("myWeight", String.valueOf(weight));
		//⑨ファイルに書き出す（コメントとして「myData」を出力）
		p.store(fw, "Let's Go");
		fw.close();
		System.out.println("保存しました");
	}
}
