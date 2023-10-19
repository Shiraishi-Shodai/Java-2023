package HitAndBlow1;

import java.util.LinkedList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class HitAndBlow {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Tool t = new Tool();
		Random rand = new Random(); 
		int hit = 0;
		int blow = 0;
		int count = 1;
		int answer = 0;
		//4桁の値をランダムに生成し格納{
		int question = rand.nextInt(9000)+1000;
		List<Integer> quest = new LinkedList<Integer>();
		List<Integer> ans = new LinkedList<Integer>();
		//System.out.println("生成された値"+question);
		t.add(question, quest);
		//重複する数字を排除
		t.chenge(quest);
//		System.out.print("重複が排除された値");
//		quest.stream().forEach(a->{
//			System.out.print(a);
//		});
		//System.out.println("");
		System.out.println("4 桁の数字を入力してください");
		System.out.println("同じ数字は入力しないでください ");
		System.out.println("12 回以内に正解しないと GAMEOVER です ");
		
		while(true){
			//4桁の数字を入力させる
			System.out.print(count+"回目:");
			answer = sc.nextInt();
			//それぞれのリストに4桁の数字を一桁ずつ格納する
			t.add(answer, ans);
//			ans.stream().forEach(a->{
//				System.out.println(a);
//			});
			for(int i = 0;i<quest.size();i++) {
				for(int j = 0;j<ans.size();j++) {
					if(quest.get(i)==ans.get(i)) {
						hit++;
						
						break;
					}else if(quest.get(i)==ans.get(j)){
						blow++;
					}
				}
				
			}
			if(hit==4) {
				System.out.println("あなたは"+count+"回目で正解しました");
				break;
			}
			if(count==12) {
				System.out.println("GAMEOVER");
				break;
			}
			System.out.println("hit"+hit);
			System.out.println("blow"+blow);
			ans.clear();
			blow = 0;
			hit = 0;
			count++;
		};
	}
}
