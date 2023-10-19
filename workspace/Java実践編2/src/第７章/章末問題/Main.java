package 第７章.章末問題;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

public class Main {
	public static void main (String[]args) {
		BufferedReader b = null;
		try {
			b = new BufferedReader(new FileReader("pref.properties"));
			Properties p = new Properties();
			p.load(b);
			String capital = p.getProperty("aichi.capital");
			String food = p.getProperty("aichi.food");
			System.out.printf("%s::%s",capital,food);
		}catch(IOException e) {
			System.out.println("エラー");
		}finally {
			try {
				if(b != null) {
					b.close();
				}
			}catch(Exception e) {
				
			}
		}
	}
}
