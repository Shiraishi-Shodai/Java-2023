package 演習問題.Practice49;
import static java.lang.System.*;

import java.io.IOException;
import java.util.Scanner;
public class Practice49 {
	public static void main(String[] args) throws IOException {
		Scanner sc = new Scanner(System.in);
		String num = "";
		int sum = 1;
		do {
			out.print("1以上の整数を入力してください");
			num = sc.nextLine();
			if(num.equals("exit")) {
				out.println("終了します");
				break;
			}
			try {
				int num2 = Integer.parseInt(num);
				for(int i = num2;i>0;i--) {
					sum *= i;
				}
				out.println(num+"の階上は"+sum+"です");
			}catch(NumberFormatException e) {
				out.println("エラー  入力された値は整数ではありません");
			}
			
		}while(true);
	}
}
