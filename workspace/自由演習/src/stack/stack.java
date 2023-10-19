package stack;
import static java.lang.System.*;

import java.util.Scanner;
public class stack {
	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
		int judge;
	    int [] stack = new int[5];
	    int count = 0;
	    int num;
	    auto a = new auto();
		do {
			out.println("現在のデータ数"+count+"/5");
			out.println("(1)プッシュ (2)ポップ (3)ピーク (4)ダンプ (0)終了:");
			judge = sc.nextInt();
			switch(judge) {
			case 1:
				out.print("データ:");
				num = sc.nextInt();
				if(count<stack.length) {
					stack[count] = num;
					out.println(num+"をプッシュしました");
					count++;
				}else {
					out.println("スタックが満杯です。");
				}
			break;
			case 2:
				a.pop(stack, count);
				count--;
				break;
			case 3:
				out.println(a.peak(stack, count));
				break;
			case 4:
				a.damp(stack,count);
				break;
			}
		}while(judge!=0);
	}
}
