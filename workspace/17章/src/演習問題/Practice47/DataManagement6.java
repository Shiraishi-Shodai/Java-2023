package 演習問題.Practice47;
import static java.lang.System.*;

import java.util.HashMap;
import java.util.InputMismatchException;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
public class DataManagement6 {
	public static void main(String[] args) {
		int count = 0;
		int judge = 0;
		//String name = "";
		Scanner sc = new Scanner(System.in);
		Scanner sc2 = new Scanner(System.in);
		Map<String,List> schoolMap = new HashMap<String,List>();
		List<String> nameList = new LinkedList<>();
		List<String> train = new LinkedList<>();
		String name ="";
		String stu = "";
		boolean flag = true;
		do {
			out.println("操作メニュー");
			out.println("学科登録:1, 学科削除:2, 学生登録:3, 学生削除:4, 表示:5, 終了:9 ");
			try{
				out.print("操作番号を入力してください:");
				judge = sc2.nextInt();
				switch(judge) {
				case 1: out.print("学科名:");
						name = sc.nextLine();
						schoolMap.put(name,nameList);
						out.println("学科"+name+"を追加しました");
						break;
				case 2: out.print("学科名:");
						name = sc.nextLine();
						schoolMap.remove(name);
				case 3:	out.print("学科名:");
						name = sc.nextLine();
						if(schoolMap.containsKey(name)) {
							out.print("学生名:");
							stu = sc.nextLine();
							train = schoolMap.get(name);
							train.add(stu);
							schoolMap.put(name,nameList);
							out.println("学科"+name+"に"+stu+"を追加しました");
							break;
						}else {
							out.println("学科"+name+"は存在しません");
						}
						break;
				case 4: out.print("学科名:");
						name = sc.nextLine();
						out.print("学生名:");
						stu = sc.nextLine();
						train = schoolMap.get(name);
						train.remove(stu);
						out.print("学生"+stu+"を削除しました");
						break;
				case 5: out.print("学科名:");
						name = sc.nextLine();
						train = schoolMap.get(name);
						if(train.isEmpty()) {
							out.println("要素を追加してください");
						}else {
							for(String e: train) {
								out.println(e);
							}
						}
						break;
				case 9: 
						flag = false;
						break;
				}
			}catch(InputMismatchException e) {
				out.println("正しい値を入力する");
			}
		}while(flag);
	
		sc.close();
		sc2.close();
	}
}
