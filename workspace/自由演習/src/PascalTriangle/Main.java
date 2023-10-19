package PascalTriangle;

import static java.lang.System.*;

import java.util.Scanner;
public class Main{
	public static void main(String []args) {
		out.print("パスカルの三角形");
		Scanner sc = new Scanner(System.in);
		int[][] pt = new int[100][100 * 2 + 1];
		int n = sc.nextInt();
		for(int i = 0;i<=n;i++) {
			for(int j = 0;j<(n*2+1);j++) {
				pt[i][j] = 0;
				System.out.printf("%3d",pt[i][j]);
			}
			System.out.println("");
		}
	}
}
