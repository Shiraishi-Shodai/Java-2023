package 宝くじ;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.security.SecureRandom;
import java.util.ArrayList;
import java.util.List;

public class LotoCheck {
	public static void main(String[]args) {
		BufferedReader br = null;
		try {
				br = new BufferedReader(new FileReader("mos.txt"));
				String line = "";
				int num = 0;
				//当選数字と合致したカウントmCountを用意
				int eCount = 0;
				//ボーナス数字と合致するか確認する変数を用意
				boolean flag = false;
				//当選数字6つとボーナス数字１つを生成
				//ランダムを生成
			    SecureRandom rand = new SecureRandom();
			    //当選数字6つとボーナス数字１つを格納するcheckリストを格納
			    List<Integer> check = new ArrayList<>();
//			    while(check.size()<7) {
//			    	int x = rand.nextInt(99)+1;
//			    	//checkリストにxが格納されていなければxを格納
//			    	if(!check.contains(x)) {
//			    		check.add(x);
//			    	}
//			    }
			    //テスト用の数字を用意しcheckに格納
			    Integer[] test = {10,20,30,50,60,80,40};
			    for(int i = 0;i<test.length;i++) {
			    	check.add(test[i]);
			    }
			    //checkリストを表示
			    System.out.print("当選数字");
			    for(int i = 0;i<check.size()-1;i++) {
			    	System.out.printf(" %2d",check.get(i));
			    }
			    System.out.printf(" ボーナス数字 %d\n",check.get(6));
			    //ファイルを一行ずつ読み込みlineに格納
				while((line = br.readLine()) != null) {
					//ファイルから読みだした一行を空白で区切って格納する配列を用意
					//System.out.println(line);
					String[] box = line.split(" ");
					//6つの数字を数値に変換してリストに格納
					List<Integer> list = new ArrayList<>();
					//2桁か1桁の数字であればlistに格納
					for(int i = 0;i<box.length;i++) {
						if(box[i].matches("[\\d]{2}|[\\d]")) {
							num = Integer.parseInt(box[i]);
							list.add(num);
						}
					}
					
					
					//listに格納された数字が当選数字とボーナスが何回合致するか確認
						//mCountを初期化
						eCount = 0;
						//flagを初期化
						flag = false;
						for(Integer i: list) {
							for(int c = 0;c<check.size();c++) {
								//System.out.println("listの値:"+i+" checkの値:"+c);
								//ボーナスの時flagにtrueを設定
								if(i == check.get(check.size()-1)) {
									flag = true;
									continue;
								}
								//当選数字(check.get(c)とiが等しいときeCountをカウント
								if(check.get(c) == i) {
									eCount++;
								}
							}
						}
						
						
						//結果発表
						String result;
						switch(eCount) {
							case 6:
								result = "1等当選";
								break;
							case 5:
								//ボーナスと一致しているかの判定
								if(flag) {
									result = "2等当選";
									break;
								}
								result = "3等当選";
								break;
							case 4:
								result = "4等当選";
								break;
							case 3:
								result = "5等当選";
								break;
							default:
								result = "はずれ";
						}
						
						System.out.printf("%s %s\n",line,result);
					
			
				}

		}catch(IOException e) {
			e.printStackTrace();
		}
				
	}
}
