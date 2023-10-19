import static java.lang.System.*;

import java.util.Scanner;

public class Chretr {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		out.print("入力英文:");
		String str = sc.nextLine();
		String[] box = str.split("");
		
		for(int i = 0;i<box.length;i++) {
			if(box[i].matches("[A-Z]")) {
				box[i].toLowerCase();
			}
		}
		char[] alfa = {'a','b','c','d','e','f','g','h','i','j','k','l','m',
				'n','o','p','q','r','s','t','u','v','w','x','y','z'};
		char [] charAtArray = str.toCharArray();
		int count[] = new int[alfa.length];
		
		for(int i = 0;i<alfa.length;i++) {
			for(int j = 0;j<str.length();j++) {
				if(alfa[i]==(charAtArray[j])) {
					count[i]++;
				}
			}
		}
		
		for(int i = 0;i<26;i++) {
			if(i%7==0) {
				out.println("");
			}
			out.printf("%c...%d ", alfa[i],count[i]);
		}
		}
		
	}

