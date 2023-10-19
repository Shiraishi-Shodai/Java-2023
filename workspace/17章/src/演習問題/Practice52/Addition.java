package 演習問題.Practice52;
import static java.lang.System.*;

import java.util.Scanner;
public class Addition {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Scanner sc2 = new Scanner(System.in);
		
		String no1 = sc.nextLine();
		String no2 = sc.nextLine();
		try {
			add(no1,no2);
		}catch(NumberFormatException e) {
			out.println("整数に変換できません");
		}
	}
	
	public static void add(String no1,String no2) throws NumberFormatException{
		int num1 = Integer.parseInt(no1);
		int num2 = Integer.parseInt(no2);
		out.printf("%s + %s = %d",no1,no2,num1+num2);
	}
}
