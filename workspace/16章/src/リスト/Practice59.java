package リスト;


import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

class Practice59 {

	public static void main(String[] args) {
		ArrayList<String> list = new ArrayList<String>();
		String name;
		int cmd, index, yn;
		while (true) {
			Scanner sc = new Scanner(System.in);
			Scanner sc2 = new Scanner(System.in);
			Scanner sc3 = new Scanner(System.in);
			System.out.println("操作メニュー");
			System.out.println("1:追加, 2:位置指定追加, 3:上書き, 4:削除, 5:位置指定表示, 6:全て表示, 9:終了");
			System.out.print("操作番号を入力してください：");
			cmd = sc.nextInt();
			switch (cmd) {
			case 1:// 追加
				System.out.print("氏名：");
				name = sc2.nextLine();
				list.add(name);
				System.out.println("追加しました。");
				break;
			case 2:// 位置指定追加
				System.out.print("挿入位置：");
				index = sc2.nextInt();
				if (list.size() - 1 < index) {
					System.out.println("位置指定エラー");
					break;
				}
				System.out.print("氏名：");
				name = sc3.nextLine();
				list.add(index, name);
				System.out.println("追加しました。");
				break;
			case 3:// 上書き
				System.out.print("上書き位置：");
				index = sc2.nextInt();
				if (list.size() - 1 < index) {
					System.out.println("位置指定エラー");
					break;
				}
				System.out.print("氏名：");
				name = sc3.nextLine();
				list.set(index, name);
				System.out.print("上書きしました。");
				break;
			case 4:// 削除
				System.out.print("削除位置：");
				index = sc2.nextInt();
				if (list.size() - 1 < index) {
					System.out.println("位置指定エラー");
					break;
				}
				System.out.printf("[%d]削除対象氏名：%s\n", index, list.get(index));
				System.out.print("削除しますか？(1:はい, 2:いいえ)：");
				yn = sc.nextInt();
				if (yn == 1) {
					list.remove(index);
					System.out.println("削除しました。");
				}
				break;
			case 5:// 位置指定表示
				System.out.print("表示データ位置：");
				index = sc2.nextInt();
				if (list.size() - 1 < index) {
					System.out.println("位置指定エラー");
					break;
				}
				System.out.printf("[%d]%s\n", index, list.get(index));
				break;
			case 6:// すべて表示
				int i = 0;
				//①イテレータの取得
				Iterator<String> it = list.iterator();
				while (it.hasNext()) {
					System.out.printf("[%d]%s\n", i++, it.next());
				}
			}
			if (cmd == 9) {
				System.out.println("終了します。");
				break;
			}
		}
	}
}

