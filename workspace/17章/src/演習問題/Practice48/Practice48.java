package 演習問題.Practice48;
import static java.lang.System.*;
public class Practice48 {
	public static void main(String[] args) {
		
		for(int i = 1;i<=args.length;i++) {
			try {	
				Integer.parseInt(args[i-1]);
				out.println(i+"番目の引数を整数に変換できます");
				
			}catch(NumberFormatException e) {
				out.println(i+"番目の引数を整数に変換できません");
			}
		}

		
	}
}
