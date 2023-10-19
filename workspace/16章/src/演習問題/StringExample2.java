package 演習問題;

import static java.lang.System.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
public class StringExample2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		out.print("入力英文:");
		String str = sc.nextLine();
		String [] word = str.split("");
		List<String> list = new ArrayList<>();
		for(String i: word) {
			list.add(i);
		}
		for(String i: list) {
			//
			if(i.matches("[A-Z]")) {
				i = i.toLowerCase();
				out.printf("%s",i);
			}else if(i.matches("[a-z]")){
				i = i.toUpperCase();
				out.printf("%s",i);
			}else {
				out.printf("%s",i);
			}
		}
		
		
	}
}
