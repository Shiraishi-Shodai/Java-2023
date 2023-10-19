package PascalTriangle;

import static java.lang.System.*;

import java.util.Scanner;

public class PascalTriangle {
	public static void main(String []args) {
		out.print("左下直角の二等辺三角形を表示します");
		Scanner sc = new Scanner(System.in);
		int[][] pt = new int[100][100 * 2 + 1];
		int n = sc.nextInt();
		for(int i = 0;i<=n;i++) {
			for(int j = 0;j<(n*2+1);j++) {
				pt[i][j] = 0;
				out.printf("%3d",pt[i][j]);
			}
			out.println("");
		}
	}
}
