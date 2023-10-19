package WalkingTime歩行時間算出;
import static java.lang.System.*;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Scanner;
public class WalkingTime {
	public static void main(String[]args){
		Scanner sc = new Scanner(System.in);
		out.println("目的地までの距離(km)と時速(km/h)を入力してください。 ");
		out.print("距離(km):");
		double distance = sc.nextDouble();
		out.print("時速(km/h):");
		double speed = sc.nextDouble();
		
		distance *= 1000;
		speed *= 1000;
		double hsp = speed/60;
		double time = distance / hsp;
		double time2 = time/60;
		double time3 = time%60;
		BigDecimal bd = new BigDecimal(String.valueOf(time));
		
		// 小数第一位を切り上げ
		BigDecimal bd1 = bd.setScale(0, RoundingMode.UP);
		if(time2>=1) {
			out.println("目的地まで、"+time2+"時間"+time3+"分です。");
		}else {
			System.out.println("目的地まで"+bd1.toPlainString()+"分です");
		}

	}
}
