import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
public class LineGraph {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Scanner sc2 = new Scanner(System.in);
		Scanner sc3 = new Scanner(System.in);
		System.out.println("各科目の点数を入力してださい");
		System.out.println("国語");
		int story = sc.nextInt();
		System.out.println("数学");
		int math = sc.nextInt();
		System.out.println("英語");
		int en = sc.nextInt();
		String [] s = "国語".split("");
		String [] m = "数学".split("");
		String [] e = "英語".split("");
		List<String> list = new ArrayList<>();
		for(int i = 100;i>=0;i-=5) {
			System.out.printf("%3d %s\n",i,"|");
		}
		int count = 0;
		
		for(int i = 0;i<2;i++) {
			
			System.out.println("");
			if(count == 1) {
				for(int k = 0;k<2;k++) {
					System.out.printf("%5s %5s %5s\n",s[k],m[k],e[k]);
				}
			}else{
				for(int j = 0;j<13;j++) {
					System.out.printf("－");
				}
			}
			count++;
		}
	
		
	}
}
