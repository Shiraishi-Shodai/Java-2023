package 演習問題.Practice51;
import static java.lang.System.*;
public class Multplication {
	public static void main(String[] args) {
		int num[] = new int[2];
		int count=0;
		try {
			for(int i = count;i<args.length;i++) {
				num[i] = Integer.parseInt(args[i]);
				count++;
			}
			out.printf("%d %s %d %s %d",num[0],"*",num[1],num[0]*num[1]);
		}catch(ArrayIndexOutOfBoundsException e) {
			out.println("パラメータが足りません");
		}catch(NumberFormatException e){
			out.println(args[count]+"は整数に変換できませ");
		}
	}
}
