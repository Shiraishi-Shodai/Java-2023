package Addition;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Scanner sc1 = new Scanner(System.in);
		String a = sc.nextLine();
		String n = sc.nextLine();
		int i = 0;
		int j = 0;
			try {
				add(a,n);
			}catch(NumberFormatException e) {
				System.out.println("「整数に変換できません");
			}
	}
	
	public static void add(String no1,String no2) throws NumberFormatException{
		int i = Integer.parseInt(no1);
		int j = Integer.parseInt(no2);
		System.out.println(i+j);
	}
}



