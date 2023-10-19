package セット;

import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Scanner;
import java.util.Set;

public class Practice {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Scanner sc2 = new Scanner(System.in);
		Scanner sc3 = new Scanner(System.in);
		Scanner sc4 = new Scanner(System.in);
		//①LinkedHashSetを生成する 名前はstaffSet, 格納する型はString
		Set<String> staffSet = new LinkedHashSet<String>();
		int cmd = 0;
		int staffNo, staffAge;
		String staffName;
		int del = 0;
		String staff;

		try {
			while (true) {
				System.out.println("");
				System.out.println("操作メニュー");
				System.out.println("1:追加、2:指定削除、3:すべて削除、4:すべて表示、9:終了");
				System.out.print("操作番号を入力してください：");
				cmd = sc.nextInt();

				switch (cmd) {
				case 1:// 追加
					System.out.print("社員番号：");
					staffNo = sc2.nextInt();
					System.out.print("氏名：");
					staffName = sc3.nextLine();
					System.out.print("年齢：");
					staffAge = sc4.nextInt();
					staff = staffNo + "," + staffName + "," + staffAge;
					if (!staffSet.contains(staff)) {
						//③LinkedHashSetに社員情報を追加する
						staffSet.add(staff);
						System.out.println("追加しました。");
					} else {
						System.out.println("その社員はすでに登録されています。");
					}
					break;
				case 2:// 指定削除
					System.out.print("社員番号：");
					staffNo = sc2.nextInt();
					System.out.print("氏名：");
					staffName = sc3.nextLine();
					System.out.print("年齢：");
					staffAge = sc4.nextInt();
					staff = staffNo + "," + staffName + "," + staffAge;
					if (!staffSet.contains(staff)) {
						System.out.println("社員情報が見つかりません。");
					} else {
						System.out.print("削除しますか？（1:はい、2:いいえ）：");
						del = sc.nextInt();
						if (del == 1) {
							//⑤LinkedHashSetから指定する社員情報を削除する
							staffSet.remove(staff);
							System.out.println("削除しました。");
						} else {
							System.out.println("キャンセルされました。");
						}
					}
					break;
				case 3:// すべて削除
					//⑥LinkedHashSetのすべての社員情報を削除する
					staffSet.clear();
					System.out.println("すべて削除しました。");
					break;
				case 4:// すべて表示
					if (staffSet.size() != 0) {
						System.out.printf("%-6s %-6s %-6s", "社員番号", "氏名", "年齢");
						System.out.println(" ");
						//⑦イテレータの取得
						Iterator<String> it = staffSet.iterator();
						while (it.hasNext()) {
							String str = it.next();//⑨次の値に進み、値を取り出す
							String[] word = str.split(",");//⑩ ⑨で取り出した値をコンマで分割する
							for (String w : word) {
								System.out.printf("%-10s", w);
							}
							System.out.println();
						}
					} else {
						System.out.println("登録データなし。");
					}
					break;
				}
				if (cmd == 9) {
					System.out.println("終了します。");
					break;
				}
			}

		} catch (Exception e) {
			System.out.println("エラー");
			System.out.println(e);
		}
	}
}

