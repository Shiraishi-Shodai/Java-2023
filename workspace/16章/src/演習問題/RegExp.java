package 演習問題;
import static java.lang.System.*;

import java.util.Scanner;
public class RegExp {
	public static void main(String[] args) {
		RegExpSub r = new RegExpSub();
		Scanner sc = new Scanner(System.in);
		Scanner sc2 = new Scanner(System.in);
		String num;
		String numBox[];
		String name;
		String nameBox[];
		do{
			out.print("受付情報入力");
			num = sc.nextLine();
			numBox = num.split("");
		}while(!r.setNumber(numBox));
			
			//スペースの要素番号
			int space;
			do{
				out.print("氏名:");
				name = sc2.nextLine();
				space = name.indexOf(" ");
				//out.print(space);
				nameBox = name.split("");
				//out.print(nameBox.length);
			}while(!r.setName(nameBox,space));
			
			String gakka = "";
			int a = Integer.parseInt(numBox[0]);
				switch(a) {
				case 1: gakka = "ITエンジニア科";
				break;
				case 2: gakka = "Webシステム科";
				break;
				case 3: gakka = "ゲームクリエイター科";
				break;
				case 4: gakka = "ITビジネス科";
				break;
				case 5: gakka = "日本語学科";
				break;
				case 6: gakka = "I国際観光科";
				break;
				}
				out.println("入力完了");
				out.printf("受験番号 %5s 氏名%20s\n",num,name);
				out.printf("学科%10s 学年 %s\n",gakka,numBox[1]);
			
//		
		}
	}

