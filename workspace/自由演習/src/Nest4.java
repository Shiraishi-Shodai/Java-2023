

import static java.lang.System.*;

public class Nest4 {

	public static void main(String []args) {
		out.println("左下直角の二等辺三角形を表示します");
		out.println("段数は:");
		int parley = new java.util.Scanner(System.in).nextInt();
		
		for(int i = 1;i<=parley;i++) {
			for(int j = 1;j<=parley;j++) {
				if(i-j>=1) {
					out.print(" ");
				}else {
					out.print("*");
				}
			}
				out.println("");
				
		}
	}
}
