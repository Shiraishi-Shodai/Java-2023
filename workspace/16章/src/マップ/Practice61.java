package マップ;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Practice61 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Scanner sc2 = new Scanner(System.in);
		Scanner sc3 = new Scanner(System.in);
		//①HashMapを生成する 名前はgoodsMap, 格納するキーの型はInteger、値の型はString
		Map<Integer,String> goodsMap = new HashMap<Integer,String>();
		int cmd, cmd2;
		int goodsNo = 0;
		String goodsName;
		int searchNo = 0;
		String result ="";

		try {
			while (true) {
				System.out.println("\n操作メニュー");
				System.out.println("1:追加、2:指定削除、3:すべて削除、4:すべて表示、5:検索表示、9:終了");
				System.out.print("操作番号を入力してください：");
				cmd = sc.nextInt();

				switch (cmd) {
				case 1:// 追加
					System.out.print("商品番号：");
					goodsNo = sc2.nextInt();// キーの入力
					System.out.print("商品名：");
					goodsName = sc3.nextLine(); // 値の入力
					//②商品情報がマップに含まれるか判定
					if (!goodsMap.containsKey(goodsNo)) {
						//③商品情報をHashMapに追加する
						goodsMap.put(goodsNo, goodsName);
						System.out.println("追加しました。");
					} else {
						System.out.println("商品番号" + goodsNo + "はすでに登録されています。");
						System.out.print("上書きしますか？（1：はい、2：いいえ）：");
						cmd2 = sc.nextInt();
						if (cmd2 == 1) {
							//④商品情報をHashMapに追加（上書き）する
							goodsMap.put(goodsNo,goodsName);
							System.out.println("上書きしました。");
						} else {
							System.out.println("キャンセルされました。");
						}
					}
					break;
				case 2:// 指定削除
					System.out.print("商品番号を入力してください：");
					searchNo = sc.nextInt();
					//⑤入力した商品番号の商品情報をマップより取得する
					goodsMap.get(searchNo);
					if (result != null) {
						System.out.printf("商品番号    商品名\n");
						System.out.printf("%-6d     %-10s\n", searchNo, result);
						System.out.print("削除しますか？（はい：1、いいえ：2）：");
						cmd2 = sc.nextInt();
						if (cmd2 == 1) {
							//⑥指定した商品情報をマップより削除する
							goodsMap.remove(searchNo);
							System.out.println("削除しました。");
						} else {
							System.out.println("キャンセルされました。");
						}
					} else {
						System.out.println("見つかりません。");
					}
					break;
				case 3:// すべて削除
					//⑦マップの内容をすべて削除する
					goodsMap.clear();
					System.out.println("すべて削除しました。");
					break;
				case 4:// すべて表示
					if (goodsMap.size() != 0) {
						System.out.printf("商品番号    商品名\n");
						//⑧マップよりキーを順番に取得する
						for (Integer key: goodsMap.keySet()) {
							//⑨マップより⑧で取得したキーの値を取得する
							String value = goodsMap.get(key);
							System.out.printf("%-6d     %-10s\n", key, value);
						}
					} else {
						System.out.println("登録データなし。");
					}
					break;
				case 5:// 検索表示
					System.out.print("商品番号を入力してください：");
					searchNo = sc.nextInt();
					//⑩マップより指定したキーの値を取得する
					result = goodsMap.get(searchNo);
					if (result != null) {
						System.out.printf("商品番号    商品名\n");
						System.out.printf("%-6d     %-10s\n", searchNo, result);
					} else {
						System.out.println("見つかりません。");
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

