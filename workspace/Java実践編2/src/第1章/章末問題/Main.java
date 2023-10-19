package 第1章.章末問題;


import java.text.ParseException;
import java.text.SimpleDateFormat;

public class Main {
	public static void main(String[]args) throws ParseException {
		SimpleDateFormat f = new SimpleDateFormat("yyyy/mm/dd");
		
		Book b1 = new Book("Java入門",f.parse("2011/10/07"),"スッキリわかる");
	}
}
