import java.util.Scanner;
public class Deposit {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Scanner sc2 = new Scanner(System.in);
		Scanner sc3 = new Scanner(System.in);
		System.out.print("積立預金額(x円)：");
		int num = sc.nextInt();
		System.out.print("積立月数(nヵ月)：");
		int month = sc.nextInt();
		System.out.print("年利率(r％)：");
		int per = sc3.nextInt();
	}
}
