package 演習問題;
import static java.lang.System.*;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;
public class DataManagement2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Scanner sc2 = new Scanner(System.in);
		Scanner sc3 = new Scanner(System.in);
		Scanner sc4 = new Scanner(System.in);
		int judge = 0;
		int num = 0;
		int money = 0;
		String name = "";
		List<Product> list = new LinkedList<Product>();
		
		do {
	 		out.println("操作メニュー");
			out.println("先頭に追加:1, 末尾に追加:2, すべて削除:3, すべて表示:4, 終了:9 ");
			out.print("操作番号を入力してください:");
			judge = sc.nextInt();
			switch(judge) {
				case 1:
					out.print("商品番号:");
					num = sc.nextInt();
					out.print("商品名:");
					name = sc2.nextLine();
					out.print("単価:");
					money = sc3.nextInt();
					Product p = new Product(num,name,money);
					p.setValue(num, name, money);
					list.add(0,p);
					out.print("先頭に追加しました");
					break;
				case 2:
					out.print("商品番号:");
					num = sc.nextInt();
					out.print("商品名:");
					name = sc2.nextLine();
					out.print("単価:");
					money = sc3.nextInt();
					Product p1 = new Product(num,name,money);
					p1.setValue(num, name, money);
					list.add(p1);
					out.print("末尾に追加しました");
					break;
				case 3:
					list.clear();
				case 4:
					Iterator<Product> it = list.iterator();
					int count = 0;
					while(it.hasNext()) {
						Product indication = it.next();
						out.printf("[%d] %6d %8s %6d \n",count,indication.getNo(),indication.getName(),indication.getPrice());
						count++;
					}
					break;
				case 9:
					out.println("終了");
			}
		}while(judge!=9);

	}
}
