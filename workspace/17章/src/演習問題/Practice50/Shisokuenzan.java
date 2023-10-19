package 演習問題.Practice50;
import static java.lang.System.*;

import java.util.Scanner;
public class Shisokuenzan {
		public static void main(String[] args) {
			Scanner sc = new Scanner(System.in);
			boolean flag;
			int Num[] = new int[2];
			for(int i = 0;i<2;i++){
				do {
					flag = false;
					out.println("整数"+(i+1)+"を入力してください");
					try {
						String str = sc.nextLine();
						Num[i] = Integer.parseInt(str);
					}catch(NumberFormatException e) {
						flag = true;
						out.println("エラー  入力された値を整数ではありません。");
					}
				}while(flag);
			}
			
			char[] op = {'+','-','*'};
			int[] box = {Num[0]+Num[1],Num[0]-Num[1],Num[0]*Num[1]};
			
			for(int i  = 0;i<box.length;i++) {
				out.printf("%d %s %d = %d \n",Num[0],op[i],Num[1],box[i]);
			}
			
			try {
				out.printf("%d %s %d = ",Num[0],"/",Num[1]);
				float point = (float)Num[0]/Num[1];
				out.printf("%.1f", point);
			}catch(ArithmeticException e) {
				out.println("0で除算できません。");
			}
		}
		
}
