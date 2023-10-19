package DataManagementa6;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
public class DataManagement6 {
	public static void main(String [] args) {
		Scanner sc1 = new Scanner(System.in);
		Scanner sc2 = new Scanner(System.in);
		List<String> a;
		Map<String,List<String>> map = new HashMap<>();
		int num;
		String gakka;
		String student;
		System.out.println("操作メニュー");
		try {
			do {
				System.out.println("学科登録:1, 学科削除:2, 学生登録:3, 学生削除:4, 表示:5, 終了:6 ");
				System.out.print("操作番号を入力してください:");
				num = sc1.nextInt();
				switch(num) {
					case 1:
						System.out.print("学科名:");
						gakka = sc2.nextLine();
						//マップにgakkaが登録されてないとき
						if(!map.containsKey(gakka)) {
							//mapにgakkaを追加
							List<String> list = new ArrayList<>();
							map.put(gakka, list);
							System.out.println("学科"+gakka+"を追加しました。");
						}
						break;
					case 2:
						System.out.print("学科名");
						gakka = sc2.nextLine();
						//マップにgakkaが登録されてないとき
						if(!map.containsKey(gakka)) {
							System.out.println("学科"+gakka+"は存在しません。");
							break;
						}
						//gakkaを削除
						map.remove(gakka);
						System.out.println("学科"+gakka+"を削除しました");
					case 3:
						System.out.print("学科名:");
						gakka = sc2.nextLine();
						//マップにgakkaが登録されてないとき
						if(!map.containsKey(gakka)) {
							System.out.println("学科"+gakka+"は存在しません。");
							break;
						}
						System.out.print("学生名:");
						student = sc2.nextLine();
						//gakkaに対応するlistを取得する
						a = map.get(gakka);
						a.add(student);
						System.out.println("学科"+gakka+"に学生"+student+"を追加しました。");
						break;
					case 4:
						System.out.print("学科名:");
						gakka = sc2.nextLine();
						if(!map.containsKey(gakka)) {
							System.out.println("学科"+gakka+"は存在しません。");
							break;
						}
						//gakkaに対応するlistを取得する
						a = map.get(gakka);
						System.out.print("学生名:");
						student = sc2.nextLine();
						if(!a.contains(student)) {
							System.out.println("学生"+gakka+"は存在しません。");
							break;
						}
						//学生studentを削除
						a.remove(student);
						System.out.println("学生"+student+"を削除しました");
					case 5:
						System.out.print("学科名:");
						gakka = sc2.nextLine();
						//gakkaに対応するlistを取得する
						a = map.get(gakka);
						//学生名一覧を表示
						a.stream().forEach(s -> System.out.println(s));
						break;
					case 6:
						System.out.println("終了する。");
						break;
				}
			}while(num != 6);
		}catch(InputMismatchException e) {
			System.out.println("エラー");
		}
	}
}
